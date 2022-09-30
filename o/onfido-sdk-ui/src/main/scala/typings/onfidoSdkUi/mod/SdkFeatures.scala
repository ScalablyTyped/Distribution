package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkFeatures extends StObject {
  
  var disable_cross_device_sms: js.UndefOr[Boolean] = js.undefined
  
  var enable_require_applicant_consents: js.UndefOr[Boolean] = js.undefined
}
object SdkFeatures {
  
  inline def apply(): SdkFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdkFeatures]
  }
  
  extension [Self <: SdkFeatures](x: Self) {
    
    inline def setDisable_cross_device_sms(value: Boolean): Self = StObject.set(x, "disable_cross_device_sms", value.asInstanceOf[js.Any])
    
    inline def setDisable_cross_device_smsUndefined: Self = StObject.set(x, "disable_cross_device_sms", js.undefined)
    
    inline def setEnable_require_applicant_consents(value: Boolean): Self = StObject.set(x, "enable_require_applicant_consents", value.asInstanceOf[js.Any])
    
    inline def setEnable_require_applicant_consentsUndefined: Self = StObject.set(x, "enable_require_applicant_consents", js.undefined)
  }
}
