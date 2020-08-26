package typings.numeral

import typings.numeral.anon.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://numeraljs.com/#custom-formats
@js.native
trait NumeralJsFormat extends js.Object {
  var regexps: Format = js.native
  def format(value: js.Any, format: String, roundingFunction: RoundingFunction): String = js.native
  def unformat(value: String): Double = js.native
}

object NumeralJsFormat {
  @scala.inline
  def apply(format: (js.Any, String, RoundingFunction) => String, regexps: Format, unformat: String => Double): NumeralJsFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format), regexps = regexps.asInstanceOf[js.Any], unformat = js.Any.fromFunction1(unformat))
    __obj.asInstanceOf[NumeralJsFormat]
  }
  @scala.inline
  implicit class NumeralJsFormatOps[Self <: NumeralJsFormat] (val x: Self) extends AnyVal {
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
    def setFormat(value: (js.Any, String, RoundingFunction) => String): Self = this.set("format", js.Any.fromFunction3(value))
    @scala.inline
    def setRegexps(value: Format): Self = this.set("regexps", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnformat(value: String => Double): Self = this.set("unformat", js.Any.fromFunction1(value))
  }
  
}

