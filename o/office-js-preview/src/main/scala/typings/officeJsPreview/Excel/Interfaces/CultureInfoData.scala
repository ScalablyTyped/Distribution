package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `cultureInfo.toJSON()`. */
@js.native
trait CultureInfoData extends js.Object {
  /**
    *
    * Defines the culturally appropriate format of displaying date and time. This is based on current system culture settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var datetimeFormat: js.UndefOr[DatetimeFormatInfoData] = js.native
  /**
    *
    * Gets the culture name in the format languagecode2-country/regioncode2 (e.g., "zh-cn" or "en-us"). This is based on current system settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var numberFormat: js.UndefOr[NumberFormatInfoData] = js.native
}

object CultureInfoData {
  @scala.inline
  def apply(): CultureInfoData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CultureInfoData]
  }
  @scala.inline
  implicit class CultureInfoDataOps[Self <: CultureInfoData] (val x: Self) extends AnyVal {
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
    def setDatetimeFormat(value: DatetimeFormatInfoData): Self = this.set("datetimeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatetimeFormat: Self = this.set("datetimeFormat", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNumberFormat(value: NumberFormatInfoData): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
  }
  
}

