package typings.officeUiFabricReact.contextualMenuItemWrapperTypesMod

import typings.officeUiFabricReact.contextualMenuClassNamesMod.IMenuItemClassNames
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typings.officeUiFabricReact.contextualMenuItemWrapperContextualMenuItemWrapperMod.ContextualMenuItemWrapper
import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
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
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuItemWrapperProps extends ClassAttributes[IContextualMenuItem] {
  /**
    * CSS class to apply to the context menu.
    */
  var classNames: IMenuItemClassNames = js.native
  /**
    * Optional callback to access the ContextualMenuSplitButton interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ContextualMenuItemWrapper]] = js.native
  /**
    * Method to override the render of the individual menu items.
    * @defaultvalue ContextualMenuItem
    */
  var contextualMenuItemAs: js.UndefOr[
    (ComponentClass[IContextualMenuItemProps, ComponentState]) | FunctionComponent[IContextualMenuItemProps]
  ] = js.native
  /**
    * This prop will get set by ContextualMenu and can be called to close the menu this item belongs to.
    * If dismissAll is true, all menus will be closed.
    */
  var dismissMenu: js.UndefOr[
    js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /**
    * This prop will get set by ContextualMenu and can be called to close this item's subMenu, if present.
    */
  var dismissSubMenu: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback for when the click event on the primary button.
    */
  var executeItemClick: js.UndefOr[
    js.Function2[
      /* item */ IContextualMenuItem, 
      /* ev */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement], 
      Unit
    ]
  ] = js.native
  /**
    * Key of the currently expanded subMenu.
    */
  var expandedMenuItemKey: js.UndefOr[String] = js.native
  /**
    * The index number of the wrapper among all items in the contextual menu excluding dividers and headers.
    */
  var focusableElementIndex: Double = js.native
  /**
    * Callback to get the subMenu ID for an IContextualMenuItem.
    */
  var getSubMenuId: js.UndefOr[js.Function1[/* item */ IContextualMenuItem, js.UndefOr[String]]] = js.native
  /**
    * Whether or not if the item for the wrapper uses checkmarks.
    */
  var hasCheckmarks: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the item for the wrapper uses icons.
    */
  var hasIcons: js.UndefOr[Boolean] = js.native
  /**
    * The index number of the wrapper among all items in the contextual menu including things like dividers and headers.
    */
  var index: Double = js.native
  /**
    * The IContextualMenuItem that is used to render the item in the menu.
    */
  var item: IContextualMenuItem = js.native
  /**
    * Callback for when the click event on the icon button from the wrapper.
    */
  var onItemClick: js.UndefOr[
    js.Function2[
      /* item */ IContextualMenuItem, 
      /* ev */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement], 
      Unit
    ]
  ] = js.native
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
  ] = js.native
  /**
    * Callback for keyboard events on the wrapper.
    */
  var onItemKeyDown: js.UndefOr[
    js.Function2[/* item */ IContextualMenuItem, /* ev */ KeyboardEvent[HTMLElement], Unit]
  ] = js.native
  /**
    * Callback for the mousedown event on the icon button in the wrapper.
    */
  var onItemMouseDown: js.UndefOr[
    js.Function2[
      /* item */ IContextualMenuItem, 
      /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
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
  ] = js.native
  /**
    * Callback for when the user's mouse leaves the wrapper.
    */
  var onItemMouseLeave: js.UndefOr[
    js.Function2[
      /* item */ IContextualMenuItem, 
      /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
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
  ] = js.native
  /**
    * Callback for touch/pointer events on the split button.
    */
  var onTap: js.UndefOr[js.Function1[/* ev */ TouchEvent[HTMLElement] | PointerEvent, Unit]] = js.native
  /**
    * This prop will get set by ContextualMenu and can be called to open this item's subMenu, if present.
    */
  var openSubMenu: js.UndefOr[js.Function2[/* item */ js.Any, /* target */ HTMLElement, Unit]] = js.native
  /**
    * The total number of items in the contextual menu.
    */
  var totalItemCount: Double = js.native
}

object IContextualMenuItemWrapperProps {
  @scala.inline
  def apply(
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
  implicit class IContextualMenuItemWrapperPropsOps[Self <: IContextualMenuItemWrapperProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassNames(value: IMenuItemClassNames): Self = this.set("classNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusableElementIndex(value: Double): Self = this.set("focusableElementIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: IContextualMenuItem): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalItemCount(value: Double): Self = this.set("totalItemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ContextualMenuItemWrapper | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[ContextualMenuItemWrapper]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setContextualMenuItemAs(
      value: (ComponentClass[IContextualMenuItemProps, ComponentState]) | FunctionComponent[IContextualMenuItemProps]
    ): Self = this.set("contextualMenuItemAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextualMenuItemAs: Self = this.set("contextualMenuItemAs", js.undefined)
    @scala.inline
    def setDismissMenu(value: (/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean]) => Unit): Self = this.set("dismissMenu", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDismissMenu: Self = this.set("dismissMenu", js.undefined)
    @scala.inline
    def setDismissSubMenu(value: () => Unit): Self = this.set("dismissSubMenu", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDismissSubMenu: Self = this.set("dismissSubMenu", js.undefined)
    @scala.inline
    def setExecuteItemClick(
      value: (/* item */ IContextualMenuItem, /* ev */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]) => Unit
    ): Self = this.set("executeItemClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExecuteItemClick: Self = this.set("executeItemClick", js.undefined)
    @scala.inline
    def setExpandedMenuItemKey(value: String): Self = this.set("expandedMenuItemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedMenuItemKey: Self = this.set("expandedMenuItemKey", js.undefined)
    @scala.inline
    def setGetSubMenuId(value: /* item */ IContextualMenuItem => js.UndefOr[String]): Self = this.set("getSubMenuId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetSubMenuId: Self = this.set("getSubMenuId", js.undefined)
    @scala.inline
    def setHasCheckmarks(value: Boolean): Self = this.set("hasCheckmarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasCheckmarks: Self = this.set("hasCheckmarks", js.undefined)
    @scala.inline
    def setHasIcons(value: Boolean): Self = this.set("hasIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasIcons: Self = this.set("hasIcons", js.undefined)
    @scala.inline
    def setOnItemClick(
      value: (/* item */ IContextualMenuItem, /* ev */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]) => Unit
    ): Self = this.set("onItemClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    @scala.inline
    def setOnItemClickBase(
      value: (/* item */ IContextualMenuItem, /* ev */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement], /* target */ HTMLElement) => Unit
    ): Self = this.set("onItemClickBase", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnItemClickBase: Self = this.set("onItemClickBase", js.undefined)
    @scala.inline
    def setOnItemKeyDown(value: (/* item */ IContextualMenuItem, /* ev */ KeyboardEvent[HTMLElement]) => Unit): Self = this.set("onItemKeyDown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnItemKeyDown: Self = this.set("onItemKeyDown", js.undefined)
    @scala.inline
    def setOnItemMouseDown(
      value: (/* item */ IContextualMenuItem, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onItemMouseDown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnItemMouseDown: Self = this.set("onItemMouseDown", js.undefined)
    @scala.inline
    def setOnItemMouseEnter(
      value: (/* item */ IContextualMenuItem, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* target */ HTMLElement) => Boolean | Unit
    ): Self = this.set("onItemMouseEnter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnItemMouseEnter: Self = this.set("onItemMouseEnter", js.undefined)
    @scala.inline
    def setOnItemMouseLeave(
      value: (/* item */ IContextualMenuItem, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onItemMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnItemMouseLeave: Self = this.set("onItemMouseLeave", js.undefined)
    @scala.inline
    def setOnItemMouseMove(
      value: (/* item */ IContextualMenuItem, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* target */ HTMLElement) => Unit
    ): Self = this.set("onItemMouseMove", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnItemMouseMove: Self = this.set("onItemMouseMove", js.undefined)
    @scala.inline
    def setOnTap(value: /* ev */ TouchEvent[HTMLElement] | PointerEvent => Unit): Self = this.set("onTap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTap: Self = this.set("onTap", js.undefined)
    @scala.inline
    def setOpenSubMenu(value: (/* item */ js.Any, /* target */ HTMLElement) => Unit): Self = this.set("openSubMenu", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOpenSubMenu: Self = this.set("openSubMenu", js.undefined)
  }
  
}

