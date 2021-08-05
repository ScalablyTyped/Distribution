package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.createSubflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Links extends StObject {
  
  var links: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var nodes: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var removedLinks: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var subflow: js.Object
  
  var t: createSubflow
}
object Links {
  
  inline def apply(subflow: js.Object): Links = {
    val __obj = js.Dynamic.literal(subflow = subflow.asInstanceOf[js.Any], t = "createSubflow")
    __obj.asInstanceOf[Links]
  }
  
  extension [Self <: Links](x: Self) {
    
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
    
    inline def setT(value: createSubflow): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
