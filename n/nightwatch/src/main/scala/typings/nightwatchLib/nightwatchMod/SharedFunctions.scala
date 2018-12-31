package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedFunctions extends js.Object {
  /**
    * Clear a textarea or a text input element's value. Uses elementIdValue protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (client) {
    *  client.clearValue('input[type=text]');
    * };
    * ```
    * @param selector: The CSS/Xpath selector used to locate the element.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def clearValue(selector: java.lang.String): this.type = js.native
  def clearValue(selector: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Simulates a click event on the given DOM element. Uses elementIdClick protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (client) {
    *  client.click("#main ul li a.first");
    * };
    * ```
    * @param selector: The CSS/Xpath selector used to locate the element.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def click(selector: java.lang.String): this.type = js.native
  def click(selector: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Retrieve the value of an attribute for a given DOM element. Uses elementIdAttribute protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (client) {
    *  client.getAttribute("#main ul li a.first", "href", function(result) {
    *      this.assert.equal(typeof result, "object");
    *      this.assert.equal(result.status, 0);
    *      this.assert.equal(result.value, "#home");
    *  });
    * };
    * ```
    * @param selector: The CSS/Xpath selector used to locate the element.
    * @param attribute: The attribute name to inspect.
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns The value of the attribute
    */
  def getAttribute(selector: java.lang.String, attribute: java.lang.String): this.type = js.native
  def getAttribute(
    selector: java.lang.String,
    attribute: java.lang.String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Retrieve the value of a css property for a given DOM element. Uses elementIdCssProperty protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (client) {
    *  client.getCssProperty("#main ul li a.first", "display", function(result) {
    *      this.assert.equal(typeof result, "object");
    *      this.assert.equal(result.status, 0);
    *      this.assert.equal(result.value, 'inline');
    *  });
    * };
    * ```
    * @param selector: The CSS/Xpath selector used to locate the element.
    * @param cssProperty: The CSS property to inspect.
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns The value of the css property
    */
  def getCssProperty(selector: java.lang.String, cssProperty: java.lang.String): this.type = js.native
  def getCssProperty(
    selector: java.lang.String,
    cssProperty: java.lang.String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Determine an element's size in pixels. Uses elementIdSize protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (client) {
    *  client.getElementSize("#main ul li a.first", function(result) {
    *      this.assert.equal(typeof result, "object");
    *      this.assert.equal(result.status, 0);
    *      this.assert.equal(result.value.width, 500);
    *      this.assert.equal(result.value.height, 20);
    *  });
    * };
    * ```
    * @param selector: The CSS/Xpath selector used to locate the element.
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns The width and height of the element in pixels
    */
  def getElementSize(selector: java.lang.String): this.type = js.native
  def getElementSize(
    selector: java.lang.String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Determine an element's location on the page. The point (0, 0) refers to the upper-left corner of the page.
    * The element's coordinates are returned as a JSON object with x and y properties. Uses elementIdLocation protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (client) {
    *  client.getLocation("#main ul li a.first", function(result) {
    *      this.assert.equal(typeof result, "object");
    *      this.assert.equal(result.status, 0);
    *      this.assert.equal(result.value.x, 200);
    *      this.assert.equal(result.value.y, 200);
    *  });
    * };
    * ```
    * @param selector: The CSS/Xpath selector used to locate the element.
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns The X and Y coordinates for the element on the page
    */
  def getLocation(selector: java.lang.String): this.type = js.native
  def getLocation(
    selector: java.lang.String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Determine an element's location on the screen once it has been scrolled into view. Uses elementIdLocationInView protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.getLocationInView("#main ul li a.first", function(result) {
    *      this.assert.equal(typeof result, "object");
    *      this.assert.equal(result.status, 0);
    *      this.assert.equal(result.value.x, 200);
    *      this.assert.equal(result.value.y, 200);
    *  });
    * };
    * ```
    * @param selector: The CSS/Xpath selector used to locate the element.
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns The X and Y coordinates for the element on the page.
    */
  def getLocationInView(selector: java.lang.String): this.type = js.native
  def getLocationInView(
    selector: java.lang.String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Query for an element's tag name. Uses elementIdName protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (client) {
    *  client.getTagName("#main ul li .first", function(result) {
    *      this.assert.equal(typeof result, "object");
    *      this.assert.equal(result.status, 0);
    *      this.assert.equal(result.value, "a");
    *  });
    * };
    * ```
    * @param selector: The CSS/Xpath selector used to locate the element.
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns The element's tag name, as a lowercase string.
    */
  def getTagName(selector: java.lang.String): this.type = js.native
  def getTagName(
    selector: java.lang.String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Returns the visible text for the element. Uses elementIdText protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.getText("#main ul li a.first", function(result) {
    *      this.assert.equal(typeof result, "object");
    *      this.assert.equal(result.status, 0);
    *      this.assert.equal(result.value, "nightwatchjs.org");
    *  });
    * };
    * ```
    * @param selector: The CSS/Xpath selector used to locate the element.
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns The element's visible text.
    */
  def getText(selector: java.lang.String): this.type = js.native
  def getText(
    selector: java.lang.String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Returns a form element current value. Uses elementIdValue protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.getValue("form.login input[type=text]", function(result) {
    *      this.assert.equal(typeof result, "object");
    *      this.assert.equal(result.status, 0);
    *      this.assert.equal(result.value, "enter username");
    *  });
    * };
    * ```
    * @param selector: The CSS/Xpath selector used to locate the element.
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns The element's value.
    */
  def getValue(selector: java.lang.String): this.type = js.native
  def getValue(
    selector: java.lang.String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Determine if an element is currently displayed. Uses elementIdDisplayed protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.isVisible('#main', function(result) {
    *      this.assert.equal(typeof result, "object");
    *      this.assert.equal(result.status, 0);
    *      this.assert.equal(result.value, true);
    *  });
    * };
    * ```
    * @param selector: The CSS/Xpath selector used to locate the element.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def isVisible(selector: java.lang.String): this.type = js.native
  def isVisible(
    selector: java.lang.String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Move the mouse by an offset of the specified element. Uses moveTo protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.moveToElement('#main', 10, 10);
    * };
    * ```
    * @param selector: The CSS/Xpath selector used to locate the element.
    * @param xoffset: X offset to move to, relative to the top-left corner of the element.
    * @param yoffset: Y offset to move to, relative to the top-left corner of the element.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def moveToElement(selector: java.lang.String, xoffset: scala.Double, yoffset: scala.Double): this.type = js.native
  def moveToElement(
    selector: java.lang.String,
    xoffset: scala.Double,
    yoffset: scala.Double,
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Sends some text to an element. Can be used to set the value of a form element or to send a sequence of key strokes to an element. Any UTF-8 character may be specified.
    * An object map with available keys and their respective UTF-8 characters, as defined on W3C WebDriver draft spec (http://www.w3.org/TR/webdriver/#character-types),
    * is loaded onto the main Nightwatch instance as client.Keys.
    *
    * Usage:
    * ```
    * // send some simple text to an input
    * this.demoTest = function (browser) {
    *  browser.setValue('input[type=text]', 'nightwatch');
    * };
    *
    * //
    * // send some text to an input and hit enter.
    * this.demoTest = function (browser) {
    *  browser.setValue('input[type=text]', ['nightwatch', browser.Keys.ENTER]);
    * };
    * ```
    * @param selector: The CSS/Xpath selector used to locate the element.
    * @param inputValue: The text to send to the element or key strokes.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def setValue(selector: java.lang.String, inputValue: java.lang.String): this.type = js.native
  def setValue(selector: java.lang.String, inputValue: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Submit a FORM element. The submit command may also be applied to any element that is a descendant of a FORM element. Uses submit protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.submitForm('form.login');
    * };
    * ```
    * @param selector: The CSS/Xpath selector used to locate the element.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def submitForm(selector: java.lang.String): this.type = js.native
  def submitForm(selector: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Opposite of waitForElementPresent. Waits a given time in milliseconds for an element to be not present (i.e. removed) in the page before performing any other commands
    * or assertions. If the element is still present after the specified amount of time, the test fails. You can change the polling interval by defining
    * a waitForConditionPollInterval property (in milliseconds) in as a global property in your nightwatch.json or in your external globals file.
    * Similarly, a default timeout can be specified as a global waitForConditionTimeout property (in milliseconds).
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.waitForElementNotPresent('#dialog', 1000);
    * };
    * ```
    * @param selector: The selector (CSS / Xpath) used to locate the element.
    * @param time: The number of milliseconds to wait. The runner performs repeated checks every 500 ms.
    * @param abortOnFailure: By the default if the element is not found the test will fail. Set this to false if you wish for the test to continue even if the assertion fails.
    * To set this globally you can define a property `abortOnNightwatchAssertionsFailure` in your globals.
    * @param callback: Optional callback function to be called when the command finishes.
    * @param message: Optional message to be shown in the output; the message supports two placeholders: %s for current selector and %d for the time
    * (e.g. Element %s was not in the page for %d ms).
    */
  def waitForElementNotPresent(selector: java.lang.String): this.type = js.native
  def waitForElementNotPresent(selector: java.lang.String, time: scala.Double): this.type = js.native
  def waitForElementNotPresent(selector: java.lang.String, time: scala.Double, abortOnFailure: scala.Boolean): this.type = js.native
  def waitForElementNotPresent(
    selector: java.lang.String,
    time: scala.Double,
    abortOnFailure: scala.Boolean,
    callback: js.Function0[scala.Unit]
  ): this.type = js.native
  def waitForElementNotPresent(
    selector: java.lang.String,
    time: scala.Double,
    abortOnFailure: scala.Boolean,
    callback: js.Function0[scala.Unit],
    message: java.lang.String
  ): this.type = js.native
  /**
    * Opposite of waitForElementVisible. Waits a given time in milliseconds for an element to be not visible (i.e. hidden but existing) in the page before performing
    * any other commands or assertions. If the element fails to be hidden in the specified amount of time, the test fails. You can change the polling interval by
    * defining a waitForConditionPollInterval property (in milliseconds) in as a global property in your nightwatch.json or in your external globals file.
    * Similarly, a default timeout can be specified as a global waitForConditionTimeout property (in milliseconds).
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.waitForElementNotVisible('#dialog', 1000);
    * };
    * ```
    * @param selector: The selector (CSS / Xpath) used to locate the element.
    * @param time: The number of milliseconds to wait. The runner performs repeated checks every 500 ms.
    * @param abortOnFailure: By the default if the element is not found the test will fail. Set this to false if you wish for the test to continue even if the assertion fails.
    * To set this globally you can define a property `abortOnNightwatchAssertionsFailure` in your globals.
    * @param callback: Optional callback function to be called when the command finishes.
    * @param message: Optional message to be shown in the output; the message supports two placeholders: %s for current selector and %d for the time
    * (e.g. Element %s was not in the page for %d ms).
    */
  def waitForElementNotVisible(selector: java.lang.String): this.type = js.native
  def waitForElementNotVisible(selector: java.lang.String, time: scala.Double): this.type = js.native
  def waitForElementNotVisible(selector: java.lang.String, time: scala.Double, abortOnFailure: scala.Boolean): this.type = js.native
  def waitForElementNotVisible(
    selector: java.lang.String,
    time: scala.Double,
    abortOnFailure: scala.Boolean,
    callback: js.Function0[scala.Unit]
  ): this.type = js.native
  def waitForElementNotVisible(
    selector: java.lang.String,
    time: scala.Double,
    abortOnFailure: scala.Boolean,
    callback: js.Function0[scala.Unit],
    message: java.lang.String
  ): this.type = js.native
  /**
    * Waits a given time in milliseconds for an element to be present in the page before performing any other commands or assertions.
    * If the element fails to be present in the specified amount of time, the test fails. You can change this by setting abortOnFailure to false.
    * You can change the polling interval by defining a waitForConditionPollInterval property (in milliseconds) in as a global property in your nightwatch.json or in
    * your external globals file.
    * Similarly, a default timeout can be specified as a global waitForConditionTimeout property (in milliseconds).
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.waitForElementPresent('body', 1000);
    *  // continue if failed
    *  browser.waitForElementPresent('body', 1000, false);
    *  // with callback
    *  browser.waitForElementPresent('body', 1000, function() {
    *      // do something while we're here
    *  });
    *  // custom Spanish message
    *  browser.waitForElementPresent('body', 1000, 'elemento %s no era presente en %d ms');
    *  // many combinations possible - the message is always the last argument
    *  browser.waitForElementPresent('body', 1000, false, function() {}, 'elemento %s no era presente en %d ms');
    * };
    * ```
    * @param selector: The selector (CSS / Xpath) used to locate the element.
    * @param time: The number of milliseconds to wait. The runner performs repeated checks every 500 ms.
    * @param abortOnFailure: By the default if the element is not found the test will fail. Set this to false if you wish for the test to continue even if the assertion fails.
    * To set this globally you can define a property `abortOnNightwatchAssertionsFailure` in your globals.
    * @param callback: Optional callback function to be called when the command finishes.
    * @param message: Optional message to be shown in the output; the message supports two placeholders: %s for current selector and %d for the time
    * (e.g. Element %s was not in the page for %d ms).
    */
  def waitForElementPresent(selector: java.lang.String): this.type = js.native
  def waitForElementPresent(selector: java.lang.String, time: scala.Double): this.type = js.native
  def waitForElementPresent(selector: java.lang.String, time: scala.Double, abortOnFailure: scala.Boolean): this.type = js.native
  def waitForElementPresent(
    selector: java.lang.String,
    time: scala.Double,
    abortOnFailure: scala.Boolean,
    callback: js.Function0[scala.Unit]
  ): this.type = js.native
  def waitForElementPresent(
    selector: java.lang.String,
    time: scala.Double,
    abortOnFailure: scala.Boolean,
    callback: js.Function0[scala.Unit],
    message: java.lang.String
  ): this.type = js.native
  /**
    * Waits a given time in milliseconds for an element to be visible in the page before performing any other commands or assertions.
    * If the element fails to be present and visible in the specified amount of time, the test fails. You can change this by setting abortOnFailure to false.
    * You can change the polling interval by defining a waitForConditionPollInterval property (in milliseconds) in as a global property in your nightwatch.json
    * or in your external globals file.
    * Similarly, a default timeout can be specified as a global waitForConditionTimeout property (in milliseconds).
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.waitForElementVisible('body', 1000);
    *  // continue if failed
    *  browser.waitForElementVisible('body', 1000, false);
    *  // with callback
    *  browser.waitForElementVisible('body', 1000, function() {
    *  // do something while we're here
    *  });
    *  // custom Spanish message
    *  browser.waitForElementVisible('body', 1000, 'elemento %s no era visible en %d ms');
    *  // many combinations possible - the message is always the last argument
    *  browser.waitForElementVisible('body', 1000, false, function() {}, 'elemento %s no era visible en %d ms');
    * };
    * ```
    * @param selector: The selector (CSS / Xpath) used to locate the element.
    * @param time: The number of milliseconds to wait. The runner performs repeated checks every 500 ms.
    * @param abortOnFailure: By the default if the element is not found the test will fail.
    * Set this to false if you wish for the test to continue even if the assertion fails.
    * To set this globally you can define a property `abortOnNightwatchAssertionsFailure` in your globals.
    * @param callback: Optional callback function to be called when the command finishes.
    * @param message: Optional message to be shown in the output; the message supports two placeholders: %s for current selector and %d for the time (e.g. Element %s was not in the page for %d ms).
    */
  def waitForElementVisible(selector: java.lang.String): this.type = js.native
  def waitForElementVisible(selector: java.lang.String, time: scala.Double): this.type = js.native
  def waitForElementVisible(selector: java.lang.String, time: scala.Double, abortOnFailure: scala.Boolean): this.type = js.native
  def waitForElementVisible(
    selector: java.lang.String,
    time: scala.Double,
    abortOnFailure: scala.Boolean,
    callback: js.Function0[scala.Unit]
  ): this.type = js.native
  def waitForElementVisible(
    selector: java.lang.String,
    time: scala.Double,
    abortOnFailure: scala.Boolean,
    callback: js.Function0[scala.Unit],
    message: java.lang.String
  ): this.type = js.native
}

