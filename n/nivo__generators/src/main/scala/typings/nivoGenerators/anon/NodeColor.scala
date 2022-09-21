package typings.nivoGenerators.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeColor extends StObject {
  
  var id: String
  
  var nodeColor: String
}
object NodeColor {
  
  inline def apply(id: String, nodeColor: String): NodeColor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], nodeColor = nodeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeColor]
  }
  
  extension [Self <: NodeColor](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNodeColor(value: String): Self = StObject.set(x, "nodeColor", value.asInstanceOf[js.Any])
  }
}
