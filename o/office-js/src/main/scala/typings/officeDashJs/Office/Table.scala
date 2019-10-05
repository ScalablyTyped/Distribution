package typings.officeDashJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Table extends js.Object

/**
  * Specifies enumerated values for the `cells` property in the cellFormat parameter of 
  * {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-tables#format-a-table | table formatting methods}.
  */
@JSGlobal("Office.Table")
@js.native
object Table extends js.Object {
  /**
    * The entire table, including column headers, data, and totals (if any).
    */
  @js.native
  sealed trait All extends Table
  
  /**
    * Only the data (no headers and totals).
    */
  @js.native
  sealed trait Data extends Table
  
  /**
    * Only the header row.
    */
  @js.native
  sealed trait Headers extends Table
  
  /* 0 */ val All: typings.officeDashJs.Office.Table.All with Double = js.native
  /* 1 */ val Data: typings.officeDashJs.Office.Table.Data with Double = js.native
  /* 2 */ val Headers: typings.officeDashJs.Office.Table.Headers with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Table with Double] = js.native
}

