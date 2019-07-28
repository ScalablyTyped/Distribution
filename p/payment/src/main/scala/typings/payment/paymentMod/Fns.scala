package typings.payment.paymentMod

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fns extends js.Object {
  /**
    * Parses a credit card expiry in the form of MM/YYYY, returning an object containing the `month` and `year`.
    * Shorthand years, such as `13` are also supported (and converted into the longhand, e.g. `2013`).
    */
  def cardExpiryVal(monthYear: String): MonthYear = js.native
  def cardExpiryVal(monthYear: HTMLInputElement): MonthYear = js.native
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
  def cardType(cardNumber: String): String = js.native
  /**
    * Formats a card number
    */
  def formatCardNumber(cardNumber: String): String = js.native
  /**
    * Validates a card CVC:
    * * Validates number
    * * Validates length to 4
    */
  def validateCardCVC(cvc: String): Boolean = js.native
  def validateCardCVC(cvc: String, `type`: String): Boolean = js.native
  /**
    * Validates a card expiry:
    * * Validates numbers
    * * Validates in the future
    * * Supports year shorthand
    * * Supports formatted as formatCardExpiry input value
    */
  def validateCardExpiry(monthYear: String): Boolean = js.native
  def validateCardExpiry(monthYear: String, year: String): Boolean = js.native
  /**
    * Validates a card number:
    * * Validates numbers
    * * Validates Luhn algorithm
    * * Validates length
    */
  def validateCardNumber(cardNumber: String): Boolean = js.native
}

