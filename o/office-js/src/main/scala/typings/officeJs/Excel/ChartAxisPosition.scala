package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartAxisPosition extends js.Object
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisPosition")
@js.native
object ChartAxisPosition extends js.Object {
  
  @js.native
  sealed trait automatic extends ChartAxisPosition
  
  @js.native
  sealed trait custom extends ChartAxisPosition
  
  @js.native
  sealed trait maximum extends ChartAxisPosition
  
  @js.native
  sealed trait minimum extends ChartAxisPosition
}
