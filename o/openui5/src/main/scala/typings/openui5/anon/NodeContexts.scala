package typings.openui5.anon

import typings.openui5.sapUiCommonsTreeNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeContexts extends StObject {
  
  /**
    * The binding context of the selected nodes.
    */
  var nodeContexts: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  /**
    * The nodes which has been selected.
    */
  var nodes: js.UndefOr[js.Array[default]] = js.undefined
}
object NodeContexts {
  
  inline def apply(): NodeContexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeContexts]
  }
  
  extension [Self <: NodeContexts](x: Self) {
    
    inline def setNodeContexts(value: js.Array[js.Object]): Self = StObject.set(x, "nodeContexts", value.asInstanceOf[js.Any])
    
    inline def setNodeContextsUndefined: Self = StObject.set(x, "nodeContexts", js.undefined)
    
    inline def setNodeContextsVarargs(value: js.Object*): Self = StObject.set(x, "nodeContexts", js.Array(value*))
    
    inline def setNodes(value: js.Array[default]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: default*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
