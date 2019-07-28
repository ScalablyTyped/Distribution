package typings.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://numeraljs.com/#custom-formats
trait NumeralJsFormat extends js.Object {
  var regexps: Anon_Format
  def format(value: js.Any, format: String, roundingFunction: RoundingFunction): String
  def unformat(value: String): Double
}

object NumeralJsFormat {
  @scala.inline
  def apply(
    format: (js.Any, String, RoundingFunction) => String,
    regexps: Anon_Format,
    unformat: String => Double
  ): NumeralJsFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format), regexps = regexps, unformat = js.Any.fromFunction1(unformat))
  
    __obj.asInstanceOf[NumeralJsFormat]
  }
}

