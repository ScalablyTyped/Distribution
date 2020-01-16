package typings.mobxDashReactDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite/dist/optimizeScheduler", JSImport.Namespace)
@js.native
object distOptimizeSchedulerMod extends js.Object {
  @js.native
  trait IBatchedUpdates extends js.Object {
    def batchedUpdates(callback: js.Function0[_]): Unit = js.native
    def batchedUpdates[A](callback: js.Function1[/* a */ A, _], a: A): Unit = js.native
    def batchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, _], a: A, b: B): Unit = js.native
  }
  
  def deoptimizeScheduler(): Unit = js.native
  def optimizeScheduler(reactionScheduler: IBatchedUpdates): Unit = js.native
}

