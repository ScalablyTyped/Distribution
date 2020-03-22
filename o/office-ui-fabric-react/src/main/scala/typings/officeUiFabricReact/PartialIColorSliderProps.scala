package typings.officeUiFabricReact

import typings.officeUiFabricReact.colorSliderTypesMod.IColorSlider
import typings.officeUiFabricReact.colorSliderTypesMod.IColorSliderStyleProps
import typings.officeUiFabricReact.colorSliderTypesMod.IColorSliderStyles
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps> */
trait PartialIColorSliderProps extends js.Object {
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
      Unit
    ]
  ] = js.undefined
  var overlayColor: js.UndefOr[String] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
  var thumbColor: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object PartialIColorSliderProps {
  @scala.inline
  def apply(
    ariaLabel: String = null,
    className: String = null,
    componentRef: IRefObject[IColorSlider] = null,
    isAlpha: js.UndefOr[Boolean] = js.undefined,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    onChange: (/* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], /* newValue */ js.UndefOr[Double]) => Unit = null,
    overlayColor: String = null,
    overlayStyle: CSSProperties = null,
    styles: IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles] = null,
    theme: ITheme = null,
    thumbColor: String = null,
    value: Int | Double = null
  ): PartialIColorSliderProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isAlpha)) __obj.updateDynamic("isAlpha")(isAlpha.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (thumbColor != null) __obj.updateDynamic("thumbColor")(thumbColor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIColorSliderProps]
  }
}

