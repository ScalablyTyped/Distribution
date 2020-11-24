package typings.officeJsPreview.global.Office

import typings.officeJsPreview.Office.Context
import typings.officeJsPreview.Office.IPromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office")
@js.native
object ^ extends js.Object {
  
  /** A Promise object. Promises can be chained via ".then", and errors can be caught via ".catch".
    * When a browser-provided native Promise implementation is available, Office.Promise will switch to use the native Promise instead.
    */
  var Promise: IPromiseConstructor = js.native
  
  /**
    * Gets the Context object that represents the runtime environment of the add-in and provides access to the top-level objects of the API.
    *
    * @remarks
    *
    * **Support details**
    *
    * A capital Y in the following matrix indicates that this property is supported in the corresponding Office host application.
    * An empty cell indicates that the Office host application doesn't support this enumeration.
    *
    * For more information about Office host application and server requirements, see
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    *
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                             </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th><th> Outlook on mobile devices </th><th> Office on Mac </th></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td> Y             </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Y                 </td><td> Y                     </td><td>                </td><td> Y                         </td><td> Y             </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td> Y             </td></tr>
    *   <tr><td><strong> Project    </strong></td><td> Y                 </td><td>                       </td><td>                </td><td>                           </td><td> Y             </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td> Y             </td></tr>
    *  </table>
    */
  var context: Context = js.native
}
