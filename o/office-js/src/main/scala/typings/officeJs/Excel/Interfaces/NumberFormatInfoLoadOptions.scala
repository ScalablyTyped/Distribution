package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
  *
  * [Api set: ExcelApi 1.11]
  */
trait NumberFormatInfoLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var numberDecimalSeparator: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var numberGroupSeparator: js.UndefOr[Boolean] = js.undefined
}
object NumberFormatInfoLoadOptions {
  
  inline def apply(): NumberFormatInfoLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormatInfoLoadOptions]
  }
  
  extension [Self <: NumberFormatInfoLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setNumberDecimalSeparator(value: Boolean): Self = StObject.set(x, "numberDecimalSeparator", value.asInstanceOf[js.Any])
    
    inline def setNumberDecimalSeparatorUndefined: Self = StObject.set(x, "numberDecimalSeparator", js.undefined)
    
    inline def setNumberGroupSeparator(value: Boolean): Self = StObject.set(x, "numberGroupSeparator", value.asInstanceOf[js.Any])
    
    inline def setNumberGroupSeparatorUndefined: Self = StObject.set(x, "numberGroupSeparator", js.undefined)
  }
}
