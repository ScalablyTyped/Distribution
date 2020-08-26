package typings.nightwatch.mod

import typings.nightwatch.anon.Height
import typings.nightwatch.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebDriverProtocolCommandContexts extends js.Object {
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
  def frame(): this.type = js.native
  def frame(
    frameId: js.UndefOr[scala.Nothing],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  def frame(frameId: String): this.type = js.native
  def frame(
    frameId: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  def frame(
    frameId: Null,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
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
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Change focus to another window or close the current window. Shouldn't normally be used directly, instead `.switchWindow()` and `.closeWindow()` should be used.
    */
  def window(method: String): this.type = js.native
  def window(
    method: String,
    handleOrName: js.UndefOr[scala.Nothing],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  def window(method: String, handleOrName: String): this.type = js.native
  def window(
    method: String,
    handleOrName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
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
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
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
      /* result */ NightwatchCallbackResult[js.Array[String]], 
      Unit
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
  def windowMaximize(handleOrName: String): this.type = js.native
  def windowMaximize(
    handleOrName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
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
  def windowPosition(windowHandle: String): this.type = js.native
  def windowPosition(
    windowHandle: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[X], Unit]
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
  def windowPosition(windowHandle: String, offsetX: Double, offsetY: Double): this.type = js.native
  def windowPosition(
    windowHandle: String,
    offsetX: Double,
    offsetY: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
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
  def windowSize(windowHandle: String): this.type = js.native
  def windowSize(
    windowHandle: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Height], Unit]
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
  def windowSize(windowHandle: String, width: Double, height: Double): this.type = js.native
  def windowSize(
    windowHandle: String,
    width: Double,
    height: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
}

