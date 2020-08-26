package typings.minappEnv.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormatOptions extends js.Object {
  var currency: js.UndefOr[String] = js.native
  var currencyDisplay: js.UndefOr[String] = js.native
  var localeMatcher: js.UndefOr[String] = js.native
  var maximumFractionDigits: js.UndefOr[Double] = js.native
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  var minimumFractionDigits: js.UndefOr[Double] = js.native
  var minimumIntegerDigits: js.UndefOr[Double] = js.native
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  var style: js.UndefOr[String] = js.native
  var useGrouping: js.UndefOr[Boolean] = js.native
}

object NumberFormatOptions {
  @scala.inline
  def apply(): NumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormatOptions]
  }
  @scala.inline
  implicit class NumberFormatOptionsOps[Self <: NumberFormatOptions] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setCurrencyDisplay(value: String): Self = this.set("currencyDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyDisplay: Self = this.set("currencyDisplay", js.undefined)
    @scala.inline
    def setLocaleMatcher(value: String): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = this.set("maximumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumFractionDigits: Self = this.set("maximumFractionDigits", js.undefined)
    @scala.inline
    def setMaximumSignificantDigits(value: Double): Self = this.set("maximumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumSignificantDigits: Self = this.set("maximumSignificantDigits", js.undefined)
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = this.set("minimumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumFractionDigits: Self = this.set("minimumFractionDigits", js.undefined)
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = this.set("minimumIntegerDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumIntegerDigits: Self = this.set("minimumIntegerDigits", js.undefined)
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = this.set("minimumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumSignificantDigits: Self = this.set("minimumSignificantDigits", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUseGrouping(value: Boolean): Self = this.set("useGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseGrouping: Self = this.set("useGrouping", js.undefined)
  }
  
}

