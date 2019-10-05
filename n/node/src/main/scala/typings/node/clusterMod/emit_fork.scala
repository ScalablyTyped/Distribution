package typings.node.clusterMod

import typings.node.nodeStrings.fork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "emit")
@js.native
object emit_fork extends js.Object {
  def apply(event: fork, worker: Worker): Boolean = js.native
}

