package typings.node.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "on")
@js.native
object on_fork extends js.Object {
  def apply(event: typings.node.nodeStrings.fork, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
}

