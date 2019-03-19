package typings
package pDashMemoizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Arguments extends js.Object {
  /**
  	 * [Memoize](https://en.wikipedia.org/wiki/Memoization) promise-returning & async functions.
  	 *
  	 * @param fn - Promise-returning or async function to be memoized.
  	 * @param memoizeOptions - See the [`mem` options](https://github.com/sindresorhus/mem#options).
  	 * @returns A memoized version of the `input` function.
  	 */
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType, CacheKeyType](fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType, CacheKeyType](
    fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]],
    memoizeOptions: memLib.memMod.Options[ArgumentsType, CacheKeyType, ReturnType]
  ): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = js.native
  /**
  	 * Clear all cached data of a memoized function.
  	 *
  	 * @param memoized - A function that was previously memoized. Will throw if passed a non-memoized function.
  	 */
  def clear(memoized: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
}

