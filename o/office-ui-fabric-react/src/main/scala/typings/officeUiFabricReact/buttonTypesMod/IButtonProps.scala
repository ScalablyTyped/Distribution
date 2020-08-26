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
import typings.react.mod.global.JSX.Element
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

@js.native
trait IButtonProps extends AllHTMLAttributes[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ] {
  /**
    * Whether the button can have focus in disabled mode
    */
  var allowDisabledFocus: js.UndefOr[Boolean] = js.native
  /**
    * Detailed description of the button for the benefit of screen readers.
    *
    * Besides the compound button, other button types will need more information provided to screen reader.
    */
  var ariaDescription: js.UndefOr[String] = js.native
  /**
    * If provided and is true it adds an 'aria-hidden' attribute instructing screen readers to ignore the element.
    */
  var ariaHidden: js.UndefOr[Boolean] = js.native
  /**
    * The aria label of the button for the benefit of screen readers.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Deprecated at v1.2.3, to be removed at \>= v2.0.0. Use specific button component instead.
    * @defaultvalue ButtonType.default
    * @deprecated Use specific button component instead.
    */
  var buttonType: js.UndefOr[ButtonType] = js.native
  /**
    * Optional callback to access the IButton interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IButton]] = js.native
  /**
    * Any custom data the developer wishes to associate with the menu item.
    */
  @JSName("data")
  var data_IButtonProps: js.UndefOr[js.Any] = js.native
  /**
    * yet unknown docs
    */
  var defaultRender: js.UndefOr[js.Any] = js.native
  /**
    * Style for the description text if applicable (for compound buttons.)
    * Deprecated, use `secondaryText` instead.
    * @deprecated Use `secondaryText` instead.
    */
  var description: js.UndefOr[IStyle] = js.native
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
  ] = js.native
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
  ] = js.native
  /**
    * The props for the icon shown in the button.
    */
  var iconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Optional keytip for this button
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  /**
    * Render a custom menu in place of the normal one.
    */
  var menuAs: js.UndefOr[IComponentAs[IContextualMenuProps]] = js.native
  /**
    * The props for the icon shown when providing a menu dropdown.
    */
  var menuIconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Props for button menu. Providing this will default to showing the menu icon. See menuIconProps for overriding
    * how the default icon looks. Providing this in addition of onClick and setting the split property to true will
    * render a SplitButton.
    */
  var menuProps: js.UndefOr[IContextualMenuProps] = js.native
  /**
    * Provides a custom KeyCode that can be used to open the button menu.
    * The default KeyCode is the down arrow.
    * A value of null can be provided to disable the key codes for opening the button menu.
    */
  var menuTriggerKeyCode: js.UndefOr[KeyCodes | Null] = js.native
  /**
    * Callback that runs after Button's contextualmenu was closed (removed from the DOM)
    */
  var onAfterMenuDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional callback when menu is clicked.
    */
  var onMenuClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], 
      /* button */ js.UndefOr[this.type], 
      Unit
    ]
  ] = js.native
  /**
    * Custom render function for the aria description element.
    */
  var onRenderAriaDescription: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
  /**
    * Custom render function for rendering the button children.
    */
  var onRenderChildren: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
  /**
    * Custom render function for the desciption text.
    */
  var onRenderDescription: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
  /**
    * Custom render function for the icon
    */
  var onRenderIcon: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
  /**
    * Deprecated at v6.3.2, to be removed at \>= v7.0.0. Use `menuAs` instead.
    * @deprecated Use `menuAs` instead.
    */
  var onRenderMenu: js.UndefOr[IRenderFunction[IContextualMenuProps]] = js.native
  /**
    * Custom render function for button menu icon
    */
  var onRenderMenuIcon: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
  /**
    * Custom render function for the label text.
    */
  var onRenderText: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
  /**
    * Menu will not be created or destroyed when opened or closed, instead it
    * will be hidden. This will improve perf of the menu opening but could potentially
    * impact overall perf by having more elements in the dom. Should only be used
    * when perf is important.
    * Note: This may increase the amount of time it takes for the button itself to mount.
    */
  var persistMenu: js.UndefOr[Boolean] = js.native
  /**
    * Changes the visual presentation of the button to be emphasized (if defined)
    * @defaultvalue false
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Optional props to be applied only to the primary action button of SplitButton and not to the
    * overall SplitButton container
    */
  var primaryActionButtonProps: js.UndefOr[IButtonProps] = js.native
  /**
    * If set to true and if this is a splitButton (split == true) then the primary action of a split button is disabled.
    */
  var primaryDisabled: js.UndefOr[Boolean] = js.native
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
    * See: https://github.com/microsoft/fluentui/issues/9034
    * Please do not start using this. If you are already using this,
    * please make sure that you are doing so only in non-Edge browsers
    */
  var renderPersistedMenuHiddenOnMount: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated at v0.56.2, to be removed at \>= v1.0.0. Just pass in button props instead.
    * they will be mixed into the button/anchor element rendered by the component.
    * @deprecated Use button props instead.
    */
  var rootProps: js.UndefOr[
    ButtonHTMLAttributes[HTMLButtonElement] | AnchorHTMLAttributes[HTMLAnchorElement]
  ] = js.native
  /**
    * Description of the action this button takes.
    * Only used for compound buttons
    */
  var secondaryText: js.UndefOr[String] = js.native
  /**
    * If set to true, and if menuProps and onClick are provided, the button will render as a SplitButton.
    * @defaultvalue false
    */
  var split: js.UndefOr[Boolean] = js.native
  /**
    * Accessible label for the dropdown chevron button if this button is split.
    */
  var splitButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * Experimental prop that get passed into the menuButton that's rendered as part of
    * split button. Anything passed in will likely need to have accompanying
    * style changes.
    */
  var splitButtonMenuProps: js.UndefOr[IButtonProps] = js.native
  /**
    * Custom styling for individual elements within the button DOM.
    */
  var styles: js.UndefOr[IButtonStyles] = js.native
  /**
    * Text to render button label. If text is supplied, it will override any string in button children.
    * Other children components will be passed through after the text.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Whether button is a toggle button with distinct on and off states. This should be true for buttons that permanently
    * change state when a press event finishes, such as a volume mute button.
    */
  var toggle: js.UndefOr[Boolean] = js.native
  /**
    * Any custom data the developer wishes to associate with the menu item.
    * Deprecated, use `checked` if setting state.
    * @deprecated unused, use `checked` if setting state.
    */
  var toggled: js.UndefOr[Boolean] = js.native
  /**
    * Unique id to identify the item. Typically a duplicate of key value.
    */
  var uniqueId: js.UndefOr[String | Double] = js.native
}

object IButtonProps {
  @scala.inline
  def apply(): IButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonProps]
  }
  @scala.inline
  implicit class IButtonPropsOps[Self <: IButtonProps] (val x: Self) extends AnyVal {
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
    def setAllowDisabledFocus(value: Boolean): Self = this.set("allowDisabledFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDisabledFocus: Self = this.set("allowDisabledFocus", js.undefined)
    @scala.inline
    def setAriaDescription(value: String): Self = this.set("ariaDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaDescription: Self = this.set("ariaDescription", js.undefined)
    @scala.inline
    def setAriaHidden(value: Boolean): Self = this.set("ariaHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaHidden: Self = this.set("ariaHidden", js.undefined)
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setButtonType(value: ButtonType): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonType: Self = this.set("buttonType", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IButton | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IButton]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDefaultRender(value: js.Any): Self = this.set("defaultRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRender: Self = this.set("defaultRender", js.undefined)
    @scala.inline
    def setDescription(value: IStyle): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setGetClassNames(
      value: (/* theme */ ITheme, /* className */ String, /* variantClassName */ String, /* iconClassName */ js.UndefOr[String], /* menuIconClassName */ js.UndefOr[String], /* disabled */ Boolean, /* checked */ Boolean, /* expanded */ Boolean, /* hasMenu */ Boolean, /* isSplit */ js.UndefOr[Boolean], /* allowDisabledFocus */ Boolean) => IButtonClassNames
    ): Self = this.set("getClassNames", js.Any.fromFunction11(value))
    @scala.inline
    def deleteGetClassNames: Self = this.set("getClassNames", js.undefined)
    @scala.inline
    def setGetSplitButtonClassNames(
      value: (/* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* allowDisabledFocus */ Boolean) => ISplitButtonClassNames
    ): Self = this.set("getSplitButtonClassNames", js.Any.fromFunction4(value))
    @scala.inline
    def deleteGetSplitButtonClassNames: Self = this.set("getSplitButtonClassNames", js.undefined)
    @scala.inline
    def setIconProps(value: IIconProps): Self = this.set("iconProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconProps: Self = this.set("iconProps", js.undefined)
    @scala.inline
    def setKeytipProps(value: IKeytipProps): Self = this.set("keytipProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeytipProps: Self = this.set("keytipProps", js.undefined)
    @scala.inline
    def setMenuAs(value: IComponentAs[IContextualMenuProps]): Self = this.set("menuAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuAs: Self = this.set("menuAs", js.undefined)
    @scala.inline
    def setMenuIconProps(value: IIconProps): Self = this.set("menuIconProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuIconProps: Self = this.set("menuIconProps", js.undefined)
    @scala.inline
    def setMenuProps(value: IContextualMenuProps): Self = this.set("menuProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuProps: Self = this.set("menuProps", js.undefined)
    @scala.inline
    def setMenuTriggerKeyCode(value: KeyCodes): Self = this.set("menuTriggerKeyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuTriggerKeyCode: Self = this.set("menuTriggerKeyCode", js.undefined)
    @scala.inline
    def setMenuTriggerKeyCodeNull: Self = this.set("menuTriggerKeyCode", null)
    @scala.inline
    def setOnAfterMenuDismiss(value: () => Unit): Self = this.set("onAfterMenuDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAfterMenuDismiss: Self = this.set("onAfterMenuDismiss", js.undefined)
    @scala.inline
    def setOnMenuClick(
      value: (/* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], /* button */ js.UndefOr[IButtonProps]) => Unit
    ): Self = this.set("onMenuClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMenuClick: Self = this.set("onMenuClick", js.undefined)
    @scala.inline
    def setOnRenderAriaDescription(
      value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderAriaDescription", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderAriaDescription: Self = this.set("onRenderAriaDescription", js.undefined)
    @scala.inline
    def setOnRenderChildren(
      value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderChildren", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderChildren: Self = this.set("onRenderChildren", js.undefined)
    @scala.inline
    def setOnRenderDescription(
      value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderDescription", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderDescription: Self = this.set("onRenderDescription", js.undefined)
    @scala.inline
    def setOnRenderIcon(
      value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderIcon", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderIcon: Self = this.set("onRenderIcon", js.undefined)
    @scala.inline
    def setOnRenderMenu(
      value: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderMenu", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderMenu: Self = this.set("onRenderMenu", js.undefined)
    @scala.inline
    def setOnRenderMenuIcon(
      value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderMenuIcon", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderMenuIcon: Self = this.set("onRenderMenuIcon", js.undefined)
    @scala.inline
    def setOnRenderText(
      value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderText", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderText: Self = this.set("onRenderText", js.undefined)
    @scala.inline
    def setPersistMenu(value: Boolean): Self = this.set("persistMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistMenu: Self = this.set("persistMenu", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setPrimaryActionButtonProps(value: IButtonProps): Self = this.set("primaryActionButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryActionButtonProps: Self = this.set("primaryActionButtonProps", js.undefined)
    @scala.inline
    def setPrimaryDisabled(value: Boolean): Self = this.set("primaryDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryDisabled: Self = this.set("primaryDisabled", js.undefined)
    @scala.inline
    def setRenderPersistedMenuHiddenOnMount(value: Boolean): Self = this.set("renderPersistedMenuHiddenOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderPersistedMenuHiddenOnMount: Self = this.set("renderPersistedMenuHiddenOnMount", js.undefined)
    @scala.inline
    def setRootProps(value: ButtonHTMLAttributes[HTMLButtonElement] | AnchorHTMLAttributes[HTMLAnchorElement]): Self = this.set("rootProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootProps: Self = this.set("rootProps", js.undefined)
    @scala.inline
    def setSecondaryText(value: String): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryText: Self = this.set("secondaryText", js.undefined)
    @scala.inline
    def setSplit(value: Boolean): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
    @scala.inline
    def setSplitButtonAriaLabel(value: String): Self = this.set("splitButtonAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonAriaLabel: Self = this.set("splitButtonAriaLabel", js.undefined)
    @scala.inline
    def setSplitButtonMenuProps(value: IButtonProps): Self = this.set("splitButtonMenuProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitButtonMenuProps: Self = this.set("splitButtonMenuProps", js.undefined)
    @scala.inline
    def setStyles(value: IButtonStyles): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setToggle(value: Boolean): Self = this.set("toggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    @scala.inline
    def setToggled(value: Boolean): Self = this.set("toggled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggled: Self = this.set("toggled", js.undefined)
    @scala.inline
    def setUniqueId(value: String | Double): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueId: Self = this.set("uniqueId", js.undefined)
  }
  
}

