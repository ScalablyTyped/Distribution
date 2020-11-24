package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartTitlePosition extends js.Object
/**
  *
  * Represents the position of chart title.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTitlePosition")
@js.native
object ChartTitlePosition extends js.Object {
  
  @js.native
  sealed trait automatic extends ChartTitlePosition
  
  @js.native
  sealed trait bottom extends ChartTitlePosition
  
  @js.native
  sealed trait left extends ChartTitlePosition
  
  @js.native
  sealed trait right extends ChartTitlePosition
  
  @js.native
  sealed trait top extends ChartTitlePosition
}
