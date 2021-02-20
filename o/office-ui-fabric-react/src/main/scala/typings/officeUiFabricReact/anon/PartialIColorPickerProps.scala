package typings.officeUiFabricReact.anon

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.colorPickerTypesMod.IColorPicker
import typings.officeUiFabricReact.colorPickerTypesMod.IColorPickerStrings
import typings.officeUiFabricReact.colorPickerTypesMod.IColorPickerStyleProps
import typings.officeUiFabricReact.colorPickerTypesMod.IColorPickerStyles
import typings.officeUiFabricReact.interfacesMod.IColor
import typings.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typings.officeUiFabricReact.officeUiFabricReactStrings.none
import typings.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.types.IColorPickerProps> */
@js.native
trait PartialIColorPickerProps extends StObject {
  
  var alphaLabel: js.UndefOr[String] = js.native
  
  var alphaSliderHidden: js.UndefOr[Boolean] = js.native
  
  var alphaType: js.UndefOr[alpha | transparency | none] = js.native
  
  var blueLabel: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[IColor | String] = js.native
  
  var componentRef: js.UndefOr[IRefObject[IColorPicker]] = js.native
  
  var greenLabel: js.UndefOr[String] = js.native
  
  var hexLabel: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[
    js.Function2[/* ev */ SyntheticEvent[HTMLElement, Event], /* color */ IColor, scala.Unit]
  ] = js.native
  
  var redLabel: js.UndefOr[String] = js.native
  
  var showPreview: js.UndefOr[Boolean] = js.native
  
  var strings: js.UndefOr[IColorPickerStrings] = js.native
  
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]] = js.native
  
  var theme: js.UndefOr[ITheme] = js.native
}
object PartialIColorPickerProps {
  
  @scala.inline
  def apply(): PartialIColorPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIColorPickerProps]
  }
  
  @scala.inline
  implicit class PartialIColorPickerPropsMutableBuilder[Self <: PartialIColorPickerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphaLabel(value: String): Self = StObject.set(x, "alphaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaLabelUndefined: Self = StObject.set(x, "alphaLabel", js.undefined)
    
    @scala.inline
    def setAlphaSliderHidden(value: Boolean): Self = StObject.set(x, "alphaSliderHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaSliderHiddenUndefined: Self = StObject.set(x, "alphaSliderHidden", js.undefined)
    
    @scala.inline
    def setAlphaType(value: alpha | transparency | none): Self = StObject.set(x, "alphaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaTypeUndefined: Self = StObject.set(x, "alphaType", js.undefined)
    
    @scala.inline
    def setBlueLabel(value: String): Self = StObject.set(x, "blueLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueLabelUndefined: Self = StObject.set(x, "blueLabel", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: IColor | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setComponentRef(value: IRefObject[IColorPicker]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IColorPicker | Null => scala.Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    @scala.inline
    def setGreenLabel(value: String): Self = StObject.set(x, "greenLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreenLabelUndefined: Self = StObject.set(x, "greenLabel", js.undefined)
    
    @scala.inline
    def setHexLabel(value: String): Self = StObject.set(x, "hexLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHexLabelUndefined: Self = StObject.set(x, "hexLabel", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* ev */ SyntheticEvent[HTMLElement, Event], /* color */ IColor) => scala.Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setRedLabel(value: String): Self = StObject.set(x, "redLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedLabelUndefined: Self = StObject.set(x, "redLabel", js.undefined)
    
    @scala.inline
    def setShowPreview(value: Boolean): Self = StObject.set(x, "showPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPreviewUndefined: Self = StObject.set(x, "showPreview", js.undefined)
    
    @scala.inline
    def setStrings(value: IColorPickerStrings): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesFunction1(value: IColorPickerStyleProps => DeepPartial[IColorPickerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
