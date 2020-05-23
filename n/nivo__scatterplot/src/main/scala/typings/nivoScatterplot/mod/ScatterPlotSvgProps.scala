package typings.nivoScatterplot.mod

import typings.nivoAxes.mod.AxisProps
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.CartesianMarkerProps
import typings.nivoCore.mod.CssMixBlendMode
import typings.nivoCore.mod.MotionProps
import typings.nivoCore.mod.Theme
import typings.nivoLegends.mod.LegendProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterPlotSvgProps
  extends ScatterPlotProps
     with MotionProps {
  var layers: js.UndefOr[js.Array[CustomLayerId | CustomSvgLayer]] = js.undefined
  var markers: js.UndefOr[js.Array[CartesianMarkerProps]] = js.undefined
  var renderNode: js.UndefOr[NodeComponent] = js.undefined
}

object ScatterPlotSvgProps {
  @scala.inline
  def apply(
    data: js.Array[Serie],
    animate: js.UndefOr[Boolean] = js.undefined,
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
    layers: js.Array[CustomLayerId | CustomSvgLayer] = null,
    legends: js.Array[LegendProps] = null,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    motionDamping: js.UndefOr[Double] = js.undefined,
    motionStiffness: js.UndefOr[Double] = js.undefined,
    nodeSize: Double | DerivedDatumProp[Double] | DynamicSizeSpec = null,
    onClick: (/* node */ Node, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseEnter: (/* node */ Node, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseLeave: (/* node */ Node, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseMove: (/* node */ Node, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    renderNode: /* props */ NodeProps => ReactNode = null,
    theme: Theme = null,
    tooltip: /* hasNode */ js.Any => ReactNode = null,
    useMesh: js.UndefOr[Boolean] = js.undefined,
    xFormat: String | ValueFormatter = null,
    xScale: /* value */ Value => Double = null,
    yFormat: String | ValueFormatter = null,
    yScale: /* value */ Value => Double = null
  ): ScatterPlotSvgProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
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
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (!js.isUndefined(motionDamping)) __obj.updateDynamic("motionDamping")(motionDamping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(motionStiffness)) __obj.updateDynamic("motionStiffness")(motionStiffness.get.asInstanceOf[js.Any])
    if (nodeSize != null) __obj.updateDynamic("nodeSize")(nodeSize.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (renderNode != null) __obj.updateDynamic("renderNode")(js.Any.fromFunction1(renderNode))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction1(tooltip))
    if (!js.isUndefined(useMesh)) __obj.updateDynamic("useMesh")(useMesh.get.asInstanceOf[js.Any])
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(js.Any.fromFunction1(xScale))
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(js.Any.fromFunction1(yScale))
    __obj.asInstanceOf[ScatterPlotSvgProps]
  }
}

