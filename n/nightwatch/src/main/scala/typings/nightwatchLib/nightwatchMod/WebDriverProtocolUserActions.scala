package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebDriverProtocolUserActions extends js.Object {
  /**
    * Double-clicks at the current mouse coordinates (set by `.moveTo()`).
    */
  def doubleClick(): this.type = js.native
  def doubleClick(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Click at the current mouse coordinates (set by `.moveTo()`).
    *
    * The button can be (0, 1, 2) or ('left', 'middle', 'right'). It defaults to left mouse button.
    */
  @JSName("mouseButtonClick")
  def mouseButtonClick_0(button: nightwatchLib.nightwatchLibNumbers.`0`): this.type = js.native
  @JSName("mouseButtonClick")
  def mouseButtonClick_0(
    button: nightwatchLib.nightwatchLibNumbers.`0`,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonClick")
  def mouseButtonClick_1(button: nightwatchLib.nightwatchLibNumbers.`1`): this.type = js.native
  @JSName("mouseButtonClick")
  def mouseButtonClick_1(
    button: nightwatchLib.nightwatchLibNumbers.`1`,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonClick")
  def mouseButtonClick_2(button: nightwatchLib.nightwatchLibNumbers.`2`): this.type = js.native
  @JSName("mouseButtonClick")
  def mouseButtonClick_2(
    button: nightwatchLib.nightwatchLibNumbers.`2`,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonClick")
  def mouseButtonClick_left(button: nightwatchLib.nightwatchLibStrings.left): this.type = js.native
  @JSName("mouseButtonClick")
  def mouseButtonClick_left(
    button: nightwatchLib.nightwatchLibStrings.left,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonClick")
  def mouseButtonClick_middle(button: nightwatchLib.nightwatchLibStrings.middle): this.type = js.native
  @JSName("mouseButtonClick")
  def mouseButtonClick_middle(
    button: nightwatchLib.nightwatchLibStrings.middle,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonClick")
  def mouseButtonClick_right(button: nightwatchLib.nightwatchLibStrings.right): this.type = js.native
  @JSName("mouseButtonClick")
  def mouseButtonClick_right(
    button: nightwatchLib.nightwatchLibStrings.right,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Click and hold the left mouse button (at the coordinates set by the last `moveTo` command). Note that the next mouse-related command that should follow is `mouseButtonUp` .
    * Any other mouse command (such as click or another call to buttondown) will yield undefined behaviour.
    *
    * Can be used for implementing drag-and-drop. The button can be (0, 1, 2) or ('left', 'middle', 'right'). It defaults to left mouse button,
    * and if you don't pass in a button but do pass in a callback, it will handle it correctly.
    */
  @JSName("mouseButtonDown")
  def mouseButtonDown_0(button: nightwatchLib.nightwatchLibNumbers.`0`): this.type = js.native
  @JSName("mouseButtonDown")
  def mouseButtonDown_0(
    button: nightwatchLib.nightwatchLibNumbers.`0`,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonDown")
  def mouseButtonDown_1(button: nightwatchLib.nightwatchLibNumbers.`1`): this.type = js.native
  @JSName("mouseButtonDown")
  def mouseButtonDown_1(
    button: nightwatchLib.nightwatchLibNumbers.`1`,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonDown")
  def mouseButtonDown_2(button: nightwatchLib.nightwatchLibNumbers.`2`): this.type = js.native
  @JSName("mouseButtonDown")
  def mouseButtonDown_2(
    button: nightwatchLib.nightwatchLibNumbers.`2`,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonDown")
  def mouseButtonDown_left(button: nightwatchLib.nightwatchLibStrings.left): this.type = js.native
  @JSName("mouseButtonDown")
  def mouseButtonDown_left(
    button: nightwatchLib.nightwatchLibStrings.left,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonDown")
  def mouseButtonDown_middle(button: nightwatchLib.nightwatchLibStrings.middle): this.type = js.native
  @JSName("mouseButtonDown")
  def mouseButtonDown_middle(
    button: nightwatchLib.nightwatchLibStrings.middle,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonDown")
  def mouseButtonDown_right(button: nightwatchLib.nightwatchLibStrings.right): this.type = js.native
  @JSName("mouseButtonDown")
  def mouseButtonDown_right(
    button: nightwatchLib.nightwatchLibStrings.right,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Releases the mouse button previously held (where the mouse is currently at). Must be called once for every `mouseButtonDown` command issued.
    *
    * Can be used for implementing drag-and-drop. The button can be (0, 1, 2) or ('left', 'middle', 'right'). It defaults to left mouse button,
    * and if you don't pass in a button but do pass in a callback, it will handle it correctly.
    */
  @JSName("mouseButtonUp")
  def mouseButtonUp_0(button: nightwatchLib.nightwatchLibNumbers.`0`): this.type = js.native
  @JSName("mouseButtonUp")
  def mouseButtonUp_0(
    button: nightwatchLib.nightwatchLibNumbers.`0`,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonUp")
  def mouseButtonUp_1(button: nightwatchLib.nightwatchLibNumbers.`1`): this.type = js.native
  @JSName("mouseButtonUp")
  def mouseButtonUp_1(
    button: nightwatchLib.nightwatchLibNumbers.`1`,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonUp")
  def mouseButtonUp_2(button: nightwatchLib.nightwatchLibNumbers.`2`): this.type = js.native
  @JSName("mouseButtonUp")
  def mouseButtonUp_2(
    button: nightwatchLib.nightwatchLibNumbers.`2`,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonUp")
  def mouseButtonUp_left(button: nightwatchLib.nightwatchLibStrings.left): this.type = js.native
  @JSName("mouseButtonUp")
  def mouseButtonUp_left(
    button: nightwatchLib.nightwatchLibStrings.left,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonUp")
  def mouseButtonUp_middle(button: nightwatchLib.nightwatchLibStrings.middle): this.type = js.native
  @JSName("mouseButtonUp")
  def mouseButtonUp_middle(
    button: nightwatchLib.nightwatchLibStrings.middle,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("mouseButtonUp")
  def mouseButtonUp_right(button: nightwatchLib.nightwatchLibStrings.right): this.type = js.native
  @JSName("mouseButtonUp")
  def mouseButtonUp_right(
    button: nightwatchLib.nightwatchLibStrings.right,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
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
  def moveTo(element: java.lang.String, xoffset: scala.Double, yoffset: scala.Double): this.type = js.native
  def moveTo(
    element: java.lang.String,
    xoffset: scala.Double,
    yoffset: scala.Double,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  def moveTo(element: scala.Null, xoffset: scala.Double, yoffset: scala.Double): this.type = js.native
  def moveTo(
    element: scala.Null,
    xoffset: scala.Double,
    yoffset: scala.Double,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
}

