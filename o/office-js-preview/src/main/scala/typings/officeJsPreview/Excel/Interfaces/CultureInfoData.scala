package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `cultureInfo.toJSON()`. */
trait CultureInfoData extends StObject {
  
  /**
    * Defines the culturally appropriate format of displaying date and time. This is based on current system culture settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var datetimeFormat: js.UndefOr[DatetimeFormatInfoData] = js.undefined
  
  /**
    * Gets the culture name in the format languagecode2-country/regioncode2 (e.g., "zh-cn" or "en-us"). This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var numberFormat: js.UndefOr[NumberFormatInfoData] = js.undefined
}
object CultureInfoData {
  
  inline def apply(): CultureInfoData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CultureInfoData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CultureInfoData] (val x: Self) extends AnyVal {
    
    inline def setDatetimeFormat(value: DatetimeFormatInfoData): Self = StObject.set(x, "datetimeFormat", value.asInstanceOf[js.Any])
    
    inline def setDatetimeFormatUndefined: Self = StObject.set(x, "datetimeFormat", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumberFormat(value: NumberFormatInfoData): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
  }
}
