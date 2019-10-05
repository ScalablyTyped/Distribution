package typings.officeDashJs.Office

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
  sealed trait CurrencyDigits extends ProjectProjectFields
  
  /**
    * The currency symbol.
    */
  @js.native
  sealed trait CurrencySymbol extends ProjectProjectFields
  
  /**
    * The placement of the currency symbol: Not specified = -1; Before the value with no space ($0) = 0; After the value with no space (0$) = 1; 
    * Before the value with a space ($ 0) = 2; After the value with a space (0 $) = 3.
    */
  @js.native
  sealed trait CurrencySymbolPosition extends ProjectProjectFields
  
  @js.native
  sealed trait DurationUnits extends ProjectProjectFields
  
  /**
    * The project finish date.
    */
  @js.native
  sealed trait Finish extends ProjectProjectFields
  
  /**
    * The GUID of the project.
    */
  @js.native
  sealed trait GUID extends ProjectProjectFields
  
  /**
    * The Project Web App URL, for projects that are stored in Project Server.
    */
  @js.native
  sealed trait ProjectServerUrl extends ProjectProjectFields
  
  /**
    * Specifies whether the project is read-only.
    */
  @js.native
  sealed trait ReadOnly extends ProjectProjectFields
  
  /**
    * The project start date.
    */
  @js.native
  sealed trait Start extends ProjectProjectFields
  
  /**
    * The project version.
    */
  @js.native
  sealed trait VERSION extends ProjectProjectFields
  
  /**
    * The name of the SharePoint list, for projects that are synchronized with a tasks list.
    */
  @js.native
  sealed trait WSSList extends ProjectProjectFields
  
  /**
    * The SharePoint URL, for projects that are synchronized with a SharePoint list.
    */
  @js.native
  sealed trait WSSUrl extends ProjectProjectFields
  
  /**
    * The work units of the project, such as days or hours.
    */
  @js.native
  sealed trait WorkUnits extends ProjectProjectFields
  
  /* 0 */ val CurrencyDigits: typings.officeDashJs.Office.ProjectProjectFields.CurrencyDigits with Double = js.native
  /* 1 */ val CurrencySymbol: typings.officeDashJs.Office.ProjectProjectFields.CurrencySymbol with Double = js.native
  /* 2 */ val CurrencySymbolPosition: typings.officeDashJs.Office.ProjectProjectFields.CurrencySymbolPosition with Double = js.native
  /* 3 */ val DurationUnits: typings.officeDashJs.Office.ProjectProjectFields.DurationUnits with Double = js.native
  /* 5 */ val Finish: typings.officeDashJs.Office.ProjectProjectFields.Finish with Double = js.native
  /* 4 */ val GUID: typings.officeDashJs.Office.ProjectProjectFields.GUID with Double = js.native
  /* 10 */ val ProjectServerUrl: typings.officeDashJs.Office.ProjectProjectFields.ProjectServerUrl with Double = js.native
  /* 7 */ val ReadOnly: typings.officeDashJs.Office.ProjectProjectFields.ReadOnly with Double = js.native
  /* 6 */ val Start: typings.officeDashJs.Office.ProjectProjectFields.Start with Double = js.native
  /* 8 */ val VERSION: typings.officeDashJs.Office.ProjectProjectFields.VERSION with Double = js.native
  /* 12 */ val WSSList: typings.officeDashJs.Office.ProjectProjectFields.WSSList with Double = js.native
  /* 11 */ val WSSUrl: typings.officeDashJs.Office.ProjectProjectFields.WSSUrl with Double = js.native
  /* 9 */ val WorkUnits: typings.officeDashJs.Office.ProjectProjectFields.WorkUnits with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectProjectFields with Double] = js.native
}

