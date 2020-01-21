package typings.numbro

import typings.numbro.mod.numbro.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFourDigits extends js.Object {
  var fourDigits: Format
  var fullWithNoDecimals: Format
  var fullWithTwoDecimals: Format
  var fullWithTwoDecimalsNoCurrency: Format
}

object AnonFourDigits {
  @scala.inline
  def apply(
    fourDigits: Format,
    fullWithNoDecimals: Format,
    fullWithTwoDecimals: Format,
    fullWithTwoDecimalsNoCurrency: Format
  ): AnonFourDigits = {
    val __obj = js.Dynamic.literal(fourDigits = fourDigits.asInstanceOf[js.Any], fullWithNoDecimals = fullWithNoDecimals.asInstanceOf[js.Any], fullWithTwoDecimals = fullWithTwoDecimals.asInstanceOf[js.Any], fullWithTwoDecimalsNoCurrency = fullWithTwoDecimalsNoCurrency.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFourDigits]
  }
}

