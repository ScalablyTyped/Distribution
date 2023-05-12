package typings.onfidoSdkUi.mod

import typings.onfidoSdkUi.anon.Levels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkFeatures extends StObject {
  
  var disable_cross_device_sms: js.UndefOr[Boolean] = js.undefined
  
  var enable_document_support_rules: js.UndefOr[Boolean] = js.undefined
  
  var enable_in_house_analytics: js.UndefOr[Boolean] = js.undefined
  
  var enable_performance_analytics: js.UndefOr[Boolean] = js.undefined
  
  var enable_require_applicant_consents: js.UndefOr[Boolean] = js.undefined
  
  var logger: js.UndefOr[Levels] = js.undefined
}
object SdkFeatures {
  
  inline def apply(): SdkFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdkFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SdkFeatures] (val x: Self) extends AnyVal {
    
    inline def setDisable_cross_device_sms(value: Boolean): Self = StObject.set(x, "disable_cross_device_sms", value.asInstanceOf[js.Any])
    
    inline def setDisable_cross_device_smsUndefined: Self = StObject.set(x, "disable_cross_device_sms", js.undefined)
    
    inline def setEnable_document_support_rules(value: Boolean): Self = StObject.set(x, "enable_document_support_rules", value.asInstanceOf[js.Any])
    
    inline def setEnable_document_support_rulesUndefined: Self = StObject.set(x, "enable_document_support_rules", js.undefined)
    
    inline def setEnable_in_house_analytics(value: Boolean): Self = StObject.set(x, "enable_in_house_analytics", value.asInstanceOf[js.Any])
    
    inline def setEnable_in_house_analyticsUndefined: Self = StObject.set(x, "enable_in_house_analytics", js.undefined)
    
    inline def setEnable_performance_analytics(value: Boolean): Self = StObject.set(x, "enable_performance_analytics", value.asInstanceOf[js.Any])
    
    inline def setEnable_performance_analyticsUndefined: Self = StObject.set(x, "enable_performance_analytics", js.undefined)
    
    inline def setEnable_require_applicant_consents(value: Boolean): Self = StObject.set(x, "enable_require_applicant_consents", value.asInstanceOf[js.Any])
    
    inline def setEnable_require_applicant_consentsUndefined: Self = StObject.set(x, "enable_require_applicant_consents", js.undefined)
    
    inline def setLogger(value: Levels): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
  }
}
