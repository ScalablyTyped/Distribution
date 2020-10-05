package typings.mobxReactLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-react-lite/dist/observerBatching", JSImport.Namespace)
@js.native
object observerBatchingMod extends js.Object {
  @js.native
  trait IBatchedUpdates extends js.Object {
    def batchedUpdates(callback: js.Function0[_]): Unit = js.native
    def batchedUpdates[A](callback: js.Function1[/* a */ A, _], a: A): Unit = js.native
    def batchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, _], a: A, b: B): Unit = js.native
  }
  
  def isObserverBatched(): js.Any = js.native
  def observerBatching(): Unit = js.native
  def observerBatching(reactionScheduler: IBatchedUpdates): Unit = js.native
  def observerBatchingOptOut(): Unit = js.native
}

