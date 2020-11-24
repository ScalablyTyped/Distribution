package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
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
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCELL_2G(value: Double): Self = this.set("CELL_2G", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCELL_3G(value: Double): Self = this.set("CELL_3G", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCELL_4G(value: Double): Self = this.set("CELL_4G", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETHERNET(value: Double): Self = this.set("ETHERNET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: Double): Self = this.set("NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: Double): Self = this.set("UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIFI(value: Double): Self = this.set("WIFI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
