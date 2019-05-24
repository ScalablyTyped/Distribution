package typings
package atNivoScatterplotLib.atNivoScatterplotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @nivo/core.Anon_Animate ]:? @nivo/core.Anon_Animate[P]} */ trait ScatterPlotSvgProps extends ScatterPlotProps {
  var markers: js.UndefOr[js.Array[atNivoCoreLib.atNivoCoreMod.CartesianMarkerProps]] = js.undefined
}

object ScatterPlotSvgProps {
  @scala.inline
  def apply(
    data: js.Array[atNivoScatterplotLib.Anon_Data],
    axisBottom: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisLeft: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisRight: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisTop: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    colors: atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_] = null,
    debugMesh: js.UndefOr[scala.Boolean] = js.undefined,
    enableGridX: js.UndefOr[scala.Boolean] = js.undefined,
    enableGridY: js.UndefOr[scala.Boolean] = js.undefined,
    isInteractive: js.UndefOr[scala.Boolean] = js.undefined,
    legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps] = null,
    margin: atNivoCoreLib.atNivoCoreMod.Box = null,
    markers: js.Array[atNivoCoreLib.atNivoCoreMod.CartesianMarkerProps] = null,
    onClick: ScatterPlotMouseHandler = null,
    onMouseEnter: ScatterPlotMouseHandler = null,
    onMouseLeave: ScatterPlotMouseHandler = null,
    onMouseMove: ScatterPlotMouseHandler = null,
    symbolShape: atNivoScatterplotLib.atNivoScatterplotLibStrings.circle | atNivoScatterplotLib.atNivoScatterplotLibStrings.square = null,
    symbolSize: scala.Double | ScatterPlotSizeGetter = null,
    theme: atNivoCoreLib.atNivoCoreMod.Theme = null,
    tooltip: /* data */ ScatterPlotDatum => reactLib.reactMod.ReactNode = null,
    tooltipFormat: TooltipFormatter = null,
    useMesh: js.UndefOr[scala.Boolean] = js.undefined,
    xScale: atNivoScalesLib.atNivoScalesMod.Scale = null,
    yScale: atNivoScalesLib.atNivoScalesMod.Scale = null
  ): ScatterPlotSvgProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom)
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft)
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight)
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop)
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMesh)) __obj.updateDynamic("debugMesh")(debugMesh)
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX)
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY)
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (legends != null) __obj.updateDynamic("legends")(legends)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (markers != null) __obj.updateDynamic("markers")(markers)
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
    __obj.asInstanceOf[ScatterPlotSvgProps]
  }
}

