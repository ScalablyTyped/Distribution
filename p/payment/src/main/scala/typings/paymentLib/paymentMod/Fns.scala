package typings
package paymentLib.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fns extends js.Object {
  /**
    * Parses a credit card expiry in the form of MM/YYYY, returning an object containing the `month` and `year`.
    * Shorthand years, such as `13` are also supported (and converted into the longhand, e.g. `2013`).
    */
  def cardExpiryVal(monthYear: java.lang.String): MonthYear = js.native
  def cardExpiryVal(monthYear: stdLib.HTMLInputElement): MonthYear = js.native
  /**
    * Returns a card type. Either:
    * * visa
    * * mastercard
    * * discover
    * * amex
    * * jcb
    * * dinersclub
    * * maestro
    * * laser
    * * unionpay
    * * elo
    *
    * The function will return null if the card type can't be determined.
    */
  def cardType(cardNumber: java.lang.String): java.lang.String = js.native
  /**
    * Formats a card number
    */
  def formatCardNumber(cardNumber: java.lang.String): java.lang.String = js.native
  /**
    * Validates a card CVC:
    * * Validates number
    * * Validates length to 4
    */
  def validateCardCVC(cvc: java.lang.String): scala.Boolean = js.native
  def validateCardCVC(cvc: java.lang.String, `type`: java.lang.String): scala.Boolean = js.native
  /**
    * Validates a card expiry:
    * * Validates numbers
    * * Validates in the future
    * * Supports year shorthand
    * * Supports formatted as formatCardExpiry input value
    */
  def validateCardExpiry(monthYear: java.lang.String): scala.Boolean = js.native
  def validateCardExpiry(monthYear: java.lang.String, year: java.lang.String): scala.Boolean = js.native
  /**
    * Validates a card number:
    * * Validates numbers
    * * Validates Luhn algorithm
    * * Validates length
    */
  def validateCardNumber(cardNumber: java.lang.String): scala.Boolean = js.native
}

