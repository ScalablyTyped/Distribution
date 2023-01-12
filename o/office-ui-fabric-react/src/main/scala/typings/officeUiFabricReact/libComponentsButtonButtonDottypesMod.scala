package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsButtonBaseButtonDotclassNamesMod.IButtonClassNames
import typings.officeUiFabricReact.libComponentsButtonBaseButtonMod.BaseButton
import typings.officeUiFabricReact.libComponentsButtonButtonMod.Button
import typings.officeUiFabricReact.libComponentsButtonSplitButtonSplitButtonDotclassNamesMod.ISplitButtonClassNames
import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuProps
import typings.officeUiFabricReact.libComponentsIconIconDottypesMod.IIconProps
import typings.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipProps
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import typings.uifabricUtilities.libIcomponentasMod.IComponentAs
import typings.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import typings.uifabricUtilities.libKeyCodesMod.KeyCodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsButtonButtonDottypesMod {
  
  @js.native
  sealed trait ButtonType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Button/Button.types", "ButtonType")
  @js.native
  object ButtonType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ButtonType & Double] = js.native
    
    @js.native
    sealed trait default
      extends StObject
         with ButtonType
    /* 6 */ val default: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.default & Double = js.native
    
    @js.native
    sealed trait command
      extends StObject
         with ButtonType
    /* 4 */ val command: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.command & Double = js.native
    
    @js.native
    sealed trait compound
      extends StObject
         with ButtonType
    /* 3 */ val compound: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.compound & Double = js.native
    
    @js.native
    sealed trait hero
      extends StObject
         with ButtonType
    /* 2 */ val hero: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.hero & Double = js.native
    
    @js.native
    sealed trait icon
      extends StObject
         with ButtonType
    /* 5 */ val icon: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.icon & Double = js.native
    
    @js.native
    sealed trait normal
      extends StObject
         with ButtonType
    /* 0 */ val normal: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.normal & Double = js.native
    
    @js.native
    sealed trait primary
      extends StObject
         with ButtonType
    /* 1 */ val primary: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.primary & Double = js.native
  }
  
  @js.native
  sealed trait ElementType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Button/Button.types", "ElementType")
  @js.native
  object ElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ElementType & Double] = js.native
    
    /** <a> element. */
    @js.native
    sealed trait anchor
      extends StObject
         with ElementType
    /* 1 */ val anchor: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ElementType.anchor & Double = js.native
    
    /** <button> element. */
    @js.native
    sealed trait button
      extends StObject
         with ElementType
    /* 0 */ val button: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ElementType.button & Double = js.native
  }
  
  @js.native
  trait IButton extends StObject {
    
    /**
      * If there is a menu associated with this button and it is visible, this will dismiss the menu
      */
    def dismissMenu(): Unit = js.native
    
    /**
      * Sets focus to the button.
      */
    def focus(): Unit = js.native
    
    /**
      * If there is a menu associated with this button and it is visible, this will open the menu.
      * Params are optional overrides to the ones defined in `menuProps` to apply to just this instance of
      * opening the menu.
      *
      * @param shouldFocusOnContainer - override to the ContextualMenu shouldFocusOnContainer prop.
      * BaseButton implementation defaults to 'undefined'.
      * @param shouldFocusOnMount - override to the ContextualMenu shouldFocusOnMount prop. BaseButton implementation
      * defaults to `true`.
      */
    def openMenu(): Unit = js.native
    def openMenu(shouldFocusOnContainer: Boolean): Unit = js.native
    def openMenu(shouldFocusOnContainer: Boolean, shouldFocusOnMount: Boolean): Unit = js.native
    def openMenu(shouldFocusOnContainer: Unit, shouldFocusOnMount: Boolean): Unit = js.native
  }
  
  trait IButtonProps
    extends StObject
       with AllHTMLAttributes[
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
    var data_IButtonProps: js.UndefOr[Any] = js.undefined
    
    /**
      * yet unknown docs
      */
    var defaultRender: js.UndefOr[Any] = js.undefined
    
    /**
      * Style for the description text if applicable (for compound buttons.)
      * Deprecated, use `secondaryText` instead.
      * @deprecated Use `secondaryText` instead.
      */
    var description: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Optional callback to access the root DOM element.
      * @deprecated Temporary solution which will be replaced with ref in the V8 release.
      */
    var elementRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
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
      * Callback that runs after Button's contextual menu was closed (removed from the DOM)
      */
    var onAfterMenuDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Optional callback when menu is clicked.
      */
    var onMenuClick: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], 
          /* button */ js.UndefOr[this.type], 
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
      * See: https://github.com/microsoft/fluentui/issues/9034
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
    
    inline def apply(): IButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IButtonProps] (val x: Self) extends AnyVal {
      
      inline def setAllowDisabledFocus(value: Boolean): Self = StObject.set(x, "allowDisabledFocus", value.asInstanceOf[js.Any])
      
      inline def setAllowDisabledFocusUndefined: Self = StObject.set(x, "allowDisabledFocus", js.undefined)
      
      inline def setAriaDescription(value: String): Self = StObject.set(x, "ariaDescription", value.asInstanceOf[js.Any])
      
      inline def setAriaDescriptionUndefined: Self = StObject.set(x, "ariaDescription", js.undefined)
      
      inline def setAriaHidden(value: Boolean): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
      
      inline def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setButtonType(value: ButtonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IButton]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IButton | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDefaultRender(value: Any): Self = StObject.set(x, "defaultRender", value.asInstanceOf[js.Any])
      
      inline def setDefaultRenderUndefined: Self = StObject.set(x, "defaultRender", js.undefined)
      
      inline def setDescription(value: IStyle): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setElementRef(value: Ref[HTMLElement]): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
      
      inline def setElementRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "elementRef", js.Any.fromFunction1(value))
      
      inline def setElementRefNull: Self = StObject.set(x, "elementRef", null)
      
      inline def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
      
      inline def setGetClassNames(
        value: (/* theme */ ITheme, /* className */ String, /* variantClassName */ String, /* iconClassName */ js.UndefOr[String], /* menuIconClassName */ js.UndefOr[String], /* disabled */ Boolean, /* checked */ Boolean, /* expanded */ Boolean, /* hasMenu */ Boolean, /* isSplit */ js.UndefOr[Boolean], /* allowDisabledFocus */ Boolean) => IButtonClassNames
      ): Self = StObject.set(x, "getClassNames", js.Any.fromFunction11(value))
      
      inline def setGetClassNamesUndefined: Self = StObject.set(x, "getClassNames", js.undefined)
      
      inline def setGetSplitButtonClassNames(
        value: (/* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* allowDisabledFocus */ Boolean) => ISplitButtonClassNames
      ): Self = StObject.set(x, "getSplitButtonClassNames", js.Any.fromFunction4(value))
      
      inline def setGetSplitButtonClassNamesUndefined: Self = StObject.set(x, "getSplitButtonClassNames", js.undefined)
      
      inline def setIconProps(value: IIconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      inline def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      inline def setKeytipProps(value: IKeytipProps): Self = StObject.set(x, "keytipProps", value.asInstanceOf[js.Any])
      
      inline def setKeytipPropsUndefined: Self = StObject.set(x, "keytipProps", js.undefined)
      
      inline def setMenuAs(value: IComponentAs[IContextualMenuProps]): Self = StObject.set(x, "menuAs", value.asInstanceOf[js.Any])
      
      inline def setMenuAsUndefined: Self = StObject.set(x, "menuAs", js.undefined)
      
      inline def setMenuIconProps(value: IIconProps): Self = StObject.set(x, "menuIconProps", value.asInstanceOf[js.Any])
      
      inline def setMenuIconPropsUndefined: Self = StObject.set(x, "menuIconProps", js.undefined)
      
      inline def setMenuProps(value: IContextualMenuProps): Self = StObject.set(x, "menuProps", value.asInstanceOf[js.Any])
      
      inline def setMenuPropsUndefined: Self = StObject.set(x, "menuProps", js.undefined)
      
      inline def setMenuTriggerKeyCode(value: KeyCodes): Self = StObject.set(x, "menuTriggerKeyCode", value.asInstanceOf[js.Any])
      
      inline def setMenuTriggerKeyCodeNull: Self = StObject.set(x, "menuTriggerKeyCode", null)
      
      inline def setMenuTriggerKeyCodeUndefined: Self = StObject.set(x, "menuTriggerKeyCode", js.undefined)
      
      inline def setOnAfterMenuDismiss(value: () => Unit): Self = StObject.set(x, "onAfterMenuDismiss", js.Any.fromFunction0(value))
      
      inline def setOnAfterMenuDismissUndefined: Self = StObject.set(x, "onAfterMenuDismiss", js.undefined)
      
      inline def setOnMenuClick(
        value: (/* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], /* button */ js.UndefOr[IButtonProps]) => Unit
      ): Self = StObject.set(x, "onMenuClick", js.Any.fromFunction2(value))
      
      inline def setOnMenuClickUndefined: Self = StObject.set(x, "onMenuClick", js.undefined)
      
      inline def setOnRenderAriaDescription(
        value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderAriaDescription", js.Any.fromFunction2(value))
      
      inline def setOnRenderAriaDescriptionUndefined: Self = StObject.set(x, "onRenderAriaDescription", js.undefined)
      
      inline def setOnRenderChildren(
        value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderChildren", js.Any.fromFunction2(value))
      
      inline def setOnRenderChildrenUndefined: Self = StObject.set(x, "onRenderChildren", js.undefined)
      
      inline def setOnRenderDescription(
        value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderDescription", js.Any.fromFunction2(value))
      
      inline def setOnRenderDescriptionUndefined: Self = StObject.set(x, "onRenderDescription", js.undefined)
      
      inline def setOnRenderIcon(
        value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderIcon", js.Any.fromFunction2(value))
      
      inline def setOnRenderIconUndefined: Self = StObject.set(x, "onRenderIcon", js.undefined)
      
      inline def setOnRenderMenu(
        value: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderMenu", js.Any.fromFunction2(value))
      
      inline def setOnRenderMenuIcon(
        value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderMenuIcon", js.Any.fromFunction2(value))
      
      inline def setOnRenderMenuIconUndefined: Self = StObject.set(x, "onRenderMenuIcon", js.undefined)
      
      inline def setOnRenderMenuUndefined: Self = StObject.set(x, "onRenderMenu", js.undefined)
      
      inline def setOnRenderText(
        value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderText", js.Any.fromFunction2(value))
      
      inline def setOnRenderTextUndefined: Self = StObject.set(x, "onRenderText", js.undefined)
      
      inline def setPersistMenu(value: Boolean): Self = StObject.set(x, "persistMenu", value.asInstanceOf[js.Any])
      
      inline def setPersistMenuUndefined: Self = StObject.set(x, "persistMenu", js.undefined)
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryActionButtonProps(value: IButtonProps): Self = StObject.set(x, "primaryActionButtonProps", value.asInstanceOf[js.Any])
      
      inline def setPrimaryActionButtonPropsUndefined: Self = StObject.set(x, "primaryActionButtonProps", js.undefined)
      
      inline def setPrimaryDisabled(value: Boolean): Self = StObject.set(x, "primaryDisabled", value.asInstanceOf[js.Any])
      
      inline def setPrimaryDisabledUndefined: Self = StObject.set(x, "primaryDisabled", js.undefined)
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setRenderPersistedMenuHiddenOnMount(value: Boolean): Self = StObject.set(x, "renderPersistedMenuHiddenOnMount", value.asInstanceOf[js.Any])
      
      inline def setRenderPersistedMenuHiddenOnMountUndefined: Self = StObject.set(x, "renderPersistedMenuHiddenOnMount", js.undefined)
      
      inline def setRootProps(value: ButtonHTMLAttributes[HTMLButtonElement] | AnchorHTMLAttributes[HTMLAnchorElement]): Self = StObject.set(x, "rootProps", value.asInstanceOf[js.Any])
      
      inline def setRootPropsUndefined: Self = StObject.set(x, "rootProps", js.undefined)
      
      inline def setSecondaryText(value: String): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      inline def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonAriaLabel(value: String): Self = StObject.set(x, "splitButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonAriaLabelUndefined: Self = StObject.set(x, "splitButtonAriaLabel", js.undefined)
      
      inline def setSplitButtonMenuProps(value: IButtonProps): Self = StObject.set(x, "splitButtonMenuProps", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonMenuPropsUndefined: Self = StObject.set(x, "splitButtonMenuProps", js.undefined)
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      inline def setStyles(value: IButtonStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setToggled(value: Boolean): Self = StObject.set(x, "toggled", value.asInstanceOf[js.Any])
      
      inline def setToggledUndefined: Self = StObject.set(x, "toggled", js.undefined)
      
      inline def setUniqueId(value: String | Double): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
      
      inline def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
    }
  }
  
  trait IButtonStyles extends StObject {
    
    /**
      * Style for the description text if applicable (for compound buttons.)
      */
    var description: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the description text when the button is checked.
      */
    var descriptionChecked: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the description text when the button is disabled.
      */
    var descriptionDisabled: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the description text when the button is hovered.
      */
    var descriptionHovered: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the description text when the button is pressed.
      */
    var descriptionPressed: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the flexbox container within the root element.
      */
    var flexContainer: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the icon on the near side of the label.
      */
    var icon: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the icon when the button is checked.
      */
    var iconChecked: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the icon when the button is disabled.
      */
    var iconDisabled: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the icon on the near side of the label when expanded.
      */
    var iconExpanded: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the icon on the near side of the label when expanded and hovered.
      */
    var iconExpandedHovered: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the icon on the near side of the label on hover.
      */
    var iconHovered: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the icon on the near side of the label when pressed.
      */
    var iconPressed: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the text content of the button.
      */
    var label: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the text content when the button is checked.
      */
    var labelChecked: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the text content when the button is disabled.
      */
    var labelDisabled: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the text content when the button is hovered.
      */
    var labelHovered: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the menu chevron.
      */
    var menuIcon: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the menu chevron when the button is checked.
      */
    var menuIconChecked: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the menu chevron when the button is disabled.
      */
    var menuIconDisabled: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the menu chevron when expanded.
      */
    var menuIconExpanded: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the menu chevron when expanded and hovered.
      */
    var menuIconExpandedHovered: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the menu chevron on hover.
      */
    var menuIconHovered: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the menu chevron when pressed.
      */
    var menuIconPressed: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the root element in the default enabled, non-toggled state.
      */
    var root: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the root element in a checked state, layered on top of the root style.
      */
    var rootChecked: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override applied to the root on hover in a checked, disabled state
      */
    var rootCheckedDisabled: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override applied to the root on hover in a checked, enabled state
      */
    var rootCheckedHovered: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override applied to the root on pressed in a checked, enabled state
      */
    var rootCheckedPressed: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the root element in a disabled state, layered on top of the root style.
      */
    var rootDisabled: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override applied to the root on when menu is expanded in the default, enabled, non-toggled state.
      */
    var rootExpanded: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override applied to the root on hover in a expanded state on hover
      */
    var rootExpandedHovered: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override applied to the root on focus in the default, enabled, non-toggled state.
      */
    var rootFocused: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the root element when it has a menu button, layered on top of the root style.
      */
    var rootHasMenu: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override applied to the root on hover in the default, enabled, non-toggled state.
      */
    var rootHovered: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override applied to the root on pressed in the default, enabled, non-toggled state.
      */
    var rootPressed: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the screen reader text.
      */
    var screenReaderText: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the description text if applicable (for compound buttons.)
      */
    var secondaryText: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the container div around a SplitButton element
      */
    var splitButtonContainer: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for container div around a SplitButton element when the button is checked.
      */
    var splitButtonContainerChecked: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for container div around a SplitButton element when the button is checked and hovered.
      */
    var splitButtonContainerCheckedHovered: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the container div around a SplitButton element in a disabled state
      */
    var splitButtonContainerDisabled: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for container div around a SplitButton element when the button is focused.
      */
    var splitButtonContainerFocused: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for container div around a SplitButton element when the button is hovered.
      */
    var splitButtonContainerHovered: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the divider element that appears between the button and menu button
      * for a split button.
      */
    var splitButtonDivider: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the divider element that appears between the button and menu button
      * for a split button in a disabled state.
      */
    var splitButtonDividerDisabled: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the SplitButton FlexContainer.
      */
    var splitButtonFlexContainer: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the SplitButton menu button
      */
    var splitButtonMenuButton: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the SplitButton menu button element in a checked state
      */
    var splitButtonMenuButtonChecked: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the SplitButton menu button element in a disabled state.
      */
    var splitButtonMenuButtonDisabled: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the SplitButton menu button element in an expanded state
      */
    var splitButtonMenuButtonExpanded: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the SplitButton when only primaryButton is in a disabled state
      */
    var splitButtonMenuFocused: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the SplitButton menu icon element
      */
    var splitButtonMenuIcon: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style override for the SplitButton menu icon element in a disabled state
      */
    var splitButtonMenuIconDisabled: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the text container within the flexbox container element (and contains the text and description).
      */
    var textContainer: js.UndefOr[IStyle] = js.undefined
  }
  object IButtonStyles {
    
    inline def apply(): IButtonStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IButtonStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IButtonStyles] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: IStyle): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionChecked(value: IStyle): Self = StObject.set(x, "descriptionChecked", value.asInstanceOf[js.Any])
      
      inline def setDescriptionCheckedNull: Self = StObject.set(x, "descriptionChecked", null)
      
      inline def setDescriptionCheckedUndefined: Self = StObject.set(x, "descriptionChecked", js.undefined)
      
      inline def setDescriptionDisabled(value: IStyle): Self = StObject.set(x, "descriptionDisabled", value.asInstanceOf[js.Any])
      
      inline def setDescriptionDisabledNull: Self = StObject.set(x, "descriptionDisabled", null)
      
      inline def setDescriptionDisabledUndefined: Self = StObject.set(x, "descriptionDisabled", js.undefined)
      
      inline def setDescriptionHovered(value: IStyle): Self = StObject.set(x, "descriptionHovered", value.asInstanceOf[js.Any])
      
      inline def setDescriptionHoveredNull: Self = StObject.set(x, "descriptionHovered", null)
      
      inline def setDescriptionHoveredUndefined: Self = StObject.set(x, "descriptionHovered", js.undefined)
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionPressed(value: IStyle): Self = StObject.set(x, "descriptionPressed", value.asInstanceOf[js.Any])
      
      inline def setDescriptionPressedNull: Self = StObject.set(x, "descriptionPressed", null)
      
      inline def setDescriptionPressedUndefined: Self = StObject.set(x, "descriptionPressed", js.undefined)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFlexContainer(value: IStyle): Self = StObject.set(x, "flexContainer", value.asInstanceOf[js.Any])
      
      inline def setFlexContainerNull: Self = StObject.set(x, "flexContainer", null)
      
      inline def setFlexContainerUndefined: Self = StObject.set(x, "flexContainer", js.undefined)
      
      inline def setIcon(value: IStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconChecked(value: IStyle): Self = StObject.set(x, "iconChecked", value.asInstanceOf[js.Any])
      
      inline def setIconCheckedNull: Self = StObject.set(x, "iconChecked", null)
      
      inline def setIconCheckedUndefined: Self = StObject.set(x, "iconChecked", js.undefined)
      
      inline def setIconDisabled(value: IStyle): Self = StObject.set(x, "iconDisabled", value.asInstanceOf[js.Any])
      
      inline def setIconDisabledNull: Self = StObject.set(x, "iconDisabled", null)
      
      inline def setIconDisabledUndefined: Self = StObject.set(x, "iconDisabled", js.undefined)
      
      inline def setIconExpanded(value: IStyle): Self = StObject.set(x, "iconExpanded", value.asInstanceOf[js.Any])
      
      inline def setIconExpandedHovered(value: IStyle): Self = StObject.set(x, "iconExpandedHovered", value.asInstanceOf[js.Any])
      
      inline def setIconExpandedHoveredNull: Self = StObject.set(x, "iconExpandedHovered", null)
      
      inline def setIconExpandedHoveredUndefined: Self = StObject.set(x, "iconExpandedHovered", js.undefined)
      
      inline def setIconExpandedNull: Self = StObject.set(x, "iconExpanded", null)
      
      inline def setIconExpandedUndefined: Self = StObject.set(x, "iconExpanded", js.undefined)
      
      inline def setIconHovered(value: IStyle): Self = StObject.set(x, "iconHovered", value.asInstanceOf[js.Any])
      
      inline def setIconHoveredNull: Self = StObject.set(x, "iconHovered", null)
      
      inline def setIconHoveredUndefined: Self = StObject.set(x, "iconHovered", js.undefined)
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconPressed(value: IStyle): Self = StObject.set(x, "iconPressed", value.asInstanceOf[js.Any])
      
      inline def setIconPressedNull: Self = StObject.set(x, "iconPressed", null)
      
      inline def setIconPressedUndefined: Self = StObject.set(x, "iconPressed", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: IStyle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelChecked(value: IStyle): Self = StObject.set(x, "labelChecked", value.asInstanceOf[js.Any])
      
      inline def setLabelCheckedNull: Self = StObject.set(x, "labelChecked", null)
      
      inline def setLabelCheckedUndefined: Self = StObject.set(x, "labelChecked", js.undefined)
      
      inline def setLabelDisabled(value: IStyle): Self = StObject.set(x, "labelDisabled", value.asInstanceOf[js.Any])
      
      inline def setLabelDisabledNull: Self = StObject.set(x, "labelDisabled", null)
      
      inline def setLabelDisabledUndefined: Self = StObject.set(x, "labelDisabled", js.undefined)
      
      inline def setLabelHovered(value: IStyle): Self = StObject.set(x, "labelHovered", value.asInstanceOf[js.Any])
      
      inline def setLabelHoveredNull: Self = StObject.set(x, "labelHovered", null)
      
      inline def setLabelHoveredUndefined: Self = StObject.set(x, "labelHovered", js.undefined)
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMenuIcon(value: IStyle): Self = StObject.set(x, "menuIcon", value.asInstanceOf[js.Any])
      
      inline def setMenuIconChecked(value: IStyle): Self = StObject.set(x, "menuIconChecked", value.asInstanceOf[js.Any])
      
      inline def setMenuIconCheckedNull: Self = StObject.set(x, "menuIconChecked", null)
      
      inline def setMenuIconCheckedUndefined: Self = StObject.set(x, "menuIconChecked", js.undefined)
      
      inline def setMenuIconDisabled(value: IStyle): Self = StObject.set(x, "menuIconDisabled", value.asInstanceOf[js.Any])
      
      inline def setMenuIconDisabledNull: Self = StObject.set(x, "menuIconDisabled", null)
      
      inline def setMenuIconDisabledUndefined: Self = StObject.set(x, "menuIconDisabled", js.undefined)
      
      inline def setMenuIconExpanded(value: IStyle): Self = StObject.set(x, "menuIconExpanded", value.asInstanceOf[js.Any])
      
      inline def setMenuIconExpandedHovered(value: IStyle): Self = StObject.set(x, "menuIconExpandedHovered", value.asInstanceOf[js.Any])
      
      inline def setMenuIconExpandedHoveredNull: Self = StObject.set(x, "menuIconExpandedHovered", null)
      
      inline def setMenuIconExpandedHoveredUndefined: Self = StObject.set(x, "menuIconExpandedHovered", js.undefined)
      
      inline def setMenuIconExpandedNull: Self = StObject.set(x, "menuIconExpanded", null)
      
      inline def setMenuIconExpandedUndefined: Self = StObject.set(x, "menuIconExpanded", js.undefined)
      
      inline def setMenuIconHovered(value: IStyle): Self = StObject.set(x, "menuIconHovered", value.asInstanceOf[js.Any])
      
      inline def setMenuIconHoveredNull: Self = StObject.set(x, "menuIconHovered", null)
      
      inline def setMenuIconHoveredUndefined: Self = StObject.set(x, "menuIconHovered", js.undefined)
      
      inline def setMenuIconNull: Self = StObject.set(x, "menuIcon", null)
      
      inline def setMenuIconPressed(value: IStyle): Self = StObject.set(x, "menuIconPressed", value.asInstanceOf[js.Any])
      
      inline def setMenuIconPressedNull: Self = StObject.set(x, "menuIconPressed", null)
      
      inline def setMenuIconPressedUndefined: Self = StObject.set(x, "menuIconPressed", js.undefined)
      
      inline def setMenuIconUndefined: Self = StObject.set(x, "menuIcon", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootChecked(value: IStyle): Self = StObject.set(x, "rootChecked", value.asInstanceOf[js.Any])
      
      inline def setRootCheckedDisabled(value: IStyle): Self = StObject.set(x, "rootCheckedDisabled", value.asInstanceOf[js.Any])
      
      inline def setRootCheckedDisabledNull: Self = StObject.set(x, "rootCheckedDisabled", null)
      
      inline def setRootCheckedDisabledUndefined: Self = StObject.set(x, "rootCheckedDisabled", js.undefined)
      
      inline def setRootCheckedHovered(value: IStyle): Self = StObject.set(x, "rootCheckedHovered", value.asInstanceOf[js.Any])
      
      inline def setRootCheckedHoveredNull: Self = StObject.set(x, "rootCheckedHovered", null)
      
      inline def setRootCheckedHoveredUndefined: Self = StObject.set(x, "rootCheckedHovered", js.undefined)
      
      inline def setRootCheckedNull: Self = StObject.set(x, "rootChecked", null)
      
      inline def setRootCheckedPressed(value: IStyle): Self = StObject.set(x, "rootCheckedPressed", value.asInstanceOf[js.Any])
      
      inline def setRootCheckedPressedNull: Self = StObject.set(x, "rootCheckedPressed", null)
      
      inline def setRootCheckedPressedUndefined: Self = StObject.set(x, "rootCheckedPressed", js.undefined)
      
      inline def setRootCheckedUndefined: Self = StObject.set(x, "rootChecked", js.undefined)
      
      inline def setRootDisabled(value: IStyle): Self = StObject.set(x, "rootDisabled", value.asInstanceOf[js.Any])
      
      inline def setRootDisabledNull: Self = StObject.set(x, "rootDisabled", null)
      
      inline def setRootDisabledUndefined: Self = StObject.set(x, "rootDisabled", js.undefined)
      
      inline def setRootExpanded(value: IStyle): Self = StObject.set(x, "rootExpanded", value.asInstanceOf[js.Any])
      
      inline def setRootExpandedHovered(value: IStyle): Self = StObject.set(x, "rootExpandedHovered", value.asInstanceOf[js.Any])
      
      inline def setRootExpandedHoveredNull: Self = StObject.set(x, "rootExpandedHovered", null)
      
      inline def setRootExpandedHoveredUndefined: Self = StObject.set(x, "rootExpandedHovered", js.undefined)
      
      inline def setRootExpandedNull: Self = StObject.set(x, "rootExpanded", null)
      
      inline def setRootExpandedUndefined: Self = StObject.set(x, "rootExpanded", js.undefined)
      
      inline def setRootFocused(value: IStyle): Self = StObject.set(x, "rootFocused", value.asInstanceOf[js.Any])
      
      inline def setRootFocusedNull: Self = StObject.set(x, "rootFocused", null)
      
      inline def setRootFocusedUndefined: Self = StObject.set(x, "rootFocused", js.undefined)
      
      inline def setRootHasMenu(value: IStyle): Self = StObject.set(x, "rootHasMenu", value.asInstanceOf[js.Any])
      
      inline def setRootHasMenuNull: Self = StObject.set(x, "rootHasMenu", null)
      
      inline def setRootHasMenuUndefined: Self = StObject.set(x, "rootHasMenu", js.undefined)
      
      inline def setRootHovered(value: IStyle): Self = StObject.set(x, "rootHovered", value.asInstanceOf[js.Any])
      
      inline def setRootHoveredNull: Self = StObject.set(x, "rootHovered", null)
      
      inline def setRootHoveredUndefined: Self = StObject.set(x, "rootHovered", js.undefined)
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootPressed(value: IStyle): Self = StObject.set(x, "rootPressed", value.asInstanceOf[js.Any])
      
      inline def setRootPressedNull: Self = StObject.set(x, "rootPressed", null)
      
      inline def setRootPressedUndefined: Self = StObject.set(x, "rootPressed", js.undefined)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setScreenReaderText(value: IStyle): Self = StObject.set(x, "screenReaderText", value.asInstanceOf[js.Any])
      
      inline def setScreenReaderTextNull: Self = StObject.set(x, "screenReaderText", null)
      
      inline def setScreenReaderTextUndefined: Self = StObject.set(x, "screenReaderText", js.undefined)
      
      inline def setSecondaryText(value: IStyle): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextNull: Self = StObject.set(x, "secondaryText", null)
      
      inline def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      inline def setSplitButtonContainer(value: IStyle): Self = StObject.set(x, "splitButtonContainer", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonContainerChecked(value: IStyle): Self = StObject.set(x, "splitButtonContainerChecked", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonContainerCheckedHovered(value: IStyle): Self = StObject.set(x, "splitButtonContainerCheckedHovered", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonContainerCheckedHoveredNull: Self = StObject.set(x, "splitButtonContainerCheckedHovered", null)
      
      inline def setSplitButtonContainerCheckedHoveredUndefined: Self = StObject.set(x, "splitButtonContainerCheckedHovered", js.undefined)
      
      inline def setSplitButtonContainerCheckedNull: Self = StObject.set(x, "splitButtonContainerChecked", null)
      
      inline def setSplitButtonContainerCheckedUndefined: Self = StObject.set(x, "splitButtonContainerChecked", js.undefined)
      
      inline def setSplitButtonContainerDisabled(value: IStyle): Self = StObject.set(x, "splitButtonContainerDisabled", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonContainerDisabledNull: Self = StObject.set(x, "splitButtonContainerDisabled", null)
      
      inline def setSplitButtonContainerDisabledUndefined: Self = StObject.set(x, "splitButtonContainerDisabled", js.undefined)
      
      inline def setSplitButtonContainerFocused(value: IStyle): Self = StObject.set(x, "splitButtonContainerFocused", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonContainerFocusedNull: Self = StObject.set(x, "splitButtonContainerFocused", null)
      
      inline def setSplitButtonContainerFocusedUndefined: Self = StObject.set(x, "splitButtonContainerFocused", js.undefined)
      
      inline def setSplitButtonContainerHovered(value: IStyle): Self = StObject.set(x, "splitButtonContainerHovered", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonContainerHoveredNull: Self = StObject.set(x, "splitButtonContainerHovered", null)
      
      inline def setSplitButtonContainerHoveredUndefined: Self = StObject.set(x, "splitButtonContainerHovered", js.undefined)
      
      inline def setSplitButtonContainerNull: Self = StObject.set(x, "splitButtonContainer", null)
      
      inline def setSplitButtonContainerUndefined: Self = StObject.set(x, "splitButtonContainer", js.undefined)
      
      inline def setSplitButtonDivider(value: IStyle): Self = StObject.set(x, "splitButtonDivider", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonDividerDisabled(value: IStyle): Self = StObject.set(x, "splitButtonDividerDisabled", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonDividerDisabledNull: Self = StObject.set(x, "splitButtonDividerDisabled", null)
      
      inline def setSplitButtonDividerDisabledUndefined: Self = StObject.set(x, "splitButtonDividerDisabled", js.undefined)
      
      inline def setSplitButtonDividerNull: Self = StObject.set(x, "splitButtonDivider", null)
      
      inline def setSplitButtonDividerUndefined: Self = StObject.set(x, "splitButtonDivider", js.undefined)
      
      inline def setSplitButtonFlexContainer(value: IStyle): Self = StObject.set(x, "splitButtonFlexContainer", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonFlexContainerNull: Self = StObject.set(x, "splitButtonFlexContainer", null)
      
      inline def setSplitButtonFlexContainerUndefined: Self = StObject.set(x, "splitButtonFlexContainer", js.undefined)
      
      inline def setSplitButtonMenuButton(value: IStyle): Self = StObject.set(x, "splitButtonMenuButton", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonMenuButtonChecked(value: IStyle): Self = StObject.set(x, "splitButtonMenuButtonChecked", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonMenuButtonCheckedNull: Self = StObject.set(x, "splitButtonMenuButtonChecked", null)
      
      inline def setSplitButtonMenuButtonCheckedUndefined: Self = StObject.set(x, "splitButtonMenuButtonChecked", js.undefined)
      
      inline def setSplitButtonMenuButtonDisabled(value: IStyle): Self = StObject.set(x, "splitButtonMenuButtonDisabled", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonMenuButtonDisabledNull: Self = StObject.set(x, "splitButtonMenuButtonDisabled", null)
      
      inline def setSplitButtonMenuButtonDisabledUndefined: Self = StObject.set(x, "splitButtonMenuButtonDisabled", js.undefined)
      
      inline def setSplitButtonMenuButtonExpanded(value: IStyle): Self = StObject.set(x, "splitButtonMenuButtonExpanded", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonMenuButtonExpandedNull: Self = StObject.set(x, "splitButtonMenuButtonExpanded", null)
      
      inline def setSplitButtonMenuButtonExpandedUndefined: Self = StObject.set(x, "splitButtonMenuButtonExpanded", js.undefined)
      
      inline def setSplitButtonMenuButtonNull: Self = StObject.set(x, "splitButtonMenuButton", null)
      
      inline def setSplitButtonMenuButtonUndefined: Self = StObject.set(x, "splitButtonMenuButton", js.undefined)
      
      inline def setSplitButtonMenuFocused(value: IStyle): Self = StObject.set(x, "splitButtonMenuFocused", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonMenuFocusedNull: Self = StObject.set(x, "splitButtonMenuFocused", null)
      
      inline def setSplitButtonMenuFocusedUndefined: Self = StObject.set(x, "splitButtonMenuFocused", js.undefined)
      
      inline def setSplitButtonMenuIcon(value: IStyle): Self = StObject.set(x, "splitButtonMenuIcon", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonMenuIconDisabled(value: IStyle): Self = StObject.set(x, "splitButtonMenuIconDisabled", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonMenuIconDisabledNull: Self = StObject.set(x, "splitButtonMenuIconDisabled", null)
      
      inline def setSplitButtonMenuIconDisabledUndefined: Self = StObject.set(x, "splitButtonMenuIconDisabled", js.undefined)
      
      inline def setSplitButtonMenuIconNull: Self = StObject.set(x, "splitButtonMenuIcon", null)
      
      inline def setSplitButtonMenuIconUndefined: Self = StObject.set(x, "splitButtonMenuIcon", js.undefined)
      
      inline def setTextContainer(value: IStyle): Self = StObject.set(x, "textContainer", value.asInstanceOf[js.Any])
      
      inline def setTextContainerNull: Self = StObject.set(x, "textContainer", null)
      
      inline def setTextContainerUndefined: Self = StObject.set(x, "textContainer", js.undefined)
    }
  }
}
