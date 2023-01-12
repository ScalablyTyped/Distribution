package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typings.officeUiFabricReact.officeUiFabricReactStrings.hue
import typings.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsColorPickerColorSliderColorSliderDottypesMod {
  
  trait IColorSlider extends StObject {
    
    /** Current value of the slider. */
    var value: Double
  }
  object IColorSlider {
    
    inline def apply(value: Double): IColorSlider = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorSlider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColorSlider] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IColorSliderProps extends StObject {
    
    /**
      * Label of the ColorSlider for the benefit of screen reader users.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Additional CSS class(es) to apply to the ColorSlider.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IColorSlider]] = js.undefined
    
    /**
      * If true, the slider represents an alpha slider and will display a gray checkered pattern
      * in the background. Otherwise, the slider represents a hue slider.
      * @defaultvalue false
      * @deprecated Use `type`
      */
    var isAlpha: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum value of the slider.
      * @deprecated Will be 100 for alpha or transparency sliders, or 359 for hue sliders.
      */
    var maxValue: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum value of the slider.
      * @deprecated Will always be 0
      */
    var minValue: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback issued when the value changes.
      */
    var onChange: js.UndefOr[
        js.Function2[
          /* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], 
          /* newValue */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Hex color to use when rendering an alpha or transparency slider's overlay, *without* the `#`.
      */
    var overlayColor: js.UndefOr[String] = js.undefined
    
    /**
      * Custom style for the overlay element.
      * @deprecated Use `overlayColor` instead
      */
    var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]] = js.undefined
    
    /**
      * Theme (provided through customization).
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * CSS-compatible string for the color of the thumb element.
      * @deprecated Not used. Use `styles.sliderThumb` instead.
      */
    var thumbColor: js.UndefOr[String] = js.undefined
    
    /**
      * Type of slider to display.
      * @defaultvalue 'hue'
      */
    var `type`: js.UndefOr[hue | alpha | transparency] = js.undefined
    
    /**
      * Current value of the slider.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object IColorSliderProps {
    
    inline def apply(): IColorSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColorSliderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColorSliderProps] (val x: Self) extends AnyVal {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IColorSlider]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IColorSlider | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setIsAlpha(value: Boolean): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
      
      inline def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setOnChange(
        value: (/* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], /* newValue */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
      
      inline def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
      
      inline def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IColorSliderStyleProps => DeepPartial[IColorSliderStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setThumbColor(value: String): Self = StObject.set(x, "thumbColor", value.asInstanceOf[js.Any])
      
      inline def setThumbColorUndefined: Self = StObject.set(x, "thumbColor", js.undefined)
      
      inline def setType(value: hue | alpha | transparency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps, 'className' | 'type'> & {  isAlpha :boolean | undefined} */
  trait IColorSliderStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated Use `type`
      */
    var isAlpha: js.UndefOr[Boolean] = js.undefined
    
    var theme: ITheme
    
    var `type`: js.UndefOr[hue | alpha | transparency] = js.undefined
  }
  object IColorSliderStyleProps {
    
    inline def apply(theme: ITheme): IColorSliderStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorSliderStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColorSliderStyleProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsAlpha(value: Boolean): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
      
      inline def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setType(value: hue | alpha | transparency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IColorSliderStyles extends StObject {
    
    /**
      * Style set for the root element.
      */
    var root: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the overlay element.
      */
    var sliderOverlay: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the draggable thumb element.
      */
    var sliderThumb: js.UndefOr[IStyle] = js.undefined
  }
  object IColorSliderStyles {
    
    inline def apply(): IColorSliderStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColorSliderStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColorSliderStyles] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSliderOverlay(value: IStyle): Self = StObject.set(x, "sliderOverlay", value.asInstanceOf[js.Any])
      
      inline def setSliderOverlayNull: Self = StObject.set(x, "sliderOverlay", null)
      
      inline def setSliderOverlayUndefined: Self = StObject.set(x, "sliderOverlay", js.undefined)
      
      inline def setSliderThumb(value: IStyle): Self = StObject.set(x, "sliderThumb", value.asInstanceOf[js.Any])
      
      inline def setSliderThumbNull: Self = StObject.set(x, "sliderThumb", null)
      
      inline def setSliderThumbUndefined: Self = StObject.set(x, "sliderThumb", js.undefined)
    }
  }
}
