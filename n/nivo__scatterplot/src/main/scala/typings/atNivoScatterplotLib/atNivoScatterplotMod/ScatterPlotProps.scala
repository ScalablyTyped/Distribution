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
  var blendMode: js.UndefOr[atNivoCoreLib.atNivoCoreMod.CssMixBlendMode] = js.undefined
  var colors: js.UndefOr[atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_]] = js.undefined
  var data: js.Array[Serie]
  var debugMesh: js.UndefOr[scala.Boolean] = js.undefined
  var enableGridX: js.UndefOr[scala.Boolean] = js.undefined
  var enableGridY: js.UndefOr[scala.Boolean] = js.undefined
  var isInteractive: js.UndefOr[scala.Boolean] = js.undefined
  var legends: js.UndefOr[js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps]] = js.undefined
  var margin: js.UndefOr[atNivoCoreLib.atNivoCoreMod.Box] = js.undefined
  var nodeSize: js.UndefOr[scala.Double | DerivedDatumProp[scala.Double] | DynamicSizeSpec] = js.undefined
  var onClick: js.UndefOr[MouseHandler] = js.undefined
  var onMouseEnter: js.UndefOr[MouseHandler] = js.undefined
  var onMouseLeave: js.UndefOr[MouseHandler] = js.undefined
  var onMouseMove: js.UndefOr[MouseHandler] = js.undefined
  var theme: js.UndefOr[atNivoCoreLib.atNivoCoreMod.Theme] = js.undefined
  var tooltip: js.UndefOr[CustomTooltip] = js.undefined
  var useMesh: js.UndefOr[scala.Boolean] = js.undefined
  var xFormat: js.UndefOr[java.lang.String | ValueFormatter] = js.undefined
  var xScale: js.UndefOr[Scale] = js.undefined
  var yFormat: js.UndefOr[java.lang.String | ValueFormatter] = js.undefined
  var yScale: js.UndefOr[Scale] = js.undefined
}

object ScatterPlotProps {
  @scala.inline
  def apply(
    data: js.Array[Serie],
    axisBottom: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisLeft: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisRight: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisTop: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    blendMode: atNivoCoreLib.atNivoCoreMod.CssMixBlendMode = null,
    colors: atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_] = null,
    debugMesh: js.UndefOr[scala.Boolean] = js.undefined,
    enableGridX: js.UndefOr[scala.Boolean] = js.undefined,
    enableGridY: js.UndefOr[scala.Boolean] = js.undefined,
    isInteractive: js.UndefOr[scala.Boolean] = js.undefined,
    legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps] = null,
    margin: atNivoCoreLib.atNivoCoreMod.Box = null,
    nodeSize: scala.Double | DerivedDatumProp[scala.Double] | DynamicSizeSpec = null,
    onClick: MouseHandler = null,
    onMouseEnter: MouseHandler = null,
    onMouseLeave: MouseHandler = null,
    onMouseMove: MouseHandler = null,
    theme: atNivoCoreLib.atNivoCoreMod.Theme = null,
    tooltip: CustomTooltip = null,
    useMesh: js.UndefOr[scala.Boolean] = js.undefined,
    xFormat: java.lang.String | ValueFormatter = null,
    xScale: Scale = null,
    yFormat: java.lang.String | ValueFormatter = null,
    yScale: Scale = null
  ): ScatterPlotProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom)
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft)
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight)
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop)
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode)
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMesh)) __obj.updateDynamic("debugMesh")(debugMesh)
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX)
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY)
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (legends != null) __obj.updateDynamic("legends")(legends)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (nodeSize != null) __obj.updateDynamic("nodeSize")(nodeSize.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(useMesh)) __obj.updateDynamic("useMesh")(useMesh)
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(xScale)
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(yScale)
    __obj.asInstanceOf[ScatterPlotProps]
  }
}

