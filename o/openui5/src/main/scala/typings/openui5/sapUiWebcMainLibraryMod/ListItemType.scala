package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListItemType extends StObject
@JSImport("sap/ui/webc/main/library", "ListItemType")
@js.native
object ListItemType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListItemType & String] = js.native
  
  /**
    * Indicates that the item is clickable via active feedback when item is pressed.
    */
  @js.native
  sealed trait Active
    extends StObject
       with ListItemType
  /* "Active" */ val Active: typings.openui5.sapUiWebcMainLibraryMod.ListItemType.Active & String = js.native
  
  /**
    * Enables detail button of the list item that fires detail-click event.
    */
  @js.native
  sealed trait Detail
    extends StObject
       with ListItemType
  /* "Detail" */ val Detail: typings.openui5.sapUiWebcMainLibraryMod.ListItemType.Detail & String = js.native
  
  /**
    * Indicates the list item does not have any active feedback when item is pressed.
    */
  @js.native
  sealed trait Inactive
    extends StObject
       with ListItemType
  /* "Inactive" */ val Inactive: typings.openui5.sapUiWebcMainLibraryMod.ListItemType.Inactive & String = js.native
}
