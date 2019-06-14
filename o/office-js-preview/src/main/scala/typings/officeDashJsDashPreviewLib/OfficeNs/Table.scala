package typings
package officeDashJsDashPreviewLib.OfficeNs

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
    extends officeDashJsDashPreviewLib.OfficeNs.Table
  
  /**
    * Only the data (no headers and totals).
    */
  @js.native
  sealed trait Data
    extends officeDashJsDashPreviewLib.OfficeNs.Table
  
  /**
    * Only the header row.
    */
  @js.native
  sealed trait Headers
    extends officeDashJsDashPreviewLib.OfficeNs.Table
  
  /* 0 */ val All: All with scala.Double = js.native
  /* 1 */ val Data: Data with scala.Double = js.native
  /* 2 */ val Headers: Headers with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.Table with scala.Double] = js.native
}

