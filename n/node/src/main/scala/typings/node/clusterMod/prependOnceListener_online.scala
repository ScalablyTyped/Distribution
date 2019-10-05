package typings.node.clusterMod

import typings.node.nodeStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "prependOnceListener")
@js.native
object prependOnceListener_online extends js.Object {
  def apply(event: online, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
}

