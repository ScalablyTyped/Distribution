package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.initialize")
@js.native
object initialize extends js.Object {
  /**
    * Occurs when the runtime environment is loaded and the add-in is ready to start interacting with the application and hosted document. 
    * 
    * The reason parameter of the initialize event listener function returns an `InitializationReason` enumeration value that specifies how 
    * initialization occurred. A task pane or content add-in can be initialized in two ways:
    * 
    *  - The user just inserted it from Recently Used Add-ins section of the Add-in drop-down list on the Insert tab of the ribbon in the Office 
    * host application, or from Insert add-in dialog box.
    * 
    *  - The user opened a document that already contains the add-in.
    * 
    * *Note*: The reason parameter of the initialize event listener function only returns an `InitializationReason` enumeration value for task pane 
    * and content add-ins. It does not return a value for Outlook add-ins.
    * 
    * @remarks
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                             </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th><th> Outlook on mobile devices </th><th> Office on Mac </th></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td>               </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Y                 </td><td> Y                     </td><td>                </td><td> Y                         </td><td> Y             </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td>               </td></tr>
    *   <tr><td><strong> Project    </strong></td><td> Y                 </td><td>                       </td><td>                </td><td>                           </td><td>               </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td>               </td></tr>
    *  </table>
    * 
    * @param reason Indicates how the app was initialized.
    */
  def apply(reason: InitializationReason): Unit = js.native
}

