package typings.paypalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Convenience constructor. Returns a PayPalPayment with the specified amount, currency code, and short description.
  */
@JSGlobal("PayPalPayment")
@js.native
class PayPalPayment protected () extends js.Object {
  /**
    * @param amount The amount of the payment.
    * @param currencyCode The ISO 4217 currency for the payment.
    * @param shortDescription A short descripton of the payment.
    * @param intent • "Sale" for an immediate payment.
    * • "Auth" for payment authorization only, to be captured separately at a later time.
    * • "Order" for taking an order, with authorization and capture to be done separately at a later time.
    * @param details PayPalPaymentDetails object (optional).
    */
  def this(amount: String, currency: String, shortDescription: String, intent: String) = this()
  def this(
    amount: String,
    currency: String,
    shortDescription: String,
    intent: String,
    details: PayPalPaymentDetails
  ) = this()
  /**
    * The amount of the payment.
    */
  var amount: String = js.native
  /**
    * Optional Build Notation code ("BN code"), obtained from partnerprogram@paypal.com, for your tracking purposes.
    */
  var bnCode: String = js.native
  /**
    * The ISO 4217 currency for the payment.
    */
  var currency: String = js.native
  /**
    * Optional text, for your tracking purposes. (up to 256 characters).
    */
  var custom: String = js.native
  /**
    * PayPalPaymentDetails object (optional).
    */
  var details: PayPalPaymentDetails = js.native
  /**
    * • "Sale" for an immediate payment.
    * • "Auth" for payment authorization only, to be captured separately at a later time.
    * • "Order" for taking an order, with authorization and capture to be done separately at a later time.
    */
  var intent: String = js.native
  /**
    * Optional invoice number, for your tracking purposes. (up to 256 characters).
    */
  var invoiceNumber: String = js.native
  /**
    * Optional array of PayPalItem objects.
    * @see PayPalItem
    * @note If you provide one or more items, be sure that the various prices correctly sum to the payment `amount` or to `paymentDetails.subtotal`.
    */
  var items: js.Array[PayPalItem] = js.native
  /**
    * Optional customer shipping address, if your app wishes to provide this to the SDK.
    * @note make sure to set `payPalShippingAddressOption` in PayPalConfiguration to 1 or 3.
    */
  var shippingAddress: PayPalShippingAddress = js.native
  /**
    * A short descripton of the payment.
    */
  var shortDescription: String = js.native
  /**
    * Optional text which will appear on the customer's credit card statement. (up to 22 characters).
    */
  var softDescriptor: String = js.native
}

