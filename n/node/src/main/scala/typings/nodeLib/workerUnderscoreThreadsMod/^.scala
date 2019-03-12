package typings
package nodeLib.workerUnderscoreThreadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("worker_threads", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val isMainThread: scala.Boolean = js.native
  val parentPort: scala.Null | MessagePort = js.native
  val threadId: scala.Double = js.native
  val workerData: js.Any = js.native
}

