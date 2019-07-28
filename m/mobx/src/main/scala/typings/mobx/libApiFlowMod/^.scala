package typings.mobx.libApiFlowMod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/flow", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def flow[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, IterableIterator[R]]): js.Function1[/* args */ Args, CancellablePromise[FlowReturnType[R]]] = js.native
}

