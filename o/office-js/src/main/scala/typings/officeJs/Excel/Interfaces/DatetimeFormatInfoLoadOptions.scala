package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
trait DatetimeFormatInfoLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the string used as the date separator. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var dateSeparator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the format string for a long date value. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var longDatePattern: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the format string for a long time value. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var longTimePattern: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the format string for a short date value. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var shortDatePattern: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the string used as the time separator. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var timeSeparator: js.UndefOr[Boolean] = js.undefined
}
object DatetimeFormatInfoLoadOptions {
  
  inline def apply(): DatetimeFormatInfoLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimeFormatInfoLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatetimeFormatInfoLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setDateSeparator(value: Boolean): Self = StObject.set(x, "dateSeparator", value.asInstanceOf[js.Any])
    
    inline def setDateSeparatorUndefined: Self = StObject.set(x, "dateSeparator", js.undefined)
    
    inline def setLongDatePattern(value: Boolean): Self = StObject.set(x, "longDatePattern", value.asInstanceOf[js.Any])
    
    inline def setLongDatePatternUndefined: Self = StObject.set(x, "longDatePattern", js.undefined)
    
    inline def setLongTimePattern(value: Boolean): Self = StObject.set(x, "longTimePattern", value.asInstanceOf[js.Any])
    
    inline def setLongTimePatternUndefined: Self = StObject.set(x, "longTimePattern", js.undefined)
    
    inline def setShortDatePattern(value: Boolean): Self = StObject.set(x, "shortDatePattern", value.asInstanceOf[js.Any])
    
    inline def setShortDatePatternUndefined: Self = StObject.set(x, "shortDatePattern", js.undefined)
    
    inline def setTimeSeparator(value: Boolean): Self = StObject.set(x, "timeSeparator", value.asInstanceOf[js.Any])
    
    inline def setTimeSeparatorUndefined: Self = StObject.set(x, "timeSeparator", js.undefined)
  }
}
