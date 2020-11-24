package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeIntegration extends js.Object {
  
  var nodeIntegration: Boolean = js.native
  
  var plugins: Boolean = js.native
}
object NodeIntegration {
  
  @scala.inline
  def apply(nodeIntegration: Boolean, plugins: Boolean): NodeIntegration = {
    val __obj = js.Dynamic.literal(nodeIntegration = nodeIntegration.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIntegration]
  }
  
  @scala.inline
  implicit class NodeIntegrationOps[Self <: NodeIntegration] (val x: Self) extends AnyVal {
    
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
    def setNodeIntegration(value: Boolean): Self = this.set("nodeIntegration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugins(value: Boolean): Self = this.set("plugins", value.asInstanceOf[js.Any])
  }
}
