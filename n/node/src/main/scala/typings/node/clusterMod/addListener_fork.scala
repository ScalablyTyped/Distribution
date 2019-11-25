package typings.node.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "addListener")
@js.native
object addListener_fork extends js.Object {
  def apply(event: typings.node.nodeStrings.fork, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
}

