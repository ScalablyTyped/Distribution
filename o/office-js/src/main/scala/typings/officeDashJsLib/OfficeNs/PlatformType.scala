package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlatformType extends js.Object

/**
     * Specifies the OS or other platform on which the Office host application is running.
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
     *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> OWA for Devices </th><th> Office for Mac </th></tr>
     *   <tr><td><strong> Access     </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
     *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
     *   <tr><td><strong> OneNote    </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td> Y               </td><td>                </td></tr>
     *   <tr><td><strong> Outlook    </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td><td> Y               </td><td> Y              </td></tr>
     *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
     *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
     *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
     *  </table>
     */
@JSGlobal("Office.PlatformType")
@js.native
object PlatformType extends js.Object {
  /**
           * The platform is an Android device.
           */
  @js.native
  sealed trait Android
    extends officeDashJsLib.OfficeNs.PlatformType
  
  /**
           * The platform is Mac.
           */
  @js.native
  sealed trait Mac
    extends officeDashJsLib.OfficeNs.PlatformType
  
  /**
           * The platform is Office Online.
           */
  @js.native
  sealed trait OfficeOnline
    extends officeDashJsLib.OfficeNs.PlatformType
  
  /**
           * The platform is PC (Windows).
           */
  @js.native
  sealed trait PC
    extends officeDashJsLib.OfficeNs.PlatformType
  
  /**
           * The platform is WinRT.
           */
  @js.native
  sealed trait Universal
    extends officeDashJsLib.OfficeNs.PlatformType
  
  /**
           * The platform an iOS device.
           */
  @js.native
  sealed trait iOS
    extends officeDashJsLib.OfficeNs.PlatformType
  
  val Android: Android with java.lang.String = js.native
  val Mac: Mac with java.lang.String = js.native
  val OfficeOnline: OfficeOnline with java.lang.String = js.native
  val PC: PC with java.lang.String = js.native
  val Universal: Universal with java.lang.String = js.native
  val iOS: iOS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.PlatformType with java.lang.String] = js.native
}

