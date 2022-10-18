package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HasPopup extends StObject
@JSImport("sap/ui/webc/main/library", "HasPopup")
@js.native
object HasPopup extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HasPopup & String] = js.native
  
  /**
    * Dialog popup type.
    */
  @js.native
  sealed trait Dialog
    extends StObject
       with HasPopup
  /* "Dialog" */ val Dialog: typings.openui5.sapUiWebcMainLibraryMod.HasPopup.Dialog & String = js.native
  
  /**
    * Grid popup type.
    */
  @js.native
  sealed trait Grid
    extends StObject
       with HasPopup
  /* "Grid" */ val Grid: typings.openui5.sapUiWebcMainLibraryMod.HasPopup.Grid & String = js.native
  
  /**
    * ListBox popup type.
    */
  @js.native
  sealed trait ListBox
    extends StObject
       with HasPopup
  /* "ListBox" */ val ListBox: typings.openui5.sapUiWebcMainLibraryMod.HasPopup.ListBox & String = js.native
  
  /**
    * Menu popup type.
    */
  @js.native
  sealed trait Menu
    extends StObject
       with HasPopup
  /* "Menu" */ val Menu: typings.openui5.sapUiWebcMainLibraryMod.HasPopup.Menu & String = js.native
  
  /**
    * Tree popup type.
    */
  @js.native
  sealed trait Tree
    extends StObject
       with HasPopup
  /* "Tree" */ val Tree: typings.openui5.sapUiWebcMainLibraryMod.HasPopup.Tree & String = js.native
}
