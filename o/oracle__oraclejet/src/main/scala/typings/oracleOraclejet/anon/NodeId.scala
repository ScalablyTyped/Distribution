package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeId
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var nodeId: Any
}
object NodeId {
  
  inline def apply(nodeId: Any): NodeId = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeId]
  }
  
  extension [Self <: NodeId](x: Self) {
    
    inline def setNodeId(value: Any): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
