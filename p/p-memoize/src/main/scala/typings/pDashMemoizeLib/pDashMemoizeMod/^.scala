package typings
package pDashMemoizeLib.pDashMemoizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-memoize", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: pDashMemoizeLib.Anon_Arguments = js.native
  /**
  	[Memoize](https://en.wikipedia.org/wiki/Memoization) promise-returning & async functions.
  	@param fn - Promise-returning or async function to be memoized.
  	@param memoizeOptions - See the [`mem` options](https://github.com/sindresorhus/mem#options).
  	@returns A memoized version of the `input` function.
  	@example
  	```
  	import pMemoize = require('p-memoize');
  	import got = require('got');
  	const memGot = pMemoize(got, {maxAge: 1000});
  	(async () => {
  		memGot('sindresorhus.com');
  		// This call is cached
  		memGot('sindresorhus.com');
  		setTimeout(() => {
  			// This call is not cached as the cache has expired
  			memGot('sindresorhus.com');
  		}, 2000);
  	})();
  	```
  	*/
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType, CacheKeyType](fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType, CacheKeyType](
    fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]],
    memoizeOptions: Options[ArgumentsType, CacheKeyType, ReturnType]
  ): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = js.native
  /**
  	Clear all cached data of a memoized function.
  	@param memoized - A function that was previously memoized. Will throw if passed a non-memoized function.
  	*/
  def clear(memoized: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  /**
  	[Memoize](https://en.wikipedia.org/wiki/Memoization) promise-returning & async functions.
  	@param fn - Promise-returning or async function to be memoized.
  	@param memoizeOptions - See the [`mem` options](https://github.com/sindresorhus/mem#options).
  	@returns A memoized version of the `input` function.
  	@example
  	```
  	import pMemoize = require('p-memoize');
  	import got = require('got');
  	const memGot = pMemoize(got, {maxAge: 1000});
  	(async () => {
  		memGot('sindresorhus.com');
  		// This call is cached
  		memGot('sindresorhus.com');
  		setTimeout(() => {
  			// This call is not cached as the cache has expired
  			memGot('sindresorhus.com');
  		}, 2000);
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release
  def default[ArgumentsType /* <: js.Array[_] */, ReturnType, CacheKeyType](fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = js.native
  def default[ArgumentsType /* <: js.Array[_] */, ReturnType, CacheKeyType](
    fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]],
    memoizeOptions: Options[ArgumentsType, CacheKeyType, ReturnType]
  ): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = js.native
}

