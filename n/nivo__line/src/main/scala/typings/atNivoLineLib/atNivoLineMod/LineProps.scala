package typings
package atNivoLineLib.atNivoLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProps extends js.Object {
  var areaBaselineValue: js.UndefOr[LineValue] = js.undefined
  var areaOpacity: js.UndefOr[scala.Double] = js.undefined
  var axisBottom: js.UndefOr[atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null] = js.undefined
  var axisLeft: js.UndefOr[atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null] = js.undefined
  var axisRight: js.UndefOr[atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null] = js.undefined
  var axisTop: js.UndefOr[atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null] = js.undefined
  var colors: js.UndefOr[atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_]] = js.undefined
  var crosshairType: js.UndefOr[atNivoTooltipLib.atNivoTooltipMod.CrosshairType] = js.undefined
  var curve: js.UndefOr[
    atNivoLineLib.atNivoLineLibStrings.linear | atNivoLineLib.atNivoLineLibStrings.monotoneX | atNivoLineLib.atNivoLineLibStrings.monotoneY | atNivoLineLib.atNivoLineLibStrings.natural | atNivoLineLib.atNivoLineLibStrings.stepBefore | atNivoLineLib.atNivoLineLibStrings.step | atNivoLineLib.atNivoLineLibStrings.stepAfter
  ] = js.undefined
  var data: js.Array[LineSerieData]
  var debugMesh: js.UndefOr[scala.Boolean] = js.undefined
  var debugSlices: js.UndefOr[scala.Boolean] = js.undefined
  var enableArea: js.UndefOr[scala.Boolean] = js.undefined
  var enableCrosshair: js.UndefOr[scala.Boolean] = js.undefined
  var enableGridX: js.UndefOr[scala.Boolean] = js.undefined
  var enableGridY: js.UndefOr[scala.Boolean] = js.undefined
  var enablePoints: js.UndefOr[scala.Boolean] = js.undefined
  var enableSlices: js.UndefOr[
    atNivoLineLib.atNivoLineLibStrings.x | atNivoLineLib.atNivoLineLibStrings.y | atNivoLineLib.atNivoLineLibNumbers.`false`
  ] = js.undefined
  var isInteractive: js.UndefOr[scala.Boolean] = js.undefined
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  var legends: js.UndefOr[js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps]] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var margin: js.UndefOr[atNivoCoreLib.atNivoCoreMod.Box] = js.undefined
  var markers: js.UndefOr[js.Array[atNivoCoreLib.atNivoCoreMod.CartesianMarkerProps]] = js.undefined
  var pointBorderColor: js.UndefOr[js.Any] = js.undefined
  var pointBorderWidth: js.UndefOr[scala.Double] = js.undefined
  var pointColor: js.UndefOr[js.Any] = js.undefined
  var pointSize: js.UndefOr[scala.Double] = js.undefined
  var sliceTooltip: js.UndefOr[js.Function1[/* data */ LineSliceData, reactLib.reactMod.ReactNode]] = js.undefined
  var theme: js.UndefOr[atNivoCoreLib.atNivoCoreMod.Theme] = js.undefined
  var tooltip: js.UndefOr[TooltipProp] = js.undefined
  var tooltipFormat: js.UndefOr[TooltipFormatter | java.lang.String] = js.undefined
  var xFormat: js.UndefOr[java.lang.String | DataFormatter] = js.undefined
  var xScale: js.UndefOr[atNivoScalesLib.atNivoScalesMod.Scale] = js.undefined
  var yFormat: js.UndefOr[java.lang.String | DataFormatter] = js.undefined
  var yScale: js.UndefOr[atNivoScalesLib.atNivoScalesMod.Scale] = js.undefined
}

object LineProps {
  @scala.inline
  def apply(
    data: js.Array[LineSerieData],
    areaBaselineValue: LineValue = null,
    areaOpacity: scala.Int | scala.Double = null,
    axisBottom: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisLeft: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisRight: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisTop: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    colors: atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_] = null,
    crosshairType: atNivoTooltipLib.atNivoTooltipMod.CrosshairType = null,
    curve: atNivoLineLib.atNivoLineLibStrings.linear | atNivoLineLib.atNivoLineLibStrings.monotoneX | atNivoLineLib.atNivoLineLibStrings.monotoneY | atNivoLineLib.atNivoLineLibStrings.natural | atNivoLineLib.atNivoLineLibStrings.stepBefore | atNivoLineLib.atNivoLineLibStrings.step | atNivoLineLib.atNivoLineLibStrings.stepAfter = null,
    debugMesh: js.UndefOr[scala.Boolean] = js.undefined,
    debugSlices: js.UndefOr[scala.Boolean] = js.undefined,
    enableArea: js.UndefOr[scala.Boolean] = js.undefined,
    enableCrosshair: js.UndefOr[scala.Boolean] = js.undefined,
    enableGridX: js.UndefOr[scala.Boolean] = js.undefined,
    enableGridY: js.UndefOr[scala.Boolean] = js.undefined,
    enablePoints: js.UndefOr[scala.Boolean] = js.undefined,
    enableSlices: atNivoLineLib.atNivoLineLibStrings.x | atNivoLineLib.atNivoLineLibStrings.y | atNivoLineLib.atNivoLineLibNumbers.`false` = null,
    isInteractive: js.UndefOr[scala.Boolean] = js.undefined,
    layers: js.Array[Layer] = null,
    legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps] = null,
    lineWidth: scala.Int | scala.Double = null,
    margin: atNivoCoreLib.atNivoCoreMod.Box = null,
    markers: js.Array[atNivoCoreLib.atNivoCoreMod.CartesianMarkerProps] = null,
    pointBorderColor: js.Any = null,
    pointBorderWidth: scala.Int | scala.Double = null,
    pointColor: js.Any = null,
    pointSize: scala.Int | scala.Double = null,
    sliceTooltip: /* data */ LineSliceData => reactLib.reactMod.ReactNode = null,
    theme: atNivoCoreLib.atNivoCoreMod.Theme = null,
    tooltip: TooltipProp = null,
    tooltipFormat: TooltipFormatter | java.lang.String = null,
    xFormat: java.lang.String | DataFormatter = null,
    xScale: atNivoScalesLib.atNivoScalesMod.Scale = null,
    yFormat: java.lang.String | DataFormatter = null,
    yScale: atNivoScalesLib.atNivoScalesMod.Scale = null
  ): LineProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (areaBaselineValue != null) __obj.updateDynamic("areaBaselineValue")(areaBaselineValue.asInstanceOf[js.Any])
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
    if (!js.isUndefined(enablePoints)) __obj.updateDynamic("enablePoints")(enablePoints)
    if (enableSlices != null) __obj.updateDynamic("enableSlices")(enableSlices.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (legends != null) __obj.updateDynamic("legends")(legends)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (markers != null) __obj.updateDynamic("markers")(markers)
    if (pointBorderColor != null) __obj.updateDynamic("pointBorderColor")(pointBorderColor)
    if (pointBorderWidth != null) __obj.updateDynamic("pointBorderWidth")(pointBorderWidth.asInstanceOf[js.Any])
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor)
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (sliceTooltip != null) __obj.updateDynamic("sliceTooltip")(js.Any.fromFunction1(sliceTooltip))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(xScale)
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(yScale)
    __obj.asInstanceOf[LineProps]
  }
}

