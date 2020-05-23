package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterOperator extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.FilterOperator")
@js.native
object FilterOperator extends js.Object {
  @js.native
  sealed trait and extends FilterOperator
  
  @js.native
  sealed trait or extends FilterOperator
  
}

