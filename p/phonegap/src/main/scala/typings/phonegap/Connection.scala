package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  var CELL_2G: Double
  
  var CELL_3G: Double
  
  var CELL_4G: Double
  
  var ETHERNET: Double
  
  var NONE: Double
  
  var UNKNOWN: Double
  
  var WIFI: Double
  
  var `type`: Double
}
object Connection {
  
  inline def apply(
    CELL_2G: Double,
    CELL_3G: Double,
    CELL_4G: Double,
    ETHERNET: Double,
    NONE: Double,
    UNKNOWN: Double,
    WIFI: Double,
    `type`: Double
  ): Connection = {
    val __obj = js.Dynamic.literal(CELL_2G = CELL_2G.asInstanceOf[js.Any], CELL_3G = CELL_3G.asInstanceOf[js.Any], CELL_4G = CELL_4G.asInstanceOf[js.Any], ETHERNET = ETHERNET.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], WIFI = WIFI.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setCELL_2G(value: Double): Self = StObject.set(x, "CELL_2G", value.asInstanceOf[js.Any])
    
    inline def setCELL_3G(value: Double): Self = StObject.set(x, "CELL_3G", value.asInstanceOf[js.Any])
    
    inline def setCELL_4G(value: Double): Self = StObject.set(x, "CELL_4G", value.asInstanceOf[js.Any])
    
    inline def setETHERNET(value: Double): Self = StObject.set(x, "ETHERNET", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN(value: Double): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
    
    inline def setWIFI(value: Double): Self = StObject.set(x, "WIFI", value.asInstanceOf[js.Any])
  }
}
