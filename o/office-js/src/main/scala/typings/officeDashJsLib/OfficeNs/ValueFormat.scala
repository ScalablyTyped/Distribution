package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueFormat extends js.Object

/**
     * Specifies whether values, such as numbers and dates, returned by the invoked method are returned with their formatting applied.
     *
     * @remarks
     * For example, if the valueFormat parameter is specified as "formatted", a number formatted as currency, or a date formatted as mm/dd/yy in the 
     * host application will have its formatting preserved. If the valueFormat parameter is specified as "unformatted", a date will be returned in its 
     * underlying sequential serial number form.
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
@JSGlobal("Office.ValueFormat")
@js.native
object ValueFormat extends js.Object {
  /**
           * Return formatted data.
           */
  @js.native
  sealed trait Formatted
    extends officeDashJsLib.OfficeNs.ValueFormat
  
  /**
           * Return unformatted data.
           */
  @js.native
  sealed trait Unformatted
    extends officeDashJsLib.OfficeNs.ValueFormat
  
  val Formatted: Formatted with java.lang.String = js.native
  val Unformatted: Unformatted with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.ValueFormat with java.lang.String] = js.native
}

