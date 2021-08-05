package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxStyleProps
import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxStyles
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.labelTypesMod.ILabelStyleProps
import typings.officeUiFabricReact.labelTypesMod.ILabelStyles
import typings.officeUiFabricReact.panelTypesMod.IPanelStyleProps
import typings.officeUiFabricReact.panelTypesMod.IPanelStyles
import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typings.officeUiFabricReact.selectableDroppableTextTypesMod.ISelectableDroppableTextProps
import typings.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType
import typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typings.react.mod.FormEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownTypesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Dropdown/Dropdown.types", "DropdownMenuItemType")
  @js.native
  object DropdownMenuItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SelectableOptionMenuItemType & Double] = js.native
    
    /* 1 */ val Divider: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Divider & Double = js.native
    
    /* 2 */ val Header: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Header & Double = js.native
    
    /* 0 */ val Normal: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Normal & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Dropdown/Dropdown.types", "ResponsiveMode")
  @js.native
  object ResponsiveMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode & Double] = js.native
    
    /* 2 */ val large: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.large & Double = js.native
    
    /* 1 */ val medium: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.medium & Double = js.native
    
    /* 0 */ val small: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.small & Double = js.native
    
    /* 999 */ val unknown: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.unknown & Double = js.native
    
    /* 3 */ val xLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xLarge & Double = js.native
    
    /* 4 */ val xxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxLarge & Double = js.native
    
    /* 5 */ val xxxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxxLarge & Double = js.native
  }
  
  @js.native
  trait IDropdown extends StObject {
    
    def focus(): Unit = js.native
    def focus(shouldOpenOnFocus: Boolean): Unit = js.native
    
    /**
      * All selected options
      */
    val selectedOptions: js.Array[IDropdownOption] = js.native
  }
  
  trait IDropdownOption
    extends StObject
       with ISelectableOption {
    
    /**
      * Deprecated at v.65.1, use `selected` instead.
      * @deprecated Use `selected` instead.
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
  }
  object IDropdownOption {
    
    inline def apply(key: String | Double, text: String): IDropdownOption = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDropdownOption]
    }
    
    extension [Self <: IDropdownOption](x: Self) {
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    }
  }
  
  trait IDropdownProps
    extends StObject
       with ISelectableDroppableTextProps[IDropdown, HTMLDivElement] {
    
    /**
      * Keys that will be initially used to set selected items. This prop is only used when `multiSelect`
      * is true (use `defaultSelectedKey` for single select). Mutually exclusive with `selectedKeys`.
      */
    var defaultSelectedKeys: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    /**
      * Custom width for dropdown. If value is 0, width of the input field is used.
      * @defaultvalue 0
      */
    var dropdownWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Deprecated at v0.52.0, use `disabled` instead.
      * @deprecated Use `disabled` instead.
      */
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional keytip for this dropdown
      */
    var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
    
    /**
      * When multiple items are selected, this will be used to separate values in the dropdown input.
      *
      * @defaultvalue ", "
      */
    var multiSelectDelimiter: js.UndefOr[String] = js.undefined
    
    /**
      * If true, `onChange` will still be called when an already-selected item is clicked again in
      * single select mode. (Normally it would not be called in this case.)
      */
    var notifyOnReselect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback for when the selected option changes.
      */
    @JSName("onChange")
    var onChange_IDropdownProps: js.UndefOr[
        js.Function3[
          /* event */ FormEvent[HTMLDivElement], 
          /* option */ js.UndefOr[IDropdownOption], 
          /* index */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @deprecated Use `onChange` instead.
      */
    var onChanged: js.UndefOr[js.Function2[/* option */ IDropdownOption, /* index */ js.UndefOr[Double], Unit]] = js.undefined
    
    /**
      * Custom renderer for chevron icon
      */
    var onRenderCaretDown: js.UndefOr[IRenderFunction[IDropdownProps]] = js.undefined
    
    /**
      * Custom renderer for the label.
      */
    var onRenderLabel: js.UndefOr[IRenderFunction[IDropdownProps]] = js.undefined
    
    /**
      * Custom renderer for placeholder text
      * @deprecated Use `onRenderPlaceholder`
      */
    var onRenderPlaceHolder: js.UndefOr[IRenderFunction[IDropdownProps]] = js.undefined
    
    /**
      * Custom renderer for placeholder text
      */
    var onRenderPlaceholder: js.UndefOr[IRenderFunction[IDropdownProps]] = js.undefined
    
    /**
      * Custom renderer for selected option displayed in input
      */
    var onRenderTitle: js.UndefOr[IRenderFunction[js.Array[IDropdownOption]]] = js.undefined
    
    /**
      * Options for the dropdown. If using `defaultSelectedKey` or `defaultSelectedKeys`, options must be
      * pure for correct behavior.
      */
    @JSName("options")
    var options_IDropdownProps: js.Array[IDropdownOption]
    
    /**
      * Input placeholder text. Displayed until an option is selected.
      * @deprecated Use `placeholder`
      */
    var placeHolder: js.UndefOr[String] = js.undefined
    
    /**
      * By default, the dropdown will render the standard way for screen sizes `large` and above, or
      * in a panel on `small` and `medium` screens. Manually set this prop to override this behavior.
      */
    var responsiveMode: js.UndefOr[ResponsiveMode] = js.undefined
    
    /**
      * Keys of the selected items, only used when `multiSelect` is true (use `selectedKey` for single
      * select). If you provide this, you must maintain selection state by observing onChange events
      * and passing a new prop value in when changed. Passing null will clear the selection.
      * Mutually exclusive with `defaultSelectedKeys`.
      */
    var selectedKeys: js.UndefOr[(js.Array[Double | String]) | Null] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDropdownStyleProps, IDropdownStyles]] = js.undefined
    
    /**
      * Theme provided by higher order component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IDropdownProps {
    
    inline def apply(options: js.Array[IDropdownOption]): IDropdownProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDropdownProps]
    }
    
    extension [Self <: IDropdownProps](x: Self) {
      
      inline def setDefaultSelectedKeys(value: js.Array[Double | String]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
      
      inline def setDefaultSelectedKeysVarargs(value: (Double | String)*): Self = StObject.set(x, "defaultSelectedKeys", js.Array(value :_*))
      
      inline def setDropdownWidth(value: Double): Self = StObject.set(x, "dropdownWidth", value.asInstanceOf[js.Any])
      
      inline def setDropdownWidthUndefined: Self = StObject.set(x, "dropdownWidth", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setKeytipProps(value: IKeytipProps): Self = StObject.set(x, "keytipProps", value.asInstanceOf[js.Any])
      
      inline def setKeytipPropsUndefined: Self = StObject.set(x, "keytipProps", js.undefined)
      
      inline def setMultiSelectDelimiter(value: String): Self = StObject.set(x, "multiSelectDelimiter", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectDelimiterUndefined: Self = StObject.set(x, "multiSelectDelimiter", js.undefined)
      
      inline def setNotifyOnReselect(value: Boolean): Self = StObject.set(x, "notifyOnReselect", value.asInstanceOf[js.Any])
      
      inline def setNotifyOnReselectUndefined: Self = StObject.set(x, "notifyOnReselect", js.undefined)
      
      inline def setOnChange(
        value: (/* event */ FormEvent[HTMLDivElement], /* option */ js.UndefOr[IDropdownOption], /* index */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnChanged(value: (/* option */ IDropdownOption, /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onChanged", js.Any.fromFunction2(value))
      
      inline def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
      
      inline def setOnRenderCaretDown(
        value: (/* props */ js.UndefOr[IDropdownProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDropdownProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderCaretDown", js.Any.fromFunction2(value))
      
      inline def setOnRenderCaretDownUndefined: Self = StObject.set(x, "onRenderCaretDown", js.undefined)
      
      inline def setOnRenderLabel(
        value: (/* props */ js.UndefOr[IDropdownProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDropdownProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderLabel", js.Any.fromFunction2(value))
      
      inline def setOnRenderLabelUndefined: Self = StObject.set(x, "onRenderLabel", js.undefined)
      
      inline def setOnRenderPlaceHolder(
        value: (/* props */ js.UndefOr[IDropdownProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDropdownProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderPlaceHolder", js.Any.fromFunction2(value))
      
      inline def setOnRenderPlaceHolderUndefined: Self = StObject.set(x, "onRenderPlaceHolder", js.undefined)
      
      inline def setOnRenderTitle(
        value: (/* props */ js.UndefOr[js.Array[IDropdownOption]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Array[IDropdownOption]], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderTitle", js.Any.fromFunction2(value))
      
      inline def setOnRenderTitleUndefined: Self = StObject.set(x, "onRenderTitle", js.undefined)
      
      inline def setOptions(value: js.Array[IDropdownOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: IDropdownOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
      
      inline def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
      
      inline def setResponsiveMode(value: ResponsiveMode): Self = StObject.set(x, "responsiveMode", value.asInstanceOf[js.Any])
      
      inline def setResponsiveModeUndefined: Self = StObject.set(x, "responsiveMode", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[Double | String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysNull: Self = StObject.set(x, "selectedKeys", null)
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: (Double | String)*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      inline def setStyles(value: IStyleFunctionOrObject[IDropdownStyleProps, IDropdownStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDropdownStyleProps => DeepPartial[IDropdownStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Dropdown/Dropdown.types.IDropdownProps, 'theme' | 'className' | 'disabled' | 'required'> & {  hasError :boolean,   hasLabel :boolean,   isOpen :boolean,   isRenderingPlaceholder :boolean,   panelClassName :string | undefined,   calloutClassName :string | undefined,   calloutRenderEdge :office-ui-fabric-react.office-ui-fabric-react/lib/utilities/positioning.RectangleEdge | undefined} */
  trait IDropdownStyleProps extends StObject {
    
    /**
      * Custom className for the callout that displays in larger viewports, hosting the Dropdown options.
      * This is primarily provided for backwards compatibility.
      */
    var calloutClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Which edge the dropdown callout was positioned on relative to the title.
      */
    var calloutRenderEdge: js.UndefOr[RectangleEdge] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the dropdown is in an error state.
      */
    var hasError: Boolean
    
    /**
      * Specifies if the dropdown has label content.
      */
    var hasLabel: Boolean
    
    /**
      * Whether the dropdown is in an opened state.
      */
    var isOpen: Boolean
    
    /**
      * Whether the dropdown is currently rendering placeholder text instead of a selected option.
      */
    var isRenderingPlaceholder: Boolean
    
    /**
      * Custom className for the panel that displays in small viewports, hosting the Dropdown options.
      * This is primarily provided for backwards compatibility.
      */
    var panelClassName: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IDropdownStyleProps {
    
    inline def apply(hasError: Boolean, hasLabel: Boolean, isOpen: Boolean, isRenderingPlaceholder: Boolean): IDropdownStyleProps = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], hasLabel = hasLabel.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isRenderingPlaceholder = isRenderingPlaceholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDropdownStyleProps]
    }
    
    extension [Self <: IDropdownStyleProps](x: Self) {
      
      inline def setCalloutClassName(value: String): Self = StObject.set(x, "calloutClassName", value.asInstanceOf[js.Any])
      
      inline def setCalloutClassNameUndefined: Self = StObject.set(x, "calloutClassName", js.undefined)
      
      inline def setCalloutRenderEdge(value: RectangleEdge): Self = StObject.set(x, "calloutRenderEdge", value.asInstanceOf[js.Any])
      
      inline def setCalloutRenderEdgeUndefined: Self = StObject.set(x, "calloutRenderEdge", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setHasLabel(value: Boolean): Self = StObject.set(x, "hasLabel", value.asInstanceOf[js.Any])
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsRenderingPlaceholder(value: Boolean): Self = StObject.set(x, "isRenderingPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setPanelClassName(value: String): Self = StObject.set(x, "panelClassName", value.asInstanceOf[js.Any])
      
      inline def setPanelClassNameUndefined: Self = StObject.set(x, "panelClassName", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IDropdownStyles extends StObject {
    
    /** Refers to the callout that hosts Dropdown options in larger viewports. */
    var callout: IStyle
    
    /** Refers to the downward pointing caret icon users click on to expand the Dropdown. */
    var caretDown: IStyle
    
    /** Refers to the wrapping container around the downward pointing caret users click on to expand the Dropdown. */
    var caretDownWrapper: IStyle
    
    /** Refers to the actual Dropdown element. */
    var dropdown: IStyle
    
    /** Refers to the dropdown separator. */
    var dropdownDivider: IStyle
    
    /** Refers to the individual dropdown item. */
    var dropdownItem: IStyle
    
    /** Style for a dropdown item when it is disabled. */
    var dropdownItemDisabled: IStyle
    
    /** Refers to the individual dropdown items that are being rendered as a header. */
    var dropdownItemHeader: IStyle
    
    /** Style for a dropdown item when it is hidden */
    var dropdownItemHidden: IStyle
    
    /** Style for a dropdown item when it is being selected. */
    var dropdownItemSelected: IStyle
    
    /** Style for a dropdown item when it is both selected and disabled. */
    var dropdownItemSelectedAndDisabled: IStyle
    
    /** Refers to the FocusZone wrapping the individual dropdown items. */
    var dropdownItems: IStyle
    
    /** Refers to the element that wraps `dropdownItems`. */
    var dropdownItemsWrapper: IStyle
    
    /**
      * Refers to the text element that renders the actual dropdown item/option text. This would be wrapped by the element
      * referred to by `dropdownItem`.
      */
    var dropdownOptionText: IStyle
    
    /** Refers to the error message being rendered under the Dropdown (if any). */
    var errorMessage: IStyle
    
    /** Refers to the label associated with the dropdown. This is enclosed by the root. */
    var label: IStyle
    
    /**
      * Refers to the panel that hosts the Dropdown options in small viewports.
      * @deprecated Use `subComponentStyles.panel` instead.
      */
    var panel: IStyle
    
    /** Root element of the Dropdown (includes Label and the actual Dropdown). */
    var root: IStyle
    
    /** Subcomponent styles. */
    var subComponentStyles: IDropdownSubComponentStyles
    
    /** Refers to the primary title of the Dropdown (rendering the selected options/placeholder/etc.). */
    var title: IStyle
  }
  object IDropdownStyles {
    
    inline def apply(subComponentStyles: IDropdownSubComponentStyles): IDropdownStyles = {
      val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDropdownStyles]
    }
    
    extension [Self <: IDropdownStyles](x: Self) {
      
      inline def setCallout(value: IStyle): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
      
      inline def setCalloutNull: Self = StObject.set(x, "callout", null)
      
      inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
      
      inline def setCaretDown(value: IStyle): Self = StObject.set(x, "caretDown", value.asInstanceOf[js.Any])
      
      inline def setCaretDownNull: Self = StObject.set(x, "caretDown", null)
      
      inline def setCaretDownUndefined: Self = StObject.set(x, "caretDown", js.undefined)
      
      inline def setCaretDownWrapper(value: IStyle): Self = StObject.set(x, "caretDownWrapper", value.asInstanceOf[js.Any])
      
      inline def setCaretDownWrapperNull: Self = StObject.set(x, "caretDownWrapper", null)
      
      inline def setCaretDownWrapperUndefined: Self = StObject.set(x, "caretDownWrapper", js.undefined)
      
      inline def setDropdown(value: IStyle): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
      
      inline def setDropdownDivider(value: IStyle): Self = StObject.set(x, "dropdownDivider", value.asInstanceOf[js.Any])
      
      inline def setDropdownDividerNull: Self = StObject.set(x, "dropdownDivider", null)
      
      inline def setDropdownDividerUndefined: Self = StObject.set(x, "dropdownDivider", js.undefined)
      
      inline def setDropdownItem(value: IStyle): Self = StObject.set(x, "dropdownItem", value.asInstanceOf[js.Any])
      
      inline def setDropdownItemDisabled(value: IStyle): Self = StObject.set(x, "dropdownItemDisabled", value.asInstanceOf[js.Any])
      
      inline def setDropdownItemDisabledNull: Self = StObject.set(x, "dropdownItemDisabled", null)
      
      inline def setDropdownItemDisabledUndefined: Self = StObject.set(x, "dropdownItemDisabled", js.undefined)
      
      inline def setDropdownItemHeader(value: IStyle): Self = StObject.set(x, "dropdownItemHeader", value.asInstanceOf[js.Any])
      
      inline def setDropdownItemHeaderNull: Self = StObject.set(x, "dropdownItemHeader", null)
      
      inline def setDropdownItemHeaderUndefined: Self = StObject.set(x, "dropdownItemHeader", js.undefined)
      
      inline def setDropdownItemHidden(value: IStyle): Self = StObject.set(x, "dropdownItemHidden", value.asInstanceOf[js.Any])
      
      inline def setDropdownItemHiddenNull: Self = StObject.set(x, "dropdownItemHidden", null)
      
      inline def setDropdownItemHiddenUndefined: Self = StObject.set(x, "dropdownItemHidden", js.undefined)
      
      inline def setDropdownItemNull: Self = StObject.set(x, "dropdownItem", null)
      
      inline def setDropdownItemSelected(value: IStyle): Self = StObject.set(x, "dropdownItemSelected", value.asInstanceOf[js.Any])
      
      inline def setDropdownItemSelectedAndDisabled(value: IStyle): Self = StObject.set(x, "dropdownItemSelectedAndDisabled", value.asInstanceOf[js.Any])
      
      inline def setDropdownItemSelectedAndDisabledNull: Self = StObject.set(x, "dropdownItemSelectedAndDisabled", null)
      
      inline def setDropdownItemSelectedAndDisabledUndefined: Self = StObject.set(x, "dropdownItemSelectedAndDisabled", js.undefined)
      
      inline def setDropdownItemSelectedNull: Self = StObject.set(x, "dropdownItemSelected", null)
      
      inline def setDropdownItemSelectedUndefined: Self = StObject.set(x, "dropdownItemSelected", js.undefined)
      
      inline def setDropdownItemUndefined: Self = StObject.set(x, "dropdownItem", js.undefined)
      
      inline def setDropdownItems(value: IStyle): Self = StObject.set(x, "dropdownItems", value.asInstanceOf[js.Any])
      
      inline def setDropdownItemsNull: Self = StObject.set(x, "dropdownItems", null)
      
      inline def setDropdownItemsUndefined: Self = StObject.set(x, "dropdownItems", js.undefined)
      
      inline def setDropdownItemsWrapper(value: IStyle): Self = StObject.set(x, "dropdownItemsWrapper", value.asInstanceOf[js.Any])
      
      inline def setDropdownItemsWrapperNull: Self = StObject.set(x, "dropdownItemsWrapper", null)
      
      inline def setDropdownItemsWrapperUndefined: Self = StObject.set(x, "dropdownItemsWrapper", js.undefined)
      
      inline def setDropdownNull: Self = StObject.set(x, "dropdown", null)
      
      inline def setDropdownOptionText(value: IStyle): Self = StObject.set(x, "dropdownOptionText", value.asInstanceOf[js.Any])
      
      inline def setDropdownOptionTextNull: Self = StObject.set(x, "dropdownOptionText", null)
      
      inline def setDropdownOptionTextUndefined: Self = StObject.set(x, "dropdownOptionText", js.undefined)
      
      inline def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
      
      inline def setErrorMessage(value: IStyle): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setLabel(value: IStyle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPanel(value: IStyle): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      inline def setPanelNull: Self = StObject.set(x, "panel", null)
      
      inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSubComponentStyles(value: IDropdownSubComponentStyles): Self = StObject.set(x, "subComponentStyles", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: IStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait IDropdownSubComponentStyles extends StObject {
    
    /** Refers to the primary label for the Dropdown. */
    var label: IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles]
    
    /** Refers to the individual dropdown item when the multiSelect prop is true. */
    var multiSelectItem: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]
    
    /** Refers to the panel that hosts the Dropdown options in small viewports. */
    var panel: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]
  }
  object IDropdownSubComponentStyles {
    
    inline def apply(
      label: IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles],
      multiSelectItem: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles],
      panel: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]
    ): IDropdownSubComponentStyles = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], multiSelectItem = multiSelectItem.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDropdownSubComponentStyles]
    }
    
    extension [Self <: IDropdownSubComponentStyles](x: Self) {
      
      inline def setLabel(value: IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: ILabelStyleProps => DeepPartial[ILabelStyles]): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setMultiSelectItem(value: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]): Self = StObject.set(x, "multiSelectItem", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectItemFunction1(value: ICheckboxStyleProps => DeepPartial[ICheckboxStyles]): Self = StObject.set(x, "multiSelectItem", js.Any.fromFunction1(value))
      
      inline def setPanel(value: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      inline def setPanelFunction1(value: IPanelStyleProps => DeepPartial[IPanelStyles]): Self = StObject.set(x, "panel", js.Any.fromFunction1(value))
    }
  }
}
