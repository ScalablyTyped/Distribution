package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowHiddenChangeType extends js.Object

/**
  * [Api set: ExcelApi 1.11]
  */
@JSGlobal("Excel.RowHiddenChangeType")
@js.native
object RowHiddenChangeType extends js.Object {
  /**
    * Hidden indicates the row is hidden.
    *
    */
  @js.native
  sealed trait hidden extends RowHiddenChangeType
  
  /**
    * Unhidden indicates the row is not hidden.
    *
    */
  @js.native
  sealed trait unhidden extends RowHiddenChangeType
  
}

