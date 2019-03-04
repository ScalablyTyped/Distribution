package typings
package numbroLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FourDigits extends js.Object {
  var fourDigits: numbroLib.numbroMod.numbroNs.Format
  var fullWithNoDecimals: numbroLib.numbroMod.numbroNs.Format
  var fullWithTwoDecimals: numbroLib.numbroMod.numbroNs.Format
  var fullWithTwoDecimalsNoCurrency: numbroLib.numbroMod.numbroNs.Format
}

object Anon_FourDigits {
  @scala.inline
  def apply(
    fourDigits: numbroLib.numbroMod.numbroNs.Format,
    fullWithNoDecimals: numbroLib.numbroMod.numbroNs.Format,
    fullWithTwoDecimals: numbroLib.numbroMod.numbroNs.Format,
    fullWithTwoDecimalsNoCurrency: numbroLib.numbroMod.numbroNs.Format
  ): Anon_FourDigits = {
    val __obj = js.Dynamic.literal(fourDigits = fourDigits, fullWithNoDecimals = fullWithNoDecimals, fullWithTwoDecimals = fullWithTwoDecimals, fullWithTwoDecimalsNoCurrency = fullWithTwoDecimalsNoCurrency)
  
    __obj.asInstanceOf[Anon_FourDigits]
  }
}

