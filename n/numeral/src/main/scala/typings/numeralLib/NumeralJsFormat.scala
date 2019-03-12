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
    format: (js.Any, java.lang.String, RoundingFunction) => java.lang.String,
    regexps: Anon_Format,
    unformat: java.lang.String => scala.Double
  ): NumeralJsFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format), regexps = regexps, unformat = js.Any.fromFunction1(unformat))
  
    __obj.asInstanceOf[NumeralJsFormat]
  }
}

