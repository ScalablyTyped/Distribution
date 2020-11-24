package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.edit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatedLinks extends js.Object {
  
  var changes: js.Array[js.Object] = js.native
  
  var createdLinks: js.UndefOr[js.Array[js.Object]] = js.native
  
  var links: js.UndefOr[js.Array[js.Object]] = js.native
  
  var node: js.Object = js.native
  
  var t: edit = js.native
}
object CreatedLinks {
  
  @scala.inline
  def apply(changes: js.Array[js.Object], node: js.Object, t: edit): CreatedLinks = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedLinks]
  }
  
  @scala.inline
  implicit class CreatedLinksOps[Self <: CreatedLinks] (val x: Self) extends AnyVal {
    
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
    def setChangesVarargs(value: js.Object*): Self = this.set("changes", js.Array(value :_*))
    
    @scala.inline
    def setChanges(value: js.Array[js.Object]): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: js.Object): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: edit): Self = this.set("t", value.asInstanceOf[js.Any])
    
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
  }
}
