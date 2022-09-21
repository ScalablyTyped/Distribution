package typings.netgear.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceConfig extends StObject {
  
  var BlankState: String
  
  var NewBlockSiteEnable: String
  
  var NewBlockSiteName: String
  
  var NewDaylightSaving: String
  
  var NewTimeZone: String
}
object DeviceConfig {
  
  inline def apply(
    BlankState: String,
    NewBlockSiteEnable: String,
    NewBlockSiteName: String,
    NewDaylightSaving: String,
    NewTimeZone: String
  ): DeviceConfig = {
    val __obj = js.Dynamic.literal(BlankState = BlankState.asInstanceOf[js.Any], NewBlockSiteEnable = NewBlockSiteEnable.asInstanceOf[js.Any], NewBlockSiteName = NewBlockSiteName.asInstanceOf[js.Any], NewDaylightSaving = NewDaylightSaving.asInstanceOf[js.Any], NewTimeZone = NewTimeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfig]
  }
  
  extension [Self <: DeviceConfig](x: Self) {
    
    inline def setBlankState(value: String): Self = StObject.set(x, "BlankState", value.asInstanceOf[js.Any])
    
    inline def setNewBlockSiteEnable(value: String): Self = StObject.set(x, "NewBlockSiteEnable", value.asInstanceOf[js.Any])
    
    inline def setNewBlockSiteName(value: String): Self = StObject.set(x, "NewBlockSiteName", value.asInstanceOf[js.Any])
    
    inline def setNewDaylightSaving(value: String): Self = StObject.set(x, "NewDaylightSaving", value.asInstanceOf[js.Any])
    
    inline def setNewTimeZone(value: String): Self = StObject.set(x, "NewTimeZone", value.asInstanceOf[js.Any])
  }
}
