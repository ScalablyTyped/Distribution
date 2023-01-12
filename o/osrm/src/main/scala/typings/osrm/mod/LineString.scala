package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineString extends StObject {
  
  var coordinates: js.Array[Coordinate]
  
  var `type`: typings.osrm.osrmStrings.LineString
}
object LineString {
  
  inline def apply(coordinates: js.Array[Coordinate]): LineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LineString")
    __obj.asInstanceOf[LineString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineString] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: js.Array[Coordinate]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Coordinate*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: typings.osrm.osrmStrings.LineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
