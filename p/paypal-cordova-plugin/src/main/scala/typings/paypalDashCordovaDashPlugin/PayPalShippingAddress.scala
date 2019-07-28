package typings.paypalDashCordovaDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PayPalShippingAddress")
@js.native
class PayPalShippingAddress protected () extends js.Object {
  /**
    * @param recipientName Name of the recipient at this address. 50 characters max.
    * @param line1 Line 1 of the address (e.g., Number, street, etc). 100 characters max.
    * @param line2 Line 2 of the address (e.g., Suite, apt #, etc). 100 characters max. Optional.
    * @param city City name. 50 characters max.
    * @param state 2-letter code for US states, and the equivalent for other countries. 100 characters max. Required in certain countries.
    * @param postalCode ZIP code or equivalent is usually required for countries that have them. 20 characters max. Required in certain countries.
    * @param countryCode 2-letter country code. 2 characters max.
    */
  def this(
    recipientName: String,
    line1: String,
    line2: String,
    city: String,
    state: String,
    postalCode: String,
    countryCode: String
  ) = this()
  /**
    * City name. 50 characters max.
    */
  var city: String = js.native
  /**
    * 2-letter country code. 2 characters max.
    */
  var countryCode: String = js.native
  /**
    * Line 1 of the address (e.g., Number, street, etc). 100 characters max.
    */
  var line1: String = js.native
  /**
    * Line 2 of the address (e.g., Suite, apt #, etc). 100 characters max. Optional.
    */
  var line2: String = js.native
  /**
    * ZIP code or equivalent is usually required for countries that have them. 20 characters max. Required in certain countries.
    */
  var postalCode: String = js.native
  /**
    * Name of the recipient at this address. 50 characters max.
    */
  var recipientName: String = js.native
  /**
    * 2-letter code for US states, and the equivalent for other countries. 100 characters max. Required in certain countries.
    */
  var state: String = js.native
}

