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
  
  inline def apply(): Groups = {
    val __obj = js.Dynamic.literal(t = "add")
    __obj.asInstanceOf[Groups]
  }
  
  extension [Self <: Groups](x: Self) {
    
    inline def setGroups(value: js.Array[js.Object]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: js.Object*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    inline def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    inline def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setRemovedLinks(value: js.Array[js.Object]): Self = StObject.set(x, "removedLinks", value.asInstanceOf[js.Any])
    
    inline def setRemovedLinksUndefined: Self = StObject.set(x, "removedLinks", js.undefined)
    
    inline def setRemovedLinksVarargs(value: js.Object*): Self = StObject.set(x, "removedLinks", js.Array(value :_*))
    
    inline def setSubflow(value: js.Object): Self = StObject.set(x, "subflow", value.asInstanceOf[js.Any])
    
    inline def setSubflowUndefined: Self = StObject.set(x, "subflow", js.undefined)
    
    inline def setSubflows(value: js.Array[js.Object]): Self = StObject.set(x, "subflows", value.asInstanceOf[js.Any])
    
    inline def setSubflowsUndefined: Self = StObject.set(x, "subflows", js.undefined)
    
    inline def setSubflowsVarargs(value: js.Object*): Self = StObject.set(x, "subflows", js.Array(value :_*))
    
    inline def setT(value: add): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setWorkspaces(value: js.Array[js.Object]): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
    
    inline def setWorkspacesVarargs(value: js.Object*): Self = StObject.set(x, "workspaces", js.Array(value :_*))
  }
}
