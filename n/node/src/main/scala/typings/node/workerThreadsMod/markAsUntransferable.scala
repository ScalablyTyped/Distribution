package typings.node.workerThreadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("worker_threads", "markAsUntransferable")
@js.native
object markAsUntransferable extends js.Object {
  
  /**
    * Mark an object as not transferable.
    * If `object` occurs in the transfer list of a `port.postMessage()` call, it will be ignored.
    *
    * In particular, this makes sense for objects that can be cloned, rather than transferred,
    * and which are used by other objects on the sending side. For example, Node.js marks
    * the `ArrayBuffer`s it uses for its Buffer pool with this.
    *
    * This operation cannot be undone.
    */
  def apply(`object`: js.Object): Unit = js.native
}
