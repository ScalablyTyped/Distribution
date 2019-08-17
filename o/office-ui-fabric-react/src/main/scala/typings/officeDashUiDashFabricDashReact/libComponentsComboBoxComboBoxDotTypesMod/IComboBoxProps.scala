package typings.officeDashUiDashFabricDashReact.libComponentsComboBoxComboBoxDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsAutofillAutofillDotTypesMod.IAutofillProps
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonStyles
import typings.officeDashUiDashFabricDashReact.libComponentsComboBoxComboBoxDotClassNamesMod.IComboBoxClassNames
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableDroppableTextDotTypesMod.ISelectableDroppableTextProps
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.off
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.on
import typings.react.reactMod.FormEvent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComboBoxProps extends ISelectableDroppableTextProps[IComboBox, IComboBox] {
  /**
    * Whether the ComboBox is free form, meaning that the user input is not bound to provided options. Defaults to false.
    */
  var allowFreeform: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional prop to add a string id that can be referenced inside the aria-describedby attribute
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  /**
    * Whether the ComboBox auto completes. As the user is inputing text, it will be suggested potential matches from the list of options. If
    * the combo box is expanded, this will also scroll to the suggested option, and give it a selected style.
    *
    * @defaultvalue "on"
    */
  var autoComplete: js.UndefOr[on | off] = js.undefined
  /**
    * The AutofillProps to be passed into the Autofill component inside combobox
    */
  var autofill: js.UndefOr[IAutofillProps] = js.undefined
  /**
    * The IconProps to use for the button aspect of the combobox
    */
  var buttonIconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * Styles for the caret down button.
    */
  var caretDownButtonStyles: js.UndefOr[Partial[IButtonStyles]] = js.undefined
  /**
    * Default styles that should be applied to ComboBox options,
    * in case an option does not come with user-defined custom styles
    */
  var comboBoxOptionStyles: js.UndefOr[Partial[IComboBoxOptionStyles]] = js.undefined
  /**
    * Custom max width for dropdown
    */
  var dropdownMaxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Custom width for dropdown (unless useComboBoxAsMenuWidth is undefined or false)
    */
  var dropdownWidth: js.UndefOr[Double] = js.undefined
  /**
    * Custom function for providing the classNames for the ComboBox. Can be used to provide
    * all styles for the component instead of applying them on top of the default styles.
    */
  var getClassNames: js.UndefOr[
    js.Function8[
      /* theme */ ITheme, 
      /* isOpen */ Boolean, 
      /* disabled */ Boolean, 
      /* required */ Boolean, 
      /* focused */ Boolean, 
      /* allowFreeForm */ Boolean, 
      /* hasErrorMessage */ Boolean, 
      /* className */ js.UndefOr[String], 
      IComboBoxClassNames
    ]
  ] = js.undefined
  /**
    * Optional iconButton props on combo box
    */
  var iconButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /**
    * Sets the 'aria-hidden' attribute on the ComboBox's button element instructing screen readers how to handle the element.
    * This element is hidden by default because all functionality is handled by the input element and the arrow button is
    * only meant to be decorative.
    * @defaultvalue true
    */
  var isButtonAriaHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional keytip for this combo box
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  /**
    * Optional mode indicates if multi-choice selections is allowed.  Default to false
    */
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback issued when either:
    * 1) the selected option changes
    * 2) a manually edited value is submitted. In this case there may not be a matched option if allowFreeform is also true
    *    (and hence only value would be true, the other parameter would be null in this case)
    */
  @JSName("onChange")
  var onChange_IComboBoxProps: js.UndefOr[
    js.Function4[
      /* event */ FormEvent[IComboBox], 
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[Double], 
      /* value */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  /**
    * Callback issued when a ComboBox item is clicked.
    */
  var onItemClick: js.UndefOr[
    js.Function3[
      /* event */ FormEvent[IComboBox], 
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /**
    * Function that gets invoked before the menu gets dismissed
    */
  var onMenuDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Function that gets invoked when the ComboBox menu is dismissed
    */
  var onMenuDismissed: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Function that gets invoked when the ComboBox menu is launched
    */
  var onMenuOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback issued when the user changes the pending value in ComboBox
    */
  var onPendingValueChanged: js.UndefOr[
    js.Function3[
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[Double], 
      /* value */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  /**
    * Add additional content below the callout list.
    */
  var onRenderLowerContent: js.UndefOr[IRenderFunction[IComboBoxProps]] = js.undefined
  /**
    * Callback issued when the options should be resolved, if they have been updated or
    * if they need to be passed in the first time
    */
  var onResolveOptions: js.UndefOr[
    js.Function1[
      /* options */ js.Array[IComboBoxOption], 
      js.Array[IComboBoxOption] | js.Thenable[js.Array[IComboBoxOption]]
    ]
  ] = js.undefined
  /**
    * Callback issued when the ComboBox requests the list to scroll to a specific element
    */
  var onScrollToItem: js.UndefOr[js.Function1[/* itemIndex */ Double, Unit]] = js.undefined
  /**
    * Collection of options for this ComboBox
    */
  @JSName("options")
  var options_IComboBoxProps: js.Array[IComboBoxOption]
  /**
    * Menu will not be created or destroyed when opened or closed, instead it
    * will be hidden. This will improve perf of the menu opening but could potentially
    * impact overall perf by having more elemnts in the dom. Should only be used
    * when perf is important.
    * Note: This may increase the amount of time it takes for the comboBox itself to mount.
    */
  var persistMenu: js.UndefOr[Boolean] = js.undefined
  /**
    * When options are scrollable the selected option is positioned at the top of the callout when it is opened
    * (unless it has reached the end of the scrollbar).
    * @defaultvalue false;
    */
  var scrollSelectedToTop: js.UndefOr[Boolean] = js.undefined
  /**
    * When specified, determines whether the callout (the menu which drops down) should
    * restore the focus after being dismissed or not.  If false, then the menu will not try
    * to set focus to whichever element had focus before the menu was opened.
    * @defaultvalue true;
    */
  var shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom styles for this component
    */
  var styles: js.UndefOr[Partial[IComboBoxStyles]] = js.undefined
  /**
    * Value to show in the input, does not have to map to a combobox option
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Whether to use the ComboBoxes width as the menu's width
    */
  var useComboBoxAsMenuWidth: js.UndefOr[Boolean] = js.undefined
}

object IComboBoxProps {
  @scala.inline
  def apply(
    options: js.Array[IComboBoxOption],
    ISelectableDroppableTextProps: ISelectableDroppableTextProps[IComboBox, IComboBox] = null,
    allowFreeform: js.UndefOr[Boolean] = js.undefined,
    ariaDescribedBy: String = null,
    autoComplete: on | off = null,
    autofill: IAutofillProps = null,
    buttonIconProps: IIconProps = null,
    caretDownButtonStyles: Partial[IButtonStyles] = null,
    comboBoxOptionStyles: Partial[IComboBoxOptionStyles] = null,
    componentRef: IRefObject[IComboBox] = null,
    dropdownMaxWidth: Int | Double = null,
    dropdownWidth: Int | Double = null,
    getClassNames: (/* theme */ ITheme, /* isOpen */ Boolean, /* disabled */ Boolean, /* required */ Boolean, /* focused */ Boolean, /* allowFreeForm */ Boolean, /* hasErrorMessage */ Boolean, /* className */ js.UndefOr[String]) => IComboBoxClassNames = null,
    iconButtonProps: IButtonProps = null,
    isButtonAriaHidden: js.UndefOr[Boolean] = js.undefined,
    keytipProps: IKeytipProps = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* event */ FormEvent[IComboBox], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Unit = null,
    onItemClick: (/* event */ FormEvent[IComboBox], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double]) => Unit = null,
    onMenuDismiss: () => Unit = null,
    onMenuDismissed: () => Unit = null,
    onMenuOpen: () => Unit = null,
    onPendingValueChanged: (/* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Unit = null,
    onRenderLowerContent: IRenderFunction[IComboBoxProps] = null,
    onResolveOptions: /* options */ js.Array[IComboBoxOption] => js.Array[IComboBoxOption] | js.Thenable[js.Array[IComboBoxOption]] = null,
    onScrollToItem: /* itemIndex */ Double => Unit = null,
    persistMenu: js.UndefOr[Boolean] = js.undefined,
    scrollSelectedToTop: js.UndefOr[Boolean] = js.undefined,
    shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    styles: Partial[IComboBoxStyles] = null,
    text: String = null,
    theme: ITheme = null,
    useComboBoxAsMenuWidth: js.UndefOr[Boolean] = js.undefined
  ): IComboBoxProps = {
    val __obj = js.Dynamic.literal(options = options)
    js.Dynamic.global.Object.assign(__obj, ISelectableDroppableTextProps)
    if (!js.isUndefined(allowFreeform)) __obj.updateDynamic("allowFreeform")(allowFreeform)
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autofill != null) __obj.updateDynamic("autofill")(autofill)
    if (buttonIconProps != null) __obj.updateDynamic("buttonIconProps")(buttonIconProps)
    if (caretDownButtonStyles != null) __obj.updateDynamic("caretDownButtonStyles")(caretDownButtonStyles)
    if (comboBoxOptionStyles != null) __obj.updateDynamic("comboBoxOptionStyles")(comboBoxOptionStyles)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (dropdownMaxWidth != null) __obj.updateDynamic("dropdownMaxWidth")(dropdownMaxWidth.asInstanceOf[js.Any])
    if (dropdownWidth != null) __obj.updateDynamic("dropdownWidth")(dropdownWidth.asInstanceOf[js.Any])
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction8(getClassNames))
    if (iconButtonProps != null) __obj.updateDynamic("iconButtonProps")(iconButtonProps)
    if (!js.isUndefined(isButtonAriaHidden)) __obj.updateDynamic("isButtonAriaHidden")(isButtonAriaHidden)
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps)
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction3(onItemClick))
    if (onMenuDismiss != null) __obj.updateDynamic("onMenuDismiss")(js.Any.fromFunction0(onMenuDismiss))
    if (onMenuDismissed != null) __obj.updateDynamic("onMenuDismissed")(js.Any.fromFunction0(onMenuDismissed))
    if (onMenuOpen != null) __obj.updateDynamic("onMenuOpen")(js.Any.fromFunction0(onMenuOpen))
    if (onPendingValueChanged != null) __obj.updateDynamic("onPendingValueChanged")(js.Any.fromFunction3(onPendingValueChanged))
    if (onRenderLowerContent != null) __obj.updateDynamic("onRenderLowerContent")(onRenderLowerContent)
    if (onResolveOptions != null) __obj.updateDynamic("onResolveOptions")(js.Any.fromFunction1(onResolveOptions))
    if (onScrollToItem != null) __obj.updateDynamic("onScrollToItem")(js.Any.fromFunction1(onScrollToItem))
    if (!js.isUndefined(persistMenu)) __obj.updateDynamic("persistMenu")(persistMenu)
    if (!js.isUndefined(scrollSelectedToTop)) __obj.updateDynamic("scrollSelectedToTop")(scrollSelectedToTop)
    if (!js.isUndefined(shouldRestoreFocus)) __obj.updateDynamic("shouldRestoreFocus")(shouldRestoreFocus)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (text != null) __obj.updateDynamic("text")(text)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(useComboBoxAsMenuWidth)) __obj.updateDynamic("useComboBoxAsMenuWidth")(useComboBoxAsMenuWidth)
    __obj.asInstanceOf[IComboBoxProps]
  }
}

