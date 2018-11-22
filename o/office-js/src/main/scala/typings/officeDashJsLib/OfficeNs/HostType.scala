package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HostType extends js.Object

/**
     * Specifies the host Office application in which the add-in is running.
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
     *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> OWA for Devices </th><th> Office for Mac </th></tr>
     *   <tr><td><strong> Access     </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
     *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
     *   <tr><td><strong> OneNote    </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td> Y               </td><td>                </td></tr>
     *   <tr><td><strong> Outlook    </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td><td> Y               </td><td> Y              </td></tr>
     *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
     *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
     *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
     *  </table>
     */
@JSGlobal("Office.HostType")
@js.native
object HostType extends js.Object {
  /**
           * The Office host is Microsoft Access.
           */
  @js.native
  sealed trait Access
    extends officeDashJsLib.OfficeNs.HostType
  
  /**
           * The Office host is Microsoft Excel.
           */
  @js.native
  sealed trait Excel
    extends officeDashJsLib.OfficeNs.HostType
  
  /**
           * The Office host is Microsoft OneNote.
           */
  @js.native
  sealed trait OneNote
    extends officeDashJsLib.OfficeNs.HostType
  
  /**
           * The Office host is Microsoft Outlook.
           */
  @js.native
  sealed trait Outlook
    extends officeDashJsLib.OfficeNs.HostType
  
  /**
           * The Office host is Microsoft PowerPoint.
           */
  @js.native
  sealed trait PowerPoint
    extends officeDashJsLib.OfficeNs.HostType
  
  /**
           * The Office host is Microsoft Project.
           */
  @js.native
  sealed trait Project
    extends officeDashJsLib.OfficeNs.HostType
  
  /**
           * The Office host is Microsoft Word.
           */
  @js.native
  sealed trait Word
    extends officeDashJsLib.OfficeNs.HostType
  
  val Access: Access with java.lang.String = js.native
  val Excel: Excel with java.lang.String = js.native
  val OneNote: OneNote with java.lang.String = js.native
  val Outlook: Outlook with java.lang.String = js.native
  val PowerPoint: PowerPoint with java.lang.String = js.native
  val Project: Project with java.lang.String = js.native
  val Word: Word with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.HostType with java.lang.String] = js.native
}

