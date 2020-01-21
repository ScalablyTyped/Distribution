package typings.nightwatch.mod

import typings.nightwatch.AnonHeight
import typings.nightwatch.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementCommands extends js.Object {
  /**
    * Alias for `setValue`.
    * @see setValue
    */
  @JSName("sendKeys")
  var sendKeys_Original: js.Function3[
    /* selector */ String, 
    /* inputValue */ String | js.Array[String], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
    ], 
    this.type
  ] = js.native
  /**
    * Clear a textarea or a text input element's value. Uses `elementIdValue` protocol action internally.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.clearValue('input[type=text]');
    * };
    *
    * @see elementIdClear
    */
  def clearValue(selector: String): this.type = js.native
  def clearValue(
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): this.type = js.native
  /**
    * Simulates a click event on the given DOM element. Uses `elementIdClick` protocol action internally.
    *
    * The element is scrolled into view if it is not already pointer-interactable.
    * See the WebDriver specification for <a href="https://www.w3.org/TR/webdriver/#element-interactability" target="_blank">element interactability</a>
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.click("#main ul li a.first");
    * };
    *
    * @see elementIdClick
    */
  def click(selector: String): this.type = js.native
  def click(
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): this.type = js.native
  /**
    * Retrieve the value of an attribute for a given DOM element. Uses `elementIdAttribute` protocol command.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.getAttribute("#main ul li a.first", "href", function(result) {
    *     this.assert.equal(typeof result, "object");
    *     this.assert.equal(result.status, 0);
    *     this.assert.equal(result.value, "#home");
    *   });
    * };
    *
    * @see elementIdAttribute
    */
  def getAttribute(selector: String, attribute: String): this.type = js.native
  def getAttribute(
    selector: String,
    attribute: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String | Null], Unit]
  ): this.type = js.native
  /**
    * Retrieve the value of a css property for a given DOM element. Uses `elementIdCssProperty` protocol command.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.getCssProperty("#main ul li a.first", "display", function(result) {
    *     this.assert.equal(typeof result, "object");
    *     this.assert.equal(result.status, 0);
    *     this.assert.equal(result.value, 'inline');
    *   });
    * };
    *
    * @see elementIdCssProperty
    */
  def getCssProperty(selector: String, cssProperty: String): this.type = js.native
  def getCssProperty(
    selector: String,
    cssProperty: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): this.type = js.native
  /**
    * Determine an element's size in pixels. Uses `elementIdSize` protocol command.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.getElementSize("#main ul li a.first", function(result) {
    *     this.assert.equal(typeof result, "object");
    *     this.assert.equal(result.status, 0);
    *     this.assert.equal(result.value.width, 500);
    *     this.assert.equal(result.value.height, 20);
    *  });
    * };
    *
    * @see elementIdSize
    */
  def getElementSize(selector: String): this.type = js.native
  def getElementSize(
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[AnonHeight], Unit]
  ): this.type = js.native
  /**
    * Determine an element's location on the page. The point (0, 0) refers to the upper-left corner of the page.
    *
    * The element's coordinates are returned as a JSON object with x and y properties. Uses `elementIdLocation` protocol command.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.getLocation("#main ul li a.first", function(result) {
    *     this.assert.equal(typeof result, "object");
    *     this.assert.equal(result.status, 0);
    *     this.assert.equal(result.value.x, 200);
    *     this.assert.equal(result.value.y, 200);
    *   });
    * };
    *
    * @see elementIdLocation
    */
  def getLocation(selector: String): this.type = js.native
  def getLocation(
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[AnonX], Unit]
  ): this.type = js.native
  /**
    * Determine an element's location on the screen once it has been scrolled into view. Uses `elementIdLocationInView` protocol command.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.getLocationInView("#main ul li a.first", function(result) {
    *     this.assert.equal(typeof result, "object");
    *     this.assert.equal(result.status, 0);
    *     this.assert.equal(result.value.x, 200);
    *     this.assert.equal(result.value.y, 200);
    *   });
    * };
    *
    * @see elementIdLocationInView
    */
  def getLocationInView(selector: String): this.type = js.native
  def getLocationInView(
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[AnonX], Unit]
  ): this.type = js.native
  /**
    * Query for an element's tag name. Uses `elementIdName` protocol command.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.getTagName("#main ul li .first", function(result) {
    *     this.assert.equal(typeof result, "object");
    *     this.assert.equal(result.status, 0);
    *     this.assert.equal(result.value, "a");
    *   });
    * };
    *
    * @see elementIdName
    */
  def getTagName(selector: String): this.type = js.native
  def getTagName(
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): this.type = js.native
  /**
    * Returns the visible text for the element. Uses `elementIdText` protocol command.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.getText("#main ul li a.first", function(result) {
    *     this.assert.equal(typeof result, "object");
    *     this.assert.equal(result.status, 0);
    *     this.assert.equal(result.value, "nightwatchjs.org");
    *   });
    * };
    *
    * @see elementIdText
    */
  def getText(selector: String): this.type = js.native
  def getText(
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): this.type = js.native
  /**
    * Returns a form element current value. Uses `elementIdValue` protocol command.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.getValue("form.login input[type=text]", function(result) {
    *     this.assert.equal(typeof result, "object");
    *     this.assert.equal(result.status, 0);
    *     this.assert.equal(result.value, "enter username");
    *   });
    * };
    *
    * @see elementIdValue
    */
  def getValue(selector: String): this.type = js.native
  def getValue(
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): this.type = js.native
  /**
    * Determine if an element is currently displayed. Uses `elementIdDisplayed` protocol command.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.isVisible('#main', function(result) {
    *     this.assert.equal(typeof result, "object");
    *     this.assert.equal(result.status, 0);
    *     this.assert.equal(result.value, true);
    *   });
    * };
    *
    * @see elementIdDisplayed
    */
  def isVisible(selector: String): this.type = js.native
  def isVisible(
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): this.type = js.native
  /**
    * Move the mouse by an offset of the specified element. If an element is provided but no offset, the mouse will be moved to the center of the element.
    * If the element is not visible, it will be scrolled into view.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.moveToElement('#main', 10, 10);
    * };
    *
    * @see moveTo
    */
  def moveToElement(selector: String, xoffset: Double, yoffset: Double): this.type = js.native
  def moveToElement(
    selector: String,
    xoffset: Double,
    yoffset: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Alias for `setValue`.
    * @see setValue
    */
  def sendKeys(selector: String, inputValue: String): this.type = js.native
  def sendKeys(
    selector: String,
    inputValue: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  def sendKeys(selector: String, inputValue: js.Array[String]): this.type = js.native
  def sendKeys(
    selector: String,
    inputValue: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Sends some text to an element. Can be used to set the value of a form element or to send a sequence of key strokes to an element. Any UTF-8 character may be specified.
    *
    * <div class="alert alert-warning"><strong>setValue</strong> does not clear the existing value of the element. To do so, use the <strong>clearValue()</strong> command.</div>
    *
    * An object map with available keys and their respective UTF-8 characters, as defined on [W3C WebDriver draft spec](https://www.w3.org/TR/webdriver/#character-types),
    * is loaded onto the main Nightwatch instance as `browser.Keys`.
    *
    * @example
    * // send some simple text to an input
    * this.demoTest = function (browser) {
    *   browser.setValue('input[type=text]', 'nightwatch');
    * };
    * //
    * // send some text to an input and hit enter.
    * this.demoTest = function (browser) {
    *   browser.setValue('input[type=text]', ['nightwatch', browser.Keys.ENTER]);
    * };
    *
    * @see elementIdValue
    */
  def setValue(selector: String, inputValue: String): this.type = js.native
  def setValue(
    selector: String,
    inputValue: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  def setValue(selector: String, inputValue: js.Array[String]): this.type = js.native
  def setValue(
    selector: String,
    inputValue: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Submit a FORM element. The submit command may also be applied to any element that is a descendant of a FORM element. Uses `submit` protocol command.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.submitForm('form.login');
    * };
    *
    * @see submit
    */
  def submitForm(selector: String): this.type = js.native
  def submitForm(
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Opposite of `waitForElementPresent`. Waits a given time in milliseconds for an element to be not present (i.e. removed)
    * in the page before performing any other commands or assertions.
    *
    * If the element is still present after the specified amount of time, the test fails.
    *
    * You can change the polling interval by defining a `waitForConditionPollInterval` property (in milliseconds) in as a global property in your `nightwatch.json` or in your external globals file.
    *
    * Similarly, a default timeout can be specified as a global `waitForConditionTimeout` property (in milliseconds).
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.waitForElementNotPresent('#dialog', 1000);
    * };
    *
    * @see waitForElementPresent
    * @since v0.4.0
    */
  def waitForElementNotPresent(selector: String): this.type = js.native
  def waitForElementNotPresent(selector: String, time: Double): this.type = js.native
  def waitForElementNotPresent(selector: String, time: Double, abortOnFailure: Boolean): this.type = js.native
  def waitForElementNotPresent(
    selector: String,
    time: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  def waitForElementNotPresent(
    selector: String,
    time: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit],
    message: String
  ): this.type = js.native
  /**
    * Opposite of `waitForElementVisible`. Waits a given time in milliseconds for an element to be not visible (i.e. hidden but existing)
    * in the page before performing any other commands or assertions.
    *
    * If the element fails to be hidden in the specified amount of time, the test fails.
    *
    * You can change the polling interval by defining a `waitForConditionPollInterval` property (in milliseconds) in as a global property in your `nightwatch.json` or in your external globals file.
    *
    * Similarly, a default timeout can be specified as a global `waitForConditionTimeout` property (in milliseconds).
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.waitForElementNotVisible('#dialog', 1000);
    * };
    *
    * @since v0.4.0
    * @see waitForElementVisible
    */
  def waitForElementNotVisible(selector: String): this.type = js.native
  def waitForElementNotVisible(selector: String, time: Double): this.type = js.native
  def waitForElementNotVisible(selector: String, time: Double, abortOnFailure: Boolean): this.type = js.native
  def waitForElementNotVisible(
    selector: String,
    time: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  def waitForElementNotVisible(
    selector: String,
    time: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit],
    message: String
  ): this.type = js.native
  /**
    * Waits a given time in milliseconds for an element to be present in the page before performing any other commands or assertions.
    *
    * If the element fails to be present in the specified amount of time, the test fails. You can change this by setting `abortOnFailure` to `false`.
    *
    * You can change the polling interval by defining a `waitForConditionPollInterval` property (in milliseconds) in as a global property in your `nightwatch.json` or in your external globals file.
    *
    * Similarly, a default timeout can be specified as a global `waitForConditionTimeout` property (in milliseconds).
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.waitForElementPresent('body', 1000);
    *   // continue if failed
    *   browser.waitForElementPresent('body', 1000, false);
    *   // with callback
    *   browser.waitForElementPresent('body', 1000, function() {
    *     // do something while we're here
    *   });
    *   // custom Spanish message
    *   browser.waitForElementPresent('body', 1000, 'elemento %s no era presente en %d ms');
    *   // many combinations possible - the message is always the last argument
    *   browser.waitForElementPresent('body', 1000, false, function() {}, 'elemento %s no era presente en %d ms');
    * };
    */
  def waitForElementPresent(selector: String): this.type = js.native
  def waitForElementPresent(selector: String, time: Double): this.type = js.native
  def waitForElementPresent(selector: String, time: Double, abortOnFailure: Boolean): this.type = js.native
  def waitForElementPresent(
    selector: String,
    time: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  def waitForElementPresent(
    selector: String,
    time: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit],
    message: String
  ): this.type = js.native
  /**
    * Waits a given time in milliseconds for an element to be visible in the page before performing any other commands or assertions.
    *
    * If the element fails to be present and visible in the specified amount of time, the test fails. You can change this by setting `abortOnFailure` to `false`.
    *
    * You can change the polling interval by defining a `waitForConditionPollInterval` property (in milliseconds) in as a global property in your `nightwatch.json` or in your external globals file.
    *
    * Similarly, a default timeout can be specified as a global `waitForConditionTimeout` property (in milliseconds).
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.waitForElementVisible('body', 1000);
    *   // continue if failed
    *   browser.waitForElementVisible('body', 1000, false);
    *   // with callback
    *   browser.waitForElementVisible('body', 1000, function() {
    *     // do something while we're here
    *   });
    *   // custom Spanish message
    *   browser.waitForElementVisible('body', 1000, 'elemento %s no era visible en %d ms');
    *   // many combinations possible - the message is always the last argument
    *   browser.waitForElementVisible('body', 1000, false, function() {}, 'elemento %s no era visible en %d ms');
    * };
    */
  def waitForElementVisible(selector: String): this.type = js.native
  def waitForElementVisible(selector: String, time: Double): this.type = js.native
  def waitForElementVisible(selector: String, time: Double, abortOnFailure: Boolean): this.type = js.native
  def waitForElementVisible(
    selector: String,
    time: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  def waitForElementVisible(
    selector: String,
    time: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit],
    message: String
  ): this.type = js.native
}

