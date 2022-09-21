package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ConditionalPresetCriteriaRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `presetCriteriaConditionalFormat.toJSON()`. */
trait PresetCriteriaConditionalFormatData extends StObject {
  
  /**
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatData] = js.undefined
  
  /**
    * The rule of the conditional format.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalPresetCriteriaRule] = js.undefined
}
object PresetCriteriaConditionalFormatData {
  
  inline def apply(): PresetCriteriaConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetCriteriaConditionalFormatData]
  }
  
  extension [Self <: PresetCriteriaConditionalFormatData](x: Self) {
    
    inline def setFormat(value: ConditionalRangeFormatData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setRule(value: ConditionalPresetCriteriaRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
