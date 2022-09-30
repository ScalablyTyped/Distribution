package typings.nightwatch.mod

import typings.nightwatch.nightwatchInts.`0`
import typings.nightwatch.nightwatchInts.`1`
import typings.nightwatch.nightwatchInts.`2`
import typings.nightwatch.nightwatchStrings.left
import typings.nightwatch.nightwatchStrings.middle
import typings.nightwatch.nightwatchStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolUserActions extends StObject {
  
  /**
    * Move to the element and click (without releasing) in the middle of the given element.
    *
    * @example
    * module.exports = {
    *   demoTest() {
    *     browser.clickAndHold('#main ul li a.first');
    *
    *     browser.clickAndHold('#main ul li a.first', function(result) {
    *       console.log('Click result', result);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.clickAndHold('css selector', '#main ul li a.first');
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.clickAndHold({
    *       selector: '#main ul li a',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     });
    *
    *     browser.clickAndHold({
    *       selector: '#main ul li a.first',
    *       timeout: 2000 // overwrite the default timeout (in ms) to check if the element is present
    *     });
    *   },
    *
    *   demoTestAsync: async function() {
    *     const result = await browser.clickAndHold('#main ul li a.first');
    *     console.log('Right click result', result);
    *   }
    * }
    *
    */
  def clickAndHold(selector: String): this.type = js.native
  def clickAndHold(
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  def clickAndHold(`using`: LocateStrategy, selector: String): this.type = js.native
  def clickAndHold(
    `using`: LocateStrategy,
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  
  /**
    * Move to the element and peforms a double-click in the middle of the element.
    *
    * @example
    * module.exports = {
    *   demoTest() {
    *     browser.doubleClick('#main ul li a.first');
    *
    *     browser.doubleClick('#main ul li a.first', function(result) {
    *       console.log('double click result', result);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.doubleClick('css selector', '#main ul li a.first');
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.doubleClick({
    *       selector: '#main ul li a',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     });
    *
    *     browser.doubleClick({
    *       selector: '#main ul li a.first',
    *       timeout: 2000 // overwrite the default timeout (in ms) to check if the element is present
    *     });
    *   },
    *
    *   demoTestAsync: async function() {
    *     const result = await browser.doubleClick('#main ul li a.first');
    *     console.log('double click result', result);
    *   }
    * }
    */
  def doubleClick(selector: String): this.type = js.native
  def doubleClick(
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  def doubleClick(`using`: LocateStrategy, selector: String): this.type = js.native
  def doubleClick(
    `using`: LocateStrategy,
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  
  /**
    * Click at the current mouse coordinates (set by `.moveTo()`).
    *
    * The button can be (0, 1, 2) or ('left', 'middle', 'right'). It defaults to left mouse button.
    *
    * @deprecated
    */
  def mouseButtonClick(button: `0` | `1` | `2` | left | middle | right): this.type = js.native
  def mouseButtonClick(
    button: `0` | `1` | `2` | left | middle | right,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  
  /**
    * Click and hold the left mouse button (at the coordinates set by the last `moveTo` command). Note that the next mouse-related command that should follow is `mouseButtonUp` .
    * Any other mouse command (such as click or another call to buttondown) will yield undefined behaviour.
    *
    * Can be used for implementing drag-and-drop. The button can be (0, 1, 2) or ('left', 'middle', 'right'). It defaults to left mouse button,
    * and if you don't pass in a button but do pass in a callback, it will handle it correctly.
    *
    * **Since v2.0, this command is deprecated.** It is only available on older JSONWire-based drivers.
    * Please use the new [User Actions API](/api/useractions/).
    *
    * @deprecated
    */
  def mouseButtonDown(button: `0` | `1` | `2` | left | middle | right): this.type = js.native
  def mouseButtonDown(
    button: `0` | `1` | `2` | left | middle | right,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  
  /**
    * Releases the mouse button previously held (where the mouse is currently at). Must be called once for every `mouseButtonDown` command issued.
    *
    * Can be used for implementing drag-and-drop. The button can be (0, 1, 2) or ('left', 'middle', 'right'). It defaults to left mouse button,
    * and if you don't pass in a button but do pass in a callback, it will handle it correctly.
    *
    * **Since v2.0, this command is deprecated.** It is only available on older JSONWire-based drivers.
    * Please use the new [User Actions API](/api/useractions/).
    *
    * @deprecated
    */
  def mouseButtonUp(button: `0` | `1` | `2` | left | middle | right): this.type = js.native
  def mouseButtonUp(
    button: `0` | `1` | `2` | left | middle | right,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  
  /**
    * Move the mouse by an offset of the specified [Web Element ID](https://www.w3.org/TR/webdriver1/#dfn-web-elements) or relative to the current mouse cursor, if no element is specified.
    * If an element is provided but no offset, the mouse will be moved to the center of the element.
    *
    * If an element is provided but no offset, the mouse will be moved to the center of the element. If the element is not visible, it will be scrolled into view.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.moveTo(null, 110, 100);
    * };
    */
  def moveTo(element: String, xoffset: Double, yoffset: Double): this.type = js.native
  def moveTo(
    element: String,
    xoffset: Double,
    yoffset: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  def moveTo(element: Null, xoffset: Double, yoffset: Double): this.type = js.native
  def moveTo(
    element: Null,
    xoffset: Double,
    yoffset: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  
  /**
    * Release the depressed left mouse button at the current mouse coordinates (set by `.moveTo()`).
    *
    */
  def releaseMouseButton(): this.type = js.native
  def releaseMouseButton(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  
  /**
    * Simulates a context-click(right click) event on the given DOM element.
    * The element is scrolled into view if it is not already pointer-interactable.
    * See the WebDriver specification for element [interactability](https://www.w3.org/TR/webdriver/#element-interactability).
    *
    * @example
    * module.exports = {
    *   demoTest() {
    *     browser.rightClick('#main ul li a.first');
    *
    *     browser.rightClick('#main ul li a.first', function(result) {
    *       console.log('Click result', result);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.rightClick('css selector', '#main ul li a.first');
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.rightClick({
    *       selector: '#main ul li a',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     });
    *
    *     browser.rightClick({
    *       selector: '#main ul li a.first',
    *       timeout: 2000 // overwrite the default timeout (in ms) to check if the element is present
    *     });
    *   },
    *
    *   demoTestAsync: async function() {
    *     const result = await browser.rightClick('#main ul li a.first');
    *     console.log('Right click result', result);
    *   }
    * }
    *
    */
  def rightClick(selector: Definition): this.type = js.native
  def rightClick(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): this.type = js.native
  def rightClick(`using`: LocateStrategy, selector: Definition): this.type = js.native
  def rightClick(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): this.type = js.native
}
