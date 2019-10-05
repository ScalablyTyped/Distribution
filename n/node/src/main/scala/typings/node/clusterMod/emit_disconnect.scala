package typings.node.clusterMod

import typings.node.nodeStrings.disconnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "emit")
@js.native
object emit_disconnect extends js.Object {
  def apply(event: disconnect, worker: Worker): Boolean = js.native
}

