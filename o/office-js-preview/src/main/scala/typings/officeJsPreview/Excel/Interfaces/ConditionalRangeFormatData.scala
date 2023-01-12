package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `conditionalRangeFormat.toJSON()`. */
trait ConditionalRangeFormatData extends StObject {
  
  /**
    * Collection of border objects that apply to the overall conditional format range.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var borders: js.UndefOr[js.Array[ConditionalRangeBorderData]] = js.undefined
  
  /**
    * Returns the fill object defined on the overall conditional format range.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var fill: js.UndefOr[ConditionalRangeFillData] = js.undefined
  
  /**
    * Returns the font object defined on the overall conditional format range.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var font: js.UndefOr[ConditionalRangeFontData] = js.undefined
  
  /**
    * Represents Excel's number format code for the given range. For more information about Excel number formatting, see {@link https://support.microsoft.com/office/number-format-codes-5026bbd6-04bc-48cd-bf33-80f18b4eae68 | Number format codes}.
    Cleared if `null` is passed in.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var numberFormat: js.UndefOr[Any] = js.undefined
}
object ConditionalRangeFormatData {
  
  inline def apply(): ConditionalRangeFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeFormatData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalRangeFormatData] (val x: Self) extends AnyVal {
    
    inline def setBorders(value: js.Array[ConditionalRangeBorderData]): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    inline def setBordersVarargs(value: ConditionalRangeBorderData*): Self = StObject.set(x, "borders", js.Array(value*))
    
    inline def setFill(value: ConditionalRangeFillData): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFont(value: ConditionalRangeFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setNumberFormat(value: Any): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
  }
}
