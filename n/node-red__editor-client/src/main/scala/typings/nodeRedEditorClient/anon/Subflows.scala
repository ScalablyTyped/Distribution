package typings.nodeRedEditorClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subflows extends js.Object {
  
  var links: js.Array[js.Object] = js.native
  
  var nodes: js.Array[js.Object] = js.native
  
  var subflows: js.Array[js.Object] = js.native
}
object Subflows {
  
  @scala.inline
  def apply(links: js.Array[js.Object], nodes: js.Array[js.Object], subflows: js.Array[js.Object]): Subflows = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], subflows = subflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subflows]
  }
  
  @scala.inline
  implicit class SubflowsOps[Self <: Subflows] (val x: Self) extends AnyVal {
    
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
    def setLinksVarargs(value: js.Object*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[js.Object]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: js.Object*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[js.Object]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubflowsVarargs(value: js.Object*): Self = this.set("subflows", js.Array(value :_*))
    
    @scala.inline
    def setSubflows(value: js.Array[js.Object]): Self = this.set("subflows", value.asInstanceOf[js.Any])
  }
}
