package typings.paypalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Convenience constructor. Returns a PayPalPayment with the specified amount, currency code, and short description.
  */
trait PayPalPayment extends StObject {
  
  /**
    * The amount of the payment.
    */
  var amount: String
  
  /**
    * Optional Build Notation code ("BN code"), obtained from partnerprogram@paypal.com, for your tracking purposes.
    */
  var bnCode: String
  
  /**
    * The ISO 4217 currency for the payment.
    */
  var currency: String
  
  /**
    * Optional text, for your tracking purposes. (up to 256 characters).
    */
  var custom: String
  
  /**
    * PayPalPaymentDetails object (optional).
    */
  var details: PayPalPaymentDetails
  
  /**
    * • "Sale" for an immediate payment.
    * • "Auth" for payment authorization only, to be captured separately at a later time.
    * • "Order" for taking an order, with authorization and capture to be done separately at a later time.
    */
  var intent: String
  
  /**
    * Optional invoice number, for your tracking purposes. (up to 256 characters).
    */
  var invoiceNumber: String
  
  /**
    * Optional array of PayPalItem objects.
    * @see PayPalItem
    * @note If you provide one or more items, be sure that the various prices correctly sum to the payment `amount` or to `paymentDetails.subtotal`.
    */
  var items: js.Array[PayPalItem]
  
  /**
    * Optional customer shipping address, if your app wishes to provide this to the SDK.
    * @note make sure to set `payPalShippingAddressOption` in PayPalConfiguration to 1 or 3.
    */
  var shippingAddress: PayPalShippingAddress
  
  /**
    * A short descripton of the payment.
    */
  var shortDescription: String
  
  /**
    * Optional text which will appear on the customer's credit card statement. (up to 22 characters).
    */
  var softDescriptor: String
}
object PayPalPayment {
  
  inline def apply(
    amount: String,
    bnCode: String,
    currency: String,
    custom: String,
    details: PayPalPaymentDetails,
    intent: String,
    invoiceNumber: String,
    items: js.Array[PayPalItem],
    shippingAddress: PayPalShippingAddress,
    shortDescription: String,
    softDescriptor: String
  ): PayPalPayment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], bnCode = bnCode.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], invoiceNumber = invoiceNumber.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], shippingAddress = shippingAddress.asInstanceOf[js.Any], shortDescription = shortDescription.asInstanceOf[js.Any], softDescriptor = softDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalPayment]
  }
  
  extension [Self <: PayPalPayment](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBnCode(value: String): Self = StObject.set(x, "bnCode", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCustom(value: String): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: PayPalPaymentDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNumber(value: String): Self = StObject.set(x, "invoiceNumber", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[PayPalItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: PayPalItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setShippingAddress(value: PayPalShippingAddress): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setSoftDescriptor(value: String): Self = StObject.set(x, "softDescriptor", value.asInstanceOf[js.Any])
  }
}
