package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ConditionalPresetCriteriaRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PresetCriteriaConditionalFormat object, for use in `presetCriteriaConditionalFormat.set({ ... })`. */
trait PresetCriteriaConditionalFormatUpdateData extends StObject {
  
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
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
  var rule: js.UndefOr[ConditionalPresetCriteriaRule] = js.undefined
}
object PresetCriteriaConditionalFormatUpdateData {
  
  inline def apply(): PresetCriteriaConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetCriteriaConditionalFormatUpdateData]
  }
  
  extension [Self <: PresetCriteriaConditionalFormatUpdateData](x: Self) {
    
    inline def setFormat(value: ConditionalRangeFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setRule(value: ConditionalPresetCriteriaRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
