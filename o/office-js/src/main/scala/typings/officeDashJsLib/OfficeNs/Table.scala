package typings
package officeDashJsLib.OfficeNs

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
  sealed trait All
    extends officeDashJsLib.OfficeNs.Table
  
  /**
    * Only the data (no headers and totals).
    */
  @js.native
  sealed trait Data
    extends officeDashJsLib.OfficeNs.Table
  
  /**
    * Only the header row.
    */
  @js.native
  sealed trait Headers
    extends officeDashJsLib.OfficeNs.Table
  
  val All: All with java.lang.String = js.native
  val Data: Data with java.lang.String = js.native
  val Headers: Headers with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.Table with java.lang.String] = js.native
}

