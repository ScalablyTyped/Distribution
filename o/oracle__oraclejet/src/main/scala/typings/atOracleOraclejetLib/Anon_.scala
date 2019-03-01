package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `Anon_` extends js.Object {
  var changeMonth: atOracleOraclejetLib.atOracleOraclejetLibStrings.select | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var changeYear: atOracleOraclejetLib.atOracleOraclejetLibStrings.select | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var currentMonthPos: scala.Double
  var daysOutsideMonth: atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.visible | atOracleOraclejetLib.atOracleOraclejetLibStrings.selectable
  var footerLayout: atOracleOraclejetLib.atOracleOraclejetLibStrings.Empty | atOracleOraclejetLib.atOracleOraclejetLibStrings.today
  var numberOfMonths: scala.Double
  var showOn: atOracleOraclejetLib.atOracleOraclejetLibStrings.focus | atOracleOraclejetLib.atOracleOraclejetLibStrings.image
  var stepBigMonths: scala.Double
  var stepMonths: atOracleOraclejetLib.atOracleOraclejetLibStrings.numberOfMonths | scala.Double
  var weekDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var yearRange: java.lang.String
}

object `Anon_` {
  @scala.inline
  def apply(
    changeMonth: atOracleOraclejetLib.atOracleOraclejetLibStrings.select | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    changeYear: atOracleOraclejetLib.atOracleOraclejetLibStrings.select | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    currentMonthPos: scala.Double,
    daysOutsideMonth: atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.visible | atOracleOraclejetLib.atOracleOraclejetLibStrings.selectable,
    footerLayout: atOracleOraclejetLib.atOracleOraclejetLibStrings.Empty | atOracleOraclejetLib.atOracleOraclejetLibStrings.today,
    numberOfMonths: scala.Double,
    showOn: atOracleOraclejetLib.atOracleOraclejetLibStrings.focus | atOracleOraclejetLib.atOracleOraclejetLibStrings.image,
    stepBigMonths: scala.Double,
    stepMonths: atOracleOraclejetLib.atOracleOraclejetLibStrings.numberOfMonths | scala.Double,
    weekDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    yearRange: java.lang.String
  ): `Anon_` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeMonth")(changeMonth.asInstanceOf[js.Any])
    __obj.updateDynamic("changeYear")(changeYear.asInstanceOf[js.Any])
    __obj.updateDynamic("currentMonthPos")(currentMonthPos)
    __obj.updateDynamic("daysOutsideMonth")(daysOutsideMonth.asInstanceOf[js.Any])
    __obj.updateDynamic("footerLayout")(footerLayout.asInstanceOf[js.Any])
    __obj.updateDynamic("numberOfMonths")(numberOfMonths)
    __obj.updateDynamic("showOn")(showOn.asInstanceOf[js.Any])
    __obj.updateDynamic("stepBigMonths")(stepBigMonths)
    __obj.updateDynamic("stepMonths")(stepMonths.asInstanceOf[js.Any])
    __obj.updateDynamic("weekDisplay")(weekDisplay.asInstanceOf[js.Any])
    __obj.updateDynamic("yearRange")(yearRange)
    __obj.asInstanceOf[`Anon_`]
  }
}

