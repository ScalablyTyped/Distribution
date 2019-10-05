package typings.nanp

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nanp extends js.Object {
  /**
    * Test if a string is a North American Number Plan (phone) number.
    * 
    * @param {string} phoneNumber The phone number being tested.
    * @returns {boolean} True if the given phoneNumber is a NANP number.
    */
  def apply(string: String): Boolean = js.native
  /**
    * Removes all parenthesis, dashes, dots, spaces.
    * Removes leading `1` or `+1` only on strings longer than 10 digits 
    * 
    * @param {string} phoneNumber The phone number that is being stripped.
    * @returns {string}
    */
  def strip(phoneNumber: String): String = js.native
}

@JSGlobal("nanp")
@js.native
object nanp extends TopLevel[Nanp]

