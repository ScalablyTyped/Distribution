package typings.nivoLine.mod

import typings.nivoAxes.mod.AxisProps
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.CartesianMarkerProps
import typings.nivoCore.mod.MotionProps
import typings.nivoCore.mod.Theme
import typings.nivoLegends.mod.LegendProps
import typings.nivoLine.anon.ReadonlyPointSymbolProps
import typings.nivoLine.nivoLineBooleans.`false`
import typings.nivoLine.nivoLineStrings.linear
import typings.nivoLine.nivoLineStrings.monotoneX
import typings.nivoLine.nivoLineStrings.monotoneY
import typings.nivoLine.nivoLineStrings.natural
import typings.nivoLine.nivoLineStrings.step
import typings.nivoLine.nivoLineStrings.stepAfter
import typings.nivoLine.nivoLineStrings.stepBefore
import typings.nivoLine.nivoLineStrings.x
import typings.nivoLine.nivoLineStrings.y
import typings.nivoScales.mod.Scale
import typings.nivoTooltip.mod.CrosshairType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineSvgProps
  extends LineProps
     with MotionProps {
  var areaBlendMode: js.UndefOr[String] = js.undefined
  var enablePointLabel: js.UndefOr[Boolean] = js.undefined
  var pointLabel: js.UndefOr[String] = js.undefined
  var pointLabelYOffset: js.UndefOr[Double] = js.undefined
  var useMesh: js.UndefOr[Boolean] = js.undefined
}

object LineSvgProps {
  @scala.inline
  def apply(
    data: js.Array[Serie],
    animate: js.UndefOr[Boolean] = js.undefined,
    areaBaseDatumValue: DatumValue = null,
    areaBlendMode: String = null,
    areaOpacity: js.UndefOr[Double] = js.undefined,
    axisBottom: js.UndefOr[Null | AxisProps] = js.undefined,
    axisLeft: js.UndefOr[Null | AxisProps] = js.undefined,
    axisRight: js.UndefOr[Null | AxisProps] = js.undefined,
    axisTop: js.UndefOr[Null | AxisProps] = js.undefined,
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
    gridXValues: Double | (js.Array[Date | Double | String]) = null,
    gridYValues: Double | (js.Array[Date | Double | String]) = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    layers: js.Array[Layer] = null,
    legends: js.Array[LegendProps] = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    motionDamping: js.UndefOr[Double] = js.undefined,
    motionStiffness: js.UndefOr[Double] = js.undefined,
    onClick: (/* point */ Point, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit = null,
    onMouseEnter: (/* point */ Point, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit = null,
    onMouseLeave: (/* point */ Point, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit = null,
    onMouseMove: (/* point */ Point, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit = null,
    pointBorderColor: js.Any = null,
    pointBorderWidth: js.UndefOr[Double] = js.undefined,
    pointColor: js.Any = null,
    pointLabel: String = null,
    pointLabelYOffset: js.UndefOr[Double] = js.undefined,
    pointSize: js.UndefOr[Double] = js.undefined,
    pointSymbol: /* props */ ReadonlyPointSymbolProps => ReactNode = null,
    sliceTooltip: SliceTooltip = null,
    theme: Theme = null,
    tooltip: PointTooltip = null,
    tooltipFormat: TooltipFormatter | String = null,
    useMesh: js.UndefOr[Boolean] = js.undefined,
    xFormat: String | DataFormatter = null,
    xScale: Scale = null,
    yFormat: String | DataFormatter = null,
    yScale: Scale = null
  ): LineSvgProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (areaBaseDatumValue != null) __obj.updateDynamic("areaBaseDatumValue")(areaBaseDatumValue.asInstanceOf[js.Any])
    if (areaBlendMode != null) __obj.updateDynamic("areaBlendMode")(areaBlendMode.asInstanceOf[js.Any])
    if (!js.isUndefined(areaOpacity)) __obj.updateDynamic("areaOpacity")(areaOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisBottom)) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(axisLeft)) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(axisRight)) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (!js.isUndefined(axisTop)) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (crosshairType != null) __obj.updateDynamic("crosshairType")(crosshairType.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMesh)) __obj.updateDynamic("debugMesh")(debugMesh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugSlices)) __obj.updateDynamic("debugSlices")(debugSlices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableArea)) __obj.updateDynamic("enableArea")(enableArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCrosshair)) __obj.updateDynamic("enableCrosshair")(enableCrosshair.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePointLabel)) __obj.updateDynamic("enablePointLabel")(enablePointLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePoints)) __obj.updateDynamic("enablePoints")(enablePoints.get.asInstanceOf[js.Any])
    if (enableSlices != null) __obj.updateDynamic("enableSlices")(enableSlices.asInstanceOf[js.Any])
    if (gridXValues != null) __obj.updateDynamic("gridXValues")(gridXValues.asInstanceOf[js.Any])
    if (gridYValues != null) __obj.updateDynamic("gridYValues")(gridYValues.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.get.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (!js.isUndefined(motionDamping)) __obj.updateDynamic("motionDamping")(motionDamping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(motionStiffness)) __obj.updateDynamic("motionStiffness")(motionStiffness.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (pointBorderColor != null) __obj.updateDynamic("pointBorderColor")(pointBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(pointBorderWidth)) __obj.updateDynamic("pointBorderWidth")(pointBorderWidth.get.asInstanceOf[js.Any])
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor.asInstanceOf[js.Any])
    if (pointLabel != null) __obj.updateDynamic("pointLabel")(pointLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(pointLabelYOffset)) __obj.updateDynamic("pointLabelYOffset")(pointLabelYOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pointSize)) __obj.updateDynamic("pointSize")(pointSize.get.asInstanceOf[js.Any])
    if (pointSymbol != null) __obj.updateDynamic("pointSymbol")(js.Any.fromFunction1(pointSymbol))
    if (sliceTooltip != null) __obj.updateDynamic("sliceTooltip")(sliceTooltip.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(useMesh)) __obj.updateDynamic("useMesh")(useMesh.get.asInstanceOf[js.Any])
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(xScale.asInstanceOf[js.Any])
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSvgProps]
  }
}

