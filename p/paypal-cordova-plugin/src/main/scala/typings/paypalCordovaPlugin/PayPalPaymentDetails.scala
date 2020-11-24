package typings.paypalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The PayPalPaymentDetails class defines optional amount details.
  *
  * @see https://developer.paypal.com/webapps/developer/docs/api/#details-object for more details.
  */
@js.native
trait PayPalPaymentDetails extends js.Object {
  
  /**
    * Amount charged for shipping. 10 characters max with support for 2 decimal places.
    */
  var shipping: String = js.native
  
  /**
    * Sub-total (amount) of items being paid for. 10 characters max with support for 2 decimal places.
    */
  var subtotal: String = js.native
  
  /**
    * Amount charged for tax. 10 characters max with support for 2 decimal places.
    */
  var tax: String = js.native
}
object PayPalPaymentDetails {
  
  @scala.inline
  def apply(shipping: String, subtotal: String, tax: String): PayPalPaymentDetails = {
    val __obj = js.Dynamic.literal(shipping = shipping.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], tax = tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalPaymentDetails]
  }
  
  @scala.inline
  implicit class PayPalPaymentDetailsOps[Self <: PayPalPaymentDetails] (val x: Self) extends AnyVal {
    
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
    def setShipping(value: String): Self = this.set("shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtotal(value: String): Self = this.set("subtotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTax(value: String): Self = this.set("tax", value.asInstanceOf[js.Any])
  }
}
