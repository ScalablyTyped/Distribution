package typings.paypalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The PayPalPaymentDetails class defines optional amount details.
  *
  * @see https://developer.paypal.com/webapps/developer/docs/api/#details-object for more details.
  */
@JSGlobal("PayPalPaymentDetails")
@js.native
class PayPalPaymentDetails protected () extends js.Object {
  /**
    * @param subtotal Sub-total (amount) of items being paid for. 10 characters max with support for 2 decimal places.
    * @param shipping Amount charged for shipping. 10 characters max with support for 2 decimal places.
    * @param tax Amount charged for tax. 10 characters max with support for 2 decimal places.
    */
  def this(subtotal: String, shipping: String, tax: String) = this()
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

