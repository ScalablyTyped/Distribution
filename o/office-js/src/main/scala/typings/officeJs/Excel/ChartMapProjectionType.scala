package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMapProjectionType extends js.Object

/**
  *
  * Represents the region projection type of a chart series layout. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapProjectionType")
@js.native
object ChartMapProjectionType extends js.Object {
  @js.native
  sealed trait albers extends ChartMapProjectionType
  
  @js.native
  sealed trait automatic extends ChartMapProjectionType
  
  @js.native
  sealed trait mercator extends ChartMapProjectionType
  
  @js.native
  sealed trait miller extends ChartMapProjectionType
  
  @js.native
  sealed trait robinson extends ChartMapProjectionType
  
}

