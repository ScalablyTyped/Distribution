package typings.numbro

import typings.numbro.numbroMod.numbro.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FourDigits extends js.Object {
  var fourDigits: Format
  var fullWithNoDecimals: Format
  var fullWithTwoDecimals: Format
  var fullWithTwoDecimalsNoCurrency: Format
}

object Anon_FourDigits {
  @scala.inline
  def apply(
    fourDigits: Format,
    fullWithNoDecimals: Format,
    fullWithTwoDecimals: Format,
    fullWithTwoDecimalsNoCurrency: Format
  ): Anon_FourDigits = {
    val __obj = js.Dynamic.literal(fourDigits = fourDigits.asInstanceOf[js.Any], fullWithNoDecimals = fullWithNoDecimals.asInstanceOf[js.Any], fullWithTwoDecimals = fullWithTwoDecimals.asInstanceOf[js.Any], fullWithTwoDecimalsNoCurrency = fullWithTwoDecimalsNoCurrency.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FourDigits]
  }
}

