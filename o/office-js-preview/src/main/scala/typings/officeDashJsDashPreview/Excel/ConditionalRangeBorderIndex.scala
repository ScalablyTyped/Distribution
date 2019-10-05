package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalRangeBorderIndex extends js.Object

/**
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalRangeBorderIndex")
@js.native
object ConditionalRangeBorderIndex extends js.Object {
  @js.native
  sealed trait edgeBottom extends ConditionalRangeBorderIndex
  
  @js.native
  sealed trait edgeLeft extends ConditionalRangeBorderIndex
  
  @js.native
  sealed trait edgeRight extends ConditionalRangeBorderIndex
  
  @js.native
  sealed trait edgeTop extends ConditionalRangeBorderIndex
  
  /* "EdgeBottom" */ val edgeBottom: typings.officeDashJsDashPreview.Excel.ConditionalRangeBorderIndex.edgeBottom with String = js.native
  /* "EdgeLeft" */ val edgeLeft: typings.officeDashJsDashPreview.Excel.ConditionalRangeBorderIndex.edgeLeft with String = js.native
  /* "EdgeRight" */ val edgeRight: typings.officeDashJsDashPreview.Excel.ConditionalRangeBorderIndex.edgeRight with String = js.native
  /* "EdgeTop" */ val edgeTop: typings.officeDashJsDashPreview.Excel.ConditionalRangeBorderIndex.edgeTop with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalRangeBorderIndex with String] = js.native
}

