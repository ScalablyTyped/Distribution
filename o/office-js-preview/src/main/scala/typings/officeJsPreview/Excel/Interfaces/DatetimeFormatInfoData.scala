package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `datetimeFormatInfo.toJSON()`. */
@js.native
trait DatetimeFormatInfoData extends js.Object {
  /**
    *
    * Gets the string used as the date separator. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dateSeparator: js.UndefOr[String] = js.native
  /**
    *
    * Gets the format string for a long date value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var longDatePattern: js.UndefOr[String] = js.native
  /**
    *
    * Gets the format string for a long time value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var longTimePattern: js.UndefOr[String] = js.native
  /**
    *
    * Gets the format string for a short date value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var shortDatePattern: js.UndefOr[String] = js.native
  /**
    *
    * Gets the string used as the time separator. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var timeSeparator: js.UndefOr[String] = js.native
}

object DatetimeFormatInfoData {
  @scala.inline
  def apply(): DatetimeFormatInfoData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimeFormatInfoData]
  }
  @scala.inline
  implicit class DatetimeFormatInfoDataOps[Self <: DatetimeFormatInfoData] (val x: Self) extends AnyVal {
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
    def setDateSeparator(value: String): Self = this.set("dateSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateSeparator: Self = this.set("dateSeparator", js.undefined)
    @scala.inline
    def setLongDatePattern(value: String): Self = this.set("longDatePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongDatePattern: Self = this.set("longDatePattern", js.undefined)
    @scala.inline
    def setLongTimePattern(value: String): Self = this.set("longTimePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongTimePattern: Self = this.set("longTimePattern", js.undefined)
    @scala.inline
    def setShortDatePattern(value: String): Self = this.set("shortDatePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortDatePattern: Self = this.set("shortDatePattern", js.undefined)
    @scala.inline
    def setTimeSeparator(value: String): Self = this.set("timeSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeSeparator: Self = this.set("timeSeparator", js.undefined)
  }
  
}

