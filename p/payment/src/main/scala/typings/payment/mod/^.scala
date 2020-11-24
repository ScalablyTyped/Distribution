package typings.payment.mod

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("payment", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var fns: Fns = js.native
  
  /**
    * Formats card CVC:
    * * Restricts length to 4 numbers
    * * Restricts input to numbers
    */
  def formatCardCVC(elem: HTMLInputElement): HTMLInputElement = js.native
  
  /**
    * Formats card expiry:
    * * Includes a / between the month and year
    * * Restricts input to numbers
    * * Restricts length
    */
  def formatCardExpiry(elem: HTMLInputElement): HTMLInputElement = js.native
  
  /**
    * Formats card numbers:
    * * Includes a space between every 4 digits
    * * Restricts input to numbers
    * * Limits to 16 numbers
    * * Supports American Express formatting
    * * Adds a class of the card type (e.g. 'visa') to the input
    */
  def formatCardNumber(elem: HTMLInputElement): HTMLInputElement = js.native
  
  /**
    * General numeric input restriction.
    */
  def restrictNumeric(elem: HTMLInputElement): HTMLInputElement = js.native
}
