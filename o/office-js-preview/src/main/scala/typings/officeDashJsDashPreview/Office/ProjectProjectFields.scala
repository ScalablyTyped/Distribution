package typings.officeDashJsDashPreview.Office

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Office.ProjectProjectFields.CurrencyDigits
import typings.officeDashJsDashPreview.Office.ProjectProjectFields.CurrencySymbol
import typings.officeDashJsDashPreview.Office.ProjectProjectFields.CurrencySymbolPosition
import typings.officeDashJsDashPreview.Office.ProjectProjectFields.DurationUnits
import typings.officeDashJsDashPreview.Office.ProjectProjectFields.Finish
import typings.officeDashJsDashPreview.Office.ProjectProjectFields.GUID
import typings.officeDashJsDashPreview.Office.ProjectProjectFields.ProjectServerUrl
import typings.officeDashJsDashPreview.Office.ProjectProjectFields.ReadOnly
import typings.officeDashJsDashPreview.Office.ProjectProjectFields.Start
import typings.officeDashJsDashPreview.Office.ProjectProjectFields.VERSION
import typings.officeDashJsDashPreview.Office.ProjectProjectFields.WSSList
import typings.officeDashJsDashPreview.Office.ProjectProjectFields.WSSUrl
import typings.officeDashJsDashPreview.Office.ProjectProjectFields.WorkUnits
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectProjectFields with Double] = js.native
  /* 0 */ @js.native
  object CurrencyDigits extends TopLevel[CurrencyDigits with Double]
  
  /* 1 */ @js.native
  object CurrencySymbol extends TopLevel[CurrencySymbol with Double]
  
  /* 2 */ @js.native
  object CurrencySymbolPosition extends TopLevel[CurrencySymbolPosition with Double]
  
  /* 3 */ @js.native
  object DurationUnits extends TopLevel[DurationUnits with Double]
  
  /* 5 */ @js.native
  object Finish extends TopLevel[Finish with Double]
  
  /* 4 */ @js.native
  object GUID extends TopLevel[GUID with Double]
  
  /* 10 */ @js.native
  object ProjectServerUrl extends TopLevel[ProjectServerUrl with Double]
  
  /* 7 */ @js.native
  object ReadOnly extends TopLevel[ReadOnly with Double]
  
  /* 6 */ @js.native
  object Start extends TopLevel[Start with Double]
  
  /* 8 */ @js.native
  object VERSION extends TopLevel[VERSION with Double]
  
  /* 12 */ @js.native
  object WSSList extends TopLevel[WSSList with Double]
  
  /* 11 */ @js.native
  object WSSUrl extends TopLevel[WSSUrl with Double]
  
  /* 9 */ @js.native
  object WorkUnits extends TopLevel[WorkUnits with Double]
  
}

