package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `cultureInfo.toJSON()`. */
trait CultureInfoData extends js.Object {
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
  def apply(name: String = null, numberFormat: NumberFormatInfoData = null): CultureInfoData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[CultureInfoData]
  }
}

