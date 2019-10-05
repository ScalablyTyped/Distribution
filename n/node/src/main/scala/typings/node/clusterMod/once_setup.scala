package typings.node.clusterMod

import typings.node.nodeStrings.setup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "once")
@js.native
object once_setup extends js.Object {
  def apply(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
}

