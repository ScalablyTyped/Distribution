package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the criteria for the top/bottom values filter.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PivotFilterTopBottomCriterion")
@js.native
object PivotFilterTopBottomCriterion extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.PivotFilterTopBottomCriterion & String] = js.native
  
  /* "BottomItems" */ val bottomItems: typings.officeJs.Excel.PivotFilterTopBottomCriterion.bottomItems & String = js.native
  
  /* "BottomPercent" */ val bottomPercent: typings.officeJs.Excel.PivotFilterTopBottomCriterion.bottomPercent & String = js.native
  
  /* "BottomSum" */ val bottomSum: typings.officeJs.Excel.PivotFilterTopBottomCriterion.bottomSum & String = js.native
  
  /* "Invalid" */ val invalid: typings.officeJs.Excel.PivotFilterTopBottomCriterion.invalid & String = js.native
  
  /* "TopItems" */ val topItems: typings.officeJs.Excel.PivotFilterTopBottomCriterion.topItems & String = js.native
  
  /* "TopPercent" */ val topPercent: typings.officeJs.Excel.PivotFilterTopBottomCriterion.topPercent & String = js.native
  
  /* "TopSum" */ val topSum: typings.officeJs.Excel.PivotFilterTopBottomCriterion.topSum & String = js.native
}
