package typings.paypalRestSdk.mod.invoice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingInfo
  extends StObject
     with Person {
  
  var additional_info: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var notification_channel: js.UndefOr[String] = js.undefined
}
object BillingInfo {
  
  inline def apply(): BillingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingInfo]
  }
  
  extension [Self <: BillingInfo](x: Self) {
    
    inline def setAdditional_info(value: String): Self = StObject.set(x, "additional_info", value.asInstanceOf[js.Any])
    
    inline def setAdditional_infoUndefined: Self = StObject.set(x, "additional_info", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setNotification_channel(value: String): Self = StObject.set(x, "notification_channel", value.asInstanceOf[js.Any])
    
    inline def setNotification_channelUndefined: Self = StObject.set(x, "notification_channel", js.undefined)
  }
}
