package typings.paypalPaypalJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptOptions extends js.Object {
  
  var `buyer-country`: js.UndefOr[String] = js.native
  
  var `client-id`: String = js.native
  
  var commit: js.UndefOr[Boolean] = js.native
  
  var components: js.UndefOr[String] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var `data-client-token`: js.UndefOr[String] = js.native
  
  var `data-csp-nonce`: js.UndefOr[String] = js.native
  
  var `data-order-id`: js.UndefOr[String] = js.native
  
  var `data-page-type`: js.UndefOr[String] = js.native
  
  var `data-partner-attribution-id`: js.UndefOr[String] = js.native
  
  var debug: js.UndefOr[Boolean | String] = js.native
  
  /*
    * @deprecated
    */
  var `disable-card`: js.UndefOr[String] = js.native
  
  var `disable-funding`: js.UndefOr[String] = js.native
  
  var `integration-date`: js.UndefOr[String] = js.native
  
  var intent: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var `merchant-id`: js.UndefOr[String] = js.native
  
  var vault: js.UndefOr[Boolean | String] = js.native
}
object ScriptOptions {
  
  @scala.inline
  def apply(`client-id`: String): ScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client-id")(`client-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptOptions]
  }
  
  @scala.inline
  implicit class ScriptOptionsOps[Self <: ScriptOptions] (val x: Self) extends AnyVal {
    
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
    def `setClient-id`(value: String): Self = this.set("client-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBuyer-country`(value: String): Self = this.set("buyer-country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBuyer-country`: Self = this.set("buyer-country", js.undefined)
    
    @scala.inline
    def setCommit(value: Boolean): Self = this.set("commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    
    @scala.inline
    def setComponents(value: String): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def `setData-client-token`(value: String): Self = this.set("data-client-token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteData-client-token`: Self = this.set("data-client-token", js.undefined)
    
    @scala.inline
    def `setData-csp-nonce`(value: String): Self = this.set("data-csp-nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteData-csp-nonce`: Self = this.set("data-csp-nonce", js.undefined)
    
    @scala.inline
    def `setData-order-id`(value: String): Self = this.set("data-order-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteData-order-id`: Self = this.set("data-order-id", js.undefined)
    
    @scala.inline
    def `setData-page-type`(value: String): Self = this.set("data-page-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteData-page-type`: Self = this.set("data-page-type", js.undefined)
    
    @scala.inline
    def `setData-partner-attribution-id`(value: String): Self = this.set("data-partner-attribution-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteData-partner-attribution-id`: Self = this.set("data-partner-attribution-id", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean | String): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def `setDisable-card`(value: String): Self = this.set("disable-card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDisable-card`: Self = this.set("disable-card", js.undefined)
    
    @scala.inline
    def `setDisable-funding`(value: String): Self = this.set("disable-funding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDisable-funding`: Self = this.set("disable-funding", js.undefined)
    
    @scala.inline
    def `setIntegration-date`(value: String): Self = this.set("integration-date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIntegration-date`: Self = this.set("integration-date", js.undefined)
    
    @scala.inline
    def setIntent(value: String): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntent: Self = this.set("intent", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def `setMerchant-id`(value: String): Self = this.set("merchant-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMerchant-id`: Self = this.set("merchant-id", js.undefined)
    
    @scala.inline
    def setVault(value: Boolean | String): Self = this.set("vault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVault: Self = this.set("vault", js.undefined)
  }
}
