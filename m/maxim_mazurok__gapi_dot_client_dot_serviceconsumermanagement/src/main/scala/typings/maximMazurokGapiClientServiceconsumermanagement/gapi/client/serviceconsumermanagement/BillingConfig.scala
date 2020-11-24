package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingConfig extends js.Object {
  
  /** Name of the billing account. For example `billingAccounts/012345-567890-ABCDEF`. */
  var billingAccount: js.UndefOr[String] = js.native
}
object BillingConfig {
  
  @scala.inline
  def apply(): BillingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingConfig]
  }
  
  @scala.inline
  implicit class BillingConfigOps[Self <: BillingConfig] (val x: Self) extends AnyVal {
    
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
    def setBillingAccount(value: String): Self = this.set("billingAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingAccount: Self = this.set("billingAccount", js.undefined)
  }
}
