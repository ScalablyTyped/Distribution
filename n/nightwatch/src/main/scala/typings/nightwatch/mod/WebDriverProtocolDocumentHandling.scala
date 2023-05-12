package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolDocumentHandling extends StObject {
  
  def execute[ReturnValue](body: String): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def execute[ReturnValue](
    body: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[VoidToNull[ReturnValue]], 
      Unit
    ]
  ): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  /**
    * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame. The executed script is assumed to be synchronous.
    * The script argument defines the script to execute in the form of a function body. The value returned by that function will be returned to the client.
    *
    * The function will be invoked with the provided args array and the values may be accessed via the arguments object in the order specified.
    *
    * Under the hood, if the `body` param is a function it is converted to a string with `<function>.toString()`. Any references to your current scope are ignored.
    *
    * To ensure cross-browser compatibility, the specified function should not be in ES6 format (i.e. `() => {}`).
    * If the execution of the function fails, the first argument of the callback contains error information.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.execute(function(imageData: string) {
    *      // resize operation
    *      return true;
    *    }, [imageData], function(result) {
    *      // result.value === true
    *    });
    * }
    *
    * @see https://nightwatchjs.org/api/execute.html#apimethod-container
    *
    * @alias executeScript
    */
  def execute[ReturnValue](body: ExecuteScriptFunction[js.Array[Any], ReturnValue]): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def execute[ReturnValue](
    body: ExecuteScriptFunction[js.Array[Any], ReturnValue],
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[VoidToNull[ReturnValue]], 
      Unit
    ]
  ): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def execute[ArgType /* <: js.Array[Any] */, ReturnValue](body: String, args: ArgType): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def execute[ArgType /* <: js.Array[Any] */, ReturnValue](
    body: String,
    args: ArgType,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[VoidToNull[ReturnValue]], 
      Unit
    ]
  ): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def execute[ArgType /* <: js.Array[Any] */, ReturnValue](body: ExecuteScriptFunction[ArgType, ReturnValue], args: ArgType): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def execute[ArgType /* <: js.Array[Any] */, ReturnValue](
    body: ExecuteScriptFunction[ArgType, ReturnValue],
    args: ArgType,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[VoidToNull[ReturnValue]], 
      Unit
    ]
  ): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  
  def executeAsync[ReturnValue](script: String): Awaitable[this.type, ReturnValue] = js.native
  def executeAsync[ReturnValue](
    script: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ReturnValue], Unit]
  ): Awaitable[this.type, ReturnValue] = js.native
  /**
    * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame. The executed script is assumed to be asynchronous.
    *
    * The function to be injected receives the `done` callback as argument which needs to be called when the asynchronous operation finishes.
    * The value passed to the `done` callback is returned to the client.
    * Additional arguments for the injected function may be passed as a non-empty array which will be passed before the `done` callback.
    *
    * Asynchronous script commands may not span page loads. If an unload event is fired while waiting for the script result, an error will be returned.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.executeAsync(function(done: (result: true) => void) {
    *      setTimeout(function() {
    *        done(true);
    *      }, 500);
    *    }, function(result) {
    *      // result.value === true
    *    });
    *
    *    browser.executeAsync(function(arg1: string, arg2: number, done: (result: string) => void) {
    *      setTimeout(function() {
    *        done(arg1);
    *      }, 500);
    *    }, [arg1, arg2], function(result) {
    *      // result.value === arg1
    *    });
    * }
    *
    * @see https://nightwatchjs.org/api/executeAsyncScript.html
    *
    * @alias executeAsyncScript
    */
  def executeAsync[ReturnValue](script: ExecuteAsyncScriptFunction[js.Array[Any], ReturnValue]): Awaitable[this.type, ReturnValue] = js.native
  def executeAsync[ReturnValue](
    script: ExecuteAsyncScriptFunction[js.Array[Any], ReturnValue],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ReturnValue], Unit]
  ): Awaitable[this.type, ReturnValue] = js.native
  def executeAsync[ArgType /* <: js.Array[Any] */, ReturnValue](script: String, args: ArgType): Awaitable[this.type, ReturnValue] = js.native
  def executeAsync[ArgType /* <: js.Array[Any] */, ReturnValue](
    script: String,
    args: ArgType,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ReturnValue], Unit]
  ): Awaitable[this.type, ReturnValue] = js.native
  def executeAsync[ArgType /* <: js.Array[Any] */, ReturnValue](script: ExecuteAsyncScriptFunction[ArgType, ReturnValue], args: ArgType): Awaitable[this.type, ReturnValue] = js.native
  def executeAsync[ArgType /* <: js.Array[Any] */, ReturnValue](
    script: ExecuteAsyncScriptFunction[ArgType, ReturnValue],
    args: ArgType,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ReturnValue], Unit]
  ): Awaitable[this.type, ReturnValue] = js.native
  
  def executeAsyncScript[ReturnValue](script: String): Awaitable[this.type, ReturnValue] = js.native
  def executeAsyncScript[ReturnValue](
    script: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ReturnValue], Unit]
  ): Awaitable[this.type, ReturnValue] = js.native
  /**
    *
    * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame.
    * The executed script is assumed to be asynchronous.
    *
    * The function to be injected receives the `done` callback as argument which needs to be called
    * when the asynchronous operation finishes. The value passed to the `done` callback is returned to the client.
    * Additional arguments for the injected function may be passed as a non-empty array which
    * will be passed before the `done` callback.
    *
    * Asynchronous script commands may not span page loads. If an unload event is fired
    *  while waiting for the script result, an error will be returned.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.executeAsyncScript(function(done: (result: true) => void) {
    *      setTimeout(function() {
    *        done(true);
    *      }, 500);
    *    }, function(result) {
    *      // result.value === true
    *    });
    *
    *    browser.executeAsyncScript(function(arg1: string, arg2: number, done: (result: string) => void) {
    *      setTimeout(function() {
    *        done(arg1);
    *      }, 500);
    *    }, [arg1, arg2], function(result) {
    *      // result.value === arg1
    *    });
    * }
    *
    * @see https://nightwatchjs.org/api/executeAsyncScript.html
    *
    * @alias executeAsync
    */
  def executeAsyncScript[ReturnValue](script: ExecuteAsyncScriptFunction[js.Array[Any], ReturnValue]): Awaitable[this.type, ReturnValue] = js.native
  def executeAsyncScript[ReturnValue](
    script: ExecuteAsyncScriptFunction[js.Array[Any], ReturnValue],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ReturnValue], Unit]
  ): Awaitable[this.type, ReturnValue] = js.native
  def executeAsyncScript[ArgType /* <: js.Array[Any] */, ReturnValue](script: String, args: ArgType): Awaitable[this.type, ReturnValue] = js.native
  def executeAsyncScript[ArgType /* <: js.Array[Any] */, ReturnValue](
    script: String,
    args: ArgType,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ReturnValue], Unit]
  ): Awaitable[this.type, ReturnValue] = js.native
  def executeAsyncScript[ArgType /* <: js.Array[Any] */, ReturnValue](script: ExecuteAsyncScriptFunction[ArgType, ReturnValue], args: ArgType): Awaitable[this.type, ReturnValue] = js.native
  def executeAsyncScript[ArgType /* <: js.Array[Any] */, ReturnValue](
    script: ExecuteAsyncScriptFunction[ArgType, ReturnValue],
    args: ArgType,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ReturnValue], Unit]
  ): Awaitable[this.type, ReturnValue] = js.native
  
  def executeScript[ReturnValue](body: String): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def executeScript[ReturnValue](
    body: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[VoidToNull[ReturnValue]], 
      Unit
    ]
  ): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  /**
    * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame. The executed script is assumed to be synchronous.
    * The script argument defines the script to execute in the form of a function body. The value returned by that function will be returned to the client.
    *
    * The function will be invoked with the provided args array and the values may be accessed via the arguments object in the order specified.
    *
    * Under the hood, if the `body` param is a function it is converted to a string with `<function>.toString()`. Any references to your current scope are ignored.
    *
    * To ensure cross-browser compatibility, the specified function should not be in ES6 format (i.e. `() => {}`).
    * If the execution of the function fails, the first argument of the callback contains error information.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.executeScript(function(imageData: string) {
    *      // resize operation
    *      return true;
    *    }, [imageData], function(result) {
    *      // result.value === true
    *    });
    * }
    *
    * @see https://nightwatchjs.org/api/execute.html#apimethod-container
    *
    * @alias execute
    */
  def executeScript[ReturnValue](body: ExecuteScriptFunction[js.Array[Any], ReturnValue]): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def executeScript[ReturnValue](
    body: ExecuteScriptFunction[js.Array[Any], ReturnValue],
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[VoidToNull[ReturnValue]], 
      Unit
    ]
  ): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def executeScript[ArgType /* <: js.Array[Any] */, ReturnValue](body: String, args: ArgType): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def executeScript[ArgType /* <: js.Array[Any] */, ReturnValue](
    body: String,
    args: ArgType,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[VoidToNull[ReturnValue]], 
      Unit
    ]
  ): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def executeScript[ArgType /* <: js.Array[Any] */, ReturnValue](body: ExecuteScriptFunction[ArgType, ReturnValue], args: ArgType): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def executeScript[ArgType /* <: js.Array[Any] */, ReturnValue](
    body: ExecuteScriptFunction[ArgType, ReturnValue],
    args: ArgType,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[VoidToNull[ReturnValue]], 
      Unit
    ]
  ): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  
  /**
    * Returns a string serialisation of the DOM of the current page.
    *
    * @example
    * browser.source();
    *
    * @see https://nightwatchjs.org/api/source.html#apimethod-container
    */
  def source(): Awaitable[this.type, String] = js.native
  def source(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
}
