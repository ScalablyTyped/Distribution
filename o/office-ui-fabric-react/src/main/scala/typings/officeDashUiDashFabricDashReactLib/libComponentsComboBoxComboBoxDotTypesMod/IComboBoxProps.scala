package typings
package officeDashUiDashFabricDashReactLib.libComponentsComboBoxComboBoxDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IComboBoxProps
  extends officeDashUiDashFabricDashReactLib.libUtilitiesSelectableOptionSelectableDroppableTextDotTypesMod.ISelectableDroppableTextProps[IComboBox, IComboBox] {
  /**
       * Whether the ComboBox is free form, meaning that the user input is not bound to provided options. Defaults to false.
       */
  var allowFreeform: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the ComboBox auto completes. As the user is inputing text, it will be suggested potential matches from the list of options. If
       * the combo box is expanded, this will also scroll to the suggested option, and give it a selected style.
       *
       * @defaultvalue "on"
       */
  var autoComplete: js.UndefOr[
    officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.on | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.off
  ] = js.undefined
  /**
       * The IconProps to use for the button aspect of the combobox
       */
  var buttonIconProps: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IIconProps] = js.undefined
  /**
       * Styles for the caret down button.
       */
  var caretDownButtonStyles: js.UndefOr[
    stdLib.Partial[
      officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonStyles
    ]
  ] = js.undefined
  /**
       * Default styles that should be applied to ComboBox options,
       * in case an option does not come with user-defined custom styles
       */
  var comboBoxOptionStyles: js.UndefOr[stdLib.Partial[IComboBoxOptionStyles]] = js.undefined
  /**
       * Custom max width for dropdown
       */
  var dropdownMaxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * Custom width for dropdown (unless useComboBoxAsMenuWidth is undefined or false)
       */
  var dropdownWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * Custom function for providing the classNames for the ComboBox. Can be used to provide
       * all styles for the component instead of applying them on top of the default styles.
       */
  var getClassNames: js.UndefOr[
    js.Function8[
      /* theme */ atUifabricStylingLib.libInterfacesIThemeMod.ITheme, 
      /* isOpen */ scala.Boolean, 
      /* disabled */ scala.Boolean, 
      /* required */ scala.Boolean, 
      /* focused */ scala.Boolean, 
      /* allowFreeForm */ scala.Boolean, 
      /* hasErrorMessage */ scala.Boolean, 
      /* className */ js.UndefOr[java.lang.String], 
      officeDashUiDashFabricDashReactLib.libComponentsComboBoxComboBoxDotClassNamesMod.IComboBoxClassNames
    ]
  ] = js.undefined
  /**
       * Sets the 'aria-hidden' attribute on the ComboBox's button element instructing screen readers how to handle the element.
       * This element is hidden by default because all functionality is handled by the input element and the arrow button is
       * only meant to be decorative.
       * @defaultvalue true
       */
  var isButtonAriaHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional keytip for this combo box
       */
  var keytipProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
  ] = js.undefined
  /**
       * Optional mode indicates if multi-choice selections is allowed.  Default to false
       */
  var multiSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Callback issued when either:
       * 1) the selected option changes
       * 2) a manually edited value is submitted. In this case there may not be a matched option if allowFreeform is also true
       *    (and hence only value would be true, the other parameter would be null in this case)
       */
  @JSName("onChange")
  var onChange_IComboBoxProps: js.UndefOr[
    js.Function4[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[IComboBox], 
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[scala.Double], 
      /* value */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Deprecated, use `onChange` instead.
       * @deprecated Use `onChange` instead.
       */
  var onChanged: js.UndefOr[
    js.Function4[
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[scala.Double], 
      /* value */ js.UndefOr[java.lang.String], 
      /* submitPendingValueEvent */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Callback issued when a ComboBox item is clicked.
       */
  var onItemClick: js.UndefOr[
    js.Function3[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[IComboBox], 
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Function that gets invoked when the ComboBox menu is dismissed
       */
  var onMenuDismissed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Function that gets invoked when the ComboBox menu is launched
       */
  var onMenuOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Callback issued when the user changes the pending value in ComboBox
       */
  var onPendingValueChanged: js.UndefOr[
    js.Function3[
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[scala.Double], 
      /* value */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Add additional content below the callout list.
       */
  var onRenderLowerContent: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IComboBoxProps]] = js.undefined
  /**
       * Callback issued when the options should be resolved, if they have been updated or
       * if they need to be passed in the first time
       */
  var onResolveOptions: js.UndefOr[
    js.Function1[
      /* options */ js.Array[IComboBoxOption], 
      js.Array[IComboBoxOption] | stdLib.PromiseLike[js.Array[IComboBoxOption]]
    ]
  ] = js.undefined
  /**
       * Callback issued when the ComboBox requests the list to scroll to a specific element
       */
  var onScrollToItem: js.UndefOr[js.Function1[/* itemIndex */ scala.Double, scala.Unit]] = js.undefined
  /**
       * Collection of options for this ComboBox
       */
  @JSName("options")
  var options_IComboBoxProps: js.Array[IComboBoxOption]
  /**
       * When options are scrollable the selected option is positioned at the top of the callout when it is opened
       * (unless it has reached the end of the scrollbar).
       * @defaultvalue false;
       */
  var scrollSelectedToTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Custom styles for this component
       */
  var styles: js.UndefOr[stdLib.Partial[IComboBoxStyles]] = js.undefined
  /**
       * Value to show in the input, does not have to map to a combobox option
       */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Theme provided by HOC.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * Whether to use the ComboBoxes width as the menu's width
       */
  var useComboBoxAsMenuWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Value to show in the input, does not have to map to a combobox option
       * Deprecated, use `text` instead.
       * @deprecated Use `text` instead.
       */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

