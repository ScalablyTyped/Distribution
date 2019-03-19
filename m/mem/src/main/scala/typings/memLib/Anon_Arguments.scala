package typings
package memLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Arguments extends js.Object {
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType /* <: js.Any */, CacheKeyType /* <: js.Any */](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType]): js.Function1[/* arguments */ ArgumentsType, ReturnType] = js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType /* <: js.Any */, CacheKeyType /* <: js.Any */](
    fn: js.Function1[/* arguments */ ArgumentsType, ReturnType],
    options: memLib.memMod.Options[ArgumentsType, CacheKeyType, ReturnType]
  ): js.Function1[/* arguments */ ArgumentsType, ReturnType] = js.native
  /**
  	 * Clear all cached data of a memoized function.
  	 *
  	 * @param fn - Memoized function.
  	 */
  def clear[ArgumentsType /* <: js.Array[_] */, ReturnType /* <: js.Any */](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType]): scala.Unit = js.native
}

