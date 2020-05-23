package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait DatetimeFormatInfoLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the string used as the date separator. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dateSeparator: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the format string for a long date value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var longDatePattern: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the format string for a long time value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var longTimePattern: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the format string for a short date value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var shortDatePattern: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the string used as the time separator. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var timeSeparator: js.UndefOr[Boolean] = js.undefined
}

object DatetimeFormatInfoLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    dateSeparator: js.UndefOr[Boolean] = js.undefined,
    longDatePattern: js.UndefOr[Boolean] = js.undefined,
    longTimePattern: js.UndefOr[Boolean] = js.undefined,
    shortDatePattern: js.UndefOr[Boolean] = js.undefined,
    timeSeparator: js.UndefOr[Boolean] = js.undefined
  ): DatetimeFormatInfoLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dateSeparator)) __obj.updateDynamic("dateSeparator")(dateSeparator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longDatePattern)) __obj.updateDynamic("longDatePattern")(longDatePattern.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longTimePattern)) __obj.updateDynamic("longTimePattern")(longTimePattern.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shortDatePattern)) __obj.updateDynamic("shortDatePattern")(shortDatePattern.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeSeparator)) __obj.updateDynamic("timeSeparator")(timeSeparator.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimeFormatInfoLoadOptions]
  }
}

