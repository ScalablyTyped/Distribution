package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMapLabelStrategy extends js.Object

/**
  *
  * Represents the region label strategy of chart series layout, only applicable in RegionMap chart.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapLabelStrategy")
@js.native
object ChartMapLabelStrategy extends js.Object {
  @js.native
  sealed trait bestFit
    extends officeDashJsDashPreviewLib.ExcelNs.ChartMapLabelStrategy
  
  @js.native
  sealed trait none
    extends officeDashJsDashPreviewLib.ExcelNs.ChartMapLabelStrategy
  
  @js.native
  sealed trait showAll
    extends officeDashJsDashPreviewLib.ExcelNs.ChartMapLabelStrategy
  
  /* "BestFit" */ val bestFit: bestFit with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "ShowAll" */ val showAll: showAll with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartMapLabelStrategy with java.lang.String] = js.native
}

