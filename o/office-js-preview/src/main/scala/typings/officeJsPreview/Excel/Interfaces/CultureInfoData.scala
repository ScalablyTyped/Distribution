package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `cultureInfo.toJSON()`. */
trait CultureInfoData extends js.Object {
  /**
    *
    * Defines the culturally appropriate format of displaying date and time. This is based on current system culture settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var datetimeFormat: js.UndefOr[DatetimeFormatInfoData] = js.undefined
  /**
    *
    * Gets the culture name in the format languagecode2-country/regioncode2 (e.g., "zh-cn" or "en-us"). This is based on current system settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var numberFormat: js.UndefOr[NumberFormatInfoData] = js.undefined
}

object CultureInfoData {
  @scala.inline
  def apply(
    datetimeFormat: DatetimeFormatInfoData = null,
    name: String = null,
    numberFormat: NumberFormatInfoData = null
  ): CultureInfoData = {
    val __obj = js.Dynamic.literal()
    if (datetimeFormat != null) __obj.updateDynamic("datetimeFormat")(datetimeFormat.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[CultureInfoData]
  }
}

