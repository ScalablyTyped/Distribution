package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `customConditionalFormat.toJSON()`. */
trait CustomConditionalFormatData extends StObject {
  
  /**
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatData] = js.undefined
  
  /**
    * Specifies the `Rule` object on this conditional format.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalFormatRuleData] = js.undefined
}
object CustomConditionalFormatData {
  
  inline def apply(): CustomConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomConditionalFormatData]
  }
  
  extension [Self <: CustomConditionalFormatData](x: Self) {
    
    inline def setFormat(value: ConditionalRangeFormatData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setRule(value: ConditionalFormatRuleData): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
