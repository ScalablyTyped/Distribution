package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.colorSliderTypesMod.IColorSlider
import typings.officeUiFabricReact.colorSliderTypesMod.IColorSliderStyleProps
import typings.officeUiFabricReact.colorSliderTypesMod.IColorSliderStyles
import typings.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typings.officeUiFabricReact.officeUiFabricReactStrings.hue
import typings.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps> */
@js.native
trait PartialIColorSliderProps extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var componentRef: js.UndefOr[IRefObject[IColorSlider]] = js.native
  var isAlpha: js.UndefOr[Boolean] = js.native
  var maxValue: js.UndefOr[Double] = js.native
  var minValue: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], 
      /* newValue */ js.UndefOr[Double], 
      scala.Unit
    ]
  ] = js.native
  var overlayColor: js.UndefOr[String] = js.native
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]] = js.native
  var theme: js.UndefOr[ITheme] = js.native
  var thumbColor: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[hue | alpha | transparency] = js.native
  var value: js.UndefOr[Double] = js.native
}

object PartialIColorSliderProps {
  @scala.inline
  def apply(): PartialIColorSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIColorSliderProps]
  }
  @scala.inline
  implicit class PartialIColorSliderPropsOps[Self <: PartialIColorSliderProps] (val x: Self) extends AnyVal {
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
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IColorSlider | Null => scala.Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IColorSlider]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setIsAlpha(value: Boolean): Self = this.set("isAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAlpha: Self = this.set("isAlpha", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], /* newValue */ js.UndefOr[Double]) => scala.Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOverlayColor(value: String): Self = this.set("overlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayColor: Self = this.set("overlayColor", js.undefined)
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IColorSliderStyleProps => DeepPartial[IColorSliderStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setThumbColor(value: String): Self = this.set("thumbColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbColor: Self = this.set("thumbColor", js.undefined)
    @scala.inline
    def setType(value: hue | alpha | transparency): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

