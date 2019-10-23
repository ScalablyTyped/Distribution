package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `numberFormatInfo.toJSON()`. */
trait NumberFormatInfoData extends js.Object {
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberDecimalSeparator: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberGroupSeparator: js.UndefOr[String] = js.undefined
}

object NumberFormatInfoData {
  @scala.inline
  def apply(numberDecimalSeparator: String = null, numberGroupSeparator: String = null): NumberFormatInfoData = {
    val __obj = js.Dynamic.literal()
    if (numberDecimalSeparator != null) __obj.updateDynamic("numberDecimalSeparator")(numberDecimalSeparator)
    if (numberGroupSeparator != null) __obj.updateDynamic("numberGroupSeparator")(numberGroupSeparator)
    __obj.asInstanceOf[NumberFormatInfoData]
  }
}

