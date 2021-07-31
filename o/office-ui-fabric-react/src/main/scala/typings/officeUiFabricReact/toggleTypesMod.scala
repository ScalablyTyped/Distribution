package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.checkbox
import typings.officeUiFabricReact.officeUiFabricReactStrings.menuitemcheckbox
import typings.officeUiFabricReact.officeUiFabricReactStrings.switch
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.icomponentasMod.IComponentAs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleTypesMod {
  
  trait IToggle extends StObject {
    
    def focus(): Unit
  }
  object IToggle {
    
    @scala.inline
    def apply(focus: () => Unit): IToggle = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[IToggle]
    }
    
    @scala.inline
    implicit class IToggleMutableBuilder[Self <: IToggle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  trait IToggleProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    /**
      * Text for screen-reader to announce as the name of the toggle.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Render the root element as another type.
      */
    var as: js.UndefOr[IComponentAs[HTMLAttributes[HTMLElement]]] = js.undefined
    
    /**
      * Checked state of the toggle. If you are maintaining state yourself, use this property.
      * Otherwise use `defaultChecked`.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional callback to access the IToggle interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IToggle]] = js.undefined
    
    /**
      * Optional disabled flag.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the label (not the onText/offText) should be positioned inline with the toggle control.
      * Left (right in RTL) side when on/off text provided VS right (left in RTL) side when no on/off text.
      * Caution: when not providing on/off text user may get confused in differentiating the on/off states of the toggle.
      */
    var inlineLabel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional keytip for this toggle
      */
    var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
    
    /**
      * A label for the toggle.
      */
    var label: js.UndefOr[String | Element] = js.undefined
    
    /**
      * @deprecated Use `ariaLabel` for name, and let the metadata convey state
      */
    var offAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Text to display when toggle is OFF.
      * Caution: when not providing on/off text user may get confused in differentiating the on/off states of the toggle.
      */
    var offText: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated Use `ariaLabel` for name, and let the metadata convey state
      */
    var onAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Callback issued when the value changes.
      */
    @JSName("onChange")
    var onChange_IToggleProps: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
          /* checked */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @deprecated Use `onChange` instead.
      */
    var onChanged: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
    
    /**
      * Text to display when toggle is ON.
      * Caution: when not providing on/off text user may get confused in differentiating the on/off states of the toggle.
      */
    var onText: js.UndefOr[String] = js.undefined
    
    /**
      * (Optional) Specify whether to use the "switch" role (ARIA 1.1) or the checkbox role (ARIA 1.0).
      * If unspecified, defaults to "switch".
      */
    @JSName("role")
    var role_IToggleProps: js.UndefOr[checkbox | switch | menuitemcheckbox] = js.undefined
    
    /**
      * Optional styles for the component.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IToggleStyleProps, IToggleStyles]] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IToggleProps {
    
    @scala.inline
    def apply(): IToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IToggleProps]
    }
    
    @scala.inline
    implicit class ITogglePropsMutableBuilder[Self <: IToggleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setAs(value: IComponentAs[HTMLAttributes[HTMLElement]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IToggle]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IToggle | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInlineLabel(value: Boolean): Self = StObject.set(x, "inlineLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineLabelUndefined: Self = StObject.set(x, "inlineLabel", js.undefined)
      
      @scala.inline
      def setKeytipProps(value: IKeytipProps): Self = StObject.set(x, "keytipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeytipPropsUndefined: Self = StObject.set(x, "keytipProps", js.undefined)
      
      @scala.inline
      def setLabel(value: String | Element): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOffAriaLabel(value: String): Self = StObject.set(x, "offAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffAriaLabelUndefined: Self = StObject.set(x, "offAriaLabel", js.undefined)
      
      @scala.inline
      def setOffText(value: String): Self = StObject.set(x, "offText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffTextUndefined: Self = StObject.set(x, "offText", js.undefined)
      
      @scala.inline
      def setOnAriaLabel(value: String): Self = StObject.set(x, "onAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAriaLabelUndefined: Self = StObject.set(x, "onAriaLabel", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* checked */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnChanged(value: /* checked */ Boolean => Unit): Self = StObject.set(x, "onChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
      
      @scala.inline
      def setOnText(value: String): Self = StObject.set(x, "onText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTextUndefined: Self = StObject.set(x, "onText", js.undefined)
      
      @scala.inline
      def setRole(value: checkbox | switch | menuitemcheckbox): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IToggleStyleProps, IToggleStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IToggleStyleProps => DeepPartial[IToggleStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IToggleStyleProps extends StObject {
    
    /**
      * Component is checked.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Root element class name.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Component is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether label should be positioned inline with the toggle.
      */
    var inlineLabel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the user did not specify a on/off text. Influencing only when inlineLabel is used.
      */
    var onOffMissing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Theme values.
      */
    var theme: ITheme
  }
  object IToggleStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IToggleStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToggleStyleProps]
    }
    
    @scala.inline
    implicit class IToggleStylePropsMutableBuilder[Self <: IToggleStyleProps] (val x: Self) extends AnyVal {
      
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
      def setInlineLabel(value: Boolean): Self = StObject.set(x, "inlineLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineLabelUndefined: Self = StObject.set(x, "inlineLabel", js.undefined)
      
      @scala.inline
      def setOnOffMissing(value: Boolean): Self = StObject.set(x, "onOffMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOffMissingUndefined: Self = StObject.set(x, "onOffMissing", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IToggleStyles extends StObject {
    
    /**
      * Container for the toggle pill and the text next to it.
      */
    var container: IStyle
    
    /**
      * Label element above the toggle.
      */
    var label: IStyle
    
    /**
      * Pill, rendered as a button.
      */
    var pill: IStyle
    
    /** Root element. */
    var root: IStyle
    
    /**
      * Text next to the pill.
      */
    var text: IStyle
    
    /**
      * Thumb inside of the pill.
      */
    var thumb: IStyle
  }
  object IToggleStyles {
    
    @scala.inline
    def apply(): IToggleStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IToggleStyles]
    }
    
    @scala.inline
    implicit class IToggleStylesMutableBuilder[Self <: IToggleStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: IStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setLabel(value: IStyle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelNull: Self = StObject.set(x, "label", null)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setPill(value: IStyle): Self = StObject.set(x, "pill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPillNull: Self = StObject.set(x, "pill", null)
      
      @scala.inline
      def setPillUndefined: Self = StObject.set(x, "pill", js.undefined)
      
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
      
      @scala.inline
      def setThumb(value: IStyle): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbNull: Self = StObject.set(x, "thumb", null)
      
      @scala.inline
      def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    }
  }
}
