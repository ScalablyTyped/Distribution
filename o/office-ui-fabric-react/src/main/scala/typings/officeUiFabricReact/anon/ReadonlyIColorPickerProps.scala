package typings.officeUiFabricReact.anon

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPicker
import typings.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPickerStrings
import typings.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPickerStyleProps
import typings.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPickerStyles
import typings.officeUiFabricReact.libUtilitiesColorInterfacesMod.IColor
import typings.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typings.officeUiFabricReact.officeUiFabricReactStrings.none
import typings.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.types.IColorPickerProps> */
trait ReadonlyIColorPickerProps extends StObject {
  
  val alphaLabel: js.UndefOr[String] = js.undefined
  
  val alphaSliderHidden: js.UndefOr[Boolean] = js.undefined
  
  val alphaType: js.UndefOr[alpha | transparency | none] = js.undefined
  
  val blueLabel: js.UndefOr[String] = js.undefined
  
  val className: js.UndefOr[String] = js.undefined
  
  val color: IColor | String
  
  val componentRef: js.UndefOr[IRefObject[IColorPicker]] = js.undefined
  
  val greenLabel: js.UndefOr[String] = js.undefined
  
  val hexLabel: js.UndefOr[String] = js.undefined
  
  val onChange: js.UndefOr[
    js.Function2[/* ev */ SyntheticEvent[HTMLElement, Event], /* color */ IColor, scala.Unit]
  ] = js.undefined
  
  val redLabel: js.UndefOr[String] = js.undefined
  
  val showPreview: js.UndefOr[Boolean] = js.undefined
  
  val strings: js.UndefOr[IColorPickerStrings] = js.undefined
  
  val styles: js.UndefOr[IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]] = js.undefined
  
  val theme: js.UndefOr[ITheme] = js.undefined
}
object ReadonlyIColorPickerProps {
  
  inline def apply(color: IColor | String): ReadonlyIColorPickerProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorPickerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyIColorPickerProps] (val x: Self) extends AnyVal {
    
    inline def setAlphaLabel(value: String): Self = StObject.set(x, "alphaLabel", value.asInstanceOf[js.Any])
    
    inline def setAlphaLabelUndefined: Self = StObject.set(x, "alphaLabel", js.undefined)
    
    inline def setAlphaSliderHidden(value: Boolean): Self = StObject.set(x, "alphaSliderHidden", value.asInstanceOf[js.Any])
    
    inline def setAlphaSliderHiddenUndefined: Self = StObject.set(x, "alphaSliderHidden", js.undefined)
    
    inline def setAlphaType(value: alpha | transparency | none): Self = StObject.set(x, "alphaType", value.asInstanceOf[js.Any])
    
    inline def setAlphaTypeUndefined: Self = StObject.set(x, "alphaType", js.undefined)
    
    inline def setBlueLabel(value: String): Self = StObject.set(x, "blueLabel", value.asInstanceOf[js.Any])
    
    inline def setBlueLabelUndefined: Self = StObject.set(x, "blueLabel", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: IColor | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setComponentRef(value: IRefObject[IColorPicker]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    inline def setComponentRefFunction1(value: /* ref */ IColorPicker | Null => scala.Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
    
    inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    inline def setGreenLabel(value: String): Self = StObject.set(x, "greenLabel", value.asInstanceOf[js.Any])
    
    inline def setGreenLabelUndefined: Self = StObject.set(x, "greenLabel", js.undefined)
    
    inline def setHexLabel(value: String): Self = StObject.set(x, "hexLabel", value.asInstanceOf[js.Any])
    
    inline def setHexLabelUndefined: Self = StObject.set(x, "hexLabel", js.undefined)
    
    inline def setOnChange(value: (/* ev */ SyntheticEvent[HTMLElement, Event], /* color */ IColor) => scala.Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setRedLabel(value: String): Self = StObject.set(x, "redLabel", value.asInstanceOf[js.Any])
    
    inline def setRedLabelUndefined: Self = StObject.set(x, "redLabel", js.undefined)
    
    inline def setShowPreview(value: Boolean): Self = StObject.set(x, "showPreview", value.asInstanceOf[js.Any])
    
    inline def setShowPreviewUndefined: Self = StObject.set(x, "showPreview", js.undefined)
    
    inline def setStrings(value: IColorPickerStrings): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    inline def setStyles(value: IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesFunction1(value: IColorPickerStyleProps => DeepPartial[IColorPickerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
