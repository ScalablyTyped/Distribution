package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupsLinks extends StObject {
  
  var groups: js.Array[js.Object]
  
  var links: js.Array[js.Object]
  
  var nodes: js.Array[js.Object]
}
object GroupsLinks {
  
  inline def apply(groups: js.Array[js.Object], links: js.Array[js.Object], nodes: js.Array[js.Object]): GroupsLinks = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupsLinks]
  }
  
  extension [Self <: GroupsLinks](x: Self) {
    
    inline def setGroups(value: js.Array[js.Object]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: js.Object*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    inline def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    inline def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
