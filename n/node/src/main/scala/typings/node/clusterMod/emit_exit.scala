package typings.node.clusterMod

import typings.node.nodeStrings.exit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "emit")
@js.native
object emit_exit extends js.Object {
  def apply(event: exit, worker: Worker, code: Double, signal: java.lang.String): Boolean = js.native
}

