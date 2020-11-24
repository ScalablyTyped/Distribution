package typings.node.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cluster", "on")
@js.native
object on_disconnect extends js.Object {
  
  def apply(event: typings.node.nodeStrings.disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
}
