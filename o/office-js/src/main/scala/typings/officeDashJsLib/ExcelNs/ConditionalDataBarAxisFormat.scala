package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalDataBarAxisFormat extends js.Object

/**
  *
  * Represents the format options for a Data Bar Axis.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalDataBarAxisFormat")
@js.native
object ConditionalDataBarAxisFormat extends js.Object {
  @js.native
  sealed trait automatic
    extends officeDashJsLib.ExcelNs.ConditionalDataBarAxisFormat
  
  @js.native
  sealed trait cellMidPoint
    extends officeDashJsLib.ExcelNs.ConditionalDataBarAxisFormat
  
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.ConditionalDataBarAxisFormat
  
  /* "Automatic" */ val automatic: automatic with java.lang.String = js.native
  /* "CellMidPoint" */ val cellMidPoint: cellMidPoint with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ConditionalDataBarAxisFormat with java.lang.String] = js.native
}

