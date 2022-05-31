package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Drag extends StObject {
  
  var drag: Groups
  
  var drop: Legend
}
object Drag {
  
  inline def apply(drag: Groups, drop: Legend): Drag = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drag]
  }
  
  extension [Self <: Drag](x: Self) {
    
    inline def setDrag(value: Groups): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDrop(value: Legend): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
  }
}
