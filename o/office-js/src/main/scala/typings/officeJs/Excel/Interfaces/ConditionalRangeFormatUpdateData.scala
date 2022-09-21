package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ConditionalRangeFormat object, for use in `conditionalRangeFormat.set({ ... })`. */
trait ConditionalRangeFormatUpdateData extends StObject {
  
  /**
    * Collection of border objects that apply to the overall conditional format range.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var borders: js.UndefOr[ConditionalRangeBorderCollectionUpdateData] = js.undefined
  
  /**
    * Returns the fill object defined on the overall conditional format range.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var fill: js.UndefOr[ConditionalRangeFillUpdateData] = js.undefined
  
  /**
    * Returns the font object defined on the overall conditional format range.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var font: js.UndefOr[ConditionalRangeFontUpdateData] = js.undefined
  
  /**
    * Represents Excel's number format code for the given range. For more information about Excel number formatting, see {@link https://support.microsoft.com/office/number-format-codes-5026bbd6-04bc-48cd-bf33-80f18b4eae68 | Number format codes}.
    Cleared if `null` is passed in.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var numberFormat: js.UndefOr[Any] = js.undefined
}
object ConditionalRangeFormatUpdateData {
  
  inline def apply(): ConditionalRangeFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeFormatUpdateData]
  }
  
  extension [Self <: ConditionalRangeFormatUpdateData](x: Self) {
    
    inline def setBorders(value: ConditionalRangeBorderCollectionUpdateData): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    inline def setFill(value: ConditionalRangeFillUpdateData): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFont(value: ConditionalRangeFontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setNumberFormat(value: Any): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
  }
}
