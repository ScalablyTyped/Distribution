package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartParentLabelStrategy extends js.Object

/**
     *
     * Represents the parent lable strategy type of chart series layout, only applicable in Treemap chart.
     *
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Excel.ChartParentLabelStrategy")
@js.native
object ChartParentLabelStrategy extends js.Object {
  @js.native
  sealed trait banner
    extends officeDashJsDashPreviewLib.ExcelNs.ChartParentLabelStrategy
  
  @js.native
  sealed trait none
    extends officeDashJsDashPreviewLib.ExcelNs.ChartParentLabelStrategy
  
  @js.native
  sealed trait overlapping
    extends officeDashJsDashPreviewLib.ExcelNs.ChartParentLabelStrategy
  
  /* "Banner" */ val banner: banner with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Overlapping" */ val overlapping: overlapping with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartParentLabelStrategy with java.lang.String
  ] = js.native
}

