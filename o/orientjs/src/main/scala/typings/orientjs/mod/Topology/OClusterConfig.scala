package typings.orientjs.mod.Topology

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OClusterConfig extends js.Object {
  
  def selectionStrategy(cluster: OCluster): OServerNode = js.native
}
object OClusterConfig {
  
  @scala.inline
  def apply(selectionStrategy: OCluster => OServerNode): OClusterConfig = {
    val __obj = js.Dynamic.literal(selectionStrategy = js.Any.fromFunction1(selectionStrategy))
    __obj.asInstanceOf[OClusterConfig]
  }
  
  @scala.inline
  implicit class OClusterConfigOps[Self <: OClusterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSelectionStrategy(value: OCluster => OServerNode): Self = this.set("selectionStrategy", js.Any.fromFunction1(value))
  }
}
