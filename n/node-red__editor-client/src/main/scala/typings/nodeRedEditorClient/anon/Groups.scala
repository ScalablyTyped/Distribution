package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.add
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  var groups: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var links: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var nodes: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var removedLinks: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var subflow: js.UndefOr[js.Object] = js.undefined
  
  var subflows: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var t: add
  
  var workspaces: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object Groups {
  
  @scala.inline
  def apply(): Groups = {
    val __obj = js.Dynamic.literal(t = "add")
    __obj.asInstanceOf[Groups]
  }
  
  @scala.inline
  implicit class GroupsMutableBuilder[Self <: Groups] (val x: Self) extends AnyVal {
    
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
    def setRemovedLinks(value: js.Array[js.Object]): Self = StObject.set(x, "removedLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedLinksUndefined: Self = StObject.set(x, "removedLinks", js.undefined)
    
    @scala.inline
    def setRemovedLinksVarargs(value: js.Object*): Self = StObject.set(x, "removedLinks", js.Array(value :_*))
    
    @scala.inline
    def setSubflow(value: js.Object): Self = StObject.set(x, "subflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubflowUndefined: Self = StObject.set(x, "subflow", js.undefined)
    
    @scala.inline
    def setSubflows(value: js.Array[js.Object]): Self = StObject.set(x, "subflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubflowsUndefined: Self = StObject.set(x, "subflows", js.undefined)
    
    @scala.inline
    def setSubflowsVarargs(value: js.Object*): Self = StObject.set(x, "subflows", js.Array(value :_*))
    
    @scala.inline
    def setT(value: add): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaces(value: js.Array[js.Object]): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
    
    @scala.inline
    def setWorkspacesVarargs(value: js.Object*): Self = StObject.set(x, "workspaces", js.Array(value :_*))
  }
}
