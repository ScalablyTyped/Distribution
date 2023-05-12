package typings.nightwatch.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nightwatch.anon.Preview
import typings.std.HTMLScriptElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientCommands
  extends StObject
     with ChromiumClientCommands {
  
  /**
    * Injects the axe-core js library into the current page (using the .executeScript() command) to be paired
    * with axeRun to evaluate the axe-core accessibility rules.
    *
    * @example
    * this.demoTest = function () {
    *   browser
    *     .url('https://nightwatchjs.org')
    *     .axeInject()
    *     .axeRun();
    * };
    *
    * @see https://nightwatchjs.org/api/axeInject.html
    */
  def axeInject(): Awaitable[this.type, Null] = js.native
  
  /**
    * Analyzes the current page against applied axe rules.
    *
    * @example
    * this.demoTest = function () {
    *   browser
    *     .url('https://nightwatchjs.org')
    *     .axeInject()
    *     .axeRun(
    *        'body',
    *        { runOnly: ['color-contrast', 'image-alt'] }
    *     );
    * };
    *
    * @example
    * this.demoTest = function () {
    *   browser
    *     .url('https://nightwatchjs.org')
    *     .axeInject()
    *     .axeRun(
    *        'body',
    *        {
    *          'color-contrast': {
    *             enabled: false
    *            }
    *          },
    *        }
    *     );
    * };
    *
    * @param selector - CSS selector to scope rule analysis against, will cascade to child elements
    * @param options - Allows configuration of what rules will be run (accessibility standard or rules to enable/disable)
    * @see {@link https://www.deque.com/axe/core-documentation/api-documentation/#options-parameter}
    *
    * @see {@link https://nightwatchjs.org/api/axeRun.html}
    */
  def axeRun(): Awaitable[this.type, Null] = js.native
  def axeRun(selector: String): Awaitable[this.type, Null] = js.native
  def axeRun(selector: String, options: StringDictionary[Any]): Awaitable[this.type, Null] = js.native
  def axeRun(
    selector: String,
    options: StringDictionary[Any],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def axeRun(
    selector: String,
    options: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def axeRun(selector: Unit, options: StringDictionary[Any]): Awaitable[this.type, Null] = js.native
  def axeRun(
    selector: Unit,
    options: StringDictionary[Any],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def axeRun(
    selector: Unit,
    options: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Close the current window. This can be useful when you're working with multiple windows open (e.g. an OAuth login).
    * Uses `window` protocol command.
    *
    * @example
    * describe('closeWindow command demo' , function (result) {
    *   test('demo test', function () {
    *     browser.closeWindow();
    *   });
    * });
    * @see https://nightwatchjs.org/api/closeWindow.html
    */
  def closeWindow(): Awaitable[this.type, Null] = js.native
  def closeWindow(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * This command halts the test execution and provides users with a REPL interface where they can type
    * any of the available Nightwatch commands and the command will be executed in the running browser
    * in real-time.
    *
    * This can be used to debug why a certain command in not working as expected, find the correct
    * locators for your assertions or just play around with the available Nightwatch commands.
    *
    * @example
    * // async function is required while using the debug
    * // command to get the correct result as output.
    * this.demoTest = async function (browser) {
    *   browser.debug();
    *
    *   // with no auto-complete
    *   browser.debug({preview: false});
    *
    *   // with a timeout of 6000 ms (time for which the interface
    *   // would wait for a result).
    *   browser.debug({timeout: 6000})
    * };
    *
    * @see https://nightwatchjs.org/api/debug.html
    */
  def debug(): Awaitable[this.type, Unit] = js.native
  def debug(config: Unit, callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): Awaitable[this.type, Unit] = js.native
  def debug(config: Preview): Awaitable[this.type, Unit] = js.native
  def debug(config: Preview, callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): Awaitable[this.type, Unit] = js.native
  
  /**
    * Delete the cookie with the given name. This command is a no-op if there is no such cookie visible to the current page.
    *
    * @example
    * this.demoTest = function() {
    *   browser.deleteCookie("test_cookie", function() {
    *     // do something more in here
    *   });
    * }
    *
    * @see https://nightwatchjs.org/api/deleteCookie.html
    */
  def deleteCookie(cookieName: String): Awaitable[this.type, Null] = js.native
  def deleteCookie(
    cookieName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Delete all cookies visible to the current page.
    *
    * @example
    * this.demoTest = function() {
    *   browser.deleteCookies(function() {
    *     // do something more in here
    *   });
    * }
    *
    * @see https://nightwatchjs.org/api/deleteCookies.html
    */
  def deleteCookies(): Awaitable[this.type, Null] = js.native
  def deleteCookies(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Ends the session. Uses session protocol command.
    *
    * @example
    * this.demoTest = function () {
    *   browser.end();
    * };
    *
    * @see https://nightwatchjs.org/api/end.html
    */
  def end(): Awaitable[this.type, Null] = js.native
  def end(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Sets the current window state to fullscreen.
    *
    * @example
    * module.exports = {
    *  'demo Test': function(browser) {
    *     browser.fullscreenWindow(function(result) {
    *       console.log(result);
    *     });
    *   },
    *
    *   'ES6 async demo Test': async function(browser) {
    *     const result = await browser.fullscreenWindow();
    *     console.log('result value is:', result.value);
    *   }
    * }
    * @see https://nightwatchjs.org/api/fullscreenWindow.html
    */
  def fullscreenWindow(): Awaitable[this.type, Null] = js.native
  def fullscreenWindow(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Retrieve a single cookie visible to the current page. The cookie is returned as a cookie JSON object,
    * as defined [here](https://code.google.com/p/selenium/wiki/JsonWireProtocol#Cookie_JSON_Object).
    *
    * Uses `cookie` protocol command.
    *
    * @example
    * this.demoTest = function() {
    *   browser.getCookie(name, function callback(result) {
    *     this.assert.equal(result.value, '123456');
    *     this.assert.equals(result.name, 'test_cookie');
    *   });
    * }
    *
    * @see https://nightwatchjs.org/api/getCookie.html
    */
  def getCookie(name: String): Awaitable[this.type, Cookie] = js.native
  def getCookie(
    name: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Cookie], Unit]
  ): Awaitable[this.type, Cookie] = js.native
  
  /**
    * Retrieve all cookies visible to the current page. The cookies are returned as an array of cookie JSON object,
    * as defined [here](https://code.google.com/p/selenium/wiki/JsonWireProtocol#Cookie_JSON_Object).
    *
    * Uses `cookie` protocol command.
    *
    * @example
    * this.demoTest = function() {
    *   browser.getCookies(function callback(result) {
    *     this.assert.equal(result.value.length, 1);
    *     this.assert.equals(result.value[0].name, 'test_cookie');
    *   });
    * }
    *
    * @see https://nightwatchjs.org/api/getCookies.html
    */
  def getCookies(): Awaitable[this.type, js.Array[Cookie]] = js.native
  def getCookies(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[Cookie]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[Cookie]] = js.native
  
  /**
    * Retrieve the URL of the current page.
    *
    * @example
    * describe('Navigation commands demo', function() {
    *   test('demoTest', function(browser) {
    *     // navigate to new url:
    *     browser.navigateTo('https://nightwatchjs.org');
    *
    *     // Retrieve to url with callback:
    *     browser.getCurrentUrl(function(result) {
    *       console.log(result.value);
    *     });
    *   });
    *
    *   test('demoTestAsync', async function(browser) {
    *     const currentUrl = await browser.navigateTo('https://nightwatchjs.org').getCurrentUrl();
    *     console.log('currentUrl:', currentUrl); // will print 'https://nightwatchjs.org'
    *   });
    *
    * });
    *
    *  @see https://nightwatchjs.org/api/getCurrentUrl.html
    */
  def getCurrentUrl(): Awaitable[this.type, String] = js.native
  def getCurrentUrl(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  
  /**
    * Gets a log from Selenium.
    *
    * @example
    * this.demoTest = function() {
    *   this.getLog('browser', function(logEntriesArray) {
    *     console.log('Log length: ' + logEntriesArray.length);
    *     logEntriesArray.forEach(function(log) {
    *        console.log('[' + log.level + '] ' + log.timestamp + ' : ' + log.message);
    *      });
    *   });
    * };
    *
    * @see https://nightwatchjs.org/api/getLog.html
    */
  def getLog(typestring: String): Awaitable[this.type, js.Array[NightwatchLogEntry]] = js.native
  def getLog(
    typestring: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* log */ js.Array[NightwatchLogEntry], Unit]
  ): Awaitable[this.type, js.Array[NightwatchLogEntry]] = js.native
  
  /**
    * Gets the available log types. More info about log types in WebDriver can be found here: https://github.com/SeleniumHQ/selenium/wiki/Logging
    *
    * @example
    * this.demoTest = function() {
    *   this.getLogTypes(function(typesArray) {
    *     console.log(typesArray);
    *   });
    * };
    *
    * @see https://nightwatchjs.org/api/getLogTypes.html
    */
  def getLogTypes(): Awaitable[this.type, js.Array[NightwatchLogTypes]] = js.native
  def getLogTypes(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ js.Array[NightwatchLogTypes], Unit]
  ): Awaitable[this.type, js.Array[NightwatchLogTypes]] = js.native
  
  /**
    * Returns the title of the current page. Uses title protocol command.
    *
    * @example
    *  this.demoTest = function () {
    *    browser.getTitle(function(title) {
    *      this.assert.equal(typeof title, 'string');
    *      this.assert.equal(title, 'Nightwatch.js');
    *    });
    *  };
    *
    * @see https://nightwatchjs.org/api/getTitle.html
    */
  def getTitle(): Awaitable[this.type, String] = js.native
  def getTitle(callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ String, Unit]): Awaitable[this.type, String] = js.native
  
  /**
    * Retrieves the current window position.
    *
    * For clients which are compatible with the [W3C Webdriver API](https://w3c.github.io/webdriver/), `getWindowPosition` is an alias of `getWindowRect`.
    *
    * The `getWindowRect` command returns both dimensions and position of the window, using the `windowRect` protocol command.
    *
    * @example
    * module.exports = {
    *   'demo test .getWindowPosition()': function(browser) {
    *      // Retrieve the attributes
    *      browser.getWindowPosition(function(value) {
    *        console.log(value);
    *      });
    *   },
    *
    *   'getWindowPosition ES6 demo test': async function(browser) {
    *      const value = await browser.getWindowPosition();
    *      console.log('value', value);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/getWindowPosition.html
    */
  def getWindowPosition(): Awaitable[this.type, WindowPosition] = js.native
  def getWindowPosition(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[WindowPosition], 
      Unit
    ]
  ): Awaitable[this.type, WindowPosition] = js.native
  
  /**
    * Change or get the [window rect](https://w3c.github.io/webdriver/#dfn-window-rect).
    * This is defined as a dictionary of the `screenX`, `screenY`, `outerWidth` and `outerHeight` attributes of the window.
    *
    * Its JSON representation is the following:
    * - `x` - window's screenX attribute;
    * - `y` - window's screenY attribute;
    * - `width` - outerWidth attribute;
    * - `height` - outerHeight attribute.
    *
    * All attributes are in in CSS pixels. To change the window react, you can either specify `width` and `height`, `x` and `y` or all properties together.
    *
    * @example
    * module.exports = {
    *   'demo test .getWindowRect()': function() {
    *      // Retrieve the attributes
    *      browser.getWindowRect(function(value) {
    *        console.log(value);
    *      });
    *   },
    *
    *   'getWindowRect ES6 demo test': async function() {
    *      const resultValue = await browser.getWindowRect();
    *      console.log('result value', resultValue);
    *   }
    * }
    *
    *  @see https://nightwatchjs.org/api/getWindowRect.html
    */
  def getWindowRect(): Awaitable[this.type, WindowSizeAndPosition] = js.native
  def getWindowRect(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[WindowSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, WindowSizeAndPosition] = js.native
  
  /**
    * Retrieves the current window size.
    *
    * For clients which are compatible with the [W3C Webdriver API](https://w3c.github.io/webdriver/), `getWindowSize` is an alias of `getWindowRect`.
    *
    * The `getWindowRect` command returns both dimensions and position of the window, using the `windowRect` protocol command.
    *
    * @example
    * module.exports = {
    *   'demo test .getWindowSize()': function() {
    *      // Retrieve the attributes
    *      browser.getWindowSize(function(value) {
    *        console.log(value);
    *      });
    *   },
    *
    *   'getWindowSize ES6 demo test': async function(browser) {
    *      const value = await browser.getWindowSize();
    *      console.log('value', value);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/getWindowSize.html
    */
  def getWindowSize(): Awaitable[this.type, WindowSizeAndPosition] = js.native
  def getWindowSize(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[WindowSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, WindowSizeAndPosition] = js.native
  
  /**
    * This command is an alias to url and also a convenience method when called without any arguments in the sense
    * that it performs a call to .url() with passing the value of `launch_url` field from the settings file.
    * Uses `url` protocol command.
    *
    * @example
    * this.demoTest = function () {
    *   browser.init();
    * };
    *
    * @see https://nightwatchjs.org/api/init.html
    */
  def init(): Awaitable[this.type, Null] = js.native
  def init(url: String): Awaitable[this.type, Null] = js.native
  def init(
    url: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def init(
    url: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Utility command to load an external script into the page specified by url.
    *
    * @example
    * this.demoTest = function() {
    *   this.injectScript("{script-url}", function() {
    *     // we're all done here.
    *   });
    * };
    *
    * @see https://nightwatchjs.org/api/injectScript.html
    */
  def injectScript(scriptUrl: String): Awaitable[this.type, HTMLScriptElement] = js.native
  def injectScript(scriptUrl: String, id: String): Awaitable[this.type, HTMLScriptElement] = js.native
  def injectScript(
    scriptUrl: String,
    id: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[HTMLScriptElement], 
      Unit
    ]
  ): Awaitable[this.type, HTMLScriptElement] = js.native
  def injectScript(
    scriptUrl: String,
    id: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[HTMLScriptElement], 
      Unit
    ]
  ): Awaitable[this.type, HTMLScriptElement] = js.native
  
  /**
    * Utility command to test if the log type is available.
    *
    * @example
    * this.demoTest = function() {
    *   browser.isLogAvailable('browser', function(isAvailable) {
    *     // do something more in here
    *   });
    * }
    *
    * @see https://nightwatchjs.org/api/isLogAvailable.html
    */
  def isLogAvailable(typeString: String): Awaitable[this.type, Boolean] = js.native
  def isLogAvailable(
    typeString: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ Boolean, Unit]
  ): Awaitable[this.type, Boolean] = js.native
  
  /**
    * Maximizes the current window.
    *
    * @example
    *  this.demoTest = function () {
    *    browser.maximizeWindow();
    *  };
    *
    * @see https://nightwatchjs.org/api/maximizeWindow.html
    */
  def maximizeWindow(): Awaitable[this.type, Null] = js.native
  def maximizeWindow(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Hides the window in the system tray. If the window happens to be in fullscreen mode,
    * it is restored the normal state then it will be "iconified" - minimize or hide the window from the visible screen.
    *
    * @example
    * module.exports = {
    *  'demo Test': function(browser) {
    *     browser.minimizeWindow(function(result) {
    *       console.log(result);
    *     });
    *   },
    *
    *   'ES6 async demo Test': async function(browser) {
    *     const result = await browser.minimizeWindow();
    *     console.log('result value is:', result.value);
    *   }
    * }
    * @see https://nightwatchjs.org/api/minimizeWindow.html
    */
  def minimizeWindow(): Awaitable[this.type, Null] = js.native
  def minimizeWindow(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Navigate to a new URL. This method will also call the `onBrowserNavigate()` test global,
    * right after the page is loaded.
    *
    * @example
    *  describe('Navigation commands demo', function() {
    *    test('demoTest', function(browser) {
    *      // navigate to new url:
    *      browser.navigateTo('https://nightwatchjs.org');
    *
    *      // Retrieve to url with callback:
    *      browser.getCurrentUrl(function(result) {
    *        console.log(result.value);
    *      });
    *    });
    *
    *    test('demoTestAsync', async function(browser) {
    *      const currentUrl = await browser.navigateTo('https://nightwatchjs.org').getCurrentUrl();
    *      console.log('currentUrl:', currentUrl); // will print 'https://nightwatchjs.org'
    *    });
    *  });
    *
    *  @see https://nightwatchjs.org/api/navigateTo.html
    */
  def navigateTo(url: String): Awaitable[this.type, Null] = js.native
  def navigateTo(
    url: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Opens a new top-level browser window, which can be either a tab (default) or a separate new window.
    *
    * This command is only available for W3C Webdriver compatible browsers.
    *
    * @example
    * module.exports = {
    *  'demo Test': function(browser) {
    *     // open a new window tab (default)
    *     browser.openNewWindow(function(result) {
    *       console.log(result);
    *     });
    *
    *     // open a new window
    *     browser.openNewWindow('window', function(result) {
    *       console.log(result);
    *     });
    *   },
    *
    *   'ES6 async demo Test': async function(browser) {
    *     const result = await browser.openNewWindow();
    *     console.log('result value is:', result.value);
    *   }
    * }
    * @see https://nightwatchjs.org/api/openNewWindow.html
    */
  def openNewWindow(): Awaitable[this.type, Null] = js.native
  def openNewWindow(
    `type`: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def openNewWindow(`type`: WindowType): Awaitable[this.type, Null] = js.native
  def openNewWindow(
    `type`: WindowType,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Returns the page source. Uses pageSource protocol command.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.pageSource(function(pageSource) {
    *      console.log(pageSource);
    *    });
    *  };
    *
    * @see https://nightwatchjs.org/api/pageSource.html
    */
  def pageSource(): Awaitable[this.type, String] = js.native
  def pageSource(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  
  /**
    * Suspends the test for the given time in milliseconds. If the milliseconds argument is missing it will suspend the test indefinitely
    *
    * @example
    * this.demoTest = function () {
    *   browser.pause(1000);
    *   // or suspend indefinitely
    *   browser.pause();
    * };
    *
    * @see https://nightwatchjs.org/api/pause.html
    */
  def pause(): Awaitable[this.type, Unit] = js.native
  def pause(ms: Double): Awaitable[this.type, Unit] = js.native
  def pause(ms: Double, callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): Awaitable[this.type, Unit] = js.native
  def pause(ms: Unit, callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): Awaitable[this.type, Unit] = js.native
  
  /**
    * A simple perform command which allows access to the Nightwatch API in a callback. Can be useful if you want to read variables set by other commands.
    *
    * The callback signature can have up to two parameters.
    *  - no parameters: callback runs and perform completes immediately at the end of the execution of the callback.
    *  - one parameter: allows for asynchronous execution within the callback providing a done callback function for completion as the first argument.
    *  - two parameters: allows for asynchronous execution with the Nightwatch `api` object passed in as the first argument, followed by the done callback.
    *
    * @example
    * this.demoTest = function () {
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
    *     .perform(function(done) {
    *       console.log('elementValue', elementValue);
    *       // similar to before, but now with client
    *       // potentially other async stuff going on
    *       // on finished, call the done callback
    *       done();
    *     });
    * };
    */
  def perform(callback: js.Function0[js.UndefOr[js.Promise[Any]]]): Awaitable[this.type, js.UndefOr[js.Error]] = js.native
  def perform(callback: js.Function1[/* done */ js.Function0[Unit], Unit]): Awaitable[this.type, js.UndefOr[js.Error]] = js.native
  def perform(callback: js.Function2[/* client */ NightwatchAPI, /* done */ js.Function0[Unit], Unit]): Awaitable[this.type, js.UndefOr[js.Error]] = js.native
  
  /**
    * Ends the session and closes down the test WebDriver server, if one is running.
    * This is similar to calling the .end() command, but the former doesn't quit the WebDriver session.
    *
    * This command will also execute the `onBrowserQuit()` global, if one is defined.
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.quit(function(result) {
    *     console.log(result.value);
    *   });
    * }
    *
    * @see https://nightwatchjs.org/api/quit.html
    */
  def quit(): Awaitable[this.type, Null] = js.native
  def quit(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Resizes the current window.
    *
    * @example
    *  this.demoTest = function () {
    *    browser.resizeWindow(1000, 800);
    *  };
    *
    * @see https://nightwatchjs.org/api/resizeWindow.html
    */
  def resizeWindow(width: Double, height: Double): Awaitable[this.type, Null] = js.native
  def resizeWindow(
    width: Double,
    height: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Take a screenshot of the current page and saves it as the given filename.
    *
    * @example
    *  this.demoTest = function (  ) {
    *    browser.saveScreenshot('/path/to/fileName.png');
    *  };
    *
    * @see https://nightwatchjs.org/api/saveScreenshot.html
    */
  def saveScreenshot(fileName: String): Awaitable[this.type, String] = js.native
  def saveScreenshot(
    fileName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  
  /**
    * Set a cookie, specified as a cookie JSON object, as defined [here](https://code.google.com/p/selenium/wiki/JsonWireProtocol#Cookie_JSON_Object).
    *
    * Uses `cookie` protocol command.
    *
    * @example
    * this.demoTest = function() {
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
    * @see https://nightwatchjs.org/api/setCookie.html
    */
  def setCookie(cookie: Cookie): Awaitable[this.type, Null] = js.native
  def setCookie(
    cookie: Cookie,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Sets the current window position.
    *
    * @example
    *  this.demoTest = function () {
    *    browser.setWindowPosition(0, 0);
    *  };
    *
    * @see https://nightwatchjs.org/api/setWindowPosition.html
    */
  def setWindowPosition(offsetX: Double, offsetY: Double): Awaitable[this.type, Null] = js.native
  def setWindowPosition(
    offsetX: Double,
    offsetY: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Change the [window rect](https://w3c.github.io/webdriver/#dfn-window-rect). This is defined as a dictionary of the `screenX`, `screenY`, `outerWidth` and `outerHeight` attributes of the window.
    *
    * Its JSON representation is the following:
    * - `x` - window's screenX attribute;
    * - `y` - window's screenY attribute;
    * - `width` - outerWidth attribute;
    * - `height` - outerHeight attribute.
    *
    * All attributes are in in CSS pixels. To change the window react, you can either specify `width` and `height`, `x` and `y` or all properties together.
    *
    * @example
    * module.exports = {
    *   'demo test .setWindowRect()': function() {
    *
    *      // Change the screenX and screenY attributes of the window rect.
    *      browser.setWindowRect({x: 500, y: 500});
    *
    *      // Change the width and height attributes of the window rect.
    *      browser.setWindowRect({width: 600, height: 300});
    *
    *      // Retrieve the attributes
    *      browser.setWindowRect(function(result) {
    *        console.log(result.value);
    *      });
    *   },
    *
    *   'setWindowRect ES6 demo test': async function() {
    *      await browser.setWindowRect({
    *        width: 600,
    *        height: 300,
    *        x: 100,
    *        y: 100
    *      });
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/setWindowRect.html
    */
  def setWindowRect(options: WindowSizeAndPosition): Awaitable[this.type, Null] = js.native
  def setWindowRect(
    options: WindowSizeAndPosition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Sets the current window position.
    *
    * @example
    *  this.demoTest = function () {
    *    browser.setWindowPosition(0, 0);
    *  };
    *
    * @see https://nightwatchjs.org/api/setWindowSize.html
    *
    */
  def setWindowSize(width: Double, height: Double): Awaitable[this.type, Null] = js.native
  def setWindowSize(
    width: Double,
    height: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Change focus to another window. The window to change focus to may be specified by its server assigned window handle, or by the value of its name attribute.
    *
    * To find out the window handle use `windowHandles` command
    *
    * @example
    *  this.demoTest = function () {
    *    browser.windowHandles(function(result) {
    *      const handle = result.value[0];
    *      browser.switchToWindow(handle);
    *    });
    *  };
    *
    *  this.demoTestAsync = async function () {
    *    const result = await browser.windowHandles();
    *    const handle = result[0];
    *    browser.switchToWindow(handle);
    *  };
    *
    * @see https://nightwatchjs.org/api/switchToWindow.html
    */
  def switchToWindow(handleOrName: String): Awaitable[this.type, Null] = js.native
  def switchToWindow(
    handleOrName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Change focus to another window. The window to change focus to may be specified by its server assigned window handle, or by the value of its name attribute.
    *
    * To find out the window handle use `windowHandles` command
    *
    * @example
    *  this.demoTest = function () {
    *    browser.windowHandles(function(result) {
    *      const handle = result.value[0];
    *      browser.switchWindow(handle);
    *    });
    *  };
    *
    *  this.demoTestAsync = async function () {
    *    const result = await browser.windowHandles();
    *    const handle = result[0];
    *    browser.switchWindow(handle);
    *  };
    *
    * @alias switchToWindow
    *
    * @see https://nightwatchjs.org/api/switchWindow.html
    */
  def switchWindow(handleOrName: String): Awaitable[this.type, Null] = js.native
  def switchWindow(
    handleOrName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Convenience command that adds the specified hash (i.e. url fragment) to the current value of the `launch_url` as set in `nightwatch.json`.
    *
    * @example
    * this.demoTest = function () {
    *   browser.urlHash('#hashvalue');
    *   // or
    *   browser.urlHash('hashvalue');
    * };
    *
    * @see https://nightwatchjs.org/api/urlHash.html
    */
  def urlHash(hash: String): Awaitable[this.type, Null] = js.native
  def urlHash(
    hash: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Sets the locate strategy for selectors to `css selector`, therefore every following selector needs to be specified as css.
    *
    * @example
    * this.demoTest = function () {
    *   browser
    *     .useCss() // we're back to CSS now
    *     .setValue('input[type=text]', 'nightwatch');
    * };
    *
    * @see https://nightwatchjs.org/api/useCss.html
    */
  def useCss(): Awaitable[this.type, Unit] = js.native
  def useCss(callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): Awaitable[this.type, Unit] = js.native
  
  /**
    * Sets the locate strategy for selectors to xpath, therefore every following selector needs to be specified as xpath.
    *
    * @example
    * this.demoTest = function () {
    *   browser
    *     .useXpath() // every selector now must be xpath
    *     .click("//tr[@data-recordid]/span[text()='Search Text']");
    * };
    *
    * @see https://nightwatchjs.org/api/useXpath.html
    */
  def useXpath(): Awaitable[this.type, Unit] = js.native
  def useXpath(callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): Awaitable[this.type, Unit] = js.native
  
  /**
    * Waits for a condition to evaluate to a "truthy" value. The condition may be specified by any function which
    * returns the value to be evaluated or a Promise to wait for.
    *
    * An optional wait time can be specified, otherwise the global waitForConditionTimeout value will be used.
    *
    * @example
    * describe('waitUntil Example', function() {
    *   it('demo Test', function(browser) {
    *     browser
    *       .url('https://nightwatchjs.org)
    *       .waitUntil(async function() {
    *         const title = await this.execute(function() {
    *           return document.title;
    *         });
    *
    *         return title === 'Nightwatch.js';
    *       }, 1000);
    *   });
    * }
    *
    */
  def waitUntil(conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]]): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]],
    waitTimeMs: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]],
    waitTimeMs: Double,
    retryInterval: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]],
    waitTimeMs: Double,
    retryInterval: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]],
    waitTimeMs: Double,
    retryInterval: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]],
    waitTimeMs: Unit,
    retryInterval: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]],
    waitTimeMs: Unit,
    retryInterval: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]],
    waitTimeMs: Unit,
    retryInterval: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit]): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit],
    waitTimeMs: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit],
    waitTimeMs: Double,
    retryInterval: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit],
    waitTimeMs: Double,
    retryInterval: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit],
    waitTimeMs: Double,
    retryInterval: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit],
    waitTimeMs: Unit,
    retryInterval: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit],
    waitTimeMs: Unit,
    retryInterval: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit],
    waitTimeMs: Unit,
    retryInterval: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ],
    waitTimeMs: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ],
    waitTimeMs: Double,
    retryInterval: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ],
    waitTimeMs: Double,
    retryInterval: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ],
    waitTimeMs: Double,
    retryInterval: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ],
    waitTimeMs: Unit,
    retryInterval: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ],
    waitTimeMs: Unit,
    retryInterval: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ],
    waitTimeMs: Unit,
    retryInterval: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
}
