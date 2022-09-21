package typings.microsoftteams.microsoftTeams

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
  
  @js.native
  sealed trait MenuListType extends StObject
  /**
    * Represents information about type of list to display in Navigation Bar Menu.
    */
  @JSGlobal("microsoftTeams.menus.MenuListType")
  @js.native
  object MenuListType extends StObject {
    
    @js.native
    sealed trait dropDown
      extends StObject
         with MenuListType
    
    @js.native
    sealed trait popOver
      extends StObject
         with MenuListType
  }
  
  trait ActionMenuParameters extends StObject {
    
    /**
      * List of MenuItems for Action Menu
      */
    var items: js.Array[MenuItem]
    
    /**
      * Display title for Action Menu
      */
    var title: String
  }
  object ActionMenuParameters {
    
    inline def apply(items: js.Array[MenuItem], title: String): ActionMenuParameters = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionMenuParameters]
    }
    
    extension [Self <: ActionMenuParameters](x: Self) {
      
      inline def setItems(value: js.Array[MenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: MenuItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents information about menu item for Action Menu and Navigation Bar Menu.
    */
  trait MenuItem extends StObject {
    
    /**
      * Additional information for accessibility.
      */
    var contentDescription: js.UndefOr[String] = js.undefined
    
    /**
      * State of the menu item
      */
    var enabled: Boolean
    
    /**
      * Display icon of the menu item. The icon value must be a string having SVG icon content.
      */
    var icon: String
    
    /**
      * Selected state display icon of the menu item. The icon value must be a string having SVG icon content.
      */
    var iconSelected: js.UndefOr[String] = js.undefined
    
    /**
      * Unique identifier for the menu item.
      */
    var id: String
    
    /**
      * Whether the menu item is selected or not
      */
    var selected: Boolean
    
    /**
      * Display title of the menu item.
      */
    var title: String
    
    /**
      * Interface to show list of items on selection of menu item.
      */
    var viewData: ViewData
  }
  object MenuItem {
    
    inline def apply(enabled: Boolean, icon: String, id: String, selected: Boolean, title: String, viewData: ViewData): MenuItem = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], viewData = viewData.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItem]
    }
    
    extension [Self <: MenuItem](x: Self) {
      
      inline def setContentDescription(value: String): Self = StObject.set(x, "contentDescription", value.asInstanceOf[js.Any])
      
      inline def setContentDescriptionUndefined: Self = StObject.set(x, "contentDescription", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconSelected(value: String): Self = StObject.set(x, "iconSelected", value.asInstanceOf[js.Any])
      
      inline def setIconSelectedUndefined: Self = StObject.set(x, "iconSelected", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setViewData(value: ViewData): Self = StObject.set(x, "viewData", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents information about item in View Configuration.
    */
  trait ViewConfiguration extends StObject {
    
    /**
      * Additional information for accessibility.
      */
    var contentDescription: js.UndefOr[String] = js.undefined
    
    /**
      * Unique identifier of view.
      */
    var id: String
    
    /**
      * Display title of the view.
      */
    var title: String
  }
  object ViewConfiguration {
    
    inline def apply(id: String, title: String): ViewConfiguration = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewConfiguration]
    }
    
    extension [Self <: ViewConfiguration](x: Self) {
      
      inline def setContentDescription(value: String): Self = StObject.set(x, "contentDescription", value.asInstanceOf[js.Any])
      
      inline def setContentDescriptionUndefined: Self = StObject.set(x, "contentDescription", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents information about view to show on Navigation Bar Menu item selection
    */
  trait ViewData extends StObject {
    
    /**
      * Array of MenuItem. Icon value will be required for all items in the list.
      */
    var listItems: js.Array[MenuItem]
    
    /**
      * Display header title of the item list.
      */
    var listTitle: js.UndefOr[String] = js.undefined
    
    /**
      * Type of the menu item.
      */
    var listType: MenuListType
  }
  object ViewData {
    
    inline def apply(listItems: js.Array[MenuItem], listType: MenuListType): ViewData = {
      val __obj = js.Dynamic.literal(listItems = listItems.asInstanceOf[js.Any], listType = listType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewData]
    }
    
    extension [Self <: ViewData](x: Self) {
      
      inline def setListItems(value: js.Array[MenuItem]): Self = StObject.set(x, "listItems", value.asInstanceOf[js.Any])
      
      inline def setListItemsVarargs(value: MenuItem*): Self = StObject.set(x, "listItems", js.Array(value*))
      
      inline def setListTitle(value: String): Self = StObject.set(x, "listTitle", value.asInstanceOf[js.Any])
      
      inline def setListTitleUndefined: Self = StObject.set(x, "listTitle", js.undefined)
      
      inline def setListType(value: MenuListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
    }
  }
}
