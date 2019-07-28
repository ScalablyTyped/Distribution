package typings.officeDashJsDashPreview.ExcelNs

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
  sealed trait interplotted extends ChartDisplayBlanksAs
  
  @js.native
  sealed trait notPlotted extends ChartDisplayBlanksAs
  
  @js.native
  sealed trait zero extends ChartDisplayBlanksAs
  
  /* "Interplotted" */ val interplotted: typings.officeDashJsDashPreview.ExcelNs.ChartDisplayBlanksAs.interplotted with String = js.native
  /* "NotPlotted" */ val notPlotted: typings.officeDashJsDashPreview.ExcelNs.ChartDisplayBlanksAs.notPlotted with String = js.native
  /* "Zero" */ val zero: typings.officeDashJsDashPreview.ExcelNs.ChartDisplayBlanksAs.zero with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartDisplayBlanksAs with String] = js.native
}

