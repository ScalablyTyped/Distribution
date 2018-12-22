package typings
package mobxLib.libApiFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/flow", JSImport.Namespace)
@js.native
object libApiFlowModMembers extends js.Object {
  def flow[T, U /* <: js.Array[_] */](generator: js.Function1[/* args */ U, FlowIterator[_]]): js.Function1[/* args */ U, CancellablePromise[T]] = js.native
}

