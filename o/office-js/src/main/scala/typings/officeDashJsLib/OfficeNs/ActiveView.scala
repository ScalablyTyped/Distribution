package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActiveView extends js.Object

// Enumerations
/**
     * Specifies the state of the active view of the document, for example, whether the user can edit the document.
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
     *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
     *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
     *  </table>
     */
@JSGlobal("Office.ActiveView")
@js.native
object ActiveView extends js.Object {
  /**
           * The active view of the host application lets the user edit the content in the document.
           */
  @js.native
  sealed trait Edit
    extends officeDashJsLib.OfficeNs.ActiveView
  
  /**
           * The active view of the host application only lets the user read the content in the document.
           */
  @js.native
  sealed trait Read
    extends officeDashJsLib.OfficeNs.ActiveView
  
  val Edit: Edit with java.lang.String = js.native
  val Read: Read with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.ActiveView with java.lang.String] = js.native
}

