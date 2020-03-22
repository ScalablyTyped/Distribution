package typings.nivoLine.mod

import typings.nivoAxes.mod.AxisProps
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.CartesianMarkerProps
import typings.nivoCore.mod.Theme
import typings.nivoLegends.mod.LegendProps
import typings.nivoLine.ReadonlyPointSymbolProps
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

trait LineCanvasProps extends LineProps {
  var pixelRatio: js.UndefOr[Double] = js.undefined
}

object LineCanvasProps {
  @scala.inline
  def apply(
    data: js.Array[Serie],
    areaBaseDatumValue: DatumValue = null,
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
    enablePoints: js.UndefOr[Boolean] = js.undefined,
    enableSlices: x | y | `false` = null,
    gridXValues: Double | (js.Array[Date | Double | String]) = null,
    gridYValues: Double | (js.Array[Date | Double | String]) = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    layers: js.Array[Layer] = null,
    legends: js.Array[LegendProps] = null,
    lineWidth: Int | Double = null,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    onClick: (/* point */ Point, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit = null,
    onMouseEnter: (/* point */ Point, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit = null,
    onMouseLeave: (/* point */ Point, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit = null,
    onMouseMove: (/* point */ Point, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit = null,
    pixelRatio: Int | Double = null,
    pointBorderColor: js.Any = null,
    pointBorderWidth: Int | Double = null,
    pointColor: js.Any = null,
    pointSize: Int | Double = null,
    pointSymbol: /* props */ ReadonlyPointSymbolProps => ReactNode = null,
    sliceTooltip: SliceTooltip = null,
    theme: Theme = null,
    tooltip: PointTooltip = null,
    tooltipFormat: TooltipFormatter | String = null,
    xFormat: String | DataFormatter = null,
    xScale: Scale = null,
    yFormat: String | DataFormatter = null,
    yScale: Scale = null
  ): LineCanvasProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (areaBaseDatumValue != null) __obj.updateDynamic("areaBaseDatumValue")(areaBaseDatumValue.asInstanceOf[js.Any])
    if (areaOpacity != null) __obj.updateDynamic("areaOpacity")(areaOpacity.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (crosshairType != null) __obj.updateDynamic("crosshairType")(crosshairType.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMesh)) __obj.updateDynamic("debugMesh")(debugMesh.asInstanceOf[js.Any])
    if (!js.isUndefined(debugSlices)) __obj.updateDynamic("debugSlices")(debugSlices.asInstanceOf[js.Any])
    if (!js.isUndefined(enableArea)) __obj.updateDynamic("enableArea")(enableArea.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCrosshair)) __obj.updateDynamic("enableCrosshair")(enableCrosshair.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePoints)) __obj.updateDynamic("enablePoints")(enablePoints.asInstanceOf[js.Any])
    if (enableSlices != null) __obj.updateDynamic("enableSlices")(enableSlices.asInstanceOf[js.Any])
    if (gridXValues != null) __obj.updateDynamic("gridXValues")(gridXValues.asInstanceOf[js.Any])
    if (gridYValues != null) __obj.updateDynamic("gridYValues")(gridYValues.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (pointBorderColor != null) __obj.updateDynamic("pointBorderColor")(pointBorderColor.asInstanceOf[js.Any])
    if (pointBorderWidth != null) __obj.updateDynamic("pointBorderWidth")(pointBorderWidth.asInstanceOf[js.Any])
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (pointSymbol != null) __obj.updateDynamic("pointSymbol")(js.Any.fromFunction1(pointSymbol))
    if (sliceTooltip != null) __obj.updateDynamic("sliceTooltip")(sliceTooltip.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(xScale.asInstanceOf[js.Any])
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineCanvasProps]
  }
}

