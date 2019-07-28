package typings.atNivoWaffle

import typings.atNivoColors.atNivoColorsMod.InheritedColorProp
import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.atNivoWaffle.atNivoWaffleMod.ValueFormatter
import typings.atNivoWaffle.atNivoWaffleMod.WaffleDatum
import typings.atNivoWaffle.atNivoWaffleMod.WaffleFillDirection
import typings.atNivoWaffle.atNivoWaffleMod.WaffleTooltipData
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.StatelessComponent
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColor extends js.Object {
  var borderColor: InheritedColorProp[WaffleDatum]
  var borderWidth: Double
  var emptyColor: String
  var emptyOpacity: Double
  var enableLabels: Boolean
  var fillDirection: WaffleFillDirection
  var isInteractive: Boolean
  var margin: Box
  var padding: Double
  var theme: Theme
  var tooltip: StatelessComponent[WaffleTooltipData]
  var tooltipFormat: String | ValueFormatter
  def onClick(datum: WaffleDatum, event: MouseEvent[HTMLCanvasElement, NativeMouseEvent]): Unit
}

object Anon_BorderColor {
  @scala.inline
  def apply(
    borderColor: InheritedColorProp[WaffleDatum],
    borderWidth: Double,
    emptyColor: String,
    emptyOpacity: Double,
    enableLabels: Boolean,
    fillDirection: WaffleFillDirection,
    isInteractive: Boolean,
    margin: Box,
    onClick: (WaffleDatum, MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit,
    padding: Double,
    theme: Theme,
    tooltip: StatelessComponent[WaffleTooltipData],
    tooltipFormat: String | ValueFormatter
  ): Anon_BorderColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth, emptyColor = emptyColor, emptyOpacity = emptyOpacity, enableLabels = enableLabels, fillDirection = fillDirection, isInteractive = isInteractive, margin = margin, onClick = js.Any.fromFunction2(onClick), padding = padding, theme = theme, tooltip = tooltip, tooltipFormat = tooltipFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BorderColor]
  }
}

