package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.end
import typings.officeUiFabricReact.officeUiFabricReactStrings.start
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.FormEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxTypesMod {
  
  @js.native
  trait ICheckbox extends StObject {
    
    /** Gets the current checked state. */
    var checked: Boolean = js.native
    
    /** Sets focus to the checkbox. */
    def focus(): Unit = js.native
    
    /** Gets the current indeterminate state. */
    var indeterminate: Boolean = js.native
  }
  object ICheckbox {
    
    @scala.inline
    def apply(checked: Boolean, focus: () => Unit, indeterminate: Boolean): ICheckbox = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), indeterminate = indeterminate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICheckbox]
    }
    
    @scala.inline
    implicit class ICheckboxMutableBuilder[Self <: ICheckbox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICheckboxProps extends ButtonHTMLAttributes[HTMLElement | HTMLInputElement] {
    
    /**
      * ID for element that provides extended information for the checkbox.
      */
    var ariaDescribedBy: js.UndefOr[String] = js.native
    
    /**
      * Accessible label for the checkbox.
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * ID for element that contains label information for the checkbox.
      */
    var ariaLabelledBy: js.UndefOr[String] = js.native
    
    /**
      * The position in the parent set (if in a set) for aria-posinset.
      */
    var ariaPositionInSet: js.UndefOr[Double] = js.native
    
    /**
      * The total size of the parent set (if in a set) for aria-setsize.
      */
    var ariaSetSize: js.UndefOr[Double] = js.native
    
    /**
      * Allows you to set the checkbox to be at the before (start) or after (end) the label.
      * @defaultvalue 'start'
      */
    var boxSide: js.UndefOr[start | end] = js.native
    
    /**
      * Checked state. Mutually exclusive to "defaultChecked". Use this if you control the checked state at a higher
      * level and plan to pass in the correct value based on handling onChange events and re-rendering.
      */
    var checked: js.UndefOr[Boolean] = js.native
    
    /**
      * Custom icon props for the check mark rendered by the checkbox
      */
    var checkmarkIconProps: js.UndefOr[IIconProps] = js.native
    
    /**
      * Optional callback to access the ICheckbox interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ICheckbox]] = js.native
    
    /**
      * Optional uncontrolled indeterminate visual state for checkbox. Setting indeterminate state takes visual precedence
      * over checked or defaultChecked props given but does not affect checked state.
      * This is not a toggleable state. On load the checkbox will receive indeterminate visual state
      * and after the user's first click it will be removed exposing the true state of the checkbox.
      */
    var defaultIndeterminate: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional controlled indeterminate visual state for checkbox. Setting indeterminate state takes visual precedence
      * over checked or defaultChecked props given but does not affect checked state.
      * This should not be a toggleable state. On load the checkbox will receive indeterminate visual state
      * and after the first user click it should be removed by your supplied onChange callback
      * function exposing the true state of the checkbox.
      */
    var indeterminate: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional input props that will be mixed into the input element, *before* other props are applied. This allows
      * you to extend the input element with additional attributes, such as data-automation-id needed for automation.
      * Note that if you provide, for example, "disabled" as well as "inputProps.disabled", the former will take
      * precedence over the later.
      */
    var inputProps: js.UndefOr[ButtonHTMLAttributes[HTMLElement | HTMLButtonElement]] = js.native
    
    /**
      * Optional keytip for this checkbox
      */
    var keytipProps: js.UndefOr[IKeytipProps] = js.native
    
    /**
      * Label to display next to the checkbox.
      */
    var label: js.UndefOr[String] = js.native
    
    /**
      * Callback that is called when the checked value has changed.
      */
    @JSName("onChange")
    var onChange_ICheckboxProps: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], 
          /* checked */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.native
    
    /**
      * Custom render function for the label.
      */
    var onRenderLabel: js.UndefOr[IRenderFunction[ICheckboxProps]] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object ICheckboxProps {
    
    @scala.inline
    def apply(): ICheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckboxProps]
    }
    
    @scala.inline
    implicit class ICheckboxPropsMutableBuilder[Self <: ICheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setAriaPositionInSet(value: Double): Self = StObject.set(x, "ariaPositionInSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaPositionInSetUndefined: Self = StObject.set(x, "ariaPositionInSet", js.undefined)
      
      @scala.inline
      def setAriaSetSize(value: Double): Self = StObject.set(x, "ariaSetSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaSetSizeUndefined: Self = StObject.set(x, "ariaSetSize", js.undefined)
      
      @scala.inline
      def setBoxSide(value: start | end): Self = StObject.set(x, "boxSide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxSideUndefined: Self = StObject.set(x, "boxSide", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setCheckmarkIconProps(value: IIconProps): Self = StObject.set(x, "checkmarkIconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckmarkIconPropsUndefined: Self = StObject.set(x, "checkmarkIconProps", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[ICheckbox]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ICheckbox | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDefaultIndeterminate(value: Boolean): Self = StObject.set(x, "defaultIndeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIndeterminateUndefined: Self = StObject.set(x, "defaultIndeterminate", js.undefined)
      
      @scala.inline
      def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      @scala.inline
      def setInputProps(value: ButtonHTMLAttributes[HTMLElement | HTMLButtonElement]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setKeytipProps(value: IKeytipProps): Self = StObject.set(x, "keytipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeytipPropsUndefined: Self = StObject.set(x, "keytipProps", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* ev */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], /* checked */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnRenderLabel(
        value: (/* props */ js.UndefOr[ICheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ICheckboxProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderLabel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderLabelUndefined: Self = StObject.set(x, "onRenderLabel", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ICheckboxStyleProps => DeepPartial[ICheckboxStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait ICheckboxStyleProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var indeterminate: js.UndefOr[Boolean] = js.native
    
    var isUsingCustomLabelRender: Boolean = js.native
    
    var reversed: js.UndefOr[Boolean] = js.native
    
    var theme: ITheme = js.native
  }
  object ICheckboxStyleProps {
    
    @scala.inline
    def apply(isUsingCustomLabelRender: Boolean, theme: ITheme): ICheckboxStyleProps = {
      val __obj = js.Dynamic.literal(isUsingCustomLabelRender = isUsingCustomLabelRender.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICheckboxStyleProps]
    }
    
    @scala.inline
    implicit class ICheckboxStylePropsMutableBuilder[Self <: ICheckboxStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      @scala.inline
      def setIsUsingCustomLabelRender(value: Boolean): Self = StObject.set(x, "isUsingCustomLabelRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICheckboxStyles extends StObject {
    
    /**
      * Style for checkbox in its default unchecked/enabled state.
      */
    var checkbox: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the checkmark in the default enabled/unchecked state.
      */
    var checkmark: js.UndefOr[IStyle] = js.native
    
    /**
      * INTERNAL: This is mostly an internal implementation detail which you should avoid styling.
      * This refers to the <input type="checkbox"> element that is typically hidden and not rendered on screen.
      */
    var input: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the label part (contains the customized checkbox + text) when enabled.
      */
    var label: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the root element (a button) of the checkbox component in the default enabled/unchecked state.
      */
    var root: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for text appearing with the checkbox in its default enabled state.
      */
    var text: js.UndefOr[IStyle] = js.native
  }
  object ICheckboxStyles {
    
    @scala.inline
    def apply(): ICheckboxStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckboxStyles]
    }
    
    @scala.inline
    implicit class ICheckboxStylesMutableBuilder[Self <: ICheckboxStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckbox(value: IStyle): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxNull: Self = StObject.set(x, "checkbox", null)
      
      @scala.inline
      def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
      
      @scala.inline
      def setCheckmark(value: IStyle): Self = StObject.set(x, "checkmark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckmarkNull: Self = StObject.set(x, "checkmark", null)
      
      @scala.inline
      def setCheckmarkUndefined: Self = StObject.set(x, "checkmark", js.undefined)
      
      @scala.inline
      def setInput(value: IStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNull: Self = StObject.set(x, "input", null)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setLabel(value: IStyle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelNull: Self = StObject.set(x, "label", null)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setText(value: IStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextNull: Self = StObject.set(x, "text", null)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
