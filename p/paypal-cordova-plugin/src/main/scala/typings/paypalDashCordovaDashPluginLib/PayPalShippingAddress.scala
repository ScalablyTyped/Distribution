package typings
package paypalDashCordovaDashPluginLib

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
  def this(recipientName: java.lang.String, line1: java.lang.String, line2: java.lang.String, city: java.lang.String, state: java.lang.String, postalCode: java.lang.String, countryCode: java.lang.String) = this()
  /**
       * City name. 50 characters max.
       */
  var city: java.lang.String = js.native
  /**
       * 2-letter country code. 2 characters max.
       */
  var countryCode: java.lang.String = js.native
  /**
       * Line 1 of the address (e.g., Number, street, etc). 100 characters max.
       */
  var line1: java.lang.String = js.native
  /**
       * Line 2 of the address (e.g., Suite, apt #, etc). 100 characters max. Optional.
       */
  var line2: java.lang.String = js.native
  /**
       * ZIP code or equivalent is usually required for countries that have them. 20 characters max. Required in certain countries.
       */
  var postalCode: java.lang.String = js.native
  /**
       * Name of the recipient at this address. 50 characters max.
       */
  var recipientName: java.lang.String = js.native
  /**
       * 2-letter code for US states, and the equivalent for other countries. 100 characters max. Required in certain countries.
       */
  var state: java.lang.String = js.native
}

