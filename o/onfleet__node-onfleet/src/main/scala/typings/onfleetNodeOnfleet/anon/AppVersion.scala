package typings.onfleetNodeOnfleet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppVersion extends StObject {
  
  var appVersion: String = js.native
  
  var batteryLevel: Double = js.native
  
  var deviceDescription: String = js.native
  
  var platform: String = js.native
}
object AppVersion {
  
  @scala.inline
  def apply(appVersion: String, batteryLevel: Double, deviceDescription: String, platform: String): AppVersion = {
    val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], batteryLevel = batteryLevel.asInstanceOf[js.Any], deviceDescription = deviceDescription.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppVersion]
  }
  
  @scala.inline
  implicit class AppVersionMutableBuilder[Self <: AppVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatteryLevel(value: Double): Self = StObject.set(x, "batteryLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDescription(value: String): Self = StObject.set(x, "deviceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
  }
}
