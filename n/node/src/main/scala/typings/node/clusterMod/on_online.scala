package typings.node.clusterMod

import typings.node.nodeStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "on")
@js.native
object on_online extends js.Object {
  def apply(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
}

