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
  *
  * @remarks
  * 
  * **Support details**
  * 
  * A capital Y in the following matrix indicates that this enumeration is supported in the corresponding Office host application. 
  * An empty cell indicates that the Office host application doesn't support this enumeration.
  * 
  * For more information about Office host application and server requirements, see 
  * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
  * 
  * *Supported hosts, by platform*
  *  <table>
  *   <tr><th>                        </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
  *   <tr><td><strong> Excel </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
  *  </table>
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

