package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.createSubflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Links extends js.Object {
  
  var links: js.UndefOr[js.Array[js.Object]] = js.native
  
  var nodes: js.UndefOr[js.Array[js.Object]] = js.native
  
  var removedLinks: js.UndefOr[js.Array[js.Object]] = js.native
  
  var subflow: js.Object = js.native
  
  var t: createSubflow = js.native
}
object Links {
  
  @scala.inline
  def apply(subflow: js.Object, t: createSubflow): Links = {
    val __obj = js.Dynamic.literal(subflow = subflow.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
  
  @scala.inline
  implicit class LinksOps[Self <: Links] (val x: Self) extends AnyVal {
    
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
    def setSubflow(value: js.Object): Self = this.set("subflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: createSubflow): Self = this.set("t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: js.Object*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[js.Object]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: js.Object*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[js.Object]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    
    @scala.inline
    def setRemovedLinksVarargs(value: js.Object*): Self = this.set("removedLinks", js.Array(value :_*))
    
    @scala.inline
    def setRemovedLinks(value: js.Array[js.Object]): Self = this.set("removedLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovedLinks: Self = this.set("removedLinks", js.undefined)
  }
}
