package typings.nightwatch.mod

import typings.nightwatch.anon.Height
import typings.nightwatch.nightwatchStrings.DELETE
import typings.nightwatch.nightwatchStrings.POST
import typings.nightwatch.nightwatchStrings.delete_
import typings.nightwatch.nightwatchStrings.post_
import typings.seleniumWebdriver.mod.WebElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolCommandContexts extends StObject {
  
  /**
    * Change focus to another frame on the page. If the frame id is missing or null, the server should switch to the page's default content.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.frame('<ID>', function(result) {
    *      console.log(result);
    *    });
    *  }
    *
    * @see https://nightwatchjs.org/api/frame.html
    */
  def frame(): Awaitable[this.type, Null] = js.native
  def frame(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def frame(frameId: String): Awaitable[this.type, Null] = js.native
  def frame(
    frameId: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def frame(frameId: Double): Awaitable[this.type, Null] = js.native
  def frame(
    frameId: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def frame(
    frameId: Null,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def frame(frameId: WebElement): Awaitable[this.type, Null] = js.native
  def frame(
    frameId: WebElement,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Change focus to the parent context. If the current context is the top level browsing context, the context remains unchanged.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.frameParent(function(result) {
    *      console.log(result);
    *    });
    *  }
    *
    * @since v0.4.8
    *
    * @see https://nightwatchjs.org/api/frameParent.html
    */
  def frameParent(): Awaitable[this.type, Null] = js.native
  def frameParent(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Change focus to another window or close the current window.
    * Shouldn't normally be used directly, instead `.switchWindow()` and `.closeWindow()` should be used.
    *
    * @see https://nightwatchjs.org/api/window.html
    *
    * @deprecated Use `.switchWindow()` and `.closeWindow()` instead.
    */
  def window(method: post_ | delete_ | POST | DELETE): Awaitable[this.type, Null] = js.native
  def window(method: post_ | delete_ | POST | DELETE, handleOrName: String): Awaitable[this.type, Null] = js.native
  def window(
    method: post_ | delete_ | POST | DELETE,
    handleOrName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def window(
    method: post_ | delete_ | POST | DELETE,
    handleOrName: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Retrieve the current window handle.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.windowHandle(function(result) {
    *      console.log(result.value);
    *    });
    *  }
    *
    * @see https://nightwatchjs.org/api/windowHandle.html
    */
  def windowHandle(): Awaitable[this.type, String] = js.native
  def windowHandle(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  
  /**
    * Retrieve the list of all window handles available to the session.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.windowHandles(function(result) {
    *      // An array of window handles.
    *      console.log(result.value);
    *    });
    *  }
    *
    * @see https://nightwatchjs.org/api/windowHandles.html
    */
  def windowHandles(): Awaitable[this.type, js.Array[String]] = js.native
  def windowHandles(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[String]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[String]] = js.native
  
  /**
    * Increases the window to the maximum available size without going full-screen.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.windowMaximize('current', function(result) {
    *      console.log(result);
    *    });
    *  }
    *
    * @see https://nightwatchjs.org/api/windowMaximize.html
    */
  def windowMaximize(): Awaitable[this.type, Null] = js.native
  def windowMaximize(handleOrName: String): Awaitable[this.type, Null] = js.native
  def windowMaximize(
    handleOrName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def windowMaximize(
    handleOrName: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  def windowPosition(
    windowHandle: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[WindowPosition], 
      Unit
    ]
  ): Awaitable[this.type, WindowPosition] = js.native
  /**
    * Change or get the position of the specified window. If the second argument is a function it will be used as a callback and
    * the call will perform a get request to retrieve the existing window position.
    *
    * @example
    *  this.demoTest = function (browser) {
    *
    *    // Change the position of the specified window.
    *    // If the :windowHandle URL parameter is "current", the currently active window will be moved.
    *    browser.windowPosition('current', 0, 0, function(result) {
    *      console.log(result);
    *    });
    *
    *    // Get the position of the specified window.
    *    // If the :windowHandle URL parameter is "current", the position of the currently active window will be returned.
    *    browser.windowPosition('current', function(result) {
    *      console.log(result.value);
    *    });
    *  }
    *
    * @see https://nightwatchjs.org/api/windowPosition.html
    */
  def windowPosition(windowHandle: String, offsetX: Double, offsetY: Double): Awaitable[this.type, Null] = js.native
  def windowPosition(
    windowHandle: String,
    offsetX: Double,
    offsetY: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  def windowRect(): Awaitable[this.type, WindowSizeAndPosition] = js.native
  def windowRect(
    options: Null,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[WindowSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, WindowSizeAndPosition] = js.native
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
    *   'demo test .windowRect()': function(browser) {
    *
    *      // Change the screenX and screenY attributes of the window rect.
    *      browser.windowRect({x: 500, y: 500});
    *
    *      // Change the width and height attributes of the window rect.
    *      browser.windowRect({width: 600, height: 300});
    *
    *      // Retrieve the attributes
    *      browser.windowRect(function(result) {
    *        console.log(result.value);
    *      });
    *   },
    *
    *   'windowRect ES6 demo test': async function(browser) {
    *      const resultValue = await browser.windowRect();
    *      console.log('result value', resultValue);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/windowRect.html
    */
  def windowRect(options: Height): Awaitable[this.type, Null] = js.native
  def windowRect(
    options: Height,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  def windowSize(
    windowHandle: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[WindowSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, WindowSizeAndPosition] = js.native
  /**
    * Change or get the size of the specified window. If the second argument is a function it will be used as a callback and the call will perform a get request to retrieve the existing window size.
    *
    * @example
    *  this.demoTest = function (browser) {
    *
    *    // Return the size of the specified window. If the :windowHandle URL parameter is "current", the size of the currently active window will be returned.
    *    browser.windowSize('current', function(result) {
    *      console.log(result.value);
    *    });
    *
    *    // Change the size of the specified window.
    *    // If the :windowHandle URL parameter is "current", the currently active window will be resized.
    *    browser.windowSize('current', 300, 300, function(result) {
    *      console.log(result.value);
    *    });
    *  }
    *
    * @see https://nightwatchjs.org/api/windowSize.html
    */
  def windowSize(windowHandle: String, width: Double, height: Double): Awaitable[this.type, Null] = js.native
  def windowSize(
    windowHandle: String,
    width: Double,
    height: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
}
