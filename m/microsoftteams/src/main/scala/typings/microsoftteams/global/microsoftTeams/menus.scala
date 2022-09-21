package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.microsoftTeams.menus.ActionMenuParameters
import typings.microsoftteams.microsoftTeams.menus.ViewConfiguration
import typings.microsoftteams.microsoftTeams.menus.ViewData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace to interact with the menu-specific part of the SDK.
  * This object is used to show View Configuration, Action Menu and Navigation Bar Menu.
  *
  * Hide from docs until feature is complete
  */
object menus {
  
  @JSGlobal("microsoftTeams.menus")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Represents information about menu item for Action Menu and Navigation Bar Menu.
    */
  @JSGlobal("microsoftTeams.menus.MenuItem")
  @js.native
  open class MenuItem ()
    extends StObject
       with typings.microsoftteams.microsoftTeams.menus.MenuItem {
    
    /**
      * State of the menu item
      */
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /**
      * Display icon of the menu item. The icon value must be a string having SVG icon content.
      */
    /* CompleteClass */
    var icon: String = js.native
    
    /**
      * Unique identifier for the menu item.
      */
    /* CompleteClass */
    var id: String = js.native
    
    /**
      * Whether the menu item is selected or not
      */
    /* CompleteClass */
    var selected: Boolean = js.native
    
    /**
      * Display title of the menu item.
      */
    /* CompleteClass */
    var title: String = js.native
    
    /**
      * Interface to show list of items on selection of menu item.
      */
    /* CompleteClass */
    var viewData: ViewData = js.native
  }
  
  /**
    * Represents information about type of list to display in Navigation Bar Menu.
    */
  @JSGlobal("microsoftTeams.menus.MenuListType")
  @js.native
  object MenuListType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.microsoftteams.microsoftTeams.menus.MenuListType & String] = js.native
    
    /* "dropDown" */ val dropDown: typings.microsoftteams.microsoftTeams.menus.MenuListType.dropDown & String = js.native
    
    /* "popOver" */ val popOver: typings.microsoftteams.microsoftTeams.menus.MenuListType.popOver & String = js.native
  }
  
  inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
  
  /**
    * Used to set menu items on the Navigation Bar. If icon is available, icon will be shown, otherwise title will be shown.
    * @param items List of MenuItems for Navigation Bar Menu.
    * @param handler The handler to invoke when the user selects menu item.
    */
  inline def setNavBarMenu(
    items: js.Array[typings.microsoftteams.microsoftTeams.menus.MenuItem],
    handler: js.Function1[/* id */ String, Boolean]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setNavBarMenu")(items.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Registers list of view configurations and it's handler.
    * Handler is responsible for listening selection of View Configuration.
    * @param viewConfig List of view configurations. Minimum 1 value is required.
    * @param handler The handler to invoke when the user selects view configuration.
    */
  inline def setUpViews(viewConfig: js.Array[ViewConfiguration], handler: js.Function1[/* id */ String, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpViews")(viewConfig.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Used to show Action Menu.
    * @param params Parameters for Menu Parameters
    * @param handler The handler to invoke when the user selects menu item.
    */
  inline def showActionMenu(params: ActionMenuParameters, handler: js.Function1[/* id */ String, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showActionMenu")(params.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
