package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A format object encapsulating the conditional formats range's font, fill, borders, and other properties.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalRangeFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Collection of border objects that apply to the overall conditional format range.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var borders: js.UndefOr[ConditionalRangeBorderCollectionLoadOptions] = js.undefined
  
  /**
    * Returns the fill object defined on the overall conditional format range.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var fill: js.UndefOr[ConditionalRangeFillLoadOptions] = js.undefined
  
  /**
    * Returns the font object defined on the overall conditional format range.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var font: js.UndefOr[ConditionalRangeFontLoadOptions] = js.undefined
  
  /**
    * Represents Excel's number format code for the given range. For more information about Excel number formatting, see {@link https://support.microsoft.com/office/number-format-codes-5026bbd6-04bc-48cd-bf33-80f18b4eae68 | Number format codes}.
    Cleared if `null` is passed in.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
}
object ConditionalRangeFormatLoadOptions {
  
  inline def apply(): ConditionalRangeFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeFormatLoadOptions]
  }
  
  extension [Self <: ConditionalRangeFormatLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBorders(value: ConditionalRangeBorderCollectionLoadOptions): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    inline def setFill(value: ConditionalRangeFillLoadOptions): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFont(value: ConditionalRangeFontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setNumberFormat(value: Boolean): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
  }
}
