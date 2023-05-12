package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSimulationEventInfo extends StObject {
  
  /**
    * Browser information from where the simulation event was initiated by a user in an attack simulation and training
    * campaign.
    */
  var browser: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Date and time of the simulation event by a user in an attack simulation and training campaign.
  var eventDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the simulation event by a user in an attack simulation and training campaign.
  var eventName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // IP address from where the simulation event was initiated by a user in an attack simulation and training campaign.
  var ipAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The operating system, platform, and device details from where the simulation event was initiated by a user in an attack
    * simulation and training campaign.
    */
  var osPlatformDeviceDetails: js.UndefOr[NullableOption[String]] = js.undefined
}
object UserSimulationEventInfo {
  
  inline def apply(): UserSimulationEventInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSimulationEventInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserSimulationEventInfo] (val x: Self) extends AnyVal {
    
    inline def setBrowser(value: NullableOption[String]): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserNull: Self = StObject.set(x, "browser", null)
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setEventDateTime(value: NullableOption[String]): Self = StObject.set(x, "eventDateTime", value.asInstanceOf[js.Any])
    
    inline def setEventDateTimeNull: Self = StObject.set(x, "eventDateTime", null)
    
    inline def setEventDateTimeUndefined: Self = StObject.set(x, "eventDateTime", js.undefined)
    
    inline def setEventName(value: NullableOption[String]): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameNull: Self = StObject.set(x, "eventName", null)
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setIpAddress(value: NullableOption[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setOsPlatformDeviceDetails(value: NullableOption[String]): Self = StObject.set(x, "osPlatformDeviceDetails", value.asInstanceOf[js.Any])
    
    inline def setOsPlatformDeviceDetailsNull: Self = StObject.set(x, "osPlatformDeviceDetails", null)
    
    inline def setOsPlatformDeviceDetailsUndefined: Self = StObject.set(x, "osPlatformDeviceDetails", js.undefined)
  }
}
