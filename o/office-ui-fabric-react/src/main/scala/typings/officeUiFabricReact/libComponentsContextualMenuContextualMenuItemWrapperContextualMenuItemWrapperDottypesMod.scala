package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDotclassNamesMod.IMenuItemClassNames
import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuItem
import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemDottypesMod.IContextualMenuItemProps
import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemWrapperContextualMenuItemWrapperMod.ContextualMenuItemWrapper
import typings.react.mod.ClassAttributes
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.std.HTMLElement
import typings.std.PointerEvent
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsContextualMenuContextualMenuItemWrapperContextualMenuItemWrapperDottypesMod {
  
  trait IContextualMenuItemWrapperProps
    extends StObject
       with ClassAttributes[IContextualMenuItem] {
    
    /**
      * CSS class to apply to the context menu.
      */
    var classNames: IMenuItemClassNames
    
    /**
      * Optional callback to access the ContextualMenuSplitButton interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ContextualMenuItemWrapper]] = js.undefined
    
    /**
      * Method to override the render of the individual menu items.
      * @defaultvalue ContextualMenuItem
      */
    var contextualMenuItemAs: js.UndefOr[
        (ComponentClass[IContextualMenuItemProps, ComponentState]) | FunctionComponent[IContextualMenuItemProps]
      ] = js.undefined
    
    /**
      * This prop will get set by ContextualMenu and can be called to close the menu this item belongs to.
      * If dismissAll is true, all menus will be closed.
      */
    var dismissMenu: js.UndefOr[
        js.Function2[/* ev */ js.UndefOr[Any], /* dismissAll */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /**
      * This prop will get set by ContextualMenu and can be called to close this item's subMenu, if present.
      */
    var dismissSubMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback for when the click event on the primary button.
      */
    var executeItemClick: js.UndefOr[
        js.Function2[
          /* item */ IContextualMenuItem, 
          /* ev */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Key of the currently expanded subMenu.
      */
    var expandedMenuItemKey: js.UndefOr[String] = js.undefined
    
    /**
      * The index number of the wrapper among all items in the contextual menu excluding dividers and headers.
      */
    var focusableElementIndex: Double
    
    /**
      * Callback to get the subMenu ID for an IContextualMenuItem.
      * @deprecated ID relationship between a menu button and menu isn't necessary
      */
    var getSubMenuId: js.UndefOr[js.Function1[/* item */ IContextualMenuItem, js.UndefOr[String]]] = js.undefined
    
    /**
      * Whether or not if the item for the wrapper uses checkmarks.
      */
    var hasCheckmarks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the item for the wrapper uses icons.
      */
    var hasIcons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The index number of the wrapper among all items in the contextual menu including things like dividers and headers.
      */
    var index: Double
    
    /**
      * The IContextualMenuItem that is used to render the item in the menu.
      */
    var item: IContextualMenuItem
    
    /**
      * Callback for when the click event on the icon button from the wrapper.
      */
    var onItemClick: js.UndefOr[
        js.Function2[
          /* item */ IContextualMenuItem, 
          /* ev */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback for when the click event on the icon button which also takes in a specific HTMLElement
      * that will be focused.
      */
    var onItemClickBase: js.UndefOr[
        js.Function3[
          /* item */ IContextualMenuItem, 
          /* ev */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement], 
          /* target */ HTMLElement, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback for keyboard events on the wrapper.
      */
    var onItemKeyDown: js.UndefOr[
        js.Function2[/* item */ IContextualMenuItem, /* ev */ KeyboardEvent[HTMLElement], Unit]
      ] = js.undefined
    
    /**
      * Callback for the mousedown event on the icon button in the wrapper.
      */
    var onItemMouseDown: js.UndefOr[
        js.Function2[
          /* item */ IContextualMenuItem, 
          /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback for when the user's mouse enters the wrapper.
      */
    var onItemMouseEnter: js.UndefOr[
        js.Function3[
          /* item */ IContextualMenuItem, 
          /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], 
          /* target */ HTMLElement, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    /**
      * Callback for when the user's mouse leaves the wrapper.
      */
    var onItemMouseLeave: js.UndefOr[
        js.Function2[
          /* item */ IContextualMenuItem, 
          /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback for when the user's mouse moves in the wrapper.
      */
    var onItemMouseMove: js.UndefOr[
        js.Function3[
          /* item */ IContextualMenuItem, 
          /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], 
          /* target */ HTMLElement, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback for touch/pointer events on the split button.
      */
    var onTap: js.UndefOr[js.Function1[/* ev */ TouchEvent[HTMLElement] | PointerEvent, Unit]] = js.undefined
    
    /**
      * This prop will get set by ContextualMenu and can be called to open this item's subMenu, if present.
      */
    var openSubMenu: js.UndefOr[js.Function2[/* item */ Any, /* target */ HTMLElement, Unit]] = js.undefined
    
    /**
      * The total number of items in the contextual menu.
      */
    var totalItemCount: Double
  }
  object IContextualMenuItemWrapperProps {
    
    inline def apply(
      classNames: IMenuItemClassNames,
      focusableElementIndex: Double,
      index: Double,
      item: IContextualMenuItem,
      totalItemCount: Double
    ): IContextualMenuItemWrapperProps = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], focusableElementIndex = focusableElementIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextualMenuItemWrapperProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IContextualMenuItemWrapperProps] (val x: Self) extends AnyVal {
      
      inline def setClassNames(value: IMenuItemClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setComponentRef(value: IRefObject[ContextualMenuItemWrapper]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ ContextualMenuItemWrapper | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setContextualMenuItemAs(
        value: (ComponentClass[IContextualMenuItemProps, ComponentState]) | FunctionComponent[IContextualMenuItemProps]
      ): Self = StObject.set(x, "contextualMenuItemAs", value.asInstanceOf[js.Any])
      
      inline def setContextualMenuItemAsUndefined: Self = StObject.set(x, "contextualMenuItemAs", js.undefined)
      
      inline def setDismissMenu(value: (/* ev */ js.UndefOr[Any], /* dismissAll */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "dismissMenu", js.Any.fromFunction2(value))
      
      inline def setDismissMenuUndefined: Self = StObject.set(x, "dismissMenu", js.undefined)
      
      inline def setDismissSubMenu(value: () => Unit): Self = StObject.set(x, "dismissSubMenu", js.Any.fromFunction0(value))
      
      inline def setDismissSubMenuUndefined: Self = StObject.set(x, "dismissSubMenu", js.undefined)
      
      inline def setExecuteItemClick(
        value: (/* item */ IContextualMenuItem, /* ev */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]) => Unit
      ): Self = StObject.set(x, "executeItemClick", js.Any.fromFunction2(value))
      
      inline def setExecuteItemClickUndefined: Self = StObject.set(x, "executeItemClick", js.undefined)
      
      inline def setExpandedMenuItemKey(value: String): Self = StObject.set(x, "expandedMenuItemKey", value.asInstanceOf[js.Any])
      
      inline def setExpandedMenuItemKeyUndefined: Self = StObject.set(x, "expandedMenuItemKey", js.undefined)
      
      inline def setFocusableElementIndex(value: Double): Self = StObject.set(x, "focusableElementIndex", value.asInstanceOf[js.Any])
      
      inline def setGetSubMenuId(value: /* item */ IContextualMenuItem => js.UndefOr[String]): Self = StObject.set(x, "getSubMenuId", js.Any.fromFunction1(value))
      
      inline def setGetSubMenuIdUndefined: Self = StObject.set(x, "getSubMenuId", js.undefined)
      
      inline def setHasCheckmarks(value: Boolean): Self = StObject.set(x, "hasCheckmarks", value.asInstanceOf[js.Any])
      
      inline def setHasCheckmarksUndefined: Self = StObject.set(x, "hasCheckmarks", js.undefined)
      
      inline def setHasIcons(value: Boolean): Self = StObject.set(x, "hasIcons", value.asInstanceOf[js.Any])
      
      inline def setHasIconsUndefined: Self = StObject.set(x, "hasIcons", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setItem(value: IContextualMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setOnItemClick(
        value: (/* item */ IContextualMenuItem, /* ev */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]) => Unit
      ): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2(value))
      
      inline def setOnItemClickBase(
        value: (/* item */ IContextualMenuItem, /* ev */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement], /* target */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onItemClickBase", js.Any.fromFunction3(value))
      
      inline def setOnItemClickBaseUndefined: Self = StObject.set(x, "onItemClickBase", js.undefined)
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setOnItemKeyDown(value: (/* item */ IContextualMenuItem, /* ev */ KeyboardEvent[HTMLElement]) => Unit): Self = StObject.set(x, "onItemKeyDown", js.Any.fromFunction2(value))
      
      inline def setOnItemKeyDownUndefined: Self = StObject.set(x, "onItemKeyDown", js.undefined)
      
      inline def setOnItemMouseDown(
        value: (/* item */ IContextualMenuItem, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onItemMouseDown", js.Any.fromFunction2(value))
      
      inline def setOnItemMouseDownUndefined: Self = StObject.set(x, "onItemMouseDown", js.undefined)
      
      inline def setOnItemMouseEnter(
        value: (/* item */ IContextualMenuItem, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* target */ HTMLElement) => Boolean | Unit
      ): Self = StObject.set(x, "onItemMouseEnter", js.Any.fromFunction3(value))
      
      inline def setOnItemMouseEnterUndefined: Self = StObject.set(x, "onItemMouseEnter", js.undefined)
      
      inline def setOnItemMouseLeave(
        value: (/* item */ IContextualMenuItem, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onItemMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnItemMouseLeaveUndefined: Self = StObject.set(x, "onItemMouseLeave", js.undefined)
      
      inline def setOnItemMouseMove(
        value: (/* item */ IContextualMenuItem, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* target */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onItemMouseMove", js.Any.fromFunction3(value))
      
      inline def setOnItemMouseMoveUndefined: Self = StObject.set(x, "onItemMouseMove", js.undefined)
      
      inline def setOnTap(value: /* ev */ TouchEvent[HTMLElement] | PointerEvent => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
      
      inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      inline def setOpenSubMenu(value: (/* item */ Any, /* target */ HTMLElement) => Unit): Self = StObject.set(x, "openSubMenu", js.Any.fromFunction2(value))
      
      inline def setOpenSubMenuUndefined: Self = StObject.set(x, "openSubMenu", js.undefined)
      
      inline def setTotalItemCount(value: Double): Self = StObject.set(x, "totalItemCount", value.asInstanceOf[js.Any])
    }
  }
}
