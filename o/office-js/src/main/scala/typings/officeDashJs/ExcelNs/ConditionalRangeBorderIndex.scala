package typings.officeDashJs.ExcelNs

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
  
  /* "EdgeBottom" */ val edgeBottom: typings.officeDashJs.ExcelNs.ConditionalRangeBorderIndex.edgeBottom with String = js.native
  /* "EdgeLeft" */ val edgeLeft: typings.officeDashJs.ExcelNs.ConditionalRangeBorderIndex.edgeLeft with String = js.native
  /* "EdgeRight" */ val edgeRight: typings.officeDashJs.ExcelNs.ConditionalRangeBorderIndex.edgeRight with String = js.native
  /* "EdgeTop" */ val edgeTop: typings.officeDashJs.ExcelNs.ConditionalRangeBorderIndex.edgeTop with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalRangeBorderIndex with String] = js.native
}

