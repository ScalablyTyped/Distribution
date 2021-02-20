package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineString extends StObject {
  
  var coordinates: js.Array[Coordinate] = js.native
  
  var `type`: typings.osrm.osrmStrings.LineString = js.native
}
object LineString {
  
  @scala.inline
  def apply(coordinates: js.Array[Coordinate], `type`: typings.osrm.osrmStrings.LineString): LineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineString]
  }
  
  @scala.inline
  implicit class LineStringMutableBuilder[Self <: LineString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[Coordinate]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: Coordinate*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.osrm.osrmStrings.LineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
