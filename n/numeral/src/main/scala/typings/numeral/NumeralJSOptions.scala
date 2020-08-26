package typings.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumeralJSOptions extends js.Object {
  var currentLocale: String = js.native
  var defaultFormat: String = js.native
  var nullFormat: String = js.native
  var scalePercentBy100: Boolean = js.native
  var zeroFormat: String = js.native
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
  @scala.inline
  implicit class NumeralJSOptionsOps[Self <: NumeralJSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentLocale(value: String): Self = this.set("currentLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultFormat(value: String): Self = this.set("defaultFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setNullFormat(value: String): Self = this.set("nullFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setScalePercentBy100(value: Boolean): Self = this.set("scalePercentBy100", value.asInstanceOf[js.Any])
    @scala.inline
    def setZeroFormat(value: String): Self = this.set("zeroFormat", value.asInstanceOf[js.Any])
  }
  
}

