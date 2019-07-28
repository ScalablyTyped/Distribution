package typings.nightwatch.nightwatchMod

import typings.nightwatch.nightwatchStrings.browser
import typings.nightwatch.nightwatchStrings.client
import typings.nightwatch.nightwatchStrings.driver
import typings.nightwatch.nightwatchStrings.server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCommands extends js.Object {
  /**
    * Close the current window. This can be useful when you're working with multiple windows open (e.g. an OAuth login).
    * Uses `window` protocol command.
    *
    * @example
    * this.demoTest = function (client) {
    *   client.closeWindow();
    * };
    *
    * @see window
    */
  def closeWindow(): this.type = js.native
  def closeWindow(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): this.type = js.native
  /**
    * Delete the cookie with the given name. This command is a no-op if there is no such cookie visible to the current page.
    *
    * @example
    * this.demoTest = function(browser) {
    *   browser.deleteCookie("test_cookie", function() {
    *     // do something more in here
    *   });
    * }
    *
    * @see cookie
    */
  def deleteCookie(cookieName: String): this.type = js.native
  def deleteCookie(
    cookieName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): this.type = js.native
  /**
    * Delete all cookies visible to the current page.
    *
    * @example
    * this.demoTest = function(browser) {
    *   browser.deleteCookies(function() {
    *     // do something more in here
    *   });
    * }
    *
    * @see cookie
    */
  def deleteCookies(): this.type = js.native
  def deleteCookies(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): this.type = js.native
  /**
    * Ends the session. Uses session protocol command.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.end();
    * };
    *
    * @see session
    */
  def end(): this.type = js.native
  def end(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): this.type = js.native
  /**
    * Retrieve a single cookie visible to the current page. The cookie is returned as a cookie JSON object,
    * as defined [here](https://code.google.com/p/selenium/wiki/JsonWireProtocol#Cookie_JSON_Object).
    *
    * Uses `cookie` protocol command.
    *
    * @example
    * this.demoTest = function(browser) {
    *   browser.getCookie(name, function callback(result) {
    *     this.assert.equal(result.value, '123456');
    *     this.assert.equals(result.name, 'test_cookie');
    *   });
    * }
    *
    * @see cookie
    */
  def getCookie(name: String): this.type = js.native
  def getCookie(
    name: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Cookie], Unit]
  ): this.type = js.native
  /**
    * Retrieve all cookies visible to the current page. The cookies are returned as an array of cookie JSON object,
    * as defined [here](https://code.google.com/p/selenium/wiki/JsonWireProtocol#Cookie_JSON_Object).
    *
    * Uses `cookie` protocol command.
    *
    * @example
    * this.demoTest = function(browser) {
    *   browser.getCookies(function callback(result) {
    *     this.assert.equal(result.value.length, 1);
    *     this.assert.equals(result.value[0].name, 'test_cookie');
    *   });
    * }
    *
    * @see cookie
    */
  def getCookies(): this.type = js.native
  def getCookies(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[Cookie]], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Gets a log from Selenium.
    *
    * @example
    * this.demoTest = function(client) {
    *   this.getLog('browser', function(logEntriesArray) {
    *     console.log('Log length: ' + logEntriesArray.length);
    *     logEntriesArray.forEach(function(log) {
    *        console.log('[' + log.level + '] ' + log.timestamp + ' : ' + log.message);
    *      });
    *   });
    * };
    *
    * @see getLogTypes
    */
  def getLog(typestring: String): this.type = js.native
  def getLog(
    typestring: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* log */ js.Array[NightwatchLogEntry], Unit]
  ): this.type = js.native
  /**
    * Gets the available log types. More info about log types in WebDriver can be found here: https://github.com/SeleniumHQ/selenium/wiki/Logging
    *
    * @example
    * this.demoTest = function(client) {
    *   this.getLogTypes(function(typesArray) {
    *     console.log(typesArray);
    *   });
    * };
    *
    * @see sessionLogTypes
    */
  def getLogTypes(): this.type = js.native
  def getLogTypes(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ js.Array[client | driver | browser | server], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Returns the title of the current page. Uses title protocol command.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.getTitle(function(title) {
    *      this.assert.equal(typeof title, 'string');
    *      this.assert.equal(title, 'Nightwatch.js');
    *    });
    *  };
    *
    * @see title
    */
  def getTitle(): this.type = js.native
  def getTitle(callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ js.UndefOr[String], Unit]): this.type = js.native
  /**
    * This command is an alias to url and also a convenience method when called without any arguments in the sense
    * that it performs a call to .url() with passing the value of `launch_url` field from the settings file.
    * Uses `url` protocol command.
    *
    * @example
    * this.demoTest = function (client) {
    *   client.init();
    * };
    *
    * @see url
    */
  def init(): this.type = js.native
  def init(url: String): this.type = js.native
  /**
    * Utility command to load an external script into the page specified by url.
    *
    * @example
    * this.demoTest = function(client) {
    *   this.injectScript("{script-url}", function() {
    *     // we're all done here.
    *   });
    * };
    */
  def injectScript(scriptUrl: String): this.type = js.native
  def injectScript(scriptUrl: String, id: String): this.type = js.native
  def injectScript(
    scriptUrl: String,
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Utility command to test if the log type is available.
    *
    * @example
    * this.demoTest = function(browser) {
    *   browser.isLogAvailable('browser', function(isAvailable) {
    *     // do something more in here
    *   });
    * }
    *
    * @see getLogTypes
    */
  def isLogAvailable(typeString: String): this.type = js.native
  def isLogAvailable(
    typeString: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Maximizes the current window.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.maximizeWindow();
    *  };
    *
    * @see windowMaximize
    */
  def maximizeWindow(): this.type = js.native
  def maximizeWindow(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Suspends the test for the given time in milliseconds. If the milliseconds argument is missing it will suspend the test indefinitely
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.pause(1000);
    *   // or suspend indefinitely
    *   browser.pause();
    * };
    */
  def pause(): this.type = js.native
  def pause(ms: Double): this.type = js.native
  def pause(ms: Double, callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): this.type = js.native
  /**
    * A simple perform command which allows access to the Nightwatch API in a callback. Can be useful if you want to read variables set by other commands.
    *
    * The callback signature can have up to two parameters.
    *  - no parameters: callback runs and perform completes immediately at the end of the execution of the callback.
    *  - one parameter: allows for asynchronous execution within the callback providing a done callback function for completion as the first argument.
    *  - two parameters: allows for asynchronous execution with the Nightwatch `api` object passed in as the first argument, followed by the done callback.
    *
    * @example
    * this.demoTest = function (browser) {
    *   var elementValue;
    *   browser
    *     .getValue('.some-element', function(result) {
    *       elementValue = result.value;
    *     })
    *     // other stuff going on ...
    *     //
    *     // self-completing callback
    *     .perform(function() {
    *       console.log('elementValue', elementValue);
    *       // without any defined parameters, perform
    *       // completes immediately (synchronously)
    *     })
    *     //
    *     // asynchronous completion
    *     .perform(function(done) {
    *       console.log('elementValue', elementValue);
    *       // potentially other async stuff going on
    *       // on finished, call the done callback
    *       done();
    *     })
    *     //
    *     // asynchronous completion including api (client)
    *     .perform(function(client, done) {
    *       console.log('elementValue', elementValue);
    *       // similar to before, but now with client
    *       // potentially other async stuff going on
    *       // on finished, call the done callback
    *       done();
    *     });
    * };
    */
  def perform(callback: js.Function0[js.UndefOr[js.Promise[_]]]): this.type = js.native
  def perform(callback: js.Function1[/* done */ js.Function0[Unit], Unit]): this.type = js.native
  def perform(callback: js.Function2[/* client */ NightwatchAPI, /* done */ js.Function0[Unit], Unit]): this.type = js.native
  /**
    * Resizes the current window.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.resizeWindow(1000, 800);
    *  };
    *
    * @see windowSize
    */
  def resizeWindow(width: Double, height: Double): this.type = js.native
  def resizeWindow(
    width: Double,
    height: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Take a screenshot of the current page and saves it as the given filename.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.saveScreenshot('/path/to/fileName.png');
    *  };
    *
    * @see screenshot
    */
  def saveScreenshot(fileName: String): this.type = js.native
  def saveScreenshot(
    fileName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): this.type = js.native
  /**
    * Set a cookie, specified as a cookie JSON object, as defined [here](https://code.google.com/p/selenium/wiki/JsonWireProtocol#Cookie_JSON_Object).
    *
    * Uses `cookie` protocol command.
    *
    * @example
    * this.demoTest = function(browser) {
    *   browser.setCookie({
    *     name     : "test_cookie",
    *     value    : "test_value",
    *     path     : "/", (Optional)
    *     domain   : "example.org", (Optional)
    *     secure   : false, (Optional)
    *     httpOnly : false, // (Optional)
    *     expiry   : 1395002765 // (Optional) time in seconds since midnight, January 1, 1970 UTC
    *   });
    * }
    *
    * @see cookie
    */
  def setCookie(cookie: Cookie): this.type = js.native
  def setCookie(
    cookie: Cookie,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Sets the current window position.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.setWindowPosition(0, 0);
    *  };
    *
    * @see windowPosition
    */
  def setWindowPosition(offsetX: Double, offsetY: Double): this.type = js.native
  def setWindowPosition(
    offsetX: Double,
    offsetY: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Change focus to another window. The window to change focus to may be specified by its server assigned window handle, or by the value of its name attribute.
    *
    * To find out the window handle use `windowHandles` command
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.windowHandles(function(result) {
    *      var handle = result.value[0];
    *      browser.switchWindow(handle);
    *    });
    *  };
    *
    *  this.demoTestAsync = async function (browser) {
    *    const result = browser.windowHandles();
    *    var handle = result.value[0];
    *    browser.switchWindow(handle);
    *  };
    *
    * @see window
    */
  def switchWindow(handleOrName: String): this.type = js.native
  def switchWindow(
    handleOrName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Convenience command that adds the specified hash (i.e. url fragment) to the current value of the `launch_url` as set in `nightwatch.json`.
    *
    * @example
    * this.demoTest = function (client) {
    *   client.urlHash('#hashvalue');
    *   // or
    *   client.urlHash('hashvalue');
    * };
    *
    * @see url
    */
  def urlHash(hash: String): this.type = js.native
  def urlHash(
    hash: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Sets the locate strategy for selectors to `css selector`, therefore every following selector needs to be specified as css.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser
    *     .useCss() // we're back to CSS now
    *     .setValue('input[type=text]', 'nightwatch');
    * };
    */
  def useCss(): this.type = js.native
  def useCss(callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): this.type = js.native
  /**
    * Sets the locate strategy for selectors to xpath, therefore every following selector needs to be specified as xpath.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser
    *     .useXpath() // every selector now must be xpath
    *     .click("//tr[@data-recordid]/span[text()='Search Text']");
    * };
    */
  def useXpath(): this.type = js.native
  def useXpath(callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): this.type = js.native
}

