package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.deleteSubflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MovedNodes extends StObject {
  
  var createdLinks: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var links: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var movedNodes: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var subflow: js.UndefOr[js.Object] = js.undefined
  
  var subflows: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var t: deleteSubflow
}
object MovedNodes {
  
  inline def apply(): MovedNodes = {
    val __obj = js.Dynamic.literal(t = "deleteSubflow")
    __obj.asInstanceOf[MovedNodes]
  }
  
  extension [Self <: MovedNodes](x: Self) {
    
    inline def setCreatedLinks(value: js.Array[js.Object]): Self = StObject.set(x, "createdLinks", value.asInstanceOf[js.Any])
    
    inline def setCreatedLinksUndefined: Self = StObject.set(x, "createdLinks", js.undefined)
    
    inline def setCreatedLinksVarargs(value: js.Object*): Self = StObject.set(x, "createdLinks", js.Array(value :_*))
    
    inline def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    inline def setMovedNodes(value: js.Array[js.Object]): Self = StObject.set(x, "movedNodes", value.asInstanceOf[js.Any])
    
    inline def setMovedNodesUndefined: Self = StObject.set(x, "movedNodes", js.undefined)
    
    inline def setMovedNodesVarargs(value: js.Object*): Self = StObject.set(x, "movedNodes", js.Array(value :_*))
    
    inline def setSubflow(value: js.Object): Self = StObject.set(x, "subflow", value.asInstanceOf[js.Any])
    
    inline def setSubflowUndefined: Self = StObject.set(x, "subflow", js.undefined)
    
    inline def setSubflows(value: js.Array[js.Object]): Self = StObject.set(x, "subflows", value.asInstanceOf[js.Any])
    
    inline def setSubflowsUndefined: Self = StObject.set(x, "subflows", js.undefined)
    
    inline def setSubflowsVarargs(value: js.Object*): Self = StObject.set(x, "subflows", js.Array(value :_*))
    
    inline def setT(value: deleteSubflow): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
