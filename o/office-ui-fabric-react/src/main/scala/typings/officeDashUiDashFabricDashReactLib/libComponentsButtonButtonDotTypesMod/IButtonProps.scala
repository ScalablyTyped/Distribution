package typings
package officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IButtonProps
  extends reactLib.reactMod.ReactNs.AllHTMLAttributes[
      reactLib.HTMLAnchorElement | reactLib.HTMLButtonElement | reactLib.HTMLDivElement | officeDashUiDashFabricDashReactLib.libComponentsButtonBaseButtonMod.BaseButton | officeDashUiDashFabricDashReactLib.libComponentsButtonButtonMod.Button
    ] {
  /**
       * Whether the button can have focus in disabled mode
       */
  var allowDisabledFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Detailed description of the button for the benefit of screen readers.
       *
       * Besides the compound button, other button types will need more information provided to screen reader.
       */
  var ariaDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If provided and is true it adds an 'aria-hidden' attribute instructing screen readers to ignore the element.
       */
  var ariaHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The aria label of the button for the benefit of screen readers.
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Deprecated at v1.2.3, to be removed at >= v2.0.0. Use specific button component instead
       * @defaultvalue ButtonType.default
       * @deprecated
       */
  var buttonType: js.UndefOr[ButtonType] = js.undefined
  /**
       * Optional callback to access the IButton interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IButton]] = js.undefined
  /**
       * Any custom data the developer wishes to associate with the menu item.
       */
  @JSName("data")
  var data_IButtonProps: js.UndefOr[js.Any] = js.undefined
  /**
       * Style for the description text if applicable (for compound buttons.)
       * @deprecated Use 'secondaryText' instead.
       */
  var description: js.UndefOr[atUifabricMergeDashStylesLib.libIStyleMod.IStyle] = js.undefined
  /**
       * Method to provide the classnames to style a button.
       * The default value for this prop is the getClassnames func
       * defined in BaseButton.classnames.
       * @default getBaseButtonClassNames
       */
  var getClassNames: js.UndefOr[
    js.Function10[
      /* theme */ atUifabricStylingLib.libInterfacesIThemeMod.ITheme, 
      /* className */ java.lang.String, 
      /* variantClassName */ java.lang.String, 
      /* iconClassName */ js.UndefOr[java.lang.String], 
      /* menuIconClassName */ js.UndefOr[java.lang.String], 
      /* disabled */ scala.Boolean, 
      /* checked */ scala.Boolean, 
      /* expanded */ scala.Boolean, 
      /* isSplit */ js.UndefOr[scala.Boolean], 
      /* allowDisabledFocus */ scala.Boolean, 
      officeDashUiDashFabricDashReactLib.libComponentsButtonBaseButtonDotClassNamesMod.IButtonClassNames
    ]
  ] = js.undefined
  /**
       * Method to provide the classnames to style a button.
       * The default value for this prop is the getClassnames func
       * defined in BaseButton.classnames.
       * @default getBaseSplitButtonClassNames
       */
  var getSplitButtonClassNames: js.UndefOr[
    js.Function4[
      /* disabled */ scala.Boolean, 
      /* expanded */ scala.Boolean, 
      /* checked */ scala.Boolean, 
      /* allowDisabledFocus */ scala.Boolean, 
      officeDashUiDashFabricDashReactLib.libComponentsButtonSplitButtonSplitButtonDotClassNamesMod.ISplitButtonClassNames
    ]
  ] = js.undefined
  /**
       * The props for the icon shown in the button.
       */
  var iconProps: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IIconProps] = js.undefined
  /**
       * Optional keytip for this button
       */
  var keytipProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
  ] = js.undefined
  /**
       * Render a custom menu in place of the normal one.
       */
  var menuAs: js.UndefOr[
    atUifabricUtilitiesLib.libIComponentAsMod.IComponentAs[
      officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuProps
    ]
  ] = js.undefined
  /**
       * The props for the icon shown when providing a menu dropdown.
       */
  var menuIconProps: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IIconProps] = js.undefined
  /**
       * Props for button menu. Providing this will default to showing the menu icon. See menuIconProps for overriding
       * how the default icon looks. Providing this in addition of onClick and setting the split property to true will render a SplitButton.
       */
  var menuProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuProps
  ] = js.undefined
  /**
       * Provides a custom KeyCode that can be used to open the button menu.
       * The default KeyCode is the down arrow. A value of null can be provided to disable the key codes for opening the button menu.
       */
  var menuTriggerKeyCode: js.UndefOr[atUifabricUtilitiesLib.libKeyCodesMod.KeyCodes | scala.Null] = js.undefined
  /**
       * Callback that runs after Button's contextualmenu was closed (removed from the DOM)
       */
  var onAfterMenuDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Optional callback when menu is clicked.
       */
  var onMenuClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[
        reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement] | reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]
      ], 
      /* button */ js.UndefOr[IButtonProps], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Custom render function for the aria description element.
       */
  var onRenderAriaDescription: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IButtonProps]] = js.undefined
  /**
       * Custom render function for rendering the button children.
       */
  var onRenderChildren: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IButtonProps]] = js.undefined
  /**
       * Custom render function for the desciption text.
       */
  var onRenderDescription: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IButtonProps]] = js.undefined
  /**
       * Custom render function for the icon
       */
  var onRenderIcon: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IButtonProps]] = js.undefined
  /**
       * Deprecated at v6.3.2, to be removed at >= v7.0.0. Use menuAs instead.
       * @deprecated
       */
  var onRenderMenu: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[
      officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuProps
    ]
  ] = js.undefined
  /**
       * Custom render function for button menu icon
       */
  var onRenderMenuIcon: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IButtonProps]] = js.undefined
  /**
       * Custom render function for the label text.
       */
  var onRenderText: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IButtonProps]] = js.undefined
  /**
       * Menu will not be created or destroyed when opened or closed, instead it
       * will be hidden. This will improve perf of the menu opening but could potentially
       * impact overall perf by having more elemnts in the dom. Should only be used
       * when perf is important.
       * Note: This may increase the amount of time it takes for the button itself to mount.
       */
  var persistMenu: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Changes the visual presentation of the button to be emphasized (if defined)
       * @default false
       */
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If set to true and if this is a splitButton (split == true) then the primary action of a split button is disabled.
       */
  var primaryDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Deprecated at v0.56.2, to be removed at >= v1.0.0. Just pass in button props instead;
       * they will be mixed into the button/anchor element rendered by the component.
       * @deprecated
       */
  var rootProps: js.UndefOr[
    reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement] | reactLib.reactMod.ReactNs.AnchorHTMLAttributes[reactLib.HTMLAnchorElement]
  ] = js.undefined
  /**
       * Description of the action this button takes.
       * Only used for compound buttons
       */
  var secondaryText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If set to true, and if menuProps and onClick are provided, the button will render as a SplitButton. Defaults to false.
       */
  var split: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Accessible label for the dropdown chevron button if this button is split.
       */
  var splitButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Custom styling for individual elements within the button DOM.
       */
  var styles: js.UndefOr[IButtonStyles] = js.undefined
  /**
       * Text to render button label. If text is supplied, it will override any string in button children.
       * Other children components will be passed through after the text.
       */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Theme provided by HOC.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * Whether button is a toggle button with distinct on and off states. This should be true for buttons that permanently
       * change state when a press event finishes, such as a volume mute button.
       */
  var toggle: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Any custom data the developer wishes to associate with the menu item.
       *
       * @deprecated unused, use `checked` if setting state.
       */
  var toggled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Unique id to identify the item. Typically a duplicate of key value.
       */
  var uniqueId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

