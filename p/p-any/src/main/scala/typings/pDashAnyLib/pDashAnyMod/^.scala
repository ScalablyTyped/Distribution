package typings
package pDashAnyLib.pDashAnyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-any", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def AggregateError[T](
    values: stdLib.Iterable[pDashSomeLib.pDashSomeMod.Value[T]],
    options: pDashSomeLib.pDashSomeMod.Options[T]
  ): pDashSomeLib.pDashSomeMod.CancelablePromise[js.Array[T]] = js.native
  def default[ValueType](input: stdLib.Iterable[Value[ValueType]]): CancelablePromise[ValueType] = js.native
  def default[ValueType](input: stdLib.Iterable[Value[ValueType]], options: Options[ValueType]): CancelablePromise[ValueType] = js.native
}

