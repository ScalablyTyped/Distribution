package typings.node.clusterMod

import typings.node.netMod.Server
import typings.node.netMod.Socket
import typings.node.nodeStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "emit")
@js.native
object emit_message extends js.Object {
  def apply(event: message, worker: Worker_, message: js.Any, handle: Server): Boolean = js.native
  def apply(event: message, worker: Worker_, message: js.Any, handle: Socket): Boolean = js.native
}

