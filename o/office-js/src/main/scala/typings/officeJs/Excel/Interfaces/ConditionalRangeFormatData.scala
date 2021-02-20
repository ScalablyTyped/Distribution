package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `conditionalRangeFormat.toJSON()`. */
@js.native
trait ConditionalRangeFormatData extends StObject {
  
  /**
    *
    * Collection of border objects that apply to the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borders: js.UndefOr[js.Array[ConditionalRangeBorderData]] = js.native
  
  /**
    *
    * Returns the fill object defined on the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var fill: js.UndefOr[ConditionalRangeFillData] = js.native
  
  /**
    *
    * Returns the font object defined on the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var font: js.UndefOr[ConditionalRangeFontData] = js.native
  
  /**
    *
    * Represents Excel's number format code for the given range. Cleared if null is passed in.
    *
    * [Api set: ExcelApi 1.6]
    */
  var numberFormat: js.UndefOr[js.Any] = js.native
}
object ConditionalRangeFormatData {
  
  @scala.inline
  def apply(): ConditionalRangeFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeFormatData]
  }
  
  @scala.inline
  implicit class ConditionalRangeFormatDataMutableBuilder[Self <: ConditionalRangeFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorders(value: js.Array[ConditionalRangeBorderData]): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    @scala.inline
    def setBordersVarargs(value: ConditionalRangeBorderData*): Self = StObject.set(x, "borders", js.Array(value :_*))
    
    @scala.inline
    def setFill(value: ConditionalRangeFillData): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFont(value: ConditionalRangeFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: js.Any): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
  }
}
