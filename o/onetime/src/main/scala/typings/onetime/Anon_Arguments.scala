package typings.onetime

import typings.onetime.onetimeMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Arguments extends js.Object {
  /**
  	Ensure a function is only called once. When called multiple times it will return the return value from the first call.
  	@param fn - Function that should only be called once.
  	@returns A function that only calls `fn` once.
  	*/
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType]): js.Function1[/* arguments */ ArgumentsType, ReturnType] = js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType], options: Options): js.Function1[/* arguments */ ArgumentsType, ReturnType] = js.native
  /**
  	Get the number of times `fn` has been called.
  	@param fn - Function to get call count from.
  	@returns A number representing how many times `fn` has been called.
  	@example
  	```
  	import onetime = require('onetime');
  	const foo = onetime(() => {});
  	foo();
  	foo();
  	foo();
  	console.log(onetime.callCount(foo));
  	//=> 3
  	```
  	*/
  def callCount(fn: js.Function1[/* repeated */ js.Any, _]): Double = js.native
}

