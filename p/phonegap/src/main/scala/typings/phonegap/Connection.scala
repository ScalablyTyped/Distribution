package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends StObject {
  
  var CELL_2G: Double = js.native
  
  var CELL_3G: Double = js.native
  
  var CELL_4G: Double = js.native
  
  var ETHERNET: Double = js.native
  
  var NONE: Double = js.native
  
  var UNKNOWN: Double = js.native
  
  var WIFI: Double = js.native
  
  var `type`: Double = js.native
}
object Connection {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCELL_2G(value: Double): Self = StObject.set(x, "CELL_2G", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCELL_3G(value: Double): Self = StObject.set(x, "CELL_3G", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCELL_4G(value: Double): Self = StObject.set(x, "CELL_4G", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETHERNET(value: Double): Self = StObject.set(x, "ETHERNET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: Double): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIFI(value: Double): Self = StObject.set(x, "WIFI", value.asInstanceOf[js.Any])
  }
}
