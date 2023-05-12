package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `numberFormatInfo.toJSON()`. */
trait NumberFormatInfoData extends StObject {
  
  /**
    * Gets the currency symbol for currency values. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.17]
    */
  var currencySymbol: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the string used as the decimal separator for numeric values. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var numberDecimalSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var numberGroupSeparator: js.UndefOr[String] = js.undefined
}
object NumberFormatInfoData {
  
  inline def apply(): NumberFormatInfoData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormatInfoData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberFormatInfoData] (val x: Self) extends AnyVal {
    
    inline def setCurrencySymbol(value: String): Self = StObject.set(x, "currencySymbol", value.asInstanceOf[js.Any])
    
    inline def setCurrencySymbolUndefined: Self = StObject.set(x, "currencySymbol", js.undefined)
    
    inline def setNumberDecimalSeparator(value: String): Self = StObject.set(x, "numberDecimalSeparator", value.asInstanceOf[js.Any])
    
    inline def setNumberDecimalSeparatorUndefined: Self = StObject.set(x, "numberDecimalSeparator", js.undefined)
    
    inline def setNumberGroupSeparator(value: String): Self = StObject.set(x, "numberGroupSeparator", value.asInstanceOf[js.Any])
    
    inline def setNumberGroupSeparatorUndefined: Self = StObject.set(x, "numberGroupSeparator", js.undefined)
  }
}
