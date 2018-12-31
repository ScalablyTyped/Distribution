package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchAPI extends SharedFunctions {
  var Keys: NightwatchKeys = js.native
  var assert: NightwatchAssertions = js.native
  var currentTest: NightwatchTestSuite = js.native
  var expect: Expect = js.native
  var globals: js.Any = js.native
  var launch_url: java.lang.String = js.native
  var options: NightwatchTestOptions = js.native
  /**
    * SessionId of the session used by the Nightwatch api.
    */
  var sessionId: java.lang.String = js.native
  var verify: NightwatchAssertions = js.native
  /**
    * Accepts the currently displayed alert dialog. Usually, this is equivalent to clicking on the 'OK' button in the dialog.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def acceptAlert(): this.type = js.native
  def acceptAlert(callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Navigate backwards in the browser history, if possible.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def back(): this.type = js.native
  def back(callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Close the current window. This can be useful when you're working with multiple windows open (e.g. an OAuth login). Uses window protocol command.
    *
    * Usage:
    * ```
    *  this.demoTest = function (client) {
    *   client.closeWindow();
    * };
    * ```
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def closeWindow(): this.type = js.native
  def closeWindow(callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Get a list of the available contexts.
    * Used by Appium when testing hybrid mobile web apps. More info here: https://github.com/appium/appium/blob/master/docs/en/advanced-concepts/hybrid.md.
    * @param callback: Callback function to be called when the command finishes.
    * @returns an array of strings representing available contexts, e.g 'WEBVIEW', or 'NATIVE'
    */
  def contexts(): this.type = js.native
  def contexts(callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Retrieve or delete all cookies visible to the current page or set a cookie.
    * @returns a string representing the current context or `null`, representing "no context"
    */
  def cookie(method: java.lang.String): this.type = js.native
  def cookie(method: java.lang.String, callbackorCookie: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Get current context.
    * @param callback: Callback function to be called when the command finishes.
    */
  def currentContext(): this.type = js.native
  def currentContext(callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Delete the cookie with the given name. This command is a no-op if there is no such cookie visible to the current page.
    *
    * Usage:
    * ```
    * this.demoTest = function(browser) {
    *  browser.deleteCookie("test_cookie", function() {
    *  // do something more in here
    *  });
    * }
    * ```
    * @param The: name of the cookie to delete.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def deleteCookie(The: java.lang.String): this.type = js.native
  def deleteCookie(The: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Delete all cookies visible to the current page.
    *
    * Usage:
    * ```
    * this.demoTest = function(browser) {
    * browser.deleteCookies(function() {
    *  // do something more in here
    *  });
    * }
    * ```
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def deleteCookies(): this.type = js.native
  def deleteCookies(callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Dismisses the currently displayed alert dialog. For confirm() and prompt() dialogs, this is equivalent to clicking the 'Cancel' button.
    * For alert() dialogs, this is equivalent to clicking the 'OK' button.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def dismissAlert(): this.type = js.native
  def dismissAlert(callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Double-clicks at the current mouse coordinates (set by moveto).
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def doubleClick(): this.type = js.native
  def doubleClick(callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Search for an element on the page, starting from the document root. The located element will be returned as a WebElement JSON object.
    *
    * Usage:
    * ```
    * module.exports = {
    *  'demo Test' : function(browser) {
    *      browser.element('css selector', 'body', function(res) {
    *          console.log(res)
    *      });
    *  }
    * };
    * ```
    * @param using: The locator's strategy to use.
    * @param value: The search target.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def element(using: java.lang.String, value: java.lang.String): this.type = js.native
  def element(
    using: java.lang.String,
    value: java.lang.String,
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Get the element on the page that currently has focus.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def elementActive(): this.type = js.native
  def elementActive(callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Get the value of an element's attribute.
    * @param id: ID of the element to route the command to.
    * @param attributeName: The attribute name
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def elementIdAttribute(id: java.lang.String, attributeName: java.lang.String): this.type = js.native
  def elementIdAttribute(
    id: java.lang.String,
    attributeName: java.lang.String,
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Clear a TEXTAREA or text INPUT element's value.
    * @param id: ID of the element to route the command to.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def elementIdClear(id: java.lang.String): this.type = js.native
  def elementIdClear(id: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Click on an element.
    * @param id: ID of the element to route the command to.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def elementIdClick(id: java.lang.String): this.type = js.native
  def elementIdClick(id: java.lang.String, callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Query the value of an element's computed CSS property.
    * The CSS property to query should be specified using the CSS property name, not the JavaScript property name (e.g. background-color instead of backgroundColor).
    */
  def elementIdCssProperty(id: java.lang.String, cssPropertyName: java.lang.String): this.type = js.native
  def elementIdCssProperty(
    id: java.lang.String,
    cssPropertyName: java.lang.String,
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Determine if an element is currently displayed.
    * @param id: ID of the element to route the command to.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def elementIdDisplayed(id: java.lang.String): this.type = js.native
  def elementIdDisplayed(id: java.lang.String, callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Search for an element on the page, starting from the identified element. The located element will be returned as a WebElement JSON object.
    * @param id: ID of the element to route the command to.
    * @param using: The locator strategy to use.
    * @param value: The search target.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def elementIdElement(id: java.lang.String, using: java.lang.String, value: java.lang.String): this.type = js.native
  def elementIdElement(
    id: java.lang.String,
    using: java.lang.String,
    value: java.lang.String,
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Search for multiple elements on the page, starting from the identified element. The located element will be returned as a WebElement JSON objects.
    * @param id: ID of the element to route the command to.
    * @param using: The locator strategy to use.
    * @param value: The search target.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def elementIdElements(id: java.lang.String, using: java.lang.String, value: java.lang.String): this.type = js.native
  def elementIdElements(
    id: java.lang.String,
    using: java.lang.String,
    value: java.lang.String,
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Determine if an element is currently enabled.
    * @param id: ID of the element to route the command to.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def elementIdEnabled(id: java.lang.String): this.type = js.native
  def elementIdEnabled(id: java.lang.String, callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Test if two element IDs refer to the same DOM element.
    * @param id: ID of the element to route the command to.
    * @param otherId: ID of the element to compare against.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def elementIdEquals(id: java.lang.String, otherId: java.lang.String): this.type = js.native
  def elementIdEquals(
    id: java.lang.String,
    otherId: java.lang.String,
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Determine an element's location on the page. The point (0, 0) refers to the upper-left corner of the page.
    * The element's coordinates are returned as a JSON object with x and y properties.
    * @param id: ID of the element to route the command to.
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns The X and Y coordinates for the element on the page.
    */
  def elementIdLocation(id: java.lang.String): this.type = js.native
  def elementIdLocation(id: java.lang.String, callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Determine an element's location on the screen once it has been scrolled into view.
    * @param id: ID of the element to route the command to.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def elementIdLocationInView(id: java.lang.String): this.type = js.native
  def elementIdLocationInView(id: java.lang.String, callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Query for an element's tag name.
    * @param id: ID of the element to route the command to.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def elementIdName(id: java.lang.String): this.type = js.native
  def elementIdName(id: java.lang.String, callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Determine if an OPTION element, or an INPUT element of type checkbox or radio button is currently selected.
    * @param id: ID of the element to route the command to.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def elementIdSelected(id: java.lang.String): this.type = js.native
  def elementIdSelected(id: java.lang.String, callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Determine an element's size in pixels. The size will be returned as a JSON object with width and height properties.
    * @param id: ID of the element to route the command to.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def elementIdSize(id: java.lang.String): this.type = js.native
  def elementIdSize(id: java.lang.String, callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Returns the visible text for the element.
    * @param id: ID of the element to route the command to.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def elementIdText(id: java.lang.String): this.type = js.native
  def elementIdText(id: java.lang.String, callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Send a sequence of key strokes to an element or returns the current value of the element.
    * @param id: ID of the element to route the command to.
    * @param value: Value to send to element in case of POST
    */
  def elementIdValue(id: java.lang.String): this.type = js.native
  def elementIdValue(id: java.lang.String, value: java.lang.String): this.type = js.native
  def elementIdValue(
    id: java.lang.String,
    value: java.lang.String,
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Search for multiple elements on the page, starting from the document root. The located elements will be returned as a WebElement JSON objects.
    * Valid strings to use as locator strategies are: "class name", "css selector", "id", "name", "link text", "partial link text", "tag name", "xpath"
    * @param using: The locator strategy to use.
    * @param value: The search target.
    * @param callback: Callback function to be invoked with the result when the command finishes.
    */
  def elements(
    using: java.lang.String,
    value: java.lang.String,
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Ends the session. Uses session protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.end();
    * };
    * ```
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def end(): this.type = js.native
  def end(callback: js.Function0[scala.Unit]): this.type = js.native
  def execute(body: java.lang.String): this.type = js.native
  def execute(body: java.lang.String, args: js.Array[_]): this.type = js.native
  def execute(
    body: java.lang.String,
    args: js.Array[_],
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame. The executed script is assumed to be synchronous and
    * the result of evaluating the script is returned to the client.
    * The script argument defines the script to execute in the form of a function body. The value returned by that function will be returned to the client.
    * The function will be invoked with the provided args array and the values may be accessed via the arguments object in the order specified.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.execute(function(data) {
    *      // resize operation
    *      return true;
    *  }, [imagedata], function(result) {
    *      ...
    *  });
    * };
    * ```
    * @param body: The function body to be injected.
    * @param args: An array of arguments which will be passed to the function.
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns The script result.
    */
  def execute(body: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def execute(body: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Array[_]): this.type = js.native
  def execute(
    body: js.Function1[/* repeated */ js.Any, scala.Unit],
    args: js.Array[_],
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  def executeAsync(script: java.lang.String): this.type = js.native
  def executeAsync(script: java.lang.String, args: js.Array[_]): this.type = js.native
  def executeAsync(
    script: java.lang.String,
    args: js.Array[_],
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame. The executed script is assumed to be asynchronous
    * and the result of evaluating the script is returned to the client.
    * Asynchronous script commands may not span page loads. If an unload event is fired while waiting for a script result, an error should be returned to the client.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.executeAsync(function(data, done) {
    *      someAsyncOperation(function() {
    *          done(true);
    *      });
    *  }, [imagedata], function(result) {
    *      // ...
    *  });
    * };
    * ```
    * @param script: The function body to be injected.
    * @param args: An array of arguments which will be passed to the function.
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns The script result.
    */
  def executeAsync(script: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def executeAsync(script: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Array[_]): this.type = js.native
  def executeAsync(
    script: js.Function1[/* repeated */ js.Any, scala.Unit],
    args: js.Array[_],
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Navigate forwards in the browser history, if possible.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def forward(): this.type = js.native
  def forward(callback: js.Function0[scala.Unit]): this.type = js.native
  def frame(): this.type = js.native
  /**
    * Change focus to another frame on the page. If the frame id is missing or null, the server should switch to the page's default content.
    * @param frameId: Identifier for the frame to change focus to.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def frame(frameId: java.lang.String): this.type = js.native
  def frame(frameId: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  def frame(frameId: js.UndefOr[scala.Nothing], callback: js.Function0[scala.Unit]): this.type = js.native
  def frame(frameId: scala.Null, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Change focus to the parent context. If the current context is the top level browsing context, the context remains unchanged.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def frameParent(): this.type = js.native
  def frameParent(callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Gets the text of the currently displayed JavaScript alert(), confirm(), or prompt() dialog.
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns The text of the currently displayed alert.
    */
  def getAlertText(): this.type = js.native
  def getAlertText(callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Retrieve a single cookie visible to the current page. The cookie is returned as a cookie JSON object, as defined here.
    * Uses cookie protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function(browser) {
    *  browser.getCookie(name, function callback(result) {
    *      this.assert.equal(result.value, '123456');
    *      this.assert.equals(result.name, 'test_cookie');
    *  });
    * }
    * ```
    * @param name: The cookie name
    * @param callback: The callback function which will receive the response as an argument.
    * @returns The cookie object as a selenium cookie JSON object or null if the cookie wasn't found.
    */
  def getCookie(name: java.lang.String): this.type = js.native
  def getCookie(
    name: java.lang.String,
    callback: js.ThisFunction1[/* this */ this.type, /* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Retrieve all cookies visible to the current page. The cookies are returned as an array of cookie JSON object,
    * as defined here. Uses cookie protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function(browser) {
    *  browser.getCookies(function callback(result) {
    *      this.assert.equal(result.value.length, 1);
    *      this.assert.equals(result.value[0].name, 'test_cookie');
    *  });
    * }
    * ```
    * @param callback: The callback function which will receive the response as an argument.
    * @returns A list of cookies
    */
  def getCookies(): this.type = js.native
  def getCookies(
    callback: js.ThisFunction1[/* this */ this.type, /* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Gets a log from selenium
    *
    * Usage:
    * ```
    * this.demoTest = function(client) {
    *  this.getLog('browser', function(logEntriesArray) {
    *      console.log('Log length: ' + logEntriesArray.length);
    *      logEntriesArray.forEach(function(log) {
    *          console.log('[' + log.level + '] ' + log.timestamp + ' : ' + log.message);
    *      });
    *  });
    * };
    * ```
    * @param typestring: Log type to request
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def getLog(typestring: java.lang.String): this.type = js.native
  def getLog(
    typestring: java.lang.String,
    callback: js.Function1[/* log */ js.Array[NightwatchLogEntry], scala.Unit]
  ): this.type = js.native
  /**
    * Gets the available log types
    *
    * Usage:
    * ```
    * this.demoTest = function(client) {
    *  this.getLogTypes(function(typesArray) {
    *      console.log(typesArray);
    *  });
    * };
    * ```
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns Available log types
    */
  def getLogTypes(): this.type = js.native
  def getLogTypes(callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Get the current browser orientation.
    * @param callback: Callback function to be called when the command finishes.
    * @returns The current browser orientation: LANDSCAPE|PORTRAIT
    */
  def getOrientation(): this.type = js.native
  def getOrientation(callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Returns the title of the current page. Uses title protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.getTitle(function(title) {
    *      this.assert.equal(typeof title, 'string');
    *      this.assert.equal(title, 'nightwatch.js');
    *  });
    * };
    * ```
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns The page title.
    */
  def getTitle(): this.type = js.native
  def getTitle(
    callback: js.ThisFunction1[/* this */ this.type, /* result */ js.UndefOr[java.lang.String], scala.Unit]
  ): this.type = js.native
  /**
    * This command is an alias to url and also a convenience method when called without any arguments in the sense that it performs a call to .url() with passing the value of launch_url
    * field from the settings file. Uses url protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function (client) {
    *  client.init();
    * };
    * ```
    * @param url: Url to navigate to.
    */
  def init(): this.type = js.native
  def init(url: java.lang.String): this.type = js.native
  /**
    * Utility command to load an external script into the page specified by url.
    *
    * Usage:
    * ```
    * this.demoTest = function(client) {
    *  this.injectScript("{script-url}", function() {
    *      // we're all done here.
    *  });
    * };
    * ```
    * @param scriptUrl: The script file url
    * @param id: Dom element id to be set on the script tag.
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns The newly created script tag.
    */
  def injectScript(scriptUrl: java.lang.String): this.type = js.native
  def injectScript(scriptUrl: java.lang.String, id: java.lang.String): this.type = js.native
  def injectScript(
    scriptUrl: java.lang.String,
    id: java.lang.String,
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Utility command to test if the log type is available
    *
    * Usage:
    * ```
    * this.demoTest = function(browser) {
    *  browser.isLogAvailable('browser', function(isAvailable) {
    *      // do something more in here
    *  });
    * }
    * ```
    * @param typeString: Type of log to test
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def isLogAvailable(typeString: java.lang.String): this.type = js.native
  def isLogAvailable(
    typeString: java.lang.String,
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Send a sequence of key strokes to the active element. The sequence is defined in the same format as the sendKeys command.
    * An object map with available keys and their respective UTF-8 characters, as defined on W3C WebDriver draft spec, is loaded onto the main Nightwatch instance as client.Keys.
    * Rather than the setValue, the modifiers are not released at the end of the call.
    * The state of the modifier keys is kept between calls, so mouse interactions can be performed while modifier keys are depressed.
    * @param keysToSend: The keys sequence to be sent.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def keys(keysToSend: js.Array[java.lang.String]): this.type = js.native
  def keys(keysToSend: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Maximizes the current window.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.maximizeWindow();
    * };
    * ```
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def maximizeWindow(): this.type = js.native
  def maximizeWindow(callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Click at the current mouse coordinates (set by moveto).
    * The button can be (0, 1, 2) or ('left', 'middle', 'right'). It defaults to left mouse button, and if you don't pass in a button but do pass in a callback, it will handle it correctly.
    * @param button: The mouse button
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def mouseButtonClick(button: java.lang.String): this.type = js.native
  def mouseButtonClick(button: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Click and hold the left mouse button (at the coordinates set by the last moveto command). Note that the next mouse-related command that should follow is mouseButtonUp .
    * Any other mouse command (such as click or another call to buttondown) will yield undefined behaviour.
    * Can be used for implementing drag-and-drop. The button can be (0, 1, 2) or ('left', 'middle', 'right').
    * It defaults to left mouse button, and if you don't pass in a button but do pass in a callback, it will handle it correctly.
    * @param button: The mouse button
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def mouseButtonDown(button: java.lang.String): this.type = js.native
  def mouseButtonDown(button: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Releases the mouse button previously held (where the mouse is currently at). Must be called once for every mouseButtonDown command issued.
    * Can be used for implementing drag-and-drop. The button can be (0, 1, 2) or ('left', 'middle', 'right').
    * It defaults to left mouse button, and if you don't pass in a button but do pass in a callback, it will handle it correctly.
    * @param button: The mouse button
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def mouseButtonUp(button: java.lang.String): this.type = js.native
  def mouseButtonUp(button: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Move the mouse by an offset of the specificed element. If no element is specified, the move is relative to the current mouse cursor.
    * If an element is provided but no offset, the mouse will be moved to the center of the element.
    * If the element is not visible, it will be scrolled into view.
    * @param element: Opaque ID assigned to the element to move to. If not specified or is null, the offset is relative to current position of the mouse.
    * @param xofset: X offset to move to, relative to the top-left corner of the element. If not specified, the mouse will move to the middle of the element.
    * @param yoffset: Y offset to move to, relative to the top-left corner of the element. If not specified, the mouse will move to the middle of the element.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def moveTo(element: java.lang.String, xofset: scala.Double, yoffset: scala.Double): this.type = js.native
  def moveTo(
    element: java.lang.String,
    xofset: scala.Double,
    yoffset: scala.Double,
    callback: js.Function0[scala.Unit]
  ): this.type = js.native
  /**
    * Suspends the test for the given time in milliseconds. If the milliseconds argument is missing it will suspend the test indefinitely
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.pause(1000);
    *  // or suspend indefinitely
    *  browser.pause();
    * };
    * ```
    * @param ms: Optional - The number of milliseconds to wait.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def pause(): this.type = js.native
  def pause(ms: scala.Double): this.type = js.native
  def pause(ms: scala.Double, callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * A simple perform command which allows access to the "api" in a callback. Can be useful if you want to read variables set by other commands.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  var elementValue;
    *  browser
    *      .getValue('.some-element', function(result) {
    *          elementValue = result.value;
    *      })
    *      // other stuff going on ...
    *      //
    *      // asynchronous completion
    *      .perform(function(done) {
    *          console.log('elementValue', elementValue);
    *          // potentially other async stuff going on
    *          // on finished, call the done callback
    *          done();
    *      })
    * };
    * ```
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  var elementValue;
    *  browser
    *      .getValue('.some-element', function(result) {
    *          elementValue = result.value;
    *      })
    *      // other stuff going on ...
    *      //
    *      // self-completing callback
    *      .perform(function() {
    *          console.log('elementValue', elementValue);
    *          // without any defined parameters, perform
    *          // completes immediately (synchronously)
    *      })
    *      //
    * };
    * ```
    * @param callback: The function to run as part of the queue. Its signature can have up to two parameters. No parameters: callback runs and
    * perform completes immediately at the end of the execution of the callback. One parameter: allows for asynchronous execution within the
    * callback providing a done callback function for completion as the first argument. Two parameters: allows for asynchronous execution
    * with the "api" object passed in as the first argument, followed by the done callback.
    */
  def perform(callback: js.Function1[/* done */ js.UndefOr[js.Function0[scala.Unit]], scala.Unit]): this.type = js.native
  /**
    * A simple perform command which allows access to the "api" in a callback. Can be useful if you want to read variables set by other commands.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  var elementValue;
    *  browser
    *      .getValue('.some-element', function(result) {
    *          elementValue = result.value;
    *      })
    *      // other stuff going on ...
    *      //
    *      // asynchronous completion including api (client)
    *      .perform(function(client, done) {
    *          console.log('elementValue', elementValue);
    *          // similar to before, but now with client
    *          // potentially other async stuff going on
    *          // on finished, call the done callback
    *          done();
    *      });
    * };
    * ```
    *
    * @param callback: The function to run as part of the queue. Its signature can have up to two parameters. No parameters: callback runs and
    * perform completes immediately at the end of the execution of the callback. One parameter: allows for asynchronous execution within the
    * callback providing a done callback function for completion as the first argument. Two parameters: allows for asynchronous execution
    * with the "api" object passed in as the first argument, followed by the done callback.
    */
  def perform(
    callback: js.Function2[/* browser */ this.type, /* done */ js.UndefOr[js.Function0[scala.Unit]], scala.Unit]
  ): this.type = js.native
  /**
    * Refresh the current page.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def refresh(): this.type = js.native
  def refresh(callback: js.Function0[scala.Unit]): this.type = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Resizes the current window.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.resizeWindow(1000, 800);
    * };
    * ```
    * @param width: The new window width.
    * @param height: The new window height.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def resizeWindow(width: scala.Double, height: scala.Double): this.type = js.native
  def resizeWindow(width: scala.Double, height: scala.Double, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Take a screenshot of the current page and saves it as the given filename.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.saveScreenshot('/path/to/fileName.png');
    * };
    * ```
    * @param fileName: The complete path to the file name where the screenshot should be saved.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def saveScreenshot(fileName: java.lang.String): this.type = js.native
  def saveScreenshot(fileName: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Take a screenshot of the current page.
    * @param log_screenshot_data: Whether or not the screenshot data should appear in the logs when running with --verbose
    * @param callback: Optional callback function to be called with the resultant value (Base64 PNG) when the command finishes.
    */
  def screenshot(log_screenshot_data: scala.Boolean): this.type = js.native
  def screenshot(
    log_screenshot_data: scala.Boolean,
    callback: js.Function1[/* screenshotEncoded */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * Get info about, delete or create a new session. Defaults to the current session.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.session(function(result) {
    *      console.log(result.value);
    *  });
    *  //
    *  browser.session('delete', function(result) {
    *      console.log(result.value);
    *  });
    *  //
    *  browser.session('delete', '12345-abc', function(result) {
    *      console.log(result.value);
    *  });
    * };
    * ```
    * @param action: The http verb to use, can be "get", "post" or "delete". If only the callback is passed, get is assumed as default.
    * @param sessionId: The id of the session to get info about or delete.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def session(): this.type = js.native
  def session(action: java.lang.String): this.type = js.native
  def session(action: java.lang.String, sessionId: java.lang.String): this.type = js.native
  def session(
    action: java.lang.String,
    sessionId: java.lang.String,
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Gets the text of the log type specified
    * @param typeString: Type of log to request
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns Array of the text entries of the log.
    */
  def sessionLog(typeString: java.lang.String): this.type = js.native
  def sessionLog(
    typeString: java.lang.String,
    callback: js.Function1[/* log */ js.Array[NightwatchLogEntry], scala.Unit]
  ): this.type = js.native
  /**
    * Gets an array of strings for which log types are available.
    * @param callback: Optional callback function to be called when the command finishes.
    * @returns Available log types
    */
  def sessionLogTypes(): this.type = js.native
  def sessionLogTypes(callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Returns a list of the currently active sessions.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.sessions(function(result) {
    *      console.log(result.value);
    *  });
    * };
    * ```
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def sessions(): this.type = js.native
  def sessions(callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Sends keystrokes to a JavaScript prompt() dialog.
    * @param value: Keystrokes to send to the prompt() dialog
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def setAlertText(value: java.lang.String): this.type = js.native
  def setAlertText(value: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Sets the context
    * @param context: context name to switch to - a string representing an available context.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def setContext(context: java.lang.String): this.type = js.native
  def setContext(context: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Set a cookie, specified as a cookie JSON object, as defined https://code.google.com/p/selenium/wiki/JsonWireProtocol#Cookie_JSON_Object.
    * Uses cookie protocol command.
    *
    * Usage:
    * ```
    * this.demoTest = function(browser) {
    *  browser.setCookie({
    *      name     : "test_cookie",
    *      value    : "test_value",
    *      path     : "/", (Optional)
    *      domain   : "example.org", (Optional)
    *      secure   : false, (Optional)
    *      httpOnly : false, // (Optional)
    *      expiry   : 1395002765 // (Optional) time in seconds since midnight, January 1, 1970 UTC
    *  });
    * }
    * ```
    * @param cookie: The cookie object.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def setCookie(cookie: js.Any): this.type = js.native
  def setCookie(cookie: js.Any, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Sets the browser orientation.
    * @param orientation: The new browser orientation: {LANDSCAPE|PORTRAIT}
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def setOrientation(orientation: java.lang.String): this.type = js.native
  def setOrientation(orientation: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Override the sessionId used by Nightwatch client with another session id.
    * @param sessionId: The session Id to set.
    */
  def setSessionId(sessionId: java.lang.String): this.type = js.native
  /**
    * Sets the current window position.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.setWindowPosition(0, 0);
    * };
    * ```
    * @param OffsetX: The new window offset x-position.
    * @param OffsetY: The new window offset y-position.
    * @param callback: ptional callback function to be called when the command finishes.
    */
  def setWindowPosition(OffsetX: scala.Double, OffsetY: scala.Double): this.type = js.native
  def setWindowPosition(OffsetX: scala.Double, OffsetY: scala.Double, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Get the current page source.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def source(): this.type = js.native
  def source(callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Query the server's current status.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def status(): this.type = js.native
  def status(callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Submit a FORM element. The submit command may also be applied to any element that is a descendant of a FORM element.
    * @param id: ID of the element to route the command to.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def submit(id: java.lang.String): this.type = js.native
  def submit(id: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Change focus to another window. The window to change focus to may be specified by its server assigned window handle, or by the value of its name attribute.
    * To find out the window handle use window_handles protocol action
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser.window_handles(function(result) {
    *      var handle = result.value[0];
    *      browser.switchWindow(handle);
    *  });
    * };
    * ```
    * @param handleOrName: The server assigned window handle or the name attribute.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def switchWindow(handleOrName: java.lang.String): this.type = js.native
  def switchWindow(
    handleOrName: java.lang.String,
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Configure the amount of time that a particular type of operation can execute for before they are aborted and a |Timeout| error is returned to the client.
    * @param typeOfOperation: The type of operation to set the timeout for.
    * Valid values are: "script" for script timeouts, "implicit" for modifying the implicit wait timeout and "page load" for setting a page load timeout.
    * @param ms: The amount of time, in milliseconds, that time-limited commands are permitted to run.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def timeouts(typeOfOperation: java.lang.String, ms: scala.Double): this.type = js.native
  def timeouts(typeOfOperation: java.lang.String, ms: scala.Double, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Set the amount of time, in milliseconds, that asynchronous scripts executed by /session/:sessionId/execute_async are permitted
    * to run before they are aborted and a |Timeout| error is returned to the client.
    * @param ms: The amount of time, in milliseconds, that time-limited commands are permitted to run.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def timeoutsAsyncScript(ms: scala.Double): this.type = js.native
  def timeoutsAsyncScript(ms: scala.Double, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Set the amount of time the driver should wait when searching for elements. If this command is never sent, the driver will default to an implicit wait of 0ms.
    * @param ms: The amount of time, in milliseconds, that time-limited commands are permitted to run.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def timeoutsImplicitWait(ms: scala.Double): this.type = js.native
  def timeoutsImplicitWait(ms: scala.Double, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Get the current page title.
    * @param expected: The expected page title.
    * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def title(expected: java.lang.String): this.type = js.native
  def title(expected: java.lang.String, msg: java.lang.String): this.type = js.native
  def title(expected: java.lang.String, msg: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Retrieve the URL of the current page or navigate to a new URL.
    *
    * Usage:
    * ```
    * module.exports = {
    *  'demo Test' : function(browser) {
    *      browser.url(function(result) {
    *          // return the current url
    *          console.log(result);
    *      });
    *      //
    *      // navigate to new url:
    *      browser.url('{URL}');
    *      //
    *      //
    *      // navigate to new url:
    *      browser.url('{URL}', function(result) {
    *          console.log(result);
    *      });
    *  }
    * };
    * ```
    * @param url: If missing, it will return the URL of the current page as an argument to the supplied callback
    * @param callback Optional callback function to be called when the command finishes.
    */
  def url(): this.type = js.native
  def url(url: java.lang.String): this.type = js.native
  def url(url: java.lang.String, callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  def url(url: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  def url(
    url: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit],
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Convenience method that adds the specified hash (i.e. url fragment) to the current value of the launch_url as set in nightwatch.json.
    *
    * Usage:
    * ```
    * this.demoTest = function (client) {
    *  client.urlHash('#hashvalue');
    *  // or
    *  client.urlHash('hashvalue');
    * };
    * ```
    * @param hash: The hash to add/replace to the current url (i.e. the value set in the launch_url property in nightwatch.json).
    * @param callback:
    */
  def urlHash(hash: java.lang.String): this.type = js.native
  /**
    * To switch to css selectors instead of xpath as the locate strategy
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser
    *      .useCss() // we're back to CSS now
    *      .setValue('input[type=text]', 'nightwatch');
    * };
    * ```
    */
  def useCss(): this.type = js.native
  /**
    * To switch to xpath selectors instead of css as the locate strategy.
    * To always use xpath by default set the property "use_xpath": true in your test settings.
    *
    * Usage:
    * ```
    * this.demoTest = function (browser) {
    *  browser
    *      .useXpath() // every selector now must be xpath
    *      .click("//tr[@data-recordid]/span[text()='Search Text']");
    * };
    * ```
    */
  def useXpath(): this.type = js.native
  /**
    * Change focus to another window or close the current window.
    * @param method: The HTTP method to use
    * @param handleOrName: The window to change focus to.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def window(method: java.lang.String, handleOrName: java.lang.String): this.type = js.native
  def window(method: java.lang.String, handleOrName: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Retrieve the current window handle.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def windowHandle(): this.type = js.native
  def windowHandle(callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Retrieve the list of all window handles available to the session.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def windowHandles(): this.type = js.native
  def windowHandles(callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
  /**
    * Retrieve the current window handle.
    * @param handleOrName: windowHandle URL parameter; if it is "current", the currently active window will be maximized.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def windowMaximize(): this.type = js.native
  def windowMaximize(handleOrName: java.lang.String): this.type = js.native
  def windowMaximize(handleOrName: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Change or get the position of the specified window. If the second argument is a function it will be used as a callback and the call
    * will perform a get request to retrieve the existing window position.
    * @param windowHandle:
    * @param: offsetX:
    * @param: offsetY:
    * @param: callback:
    */
  def windowPosition(
    windowHandle: java.lang.String,
    offsetX: scala.Double,
    offsetY: scala.Double,
    callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]
  ): this.type = js.native
  /**
    * Change or get the size of the specified window. If the second argument is a function it will be used as a callback and the call will perform a get request to retrieve the existing window size.
    * @param windowHandle:
    * @param width:
    * @param height:
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def windowSize(windowHandle: java.lang.String, width: scala.Double, height: scala.Double): this.type = js.native
  def windowSize(
    windowHandle: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    callback: js.Function0[scala.Unit]
  ): this.type = js.native
  /**
    * Retrieve the list of all window handles available to the session.
    * @param callback: Optional callback function to be called when the command finishes.
    */
  def window_handles(): this.type = js.native
  def window_handles(callback: js.Function1[/* result */ NightwatchCallbackResult, scala.Unit]): this.type = js.native
}

