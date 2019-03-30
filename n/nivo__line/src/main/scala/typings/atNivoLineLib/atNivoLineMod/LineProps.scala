package typings
package atNivoLineLib.atNivoLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProps
  extends atNivoCoreLib.atNivoCoreMod.ColorProps[LineComputedSerieData] {
  var areaBaselineValue: js.UndefOr[scala.Double | java.lang.String | stdLib.Date] = js.undefined
  var areaBlendMode: js.UndefOr[java.lang.String] = js.undefined
  var areaOpacity: js.UndefOr[scala.Double] = js.undefined
  var axisBottom: js.UndefOr[atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null] = js.undefined
  var axisLeft: js.UndefOr[atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null] = js.undefined
  var axisRight: js.UndefOr[atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null] = js.undefined
  var axisTop: js.UndefOr[atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null] = js.undefined
  var curve: js.UndefOr[
    atNivoLineLib.atNivoLineLibStrings.linear | atNivoLineLib.atNivoLineLibStrings.monotoneX | atNivoLineLib.atNivoLineLibStrings.monotoneY | atNivoLineLib.atNivoLineLibStrings.natural | atNivoLineLib.atNivoLineLibStrings.stepBefore | atNivoLineLib.atNivoLineLibStrings.step | atNivoLineLib.atNivoLineLibStrings.stepAfter
  ] = js.undefined
  var data: js.Array[LineSerieData]
  var dotBorderColor: js.UndefOr[js.Any] = js.undefined
  var dotBorderWidth: js.UndefOr[scala.Double] = js.undefined
  var dotColor: js.UndefOr[js.Any] = js.undefined
  var dotSize: js.UndefOr[scala.Double] = js.undefined
  var enableArea: js.UndefOr[scala.Boolean] = js.undefined
  var enableDotLabel: js.UndefOr[scala.Boolean] = js.undefined
  var enableDots: js.UndefOr[scala.Boolean] = js.undefined
  var enableGridX: js.UndefOr[scala.Boolean] = js.undefined
  var enableGridY: js.UndefOr[scala.Boolean] = js.undefined
  var enableStackTooltip: js.UndefOr[scala.Boolean] = js.undefined
  var isInteractive: js.UndefOr[scala.Boolean] = js.undefined
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  var legends: js.UndefOr[js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps]] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var margin: js.UndefOr[atNivoCoreLib.atNivoCoreMod.Box] = js.undefined
  var markers: js.UndefOr[js.Array[atNivoCoreLib.atNivoCoreMod.CartesianMarkerProps]] = js.undefined
  var theme: js.UndefOr[atNivoCoreLib.atNivoCoreMod.Theme] = js.undefined
  var tooltip: js.UndefOr[js.Function1[/* data */ LineSliceData, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var tooltipFormat: js.UndefOr[TooltipFormatter | java.lang.String] = js.undefined
  var xScale: js.UndefOr[atNivoScalesLib.atNivoScalesMod.Scale] = js.undefined
  var yScale: js.UndefOr[atNivoScalesLib.atNivoScalesMod.Scale] = js.undefined
}

object LineProps {
  @scala.inline
  def apply(
    data: js.Array[LineSerieData],
    areaBaselineValue: scala.Double | java.lang.String | stdLib.Date = null,
    areaBlendMode: java.lang.String = null,
    areaOpacity: scala.Int | scala.Double = null,
    axisBottom: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisLeft: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisRight: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisTop: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    colorBy: java.lang.String | atNivoCoreLib.atNivoCoreMod.GetColor[LineComputedSerieData] = null,
    colors: atNivoCoreLib.atNivoCoreMod.Colors = null,
    curve: atNivoLineLib.atNivoLineLibStrings.linear | atNivoLineLib.atNivoLineLibStrings.monotoneX | atNivoLineLib.atNivoLineLibStrings.monotoneY | atNivoLineLib.atNivoLineLibStrings.natural | atNivoLineLib.atNivoLineLibStrings.stepBefore | atNivoLineLib.atNivoLineLibStrings.step | atNivoLineLib.atNivoLineLibStrings.stepAfter = null,
    dotBorderColor: js.Any = null,
    dotBorderWidth: scala.Int | scala.Double = null,
    dotColor: js.Any = null,
    dotSize: scala.Int | scala.Double = null,
    enableArea: js.UndefOr[scala.Boolean] = js.undefined,
    enableDotLabel: js.UndefOr[scala.Boolean] = js.undefined,
    enableDots: js.UndefOr[scala.Boolean] = js.undefined,
    enableGridX: js.UndefOr[scala.Boolean] = js.undefined,
    enableGridY: js.UndefOr[scala.Boolean] = js.undefined,
    enableStackTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    isInteractive: js.UndefOr[scala.Boolean] = js.undefined,
    layers: js.Array[Layer] = null,
    legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps] = null,
    lineWidth: scala.Int | scala.Double = null,
    margin: atNivoCoreLib.atNivoCoreMod.Box = null,
    markers: js.Array[atNivoCoreLib.atNivoCoreMod.CartesianMarkerProps] = null,
    theme: atNivoCoreLib.atNivoCoreMod.Theme = null,
    tooltip: /* data */ LineSliceData => reactLib.reactMod.ReactNs.ReactNode = null,
    tooltipFormat: TooltipFormatter | java.lang.String = null,
    xScale: atNivoScalesLib.atNivoScalesMod.Scale = null,
    yScale: atNivoScalesLib.atNivoScalesMod.Scale = null
  ): LineProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (areaBaselineValue != null) __obj.updateDynamic("areaBaselineValue")(areaBaselineValue.asInstanceOf[js.Any])
    if (areaBlendMode != null) __obj.updateDynamic("areaBlendMode")(areaBlendMode)
    if (areaOpacity != null) __obj.updateDynamic("areaOpacity")(areaOpacity.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom)
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft)
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight)
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop)
    if (colorBy != null) __obj.updateDynamic("colorBy")(colorBy.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (dotBorderColor != null) __obj.updateDynamic("dotBorderColor")(dotBorderColor)
    if (dotBorderWidth != null) __obj.updateDynamic("dotBorderWidth")(dotBorderWidth.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor)
    if (dotSize != null) __obj.updateDynamic("dotSize")(dotSize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableArea)) __obj.updateDynamic("enableArea")(enableArea)
    if (!js.isUndefined(enableDotLabel)) __obj.updateDynamic("enableDotLabel")(enableDotLabel)
    if (!js.isUndefined(enableDots)) __obj.updateDynamic("enableDots")(enableDots)
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX)
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY)
    if (!js.isUndefined(enableStackTooltip)) __obj.updateDynamic("enableStackTooltip")(enableStackTooltip)
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (legends != null) __obj.updateDynamic("legends")(legends)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (markers != null) __obj.updateDynamic("markers")(markers)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction1(tooltip))
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(xScale)
    if (yScale != null) __obj.updateDynamic("yScale")(yScale)
    __obj.asInstanceOf[LineProps]
  }
}

