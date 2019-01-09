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

