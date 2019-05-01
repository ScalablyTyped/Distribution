package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartParentLabelStrategy extends js.Object

/**
  *
  * Represents the parent lable strategy type of chart series layout, only applicable in Treemap chart.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartParentLabelStrategy")
@js.native
object ChartParentLabelStrategy extends js.Object {
  @js.native
  sealed trait banner
    extends officeDashJsLib.ExcelNs.ChartParentLabelStrategy
  
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.ChartParentLabelStrategy
  
  @js.native
  sealed trait overlapping
    extends officeDashJsLib.ExcelNs.ChartParentLabelStrategy
  
  /* "Banner" */ val banner: banner with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Overlapping" */ val overlapping: overlapping with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartParentLabelStrategy with java.lang.String] = js.native
}

