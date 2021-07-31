package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ConditionalTextComparisonRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TextConditionalFormat object, for use in `textConditionalFormat.set({ ... })`. */
trait TextConditionalFormatUpdateData extends StObject {
  
  /**
    *
    * Returns a format object, encapsulating the conditional format's font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatUpdateData] = js.undefined
  
  /**
    *
    * The rule of the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalTextComparisonRule] = js.undefined
}
object TextConditionalFormatUpdateData {
  
  @scala.inline
  def apply(): TextConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextConditionalFormatUpdateData]
  }
  
  @scala.inline
  implicit class TextConditionalFormatUpdateDataMutableBuilder[Self <: TextConditionalFormatUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: ConditionalRangeFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setRule(value: ConditionalTextComparisonRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
