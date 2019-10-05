package typings.mobx.libApiFlowMod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/flow", "flow")
@js.native
object flow extends js.Object {
  def apply[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, IterableIterator[R]]): js.Function1[/* args */ Args, CancellablePromise[FlowReturnType[R]]] = js.native
}

