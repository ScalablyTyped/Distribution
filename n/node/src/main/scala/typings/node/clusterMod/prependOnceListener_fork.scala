package typings.node.clusterMod

import typings.node.nodeStrings.fork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "prependOnceListener")
@js.native
object prependOnceListener_fork extends js.Object {
  def apply(event: fork, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
}

