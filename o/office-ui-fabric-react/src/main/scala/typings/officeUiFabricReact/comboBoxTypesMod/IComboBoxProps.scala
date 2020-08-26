package typings.officeUiFabricReact.comboBoxTypesMod

import typings.officeUiFabricReact.anon.PartialIButtonStyles
import typings.officeUiFabricReact.anon.PartialIComboBoxOptionSty
import typings.officeUiFabricReact.anon.PartialIComboBoxStyles
import typings.officeUiFabricReact.autofillTypesMod.IAutofillProps
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.comboBoxClassNamesMod.IComboBoxClassNames
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.off
import typings.officeUiFabricReact.officeUiFabricReactStrings.on
import typings.officeUiFabricReact.selectableDroppableTextTypesMod.ISelectableDroppableTextProps
import typings.react.mod.FormEvent
import typings.react.mod.global.JSX.Element
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComboBoxProps extends ISelectableDroppableTextProps[IComboBox, IComboBox] {
  /**
    * Whether the ComboBox is free form, meaning that the user input is not bound to provided options. Defaults to false.
    */
  var allowFreeform: js.UndefOr[Boolean] = js.native
  /**
    * Optional prop to add a string id that can be referenced inside the aria-describedby attribute
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  /**
    * Whether the ComboBox auto completes. As the user is inputing text, it will be suggested potential matches from
    * the list of options. If the combo box is expanded, this will also scroll to the suggested option, and give it a
    * selected style.
    *
    * @defaultvalue "on"
    */
  var autoComplete: js.UndefOr[on | off] = js.native
  /**
    * The AutofillProps to be passed into the Autofill component inside combobox
    */
  var autofill: js.UndefOr[IAutofillProps] = js.native
  /**
    * The IconProps to use for the button aspect of the combobox
    */
  var buttonIconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Styles for the caret down button.
    */
  var caretDownButtonStyles: js.UndefOr[PartialIButtonStyles] = js.native
  /**
    * Default styles that should be applied to ComboBox options,
    * in case an option does not come with user-defined custom styles
    */
  var comboBoxOptionStyles: js.UndefOr[PartialIComboBoxOptionSty] = js.native
  /**
    * Custom max width for dropdown
    */
  var dropdownMaxWidth: js.UndefOr[Double] = js.native
  /**
    * Custom width for dropdown (unless useComboBoxAsMenuWidth is undefined or false)
    */
  var dropdownWidth: js.UndefOr[Double] = js.native
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
  ] = js.native
  /**
    * Optional iconButton props on combo box
    */
  var iconButtonProps: js.UndefOr[IButtonProps] = js.native
  /**
    * Sets the 'aria-hidden' attribute on the ComboBox's button element instructing screen readers how to handle
    * the element. This element is hidden by default because all functionality is handled by the input element and
    * the arrow button is only meant to be decorative.
    * @defaultvalue true
    */
  var isButtonAriaHidden: js.UndefOr[Boolean] = js.native
  /**
    * Optional keytip for this combo box
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  /**
    * When multiple items are selected, this will be used to separate values in the combobox input.
    *
    * @defaultvalue ", "
    */
  var multiSelectDelimiter: js.UndefOr[String] = js.native
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
  ] = js.native
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
  ] = js.native
  /**
    * Function that gets invoked before the menu gets dismissed
    */
  var onMenuDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function that gets invoked when the ComboBox menu is dismissed
    */
  var onMenuDismissed: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function that gets invoked when the ComboBox menu is launched
    */
  var onMenuOpen: js.UndefOr[js.Function0[Unit]] = js.native
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
  ] = js.native
  /**
    * Custom render function for the label text.
    */
  var onRenderLabel: js.UndefOr[IRenderFunction[IOnRenderComboBoxLabelProps]] = js.native
  /**
    * Add additional content below the callout list.
    */
  var onRenderLowerContent: js.UndefOr[IRenderFunction[IComboBoxProps]] = js.native
  /**
    * Add additional content above the callout list.
    */
  var onRenderUpperContent: js.UndefOr[IRenderFunction[IComboBoxProps]] = js.native
  /**
    * Callback issued when the options should be resolved, if they have been updated or
    * if they need to be passed in the first time
    */
  var onResolveOptions: js.UndefOr[
    js.Function1[
      /* options */ js.Array[IComboBoxOption], 
      js.Array[IComboBoxOption] | js.Thenable[js.Array[IComboBoxOption]]
    ]
  ] = js.native
  /**
    * Callback issued when the ComboBox requests the list to scroll to a specific element
    */
  var onScrollToItem: js.UndefOr[js.Function1[/* itemIndex */ Double, Unit]] = js.native
  /**
    * Collection of options for this ComboBox
    */
  @JSName("options")
  var options_IComboBoxProps: js.Array[IComboBoxOption] = js.native
  /**
    * Menu will not be created or destroyed when opened or closed, instead it
    * will be hidden. This will improve perf of the menu opening but could potentially
    * impact overall perf by having more elements in the dom. Should only be used
    * when perf is important.
    * Note: This may increase the amount of time it takes for the comboBox itself to mount.
    */
  var persistMenu: js.UndefOr[Boolean] = js.native
  /**
    * When options are scrollable the selected option is positioned at the top of the callout when it is opened
    * (unless it has reached the end of the scrollbar).
    * @defaultvalue false;
    */
  var scrollSelectedToTop: js.UndefOr[Boolean] = js.native
  /**
    * When specified, determines whether the callout (the menu which drops down) should
    * restore the focus after being dismissed or not.  If false, then the menu will not try
    * to set focus to whichever element had focus before the menu was opened.
    * @defaultvalue true;
    */
  var shouldRestoreFocus: js.UndefOr[Boolean] = js.native
  /**
    * Custom styles for this component
    */
  var styles: js.UndefOr[PartialIComboBoxStyles] = js.native
  /**
    * Value to show in the input, does not have to map to a combobox option
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Whether to use the ComboBoxes width as the menu's width
    */
  var useComboBoxAsMenuWidth: js.UndefOr[Boolean] = js.native
}

object IComboBoxProps {
  @scala.inline
  def apply(options: js.Array[IComboBoxOption]): IComboBoxProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxProps]
  }
  @scala.inline
  implicit class IComboBoxPropsOps[Self <: IComboBoxProps] (val x: Self) extends AnyVal {
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
    def setOptionsVarargs(value: IComboBoxOption*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[IComboBoxOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowFreeform(value: Boolean): Self = this.set("allowFreeform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFreeform: Self = this.set("allowFreeform", js.undefined)
    @scala.inline
    def setAriaDescribedBy(value: String): Self = this.set("ariaDescribedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaDescribedBy: Self = this.set("ariaDescribedBy", js.undefined)
    @scala.inline
    def setAutoComplete(value: on | off): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutofill(value: IAutofillProps): Self = this.set("autofill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutofill: Self = this.set("autofill", js.undefined)
    @scala.inline
    def setButtonIconProps(value: IIconProps): Self = this.set("buttonIconProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonIconProps: Self = this.set("buttonIconProps", js.undefined)
    @scala.inline
    def setCaretDownButtonStyles(value: PartialIButtonStyles): Self = this.set("caretDownButtonStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaretDownButtonStyles: Self = this.set("caretDownButtonStyles", js.undefined)
    @scala.inline
    def setComboBoxOptionStyles(value: PartialIComboBoxOptionSty): Self = this.set("comboBoxOptionStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComboBoxOptionStyles: Self = this.set("comboBoxOptionStyles", js.undefined)
    @scala.inline
    def setDropdownMaxWidth(value: Double): Self = this.set("dropdownMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownMaxWidth: Self = this.set("dropdownMaxWidth", js.undefined)
    @scala.inline
    def setDropdownWidth(value: Double): Self = this.set("dropdownWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownWidth: Self = this.set("dropdownWidth", js.undefined)
    @scala.inline
    def setGetClassNames(
      value: (/* theme */ ITheme, /* isOpen */ Boolean, /* disabled */ Boolean, /* required */ Boolean, /* focused */ Boolean, /* allowFreeForm */ Boolean, /* hasErrorMessage */ Boolean, /* className */ js.UndefOr[String]) => IComboBoxClassNames
    ): Self = this.set("getClassNames", js.Any.fromFunction8(value))
    @scala.inline
    def deleteGetClassNames: Self = this.set("getClassNames", js.undefined)
    @scala.inline
    def setIconButtonProps(value: IButtonProps): Self = this.set("iconButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconButtonProps: Self = this.set("iconButtonProps", js.undefined)
    @scala.inline
    def setIsButtonAriaHidden(value: Boolean): Self = this.set("isButtonAriaHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsButtonAriaHidden: Self = this.set("isButtonAriaHidden", js.undefined)
    @scala.inline
    def setKeytipProps(value: IKeytipProps): Self = this.set("keytipProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeytipProps: Self = this.set("keytipProps", js.undefined)
    @scala.inline
    def setMultiSelectDelimiter(value: String): Self = this.set("multiSelectDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelectDelimiter: Self = this.set("multiSelectDelimiter", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* event */ FormEvent[IComboBox], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnItemClick(
      value: (/* event */ FormEvent[IComboBox], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onItemClick", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    @scala.inline
    def setOnMenuDismiss(value: () => Unit): Self = this.set("onMenuDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMenuDismiss: Self = this.set("onMenuDismiss", js.undefined)
    @scala.inline
    def setOnMenuDismissed(value: () => Unit): Self = this.set("onMenuDismissed", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMenuDismissed: Self = this.set("onMenuDismissed", js.undefined)
    @scala.inline
    def setOnMenuOpen(value: () => Unit): Self = this.set("onMenuOpen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMenuOpen: Self = this.set("onMenuOpen", js.undefined)
    @scala.inline
    def setOnPendingValueChanged(
      value: (/* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Unit
    ): Self = this.set("onPendingValueChanged", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnPendingValueChanged: Self = this.set("onPendingValueChanged", js.undefined)
    @scala.inline
    def setOnRenderLabel(
      value: (/* props */ js.UndefOr[IOnRenderComboBoxLabelProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IOnRenderComboBoxLabelProps], Element | Null]
        ]) => Element | Null
    ): Self = this.set("onRenderLabel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderLabel: Self = this.set("onRenderLabel", js.undefined)
    @scala.inline
    def setOnRenderLowerContent(
      value: (/* props */ js.UndefOr[IComboBoxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IComboBoxProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderLowerContent", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderLowerContent: Self = this.set("onRenderLowerContent", js.undefined)
    @scala.inline
    def setOnRenderUpperContent(
      value: (/* props */ js.UndefOr[IComboBoxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IComboBoxProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderUpperContent", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderUpperContent: Self = this.set("onRenderUpperContent", js.undefined)
    @scala.inline
    def setOnResolveOptions(
      value: /* options */ js.Array[IComboBoxOption] => js.Array[IComboBoxOption] | js.Thenable[js.Array[IComboBoxOption]]
    ): Self = this.set("onResolveOptions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResolveOptions: Self = this.set("onResolveOptions", js.undefined)
    @scala.inline
    def setOnScrollToItem(value: /* itemIndex */ Double => Unit): Self = this.set("onScrollToItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScrollToItem: Self = this.set("onScrollToItem", js.undefined)
    @scala.inline
    def setPersistMenu(value: Boolean): Self = this.set("persistMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistMenu: Self = this.set("persistMenu", js.undefined)
    @scala.inline
    def setScrollSelectedToTop(value: Boolean): Self = this.set("scrollSelectedToTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSelectedToTop: Self = this.set("scrollSelectedToTop", js.undefined)
    @scala.inline
    def setShouldRestoreFocus(value: Boolean): Self = this.set("shouldRestoreFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldRestoreFocus: Self = this.set("shouldRestoreFocus", js.undefined)
    @scala.inline
    def setStyles(value: PartialIComboBoxStyles): Self = this.set("styles", value.asInstanceOf[js.Any])
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
    def setUseComboBoxAsMenuWidth(value: Boolean): Self = this.set("useComboBoxAsMenuWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseComboBoxAsMenuWidth: Self = this.set("useComboBoxAsMenuWidth", js.undefined)
  }
  
}

