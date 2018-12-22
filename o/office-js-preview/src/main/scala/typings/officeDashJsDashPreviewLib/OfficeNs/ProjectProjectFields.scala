package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectProjectFields extends js.Object

/**
     * Specifies the project fields that are available as a parameter for the {@link Office.Document | Document}.getProjectFieldAsync method.
     *
     * @remarks
     * 
     * A ProjectProjectFields constant can be used as a parameter of the {@link Office.Document | Document}.getProjectFieldAsync method.
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
     *   <tr><th>                          </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th></tr>
     *   <tr><td><strong> Project </strong></td><td> Y                          </td><td>                            </td></tr>
     *  </table>
     */
@JSGlobal("Office.ProjectProjectFields")
@js.native
object ProjectProjectFields extends js.Object {
  /**
           * The number of digits after the decimal for the currency.
           */
  @js.native
  sealed trait CurrencyDigits
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields
  
  /**
           * The currency symbol.
           */
  @js.native
  sealed trait CurrencySymbol
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields
  
  /**
           * The placement of the currency symbol: Not specified = -1; Before the value with no space ($0) = 0; After the value with no space (0$) = 1; 
           * Before the value with a space ($ 0) = 2; After the value with a space (0 $) = 3.
           */
  @js.native
  sealed trait CurrencySymbolPosition
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields
  
  @js.native
  sealed trait DurationUnits
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields
  
  /**
           * The project finish date.
           */
  @js.native
  sealed trait Finish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields
  
  /**
           * The GUID of the project.
           */
  @js.native
  sealed trait GUID
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields
  
  /**
           * The Project Web App URL, for projects that are stored in Project Server.
           */
  @js.native
  sealed trait ProjectServerUrl
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields
  
  /**
           * Specifies whether the project is read-only.
           */
  @js.native
  sealed trait ReadOnly
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields
  
  /**
           * The project start date.
           */
  @js.native
  sealed trait Start
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields
  
  /**
           * The project version.
           */
  @js.native
  sealed trait VERSION
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields
  
  /**
           * The name of the SharePoint list, for projects that are synchronized with a tasks list.
           */
  @js.native
  sealed trait WSSList
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields
  
  /**
           * The SharePoint URL, for projects that are synchronized with a SharePoint list.
           */
  @js.native
  sealed trait WSSUrl
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields
  
  /**
           * The work units of the project, such as days or hours.
           */
  @js.native
  sealed trait WorkUnits
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields
  
  val CurrencyDigits: CurrencyDigits with java.lang.String = js.native
  val CurrencySymbol: CurrencySymbol with java.lang.String = js.native
  val CurrencySymbolPosition: CurrencySymbolPosition with java.lang.String = js.native
  val DurationUnits: DurationUnits with java.lang.String = js.native
  val Finish: Finish with java.lang.String = js.native
  val GUID: GUID with java.lang.String = js.native
  val ProjectServerUrl: ProjectServerUrl with java.lang.String = js.native
  val ReadOnly: ReadOnly with java.lang.String = js.native
  val Start: Start with java.lang.String = js.native
  val VERSION: VERSION with java.lang.String = js.native
  val WSSList: WSSList with java.lang.String = js.native
  val WSSUrl: WSSUrl with java.lang.String = js.native
  val WorkUnits: WorkUnits with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields with java.lang.String] = js.native
}

