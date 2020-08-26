package typings.nivoStream.mod

import typings.nivoAxes.mod.AxisProps
import typings.nivoColors.mod.InheritedColorProp
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.mod.AreaCurve
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.MotionProps
import typings.nivoCore.mod.StackOffset
import typings.nivoCore.mod.StackOrder
import typings.nivoCore.mod.SvgDefsAndFill
import typings.nivoCore.mod.Theme
import typings.nivoLegends.mod.LegendProps
import typings.nivoScales.mod.Scale
import typings.nivoStream.anon.`0`
import typings.nivoStream.nivoStreamStrings.center
import typings.nivoStream.nivoStreamStrings.end
import typings.nivoStream.nivoStreamStrings.start
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalStreamProps[T]
  extends SvgDefsAndFill[T]
     with MotionProps {
  var axisBottom: AxisProps | Null = js.native
  var axisLeft: AxisProps | Null = js.native
  var axisRight: AxisProps | Null = js.native
  var axisTop: AxisProps | Null = js.native
  var borderColor: InheritedColorProp[_] = js.native
  var borderWidth: Double = js.native
  var colors: OrdinalColorsInstruction[_] = js.native
  var curve: AreaCurve = js.native
  var dotBorderColor: InheritedColorProp[_] = js.native
  var dotBorderWidth: DatumToNumber | Double = js.native
  var dotColor: InheritedColorProp[_] = js.native
  var dotPosition: start | center | end = js.native
  var dotSize: DatumToNumber | Double = js.native
  var enableDots: Boolean = js.native
  var enableGridX: Boolean = js.native
  var enableGridY: Boolean = js.native
  var enableStackTooltip: Boolean = js.native
  var fillOpacity: Double = js.native
  var isInteractive: Boolean = js.native
  var legends: js.Array[LegendProps] = js.native
  var margin: Box = js.native
  var offsetType: StackOffset = js.native
  var order: StackOrder = js.native
  var renderDot: StreamDotsItem = js.native
  var stack: StackFunc[T] = js.native
  var theme: Theme = js.native
  var tooltipFormat: TooltipFormatter[T] | String = js.native
  var tooltipLabel: TooltipLabel[T] = js.native
  var xScale: Scale = js.native
  var yScale: Scale = js.native
}

object OptionalStreamProps {
  @scala.inline
  def apply[T](
    borderColor: InheritedColorProp[_],
    borderWidth: Double,
    colors: OrdinalColorsInstruction[_],
    curve: AreaCurve,
    dotBorderColor: InheritedColorProp[_],
    dotBorderWidth: DatumToNumber | Double,
    dotColor: InheritedColorProp[_],
    dotPosition: start | center | end,
    dotSize: DatumToNumber | Double,
    enableDots: Boolean,
    enableGridX: Boolean,
    enableGridY: Boolean,
    enableStackTooltip: Boolean,
    fillOpacity: Double,
    isInteractive: Boolean,
    legends: js.Array[LegendProps],
    margin: Box,
    offsetType: StackOffset,
    order: StackOrder,
    renderDot: StreamDotsItem,
    stack: /* data */ js.Array[T] => js.Array[js.Array[`0`[T]]],
    theme: Theme,
    tooltipFormat: TooltipFormatter[T] | String,
    tooltipLabel: T => String,
    xScale: Scale,
    yScale: Scale
  ): OptionalStreamProps[T] = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], dotBorderColor = dotBorderColor.asInstanceOf[js.Any], dotBorderWidth = dotBorderWidth.asInstanceOf[js.Any], dotColor = dotColor.asInstanceOf[js.Any], dotPosition = dotPosition.asInstanceOf[js.Any], dotSize = dotSize.asInstanceOf[js.Any], enableDots = enableDots.asInstanceOf[js.Any], enableGridX = enableGridX.asInstanceOf[js.Any], enableGridY = enableGridY.asInstanceOf[js.Any], enableStackTooltip = enableStackTooltip.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], offsetType = offsetType.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], renderDot = renderDot.asInstanceOf[js.Any], stack = js.Any.fromFunction1(stack), theme = theme.asInstanceOf[js.Any], tooltipFormat = tooltipFormat.asInstanceOf[js.Any], tooltipLabel = js.Any.fromFunction1(tooltipLabel), xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalStreamProps[T]]
  }
  @scala.inline
  implicit class OptionalStreamPropsOps[Self <: OptionalStreamProps[_], T] (val x: Self with OptionalStreamProps[T]) extends AnyVal {
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
    def setBorderColorFunction1(value: _ => String): Self = this.set("borderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderColor(value: InheritedColorProp[_]): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColorsFunction1(value: _ => String): Self = this.set("colors", js.Any.fromFunction1(value))
    @scala.inline
    def setColors(value: OrdinalColorsInstruction[_]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurve(value: AreaCurve): Self = this.set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def setDotBorderColorFunction1(value: _ => String): Self = this.set("dotBorderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setDotBorderColor(value: InheritedColorProp[_]): Self = this.set("dotBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDotBorderWidthFunction1(value: /* datum */ Datum => Double): Self = this.set("dotBorderWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setDotBorderWidth(value: DatumToNumber | Double): Self = this.set("dotBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDotColorFunction1(value: _ => String): Self = this.set("dotColor", js.Any.fromFunction1(value))
    @scala.inline
    def setDotColor(value: InheritedColorProp[_]): Self = this.set("dotColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDotPosition(value: start | center | end): Self = this.set("dotPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setDotSizeFunction1(value: /* datum */ Datum => Double): Self = this.set("dotSize", js.Any.fromFunction1(value))
    @scala.inline
    def setDotSize(value: DatumToNumber | Double): Self = this.set("dotSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableDots(value: Boolean): Self = this.set("enableDots", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableGridX(value: Boolean): Self = this.set("enableGridX", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableGridY(value: Boolean): Self = this.set("enableGridY", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableStackTooltip(value: Boolean): Self = this.set("enableStackTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInteractive(value: Boolean): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegendsVarargs(value: LegendProps*): Self = this.set("legends", js.Array(value :_*))
    @scala.inline
    def setLegends(value: js.Array[LegendProps]): Self = this.set("legends", value.asInstanceOf[js.Any])
    @scala.inline
    def setMargin(value: Box): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetType(value: StackOffset): Self = this.set("offsetType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: StackOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderDot(value: StreamDotsItem): Self = this.set("renderDot", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: /* data */ js.Array[T] => js.Array[js.Array[`0`[T]]]): Self = this.set("stack", js.Any.fromFunction1(value))
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipFormatFunction1(value: T => ReactNode): Self = this.set("tooltipFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setTooltipFormat(value: TooltipFormatter[T] | String): Self = this.set("tooltipFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipLabel(value: T => String): Self = this.set("tooltipLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setXScale(value: Scale): Self = this.set("xScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setYScale(value: Scale): Self = this.set("yScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisBottom(value: AxisProps): Self = this.set("axisBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisBottomNull: Self = this.set("axisBottom", null)
    @scala.inline
    def setAxisLeft(value: AxisProps): Self = this.set("axisLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisLeftNull: Self = this.set("axisLeft", null)
    @scala.inline
    def setAxisRight(value: AxisProps): Self = this.set("axisRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisRightNull: Self = this.set("axisRight", null)
    @scala.inline
    def setAxisTop(value: AxisProps): Self = this.set("axisTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisTopNull: Self = this.set("axisTop", null)
  }
  
}

