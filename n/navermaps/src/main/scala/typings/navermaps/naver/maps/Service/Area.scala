package typings.navermaps.naver.maps.Service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Area extends StObject {
  
  var coords: Coords
  
  var name: String
}
object Area {
  
  inline def apply(coords: Coords, name: String): Area = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Area]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Area] (val x: Self) extends AnyVal {
    
    inline def setCoords(value: Coords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
