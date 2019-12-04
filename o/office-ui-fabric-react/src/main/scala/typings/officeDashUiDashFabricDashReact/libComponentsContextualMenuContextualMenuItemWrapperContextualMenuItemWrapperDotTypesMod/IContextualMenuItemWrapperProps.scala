package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemWrapperContextualMenuItemWrapperDotTypesMod

import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotClassNamesMod.IMenuItemClassNames
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuItemProps
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemWrapperContextualMenuItemWrapperMod.ContextualMenuItemWrapper
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Key
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.StatelessComponent
import typings.react.reactMod.TouchEvent
import typings.std.HTMLElement
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuItemWrapperProps extends ClassAttributes[IContextualMenuItem] {
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
    (ComponentClass[IContextualMenuItemProps, ComponentState]) | StatelessComponent[IContextualMenuItemProps]
  ] = js.undefined
  /**
    * This prop will get set by ContextualMenu and can be called to close the menu this item belongs to.
    * If dismissAll is true, all menus will be closed.
    */
  var dismissMenu: js.UndefOr[
    js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit]
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
    * Callback for when the click event on the icon button which also takes in a specific HTMLElement that will be focused.
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
  var openSubMenu: js.UndefOr[js.Function2[/* item */ js.Any, /* target */ HTMLElement, Unit]] = js.undefined
  /**
    * The total number of items in the contextual menu.
    */
  var totalItemCount: Double
}

object IContextualMenuItemWrapperProps {
  @scala.inline
  def apply(
    classNames: IMenuItemClassNames,
    focusableElementIndex: Double,
    index: Double,
    item: IContextualMenuItem,
    totalItemCount: Double,
    componentRef: IRefObject[ContextualMenuItemWrapper] = null,
    contextualMenuItemAs: (ComponentClass[IContextualMenuItemProps, ComponentState]) | StatelessComponent[IContextualMenuItemProps] = null,
    dismissMenu: (/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean]) => Unit = null,
    dismissSubMenu: () => Unit = null,
    executeItemClick: (/* item */ IContextualMenuItem, /* ev */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]) => Unit = null,
    expandedMenuItemKey: String = null,
    getSubMenuId: /* item */ IContextualMenuItem => js.UndefOr[String] = null,
    hasCheckmarks: js.UndefOr[Boolean] = js.undefined,
    hasIcons: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onItemClick: (/* item */ IContextualMenuItem, /* ev */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]) => Unit = null,
    onItemClickBase: (/* item */ IContextualMenuItem, /* ev */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement], /* target */ HTMLElement) => Unit = null,
    onItemKeyDown: (/* item */ IContextualMenuItem, /* ev */ KeyboardEvent[HTMLElement]) => Unit = null,
    onItemMouseDown: (/* item */ IContextualMenuItem, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onItemMouseEnter: (/* item */ IContextualMenuItem, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* target */ HTMLElement) => Boolean | Unit = null,
    onItemMouseLeave: (/* item */ IContextualMenuItem, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onItemMouseMove: (/* item */ IContextualMenuItem, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* target */ HTMLElement) => Unit = null,
    onTap: /* ev */ TouchEvent[HTMLElement] | PointerEvent => Unit = null,
    openSubMenu: (/* item */ js.Any, /* target */ HTMLElement) => Unit = null,
    ref: LegacyRef[IContextualMenuItem] = null
  ): IContextualMenuItemWrapperProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], focusableElementIndex = focusableElementIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contextualMenuItemAs != null) __obj.updateDynamic("contextualMenuItemAs")(contextualMenuItemAs.asInstanceOf[js.Any])
    if (dismissMenu != null) __obj.updateDynamic("dismissMenu")(js.Any.fromFunction2(dismissMenu))
    if (dismissSubMenu != null) __obj.updateDynamic("dismissSubMenu")(js.Any.fromFunction0(dismissSubMenu))
    if (executeItemClick != null) __obj.updateDynamic("executeItemClick")(js.Any.fromFunction2(executeItemClick))
    if (expandedMenuItemKey != null) __obj.updateDynamic("expandedMenuItemKey")(expandedMenuItemKey.asInstanceOf[js.Any])
    if (getSubMenuId != null) __obj.updateDynamic("getSubMenuId")(js.Any.fromFunction1(getSubMenuId))
    if (!js.isUndefined(hasCheckmarks)) __obj.updateDynamic("hasCheckmarks")(hasCheckmarks.asInstanceOf[js.Any])
    if (!js.isUndefined(hasIcons)) __obj.updateDynamic("hasIcons")(hasIcons.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (onItemClickBase != null) __obj.updateDynamic("onItemClickBase")(js.Any.fromFunction3(onItemClickBase))
    if (onItemKeyDown != null) __obj.updateDynamic("onItemKeyDown")(js.Any.fromFunction2(onItemKeyDown))
    if (onItemMouseDown != null) __obj.updateDynamic("onItemMouseDown")(js.Any.fromFunction2(onItemMouseDown))
    if (onItemMouseEnter != null) __obj.updateDynamic("onItemMouseEnter")(js.Any.fromFunction3(onItemMouseEnter))
    if (onItemMouseLeave != null) __obj.updateDynamic("onItemMouseLeave")(js.Any.fromFunction2(onItemMouseLeave))
    if (onItemMouseMove != null) __obj.updateDynamic("onItemMouseMove")(js.Any.fromFunction3(onItemMouseMove))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1(onTap))
    if (openSubMenu != null) __obj.updateDynamic("openSubMenu")(js.Any.fromFunction2(openSubMenu))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuItemWrapperProps]
  }
}

