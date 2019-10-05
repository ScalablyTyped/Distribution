package typings.node.clusterMod

import typings.node.nodeStrings.disconnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "on")
@js.native
object on_disconnect extends js.Object {
  def apply(event: disconnect, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
}

