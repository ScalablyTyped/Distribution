package typings.pDashTap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-tap", JSImport.Namespace)
@js.native
object pDashTapMod extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: Anon_Catch = js.native
  /**
  	Tap into a promise chain without affecting its value or state. Use this in a `.then()` method.
  	@param tapHandler - Any return value is ignored. Exceptions thrown in `tapHandler` are relayed back to the original promise chain. If `tapHandler` returns a `Promise`, it will be awaited before passing through the original value.
  	@returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
  	@example
  	```
  	import pTap = require('p-tap');
  	Promise.resolve('unicorn')
  		.then(pTap(console.log)) // Logs `unicorn`
  		.then(value => {
  			// `value` is still `unicorn`
  		});
  	getUser()
  		.then(pTap(user => recordStatsAsync(user))) // Stats are saved about `user` async before the chain continues
  		.then(user => {
  			// `user` is the user from getUser(), not recordStatsAsync()
  		});
  	```
  	*/
  def apply[ValueType](tapHandler: js.Function1[/* value */ ValueType, _]): js.Function1[/* value */ ValueType, js.Promise[ValueType]] = js.native
  /**
  	Tap into a promise chain without affecting its value or state. Use this in a `.catch()` method.
  	@param tapHandler - Any return value is ignored. Exceptions thrown in `tapHandler` are relayed back to the original promise chain. If `tapHandler` returns a `Promise`, it will be awaited before passing through the original value.
  	@returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
  	@example
  	```
  	import pTap = require('p-tap');
  	Promise.resolve(() => doSomething())
  		.catch(pTap.catch(console.error)) // prints any errors
  		.then(handleSuccess)
  		.catch(handleError);
  	```
  	*/
  def `catch`[ErrorType](tapHandler: js.Function1[/* error */ ErrorType, _]): js.Function1[/* error */ ErrorType, js.Promise[scala.Nothing]] = js.native
  /**
  	Tap into a promise chain without affecting its value or state. Use this in a `.then()` method.
  	@param tapHandler - Any return value is ignored. Exceptions thrown in `tapHandler` are relayed back to the original promise chain. If `tapHandler` returns a `Promise`, it will be awaited before passing through the original value.
  	@returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
  	@example
  	```
  	import pTap = require('p-tap');
  	Promise.resolve('unicorn')
  		.then(pTap(console.log)) // Logs `unicorn`
  		.then(value => {
  			// `value` is still `unicorn`
  		});
  	getUser()
  		.then(pTap(user => recordStatsAsync(user))) // Stats are saved about `user` async before the chain continues
  		.then(user => {
  			// `user` is the user from getUser(), not recordStatsAsync()
  		});
  	```
  	*/
  // TODO: Remove this for the next major release
  def default[ValueType](tapHandler: js.Function1[/* value */ ValueType, _]): js.Function1[/* value */ ValueType, js.Promise[ValueType]] = js.native
}

