package typings.orientjs.mod.Topology

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OClusterConfig extends js.Object {
  def selectionStrategy(cluster: OCluster): OServerNode
}

object OClusterConfig {
  @scala.inline
  def apply(selectionStrategy: OCluster => OServerNode): OClusterConfig = {
    val __obj = js.Dynamic.literal(selectionStrategy = js.Any.fromFunction1(selectionStrategy))
  
    __obj.asInstanceOf[OClusterConfig]
  }
}

