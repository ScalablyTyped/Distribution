package typings.paypalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Convenience constructor. Returns a PayPalPayment with the specified amount, currency code, and short description.
  */
trait PayPalPayment extends js.Object {
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
  @scala.inline
  def apply(
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
}

