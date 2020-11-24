package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartLegendPosition extends js.Object
/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartLegendPosition")
@js.native
object ChartLegendPosition extends js.Object {
  
  @js.native
  sealed trait bottom extends ChartLegendPosition
  
  @js.native
  sealed trait corner extends ChartLegendPosition
  
  @js.native
  sealed trait custom extends ChartLegendPosition
  
  @js.native
  sealed trait invalid extends ChartLegendPosition
  
  @js.native
  sealed trait left extends ChartLegendPosition
  
  @js.native
  sealed trait right extends ChartLegendPosition
  
  @js.native
  sealed trait top extends ChartLegendPosition
}
