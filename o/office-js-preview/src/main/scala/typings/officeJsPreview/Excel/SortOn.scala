package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOn extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.SortOn")
@js.native
object SortOn extends js.Object {
  @js.native
  sealed trait cellColor extends SortOn
  
  @js.native
  sealed trait fontColor extends SortOn
  
  @js.native
  sealed trait icon extends SortOn
  
  @js.native
  sealed trait value extends SortOn
  
}

