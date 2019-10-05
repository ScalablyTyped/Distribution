package typings.node.clusterMod

import typings.node.netMod.Server
import typings.node.netMod.Socket
import typings.node.nodeStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "prependOnceListener")
@js.native
object prependOnceListener_message extends js.Object {
  // the handle is a net.Socket or net.Server object, or undefined.
  def apply(
    event: message,
    listener: js.Function3[/* worker */ Worker, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
}

