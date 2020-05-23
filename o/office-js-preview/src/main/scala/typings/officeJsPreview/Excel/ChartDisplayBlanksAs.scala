package typings.officeJsPreview.Excel

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
  
}

