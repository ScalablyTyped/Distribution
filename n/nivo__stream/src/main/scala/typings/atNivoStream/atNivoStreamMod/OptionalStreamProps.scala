package typings.atNivoStream.atNivoStreamMod

import typings.atNivoAxes.atNivoAxesMod.AxisProps
import typings.atNivoColors.atNivoColorsMod.InheritedColorProp
import typings.atNivoColors.atNivoColorsMod.OrdinalColorsInstruction
import typings.atNivoCore.Anon_
import typings.atNivoCore.Anon_Id
import typings.atNivoCore.atNivoCoreMod.AreaCurve
import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.StackOffset
import typings.atNivoCore.atNivoCoreMod.StackOrder
import typings.atNivoCore.atNivoCoreMod.SvgDefsAndFill
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.atNivoLegends.atNivoLegendsMod.LegendProps
import typings.atNivoScales.atNivoScalesMod.Scale
import typings.atNivoStream.Anon_0
import typings.atNivoStream.atNivoStreamStrings.center
import typings.atNivoStream.atNivoStreamStrings.end
import typings.atNivoStream.atNivoStreamStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @nivo/core.Anon_Animate ]:? @nivo/core.Anon_Animate[P]} */ trait OptionalStreamProps[T] extends SvgDefsAndFill[T] {
  var axisBottom: AxisProps | Null
  var axisLeft: AxisProps | Null
  var axisRight: AxisProps | Null
  var axisTop: AxisProps | Null
  var borderColor: InheritedColorProp[_]
  var borderWidth: Double
  var colors: OrdinalColorsInstruction[_]
  var curve: AreaCurve
  var dotBorderColor: InheritedColorProp[_]
  var dotBorderWidth: DatumToNumber | Double
  var dotColor: InheritedColorProp[_]
  var dotPosition: start | center | end
  var dotSize: DatumToNumber | Double
  var enableDots: Boolean
  var enableGridX: Boolean
  var enableGridY: Boolean
  var enableStackTooltip: Boolean
  var fillOpacity: Double
  var isInteractive: Boolean
  var legends: js.Array[LegendProps]
  var margin: Box
  var offsetType: StackOffset
  var order: StackOrder
  var renderDot: StreamDotsItem
  var stack: StackFunc[T]
  var theme: Theme
  var tooltipFormat: TooltipFormatter[T] | String
  var tooltipLabel: TooltipLabel[T]
  var xScale: Scale
  var yScale: Scale
}

object OptionalStreamProps {
  @scala.inline
  def apply[T](
    borderColor: InheritedColorProp[_],
    borderWidth: Double,
    colors: OrdinalColorsInstruction[_],
    curve: AreaCurve,
    dotBorderColor: InheritedColorProp[_],
    dotBorderWidth: DatumToNumber | Double,
    dotColor: InheritedColorProp[_],
    dotPosition: start | center | end,
    dotSize: DatumToNumber | Double,
    enableDots: Boolean,
    enableGridX: Boolean,
    enableGridY: Boolean,
    enableStackTooltip: Boolean,
    fillOpacity: Double,
    isInteractive: Boolean,
    legends: js.Array[LegendProps],
    margin: Box,
    offsetType: StackOffset,
    order: StackOrder,
    renderDot: StreamDotsItem,
    stack: /* data */ js.Array[T] => js.Array[js.Array[Anon_0[T]]],
    theme: Theme,
    tooltipFormat: TooltipFormatter[T] | String,
    tooltipLabel: T => String,
    xScale: Scale,
    yScale: Scale,
    axisBottom: AxisProps = null,
    axisLeft: AxisProps = null,
    axisRight: AxisProps = null,
    axisTop: AxisProps = null,
    defs: js.Array[Anon_Id] = null,
    fill: js.Array[Anon_[T]] = null
  ): OptionalStreamProps[T] = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth, colors = colors.asInstanceOf[js.Any], curve = curve, dotBorderColor = dotBorderColor.asInstanceOf[js.Any], dotBorderWidth = dotBorderWidth.asInstanceOf[js.Any], dotColor = dotColor.asInstanceOf[js.Any], dotPosition = dotPosition.asInstanceOf[js.Any], dotSize = dotSize.asInstanceOf[js.Any], enableDots = enableDots, enableGridX = enableGridX, enableGridY = enableGridY, enableStackTooltip = enableStackTooltip, fillOpacity = fillOpacity, isInteractive = isInteractive, legends = legends, margin = margin, offsetType = offsetType, order = order, renderDot = renderDot, stack = js.Any.fromFunction1(stack), theme = theme, tooltipFormat = tooltipFormat.asInstanceOf[js.Any], tooltipLabel = js.Any.fromFunction1(tooltipLabel), xScale = xScale, yScale = yScale)
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom)
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft)
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight)
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop)
    if (defs != null) __obj.updateDynamic("defs")(defs)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    __obj.asInstanceOf[OptionalStreamProps[T]]
  }
}

