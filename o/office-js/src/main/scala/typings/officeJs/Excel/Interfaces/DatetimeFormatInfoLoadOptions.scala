package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
  *
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait DatetimeFormatInfoLoadOptions extends js.Object {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the string used as the date separator. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.12]
    */
  var dateSeparator: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the format string for a long date value. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.12]
    */
  var longDatePattern: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the format string for a long time value. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.12]
    */
  var longTimePattern: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the format string for a short date value. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.12]
    */
  var shortDatePattern: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the string used as the time separator. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.12]
    */
  var timeSeparator: js.UndefOr[Boolean] = js.native
}
object DatetimeFormatInfoLoadOptions {
  
  @scala.inline
  def apply(): DatetimeFormatInfoLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimeFormatInfoLoadOptions]
  }
  
  @scala.inline
  implicit class DatetimeFormatInfoLoadOptionsOps[Self <: DatetimeFormatInfoLoadOptions] (val x: Self) extends AnyVal {
    
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    
    @scala.inline
    def setDateSeparator(value: Boolean): Self = this.set("dateSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateSeparator: Self = this.set("dateSeparator", js.undefined)
    
    @scala.inline
    def setLongDatePattern(value: Boolean): Self = this.set("longDatePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongDatePattern: Self = this.set("longDatePattern", js.undefined)
    
    @scala.inline
    def setLongTimePattern(value: Boolean): Self = this.set("longTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongTimePattern: Self = this.set("longTimePattern", js.undefined)
    
    @scala.inline
    def setShortDatePattern(value: Boolean): Self = this.set("shortDatePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortDatePattern: Self = this.set("shortDatePattern", js.undefined)
    
    @scala.inline
    def setTimeSeparator(value: Boolean): Self = this.set("timeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeparator: Self = this.set("timeSeparator", js.undefined)
  }
}
