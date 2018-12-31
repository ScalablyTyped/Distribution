package typings
package paypalDashCordovaDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PayPalItem")
@js.native
class PayPalItem protected () extends js.Object {
  /**
    * @param name Name of the item. 127 characters max.
    * @param quantity Number of units. 10 characters max.
    * @param price Unit price for this item 10 characters max.
    * May be negative for "coupon" etc.
    * @param currency ISO standard currency code.
    * @param sku The stock keeping unit for this item. 50 characters max (optional).
    */
  def this(name: java.lang.String, quantity: scala.Double, price: java.lang.String, currency: java.lang.String) = this()
  def this(name: java.lang.String, quantity: scala.Double, price: java.lang.String, currency: java.lang.String, sku: java.lang.String) = this()
  /**
    * ISO standard currency code.
    */
  var currency: java.lang.String = js.native
  /**
    * Name of the item. 127 characters max.
    */
  var name: java.lang.String = js.native
  /**
    * Unit price for this item 10 characters max.
    * May be negative for "coupon" etc.
    */
  var price: java.lang.String = js.native
  /**
    * Number of units. 10 characters max.
    */
  var quantity: scala.Double = js.native
  /**
    * The stock keeping unit for this item. 50 characters max (optional).
    */
  var sku: java.lang.String = js.native
}

