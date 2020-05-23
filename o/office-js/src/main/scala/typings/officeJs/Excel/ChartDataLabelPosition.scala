package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartDataLabelPosition extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartDataLabelPosition")
@js.native
object ChartDataLabelPosition extends js.Object {
  @js.native
  sealed trait bestFit extends ChartDataLabelPosition
  
  @js.native
  sealed trait bottom extends ChartDataLabelPosition
  
  @js.native
  sealed trait callout extends ChartDataLabelPosition
  
  @js.native
  sealed trait center extends ChartDataLabelPosition
  
  @js.native
  sealed trait insideBase extends ChartDataLabelPosition
  
  @js.native
  sealed trait insideEnd extends ChartDataLabelPosition
  
  @js.native
  sealed trait invalid extends ChartDataLabelPosition
  
  @js.native
  sealed trait left extends ChartDataLabelPosition
  
  @js.native
  sealed trait none extends ChartDataLabelPosition
  
  @js.native
  sealed trait outsideEnd extends ChartDataLabelPosition
  
  @js.native
  sealed trait right extends ChartDataLabelPosition
  
  @js.native
  sealed trait top extends ChartDataLabelPosition
  
}

