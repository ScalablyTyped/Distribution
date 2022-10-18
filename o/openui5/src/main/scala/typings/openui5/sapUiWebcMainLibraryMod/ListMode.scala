package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListMode extends StObject
@JSImport("sap/ui/webc/main/library", "ListMode")
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
  /* "Delete" */ val Delete: typings.openui5.sapUiWebcMainLibraryMod.ListMode.Delete & String = js.native
  
  /**
    * Multi selection mode (more than one list item can be selected).
    */
  @js.native
  sealed trait MultiSelect
    extends StObject
       with ListMode
  /* "MultiSelect" */ val MultiSelect: typings.openui5.sapUiWebcMainLibraryMod.ListMode.MultiSelect & String = js.native
  
  /**
    * Default mode (no selection).
    */
  @js.native
  sealed trait None
    extends StObject
       with ListMode
  /* "None" */ val None: typings.openui5.sapUiWebcMainLibraryMod.ListMode.None & String = js.native
  
  /**
    * Right-positioned single selection mode (only one list item can be selected).
    */
  @js.native
  sealed trait SingleSelect
    extends StObject
       with ListMode
  /* "SingleSelect" */ val SingleSelect: typings.openui5.sapUiWebcMainLibraryMod.ListMode.SingleSelect & String = js.native
  
  /**
    * Selected item is highlighted and selection is changed upon arrow navigation (only one list item can be
    * selected - this is always the focused item).
    */
  @js.native
  sealed trait SingleSelectAuto
    extends StObject
       with ListMode
  /* "SingleSelectAuto" */ val SingleSelectAuto: typings.openui5.sapUiWebcMainLibraryMod.ListMode.SingleSelectAuto & String = js.native
  
  /**
    * Left-positioned single selection mode (only one list item can be selected).
    */
  @js.native
  sealed trait SingleSelectBegin
    extends StObject
       with ListMode
  /* "SingleSelectBegin" */ val SingleSelectBegin: typings.openui5.sapUiWebcMainLibraryMod.ListMode.SingleSelectBegin & String = js.native
  
  /**
    * Selected item is highlighted but no selection element is visible (only one list item can be selected).
    */
  @js.native
  sealed trait SingleSelectEnd
    extends StObject
       with ListMode
  /* "SingleSelectEnd" */ val SingleSelectEnd: typings.openui5.sapUiWebcMainLibraryMod.ListMode.SingleSelectEnd & String = js.native
}
