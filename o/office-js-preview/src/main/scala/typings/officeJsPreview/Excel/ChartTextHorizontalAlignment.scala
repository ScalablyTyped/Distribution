package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartTextHorizontalAlignment extends js.Object

/**
  *
  * Represents the horizontal alignment for the specified object.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTextHorizontalAlignment")
@js.native
object ChartTextHorizontalAlignment extends js.Object {
  @js.native
  sealed trait center extends ChartTextHorizontalAlignment
  
  @js.native
  sealed trait distributed extends ChartTextHorizontalAlignment
  
  @js.native
  sealed trait justify extends ChartTextHorizontalAlignment
  
  @js.native
  sealed trait left extends ChartTextHorizontalAlignment
  
  @js.native
  sealed trait right extends ChartTextHorizontalAlignment
  
}

