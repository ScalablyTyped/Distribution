package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Changes extends StObject {
  
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
  implicit class ChangesMutableBuilder[Self <: Changes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[js.Object]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    @scala.inline
    def setChangesVarargs(value: js.Object*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    @scala.inline
    def setCreatedLinks(value: js.Array[js.Object]): Self = StObject.set(x, "createdLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedLinksUndefined: Self = StObject.set(x, "createdLinks", js.undefined)
    
    @scala.inline
    def setCreatedLinksVarargs(value: js.Object*): Self = StObject.set(x, "createdLinks", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[js.Object]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: js.Object*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setSubflow(value: js.Object): Self = StObject.set(x, "subflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubflowInputs(value: js.Array[js.Object]): Self = StObject.set(x, "subflowInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubflowInputsUndefined: Self = StObject.set(x, "subflowInputs", js.undefined)
    
    @scala.inline
    def setSubflowInputsVarargs(value: js.Object*): Self = StObject.set(x, "subflowInputs", js.Array(value :_*))
    
    @scala.inline
    def setSubflowOutputs(value: js.Array[js.Object]): Self = StObject.set(x, "subflowOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubflowOutputsUndefined: Self = StObject.set(x, "subflowOutputs", js.undefined)
    
    @scala.inline
    def setSubflowOutputsVarargs(value: js.Object*): Self = StObject.set(x, "subflowOutputs", js.Array(value :_*))
    
    @scala.inline
    def setSubflowUndefined: Self = StObject.set(x, "subflow", js.undefined)
    
    @scala.inline
    def setSubflows(value: js.Array[js.Object]): Self = StObject.set(x, "subflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubflowsUndefined: Self = StObject.set(x, "subflows", js.undefined)
    
    @scala.inline
    def setSubflowsVarargs(value: js.Object*): Self = StObject.set(x, "subflows", js.Array(value :_*))
    
    @scala.inline
    def setT(value: delete): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaces(value: js.Array[js.Object]): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
    
    @scala.inline
    def setWorkspacesVarargs(value: js.Object*): Self = StObject.set(x, "workspaces", js.Array(value :_*))
  }
}
