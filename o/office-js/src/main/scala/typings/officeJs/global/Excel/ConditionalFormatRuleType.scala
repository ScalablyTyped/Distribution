package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the types of conditional format values.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatRuleType")
@js.native
object ConditionalFormatRuleType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ConditionalFormatRuleType & String] = js.native
  
  /* "Automatic" */ val automatic: typings.officeJs.Excel.ConditionalFormatRuleType.automatic & String = js.native
  
  /* "Formula" */ val formula: typings.officeJs.Excel.ConditionalFormatRuleType.formula & String = js.native
  
  /* "HighestValue" */ val highestValue: typings.officeJs.Excel.ConditionalFormatRuleType.highestValue & String = js.native
  
  /* "Invalid" */ val invalid: typings.officeJs.Excel.ConditionalFormatRuleType.invalid & String = js.native
  
  /* "LowestValue" */ val lowestValue: typings.officeJs.Excel.ConditionalFormatRuleType.lowestValue & String = js.native
  
  /* "Number" */ val number: typings.officeJs.Excel.ConditionalFormatRuleType.number & String = js.native
  
  /* "Percent" */ val percent: typings.officeJs.Excel.ConditionalFormatRuleType.percent & String = js.native
  
  /* "Percentile" */ val percentile: typings.officeJs.Excel.ConditionalFormatRuleType.percentile & String = js.native
}
