package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.PartialIButtonStyles
import typings.officeUiFabricReact.anon.PartialIComboBoxOptionSty
import typings.officeUiFabricReact.anon.PartialIComboBoxStyles
import typings.officeUiFabricReact.autofillTypesMod.IAutofillProps
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.off
import typings.officeUiFabricReact.officeUiFabricReactStrings.on
import typings.officeUiFabricReact.selectableDroppableTextTypesMod.ISelectableDroppableTextProps
import typings.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import typings.react.mod.FormEvent
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comboBoxTypesMod {
  
  @js.native
  trait IComboBox extends StObject {
    
    /**
      * If there is a menu open this will dismiss the menu
      */
    def dismissMenu(): Unit = js.native
    
    /**
      * Sets focus to the input in the comboBox
      * @param shouldOpenOnFocus - Determines if we should open the ComboBox menu when the input gets focus
      * @param useFocusAsync - Determines if we should focus the input asynchronously
      * @returns True if focus could be set, false if no operation was taken.
      */
    def focus(): Boolean = js.native
    def focus(shouldOpenOnFocus: Boolean): Boolean = js.native
    def focus(shouldOpenOnFocus: Boolean, useFocusAsync: Boolean): Boolean = js.native
    def focus(shouldOpenOnFocus: Unit, useFocusAsync: Boolean): Boolean = js.native
    
    /**
      * All selected options
      */
    val selectedOptions: js.Array[IComboBoxOption] = js.native
  }
  
  trait IComboBoxClassNames extends StObject {
    
    var callout: String
    
    var container: String
    
    var divider: String
    
    var errorMessage: String
    
    var header: String
    
    var input: String
    
    var label: String
    
    var optionsContainer: String
    
    var optionsContainerWrapper: String
    
    var root: String
    
    var screenReaderText: String
  }
  object IComboBoxClassNames {
    
    inline def apply(
      callout: String,
      container: String,
      divider: String,
      errorMessage: String,
      header: String,
      input: String,
      label: String,
      optionsContainer: String,
      optionsContainerWrapper: String,
      root: String,
      screenReaderText: String
    ): IComboBoxClassNames = {
      val __obj = js.Dynamic.literal(callout = callout.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], optionsContainer = optionsContainer.asInstanceOf[js.Any], optionsContainerWrapper = optionsContainerWrapper.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], screenReaderText = screenReaderText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IComboBoxClassNames]
    }
    
    extension [Self <: IComboBoxClassNames](x: Self) {
      
      inline def setCallout(value: String): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOptionsContainer(value: String): Self = StObject.set(x, "optionsContainer", value.asInstanceOf[js.Any])
      
      inline def setOptionsContainerWrapper(value: String): Self = StObject.set(x, "optionsContainerWrapper", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setScreenReaderText(value: String): Self = StObject.set(x, "screenReaderText", value.asInstanceOf[js.Any])
    }
  }
  
  trait IComboBoxOption
    extends StObject
       with ISelectableOption {
    
    /**
      * Specific styles for each comboBox option. If you intend to give
      * common styles to all comboBox option please use
      * the prop comboBoxOptionStyles
      */
    var styles: js.UndefOr[PartialIComboBoxOptionSty] = js.undefined
    
    /**
      * In scenarios where embedded data is used at the text prop, we will use the ariaLabel prop
      * to set the aria-label and preview text. Default to false
      * @defaultvalue false;
      */
    var useAriaLabelAsText: js.UndefOr[Boolean] = js.undefined
  }
  object IComboBoxOption {
    
    inline def apply(key: String | Double, text: String): IComboBoxOption = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IComboBoxOption]
    }
    
    extension [Self <: IComboBoxOption](x: Self) {
      
      inline def setStyles(value: PartialIComboBoxOptionSty): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setUseAriaLabelAsText(value: Boolean): Self = StObject.set(x, "useAriaLabelAsText", value.asInstanceOf[js.Any])
      
      inline def setUseAriaLabelAsTextUndefined: Self = StObject.set(x, "useAriaLabelAsText", js.undefined)
    }
  }
  
  trait IComboBoxOptionClassNames extends StObject {
    
    var optionText: String
    
    var optionTextWrapper: String
    
    var root: String
  }
  object IComboBoxOptionClassNames {
    
    inline def apply(optionText: String, optionTextWrapper: String, root: String): IComboBoxOptionClassNames = {
      val __obj = js.Dynamic.literal(optionText = optionText.asInstanceOf[js.Any], optionTextWrapper = optionTextWrapper.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[IComboBoxOptionClassNames]
    }
    
    extension [Self <: IComboBoxOptionClassNames](x: Self) {
      
      inline def setOptionText(value: String): Self = StObject.set(x, "optionText", value.asInstanceOf[js.Any])
      
      inline def setOptionTextWrapper(value: String): Self = StObject.set(x, "optionTextWrapper", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait IComboBoxOptionStyles
    extends StObject
       with IButtonStyles {
    
    /**
      * Styles for the text inside the comboBox option.
      * This should be used instead of the description
      * inside IButtonStyles because we custom render the text
      * in the comboBox options.
      */
    var optionText: IStyle
    
    /**
      * Styles for the comboBox option text's wrapper.
      */
    var optionTextWrapper: IStyle
  }
  object IComboBoxOptionStyles {
    
    inline def apply(): IComboBoxOptionStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IComboBoxOptionStyles]
    }
    
    extension [Self <: IComboBoxOptionStyles](x: Self) {
      
      inline def setOptionText(value: IStyle): Self = StObject.set(x, "optionText", value.asInstanceOf[js.Any])
      
      inline def setOptionTextNull: Self = StObject.set(x, "optionText", null)
      
      inline def setOptionTextUndefined: Self = StObject.set(x, "optionText", js.undefined)
      
      inline def setOptionTextWrapper(value: IStyle): Self = StObject.set(x, "optionTextWrapper", value.asInstanceOf[js.Any])
      
      inline def setOptionTextWrapperNull: Self = StObject.set(x, "optionTextWrapper", null)
      
      inline def setOptionTextWrapperUndefined: Self = StObject.set(x, "optionTextWrapper", js.undefined)
    }
  }
  
  trait IComboBoxProps
    extends StObject
       with ISelectableDroppableTextProps[IComboBox, IComboBox] {
    
    /**
      * Whether the ComboBox is free form, meaning that the user input is not bound to provided options. Defaults to false.
      */
    var allowFreeform: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional prop to add a string id that can be referenced inside the aria-describedby attribute
      */
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the ComboBox auto completes. As the user is inputing text, it will be suggested potential matches from
      * the list of options. If the combo box is expanded, this will also scroll to the suggested option, and give it a
      * selected style.
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
    var caretDownButtonStyles: js.UndefOr[PartialIButtonStyles] = js.undefined
    
    /**
      * Default styles that should be applied to ComboBox options,
      * in case an option does not come with user-defined custom styles
      */
    var comboBoxOptionStyles: js.UndefOr[PartialIComboBoxOptionSty] = js.undefined
    
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
      * Sets the 'aria-hidden' attribute on the ComboBox's button element instructing screen readers how to handle
      * the element. This element is hidden by default because all functionality is handled by the input element and
      * the arrow button is only meant to be decorative.
      * @defaultvalue true
      */
    var isButtonAriaHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional keytip for this combo box
      */
    var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
    
    /**
      * When multiple items are selected, this will be used to separate values in the combobox input.
      *
      * @defaultvalue ", "
      */
    var multiSelectDelimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Callback issued when either:
      * 1) the selected option changes
      * 2) a manually edited value is submitted. In this case there may not be a matched option if allowFreeform
      *    is also true (and hence only value would be true, the other parameter would be null in this case)
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
      * Callback issued when the user changes the pending value in ComboBox.
      * This will be called any time the component is updated and there is a current
      * pending value. Option, index, and value will all be undefined if no change
      * has taken place and the previously entered pending value is still valid.
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
      * Custom render function for the label text.
      */
    var onRenderLabel: js.UndefOr[IRenderFunction[IOnRenderComboBoxLabelProps]] = js.undefined
    
    /**
      * Add additional content below the callout list.
      */
    var onRenderLowerContent: js.UndefOr[IRenderFunction[IComboBoxProps]] = js.undefined
    
    /**
      * Add additional content above the callout list.
      */
    var onRenderUpperContent: js.UndefOr[IRenderFunction[IComboBoxProps]] = js.undefined
    
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
      * impact overall perf by having more elements in the dom. Should only be used
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
    var styles: js.UndefOr[PartialIComboBoxStyles] = js.undefined
    
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
    
    inline def apply(options: js.Array[IComboBoxOption]): IComboBoxProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[IComboBoxProps]
    }
    
    extension [Self <: IComboBoxProps](x: Self) {
      
      inline def setAllowFreeform(value: Boolean): Self = StObject.set(x, "allowFreeform", value.asInstanceOf[js.Any])
      
      inline def setAllowFreeformUndefined: Self = StObject.set(x, "allowFreeform", js.undefined)
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAutoComplete(value: on | off): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutofill(value: IAutofillProps): Self = StObject.set(x, "autofill", value.asInstanceOf[js.Any])
      
      inline def setAutofillUndefined: Self = StObject.set(x, "autofill", js.undefined)
      
      inline def setButtonIconProps(value: IIconProps): Self = StObject.set(x, "buttonIconProps", value.asInstanceOf[js.Any])
      
      inline def setButtonIconPropsUndefined: Self = StObject.set(x, "buttonIconProps", js.undefined)
      
      inline def setCaretDownButtonStyles(value: PartialIButtonStyles): Self = StObject.set(x, "caretDownButtonStyles", value.asInstanceOf[js.Any])
      
      inline def setCaretDownButtonStylesUndefined: Self = StObject.set(x, "caretDownButtonStyles", js.undefined)
      
      inline def setComboBoxOptionStyles(value: PartialIComboBoxOptionSty): Self = StObject.set(x, "comboBoxOptionStyles", value.asInstanceOf[js.Any])
      
      inline def setComboBoxOptionStylesUndefined: Self = StObject.set(x, "comboBoxOptionStyles", js.undefined)
      
      inline def setDropdownMaxWidth(value: Double): Self = StObject.set(x, "dropdownMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setDropdownMaxWidthUndefined: Self = StObject.set(x, "dropdownMaxWidth", js.undefined)
      
      inline def setDropdownWidth(value: Double): Self = StObject.set(x, "dropdownWidth", value.asInstanceOf[js.Any])
      
      inline def setDropdownWidthUndefined: Self = StObject.set(x, "dropdownWidth", js.undefined)
      
      inline def setGetClassNames(
        value: (/* theme */ ITheme, /* isOpen */ Boolean, /* disabled */ Boolean, /* required */ Boolean, /* focused */ Boolean, /* allowFreeForm */ Boolean, /* hasErrorMessage */ Boolean, /* className */ js.UndefOr[String]) => IComboBoxClassNames
      ): Self = StObject.set(x, "getClassNames", js.Any.fromFunction8(value))
      
      inline def setGetClassNamesUndefined: Self = StObject.set(x, "getClassNames", js.undefined)
      
      inline def setIconButtonProps(value: IButtonProps): Self = StObject.set(x, "iconButtonProps", value.asInstanceOf[js.Any])
      
      inline def setIconButtonPropsUndefined: Self = StObject.set(x, "iconButtonProps", js.undefined)
      
      inline def setIsButtonAriaHidden(value: Boolean): Self = StObject.set(x, "isButtonAriaHidden", value.asInstanceOf[js.Any])
      
      inline def setIsButtonAriaHiddenUndefined: Self = StObject.set(x, "isButtonAriaHidden", js.undefined)
      
      inline def setKeytipProps(value: IKeytipProps): Self = StObject.set(x, "keytipProps", value.asInstanceOf[js.Any])
      
      inline def setKeytipPropsUndefined: Self = StObject.set(x, "keytipProps", js.undefined)
      
      inline def setMultiSelectDelimiter(value: String): Self = StObject.set(x, "multiSelectDelimiter", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectDelimiterUndefined: Self = StObject.set(x, "multiSelectDelimiter", js.undefined)
      
      inline def setOnChange(
        value: (/* event */ FormEvent[IComboBox], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnItemClick(
        value: (/* event */ FormEvent[IComboBox], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "onItemClick", js.Any.fromFunction3(value))
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setOnMenuDismiss(value: () => Unit): Self = StObject.set(x, "onMenuDismiss", js.Any.fromFunction0(value))
      
      inline def setOnMenuDismissUndefined: Self = StObject.set(x, "onMenuDismiss", js.undefined)
      
      inline def setOnMenuDismissed(value: () => Unit): Self = StObject.set(x, "onMenuDismissed", js.Any.fromFunction0(value))
      
      inline def setOnMenuDismissedUndefined: Self = StObject.set(x, "onMenuDismissed", js.undefined)
      
      inline def setOnMenuOpen(value: () => Unit): Self = StObject.set(x, "onMenuOpen", js.Any.fromFunction0(value))
      
      inline def setOnMenuOpenUndefined: Self = StObject.set(x, "onMenuOpen", js.undefined)
      
      inline def setOnPendingValueChanged(
        value: (/* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "onPendingValueChanged", js.Any.fromFunction3(value))
      
      inline def setOnPendingValueChangedUndefined: Self = StObject.set(x, "onPendingValueChanged", js.undefined)
      
      inline def setOnRenderLabel(
        value: (/* props */ js.UndefOr[IOnRenderComboBoxLabelProps], /* defaultRender */ js.UndefOr[
              js.Function1[/* props */ js.UndefOr[IOnRenderComboBoxLabelProps], Element | Null]
            ]) => Element | Null
      ): Self = StObject.set(x, "onRenderLabel", js.Any.fromFunction2(value))
      
      inline def setOnRenderLabelUndefined: Self = StObject.set(x, "onRenderLabel", js.undefined)
      
      inline def setOnRenderLowerContent(
        value: (/* props */ js.UndefOr[IComboBoxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IComboBoxProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderLowerContent", js.Any.fromFunction2(value))
      
      inline def setOnRenderLowerContentUndefined: Self = StObject.set(x, "onRenderLowerContent", js.undefined)
      
      inline def setOnRenderUpperContent(
        value: (/* props */ js.UndefOr[IComboBoxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IComboBoxProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderUpperContent", js.Any.fromFunction2(value))
      
      inline def setOnRenderUpperContentUndefined: Self = StObject.set(x, "onRenderUpperContent", js.undefined)
      
      inline def setOnResolveOptions(
        value: /* options */ js.Array[IComboBoxOption] => js.Array[IComboBoxOption] | js.Thenable[js.Array[IComboBoxOption]]
      ): Self = StObject.set(x, "onResolveOptions", js.Any.fromFunction1(value))
      
      inline def setOnResolveOptionsUndefined: Self = StObject.set(x, "onResolveOptions", js.undefined)
      
      inline def setOnScrollToItem(value: /* itemIndex */ Double => Unit): Self = StObject.set(x, "onScrollToItem", js.Any.fromFunction1(value))
      
      inline def setOnScrollToItemUndefined: Self = StObject.set(x, "onScrollToItem", js.undefined)
      
      inline def setOptions(value: js.Array[IComboBoxOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: IComboBoxOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setPersistMenu(value: Boolean): Self = StObject.set(x, "persistMenu", value.asInstanceOf[js.Any])
      
      inline def setPersistMenuUndefined: Self = StObject.set(x, "persistMenu", js.undefined)
      
      inline def setScrollSelectedToTop(value: Boolean): Self = StObject.set(x, "scrollSelectedToTop", value.asInstanceOf[js.Any])
      
      inline def setScrollSelectedToTopUndefined: Self = StObject.set(x, "scrollSelectedToTop", js.undefined)
      
      inline def setShouldRestoreFocus(value: Boolean): Self = StObject.set(x, "shouldRestoreFocus", value.asInstanceOf[js.Any])
      
      inline def setShouldRestoreFocusUndefined: Self = StObject.set(x, "shouldRestoreFocus", js.undefined)
      
      inline def setStyles(value: PartialIComboBoxStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUseComboBoxAsMenuWidth(value: Boolean): Self = StObject.set(x, "useComboBoxAsMenuWidth", value.asInstanceOf[js.Any])
      
      inline def setUseComboBoxAsMenuWidthUndefined: Self = StObject.set(x, "useComboBoxAsMenuWidth", js.undefined)
    }
  }
  
  trait IComboBoxStyles extends StObject {
    
    /**
      * Styles for the callout.
      */
    var callout: IStyle
    
    /**
      * Style for the container which has the ComboBox and the label
      */
    var container: IStyle
    
    /**
      * Styles for a divider in the options.
      */
    var divider: IStyle
    
    /**
      * Styles for the error Message text of the comboBox.
      */
    var errorMessage: IStyle
    
    /**
      * Styles for a header in the options.
      */
    var header: IStyle
    
    /**
      * Base styles for the input element - which contains the currently selected
      * option.
      */
    var input: IStyle
    
    /**
      * Style override for the input element when comboBox is disabled.
      */
    var inputDisabled: IStyle
    
    /**
      * Style for the label element of the ComboBox.
      */
    var label: IStyle
    
    /**
      * Style for the label element of the ComboBox in the disabled state.
      */
    var labelDisabled: IStyle
    
    /**
      * Styles for the container of all the Combobox options
      * Includes the headers and dividers.
      */
    var optionsContainer: IStyle
    
    /**
      * Styles for the optionsContainerWrapper.
      */
    var optionsContainerWrapper: IStyle
    
    /**
      * Base styles for the root element of all ComboBoxes.
      */
    var root: IStyle
    
    /**
      * Styles for when the comboBox is disabled. These styles override all the other styles.
      * NOTE : Hover (or) Focused (or) active styles are not applied for disabled comboBoxes.
      */
    var rootDisabled: IStyle
    
    /**
      * Styles for variant of ComboBox where allowFreeForm is false in the props.
      */
    var rootDisallowFreeForm: IStyle
    
    /**
      * Styles for the root element for variant of ComboBox with an errorMessage in the props.
      */
    var rootError: IStyle
    
    /**
      * Styles for when the ComboBox is focused. These styles are applied for all comboBoxes except when
      * the comboBox is disabled.
      */
    var rootFocused: IStyle
    
    /**
      * Styles for when the ComboBox is hovered. These styles are applied for all comboBoxes except when
      * the comboBox is disabled.
      */
    var rootHovered: IStyle
    
    /**
      * Styles for when the ComboBox is active. These styles are applied for all comboBoxes except when
      * the comboBox is disabled.
      */
    var rootPressed: IStyle
    
    /**
      * Styles for hidden screen reader text.
      */
    var screenReaderText: IStyle
  }
  object IComboBoxStyles {
    
    inline def apply(): IComboBoxStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IComboBoxStyles]
    }
    
    extension [Self <: IComboBoxStyles](x: Self) {
      
      inline def setCallout(value: IStyle): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
      
      inline def setCalloutNull: Self = StObject.set(x, "callout", null)
      
      inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
      
      inline def setContainer(value: IStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDivider(value: IStyle): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerNull: Self = StObject.set(x, "divider", null)
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setErrorMessage(value: IStyle): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setHeader(value: IStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setInput(value: IStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputDisabled(value: IStyle): Self = StObject.set(x, "inputDisabled", value.asInstanceOf[js.Any])
      
      inline def setInputDisabledNull: Self = StObject.set(x, "inputDisabled", null)
      
      inline def setInputDisabledUndefined: Self = StObject.set(x, "inputDisabled", js.undefined)
      
      inline def setInputNull: Self = StObject.set(x, "input", null)
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setLabel(value: IStyle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelDisabled(value: IStyle): Self = StObject.set(x, "labelDisabled", value.asInstanceOf[js.Any])
      
      inline def setLabelDisabledNull: Self = StObject.set(x, "labelDisabled", null)
      
      inline def setLabelDisabledUndefined: Self = StObject.set(x, "labelDisabled", js.undefined)
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOptionsContainer(value: IStyle): Self = StObject.set(x, "optionsContainer", value.asInstanceOf[js.Any])
      
      inline def setOptionsContainerNull: Self = StObject.set(x, "optionsContainer", null)
      
      inline def setOptionsContainerUndefined: Self = StObject.set(x, "optionsContainer", js.undefined)
      
      inline def setOptionsContainerWrapper(value: IStyle): Self = StObject.set(x, "optionsContainerWrapper", value.asInstanceOf[js.Any])
      
      inline def setOptionsContainerWrapperNull: Self = StObject.set(x, "optionsContainerWrapper", null)
      
      inline def setOptionsContainerWrapperUndefined: Self = StObject.set(x, "optionsContainerWrapper", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootDisabled(value: IStyle): Self = StObject.set(x, "rootDisabled", value.asInstanceOf[js.Any])
      
      inline def setRootDisabledNull: Self = StObject.set(x, "rootDisabled", null)
      
      inline def setRootDisabledUndefined: Self = StObject.set(x, "rootDisabled", js.undefined)
      
      inline def setRootDisallowFreeForm(value: IStyle): Self = StObject.set(x, "rootDisallowFreeForm", value.asInstanceOf[js.Any])
      
      inline def setRootDisallowFreeFormNull: Self = StObject.set(x, "rootDisallowFreeForm", null)
      
      inline def setRootDisallowFreeFormUndefined: Self = StObject.set(x, "rootDisallowFreeForm", js.undefined)
      
      inline def setRootError(value: IStyle): Self = StObject.set(x, "rootError", value.asInstanceOf[js.Any])
      
      inline def setRootErrorNull: Self = StObject.set(x, "rootError", null)
      
      inline def setRootErrorUndefined: Self = StObject.set(x, "rootError", js.undefined)
      
      inline def setRootFocused(value: IStyle): Self = StObject.set(x, "rootFocused", value.asInstanceOf[js.Any])
      
      inline def setRootFocusedNull: Self = StObject.set(x, "rootFocused", null)
      
      inline def setRootFocusedUndefined: Self = StObject.set(x, "rootFocused", js.undefined)
      
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
    }
  }
  
  trait IOnRenderComboBoxLabelProps extends StObject {
    
    /**
      * Accessible text for label when combobox is multiselected.
      */
    var multiselectAccessibleText: js.UndefOr[String] = js.undefined
    
    /**
      * Props to render the combobox.
      */
    var props: IComboBoxProps
  }
  object IOnRenderComboBoxLabelProps {
    
    inline def apply(props: IComboBoxProps): IOnRenderComboBoxLabelProps = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOnRenderComboBoxLabelProps]
    }
    
    extension [Self <: IOnRenderComboBoxLabelProps](x: Self) {
      
      inline def setMultiselectAccessibleText(value: String): Self = StObject.set(x, "multiselectAccessibleText", value.asInstanceOf[js.Any])
      
      inline def setMultiselectAccessibleTextUndefined: Self = StObject.set(x, "multiselectAccessibleText", js.undefined)
      
      inline def setProps(value: IComboBoxProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
