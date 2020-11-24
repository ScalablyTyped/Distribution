package typings.pTimeout.mod

import org.scalablytyped.runtime.Instantiable1
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p-timeout", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	Timeout a promise after a specified amount of time.
  	If you pass in a cancelable promise, specifically a promise with a `.cancel()` method, that method will be called when the `pTimeout` promise times out.
  	@param input - Promise to decorate.
  	@param milliseconds - Milliseconds before timing out.
  	@param message - Specify a custom error message or error. If you do a custom error, it's recommended to sub-class `pTimeout.TimeoutError`. Default: `'Promise timed out after 50 milliseconds'`.
  	@returns A decorated `input` that times out after `milliseconds` time.
  	@example
  	```
  	import delay = require('delay');
  	import pTimeout = require('p-timeout');
  	const delayedPromise = delay(200);
  	pTimeout(delayedPromise, 50).then(() => 'foo');
  	//=> [TimeoutError: Promise timed out after 50 milliseconds]
  	```
  	*/
  def apply[ValueType](input: js.Thenable[ValueType], milliseconds: Double): js.Promise[ValueType] = js.native
  def apply[ValueType](input: js.Thenable[ValueType], milliseconds: Double, message: String): js.Promise[ValueType] = js.native
  def apply[ValueType](input: js.Thenable[ValueType], milliseconds: Double, message: Error): js.Promise[ValueType] = js.native
  /**
  	Timeout a promise after a specified amount of time.
  	If you pass in a cancelable promise, specifically a promise with a `.cancel()` method, that method will be called when the `pTimeout` promise times out.
  	@param input - Promise to decorate.
  	@param milliseconds - Milliseconds before timing out. Passing `Infinity` will cause it to never time out.
  	@param fallback - Do something other than rejecting with an error on timeout. You could for example retry.
  	@returns A decorated `input` that times out after `milliseconds` time.
  	@example
  	```
  	import delay = require('delay');
  	import pTimeout = require('p-timeout');
  	const delayedPromise = () => delay(200);
  	pTimeout(delayedPromise(), 50, () => {
  		return pTimeout(delayedPromise(), 300);
  	});
  	```
  	*/
  def apply[ValueType, ReturnType](
    input: js.Thenable[ValueType],
    milliseconds: Double,
    fallback: js.Function0[ReturnType | js.Promise[ReturnType]]
  ): js.Promise[ValueType | ReturnType] = js.native
  
  var TimeoutError: Instantiable1[/* message */ js.UndefOr[String], TimeoutErrorClass] = js.native
  
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pTimeout */ js.Any = js.native
}
