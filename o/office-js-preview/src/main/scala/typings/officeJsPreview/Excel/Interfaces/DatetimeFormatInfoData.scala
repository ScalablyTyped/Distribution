package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `datetimeFormatInfo.toJSON()`. */
trait DatetimeFormatInfoData extends js.Object {
  /**
    *
    * Gets the string used as the date separator. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dateSeparator: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the format string for a long date value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var longDatePattern: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the format string for a long time value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var longTimePattern: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the format string for a short date value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var shortDatePattern: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the string used as the time separator. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var timeSeparator: js.UndefOr[String] = js.undefined
}

object DatetimeFormatInfoData {
  @scala.inline
  def apply(
    dateSeparator: String = null,
    longDatePattern: String = null,
    longTimePattern: String = null,
    shortDatePattern: String = null,
    timeSeparator: String = null
  ): DatetimeFormatInfoData = {
    val __obj = js.Dynamic.literal()
    if (dateSeparator != null) __obj.updateDynamic("dateSeparator")(dateSeparator.asInstanceOf[js.Any])
    if (longDatePattern != null) __obj.updateDynamic("longDatePattern")(longDatePattern.asInstanceOf[js.Any])
    if (longTimePattern != null) __obj.updateDynamic("longTimePattern")(longTimePattern.asInstanceOf[js.Any])
    if (shortDatePattern != null) __obj.updateDynamic("shortDatePattern")(shortDatePattern.asInstanceOf[js.Any])
    if (timeSeparator != null) __obj.updateDynamic("timeSeparator")(timeSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimeFormatInfoData]
  }
}

