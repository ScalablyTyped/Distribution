package typings.node.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "once")
@js.native
object once_disconnect extends js.Object {
  def apply(event: typings.node.nodeStrings.disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
}

