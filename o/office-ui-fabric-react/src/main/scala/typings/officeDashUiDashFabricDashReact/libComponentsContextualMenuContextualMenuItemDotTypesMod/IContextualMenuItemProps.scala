package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotClassNamesMod.IMenuItemClassNames
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem
import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuItemProps extends HTMLAttributes[IContextualMenuItemProps] {
  /**
    * Classnames for different aspects of a menu item
    */
  var classNames: IMenuItemClassNames
  /**
    * Optional callback to access the IContextualMenuRenderItem interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IContextualMenuRenderItem]] = js.undefined
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
    * This prop will get set by the wrapping component and will return the element that wraps this ContextualMenuItem.
    * Used for openSubMenu.
    */
  var getSubmenuTarget: js.UndefOr[js.Function0[js.UndefOr[HTMLElement]]] = js.undefined
  /**
    * If this item has icons
    */
  var hasIcons: js.UndefOr[Boolean] = js.undefined
  /**
    * Index of the item
    */
  var index: Double
  /**
    * The item to display
    */
  var item: IContextualMenuItem
  /**
    * Click handler for the checkmark
    */
  var onCheckmarkClick: js.UndefOr[
    js.Function2[
      /* item */ IContextualMenuItem, 
      /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  /**
    * This prop will get set by ContextualMenu and can be called to open this item's subMenu, if present.
    */
  var openSubMenu: js.UndefOr[js.Function2[/* item */ js.Any, /* target */ HTMLElement, Unit]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IContextualMenuItemStyleProps, IContextualMenuItemStyles]] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IContextualMenuItemProps {
  @scala.inline
  def apply(
    classNames: IMenuItemClassNames,
    index: Double,
    item: IContextualMenuItem,
    HTMLAttributes: HTMLAttributes[IContextualMenuItemProps] = null,
    className: String = null,
    componentRef: IRefObject[IContextualMenuRenderItem] = null,
    dismissMenu: (/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean]) => Unit = null,
    dismissSubMenu: () => Unit = null,
    getSubmenuTarget: () => js.UndefOr[HTMLElement] = null,
    hasIcons: js.UndefOr[Boolean] = js.undefined,
    onCheckmarkClick: (/* item */ IContextualMenuItem, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    openSubMenu: (/* item */ js.Any, /* target */ HTMLElement) => Unit = null,
    styles: IStyleFunctionOrObject[IContextualMenuItemStyleProps, IContextualMenuItemStyles] = null,
    theme: ITheme = null
  ): IContextualMenuItemProps = {
    val __obj = js.Dynamic.literal(classNames = classNames, index = index, item = item)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (dismissMenu != null) __obj.updateDynamic("dismissMenu")(js.Any.fromFunction2(dismissMenu))
    if (dismissSubMenu != null) __obj.updateDynamic("dismissSubMenu")(js.Any.fromFunction0(dismissSubMenu))
    if (getSubmenuTarget != null) __obj.updateDynamic("getSubmenuTarget")(js.Any.fromFunction0(getSubmenuTarget))
    if (!js.isUndefined(hasIcons)) __obj.updateDynamic("hasIcons")(hasIcons)
    if (onCheckmarkClick != null) __obj.updateDynamic("onCheckmarkClick")(js.Any.fromFunction2(onCheckmarkClick))
    if (openSubMenu != null) __obj.updateDynamic("openSubMenu")(js.Any.fromFunction2(openSubMenu))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IContextualMenuItemProps]
  }
}

