package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BindingType extends js.Object

/**
  * Specifies the type of the binding object that should be returned.
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
  *   <tr><th>                         </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
  *   <tr><td><strong> Access </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                </td></tr>
  *   <tr><td><strong> Excel  </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
  *   <tr><td><strong> Word   </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
  *  </table>
  */
@JSGlobal("Office.BindingType")
@js.native
object BindingType extends js.Object {
  /**
    * Tabular data without a header row. Data is returned as an array of arrays, for example in this form: 
    * [[row1column1, row1column2],[row2column1, row2column2]]
    */
  @js.native
  sealed trait Matrix
    extends officeDashJsDashPreviewLib.OfficeNs.BindingType
  
  /**
    * Tabular data with a header row. Data is returned as a {@link Office.TableData | TableData} object.
    */
  @js.native
  sealed trait Table
    extends officeDashJsDashPreviewLib.OfficeNs.BindingType
  
  /**
    * Plain text. Data is returned as a run of characters.
    */
  @js.native
  sealed trait Text
    extends officeDashJsDashPreviewLib.OfficeNs.BindingType
  
  val Matrix: Matrix with java.lang.String = js.native
  val Table: Table with java.lang.String = js.native
  val Text: Text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.BindingType with java.lang.String] = js.native
}

