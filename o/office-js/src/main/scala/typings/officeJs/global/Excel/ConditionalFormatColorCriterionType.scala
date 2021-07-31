package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the types of color criterion for conditional formatting.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatColorCriterionType")
@js.native
object ConditionalFormatColorCriterionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ConditionalFormatColorCriterionType & String] = js.native
  
  /* "Formula" */ val formula: typings.officeJs.Excel.ConditionalFormatColorCriterionType.formula & String = js.native
  
  /* "HighestValue" */ val highestValue: typings.officeJs.Excel.ConditionalFormatColorCriterionType.highestValue & String = js.native
  
  /* "Invalid" */ val invalid: typings.officeJs.Excel.ConditionalFormatColorCriterionType.invalid & String = js.native
  
  /* "LowestValue" */ val lowestValue: typings.officeJs.Excel.ConditionalFormatColorCriterionType.lowestValue & String = js.native
  
  /* "Number" */ val number: typings.officeJs.Excel.ConditionalFormatColorCriterionType.number & String = js.native
  
  /* "Percent" */ val percent: typings.officeJs.Excel.ConditionalFormatColorCriterionType.percent & String = js.native
  
  /* "Percentile" */ val percentile: typings.officeJs.Excel.ConditionalFormatColorCriterionType.percentile & String = js.native
}
