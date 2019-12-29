package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PivotFilterTopBottomCriterion with String] = js.native
  /* "BottomItems" */ @js.native
  object bottomItems extends TopLevel[bottomItems with String]
  
  /* "BottomPercent" */ @js.native
  object bottomPercent extends TopLevel[bottomPercent with String]
  
  /* "BottomSum" */ @js.native
  object bottomSum extends TopLevel[bottomSum with String]
  
  /* "Invalid" */ @js.native
  object invalid extends TopLevel[invalid with String]
  
  /* "TopItems" */ @js.native
  object topItems extends TopLevel[topItems with String]
  
  /* "TopPercent" */ @js.native
  object topPercent extends TopLevel[topPercent with String]
  
  /* "TopSum" */ @js.native
  object topSum extends TopLevel[topSum with String]
  
}

