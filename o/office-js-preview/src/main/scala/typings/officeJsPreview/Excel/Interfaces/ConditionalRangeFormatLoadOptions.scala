package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * A format object encapsulating the conditional formats range's font, fill, borders, and other properties.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalRangeFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Collection of border objects that apply to the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borders: js.UndefOr[ConditionalRangeBorderCollectionLoadOptions] = js.undefined
  
  /**
    *
    * Returns the fill object defined on the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var fill: js.UndefOr[ConditionalRangeFillLoadOptions] = js.undefined
  
  /**
    *
    * Returns the font object defined on the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var font: js.UndefOr[ConditionalRangeFontLoadOptions] = js.undefined
  
  /**
    *
    * Represents Excel's number format code for the given range. Cleared if null is passed in.
    *
    * [Api set: ExcelApi 1.6]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
}
object ConditionalRangeFormatLoadOptions {
  
  @scala.inline
  def apply(): ConditionalRangeFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeFormatLoadOptions]
  }
  
  @scala.inline
  implicit class ConditionalRangeFormatLoadOptionsMutableBuilder[Self <: ConditionalRangeFormatLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setBorders(value: ConditionalRangeBorderCollectionLoadOptions): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    @scala.inline
    def setFill(value: ConditionalRangeFillLoadOptions): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFont(value: ConditionalRangeFontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: Boolean): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
  }
}
