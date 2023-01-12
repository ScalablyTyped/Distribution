package typings.navermaps.naver.maps.Service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Land extends StObject {
  
  var coords: Coords
  
  var name: String
  
  var number1: String
  
  var number2: String
  
  var `type`: String
}
object Land {
  
  inline def apply(coords: Coords, name: String, number1: String, number2: String, `type`: String): Land = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number1 = number1.asInstanceOf[js.Any], number2 = number2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Land]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Land] (val x: Self) extends AnyVal {
    
    inline def setCoords(value: Coords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumber1(value: String): Self = StObject.set(x, "number1", value.asInstanceOf[js.Any])
    
    inline def setNumber2(value: String): Self = StObject.set(x, "number2", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
