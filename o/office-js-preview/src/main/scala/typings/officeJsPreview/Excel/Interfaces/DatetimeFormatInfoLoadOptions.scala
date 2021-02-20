package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
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
trait DatetimeFormatInfoLoadOptions extends StObject {
  
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
  implicit class DatetimeFormatInfoLoadOptionsMutableBuilder[Self <: DatetimeFormatInfoLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setDateSeparator(value: Boolean): Self = StObject.set(x, "dateSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateSeparatorUndefined: Self = StObject.set(x, "dateSeparator", js.undefined)
    
    @scala.inline
    def setLongDatePattern(value: Boolean): Self = StObject.set(x, "longDatePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDatePatternUndefined: Self = StObject.set(x, "longDatePattern", js.undefined)
    
    @scala.inline
    def setLongTimePattern(value: Boolean): Self = StObject.set(x, "longTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongTimePatternUndefined: Self = StObject.set(x, "longTimePattern", js.undefined)
    
    @scala.inline
    def setShortDatePattern(value: Boolean): Self = StObject.set(x, "shortDatePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDatePatternUndefined: Self = StObject.set(x, "shortDatePattern", js.undefined)
    
    @scala.inline
    def setTimeSeparator(value: Boolean): Self = StObject.set(x, "timeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeparatorUndefined: Self = StObject.set(x, "timeSeparator", js.undefined)
  }
}
