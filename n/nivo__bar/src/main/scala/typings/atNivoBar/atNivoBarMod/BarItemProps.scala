package typings.atNivoBar.atNivoBarMod

import typings.atNivoBar.Anon_Id
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
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
    val __obj = js.Dynamic.literal(borderColor = borderColor, borderRadius = borderRadius, borderWidth = borderWidth, color = color, data = data, height = height, hideTooltip = js.Any.fromFunction0(hideTooltip), label = label, labelColor = labelColor, onClick = js.Any.fromFunction2(onClick), shouldRenderLabel = shouldRenderLabel, showTooltip = js.Any.fromFunction2(showTooltip), theme = theme, tooltip = tooltip, tooltipFormat = tooltipFormat.asInstanceOf[js.Any], width = width, x = x, y = y)
  
    __obj.asInstanceOf[BarItemProps]
  }
}

