package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the criteria for the top/bottom values filter.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PivotFilterTopBottomCriterion")
@js.native
object PivotFilterTopBottomCriterion extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.PivotFilterTopBottomCriterion with String] = js.native
  
  /* "BottomItems" */ val bottomItems: typings.officeJs.Excel.PivotFilterTopBottomCriterion.bottomItems with String = js.native
  
  /* "BottomPercent" */ val bottomPercent: typings.officeJs.Excel.PivotFilterTopBottomCriterion.bottomPercent with String = js.native
  
  /* "BottomSum" */ val bottomSum: typings.officeJs.Excel.PivotFilterTopBottomCriterion.bottomSum with String = js.native
  
  /* "Invalid" */ val invalid: typings.officeJs.Excel.PivotFilterTopBottomCriterion.invalid with String = js.native
  
  /* "TopItems" */ val topItems: typings.officeJs.Excel.PivotFilterTopBottomCriterion.topItems with String = js.native
  
  /* "TopPercent" */ val topPercent: typings.officeJs.Excel.PivotFilterTopBottomCriterion.topPercent with String = js.native
  
  /* "TopSum" */ val topSum: typings.officeJs.Excel.PivotFilterTopBottomCriterion.topSum with String = js.native
}
