package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerShape extends StObject {
  
  var coords: js.Array[Any]
  
  var `type`: String
}
object MarkerShape {
  
  inline def apply(coords: js.Array[Any], `type`: String): MarkerShape = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerShape]
  }
  
  extension [Self <: MarkerShape](x: Self) {
    
    inline def setCoords(value: js.Array[Any]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setCoordsVarargs(value: Any*): Self = StObject.set(x, "coords", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
