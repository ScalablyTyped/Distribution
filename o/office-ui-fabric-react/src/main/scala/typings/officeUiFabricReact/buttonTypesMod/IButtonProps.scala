package typings.officeUiFabricReact.buttonTypesMod

import typings.officeUiFabricReact.baseButtonClassNamesMod.IButtonClassNames
import typings.officeUiFabricReact.baseButtonMod.BaseButton
import typings.officeUiFabricReact.buttonButtonMod.Button
import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.splitButtonClassNamesMod.ISplitButtonClassNames
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.icomponentasMod.IComponentAs
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typings.uifabricUtilities.keyCodesMod.KeyCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonProps extends AllHTMLAttributes[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ] {
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
    js.Function11[
      /* theme */ ITheme, 
      /* className */ String, 
      /* variantClassName */ String, 
      /* iconClassName */ js.UndefOr[String], 
      /* menuIconClassName */ js.UndefOr[String], 
      /* disabled */ Boolean, 
      /* checked */ Boolean, 
      /* expanded */ Boolean, 
      /* hasMenu */ Boolean, 
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
    * how the default icon looks. Providing this in addition of onClick and setting the split property to true will
    * render a SplitButton.
    */
  var menuProps: js.UndefOr[IContextualMenuProps] = js.undefined
  /**
    * Provides a custom KeyCode that can be used to open the button menu.
    * The default KeyCode is the down arrow.
    * A value of null can be provided to disable the key codes for opening the button menu.
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
    * impact overall perf by having more elements in the dom. Should only be used
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
    * Optional props to be applied only to the primary action button of SplitButton and not to the
    * overall SplitButton container
    */
  var primaryActionButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /**
    * If set to true and if this is a splitButton (split == true) then the primary action of a split button is disabled.
    */
  var primaryDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the persisted menu is rendered hidden when the button
    * initially mounts. Non-persisted menus will
    * not be in the component tree unless they are being shown
    *
    * Note: This increases the time the button will take to mount, but
    * can improve perceived menu open perf. when the user opens the menu.
    *
    * @defaultvalue undefined, equivalent to false
    *
    * @deprecated There is known bug in Edge when this prop is true where scrollbars
    * overlap with the content when a menu is first rendered hidden.
    * See: https://github.com/OfficeDev/office-ui-fabric-react/issues/9034
    * Please do not start using this. If you are already using this,
    * please make sure that you are doing so only in non-Edge browsers
    */
  var renderPersistedMenuHiddenOnMount: js.UndefOr[Boolean] = js.undefined
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
    * If set to true, and if menuProps and onClick are provided, the button will render as a SplitButton.
    * @defaultvalue false
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
    AllHTMLAttributes: AllHTMLAttributes[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ] = null,
    allowDisabledFocus: js.UndefOr[Boolean] = js.undefined,
    ariaDescription: String = null,
    ariaHidden: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    buttonType: ButtonType = null,
    componentRef: IRefObject[IButton] = null,
    data: js.Any = null,
    defaultRender: js.Any = null,
    description: IStyle = null,
    getClassNames: (/* theme */ ITheme, /* className */ String, /* variantClassName */ String, /* iconClassName */ js.UndefOr[String], /* menuIconClassName */ js.UndefOr[String], /* disabled */ Boolean, /* checked */ Boolean, /* expanded */ Boolean, /* hasMenu */ Boolean, /* isSplit */ js.UndefOr[Boolean], /* allowDisabledFocus */ Boolean) => IButtonClassNames = null,
    getSplitButtonClassNames: (/* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* allowDisabledFocus */ Boolean) => ISplitButtonClassNames = null,
    iconProps: IIconProps = null,
    keytipProps: IKeytipProps = null,
    menuAs: IComponentAs[IContextualMenuProps] = null,
    menuIconProps: IIconProps = null,
    menuProps: IContextualMenuProps = null,
    menuTriggerKeyCode: Int | Double = null,
    onAfterMenuDismiss: () => Unit = null,
    onMenuClick: (/* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], /* button */ js.UndefOr[IButtonProps]) => Unit = null,
    onRenderAriaDescription: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null = null,
    onRenderChildren: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null = null,
    onRenderDescription: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null = null,
    onRenderIcon: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null = null,
    onRenderMenu: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuProps], Element | Null]]) => Element | Null = null,
    onRenderMenuIcon: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null = null,
    onRenderText: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null = null,
    persistMenu: js.UndefOr[Boolean] = js.undefined,
    primary: js.UndefOr[Boolean] = js.undefined,
    primaryActionButtonProps: IButtonProps = null,
    primaryDisabled: js.UndefOr[Boolean] = js.undefined,
    renderPersistedMenuHiddenOnMount: js.UndefOr[Boolean] = js.undefined,
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
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (!js.isUndefined(allowDisabledFocus)) __obj.updateDynamic("allowDisabledFocus")(allowDisabledFocus.asInstanceOf[js.Any])
    if (ariaDescription != null) __obj.updateDynamic("ariaDescription")(ariaDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaHidden)) __obj.updateDynamic("ariaHidden")(ariaHidden.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultRender != null) __obj.updateDynamic("defaultRender")(defaultRender.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction11(getClassNames))
    if (getSplitButtonClassNames != null) __obj.updateDynamic("getSplitButtonClassNames")(js.Any.fromFunction4(getSplitButtonClassNames))
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps.asInstanceOf[js.Any])
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps.asInstanceOf[js.Any])
    if (menuAs != null) __obj.updateDynamic("menuAs")(menuAs.asInstanceOf[js.Any])
    if (menuIconProps != null) __obj.updateDynamic("menuIconProps")(menuIconProps.asInstanceOf[js.Any])
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps.asInstanceOf[js.Any])
    if (menuTriggerKeyCode != null) __obj.updateDynamic("menuTriggerKeyCode")(menuTriggerKeyCode.asInstanceOf[js.Any])
    if (onAfterMenuDismiss != null) __obj.updateDynamic("onAfterMenuDismiss")(js.Any.fromFunction0(onAfterMenuDismiss))
    if (onMenuClick != null) __obj.updateDynamic("onMenuClick")(js.Any.fromFunction2(onMenuClick))
    if (onRenderAriaDescription != null) __obj.updateDynamic("onRenderAriaDescription")(js.Any.fromFunction2(onRenderAriaDescription))
    if (onRenderChildren != null) __obj.updateDynamic("onRenderChildren")(js.Any.fromFunction2(onRenderChildren))
    if (onRenderDescription != null) __obj.updateDynamic("onRenderDescription")(js.Any.fromFunction2(onRenderDescription))
    if (onRenderIcon != null) __obj.updateDynamic("onRenderIcon")(js.Any.fromFunction2(onRenderIcon))
    if (onRenderMenu != null) __obj.updateDynamic("onRenderMenu")(js.Any.fromFunction2(onRenderMenu))
    if (onRenderMenuIcon != null) __obj.updateDynamic("onRenderMenuIcon")(js.Any.fromFunction2(onRenderMenuIcon))
    if (onRenderText != null) __obj.updateDynamic("onRenderText")(js.Any.fromFunction2(onRenderText))
    if (!js.isUndefined(persistMenu)) __obj.updateDynamic("persistMenu")(persistMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (primaryActionButtonProps != null) __obj.updateDynamic("primaryActionButtonProps")(primaryActionButtonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryDisabled)) __obj.updateDynamic("primaryDisabled")(primaryDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(renderPersistedMenuHiddenOnMount)) __obj.updateDynamic("renderPersistedMenuHiddenOnMount")(renderPersistedMenuHiddenOnMount.asInstanceOf[js.Any])
    if (rootProps != null) __obj.updateDynamic("rootProps")(rootProps.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (splitButtonAriaLabel != null) __obj.updateDynamic("splitButtonAriaLabel")(splitButtonAriaLabel.asInstanceOf[js.Any])
    if (splitButtonMenuProps != null) __obj.updateDynamic("splitButtonMenuProps")(splitButtonMenuProps.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (!js.isUndefined(toggled)) __obj.updateDynamic("toggled")(toggled.asInstanceOf[js.Any])
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButtonProps]
  }
}

