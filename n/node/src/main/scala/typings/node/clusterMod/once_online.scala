package typings.node.clusterMod

import typings.node.nodeStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "once")
@js.native
object once_online extends js.Object {
  def apply(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
}

