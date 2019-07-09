package typings
package atNivoStreamLib.atNivoStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @nivo/core.Anon_Animate ]:? @nivo/core.Anon_Animate[P]} */ trait OptionalStreamProps[T]
  extends atNivoCoreLib.atNivoCoreMod.SvgDefsAndFill[T] {
  var axisBottom: atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null
  var axisLeft: atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null
  var axisRight: atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null
  var axisTop: atNivoAxesLib.atNivoAxesMod.AxisProps | scala.Null
  var borderColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_]
  var borderWidth: scala.Double
  var colors: atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_]
  var curve: atNivoCoreLib.atNivoCoreMod.AreaCurve
  var dotBorderColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_]
  var dotBorderWidth: DatumToNumber | scala.Double
  var dotColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_]
  var dotPosition: atNivoStreamLib.atNivoStreamLibStrings.start | atNivoStreamLib.atNivoStreamLibStrings.center | atNivoStreamLib.atNivoStreamLibStrings.end
  var dotSize: DatumToNumber | scala.Double
  var enableDots: scala.Boolean
  var enableGridX: scala.Boolean
  var enableGridY: scala.Boolean
  var enableStackTooltip: scala.Boolean
  var fillOpacity: scala.Double
  var isInteractive: scala.Boolean
  var legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps]
  var margin: atNivoCoreLib.atNivoCoreMod.Box
  var offsetType: atNivoCoreLib.atNivoCoreMod.StackOffset
  var order: atNivoCoreLib.atNivoCoreMod.StackOrder
  var renderDot: StreamDotsItem
  var stack: StackFunc[T]
  var theme: atNivoCoreLib.atNivoCoreMod.Theme
  var tooltipFormat: TooltipFormatter[T] | java.lang.String
  var tooltipLabel: TooltipLabel[T]
  var xScale: atNivoScalesLib.atNivoScalesMod.Scale
  var yScale: atNivoScalesLib.atNivoScalesMod.Scale
}

object OptionalStreamProps {
  @scala.inline
  def apply[T](
    borderColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_],
    borderWidth: scala.Double,
    colors: atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_],
    curve: atNivoCoreLib.atNivoCoreMod.AreaCurve,
    dotBorderColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_],
    dotBorderWidth: DatumToNumber | scala.Double,
    dotColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_],
    dotPosition: atNivoStreamLib.atNivoStreamLibStrings.start | atNivoStreamLib.atNivoStreamLibStrings.center | atNivoStreamLib.atNivoStreamLibStrings.end,
    dotSize: DatumToNumber | scala.Double,
    enableDots: scala.Boolean,
    enableGridX: scala.Boolean,
    enableGridY: scala.Boolean,
    enableStackTooltip: scala.Boolean,
    fillOpacity: scala.Double,
    isInteractive: scala.Boolean,
    legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps],
    margin: atNivoCoreLib.atNivoCoreMod.Box,
    offsetType: atNivoCoreLib.atNivoCoreMod.StackOffset,
    order: atNivoCoreLib.atNivoCoreMod.StackOrder,
    renderDot: StreamDotsItem,
    stack: StackFunc[T],
    theme: atNivoCoreLib.atNivoCoreMod.Theme,
    tooltipFormat: TooltipFormatter[T] | java.lang.String,
    tooltipLabel: TooltipLabel[T],
    xScale: atNivoScalesLib.atNivoScalesMod.Scale,
    yScale: atNivoScalesLib.atNivoScalesMod.Scale,
    axisBottom: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisLeft: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisRight: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    axisTop: atNivoAxesLib.atNivoAxesMod.AxisProps = null,
    defs: js.Array[atNivoCoreLib.Anon_Id] = null,
    fill: js.Array[atNivoCoreLib.Anon_[T]] = null
  ): OptionalStreamProps[T] = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth, colors = colors.asInstanceOf[js.Any], curve = curve, dotBorderColor = dotBorderColor.asInstanceOf[js.Any], dotBorderWidth = dotBorderWidth.asInstanceOf[js.Any], dotColor = dotColor.asInstanceOf[js.Any], dotPosition = dotPosition.asInstanceOf[js.Any], dotSize = dotSize.asInstanceOf[js.Any], enableDots = enableDots, enableGridX = enableGridX, enableGridY = enableGridY, enableStackTooltip = enableStackTooltip, fillOpacity = fillOpacity, isInteractive = isInteractive, legends = legends, margin = margin, offsetType = offsetType, order = order, renderDot = renderDot, stack = stack, theme = theme, tooltipFormat = tooltipFormat.asInstanceOf[js.Any], tooltipLabel = tooltipLabel, xScale = xScale, yScale = yScale)
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom)
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft)
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight)
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop)
    if (defs != null) __obj.updateDynamic("defs")(defs)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    __obj.asInstanceOf[OptionalStreamProps[T]]
  }
}

