package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PivotFilterTopBottomCriterion extends js.Object

/**
  *
  * Represents the criteria for the top/bottom values filter.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PivotFilterTopBottomCriterion")
@js.native
object PivotFilterTopBottomCriterion extends js.Object {
  @js.native
  sealed trait bottomItems extends PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait bottomPercent extends PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait bottomSum extends PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait invalid extends PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait topItems extends PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait topPercent extends PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait topSum extends PivotFilterTopBottomCriterion
  
  /* "BottomItems" */ val bottomItems: typings.officeDashJsDashPreview.Excel.PivotFilterTopBottomCriterion.bottomItems with String = js.native
  /* "BottomPercent" */ val bottomPercent: typings.officeDashJsDashPreview.Excel.PivotFilterTopBottomCriterion.bottomPercent with String = js.native
  /* "BottomSum" */ val bottomSum: typings.officeDashJsDashPreview.Excel.PivotFilterTopBottomCriterion.bottomSum with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJsDashPreview.Excel.PivotFilterTopBottomCriterion.invalid with String = js.native
  /* "TopItems" */ val topItems: typings.officeDashJsDashPreview.Excel.PivotFilterTopBottomCriterion.topItems with String = js.native
  /* "TopPercent" */ val topPercent: typings.officeDashJsDashPreview.Excel.PivotFilterTopBottomCriterion.topPercent with String = js.native
  /* "TopSum" */ val topSum: typings.officeDashJsDashPreview.Excel.PivotFilterTopBottomCriterion.topSum with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PivotFilterTopBottomCriterion with String] = js.native
}

