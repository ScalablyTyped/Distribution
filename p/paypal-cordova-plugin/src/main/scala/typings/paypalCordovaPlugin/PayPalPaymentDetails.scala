package typings.paypalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The PayPalPaymentDetails class defines optional amount details.
  *
  * @see https://developer.paypal.com/webapps/developer/docs/api/#details-object for more details.
  */
@js.native
trait PayPalPaymentDetails extends StObject {
  
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
  implicit class PayPalPaymentDetailsMutableBuilder[Self <: PayPalPaymentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShipping(value: String): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtotal(value: String): Self = StObject.set(x, "subtotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTax(value: String): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
  }
}
