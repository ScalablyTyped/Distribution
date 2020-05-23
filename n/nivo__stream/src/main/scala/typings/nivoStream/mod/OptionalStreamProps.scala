package typings.nivoStream.mod

import typings.nivoAxes.mod.AxisProps
import typings.nivoColors.mod.InheritedColorProp
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.anon.Dictkey
import typings.nivoCore.anon.Id
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalStreamProps[T]
  extends SvgDefsAndFill[T]
     with MotionProps {
  var axisBottom: AxisProps | Null
  var axisLeft: AxisProps | Null
  var axisRight: AxisProps | Null
  var axisTop: AxisProps | Null
  var borderColor: InheritedColorProp[_]
  var borderWidth: Double
  var colors: OrdinalColorsInstruction[_]
  var curve: AreaCurve
  var dotBorderColor: InheritedColorProp[_]
  var dotBorderWidth: DatumToNumber | Double
  var dotColor: InheritedColorProp[_]
  var dotPosition: start | center | end
  var dotSize: DatumToNumber | Double
  var enableDots: Boolean
  var enableGridX: Boolean
  var enableGridY: Boolean
  var enableStackTooltip: Boolean
  var fillOpacity: Double
  var isInteractive: Boolean
  var legends: js.Array[LegendProps]
  var margin: Box
  var offsetType: StackOffset
  var order: StackOrder
  var renderDot: StreamDotsItem
  var stack: StackFunc[T]
  var theme: Theme
  var tooltipFormat: TooltipFormatter[T] | String
  var tooltipLabel: TooltipLabel[T]
  var xScale: Scale
  var yScale: Scale
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
    yScale: Scale,
    animate: js.UndefOr[Boolean] = js.undefined,
    axisBottom: AxisProps = null,
    axisLeft: AxisProps = null,
    axisRight: AxisProps = null,
    axisTop: AxisProps = null,
    defs: js.Array[Dictkey] = null,
    fill: js.Array[Id[T]] = null,
    motionDamping: js.UndefOr[Double] = js.undefined,
    motionStiffness: js.UndefOr[Double] = js.undefined
  ): OptionalStreamProps[T] = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], dotBorderColor = dotBorderColor.asInstanceOf[js.Any], dotBorderWidth = dotBorderWidth.asInstanceOf[js.Any], dotColor = dotColor.asInstanceOf[js.Any], dotPosition = dotPosition.asInstanceOf[js.Any], dotSize = dotSize.asInstanceOf[js.Any], enableDots = enableDots.asInstanceOf[js.Any], enableGridX = enableGridX.asInstanceOf[js.Any], enableGridY = enableGridY.asInstanceOf[js.Any], enableStackTooltip = enableStackTooltip.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], offsetType = offsetType.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], renderDot = renderDot.asInstanceOf[js.Any], stack = js.Any.fromFunction1(stack), theme = theme.asInstanceOf[js.Any], tooltipFormat = tooltipFormat.asInstanceOf[js.Any], tooltipLabel = js.Any.fromFunction1(tooltipLabel), xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any], axisBottom = axisBottom.asInstanceOf[js.Any], axisLeft = axisLeft.asInstanceOf[js.Any], axisRight = axisRight.asInstanceOf[js.Any], axisTop = axisTop.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(motionDamping)) __obj.updateDynamic("motionDamping")(motionDamping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(motionStiffness)) __obj.updateDynamic("motionStiffness")(motionStiffness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalStreamProps[T]]
  }
}

