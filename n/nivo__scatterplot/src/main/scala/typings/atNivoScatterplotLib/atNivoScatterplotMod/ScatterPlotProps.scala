package typings
package atNivoScatterplotLib.atNivoScatterplotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterPlotProps extends js.Object {
  var axisBottom: js.UndefOr[atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null] = js.undefined
  var axisLeft: js.UndefOr[atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null] = js.undefined
  var axisRight: js.UndefOr[atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null] = js.undefined
  var axisTop: js.UndefOr[atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null] = js.undefined
  var data: js.Array[atNivoScatterplotLib.Anon_Data]
  var debugMesh: js.UndefOr[scala.Boolean] = js.undefined
  var enableGridX: js.UndefOr[scala.Boolean] = js.undefined
  var enableGridY: js.UndefOr[scala.Boolean] = js.undefined
  var isInteractive: js.UndefOr[scala.Boolean] = js.undefined
  var legends: js.UndefOr[js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps]] = js.undefined
  var margin: js.UndefOr[atNivoCoreLib.atNivoCoreMod.Box] = js.undefined
  var onClick: js.UndefOr[ScatterPlotMouseHandler] = js.undefined
  var onMouseEnter: js.UndefOr[ScatterPlotMouseHandler] = js.undefined
  var onMouseLeave: js.UndefOr[ScatterPlotMouseHandler] = js.undefined
  var onMouseMove: js.UndefOr[ScatterPlotMouseHandler] = js.undefined
  var symbolShape: js.UndefOr[
    atNivoScatterplotLib.atNivoScatterplotLibStrings.circle | atNivoScatterplotLib.atNivoScatterplotLibStrings.square
  ] = js.undefined
  var symbolSize: js.UndefOr[scala.Double | ScatterPlotSizeGetter] = js.undefined
  var theme: js.UndefOr[atNivoCoreLib.atNivoCoreMod.Theme] = js.undefined
  var tooltip: js.UndefOr[js.Function1[/* data */ ScatterPlotDatum, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var tooltipFormat: js.UndefOr[TooltipFormatter] = js.undefined
  var useMesh: js.UndefOr[scala.Boolean] = js.undefined
  var xScale: js.UndefOr[atNivoScalesLib.atNivoScalesMod.Scale] = js.undefined
  var yScale: js.UndefOr[atNivoScalesLib.atNivoScalesMod.Scale] = js.undefined
}

object ScatterPlotProps {
  @scala.inline
  def apply(
    data: js.Array[atNivoScatterplotLib.Anon_Data],
    axisBottom: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisLeft: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisRight: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisTop: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    debugMesh: js.UndefOr[scala.Boolean] = js.undefined,
    enableGridX: js.UndefOr[scala.Boolean] = js.undefined,
    enableGridY: js.UndefOr[scala.Boolean] = js.undefined,
    isInteractive: js.UndefOr[scala.Boolean] = js.undefined,
    legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps] = null,
    margin: atNivoCoreLib.atNivoCoreMod.Box = null,
    onClick: ScatterPlotMouseHandler = null,
    onMouseEnter: ScatterPlotMouseHandler = null,
    onMouseLeave: ScatterPlotMouseHandler = null,
    onMouseMove: ScatterPlotMouseHandler = null,
    symbolShape: atNivoScatterplotLib.atNivoScatterplotLibStrings.circle | atNivoScatterplotLib.atNivoScatterplotLibStrings.square = null,
    symbolSize: scala.Double | ScatterPlotSizeGetter = null,
    theme: atNivoCoreLib.atNivoCoreMod.Theme = null,
    tooltip: /* data */ ScatterPlotDatum => reactLib.reactMod.ReactNs.ReactNode = null,
    tooltipFormat: TooltipFormatter = null,
    useMesh: js.UndefOr[scala.Boolean] = js.undefined,
    xScale: atNivoScalesLib.atNivoScalesMod.Scale = null,
    yScale: atNivoScalesLib.atNivoScalesMod.Scale = null
  ): ScatterPlotProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom)
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft)
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight)
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop)
    if (!js.isUndefined(debugMesh)) __obj.updateDynamic("debugMesh")(debugMesh)
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX)
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY)
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (legends != null) __obj.updateDynamic("legends")(legends)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (symbolShape != null) __obj.updateDynamic("symbolShape")(symbolShape.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction1(tooltip))
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat)
    if (!js.isUndefined(useMesh)) __obj.updateDynamic("useMesh")(useMesh)
    if (xScale != null) __obj.updateDynamic("xScale")(xScale)
    if (yScale != null) __obj.updateDynamic("yScale")(yScale)
    __obj.asInstanceOf[ScatterPlotProps]
  }
}

