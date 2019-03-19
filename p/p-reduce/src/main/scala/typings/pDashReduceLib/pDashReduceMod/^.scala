package typings
package pDashReduceLib.pDashReduceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-reduce", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[ValueType, ReducedValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    reducer: ReducerFunction[ValueType, ReducedValueType]
  ): js.Promise[ReducedValueType] = js.native
  def default[ValueType, ReducedValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    reducer: ReducerFunction[ValueType, ReducedValueType],
    initialValue: ReducedValueType
  ): js.Promise[ReducedValueType] = js.native
}

