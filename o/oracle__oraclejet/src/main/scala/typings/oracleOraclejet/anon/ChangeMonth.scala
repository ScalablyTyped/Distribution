package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings._empty
import typings.oracleOraclejet.oracleOraclejetStrings.focus
import typings.oracleOraclejet.oracleOraclejetStrings.hidden
import typings.oracleOraclejet.oracleOraclejetStrings.image
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.number
import typings.oracleOraclejet.oracleOraclejetStrings.numberOfMonths
import typings.oracleOraclejet.oracleOraclejetStrings.select
import typings.oracleOraclejet.oracleOraclejetStrings.selectable
import typings.oracleOraclejet.oracleOraclejetStrings.today
import typings.oracleOraclejet.oracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeMonth extends js.Object {
  var changeMonth: select | none = js.native
  var changeYear: select | none = js.native
  var currentMonthPos: Double = js.native
  var daysOutsideMonth: hidden | visible | selectable = js.native
  var footerLayout: _empty | today = js.native
  var numberOfMonths: Double = js.native
  var showOn: focus | image = js.native
  var stepBigMonths: Double = js.native
  var stepMonths: numberOfMonths | Double = js.native
  var weekDisplay: number | none = js.native
  var yearRange: String = js.native
}

object ChangeMonth {
  @scala.inline
  def apply(
    changeMonth: select | none,
    changeYear: select | none,
    currentMonthPos: Double,
    daysOutsideMonth: hidden | visible | selectable,
    footerLayout: _empty | today,
    numberOfMonths: Double,
    showOn: focus | image,
    stepBigMonths: Double,
    stepMonths: numberOfMonths | Double,
    weekDisplay: number | none,
    yearRange: String
  ): ChangeMonth = {
    val __obj = js.Dynamic.literal(changeMonth = changeMonth.asInstanceOf[js.Any], changeYear = changeYear.asInstanceOf[js.Any], currentMonthPos = currentMonthPos.asInstanceOf[js.Any], daysOutsideMonth = daysOutsideMonth.asInstanceOf[js.Any], footerLayout = footerLayout.asInstanceOf[js.Any], numberOfMonths = numberOfMonths.asInstanceOf[js.Any], showOn = showOn.asInstanceOf[js.Any], stepBigMonths = stepBigMonths.asInstanceOf[js.Any], stepMonths = stepMonths.asInstanceOf[js.Any], weekDisplay = weekDisplay.asInstanceOf[js.Any], yearRange = yearRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMonth]
  }
  @scala.inline
  implicit class ChangeMonthOps[Self <: ChangeMonth] (val x: Self) extends AnyVal {
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
    def setChangeMonth(value: select | none): Self = this.set("changeMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeYear(value: select | none): Self = this.set("changeYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentMonthPos(value: Double): Self = this.set("currentMonthPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setDaysOutsideMonth(value: hidden | visible | selectable): Self = this.set("daysOutsideMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooterLayout(value: _empty | today): Self = this.set("footerLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfMonths(value: Double): Self = this.set("numberOfMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowOn(value: focus | image): Self = this.set("showOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepBigMonths(value: Double): Self = this.set("stepBigMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepMonths(value: numberOfMonths | Double): Self = this.set("stepMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekDisplay(value: number | none): Self = this.set("weekDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearRange(value: String): Self = this.set("yearRange", value.asInstanceOf[js.Any])
  }
  
}

