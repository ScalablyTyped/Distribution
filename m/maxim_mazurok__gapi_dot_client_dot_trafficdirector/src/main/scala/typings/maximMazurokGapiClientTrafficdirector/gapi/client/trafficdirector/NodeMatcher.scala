package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMatcher extends StObject {
  
  /** Specifies match criteria on the node id. */
  var nodeId: js.UndefOr[StringMatcher] = js.undefined
  
  /** Specifies match criteria on the node metadata. */
  var nodeMetadatas: js.UndefOr[js.Array[StructMatcher]] = js.undefined
}
object NodeMatcher {
  
  inline def apply(): NodeMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeMatcher]
  }
  
  extension [Self <: NodeMatcher](x: Self) {
    
    inline def setNodeId(value: StringMatcher): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setNodeMetadatas(value: js.Array[StructMatcher]): Self = StObject.set(x, "nodeMetadatas", value.asInstanceOf[js.Any])
    
    inline def setNodeMetadatasUndefined: Self = StObject.set(x, "nodeMetadatas", js.undefined)
    
    inline def setNodeMetadatasVarargs(value: StructMatcher*): Self = StObject.set(x, "nodeMetadatas", js.Array(value*))
  }
}
