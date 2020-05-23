package typings.nivoScatterplot.mod

import typings.nivoAxes.mod.AxisProps
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.CssMixBlendMode
import typings.nivoCore.mod.Theme
import typings.nivoLegends.mod.LegendProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterPlotProps extends js.Object {
  var axisBottom: js.UndefOr[AxisProps | Null] = js.undefined
  var axisLeft: js.UndefOr[AxisProps | Null] = js.undefined
  var axisRight: js.UndefOr[AxisProps | Null] = js.undefined
  var axisTop: js.UndefOr[AxisProps | Null] = js.undefined
  var blendMode: js.UndefOr[CssMixBlendMode] = js.undefined
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.undefined
  var data: js.Array[Serie]
  var debugMesh: js.UndefOr[Boolean] = js.undefined
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var nodeSize: js.UndefOr[Double | DerivedDatumProp[Double] | DynamicSizeSpec] = js.undefined
  var onClick: js.UndefOr[MouseHandler] = js.undefined
  var onMouseEnter: js.UndefOr[MouseHandler] = js.undefined
  var onMouseLeave: js.UndefOr[MouseHandler] = js.undefined
  var onMouseMove: js.UndefOr[MouseHandler] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltip: js.UndefOr[CustomTooltip] = js.undefined
  var useMesh: js.UndefOr[Boolean] = js.undefined
  var xFormat: js.UndefOr[String | ValueFormatter] = js.undefined
  var xScale: js.UndefOr[Scale] = js.undefined
  var yFormat: js.UndefOr[String | ValueFormatter] = js.undefined
  var yScale: js.UndefOr[Scale] = js.undefined
}

object ScatterPlotProps {
  @scala.inline
  def apply(
    data: js.Array[Serie],
    axisBottom: js.UndefOr[Null | AxisProps] = js.undefined,
    axisLeft: js.UndefOr[Null | AxisProps] = js.undefined,
    axisRight: js.UndefOr[Null | AxisProps] = js.undefined,
    axisTop: js.UndefOr[Null | AxisProps] = js.undefined,
    blendMode: CssMixBlendMode = null,
    colors: OrdinalColorsInstruction[_] = null,
    debugMesh: js.UndefOr[Boolean] = js.undefined,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    legends: js.Array[LegendProps] = null,
    margin: Box = null,
    nodeSize: Double | DerivedDatumProp[Double] | DynamicSizeSpec = null,
    onClick: (/* node */ Node, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseEnter: (/* node */ Node, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseLeave: (/* node */ Node, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseMove: (/* node */ Node, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    theme: Theme = null,
    tooltip: /* hasNode */ js.Any => ReactNode = null,
    useMesh: js.UndefOr[Boolean] = js.undefined,
    xFormat: String | ValueFormatter = null,
    xScale: /* value */ Value => Double = null,
    yFormat: String | ValueFormatter = null,
    yScale: /* value */ Value => Double = null
  ): ScatterPlotProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(axisBottom)) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(axisLeft)) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(axisRight)) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (!js.isUndefined(axisTop)) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMesh)) __obj.updateDynamic("debugMesh")(debugMesh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.get.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (nodeSize != null) __obj.updateDynamic("nodeSize")(nodeSize.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction1(tooltip))
    if (!js.isUndefined(useMesh)) __obj.updateDynamic("useMesh")(useMesh.get.asInstanceOf[js.Any])
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(js.Any.fromFunction1(xScale))
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(js.Any.fromFunction1(yScale))
    __obj.asInstanceOf[ScatterPlotProps]
  }
}

