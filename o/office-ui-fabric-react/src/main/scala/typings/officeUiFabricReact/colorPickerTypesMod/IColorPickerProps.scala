package typings.officeUiFabricReact.colorPickerTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColorPickerProps extends js.Object {
  
  /**
    * Label for the alpha textfield.
    * @defaultvalue Alpha
    * @deprecated Use `strings`
    */
  var alphaLabel: js.UndefOr[String] = js.native
  
  /**
    * Whether to hide the alpha (or transparency) slider and text field.
    * @deprecated Use `alphaType: 'none'`
    */
  var alphaSliderHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * `alpha` (the default) means display a slider and text field for editing alpha values.
    * `transparency` also displays a slider and text field but for editing transparency values.
    * `none` hides these controls.
    *
    * Alpha represents the opacity of the color, whereas transparency represents the transparentness
    * of the color: i.e. a 30% transparent color has 70% opaqueness.
    *
    * @defaultvalue 'alpha'
    */
  var alphaType: js.UndefOr[alpha | transparency | none] = js.native
  
  /**
    * Label for the blue text field.
    * @defaultvalue Blue
    * @deprecated Use `strings`
    */
  var blueLabel: js.UndefOr[String] = js.native
  
  /**
    * Additional CSS class(es) to apply to the ColorPicker.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Object or CSS-compatible string to describe the color.
    */
  var color: IColor | String = js.native
  
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IColorPicker]] = js.native
  
  /**
    * Label for the green text field.
    * @defaultvalue Green
    * @deprecated Use `strings`
    */
  var greenLabel: js.UndefOr[String] = js.native
  
  /**
    * Label for the hex text field.
    * @defaultvalue Hex
    * @deprecated Use `strings`
    */
  var hexLabel: js.UndefOr[String] = js.native
  
  /**
    * Callback for when the user changes the color.
    * (Not called when the color is changed via props.)
    */
  var onChange: js.UndefOr[
    js.Function2[/* ev */ SyntheticEvent[HTMLElement, Event], /* color */ IColor, Unit]
  ] = js.native
  
  /**
    * Label for the red text field.
    * @defaultvalue Red
    * @deprecated Use `strings`
    */
  var redLabel: js.UndefOr[String] = js.native
  
  /**
    * Whether to show color preview box.
    * @defaultvalue false
    */
  var showPreview: js.UndefOr[Boolean] = js.native
  
  /**
    * Labels for elements within the ColorPicker. Defaults are provided in English only.
    */
  var strings: js.UndefOr[IColorPickerStrings] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]] = js.native
  
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.native
}
object IColorPickerProps {
  
  @scala.inline
  def apply(color: IColor | String): IColorPickerProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerProps]
  }
  
  @scala.inline
  implicit class IColorPickerPropsOps[Self <: IColorPickerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: IColor | String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaLabel(value: String): Self = this.set("alphaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaLabel: Self = this.set("alphaLabel", js.undefined)
    
    @scala.inline
    def setAlphaSliderHidden(value: Boolean): Self = this.set("alphaSliderHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaSliderHidden: Self = this.set("alphaSliderHidden", js.undefined)
    
    @scala.inline
    def setAlphaType(value: alpha | transparency | none): Self = this.set("alphaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaType: Self = this.set("alphaType", js.undefined)
    
    @scala.inline
    def setBlueLabel(value: String): Self = this.set("blueLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlueLabel: Self = this.set("blueLabel", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IColorPicker | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IColorPicker]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setGreenLabel(value: String): Self = this.set("greenLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreenLabel: Self = this.set("greenLabel", js.undefined)
    
    @scala.inline
    def setHexLabel(value: String): Self = this.set("hexLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHexLabel: Self = this.set("hexLabel", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* ev */ SyntheticEvent[HTMLElement, Event], /* color */ IColor) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setRedLabel(value: String): Self = this.set("redLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedLabel: Self = this.set("redLabel", js.undefined)
    
    @scala.inline
    def setShowPreview(value: Boolean): Self = this.set("showPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPreview: Self = this.set("showPreview", js.undefined)
    
    @scala.inline
    def setStrings(value: IColorPickerStrings): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IColorPickerStyleProps => DeepPartial[IColorPickerStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
