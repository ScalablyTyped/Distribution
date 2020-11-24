package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddToGroup extends js.Object {
  
  var addToGroup: js.UndefOr[js.Object] = js.native
  
  var links: js.UndefOr[js.Array[js.Object]] = js.native
  
  var nodes: js.Array[js.Object] = js.native
  
  var removeFromGroup: js.UndefOr[js.Object] = js.native
  
  var removedLinks: js.UndefOr[js.Array[js.Object]] = js.native
  
  var t: move = js.native
}
object AddToGroup {
  
  @scala.inline
  def apply(nodes: js.Array[js.Object], t: move): AddToGroup = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddToGroup]
  }
  
  @scala.inline
  implicit class AddToGroupOps[Self <: AddToGroup] (val x: Self) extends AnyVal {
    
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
    def setNodesVarargs(value: js.Object*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[js.Object]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: move): Self = this.set("t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddToGroup(value: js.Object): Self = this.set("addToGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddToGroup: Self = this.set("addToGroup", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: js.Object*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[js.Object]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setRemoveFromGroup(value: js.Object): Self = this.set("removeFromGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveFromGroup: Self = this.set("removeFromGroup", js.undefined)
    
    @scala.inline
    def setRemovedLinksVarargs(value: js.Object*): Self = this.set("removedLinks", js.Array(value :_*))
    
    @scala.inline
    def setRemovedLinks(value: js.Array[js.Object]): Self = this.set("removedLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovedLinks: Self = this.set("removedLinks", js.undefined)
  }
}
