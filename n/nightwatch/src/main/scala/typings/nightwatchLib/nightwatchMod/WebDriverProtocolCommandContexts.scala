package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebDriverProtocolCommandContexts extends js.Object {
  def frame(): this.type = js.native
  def frame(
    frameId: js.UndefOr[scala.Nothing],
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Change focus to another frame on the page. If the frame id is missing or null, the server should switch to the page's default content.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.frame('<ID>', function(result) {
    *      console.log(result);
    *    });
    * }
    */
  def frame(frameId: java.lang.String): this.type = js.native
  def frame(
    frameId: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  def frame(
    frameId: scala.Null,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Change focus to the parent context. If the current context is the top level browsing context, the context remains unchanged.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.frameParent(function(result) {
    *      console.log(result);
    *    });
    * }
    *
    * @since v0.4.8
    */
  def frameParent(): this.type = js.native
  def frameParent(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Change focus to another window or close the current window. Shouldn't normally be used directly, instead `.switchWindow()` and `.closeWindow()` should be used.
    */
  def window(method: java.lang.String): this.type = js.native
  def window(method: java.lang.String, handleOrName: java.lang.String): this.type = js.native
  def window(
    method: java.lang.String,
    handleOrName: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Retrieve the current window handle.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.windowHandle(function(result) {
    *      console.log(result.value);
    *    });
    * }
    */
  def windowHandle(): this.type = js.native
  def windowHandle(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[java.lang.String], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Retrieve the list of all window handles available to the session.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.windowHandles(function(result) {
    *      // An array of window handles.
    *      console.log(result.value);
    *    });
    * }
    */
  def windowHandles(): this.type = js.native
  def windowHandles(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[java.lang.String]], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Increases the window to the maximum available size without going full-screen.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.windowMaximize('current', function(result) {
    *      console.log(result);
    *    });
    * }
    */
  def windowMaximize(handleOrName: java.lang.String): this.type = js.native
  def windowMaximize(
    handleOrName: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
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
    * }
    */
  def windowPosition(windowHandle: java.lang.String): this.type = js.native
  def windowPosition(
    windowHandle: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[nightwatchLib.Anon_X], 
      scala.Unit
    ]
  ): this.type = js.native
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
    * }
    */
  def windowPosition(windowHandle: java.lang.String, offsetX: scala.Double, offsetY: scala.Double): this.type = js.native
  def windowPosition(
    windowHandle: java.lang.String,
    offsetX: scala.Double,
    offsetY: scala.Double,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
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
    * }
    */
  def windowSize(windowHandle: java.lang.String): this.type = js.native
  def windowSize(
    windowHandle: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[nightwatchLib.Anon_Height], 
      scala.Unit
    ]
  ): this.type = js.native
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
    * }
    */
  def windowSize(windowHandle: java.lang.String, width: scala.Double, height: scala.Double): this.type = js.native
  def windowSize(
    windowHandle: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
}

