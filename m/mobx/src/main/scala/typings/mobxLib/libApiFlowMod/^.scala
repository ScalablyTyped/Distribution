package typings
package mobxLib.libApiFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/flow", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def flow[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, stdLib.IterableIterator[R]]): js.Function1[/* args */ Args, CancellablePromise[FlowReturnType[R]]] = js.native
}

