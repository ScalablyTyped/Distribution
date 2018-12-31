package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

/**
  * Specifies whether to select (highlight) the location to navigate to (when using the {@link Office.Document | Document}.goToByIdAsync method).
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
  *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
  *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
  *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td>                            </td><td>                 </td></tr>
  *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
  *  </table>
  */
@JSGlobal("Office.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  @js.native
  sealed trait Default
    extends officeDashJsLib.OfficeNs.SelectionMode
  
  /**
    * The cursor is moved to the beginning of the location.
    */
  @js.native
  sealed trait None
    extends officeDashJsLib.OfficeNs.SelectionMode
  
  /**
    * The location will be selected (highlighted).
    */
  @js.native
  sealed trait Selected
    extends officeDashJsLib.OfficeNs.SelectionMode
  
  val Default: Default with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Selected: Selected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.SelectionMode with java.lang.String] = js.native
}

