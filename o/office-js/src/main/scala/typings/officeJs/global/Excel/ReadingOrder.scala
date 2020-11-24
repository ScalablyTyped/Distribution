package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ReadingOrder")
@js.native
object ReadingOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ReadingOrder with String] = js.native
  
  /* "Context" */ val context: typings.officeJs.Excel.ReadingOrder.context with String = js.native
  
  /* "LeftToRight" */ val leftToRight: typings.officeJs.Excel.ReadingOrder.leftToRight with String = js.native
  
  /* "RightToLeft" */ val rightToLeft: typings.officeJs.Excel.ReadingOrder.rightToLeft with String = js.native
}
