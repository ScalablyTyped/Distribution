package typings.officeUiFabricReact.anon

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsColorPickerColorSliderColorSliderDottypesMod.IColorSlider
import typings.officeUiFabricReact.libComponentsColorPickerColorSliderColorSliderDottypesMod.IColorSliderStyleProps
import typings.officeUiFabricReact.libComponentsColorPickerColorSliderColorSliderDottypesMod.IColorSliderStyles
import typings.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typings.officeUiFabricReact.officeUiFabricReactStrings.hue
import typings.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps> */
trait PartialIColorSliderProps extends StObject {
  
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var componentRef: js.UndefOr[IRefObject[IColorSlider]] = js.undefined
  
  var isAlpha: js.UndefOr[Boolean] = js.undefined
  
  var maxValue: js.UndefOr[Double] = js.undefined
  
  var minValue: js.UndefOr[Double] = js.undefined
  
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], 
      /* newValue */ js.UndefOr[Double], 
      scala.Unit
    ]
  ] = js.undefined
  
  var overlayColor: js.UndefOr[String] = js.undefined
  
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]] = js.undefined
  
  var theme: js.UndefOr[ITheme] = js.undefined
  
  var thumbColor: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[hue | alpha | transparency] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object PartialIColorSliderProps {
  
  inline def apply(): PartialIColorSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIColorSliderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIColorSliderProps] (val x: Self) extends AnyVal {
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setComponentRef(value: IRefObject[IColorSlider]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    inline def setComponentRefFunction1(value: /* ref */ IColorSlider | Null => scala.Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
    
    inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    inline def setIsAlpha(value: Boolean): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
    
    inline def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setOnChange(
      value: (/* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], /* newValue */ js.UndefOr[Double]) => scala.Unit
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
