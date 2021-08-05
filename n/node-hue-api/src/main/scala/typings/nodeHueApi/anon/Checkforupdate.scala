package typings.nodeHueApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkforupdate extends StObject {
  
  var checkforupdate: Boolean
  
  var devicetypes: Bridge
  
  @JSName("notify")
  var notify_FCheckforupdate: Boolean
  
  var text: String
  
  var updatestate: Double
  
  var url: String
}
object Checkforupdate {
  
  inline def apply(
    checkforupdate: Boolean,
    devicetypes: Bridge,
    notify_ : Boolean,
    text: String,
    updatestate: Double,
    url: String
  ): Checkforupdate = {
    val __obj = js.Dynamic.literal(checkforupdate = checkforupdate.asInstanceOf[js.Any], devicetypes = devicetypes.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatestate = updatestate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkforupdate]
  }
  
  extension [Self <: Checkforupdate](x: Self) {
    
    inline def setCheckforupdate(value: Boolean): Self = StObject.set(x, "checkforupdate", value.asInstanceOf[js.Any])
    
    inline def setDevicetypes(value: Bridge): Self = StObject.set(x, "devicetypes", value.asInstanceOf[js.Any])
    
    inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUpdatestate(value: Double): Self = StObject.set(x, "updatestate", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
