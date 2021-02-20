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

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.types.IColorPickerProps> */
@js.native
trait ReadonlyIColorPickerProps extends StObject {
  
  val alphaLabel: js.UndefOr[String] = js.native
  
  val alphaSliderHidden: js.UndefOr[Boolean] = js.native
  
  val alphaType: js.UndefOr[alpha | transparency | none] = js.native
  
  val blueLabel: js.UndefOr[String] = js.native
  
  val className: js.UndefOr[String] = js.native
  
  val color: IColor | String = js.native
  
  val componentRef: js.UndefOr[IRefObject[IColorPicker]] = js.native
  
  val greenLabel: js.UndefOr[String] = js.native
  
  val hexLabel: js.UndefOr[String] = js.native
  
  val onChange: js.UndefOr[
    js.Function2[/* ev */ SyntheticEvent[HTMLElement, Event], /* color */ IColor, scala.Unit]
  ] = js.native
  
  val redLabel: js.UndefOr[String] = js.native
  
  val showPreview: js.UndefOr[Boolean] = js.native
  
  val strings: js.UndefOr[IColorPickerStrings] = js.native
  
  val styles: js.UndefOr[IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]] = js.native
  
  val theme: js.UndefOr[ITheme] = js.native
}
object ReadonlyIColorPickerProps {
  
  @scala.inline
  def apply(color: IColor | String): ReadonlyIColorPickerProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorPickerProps]
  }
  
  @scala.inline
  implicit class ReadonlyIColorPickerPropsMutableBuilder[Self <: ReadonlyIColorPickerProps] (val x: Self) extends AnyVal {
    
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
