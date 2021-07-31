package typings.officeUiFabricReact

import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typings.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectedItemWithContextMenuMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/SelectedItemWithContextMenu", "SelectedItemWithContextMenu")
  @js.native
  class SelectedItemWithContextMenu protected ()
    extends Component[ISelectedItemWithContextMenuProps, IPeoplePickerItemState, js.Any] {
    def this(props: ISelectedItemWithContextMenuProps) = this()
    
    var _onClick: js.Any = js.native
    
    var _onCloseContextualMenu: js.Any = js.native
    
    var itemElement: RefObject[HTMLDivElement] = js.native
  }
  
  trait IPeoplePickerItemState extends StObject {
    
    var contextualMenuVisible: Boolean
  }
  object IPeoplePickerItemState {
    
    @scala.inline
    def apply(contextualMenuVisible: Boolean): IPeoplePickerItemState = {
      val __obj = js.Dynamic.literal(contextualMenuVisible = contextualMenuVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPeoplePickerItemState]
    }
    
    @scala.inline
    implicit class IPeoplePickerItemStateMutableBuilder[Self <: IPeoplePickerItemState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextualMenuVisible(value: Boolean): Self = StObject.set(x, "contextualMenuVisible", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISelectedItemWithContextMenuProps
    extends StObject
       with IBaseProps[js.Any] {
    
    var beginEditing: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, Unit]] = js.undefined
    
    var item: IExtendedPersonaProps
    
    var menuItems: js.Array[IContextualMenuItem]
    
    var renderedItem: Element
  }
  object ISelectedItemWithContextMenuProps {
    
    @scala.inline
    def apply(item: IExtendedPersonaProps, menuItems: js.Array[IContextualMenuItem], renderedItem: Element): ISelectedItemWithContextMenuProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], renderedItem = renderedItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectedItemWithContextMenuProps]
    }
    
    @scala.inline
    implicit class ISelectedItemWithContextMenuPropsMutableBuilder[Self <: ISelectedItemWithContextMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeginEditing(value: /* item */ IExtendedPersonaProps => Unit): Self = StObject.set(x, "beginEditing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeginEditingUndefined: Self = StObject.set(x, "beginEditing", js.undefined)
      
      @scala.inline
      def setItem(value: IExtendedPersonaProps): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItems(value: js.Array[IContextualMenuItem]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemsVarargs(value: IContextualMenuItem*): Self = StObject.set(x, "menuItems", js.Array(value :_*))
      
      @scala.inline
      def setRenderedItem(value: Element): Self = StObject.set(x, "renderedItem", value.asInstanceOf[js.Any])
    }
  }
}
