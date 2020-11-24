package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartAxisTickMark extends js.Object
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisTickMark")
@js.native
object ChartAxisTickMark extends js.Object {
  
  @js.native
  sealed trait cross extends ChartAxisTickMark
  
  @js.native
  sealed trait inside extends ChartAxisTickMark
  
  @js.native
  sealed trait none extends ChartAxisTickMark
  
  @js.native
  sealed trait outside extends ChartAxisTickMark
}
