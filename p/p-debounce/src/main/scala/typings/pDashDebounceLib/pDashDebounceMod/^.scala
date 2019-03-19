package typings
package pDashDebounceLib.pDashDebounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-debounce", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[ArgumentsType /* <: js.Array[_] */, ReturnType](
    fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType] | ReturnType],
    wait: scala.Double
  ): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = js.native
  def default[ArgumentsType /* <: js.Array[_] */, ReturnType](
    fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType] | ReturnType],
    wait: scala.Double,
    options: Options
  ): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = js.native
}

