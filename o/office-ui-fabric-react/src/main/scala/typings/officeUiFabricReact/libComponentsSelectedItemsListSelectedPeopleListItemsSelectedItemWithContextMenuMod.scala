package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuItem
import typings.officeUiFabricReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.IExtendedPersonaProps
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.uifabricUtilities.libBaseComponentDottypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSelectedItemsListSelectedPeopleListItemsSelectedItemWithContextMenuMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/SelectedItemWithContextMenu", "SelectedItemWithContextMenu")
  @js.native
  open class SelectedItemWithContextMenu protected () extends Component[ISelectedItemWithContextMenuProps, IPeoplePickerItemState, Any] {
    def this(props: ISelectedItemWithContextMenuProps) = this()
    
    /* private */ var _onClick: Any = js.native
    
    /* private */ var _onCloseContextualMenu: Any = js.native
    
    /* protected */ var itemElement: RefObject[HTMLDivElement] = js.native
  }
  
  trait IPeoplePickerItemState extends StObject {
    
    var contextualMenuVisible: Boolean
  }
  object IPeoplePickerItemState {
    
    inline def apply(contextualMenuVisible: Boolean): IPeoplePickerItemState = {
      val __obj = js.Dynamic.literal(contextualMenuVisible = contextualMenuVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPeoplePickerItemState]
    }
    
    extension [Self <: IPeoplePickerItemState](x: Self) {
      
      inline def setContextualMenuVisible(value: Boolean): Self = StObject.set(x, "contextualMenuVisible", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISelectedItemWithContextMenuProps
    extends StObject
       with IBaseProps[Any] {
    
    var beginEditing: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, Unit]] = js.undefined
    
    var item: IExtendedPersonaProps
    
    var menuItems: js.Array[IContextualMenuItem]
    
    var renderedItem: Element
  }
  object ISelectedItemWithContextMenuProps {
    
    inline def apply(item: IExtendedPersonaProps, menuItems: js.Array[IContextualMenuItem], renderedItem: Element): ISelectedItemWithContextMenuProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], renderedItem = renderedItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectedItemWithContextMenuProps]
    }
    
    extension [Self <: ISelectedItemWithContextMenuProps](x: Self) {
      
      inline def setBeginEditing(value: /* item */ IExtendedPersonaProps => Unit): Self = StObject.set(x, "beginEditing", js.Any.fromFunction1(value))
      
      inline def setBeginEditingUndefined: Self = StObject.set(x, "beginEditing", js.undefined)
      
      inline def setItem(value: IExtendedPersonaProps): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setMenuItems(value: js.Array[IContextualMenuItem]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      inline def setMenuItemsVarargs(value: IContextualMenuItem*): Self = StObject.set(x, "menuItems", js.Array(value*))
      
      inline def setRenderedItem(value: Element): Self = StObject.set(x, "renderedItem", value.asInstanceOf[js.Any])
    }
  }
}
