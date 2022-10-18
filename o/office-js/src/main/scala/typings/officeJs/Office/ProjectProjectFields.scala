package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProjectProjectFields extends StObject
/**
  * Specifies the project fields that are available as a parameter for the {@link Office.Document | Document}.getProjectFieldAsync method.
  *
  * @remarks
  *
  * A ProjectProjectFields constant can be used as a parameter of the {@link Office.Document | Document}.getProjectFieldAsync method.
  */
@JSGlobal("Office.ProjectProjectFields")
@js.native
object ProjectProjectFields extends StObject {
  
  /**
    * The number of digits after the decimal for the currency.
    */
  @js.native
  sealed trait CurrencyDigits
    extends StObject
       with ProjectProjectFields
  
  /**
    * The currency symbol.
    */
  @js.native
  sealed trait CurrencySymbol
    extends StObject
       with ProjectProjectFields
  
  /**
    * The placement of the currency symbol: Not specified = -1; Before the value with no space ($0) = 0; After the value with no space (0$) = 1;
    * Before the value with a space ($ 0) = 2; After the value with a space (0 $) = 3.
    */
  @js.native
  sealed trait CurrencySymbolPosition
    extends StObject
       with ProjectProjectFields
  
  @js.native
  sealed trait DurationUnits
    extends StObject
       with ProjectProjectFields
  
  /**
    * The project finish date.
    */
  @js.native
  sealed trait Finish
    extends StObject
       with ProjectProjectFields
  
  /**
    * The GUID of the project.
    */
  @js.native
  sealed trait GUID
    extends StObject
       with ProjectProjectFields
  
  /**
    * The Project Web App URL, for projects that are stored in Project Server.
    */
  @js.native
  sealed trait ProjectServerUrl
    extends StObject
       with ProjectProjectFields
  
  /**
    * Specifies whether the project is read-only.
    */
  @js.native
  sealed trait ReadOnly
    extends StObject
       with ProjectProjectFields
  
  /**
    * The project start date.
    */
  @js.native
  sealed trait Start
    extends StObject
       with ProjectProjectFields
  
  /**
    * The project version.
    */
  @js.native
  sealed trait VERSION
    extends StObject
       with ProjectProjectFields
  
  /**
    * The name of the SharePoint list, for projects that are synchronized with a tasks list.
    */
  @js.native
  sealed trait WSSList
    extends StObject
       with ProjectProjectFields
  
  /**
    * The SharePoint URL, for projects that are synchronized with a SharePoint list.
    */
  @js.native
  sealed trait WSSUrl
    extends StObject
       with ProjectProjectFields
  
  /**
    * The work units of the project, such as days or hours.
    */
  @js.native
  sealed trait WorkUnits
    extends StObject
       with ProjectProjectFields
}
