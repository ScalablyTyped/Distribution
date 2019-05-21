package typings
package atNivoBarLib.atNivoBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarItemProps extends js.Object {
  var borderColor: java.lang.String
  var borderRadius: scala.Double
  var borderWidth: scala.Double
  var color: java.lang.String
  var data: atNivoBarLib.Anon_Id
  var height: scala.Double
  var label: java.lang.String
  var labelColor: java.lang.String
  var onClick: BarClickHandler
  var shouldRenderLabel: scala.Boolean
  var theme: atNivoCoreLib.atNivoCoreMod.Theme
  var tooltip: TooltipProp
  var tooltipFormat: java.lang.String | ValueFormatter
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
  def hideTooltip(): scala.Unit
  def showTooltip(
    tooltip: reactLib.reactMod.ReactNode,
    event: reactLib.reactMod.MouseEvent[stdLib.HTMLCanvasElement, reactLib.NativeMouseEvent]
  ): scala.Unit
}

object BarItemProps {
  @scala.inline
  def apply(
    borderColor: java.lang.String,
    borderRadius: scala.Double,
    borderWidth: scala.Double,
    color: java.lang.String,
    data: atNivoBarLib.Anon_Id,
    height: scala.Double,
    hideTooltip: () => scala.Unit,
    label: java.lang.String,
    labelColor: java.lang.String,
    onClick: BarClickHandler,
    shouldRenderLabel: scala.Boolean,
    showTooltip: (reactLib.reactMod.ReactNode, reactLib.reactMod.MouseEvent[stdLib.HTMLCanvasElement, reactLib.NativeMouseEvent]) => scala.Unit,
    theme: atNivoCoreLib.atNivoCoreMod.Theme,
    tooltip: TooltipProp,
    tooltipFormat: java.lang.String | ValueFormatter,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): BarItemProps = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, borderRadius = borderRadius, borderWidth = borderWidth, color = color, data = data, height = height, hideTooltip = js.Any.fromFunction0(hideTooltip), label = label, labelColor = labelColor, onClick = onClick, shouldRenderLabel = shouldRenderLabel, showTooltip = js.Any.fromFunction2(showTooltip), theme = theme, tooltip = tooltip, tooltipFormat = tooltipFormat.asInstanceOf[js.Any], width = width, x = x, y = y)
  
    __obj.asInstanceOf[BarItemProps]
  }
}

