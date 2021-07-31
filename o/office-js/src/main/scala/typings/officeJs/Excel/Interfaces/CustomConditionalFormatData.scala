package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `customConditionalFormat.toJSON()`. */
trait CustomConditionalFormatData extends StObject {
  
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatData] = js.undefined
  
  /**
    *
    * Specifies the Rule object on this conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalFormatRuleData] = js.undefined
}
object CustomConditionalFormatData {
  
  @scala.inline
  def apply(): CustomConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomConditionalFormatData]
  }
  
  @scala.inline
  implicit class CustomConditionalFormatDataMutableBuilder[Self <: CustomConditionalFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: ConditionalRangeFormatData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setRule(value: ConditionalFormatRuleData): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
