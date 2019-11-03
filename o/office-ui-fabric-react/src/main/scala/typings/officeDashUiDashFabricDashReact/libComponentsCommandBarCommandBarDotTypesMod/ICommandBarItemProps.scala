package typings.officeDashUiDashFabricDashReact.libComponentsCommandBarCommandBarDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIComponentAsMod.IComponentAs
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonStyles
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotClassNamesMod.IMenuItemClassNames
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuProps
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuSection
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuItemProps
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuRenderItem
import typings.officeDashUiDashFabricDashReact.libComponentsDividerVerticalDividerDotTypesMod.IVerticalDividerClassNames
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
import typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHostProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandBarItemProps extends IContextualMenuItem {
  /**
    * Custom styles for individual button
    */
  var buttonStyles: js.UndefOr[IButtonStyles] = js.undefined
  /**
    * A custom cache key to be used for this item. If `cacheKey` is changed, the cache will invalidate.
    * Defaults to `key` value.
    */
  var cacheKey: js.UndefOr[String] = js.undefined
  /**
    * Method to override the render of the individual command bar button.
    * Not used when item is rendered in overflow.
    * @defaultvalue CommandBarButton
    */
  var commandBarButtonAs: js.UndefOr[IComponentAs[ICommandBarItemProps]] = js.undefined
  /**
    * Show only an icon for this item, not text.
    * Does not apply if item is in the overflow.
    * @defaultvalue false
    */
  var iconOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Context under which the item is being rendered.
    * This value is mutated by the CommandBar and is useful for adjusting the `onRender` function.
    */
  var renderedInOverflow: js.UndefOr[Boolean] = js.undefined
  /**
    * Props for the tooltip when in `iconOnly` mode.
    */
  var tooltipHostProps: js.UndefOr[ITooltipHostProps] = js.undefined
}

object ICommandBarItemProps {
  @scala.inline
  def apply(
    key: String,
    ariaLabel: String = null,
    buttonStyles: IButtonStyles = null,
    cacheKey: String = null,
    canCheck: js.UndefOr[Boolean] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    commandBarButtonAs: IComponentAs[ICommandBarItemProps] = null,
    componentRef: IRefObject[IContextualMenuRenderItem] = null,
    customOnRenderListLength: Int | Double = null,
    data: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    getItemClassNames: (/* theme */ ITheme, /* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* isAnchorLink */ Boolean, /* knownIcon */ Boolean, /* itemClassName */ js.UndefOr[String], /* dividerClassName */ js.UndefOr[String], /* iconClassName */ js.UndefOr[String], /* subMenuClassName */ js.UndefOr[String], /* primaryDisabled */ js.UndefOr[Boolean]) => IMenuItemClassNames = null,
    getSplitButtonVerticalDividerClassNames: /* theme */ ITheme => IVerticalDividerClassNames = null,
    href: String = null,
    iconOnly: js.UndefOr[Boolean] = js.undefined,
    iconProps: IIconProps = null,
    inactive: js.UndefOr[Boolean] = js.undefined,
    itemProps: Partial[IContextualMenuItemProps] = null,
    itemType: ContextualMenuItemType = null,
    keytipProps: IKeytipProps = null,
    name: String = null,
    onClick: (/* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => Boolean | Unit = null,
    onMouseDown: (/* item */ IContextualMenuItem, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onRender: (/* item */ js.Any, /* dismissMenu */ js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit]) => ReactNode = null,
    onRenderIcon: (/* props */ js.UndefOr[IContextualMenuItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuItemProps], Element | Null]]) => Element | Null = null,
    primaryDisabled: js.UndefOr[Boolean] = js.undefined,
    rel: String = null,
    renderedInOverflow: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    secondaryText: String = null,
    sectionProps: IContextualMenuSection = null,
    shortCut: String = null,
    split: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    subMenuProps: IContextualMenuProps = null,
    submenuIconProps: IIconProps = null,
    target: String = null,
    text: String = null,
    title: String = null,
    tooltipHostProps: ITooltipHostProps = null
  ): ICommandBarItemProps = {
    val __obj = js.Dynamic.literal(key = key)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (buttonStyles != null) __obj.updateDynamic("buttonStyles")(buttonStyles)
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(cacheKey)
    if (!js.isUndefined(canCheck)) __obj.updateDynamic("canCheck")(canCheck)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (className != null) __obj.updateDynamic("className")(className)
    if (commandBarButtonAs != null) __obj.updateDynamic("commandBarButtonAs")(commandBarButtonAs.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (customOnRenderListLength != null) __obj.updateDynamic("customOnRenderListLength")(customOnRenderListLength.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (getItemClassNames != null) __obj.updateDynamic("getItemClassNames")(js.Any.fromFunction11(getItemClassNames))
    if (getSplitButtonVerticalDividerClassNames != null) __obj.updateDynamic("getSplitButtonVerticalDividerClassNames")(js.Any.fromFunction1(getSplitButtonVerticalDividerClassNames))
    if (href != null) __obj.updateDynamic("href")(href)
    if (!js.isUndefined(iconOnly)) __obj.updateDynamic("iconOnly")(iconOnly)
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps)
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive)
    if (itemProps != null) __obj.updateDynamic("itemProps")(itemProps)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction2(onRender))
    if (onRenderIcon != null) __obj.updateDynamic("onRenderIcon")(js.Any.fromFunction2(onRenderIcon))
    if (!js.isUndefined(primaryDisabled)) __obj.updateDynamic("primaryDisabled")(primaryDisabled)
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (!js.isUndefined(renderedInOverflow)) __obj.updateDynamic("renderedInOverflow")(renderedInOverflow)
    if (role != null) __obj.updateDynamic("role")(role)
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText)
    if (sectionProps != null) __obj.updateDynamic("sectionProps")(sectionProps)
    if (shortCut != null) __obj.updateDynamic("shortCut")(shortCut)
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subMenuProps != null) __obj.updateDynamic("subMenuProps")(subMenuProps)
    if (submenuIconProps != null) __obj.updateDynamic("submenuIconProps")(submenuIconProps)
    if (target != null) __obj.updateDynamic("target")(target)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltipHostProps != null) __obj.updateDynamic("tooltipHostProps")(tooltipHostProps)
    __obj.asInstanceOf[ICommandBarItemProps]
  }
}

