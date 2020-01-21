package typings.node.clusterMod

import typings.node.netMod.Server
import typings.node.netMod.Socket
import typings.node.nodeStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "once")
@js.native
object once_message extends js.Object {
  def apply(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
}

