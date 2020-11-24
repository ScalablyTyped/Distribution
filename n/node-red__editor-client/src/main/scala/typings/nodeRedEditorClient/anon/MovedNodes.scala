package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.deleteSubflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MovedNodes extends js.Object {
  
  var createdLinks: js.UndefOr[js.Array[js.Object]] = js.native
  
  var links: js.UndefOr[js.Array[js.Object]] = js.native
  
  var movedNodes: js.UndefOr[js.Array[js.Object]] = js.native
  
  var subflow: js.UndefOr[js.Object] = js.native
  
  var subflows: js.UndefOr[js.Array[js.Object]] = js.native
  
  var t: deleteSubflow = js.native
}
object MovedNodes {
  
  @scala.inline
  def apply(t: deleteSubflow): MovedNodes = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovedNodes]
  }
  
  @scala.inline
  implicit class MovedNodesOps[Self <: MovedNodes] (val x: Self) extends AnyVal {
    
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
    def setT(value: deleteSubflow): Self = this.set("t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedLinksVarargs(value: js.Object*): Self = this.set("createdLinks", js.Array(value :_*))
    
    @scala.inline
    def setCreatedLinks(value: js.Array[js.Object]): Self = this.set("createdLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedLinks: Self = this.set("createdLinks", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: js.Object*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[js.Object]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setMovedNodesVarargs(value: js.Object*): Self = this.set("movedNodes", js.Array(value :_*))
    
    @scala.inline
    def setMovedNodes(value: js.Array[js.Object]): Self = this.set("movedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovedNodes: Self = this.set("movedNodes", js.undefined)
    
    @scala.inline
    def setSubflow(value: js.Object): Self = this.set("subflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubflow: Self = this.set("subflow", js.undefined)
    
    @scala.inline
    def setSubflowsVarargs(value: js.Object*): Self = this.set("subflows", js.Array(value :_*))
    
    @scala.inline
    def setSubflows(value: js.Array[js.Object]): Self = this.set("subflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubflows: Self = this.set("subflows", js.undefined)
  }
}
