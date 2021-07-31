package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the CustomConditionalFormat object, for use in `customConditionalFormat.set({ ... })`. */
trait CustomConditionalFormatUpdateData extends StObject {
  
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatUpdateData] = js.undefined
  
  /**
    *
    * Specifies the Rule object on this conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalFormatRuleUpdateData] = js.undefined
}
object CustomConditionalFormatUpdateData {
  
  @scala.inline
  def apply(): CustomConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomConditionalFormatUpdateData]
  }
  
  @scala.inline
  implicit class CustomConditionalFormatUpdateDataMutableBuilder[Self <: CustomConditionalFormatUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: ConditionalRangeFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setRule(value: ConditionalFormatRuleUpdateData): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
