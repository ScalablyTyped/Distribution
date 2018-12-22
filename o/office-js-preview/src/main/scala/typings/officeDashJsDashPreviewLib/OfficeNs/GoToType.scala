package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GoToType extends js.Object

/**
     * Specifies the type of place or object to navigate to.
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
     *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
     *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
     *  </table>
     */
@JSGlobal("Office.GoToType")
@js.native
object GoToType extends js.Object {
  /**
           * Goes to a binding object using the specified binding id.
           * 
           * Supported hosts: Excel, Word
           */
  @js.native
  sealed trait Binding
    extends officeDashJsDashPreviewLib.OfficeNs.GoToType
  
  /**
           * Goes to the specified index by slide number or {@link Office.Index}.
           * 
           * Supported hosts: PowerPoint
           */
  @js.native
  sealed trait Index
    extends officeDashJsDashPreviewLib.OfficeNs.GoToType
  
  /**
           * Goes to a named item using that item's name.
           * In Excel, you can use any structured reference for a named range or table: "Worksheet2!Table1"
           * 
           * Supported hosts: Excel
           */
  @js.native
  sealed trait NamedItem
    extends officeDashJsDashPreviewLib.OfficeNs.GoToType
  
  /**
           * Goes to a slide using the specified id.
           * 
           * Supported hosts: PowerPoint
           */
  @js.native
  sealed trait Slide
    extends officeDashJsDashPreviewLib.OfficeNs.GoToType
  
  val Binding: Binding with java.lang.String = js.native
  val Index: Index with java.lang.String = js.native
  val NamedItem: NamedItem with java.lang.String = js.native
  val Slide: Slide with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.GoToType with java.lang.String] = js.native
}

