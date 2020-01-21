package typings.mem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mem", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	[Memoize](https://en.wikipedia.org/wiki/Memoization) functions - An optimization used to speed up consecutive function calls by caching the result of calls with identical input.
  	@param fn - Function to be memoized.
  	@example
  	```
  	import mem = require('mem');
  	let i = 0;
  	const counter = () => ++i;
  	const memoized = mem(counter);
  	memoized('foo');
  	//=> 1
  	// Cached as it's the same arguments
  	memoized('foo');
  	//=> 1
  	// Not cached anymore as the arguments changed
  	memoized('bar');
  	//=> 2
  	memoized('bar');
  	//=> 2
  	```
  	*/
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType, CacheKeyType](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType]): js.Function1[/* arguments */ ArgumentsType, ReturnType] = js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType, CacheKeyType](
    fn: js.Function1[/* arguments */ ArgumentsType, ReturnType],
    options: Options[ArgumentsType, CacheKeyType, ReturnType]
  ): js.Function1[/* arguments */ ArgumentsType, ReturnType] = js.native
  /**
  	Clear all cached data of a memoized function.
  	@param fn - Memoized function.
  	*/
  def clear[ArgumentsType /* <: js.Array[_] */, ReturnType](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType]): Unit = js.native
}

