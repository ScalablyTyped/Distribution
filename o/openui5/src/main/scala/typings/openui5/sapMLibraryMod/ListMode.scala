package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListMode extends StObject
@JSImport("sap/m/library", "ListMode")
@js.native
object ListMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListMode & String] = js.native
  
  /**
    * Delete mode (only one list item can be deleted via provided delete button)
    */
  @js.native
  sealed trait Delete
    extends StObject
       with ListMode
  /* "Delete" */ val Delete: typings.openui5.sapMLibraryMod.ListMode.Delete & String = js.native
  
  /**
    * Multi selection mode (more than one list item can be selected).
    */
  @js.native
  sealed trait MultiSelect
    extends StObject
       with ListMode
  /* "MultiSelect" */ val MultiSelect: typings.openui5.sapMLibraryMod.ListMode.MultiSelect & String = js.native
  
  /**
    * Default mode (no selection).
    */
  @js.native
  sealed trait None
    extends StObject
       with ListMode
  /* "None" */ val None: typings.openui5.sapMLibraryMod.ListMode.None & String = js.native
  
  /**
    * Right-positioned single selection mode (only one list item can be selected).
    */
  @js.native
  sealed trait SingleSelect
    extends StObject
       with ListMode
  /* "SingleSelect" */ val SingleSelect: typings.openui5.sapMLibraryMod.ListMode.SingleSelect & String = js.native
  
  /**
    * Left-positioned single selection mode (only one list item can be selected).
    */
  @js.native
  sealed trait SingleSelectLeft
    extends StObject
       with ListMode
  /* "SingleSelectLeft" */ val SingleSelectLeft: typings.openui5.sapMLibraryMod.ListMode.SingleSelectLeft & String = js.native
  
  /**
    * Selected item is highlighted but no selection control is visible (only one list item can be selected).
    */
  @js.native
  sealed trait SingleSelectMaster
    extends StObject
       with ListMode
  /* "SingleSelectMaster" */ val SingleSelectMaster: typings.openui5.sapMLibraryMod.ListMode.SingleSelectMaster & String = js.native
}
