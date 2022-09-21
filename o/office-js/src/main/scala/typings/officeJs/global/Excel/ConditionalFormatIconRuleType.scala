package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the types of icon conditional format.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatIconRuleType")
@js.native
object ConditionalFormatIconRuleType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ConditionalFormatIconRuleType & String] = js.native
  
  /* "Formula" */ val formula: typings.officeJs.Excel.ConditionalFormatIconRuleType.formula & String = js.native
  
  /* "Invalid" */ val invalid: typings.officeJs.Excel.ConditionalFormatIconRuleType.invalid & String = js.native
  
  /* "Number" */ val number: typings.officeJs.Excel.ConditionalFormatIconRuleType.number & String = js.native
  
  /* "Percent" */ val percent: typings.officeJs.Excel.ConditionalFormatIconRuleType.percent & String = js.native
  
  /* "Percentile" */ val percentile: typings.officeJs.Excel.ConditionalFormatIconRuleType.percentile & String = js.native
}
