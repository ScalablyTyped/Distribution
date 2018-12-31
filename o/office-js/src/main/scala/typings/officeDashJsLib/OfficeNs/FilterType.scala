package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterType extends js.Object

/**
  * Specifies whether filtering from the host application is applied when the data is retrieved.
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
  *   <tr><th>                          </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
  *   <tr><td><strong> Excel   </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
  *   <tr><td><strong> Project </strong></td><td> Y                          </td><td>                            </td><td>                 </td></tr>
  *   <tr><td><strong> Word    </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
  *  </table>
  */
@JSGlobal("Office.FilterType")
@js.native
object FilterType extends js.Object {
  /**
    * Return all data (not filtered by the host application).
    */
  @js.native
  sealed trait All
    extends officeDashJsLib.OfficeNs.FilterType
  
  /**
    * Return only the visible data (as filtered by the host application).
    */
  @js.native
  sealed trait OnlyVisible
    extends officeDashJsLib.OfficeNs.FilterType
  
  val All: All with java.lang.String = js.native
  val OnlyVisible: OnlyVisible with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.FilterType with java.lang.String] = js.native
}

