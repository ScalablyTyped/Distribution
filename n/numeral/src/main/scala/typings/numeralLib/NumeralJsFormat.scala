package typings
package numeralLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://numeraljs.com/#custom-formats
trait NumeralJsFormat extends js.Object {
  var regexps: Anon_Format
  def format(value: js.Any, format: java.lang.String, roundingFunction: RoundingFunction): java.lang.String
  def unformat(value: java.lang.String): scala.Double
}

object NumeralJsFormat {
  @scala.inline
  def apply(
    format: js.Function3[js.Any, java.lang.String, RoundingFunction, java.lang.String],
    regexps: Anon_Format,
    unformat: js.Function1[java.lang.String, scala.Double]
  ): NumeralJsFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("regexps")(regexps)
    __obj.updateDynamic("unformat")(unformat)
    __obj.asInstanceOf[NumeralJsFormat]
  }
}

