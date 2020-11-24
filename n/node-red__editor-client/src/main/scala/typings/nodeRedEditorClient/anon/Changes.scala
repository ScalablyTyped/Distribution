package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Changes extends js.Object {
  
  var changes: js.UndefOr[js.Array[js.Object]] = js.native
  
  var createdLinks: js.UndefOr[js.Array[js.Object]] = js.native
  
  var groups: js.UndefOr[js.Array[js.Object]] = js.native
  
  var links: js.UndefOr[js.Array[js.Object]] = js.native
  
  var nodes: js.UndefOr[js.Array[js.Object]] = js.native
  
  var subflow: js.UndefOr[js.Object] = js.native
  
  var subflowInputs: js.UndefOr[js.Array[js.Object]] = js.native
  
  var subflowOutputs: js.UndefOr[js.Array[js.Object]] = js.native
  
  var subflows: js.UndefOr[js.Array[js.Object]] = js.native
  
  var t: delete = js.native
  
  var workspaces: js.UndefOr[js.Array[js.Object]] = js.native
}
object Changes {
  
  @scala.inline
  def apply(t: delete): Changes = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changes]
  }
  
  @scala.inline
  implicit class ChangesOps[Self <: Changes] (val x: Self) extends AnyVal {
    
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
    def setT(value: delete): Self = this.set("t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: js.Object*): Self = this.set("changes", js.Array(value :_*))
    
    @scala.inline
    def setChanges(value: js.Array[js.Object]): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChanges: Self = this.set("changes", js.undefined)
    
    @scala.inline
    def setCreatedLinksVarargs(value: js.Object*): Self = this.set("createdLinks", js.Array(value :_*))
    
    @scala.inline
    def setCreatedLinks(value: js.Array[js.Object]): Self = this.set("createdLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedLinks: Self = this.set("createdLinks", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: js.Object*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[js.Object]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
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
    def setSubflow(value: js.Object): Self = this.set("subflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubflow: Self = this.set("subflow", js.undefined)
    
    @scala.inline
    def setSubflowInputsVarargs(value: js.Object*): Self = this.set("subflowInputs", js.Array(value :_*))
    
    @scala.inline
    def setSubflowInputs(value: js.Array[js.Object]): Self = this.set("subflowInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubflowInputs: Self = this.set("subflowInputs", js.undefined)
    
    @scala.inline
    def setSubflowOutputsVarargs(value: js.Object*): Self = this.set("subflowOutputs", js.Array(value :_*))
    
    @scala.inline
    def setSubflowOutputs(value: js.Array[js.Object]): Self = this.set("subflowOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubflowOutputs: Self = this.set("subflowOutputs", js.undefined)
    
    @scala.inline
    def setSubflowsVarargs(value: js.Object*): Self = this.set("subflows", js.Array(value :_*))
    
    @scala.inline
    def setSubflows(value: js.Array[js.Object]): Self = this.set("subflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubflows: Self = this.set("subflows", js.undefined)
    
    @scala.inline
    def setWorkspacesVarargs(value: js.Object*): Self = this.set("workspaces", js.Array(value :_*))
    
    @scala.inline
    def setWorkspaces(value: js.Array[js.Object]): Self = this.set("workspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaces: Self = this.set("workspaces", js.undefined)
  }
}
