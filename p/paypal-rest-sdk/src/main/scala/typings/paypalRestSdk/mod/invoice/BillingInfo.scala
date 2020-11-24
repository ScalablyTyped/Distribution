package typings.paypalRestSdk.mod.invoice

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
  implicit class BillingInfoOps[Self <: BillingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdditional_info(value: String): Self = this.set("additional_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditional_info: Self = this.set("additional_info", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setNotification_channel(value: String): Self = this.set("notification_channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification_channel: Self = this.set("notification_channel", js.undefined)
  }
}
