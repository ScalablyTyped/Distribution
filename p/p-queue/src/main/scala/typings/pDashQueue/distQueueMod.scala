package typings.pDashQueue

import typings.pDashQueue.distQueueMod.RunFunction
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-queue/dist/queue", JSImport.Namespace)
@js.native
object distQueueMod extends js.Object {
  @js.native
  trait Queue[Options] extends js.Object {
    var size: Double = js.native
    def dequeue(): js.UndefOr[RunFunction] = js.native
    def enqueue(run: RunFunction): Unit = js.native
    def enqueue(run: RunFunction, options: Partial[Options]): Unit = js.native
  }
  
  type RunFunction = js.Function0[js.Promise[js.Any]]
}

