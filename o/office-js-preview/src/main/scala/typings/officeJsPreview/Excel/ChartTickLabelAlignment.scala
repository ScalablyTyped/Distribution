package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartTickLabelAlignment extends js.Object
/**
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ChartTickLabelAlignment")
@js.native
object ChartTickLabelAlignment extends js.Object {
  
  @js.native
  sealed trait center extends ChartTickLabelAlignment
  
  @js.native
  sealed trait left extends ChartTickLabelAlignment
  
  @js.native
  sealed trait right extends ChartTickLabelAlignment
}
