package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Drop extends StObject {
  
  var drag: Nodes
  
  var drop: Background
}
object Drop {
  
  inline def apply(drag: Nodes, drop: Background): Drop = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drop]
  }
  
  extension [Self <: Drop](x: Self) {
    
    inline def setDrag(value: Nodes): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDrop(value: Background): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
  }
}
