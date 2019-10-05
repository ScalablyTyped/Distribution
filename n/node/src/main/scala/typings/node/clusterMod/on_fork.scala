package typings.node.clusterMod

import typings.node.nodeStrings.fork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "on")
@js.native
object on_fork extends js.Object {
  def apply(event: fork, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
}

