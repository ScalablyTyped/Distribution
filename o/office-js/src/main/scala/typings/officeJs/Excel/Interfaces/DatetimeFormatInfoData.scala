package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `datetimeFormatInfo.toJSON()`. */
trait DatetimeFormatInfoData extends StObject {
  
  /**
    * Gets the string used as the date separator. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var dateSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the format string for a long date value. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var longDatePattern: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the format string for a long time value. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var longTimePattern: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the format string for a short date value. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var shortDatePattern: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the string used as the time separator. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var timeSeparator: js.UndefOr[String] = js.undefined
}
object DatetimeFormatInfoData {
  
  inline def apply(): DatetimeFormatInfoData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimeFormatInfoData]
  }
  
  extension [Self <: DatetimeFormatInfoData](x: Self) {
    
    inline def setDateSeparator(value: String): Self = StObject.set(x, "dateSeparator", value.asInstanceOf[js.Any])
    
    inline def setDateSeparatorUndefined: Self = StObject.set(x, "dateSeparator", js.undefined)
    
    inline def setLongDatePattern(value: String): Self = StObject.set(x, "longDatePattern", value.asInstanceOf[js.Any])
    
    inline def setLongDatePatternUndefined: Self = StObject.set(x, "longDatePattern", js.undefined)
    
    inline def setLongTimePattern(value: String): Self = StObject.set(x, "longTimePattern", value.asInstanceOf[js.Any])
    
    inline def setLongTimePatternUndefined: Self = StObject.set(x, "longTimePattern", js.undefined)
    
    inline def setShortDatePattern(value: String): Self = StObject.set(x, "shortDatePattern", value.asInstanceOf[js.Any])
    
    inline def setShortDatePatternUndefined: Self = StObject.set(x, "shortDatePattern", js.undefined)
    
    inline def setTimeSeparator(value: String): Self = StObject.set(x, "timeSeparator", value.asInstanceOf[js.Any])
    
    inline def setTimeSeparatorUndefined: Self = StObject.set(x, "timeSeparator", js.undefined)
  }
}
