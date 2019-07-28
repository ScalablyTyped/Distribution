package typings.node.workerUnderscoreThreadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("worker_threads", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val isMainThread: Boolean = js.native
  val parentPort: Null | MessagePort = js.native
  val threadId: Double = js.native
  val workerData: js.Any = js.native
}

