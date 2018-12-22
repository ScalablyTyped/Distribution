package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartDisplayBlanksAs extends js.Object

/**
     * [Api set: ExcelApi 1.8]
     */
@JSGlobal("Excel.ChartDisplayBlanksAs")
@js.native
object ChartDisplayBlanksAs extends js.Object {
  @js.native
  sealed trait interplotted
    extends officeDashJsDashPreviewLib.ExcelNs.ChartDisplayBlanksAs
  
  @js.native
  sealed trait notPlotted
    extends officeDashJsDashPreviewLib.ExcelNs.ChartDisplayBlanksAs
  
  @js.native
  sealed trait zero
    extends officeDashJsDashPreviewLib.ExcelNs.ChartDisplayBlanksAs
  
  /* "Interplotted" */ val interplotted: interplotted with java.lang.String = js.native
  /* "NotPlotted" */ val notPlotted: notPlotted with java.lang.String = js.native
  /* "Zero" */ val zero: zero with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartDisplayBlanksAs with java.lang.String] = js.native
}

