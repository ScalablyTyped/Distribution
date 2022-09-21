package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RideStation extends StObject {
  
  var entrance: CoordsXYZD
  
  var exit: CoordsXYZD
  
  var length: Double
  
  var start: CoordsXYZ
}
object RideStation {
  
  inline def apply(entrance: CoordsXYZD, exit: CoordsXYZD, length: Double, start: CoordsXYZ): RideStation = {
    val __obj = js.Dynamic.literal(entrance = entrance.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RideStation]
  }
  
  extension [Self <: RideStation](x: Self) {
    
    inline def setEntrance(value: CoordsXYZD): Self = StObject.set(x, "entrance", value.asInstanceOf[js.Any])
    
    inline def setExit(value: CoordsXYZD): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStart(value: CoordsXYZ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
