package typings.onfleetNodeOnfleet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppVersion extends StObject {
  
  var appVersion: String
  
  var batteryLevel: Double
  
  var deviceDescription: String
  
  var platform: String
}
object AppVersion {
  
  inline def apply(appVersion: String, batteryLevel: Double, deviceDescription: String, platform: String): AppVersion = {
    val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], batteryLevel = batteryLevel.asInstanceOf[js.Any], deviceDescription = deviceDescription.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppVersion]
  }
  
  extension [Self <: AppVersion](x: Self) {
    
    inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setBatteryLevel(value: Double): Self = StObject.set(x, "batteryLevel", value.asInstanceOf[js.Any])
    
    inline def setDeviceDescription(value: String): Self = StObject.set(x, "deviceDescription", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
  }
}
