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

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.types.IColorRectangleProps> */
trait ReadonlyIColorRectanglePr extends StObject {
  
  val ariaDescription: js.UndefOr[String] = js.undefined
  
  val ariaLabel: js.UndefOr[String] = js.undefined
  
  val ariaValueFormat: js.UndefOr[String] = js.undefined
  
  val className: js.UndefOr[String] = js.undefined
  
  val color: IColor
  
  val componentRef: js.UndefOr[IRefObject[IColorRectangle]] = js.undefined
  
  val minSize: js.UndefOr[Double] = js.undefined
  
  val onChange: js.UndefOr[
    js.Function2[
      /* ev */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], 
      /* color */ IColor, 
      scala.Unit
    ]
  ] = js.undefined
  
  val styles: js.UndefOr[IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]] = js.undefined
  
  val theme: js.UndefOr[ITheme] = js.undefined
}
object ReadonlyIColorRectanglePr {
  
  inline def apply(color: IColor): ReadonlyIColorRectanglePr = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorRectanglePr]
  }
  
  extension [Self <: ReadonlyIColorRectanglePr](x: Self) {
    
    inline def setAriaDescription(value: String): Self = StObject.set(x, "ariaDescription", value.asInstanceOf[js.Any])
    
    inline def setAriaDescriptionUndefined: Self = StObject.set(x, "ariaDescription", js.undefined)
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setAriaValueFormat(value: String): Self = StObject.set(x, "ariaValueFormat", value.asInstanceOf[js.Any])
    
    inline def setAriaValueFormatUndefined: Self = StObject.set(x, "ariaValueFormat", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
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
