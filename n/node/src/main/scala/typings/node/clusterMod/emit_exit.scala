package typings.node.clusterMod

import typings.node.nodeStrings.exit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "emit")
@js.native
object emit_exit extends js.Object {
  def apply(event: exit, worker: Worker_, code: Double, signal: String): Boolean = js.native
}

