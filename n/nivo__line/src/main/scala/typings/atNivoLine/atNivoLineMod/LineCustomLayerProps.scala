package typings.atNivoLine.atNivoLineMod

import typings.atNivoAxes.atNivoAxesMod.AxisProps
import typings.atNivoColors.atNivoColorsMod.OrdinalColorsInstruction
import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.CartesianMarkerProps
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.atNivoLegends.atNivoLegendsMod.LegendProps
import typings.atNivoLine.atNivoLineNumbers.`false`
import typings.atNivoLine.atNivoLineStrings.linear
import typings.atNivoLine.atNivoLineStrings.monotoneX
import typings.atNivoLine.atNivoLineStrings.monotoneY
import typings.atNivoLine.atNivoLineStrings.natural
import typings.atNivoLine.atNivoLineStrings.step
import typings.atNivoLine.atNivoLineStrings.stepAfter
import typings.atNivoLine.atNivoLineStrings.stepBefore
import typings.atNivoLine.atNivoLineStrings.x
import typings.atNivoLine.atNivoLineStrings.y
import typings.atNivoScales.atNivoScalesMod.ScaleFunc
import typings.atNivoTooltip.atNivoTooltipMod.CrosshairType
import typings.react.reactMod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @nivo/line.Omit<@nivo/line.@nivo/line.LineSvgProps, 'xScale' | 'yScale'> */
trait LineCustomLayerProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var areaBaselineValue: js.UndefOr[LineValue] = js.undefined
  var areaBlendMode: js.UndefOr[String] = js.undefined
  var areaOpacity: js.UndefOr[Double] = js.undefined
  var axisBottom: js.UndefOr[AxisProps] = js.undefined
  var axisLeft: js.UndefOr[AxisProps] = js.undefined
  var axisRight: js.UndefOr[AxisProps] = js.undefined
  var axisTop: js.UndefOr[AxisProps] = js.undefined
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.undefined
  var crosshairType: js.UndefOr[CrosshairType] = js.undefined
  var curve: js.UndefOr[linear | monotoneX | monotoneY | natural | stepBefore | step | stepAfter] = js.undefined
  var data: js.Array[LineSerieData]
  var debugMesh: js.UndefOr[Boolean] = js.undefined
  var debugSlices: js.UndefOr[Boolean] = js.undefined
  var enableArea: js.UndefOr[Boolean] = js.undefined
  var enableCrosshair: js.UndefOr[Boolean] = js.undefined
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  var enablePointLabel: js.UndefOr[Boolean] = js.undefined
  var enablePoints: js.UndefOr[Boolean] = js.undefined
  var enableSlices: js.UndefOr[x | y | `false`] = js.undefined
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var markers: js.UndefOr[js.Array[CartesianMarkerProps]] = js.undefined
  var motionDamping: js.UndefOr[Double] = js.undefined
  var motionStiffness: js.UndefOr[Double] = js.undefined
  var pointBorderColor: js.UndefOr[js.Any] = js.undefined
  var pointBorderWidth: js.UndefOr[Double] = js.undefined
  var pointColor: js.UndefOr[js.Any] = js.undefined
  var pointLabel: js.UndefOr[String] = js.undefined
  var pointLabelYOffset: js.UndefOr[Double] = js.undefined
  var pointSize: js.UndefOr[Double] = js.undefined
  var sliceTooltip: js.UndefOr[js.Function1[/* data */ LineSliceData, ReactNode]] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltip: js.UndefOr[TooltipProp] = js.undefined
  var tooltipFormat: js.UndefOr[TooltipFormatter | String] = js.undefined
  var useMesh: js.UndefOr[Boolean] = js.undefined
  var xFormat: js.UndefOr[String | DataFormatter] = js.undefined
  var xScale: ScaleFunc
  var yFormat: js.UndefOr[String | DataFormatter] = js.undefined
  var yScale: ScaleFunc
}

object LineCustomLayerProps {
  @scala.inline
  def apply(
    data: js.Array[LineSerieData],
    xScale: /* value */ String | Double | Date => Double,
    yScale: /* value */ String | Double | Date => Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    areaBaselineValue: LineValue = null,
    areaBlendMode: String = null,
    areaOpacity: Int | Double = null,
    axisBottom: AxisProps = null,
    axisLeft: AxisProps = null,
    axisRight: AxisProps = null,
    axisTop: AxisProps = null,
    colors: OrdinalColorsInstruction[_] = null,
    crosshairType: CrosshairType = null,
    curve: linear | monotoneX | monotoneY | natural | stepBefore | step | stepAfter = null,
    debugMesh: js.UndefOr[Boolean] = js.undefined,
    debugSlices: js.UndefOr[Boolean] = js.undefined,
    enableArea: js.UndefOr[Boolean] = js.undefined,
    enableCrosshair: js.UndefOr[Boolean] = js.undefined,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enablePointLabel: js.UndefOr[Boolean] = js.undefined,
    enablePoints: js.UndefOr[Boolean] = js.undefined,
    enableSlices: x | y | `false` = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    layers: js.Array[Layer] = null,
    legends: js.Array[LegendProps] = null,
    lineWidth: Int | Double = null,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    pointBorderColor: js.Any = null,
    pointBorderWidth: Int | Double = null,
    pointColor: js.Any = null,
    pointLabel: String = null,
    pointLabelYOffset: Int | Double = null,
    pointSize: Int | Double = null,
    sliceTooltip: /* data */ LineSliceData => ReactNode = null,
    theme: Theme = null,
    tooltip: TooltipProp = null,
    tooltipFormat: TooltipFormatter | String = null,
    useMesh: js.UndefOr[Boolean] = js.undefined,
    xFormat: String | DataFormatter = null,
    yFormat: String | DataFormatter = null
  ): LineCustomLayerProps = {
    val __obj = js.Dynamic.literal(data = data, xScale = js.Any.fromFunction1(xScale), yScale = js.Any.fromFunction1(yScale))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (areaBaselineValue != null) __obj.updateDynamic("areaBaselineValue")(areaBaselineValue.asInstanceOf[js.Any])
    if (areaBlendMode != null) __obj.updateDynamic("areaBlendMode")(areaBlendMode)
    if (areaOpacity != null) __obj.updateDynamic("areaOpacity")(areaOpacity.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom)
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft)
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight)
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop)
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (crosshairType != null) __obj.updateDynamic("crosshairType")(crosshairType)
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMesh)) __obj.updateDynamic("debugMesh")(debugMesh)
    if (!js.isUndefined(debugSlices)) __obj.updateDynamic("debugSlices")(debugSlices)
    if (!js.isUndefined(enableArea)) __obj.updateDynamic("enableArea")(enableArea)
    if (!js.isUndefined(enableCrosshair)) __obj.updateDynamic("enableCrosshair")(enableCrosshair)
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX)
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY)
    if (!js.isUndefined(enablePointLabel)) __obj.updateDynamic("enablePointLabel")(enablePointLabel)
    if (!js.isUndefined(enablePoints)) __obj.updateDynamic("enablePoints")(enablePoints)
    if (enableSlices != null) __obj.updateDynamic("enableSlices")(enableSlices.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (legends != null) __obj.updateDynamic("legends")(legends)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (markers != null) __obj.updateDynamic("markers")(markers)
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (pointBorderColor != null) __obj.updateDynamic("pointBorderColor")(pointBorderColor)
    if (pointBorderWidth != null) __obj.updateDynamic("pointBorderWidth")(pointBorderWidth.asInstanceOf[js.Any])
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor)
    if (pointLabel != null) __obj.updateDynamic("pointLabel")(pointLabel)
    if (pointLabelYOffset != null) __obj.updateDynamic("pointLabelYOffset")(pointLabelYOffset.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (sliceTooltip != null) __obj.updateDynamic("sliceTooltip")(js.Any.fromFunction1(sliceTooltip))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(useMesh)) __obj.updateDynamic("useMesh")(useMesh)
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineCustomLayerProps]
  }
}

