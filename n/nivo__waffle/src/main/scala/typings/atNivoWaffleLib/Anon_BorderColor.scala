package typings
package atNivoWaffleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColor extends js.Object {
  var borderColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[atNivoWaffleLib.atNivoWaffleMod.WaffleDatum]
  var borderWidth: scala.Double
  var emptyColor: java.lang.String
  var emptyOpacity: scala.Double
  var enableLabels: scala.Boolean
  var fillDirection: atNivoWaffleLib.atNivoWaffleMod.WaffleFillDirection
  var isInteractive: scala.Boolean
  var margin: atNivoCoreLib.atNivoCoreMod.Box
  var padding: scala.Double
  var theme: atNivoCoreLib.atNivoCoreMod.Theme
  var tooltip: reactLib.reactMod.StatelessComponent[atNivoWaffleLib.atNivoWaffleMod.WaffleTooltipData]
  var tooltipFormat: java.lang.String | atNivoWaffleLib.atNivoWaffleMod.ValueFormatter
  def onClick(
    datum: atNivoWaffleLib.atNivoWaffleMod.WaffleDatum,
    event: reactLib.reactMod.MouseEvent[stdLib.HTMLCanvasElement, reactLib.NativeMouseEvent]
  ): scala.Unit
}

object Anon_BorderColor {
  @scala.inline
  def apply(
    borderColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[atNivoWaffleLib.atNivoWaffleMod.WaffleDatum],
    borderWidth: scala.Double,
    emptyColor: java.lang.String,
    emptyOpacity: scala.Double,
    enableLabels: scala.Boolean,
    fillDirection: atNivoWaffleLib.atNivoWaffleMod.WaffleFillDirection,
    isInteractive: scala.Boolean,
    margin: atNivoCoreLib.atNivoCoreMod.Box,
    onClick: (atNivoWaffleLib.atNivoWaffleMod.WaffleDatum, reactLib.reactMod.MouseEvent[stdLib.HTMLCanvasElement, reactLib.NativeMouseEvent]) => scala.Unit,
    padding: scala.Double,
    theme: atNivoCoreLib.atNivoCoreMod.Theme,
    tooltip: reactLib.reactMod.StatelessComponent[atNivoWaffleLib.atNivoWaffleMod.WaffleTooltipData],
    tooltipFormat: java.lang.String | atNivoWaffleLib.atNivoWaffleMod.ValueFormatter
  ): Anon_BorderColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth, emptyColor = emptyColor, emptyOpacity = emptyOpacity, enableLabels = enableLabels, fillDirection = fillDirection, isInteractive = isInteractive, margin = margin, onClick = js.Any.fromFunction2(onClick), padding = padding, theme = theme, tooltip = tooltip, tooltipFormat = tooltipFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BorderColor]
  }
}

