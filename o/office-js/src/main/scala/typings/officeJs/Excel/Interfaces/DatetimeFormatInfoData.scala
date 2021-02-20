package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `datetimeFormatInfo.toJSON()`. */
@js.native
trait DatetimeFormatInfoData extends StObject {
  
  /**
    *
    * Gets the string used as the date separator. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.12]
    */
  var dateSeparator: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the format string for a long date value. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.12]
    */
  var longDatePattern: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the format string for a long time value. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.12]
    */
  var longTimePattern: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the format string for a short date value. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.12]
    */
  var shortDatePattern: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the string used as the time separator. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.12]
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
  implicit class DatetimeFormatInfoDataMutableBuilder[Self <: DatetimeFormatInfoData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateSeparator(value: String): Self = StObject.set(x, "dateSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateSeparatorUndefined: Self = StObject.set(x, "dateSeparator", js.undefined)
    
    @scala.inline
    def setLongDatePattern(value: String): Self = StObject.set(x, "longDatePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDatePatternUndefined: Self = StObject.set(x, "longDatePattern", js.undefined)
    
    @scala.inline
    def setLongTimePattern(value: String): Self = StObject.set(x, "longTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongTimePatternUndefined: Self = StObject.set(x, "longTimePattern", js.undefined)
    
    @scala.inline
    def setShortDatePattern(value: String): Self = StObject.set(x, "shortDatePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDatePatternUndefined: Self = StObject.set(x, "shortDatePattern", js.undefined)
    
    @scala.inline
    def setTimeSeparator(value: String): Self = StObject.set(x, "timeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeparatorUndefined: Self = StObject.set(x, "timeSeparator", js.undefined)
  }
}
