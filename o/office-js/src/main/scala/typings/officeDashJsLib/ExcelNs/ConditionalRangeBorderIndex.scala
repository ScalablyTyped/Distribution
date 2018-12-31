package typings
package officeDashJsLib.ExcelNs

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
  sealed trait edgeBottom
    extends officeDashJsLib.ExcelNs.ConditionalRangeBorderIndex
  
  @js.native
  sealed trait edgeLeft
    extends officeDashJsLib.ExcelNs.ConditionalRangeBorderIndex
  
  @js.native
  sealed trait edgeRight
    extends officeDashJsLib.ExcelNs.ConditionalRangeBorderIndex
  
  @js.native
  sealed trait edgeTop
    extends officeDashJsLib.ExcelNs.ConditionalRangeBorderIndex
  
  /* "EdgeBottom" */ val edgeBottom: edgeBottom with java.lang.String = js.native
  /* "EdgeLeft" */ val edgeLeft: edgeLeft with java.lang.String = js.native
  /* "EdgeRight" */ val edgeRight: edgeRight with java.lang.String = js.native
  /* "EdgeTop" */ val edgeTop: edgeTop with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ConditionalRangeBorderIndex with java.lang.String] = js.native
}

