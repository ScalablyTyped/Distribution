package typings.node.clusterMod

import typings.node.nodeStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "prependListener")
@js.native
object prependListener_online extends js.Object {
  def apply(event: online, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
}

