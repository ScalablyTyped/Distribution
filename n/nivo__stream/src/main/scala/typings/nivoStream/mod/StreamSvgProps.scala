package typings.nivoStream.mod

import typings.nivoAxes.mod.AxisProps
import typings.nivoColors.mod.InheritedColorProp
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.AnonDictkey
import typings.nivoCore.AnonId
import typings.nivoCore.mod.AreaCurve
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.StackOffset
import typings.nivoCore.mod.StackOrder
import typings.nivoCore.mod.Theme
import typings.nivoLegends.mod.LegendProps
import typings.nivoScales.mod.Scale
import typings.nivoStream.Anon0
import typings.nivoStream.nivoStreamStrings.center
import typings.nivoStream.nivoStreamStrings.end
import typings.nivoStream.nivoStreamStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.nivoCore.mod.MotionProps because var conflicts: animate, motionDamping, motionStiffness. Inlined  */ trait StreamSvgProps[T] extends StreamProps[T]

object StreamSvgProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    keys: js.Array[String],
    animate: js.UndefOr[Boolean] = js.undefined,
    axisBottom: AxisProps = null,
    axisLeft: AxisProps = null,
    axisRight: AxisProps = null,
    axisTop: AxisProps = null,
    borderColor: InheritedColorProp[_] = null,
    borderWidth: Int | Double = null,
    colors: OrdinalColorsInstruction[_] = null,
    curve: AreaCurve = null,
    defs: js.Array[AnonDictkey] = null,
    dotBorderColor: InheritedColorProp[_] = null,
    dotBorderWidth: DatumToNumber | Double = null,
    dotColor: InheritedColorProp[_] = null,
    dotPosition: start | center | end = null,
    dotSize: DatumToNumber | Double = null,
    enableDots: js.UndefOr[Boolean] = js.undefined,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enableStackTooltip: js.UndefOr[Boolean] = js.undefined,
    fill: js.Array[AnonId[T]] = null,
    fillOpacity: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    legends: js.Array[LegendProps] = null,
    margin: Box = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    offsetType: StackOffset = null,
    order: StackOrder = null,
    renderDot: StreamDotsItem = null,
    stack: /* data */ js.Array[T] => js.Array[js.Array[Anon0[T]]] = null,
    theme: Theme = null,
    tooltipFormat: TooltipFormatter[T] | String = null,
    tooltipLabel: T => String = null,
    xScale: Scale = null,
    yScale: Scale = null
  ): StreamSvgProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (dotBorderColor != null) __obj.updateDynamic("dotBorderColor")(dotBorderColor.asInstanceOf[js.Any])
    if (dotBorderWidth != null) __obj.updateDynamic("dotBorderWidth")(dotBorderWidth.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (dotPosition != null) __obj.updateDynamic("dotPosition")(dotPosition.asInstanceOf[js.Any])
    if (dotSize != null) __obj.updateDynamic("dotSize")(dotSize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDots)) __obj.updateDynamic("enableDots")(enableDots.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.asInstanceOf[js.Any])
    if (!js.isUndefined(enableStackTooltip)) __obj.updateDynamic("enableStackTooltip")(enableStackTooltip.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (offsetType != null) __obj.updateDynamic("offsetType")(offsetType.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (renderDot != null) __obj.updateDynamic("renderDot")(renderDot.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(js.Any.fromFunction1(stack))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(js.Any.fromFunction1(tooltipLabel))
    if (xScale != null) __obj.updateDynamic("xScale")(xScale.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSvgProps[T]]
  }
}

