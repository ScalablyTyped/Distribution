package typings.atNivoStream.atNivoStreamMod

import typings.atNivoAxes.atNivoAxesMod.AxisProps
import typings.atNivoColors.atNivoColorsMod.InheritedColorProp
import typings.atNivoColors.atNivoColorsMod.OrdinalColorsInstruction
import typings.atNivoCore.Anon_
import typings.atNivoCore.Anon_Id
import typings.atNivoCore.atNivoCoreMod.AreaCurve
import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.StackOffset
import typings.atNivoCore.atNivoCoreMod.StackOrder
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.atNivoLegends.atNivoLegendsMod.LegendProps
import typings.atNivoScales.atNivoScalesMod.Scale
import typings.atNivoStream.Anon_0
import typings.atNivoStream.atNivoStreamStrings.center
import typings.atNivoStream.atNivoStreamStrings.end
import typings.atNivoStream.atNivoStreamStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @nivo/stream.@nivo/stream.StreamProps<T> */
/* Inlined parent @nivo/core.@nivo/core.MotionProps */
trait StreamSvgProps[T] extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var axisBottom: js.UndefOr[AxisProps] = js.undefined
  var axisLeft: js.UndefOr[AxisProps] = js.undefined
  var axisRight: js.UndefOr[AxisProps] = js.undefined
  var axisTop: js.UndefOr[AxisProps] = js.undefined
  var borderColor: js.UndefOr[InheritedColorProp[_]] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.undefined
  var curve: js.UndefOr[AreaCurve] = js.undefined
  var data: js.Array[T]
  var defs: js.UndefOr[js.Array[Anon_Id]] = js.undefined
  var dotBorderColor: js.UndefOr[InheritedColorProp[_]] = js.undefined
  var dotBorderWidth: js.UndefOr[DatumToNumber | Double] = js.undefined
  var dotColor: js.UndefOr[InheritedColorProp[_]] = js.undefined
  var dotPosition: js.UndefOr[start | center | end] = js.undefined
  var dotSize: js.UndefOr[DatumToNumber | Double] = js.undefined
  var enableDots: js.UndefOr[Boolean] = js.undefined
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  var enableStackTooltip: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[js.Array[Anon_[T]]] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var keys: js.Array[String]
  var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var motionDamping: js.UndefOr[Double] = js.undefined
  var motionStiffness: js.UndefOr[Double] = js.undefined
  var offsetType: js.UndefOr[StackOffset] = js.undefined
  var order: js.UndefOr[StackOrder] = js.undefined
  var renderDot: js.UndefOr[StreamDotsItem] = js.undefined
  var stack: js.UndefOr[StackFunc[T]] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltipFormat: js.UndefOr[TooltipFormatter[T] | String] = js.undefined
  var tooltipLabel: js.UndefOr[TooltipLabel[T]] = js.undefined
  var xScale: js.UndefOr[Scale] = js.undefined
  var yScale: js.UndefOr[Scale] = js.undefined
}

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
    defs: js.Array[Anon_Id] = null,
    dotBorderColor: InheritedColorProp[_] = null,
    dotBorderWidth: DatumToNumber | Double = null,
    dotColor: InheritedColorProp[_] = null,
    dotPosition: start | center | end = null,
    dotSize: DatumToNumber | Double = null,
    enableDots: js.UndefOr[Boolean] = js.undefined,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enableStackTooltip: js.UndefOr[Boolean] = js.undefined,
    fill: js.Array[Anon_[T]] = null,
    fillOpacity: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    legends: js.Array[LegendProps] = null,
    margin: Box = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    offsetType: StackOffset = null,
    order: StackOrder = null,
    renderDot: StreamDotsItem = null,
    stack: /* data */ js.Array[T] => js.Array[js.Array[Anon_0[T]]] = null,
    theme: Theme = null,
    tooltipFormat: TooltipFormatter[T] | String = null,
    tooltipLabel: T => String = null,
    xScale: Scale = null,
    yScale: Scale = null
  ): StreamSvgProps[T] = {
    val __obj = js.Dynamic.literal(data = data, keys = keys)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom)
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft)
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight)
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve)
    if (defs != null) __obj.updateDynamic("defs")(defs)
    if (dotBorderColor != null) __obj.updateDynamic("dotBorderColor")(dotBorderColor.asInstanceOf[js.Any])
    if (dotBorderWidth != null) __obj.updateDynamic("dotBorderWidth")(dotBorderWidth.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (dotPosition != null) __obj.updateDynamic("dotPosition")(dotPosition.asInstanceOf[js.Any])
    if (dotSize != null) __obj.updateDynamic("dotSize")(dotSize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDots)) __obj.updateDynamic("enableDots")(enableDots)
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX)
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY)
    if (!js.isUndefined(enableStackTooltip)) __obj.updateDynamic("enableStackTooltip")(enableStackTooltip)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (legends != null) __obj.updateDynamic("legends")(legends)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (offsetType != null) __obj.updateDynamic("offsetType")(offsetType)
    if (order != null) __obj.updateDynamic("order")(order)
    if (renderDot != null) __obj.updateDynamic("renderDot")(renderDot)
    if (stack != null) __obj.updateDynamic("stack")(js.Any.fromFunction1(stack))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(js.Any.fromFunction1(tooltipLabel))
    if (xScale != null) __obj.updateDynamic("xScale")(xScale)
    if (yScale != null) __obj.updateDynamic("yScale")(yScale)
    __obj.asInstanceOf[StreamSvgProps[T]]
  }
}

