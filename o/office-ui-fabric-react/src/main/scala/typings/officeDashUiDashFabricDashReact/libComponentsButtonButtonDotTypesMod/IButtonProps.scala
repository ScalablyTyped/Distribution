package typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIComponentAsMod.IComponentAs
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.atUifabricUtilities.libKeyCodesMod.KeyCodes
import typings.officeDashUiDashFabricDashReact.libComponentsButtonBaseButtonDotClassNamesMod.IButtonClassNames
import typings.officeDashUiDashFabricDashReact.libComponentsButtonBaseButtonMod.BaseButton
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonMod.Button
import typings.officeDashUiDashFabricDashReact.libComponentsButtonSplitButtonSplitButtonDotClassNamesMod.ISplitButtonClassNames
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuProps
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.AnchorHTMLAttributes
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonProps extends AllHTMLAttributes[HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button] {
  /**
    * Whether the button can have focus in disabled mode
    */
  var allowDisabledFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Detailed description of the button for the benefit of screen readers.
    *
    * Besides the compound button, other button types will need more information provided to screen reader.
    */
  var ariaDescription: js.UndefOr[String] = js.undefined
  /**
    * If provided and is true it adds an 'aria-hidden' attribute instructing screen readers to ignore the element.
    */
  var ariaHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * The aria label of the button for the benefit of screen readers.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Deprecated at v1.2.3, to be removed at \>= v2.0.0. Use specific button component instead.
    * @defaultvalue ButtonType.default
    * @deprecated Use specific button component instead.
    */
  var buttonType: js.UndefOr[ButtonType] = js.undefined
  /**
    * Optional callback to access the IButton interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IButton]] = js.undefined
  /**
    * Any custom data the developer wishes to associate with the menu item.
    */
  @JSName("data")
  var data_IButtonProps: js.UndefOr[js.Any] = js.undefined
  /**
    * yet unknown docs
    */
  var defaultRender: js.UndefOr[js.Any] = js.undefined
  /**
    * Style for the description text if applicable (for compound buttons.)
    * Deprecated, use `secondaryText` instead.
    * @deprecated Use `secondaryText` instead.
    */
  var description: js.UndefOr[IStyle] = js.undefined
  /**
    * Method to provide the classnames to style a button.
    * The default value for this prop is the getClassnames func
    * defined in BaseButton.classnames.
    * @defaultvalue getBaseButtonClassNames
    */
  var getClassNames: js.UndefOr[
    js.Function10[
      /* theme */ ITheme, 
      /* className */ String, 
      /* variantClassName */ String, 
      /* iconClassName */ js.UndefOr[String], 
      /* menuIconClassName */ js.UndefOr[String], 
      /* disabled */ Boolean, 
      /* checked */ Boolean, 
      /* expanded */ Boolean, 
      /* isSplit */ js.UndefOr[Boolean], 
      /* allowDisabledFocus */ Boolean, 
      IButtonClassNames
    ]
  ] = js.undefined
  /**
    * Method to provide the classnames to style a button.
    * The default value for this prop is the getClassnames func
    * defined in BaseButton.classnames.
    * @defaultvalue getBaseSplitButtonClassNames
    */
  var getSplitButtonClassNames: js.UndefOr[
    js.Function4[
      /* disabled */ Boolean, 
      /* expanded */ Boolean, 
      /* checked */ Boolean, 
      /* allowDisabledFocus */ Boolean, 
      ISplitButtonClassNames
    ]
  ] = js.undefined
  /**
    * The props for the icon shown in the button.
    */
  var iconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * Optional keytip for this button
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  /**
    * Render a custom menu in place of the normal one.
    */
  var menuAs: js.UndefOr[IComponentAs[IContextualMenuProps]] = js.undefined
  /**
    * The props for the icon shown when providing a menu dropdown.
    */
  var menuIconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * Props for button menu. Providing this will default to showing the menu icon. See menuIconProps for overriding
    * how the default icon looks. Providing this in addition of onClick and setting the split property to true will render a SplitButton.
    */
  var menuProps: js.UndefOr[IContextualMenuProps] = js.undefined
  /**
    * Provides a custom KeyCode that can be used to open the button menu.
    * The default KeyCode is the down arrow. A value of null can be provided to disable the key codes for opening the button menu.
    */
  var menuTriggerKeyCode: js.UndefOr[KeyCodes | Null] = js.undefined
  /**
    * Callback that runs after Button's contextualmenu was closed (removed from the DOM)
    */
  var onAfterMenuDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional callback when menu is clicked.
    */
  var onMenuClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], 
      /* button */ js.UndefOr[IButtonProps], 
      Unit
    ]
  ] = js.undefined
  /**
    * Custom render function for the aria description element.
    */
  var onRenderAriaDescription: js.UndefOr[IRenderFunction[IButtonProps]] = js.undefined
  /**
    * Custom render function for rendering the button children.
    */
  var onRenderChildren: js.UndefOr[IRenderFunction[IButtonProps]] = js.undefined
  /**
    * Custom render function for the desciption text.
    */
  var onRenderDescription: js.UndefOr[IRenderFunction[IButtonProps]] = js.undefined
  /**
    * Custom render function for the icon
    */
  var onRenderIcon: js.UndefOr[IRenderFunction[IButtonProps]] = js.undefined
  /**
    * Deprecated at v6.3.2, to be removed at \>= v7.0.0. Use `menuAs` instead.
    * @deprecated Use `menuAs` instead.
    */
  var onRenderMenu: js.UndefOr[IRenderFunction[IContextualMenuProps]] = js.undefined
  /**
    * Custom render function for button menu icon
    */
  var onRenderMenuIcon: js.UndefOr[IRenderFunction[IButtonProps]] = js.undefined
  /**
    * Custom render function for the label text.
    */
  var onRenderText: js.UndefOr[IRenderFunction[IButtonProps]] = js.undefined
  /**
    * Menu will not be created or destroyed when opened or closed, instead it
    * will be hidden. This will improve perf of the menu opening but could potentially
    * impact overall perf by having more elemnts in the dom. Should only be used
    * when perf is important.
    * Note: This may increase the amount of time it takes for the button itself to mount.
    */
  var persistMenu: js.UndefOr[Boolean] = js.undefined
  /**
    * Changes the visual presentation of the button to be emphasized (if defined)
    * @defaultvalue false
    */
  var primary: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional props to be applied only to the primary action button of SplitButton and not to the overall SplitButton container
    */
  var primaryActionButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /**
    * If set to true and if this is a splitButton (split == true) then the primary action of a split button is disabled.
    */
  var primaryDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Deprecated at v0.56.2, to be removed at \>= v1.0.0. Just pass in button props instead.
    * they will be mixed into the button/anchor element rendered by the component.
    * @deprecated Use button props instead.
    */
  var rootProps: js.UndefOr[
    ButtonHTMLAttributes[HTMLButtonElement] | AnchorHTMLAttributes[HTMLAnchorElement]
  ] = js.undefined
  /**
    * Description of the action this button takes.
    * Only used for compound buttons
    */
  var secondaryText: js.UndefOr[String] = js.undefined
  /**
    * If set to true, and if menuProps and onClick are provided, the button will render as a SplitButton. Defaults to false.
    */
  var split: js.UndefOr[Boolean] = js.undefined
  /**
    * Accessible label for the dropdown chevron button if this button is split.
    */
  var splitButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Experimental prop that get passed into the menuButton that's rendered as part of
    * split button. Anything passed in will likely need to have accompanying
    * style changes.
    */
  var splitButtonMenuProps: js.UndefOr[IButtonProps] = js.undefined
  /**
    * Custom styling for individual elements within the button DOM.
    */
  var styles: js.UndefOr[IButtonStyles] = js.undefined
  /**
    * Text to render button label. If text is supplied, it will override any string in button children.
    * Other children components will be passed through after the text.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Whether button is a toggle button with distinct on and off states. This should be true for buttons that permanently
    * change state when a press event finishes, such as a volume mute button.
    */
  var toggle: js.UndefOr[Boolean] = js.undefined
  /**
    * Any custom data the developer wishes to associate with the menu item.
    * Deprecated, use `checked` if setting state.
    * @deprecated unused, use `checked` if setting state.
    */
  var toggled: js.UndefOr[Boolean] = js.undefined
  /**
    * Unique id to identify the item. Typically a duplicate of key value.
    */
  var uniqueId: js.UndefOr[String | Double] = js.undefined
}

object IButtonProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button] = null,
    allowDisabledFocus: js.UndefOr[Boolean] = js.undefined,
    ariaDescription: String = null,
    ariaHidden: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    buttonType: ButtonType = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    componentRef: IRefObject[IButton] = null,
    data: js.Any = null,
    defaultRender: js.Any = null,
    description: IStyle = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    getClassNames: (/* theme */ ITheme, /* className */ String, /* variantClassName */ String, /* iconClassName */ js.UndefOr[String], /* menuIconClassName */ js.UndefOr[String], /* disabled */ Boolean, /* checked */ Boolean, /* expanded */ Boolean, /* isSplit */ js.UndefOr[Boolean], /* allowDisabledFocus */ Boolean) => IButtonClassNames = null,
    getSplitButtonClassNames: (/* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* allowDisabledFocus */ Boolean) => ISplitButtonClassNames = null,
    href: String = null,
    iconProps: IIconProps = null,
    keytipProps: IKeytipProps = null,
    menuAs: IComponentAs[IContextualMenuProps] = null,
    menuIconProps: IIconProps = null,
    menuProps: IContextualMenuProps = null,
    menuTriggerKeyCode: js.UndefOr[KeyCodes] = js.undefined,
    onAfterMenuDismiss: () => Unit = null,
    onMenuClick: (/* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], /* button */ js.UndefOr[IButtonProps]) => Unit = null,
    onRenderAriaDescription: IRenderFunction[IButtonProps] = null,
    onRenderChildren: IRenderFunction[IButtonProps] = null,
    onRenderDescription: IRenderFunction[IButtonProps] = null,
    onRenderIcon: IRenderFunction[IButtonProps] = null,
    onRenderMenu: IRenderFunction[IContextualMenuProps] = null,
    onRenderMenuIcon: IRenderFunction[IButtonProps] = null,
    onRenderText: IRenderFunction[IButtonProps] = null,
    persistMenu: js.UndefOr[Boolean] = js.undefined,
    primary: js.UndefOr[Boolean] = js.undefined,
    primaryActionButtonProps: IButtonProps = null,
    primaryDisabled: js.UndefOr[Boolean] = js.undefined,
    rootProps: ButtonHTMLAttributes[HTMLButtonElement] | AnchorHTMLAttributes[HTMLAnchorElement] = null,
    secondaryText: String = null,
    split: js.UndefOr[Boolean] = js.undefined,
    splitButtonAriaLabel: String = null,
    splitButtonMenuProps: IButtonProps = null,
    styles: IButtonStyles = null,
    text: String = null,
    theme: ITheme = null,
    toggle: js.UndefOr[Boolean] = js.undefined,
    toggled: js.UndefOr[Boolean] = js.undefined,
    uniqueId: String | Double = null
  ): IButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (!js.isUndefined(allowDisabledFocus)) __obj.updateDynamic("allowDisabledFocus")(allowDisabledFocus)
    if (ariaDescription != null) __obj.updateDynamic("ariaDescription")(ariaDescription)
    if (!js.isUndefined(ariaHidden)) __obj.updateDynamic("ariaHidden")(ariaHidden)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (defaultRender != null) __obj.updateDynamic("defaultRender")(defaultRender)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction10(getClassNames))
    if (getSplitButtonClassNames != null) __obj.updateDynamic("getSplitButtonClassNames")(js.Any.fromFunction4(getSplitButtonClassNames))
    if (href != null) __obj.updateDynamic("href")(href)
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps)
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps)
    if (menuAs != null) __obj.updateDynamic("menuAs")(menuAs.asInstanceOf[js.Any])
    if (menuIconProps != null) __obj.updateDynamic("menuIconProps")(menuIconProps)
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps)
    if (!js.isUndefined(menuTriggerKeyCode)) __obj.updateDynamic("menuTriggerKeyCode")(menuTriggerKeyCode)
    if (onAfterMenuDismiss != null) __obj.updateDynamic("onAfterMenuDismiss")(js.Any.fromFunction0(onAfterMenuDismiss))
    if (onMenuClick != null) __obj.updateDynamic("onMenuClick")(js.Any.fromFunction2(onMenuClick))
    if (onRenderAriaDescription != null) __obj.updateDynamic("onRenderAriaDescription")(onRenderAriaDescription)
    if (onRenderChildren != null) __obj.updateDynamic("onRenderChildren")(onRenderChildren)
    if (onRenderDescription != null) __obj.updateDynamic("onRenderDescription")(onRenderDescription)
    if (onRenderIcon != null) __obj.updateDynamic("onRenderIcon")(onRenderIcon)
    if (onRenderMenu != null) __obj.updateDynamic("onRenderMenu")(onRenderMenu)
    if (onRenderMenuIcon != null) __obj.updateDynamic("onRenderMenuIcon")(onRenderMenuIcon)
    if (onRenderText != null) __obj.updateDynamic("onRenderText")(onRenderText)
    if (!js.isUndefined(persistMenu)) __obj.updateDynamic("persistMenu")(persistMenu)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (primaryActionButtonProps != null) __obj.updateDynamic("primaryActionButtonProps")(primaryActionButtonProps)
    if (!js.isUndefined(primaryDisabled)) __obj.updateDynamic("primaryDisabled")(primaryDisabled)
    if (rootProps != null) __obj.updateDynamic("rootProps")(rootProps.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText)
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split)
    if (splitButtonAriaLabel != null) __obj.updateDynamic("splitButtonAriaLabel")(splitButtonAriaLabel)
    if (splitButtonMenuProps != null) __obj.updateDynamic("splitButtonMenuProps")(splitButtonMenuProps)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (text != null) __obj.updateDynamic("text")(text)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    if (!js.isUndefined(toggled)) __obj.updateDynamic("toggled")(toggled)
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButtonProps]
  }
}

