package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typings.officeUiFabricReact.officeUiFabricReactStrings.hue
import typings.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorSliderTypesMod {
  
  @js.native
  trait IColorSlider extends StObject {
    
    /** Current value of the slider. */
    var value: Double = js.native
  }
  object IColorSlider {
    
    @scala.inline
    def apply(value: Double): IColorSlider = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorSlider]
    }
    
    @scala.inline
    implicit class IColorSliderMutableBuilder[Self <: IColorSlider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IColorSliderProps extends StObject {
    
    /**
      * Label of the ColorSlider for the benefit of screen reader users.
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * Additional CSS class(es) to apply to the ColorSlider.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IColorSlider]] = js.native
    
    /**
      * If true, the slider represents an alpha slider and will display a gray checkered pattern
      * in the background. Otherwise, the slider represents a hue slider.
      * @defaultvalue false
      * @deprecated Use `type`
      */
    var isAlpha: js.UndefOr[Boolean] = js.native
    
    /**
      * Maximum value of the slider.
      * @deprecated Will be 100 for alpha or transparency sliders, or 359 for hue sliders.
      */
    var maxValue: js.UndefOr[Double] = js.native
    
    /**
      * Minimum value of the slider.
      * @deprecated Will always be 0
      */
    var minValue: js.UndefOr[Double] = js.native
    
    /**
      * Callback issued when the value changes.
      */
    var onChange: js.UndefOr[
        js.Function2[
          /* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], 
          /* newValue */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /**
      * Hex color to use when rendering an alpha or transparency slider's overlay, *without* the `#`.
      */
    var overlayColor: js.UndefOr[String] = js.native
    
    /**
      * Custom style for the overlay element.
      * @deprecated Use `overlayColor` instead
      */
    var overlayStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]] = js.native
    
    /**
      * Theme (provided through customization).
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * CSS-compatible string for the color of the thumb element.
      * @deprecated Not used. Use `styles.sliderThumb` instead.
      */
    var thumbColor: js.UndefOr[String] = js.native
    
    /**
      * Type of slider to display.
      * @defaultvalue 'hue'
      */
    var `type`: js.UndefOr[hue | alpha | transparency] = js.native
    
    /**
      * Current value of the slider.
      */
    var value: js.UndefOr[Double] = js.native
  }
  object IColorSliderProps {
    
    @scala.inline
    def apply(): IColorSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColorSliderProps]
    }
    
    @scala.inline
    implicit class IColorSliderPropsMutableBuilder[Self <: IColorSliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IColorSlider]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IColorSlider | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setIsAlpha(value: Boolean): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], /* newValue */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
      
      @scala.inline
      def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IColorSliderStyleProps => DeepPartial[IColorSliderStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setThumbColor(value: String): Self = StObject.set(x, "thumbColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbColorUndefined: Self = StObject.set(x, "thumbColor", js.undefined)
      
      @scala.inline
      def setType(value: hue | alpha | transparency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps, 'className' | 'type'> & {  isAlpha :boolean | undefined} */
  @js.native
  trait IColorSliderStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    /**
      * @deprecated Use `type`
      */
    var isAlpha: js.UndefOr[Boolean] = js.native
    
    var theme: ITheme = js.native
    
    var `type`: js.UndefOr[hue | alpha | transparency] = js.native
  }
  object IColorSliderStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IColorSliderStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorSliderStyleProps]
    }
    
    @scala.inline
    implicit class IColorSliderStylePropsMutableBuilder[Self <: IColorSliderStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIsAlpha(value: Boolean): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: hue | alpha | transparency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait IColorSliderStyles extends StObject {
    
    /**
      * Style set for the root element.
      */
    var root: js.UndefOr[IStyle] = js.native
    
    /**
      * Style set for the overlay element.
      */
    var sliderOverlay: js.UndefOr[IStyle] = js.native
    
    /**
      * Style set for the draggable thumb element.
      */
    var sliderThumb: js.UndefOr[IStyle] = js.native
  }
  object IColorSliderStyles {
    
    @scala.inline
    def apply(): IColorSliderStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColorSliderStyles]
    }
    
    @scala.inline
    implicit class IColorSliderStylesMutableBuilder[Self <: IColorSliderStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSliderOverlay(value: IStyle): Self = StObject.set(x, "sliderOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderOverlayNull: Self = StObject.set(x, "sliderOverlay", null)
      
      @scala.inline
      def setSliderOverlayUndefined: Self = StObject.set(x, "sliderOverlay", js.undefined)
      
      @scala.inline
      def setSliderThumb(value: IStyle): Self = StObject.set(x, "sliderThumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderThumbNull: Self = StObject.set(x, "sliderThumb", null)
      
      @scala.inline
      def setSliderThumbUndefined: Self = StObject.set(x, "sliderThumb", js.undefined)
    }
  }
}
