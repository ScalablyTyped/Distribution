package typings.atNivoBar.atNivoBarMod

import typings.atNivoBar.Anon_Id
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarItemProps extends js.Object {
  var borderColor: String
  var borderRadius: Double
  var borderWidth: Double
  var color: String
  var data: Anon_Id
  var height: Double
  var label: String
  var labelColor: String
  var onClick: BarClickHandler
  var shouldRenderLabel: Boolean
  var theme: Theme
  var tooltip: TooltipProp
  var tooltipFormat: String | ValueFormatter
  var width: Double
  var x: Double
  var y: Double
  def hideTooltip(): Unit
  def showTooltip(tooltip: ReactNode, event: MouseEvent[HTMLCanvasElement, NativeMouseEvent]): Unit
}

object BarItemProps {
  @scala.inline
  def apply(
    borderColor: String,
    borderRadius: Double,
    borderWidth: Double,
    color: String,
    data: Anon_Id,
    height: Double,
    hideTooltip: () => Unit,
    label: String,
    labelColor: String,
    onClick: (/* datum */ BarExtendedDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit,
    shouldRenderLabel: Boolean,
    showTooltip: (ReactNode, MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit,
    theme: Theme,
    tooltip: TooltipProp,
    tooltipFormat: String | ValueFormatter,
    width: Double,
    x: Double,
    y: Double
  ): BarItemProps = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), label = label.asInstanceOf[js.Any], labelColor = labelColor.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), shouldRenderLabel = shouldRenderLabel.asInstanceOf[js.Any], showTooltip = js.Any.fromFunction2(showTooltip), theme = theme.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipFormat = tooltipFormat.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BarItemProps]
  }
}

