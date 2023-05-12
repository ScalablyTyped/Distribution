package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserTrainingContentEventInfo extends StObject {
  
  // Browser of the user from where the training event was generated.
  var browser: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Date and time of the training content playback by the user.
  var contentDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // IP address of the user for the training event.
  var ipAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The operating system, platform, and device details of the user for the training event.
  var osPlatformDeviceDetails: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Potential improvement in the tenant security posture after completion of the training by the user.
  var potentialScoreImpact: js.UndefOr[NullableOption[Double]] = js.undefined
}
object UserTrainingContentEventInfo {
  
  inline def apply(): UserTrainingContentEventInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserTrainingContentEventInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserTrainingContentEventInfo] (val x: Self) extends AnyVal {
    
    inline def setBrowser(value: NullableOption[String]): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserNull: Self = StObject.set(x, "browser", null)
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setContentDateTime(value: NullableOption[String]): Self = StObject.set(x, "contentDateTime", value.asInstanceOf[js.Any])
    
    inline def setContentDateTimeNull: Self = StObject.set(x, "contentDateTime", null)
    
    inline def setContentDateTimeUndefined: Self = StObject.set(x, "contentDateTime", js.undefined)
    
    inline def setIpAddress(value: NullableOption[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setOsPlatformDeviceDetails(value: NullableOption[String]): Self = StObject.set(x, "osPlatformDeviceDetails", value.asInstanceOf[js.Any])
    
    inline def setOsPlatformDeviceDetailsNull: Self = StObject.set(x, "osPlatformDeviceDetails", null)
    
    inline def setOsPlatformDeviceDetailsUndefined: Self = StObject.set(x, "osPlatformDeviceDetails", js.undefined)
    
    inline def setPotentialScoreImpact(value: NullableOption[Double]): Self = StObject.set(x, "potentialScoreImpact", value.asInstanceOf[js.Any])
    
    inline def setPotentialScoreImpactNull: Self = StObject.set(x, "potentialScoreImpact", null)
    
    inline def setPotentialScoreImpactUndefined: Self = StObject.set(x, "potentialScoreImpact", js.undefined)
  }
}
