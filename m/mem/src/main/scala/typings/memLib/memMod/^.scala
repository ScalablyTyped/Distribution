package typings
package memLib.memMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mem", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: memLib.Anon_Arguments = js.native
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
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType /* <: js.Any */, CacheKeyType /* <: js.Any */](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType]): js.Function1[/* arguments */ ArgumentsType, ReturnType] = js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType /* <: js.Any */, CacheKeyType /* <: js.Any */](
    fn: js.Function1[/* arguments */ ArgumentsType, ReturnType],
    options: Options[ArgumentsType, CacheKeyType, ReturnType]
  ): js.Function1[/* arguments */ ArgumentsType, ReturnType] = js.native
  /**
  	Clear all cached data of a memoized function.
  	@param fn - Memoized function.
  	*/
  def clear[ArgumentsType /* <: js.Array[_] */, ReturnType /* <: js.Any */](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType]): scala.Unit = js.native
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
  // TODO: Remove this for the next major release
  def default[ArgumentsType /* <: js.Array[_] */, ReturnType /* <: js.Any */, CacheKeyType /* <: js.Any */](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType]): js.Function1[/* arguments */ ArgumentsType, ReturnType] = js.native
  def default[ArgumentsType /* <: js.Array[_] */, ReturnType /* <: js.Any */, CacheKeyType /* <: js.Any */](
    fn: js.Function1[/* arguments */ ArgumentsType, ReturnType],
    options: Options[ArgumentsType, CacheKeyType, ReturnType]
  ): js.Function1[/* arguments */ ArgumentsType, ReturnType] = js.native
}

