package typings.officeUiFabricReact.contextualMenuTypesMod

import typings.officeUiFabricReact.anon.PartialIContextualMenuIte
import typings.officeUiFabricReact.contextualMenuClassNamesMod.IMenuItemClassNames
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuRenderItem
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerClassNames
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuItemRenderProps extends IContextualMenuItem {
  var focusableElementIndex: Double
  var hasCheckmarks: Boolean
  var hasIcons: Boolean
  var index: Double
  var totalItemCount: Double
}

object IContextualMenuItemRenderProps {
  @scala.inline
  def apply(
    focusableElementIndex: Double,
    hasCheckmarks: Boolean,
    hasIcons: Boolean,
    index: Double,
    key: String,
    totalItemCount: Double,
    ariaLabel: String = null,
    canCheck: js.UndefOr[Boolean] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    componentRef: IRefObject[IContextualMenuRenderItem] = null,
    customOnRenderListLength: js.UndefOr[Double] = js.undefined,
    data: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    getItemClassNames: (/* theme */ ITheme, /* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* isAnchorLink */ Boolean, /* knownIcon */ Boolean, /* itemClassName */ js.UndefOr[String], /* dividerClassName */ js.UndefOr[String], /* iconClassName */ js.UndefOr[String], /* subMenuClassName */ js.UndefOr[String], /* primaryDisabled */ js.UndefOr[Boolean]) => IMenuItemClassNames = null,
    getSplitButtonVerticalDividerClassNames: /* theme */ ITheme => IVerticalDividerClassNames = null,
    href: String = null,
    iconProps: IIconProps = null,
    inactive: js.UndefOr[Boolean] = js.undefined,
    itemProps: PartialIContextualMenuIte = null,
    itemType: ContextualMenuItemType = null,
    keytipProps: IKeytipProps = null,
    name: String = null,
    onClick: (/* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => Boolean | Unit = null,
    onMouseDown: (/* item */ IContextualMenuItem, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onRender: (/* item */ js.Any, /* dismissMenu */ js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit]) => ReactNode = null,
    onRenderIcon: (/* props */ js.UndefOr[IContextualMenuItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuItemProps], Element | Null]]) => Element | Null = null,
    primaryDisabled: js.UndefOr[Boolean] = js.undefined,
    rel: String = null,
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
    title: String = null
  ): IContextualMenuItemRenderProps = {
    val __obj = js.Dynamic.literal(focusableElementIndex = focusableElementIndex.asInstanceOf[js.Any], hasCheckmarks = hasCheckmarks.asInstanceOf[js.Any], hasIcons = hasIcons.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(canCheck)) __obj.updateDynamic("canCheck")(canCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(customOnRenderListLength)) __obj.updateDynamic("customOnRenderListLength")(customOnRenderListLength.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (getItemClassNames != null) __obj.updateDynamic("getItemClassNames")(js.Any.fromFunction11(getItemClassNames))
    if (getSplitButtonVerticalDividerClassNames != null) __obj.updateDynamic("getSplitButtonVerticalDividerClassNames")(js.Any.fromFunction1(getSplitButtonVerticalDividerClassNames))
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps.asInstanceOf[js.Any])
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive.get.asInstanceOf[js.Any])
    if (itemProps != null) __obj.updateDynamic("itemProps")(itemProps.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction2(onRender))
    if (onRenderIcon != null) __obj.updateDynamic("onRenderIcon")(js.Any.fromFunction2(onRenderIcon))
    if (!js.isUndefined(primaryDisabled)) __obj.updateDynamic("primaryDisabled")(primaryDisabled.get.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (sectionProps != null) __obj.updateDynamic("sectionProps")(sectionProps.asInstanceOf[js.Any])
    if (shortCut != null) __obj.updateDynamic("shortCut")(shortCut.asInstanceOf[js.Any])
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subMenuProps != null) __obj.updateDynamic("subMenuProps")(subMenuProps.asInstanceOf[js.Any])
    if (submenuIconProps != null) __obj.updateDynamic("submenuIconProps")(submenuIconProps.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuItemRenderProps]
  }
}

