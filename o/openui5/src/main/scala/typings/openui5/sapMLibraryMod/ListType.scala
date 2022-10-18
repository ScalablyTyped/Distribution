package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListType extends StObject
@JSImport("sap/m/library", "ListType")
@js.native
object ListType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListType & String] = js.native
  
  /**
    * Indicates that the item is clickable via active feedback when item is pressed.
    */
  @js.native
  sealed trait Active
    extends StObject
       with ListType
  /* "Active" */ val Active: typings.openui5.sapMLibraryMod.ListType.Active & String = js.native
  
  /**
    * Enables detail button of the list item that fires `detailPress` event. Also see {@link sap.m.ListItemBase#attachDetailPress}.
    */
  @js.native
  sealed trait Detail
    extends StObject
       with ListType
  /* "Detail" */ val Detail: typings.openui5.sapMLibraryMod.ListType.Detail & String = js.native
  
  /**
    * Enables {@link sap.m.ListType.Detail} and {@link sap.m.ListType.Active} enumerations together.
    */
  @js.native
  sealed trait DetailAndActive
    extends StObject
       with ListType
  /* "DetailAndActive" */ val DetailAndActive: typings.openui5.sapMLibraryMod.ListType.DetailAndActive & String = js.native
  
  /**
    * Indicates the list item does not have any active feedback when item is pressed. **Note:** `Inactive`
    * type cannot be used to disable list items.
    */
  @js.native
  sealed trait Inactive
    extends StObject
       with ListType
  /* "Inactive" */ val Inactive: typings.openui5.sapMLibraryMod.ListType.Inactive & String = js.native
  
  /**
    * Indicates the list item is navigable to show extra information about the item.
    */
  @js.native
  sealed trait Navigation
    extends StObject
       with ListType
  /* "Navigation" */ val Navigation: typings.openui5.sapMLibraryMod.ListType.Navigation & String = js.native
}
