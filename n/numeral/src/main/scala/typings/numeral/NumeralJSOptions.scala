package typings.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumeralJSOptions extends js.Object {
  var currentLocale: String
  var defaultFormat: String
  var nullFormat: String
  var scalePercentBy100: Boolean
  var zeroFormat: String
}

object NumeralJSOptions {
  @scala.inline
  def apply(
    currentLocale: String,
    defaultFormat: String,
    nullFormat: String,
    scalePercentBy100: Boolean,
    zeroFormat: String
  ): NumeralJSOptions = {
    val __obj = js.Dynamic.literal(currentLocale = currentLocale.asInstanceOf[js.Any], defaultFormat = defaultFormat.asInstanceOf[js.Any], nullFormat = nullFormat.asInstanceOf[js.Any], scalePercentBy100 = scalePercentBy100.asInstanceOf[js.Any], zeroFormat = zeroFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NumeralJSOptions]
  }
}

