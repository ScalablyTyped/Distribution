package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.anon.PickIIconPropsExcludekeyo
import typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonProps
import typings.react.mod.ChangeEvent
import typings.react.mod.InputHTMLAttributes
import typings.std.HTMLInputElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSearchBoxSearchBoxDottypesMod {
  
  trait ISearchBox extends StObject {
    
    /**
      * Sets focus inside the search input box.
      */
    def focus(): Unit
    
    /**
      * Returns whether or not the SearchBox has focus
      */
    def hasFocus(): Boolean
  }
  object ISearchBox {
    
    inline def apply(focus: () => Unit, hasFocus: () => Boolean): ISearchBox = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), hasFocus = js.Any.fromFunction0(hasFocus))
      __obj.asInstanceOf[ISearchBox]
    }
    
    extension [Self <: ISearchBox](x: Self) {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setHasFocus(value: () => Boolean): Self = StObject.set(x, "hasFocus", js.Any.fromFunction0(value))
    }
  }
  
  trait ISearchBoxProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    /**
      * The aria label of the SearchBox for the benefit of screen readers.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * The props for the clear button.
      */
    var clearButtonProps: js.UndefOr[IButtonProps] = js.undefined
    
    /**
      * Optional callback to access the ISearchBox interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ISearchBox]] = js.undefined
    
    /**
      * The default value of the text in the SearchBox, in the case of an uncontrolled component.
      * This prop is being deprecated since so far, uncontrolled behavior has not been implemented.
      * @deprecated Not implemented.
      */
    @JSName("defaultValue")
    var defaultValue_ISearchBoxProps: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not to animate the SearchBox icon on focus.
      * @defaultvalue false
      */
    var disableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The props for the icon.
      */
    var iconProps: js.UndefOr[PickIIconPropsExcludekeyo] = js.undefined
    
    /**
      * Deprecated. Use `placeholder` instead.
      * @deprecated Use `placeholder` instead.
      */
    var labelText: js.UndefOr[String] = js.undefined
    
    /**
      * Callback function for when the typed input for the SearchBox has changed.
      */
    @JSName("onChange")
    var onChange_ISearchBoxProps: js.UndefOr[
        js.Function2[
          /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Deprecated at v0.52.2, use `onChange` instead.
      * @deprecated Use `onChange` instead.
      */
    var onChanged: js.UndefOr[js.Function1[/* newValue */ Any, Unit]] = js.undefined
    
    /**
      * Callback executed when the user clears the search box by either clicking 'X' or hitting escape.
      */
    var onClear: js.UndefOr[js.Function1[/* ev */ js.UndefOr[Any], Unit]] = js.undefined
    
    /**
      * Callback executed when the user presses escape in the search box.
      */
    var onEscape: js.UndefOr[js.Function1[/* ev */ js.UndefOr[Any], Unit]] = js.undefined
    
    /**
      * Callback executed when the user presses enter in the search box.
      */
    var onSearch: js.UndefOr[js.Function1[/* newValue */ Any, Unit]] = js.undefined
    
    /**
      * The role assigned to the root DIV element of the SearchBox, useful for defining a landmark role, such as "search".
      */
    @JSName("role")
    var role_ISearchBoxProps: js.UndefOr[String] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ISearchBoxStyleProps, ISearchBoxStyles]] = js.undefined
    
    /**
      * Theme (provided through customization).
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Whether or not the SearchBox is underlined.
      * @defaultvalue false
      */
    var underlined: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The value of the text in the SearchBox.
      */
    @JSName("value")
    var value_ISearchBoxProps: js.UndefOr[String] = js.undefined
  }
  object ISearchBoxProps {
    
    inline def apply(): ISearchBoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISearchBoxProps]
    }
    
    extension [Self <: ISearchBoxProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setClearButtonProps(value: IButtonProps): Self = StObject.set(x, "clearButtonProps", value.asInstanceOf[js.Any])
      
      inline def setClearButtonPropsUndefined: Self = StObject.set(x, "clearButtonProps", js.undefined)
      
      inline def setComponentRef(value: IRefObject[ISearchBox]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ ISearchBox | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
      
      inline def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
      
      inline def setIconProps(value: PickIIconPropsExcludekeyo): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      inline def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      inline def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      inline def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
      
      inline def setOnChange(
        value: (/* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], /* newValue */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnChanged(value: /* newValue */ Any => Unit): Self = StObject.set(x, "onChanged", js.Any.fromFunction1(value))
      
      inline def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
      
      inline def setOnClear(value: /* ev */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnEscape(value: /* ev */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onEscape", js.Any.fromFunction1(value))
      
      inline def setOnEscapeUndefined: Self = StObject.set(x, "onEscape", js.undefined)
      
      inline def setOnSearch(value: /* newValue */ Any => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[ISearchBoxStyleProps, ISearchBoxStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: ISearchBoxStyleProps => DeepPartial[ISearchBoxStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUnderlined(value: Boolean): Self = StObject.set(x, "underlined", value.asInstanceOf[js.Any])
      
      inline def setUnderlinedUndefined: Self = StObject.set(x, "underlined", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ISearchBoxStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableAnimation: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hasFocus: js.UndefOr[Boolean] = js.undefined
    
    var hasInput: js.UndefOr[Boolean] = js.undefined
    
    var theme: ITheme
    
    var underlined: js.UndefOr[Boolean] = js.undefined
  }
  object ISearchBoxStyleProps {
    
    inline def apply(theme: ITheme): ISearchBoxStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISearchBoxStyleProps]
    }
    
    extension [Self <: ISearchBoxStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
      
      inline def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      inline def setHasFocusUndefined: Self = StObject.set(x, "hasFocus", js.undefined)
      
      inline def setHasInput(value: Boolean): Self = StObject.set(x, "hasInput", value.asInstanceOf[js.Any])
      
      inline def setHasInputUndefined: Self = StObject.set(x, "hasInput", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setUnderlined(value: Boolean): Self = StObject.set(x, "underlined", value.asInstanceOf[js.Any])
      
      inline def setUnderlinedUndefined: Self = StObject.set(x, "underlined", js.undefined)
    }
  }
  
  trait ISearchBoxStyles extends StObject {
    
    var clearButton: js.UndefOr[IStyle] = js.undefined
    
    var field: js.UndefOr[IStyle] = js.undefined
    
    var icon: js.UndefOr[IStyle] = js.undefined
    
    var iconContainer: js.UndefOr[IStyle] = js.undefined
    
    var root: js.UndefOr[IStyle] = js.undefined
  }
  object ISearchBoxStyles {
    
    inline def apply(): ISearchBoxStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISearchBoxStyles]
    }
    
    extension [Self <: ISearchBoxStyles](x: Self) {
      
      inline def setClearButton(value: IStyle): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
      
      inline def setClearButtonNull: Self = StObject.set(x, "clearButton", null)
      
      inline def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
      
      inline def setField(value: IStyle): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldNull: Self = StObject.set(x, "field", null)
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setIcon(value: IStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconContainer(value: IStyle): Self = StObject.set(x, "iconContainer", value.asInstanceOf[js.Any])
      
      inline def setIconContainerNull: Self = StObject.set(x, "iconContainer", null)
      
      inline def setIconContainerUndefined: Self = StObject.set(x, "iconContainer", js.undefined)
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
