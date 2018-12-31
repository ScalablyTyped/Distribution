package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalTopBottomCriterionType extends js.Object

/**
  *
  * Represents the criteria for the above/below average conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalTopBottomCriterionType")
@js.native
object ConditionalTopBottomCriterionType extends js.Object {
  @js.native
  sealed trait bottomItems
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalTopBottomCriterionType
  
  @js.native
  sealed trait bottomPercent
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalTopBottomCriterionType
  
  @js.native
  sealed trait invalid
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalTopBottomCriterionType
  
  @js.native
  sealed trait topItems
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalTopBottomCriterionType
  
  @js.native
  sealed trait topPercent
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalTopBottomCriterionType
  
  /* "BottomItems" */ val bottomItems: bottomItems with java.lang.String = js.native
  /* "BottomPercent" */ val bottomPercent: bottomPercent with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "TopItems" */ val topItems: topItems with java.lang.String = js.native
  /* "TopPercent" */ val topPercent: topPercent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ConditionalTopBottomCriterionType with java.lang.String
  ] = js.native
}

