package typings.officeUiFabricReact.anon

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsColorPickerColorRectangleColorRectangleDottypesMod.IColorRectangle
import typings.officeUiFabricReact.libComponentsColorPickerColorRectangleColorRectangleDottypesMod.IColorRectangleStyleProps
import typings.officeUiFabricReact.libComponentsColorPickerColorRectangleColorRectangleDottypesMod.IColorRectangleStyles
import typings.officeUiFabricReact.libUtilitiesColorInterfacesMod.IColor
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

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.types.IColorRectangleProps> */
trait PartialIColorRectanglePro extends StObject {
  
  var ariaDescription: js.UndefOr[String] = js.undefined
  
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  var ariaValueFormat: js.UndefOr[String] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[IColor] = js.undefined
  
  var componentRef: js.UndefOr[IRefObject[IColorRectangle]] = js.undefined
  
  var minSize: js.UndefOr[Double] = js.undefined
  
  var onChange: js.UndefOr[
    js.Function2[
      /* ev */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], 
      /* color */ IColor, 
      scala.Unit
    ]
  ] = js.undefined
  
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]] = js.undefined
  
  var theme: js.UndefOr[ITheme] = js.undefined
}
object PartialIColorRectanglePro {
  
  inline def apply(): PartialIColorRectanglePro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIColorRectanglePro]
  }
  
  extension [Self <: PartialIColorRectanglePro](x: Self) {
    
    inline def setAriaDescription(value: String): Self = StObject.set(x, "ariaDescription", value.asInstanceOf[js.Any])
    
    inline def setAriaDescriptionUndefined: Self = StObject.set(x, "ariaDescription", js.undefined)
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setAriaValueFormat(value: String): Self = StObject.set(x, "ariaValueFormat", value.asInstanceOf[js.Any])
    
    inline def setAriaValueFormatUndefined: Self = StObject.set(x, "ariaValueFormat", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setComponentRef(value: IRefObject[IColorRectangle]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    inline def setComponentRefFunction1(value: /* ref */ IColorRectangle | Null => scala.Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
    
    inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    inline def setOnChange(
      value: (/* ev */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], /* color */ IColor) => scala.Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setStyles(value: IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesFunction1(value: IColorRectangleStyleProps => DeepPartial[IColorRectangleStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
