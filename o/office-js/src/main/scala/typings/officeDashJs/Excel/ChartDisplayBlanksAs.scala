package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartDisplayBlanksAs with String] = js.native
  /* "Interplotted" */ @js.native
  object interplotted extends TopLevel[interplotted with String]
  
  /* "NotPlotted" */ @js.native
  object notPlotted extends TopLevel[notPlotted with String]
  
  /* "Zero" */ @js.native
  object zero extends TopLevel[zero with String]
  
}

