package typings.paypalRestSdk.mod.invoice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingInfo extends Person {
  
  var additional_info: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var notification_channel: js.UndefOr[String] = js.native
}
object BillingInfo {
  
  @scala.inline
  def apply(): BillingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingInfo]
  }
  
  @scala.inline
  implicit class BillingInfoMutableBuilder[Self <: BillingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditional_info(value: String): Self = StObject.set(x, "additional_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditional_infoUndefined: Self = StObject.set(x, "additional_info", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setNotification_channel(value: String): Self = StObject.set(x, "notification_channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification_channelUndefined: Self = StObject.set(x, "notification_channel", js.undefined)
  }
}
