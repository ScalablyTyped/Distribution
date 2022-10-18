package typings.openui5.sapUiTableLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RowActionType extends StObject
@JSImport("sap/ui/table/library", "RowActionType")
@js.native
object RowActionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RowActionType & String] = js.native
  
  /**
    * Custom defined Row Action.
    */
  @js.native
  sealed trait Custom
    extends StObject
       with RowActionType
  /* "Custom" */ val Custom: typings.openui5.sapUiTableLibraryMod.RowActionType.Custom & String = js.native
  
  /**
    * Delete Row Action.
    */
  @js.native
  sealed trait Delete
    extends StObject
       with RowActionType
  /* "Delete" */ val Delete: typings.openui5.sapUiTableLibraryMod.RowActionType.Delete & String = js.native
  
  /**
    * Navigation Row Action.
    */
  @js.native
  sealed trait Navigation
    extends StObject
       with RowActionType
  /* "Navigation" */ val Navigation: typings.openui5.sapUiTableLibraryMod.RowActionType.Navigation & String = js.native
}
