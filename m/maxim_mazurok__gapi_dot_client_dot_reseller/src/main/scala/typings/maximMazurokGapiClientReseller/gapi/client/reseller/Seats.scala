package typings.maximMazurokGapiClientReseller.gapi.client.reseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Seats extends js.Object {
  
  /** Identifies the resource as a subscription seat setting. Value: subscriptions#seats */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Read-only field containing the current number of users that are assigned a license for the product defined in skuId. This field's value is equivalent to the numerical count of users
    * returned by the Enterprise License Manager API method: listForProductAndSku
    */
  var licensedNumberOfSeats: js.UndefOr[Double] = js.native
  
  /**
    * This is a required property and is exclusive to subscriptions with FLEXIBLE or TRIAL plans. This property sets the maximum number of licensed users allowed on a subscription. This
    * quantity can be increased up to the maximum limit defined in the reseller's contract. The minimum quantity is the current number of users in the customer account. Note: G Suite
    * subscriptions automatically assign a license to every user.
    */
  var maximumNumberOfSeats: js.UndefOr[Double] = js.native
  
  /**
    * This is a required property and is exclusive to subscriptions with ANNUAL_MONTHLY_PAY and ANNUAL_YEARLY_PAY plans. This property sets the maximum number of licenses assignable to
    * users on a subscription. The reseller can add more licenses, but once set, the numberOfSeats cannot be reduced until renewal. The reseller is invoiced based on the numberOfSeats
    * value regardless of how many of these user licenses are assigned. Note: G Suite subscriptions automatically assign a license to every user.
    */
  var numberOfSeats: js.UndefOr[Double] = js.native
}
object Seats {
  
  @scala.inline
  def apply(): Seats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seats]
  }
  
  @scala.inline
  implicit class SeatsOps[Self <: Seats] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLicensedNumberOfSeats(value: Double): Self = this.set("licensedNumberOfSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicensedNumberOfSeats: Self = this.set("licensedNumberOfSeats", js.undefined)
    
    @scala.inline
    def setMaximumNumberOfSeats(value: Double): Self = this.set("maximumNumberOfSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumNumberOfSeats: Self = this.set("maximumNumberOfSeats", js.undefined)
    
    @scala.inline
    def setNumberOfSeats(value: Double): Self = this.set("numberOfSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfSeats: Self = this.set("numberOfSeats", js.undefined)
  }
}
