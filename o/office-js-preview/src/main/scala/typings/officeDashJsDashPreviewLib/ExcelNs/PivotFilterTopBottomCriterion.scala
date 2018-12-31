package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PivotFilterTopBottomCriterion extends js.Object

/**
  *
  * Represents the criteria for the top/bottom values filter.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.PivotFilterTopBottomCriterion")
@js.native
object PivotFilterTopBottomCriterion extends js.Object {
  @js.native
  sealed trait bottomItems
    extends officeDashJsDashPreviewLib.ExcelNs.PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait bottomPercent
    extends officeDashJsDashPreviewLib.ExcelNs.PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait bottomSum
    extends officeDashJsDashPreviewLib.ExcelNs.PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait invalid
    extends officeDashJsDashPreviewLib.ExcelNs.PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait topItems
    extends officeDashJsDashPreviewLib.ExcelNs.PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait topPercent
    extends officeDashJsDashPreviewLib.ExcelNs.PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait topSum
    extends officeDashJsDashPreviewLib.ExcelNs.PivotFilterTopBottomCriterion
  
  /* "BottomItems" */ val bottomItems: bottomItems with java.lang.String = js.native
  /* "BottomPercent" */ val bottomPercent: bottomPercent with java.lang.String = js.native
  /* "BottomSum" */ val bottomSum: bottomSum with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "TopItems" */ val topItems: topItems with java.lang.String = js.native
  /* "TopPercent" */ val topPercent: topPercent with java.lang.String = js.native
  /* "TopSum" */ val topSum: topSum with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.PivotFilterTopBottomCriterion with java.lang.String
  ] = js.native
}

