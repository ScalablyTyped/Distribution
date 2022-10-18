package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aria {
  
  @js.native
  sealed trait HasPopup extends StObject
  /**
    * @SINCE 1.84
    *
    * Types of popups to set as aria-haspopup attribute. Most of the values (except "None") of the enumeration
    * are taken from the ARIA specification: https://www.w3.org/TR/wai-aria/#aria-haspopup
    */
  @JSImport("sap/ui/core/library", "aria.HasPopup")
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
    /* "Dialog" */ val Dialog: typings.openui5.sapUiCoreLibraryMod.aria.HasPopup.Dialog & String = js.native
    
    /**
      * Grid popup type.
      */
    @js.native
    sealed trait Grid
      extends StObject
         with HasPopup
    /* "Grid" */ val Grid: typings.openui5.sapUiCoreLibraryMod.aria.HasPopup.Grid & String = js.native
    
    /**
      * ListBox popup type.
      */
    @js.native
    sealed trait ListBox
      extends StObject
         with HasPopup
    /* "ListBox" */ val ListBox: typings.openui5.sapUiCoreLibraryMod.aria.HasPopup.ListBox & String = js.native
    
    /**
      * Menu popup type.
      */
    @js.native
    sealed trait Menu
      extends StObject
         with HasPopup
    /* "Menu" */ val Menu: typings.openui5.sapUiCoreLibraryMod.aria.HasPopup.Menu & String = js.native
    
    /**
      * None - the aria-haspopup attribute will not be rendered.
      */
    @js.native
    sealed trait None
      extends StObject
         with HasPopup
    /* "None" */ val None: typings.openui5.sapUiCoreLibraryMod.aria.HasPopup.None & String = js.native
    
    /**
      * Tree popup type.
      */
    @js.native
    sealed trait Tree
      extends StObject
         with HasPopup
    /* "Tree" */ val Tree: typings.openui5.sapUiCoreLibraryMod.aria.HasPopup.Tree & String = js.native
  }
}
