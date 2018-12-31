package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AsyncResultStatus extends js.Object

// Enumerations
/**
  * Specifies the result of an asynchronous call.
  * 
  * @remarks
  * 
  * Returned by the `status` property of the {@link Office.AsyncResult | AsyncResult} object.
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
  *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> OWA for Devices </th><th> Office for Mac </th></tr>
  *   <tr><td><strong> Access     </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
  *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
  *   <tr><td><strong> Outlook    </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td><td> Y               </td><td> Y              </td></tr>
  *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
  *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
  *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td><td>                 </td><td>                </td></tr>
  *  </table>
  */
@JSGlobal("Office.AsyncResultStatus")
@js.native
object AsyncResultStatus extends js.Object {
  /**
    * The call failed, check the error object.
    */
  @js.native
  sealed trait Failed
    extends officeDashJsDashPreviewLib.OfficeNs.AsyncResultStatus
  
  /**
    * The call succeeded.
    */
  @js.native
  sealed trait Succeeded
    extends officeDashJsDashPreviewLib.OfficeNs.AsyncResultStatus
  
  val Failed: Failed with java.lang.String = js.native
  val Succeeded: Succeeded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.AsyncResultStatus with java.lang.String] = js.native
}

