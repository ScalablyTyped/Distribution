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
  
  /* 0 */ val CurrencyDigits: CurrencyDigits with scala.Double = js.native
  /* 1 */ val CurrencySymbol: CurrencySymbol with scala.Double = js.native
  /* 2 */ val CurrencySymbolPosition: CurrencySymbolPosition with scala.Double = js.native
  /* 3 */ val DurationUnits: DurationUnits with scala.Double = js.native
  /* 5 */ val Finish: Finish with scala.Double = js.native
  /* 4 */ val GUID: GUID with scala.Double = js.native
  /* 10 */ val ProjectServerUrl: ProjectServerUrl with scala.Double = js.native
  /* 7 */ val ReadOnly: ReadOnly with scala.Double = js.native
  /* 6 */ val Start: Start with scala.Double = js.native
  /* 8 */ val VERSION: VERSION with scala.Double = js.native
  /* 12 */ val WSSList: WSSList with scala.Double = js.native
  /* 11 */ val WSSUrl: WSSUrl with scala.Double = js.native
  /* 9 */ val WorkUnits: WorkUnits with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.ProjectProjectFields with scala.Double] = js.native
}

