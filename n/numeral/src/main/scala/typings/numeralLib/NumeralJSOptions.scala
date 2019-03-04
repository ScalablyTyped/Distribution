package typings
package numeralLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumeralJSOptions extends js.Object {
  var currentLocale: java.lang.String
  var defaultFormat: java.lang.String
  var nullFormat: java.lang.String
  var scalePercentBy100: scala.Boolean
  var zeroFormat: java.lang.String
}

object NumeralJSOptions {
  @scala.inline
  def apply(
    currentLocale: java.lang.String,
    defaultFormat: java.lang.String,
    nullFormat: java.lang.String,
    scalePercentBy100: scala.Boolean,
    zeroFormat: java.lang.String
  ): NumeralJSOptions = {
    val __obj = js.Dynamic.literal(currentLocale = currentLocale, defaultFormat = defaultFormat, nullFormat = nullFormat, scalePercentBy100 = scalePercentBy100, zeroFormat = zeroFormat)
  
    __obj.asInstanceOf[NumeralJSOptions]
  }
}

