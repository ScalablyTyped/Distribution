package typings.atNivoPie

import typings.atNivoColors.atNivoColorsMod.InheritedColorProp
import typings.atNivoColors.atNivoColorsMod.OrdinalColorsInstruction
import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.atNivoLegends.atNivoLegendsMod.LegendProps
import typings.atNivoPie.atNivoPieMod.AccessorFunc
import typings.atNivoPie.atNivoPieMod.PieDatum
import typings.atNivoPie.atNivoPieMod.PieDatumWithColor
import typings.atNivoPie.atNivoPieMod.ValueFormatter
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.StatelessComponent
import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColor extends js.Object {
  var borderColor: InheritedColorProp[PieDatum]
  var borderWidth: Double
  // border
  // styling
  var colors: OrdinalColorsInstruction[PieDatum]
  var cornerRadius: Double
  // radial labels
  var enableRadialLabels: Boolean
  // slices labels
  var enableSlicesLabels: Boolean
  var endAngle: Double
  var fit: Boolean
  var innerRadius: Double
  // interactivity
  var isInteractive: Boolean
  var legends: js.Array[LegendProps]
  var margin: Box
  var padAngle: Double
  var radialLabel: String | AccessorFunc
  var radialLabelsLinkColor: InheritedColorProp[PieDatumWithColor]
  var radialLabelsLinkDiagonalLength: Double
  var radialLabelsLinkHorizontalLength: Double
  var radialLabelsLinkOffset: Double
  var radialLabelsLinkStrokeWidth: Double
  var radialLabelsSkipAngle: Double
  var radialLabelsTextColor: InheritedColorProp[PieDatumWithColor]
  var radialLabelsTextXOffset: Double
  var sliceLabel: String | AccessorFunc
  var slicesLabelsSkipAngle: Double
  var slicesLabelsTextColor: InheritedColorProp[PieDatumWithColor]
  var sortByValue: Boolean
  var startAngle: Double
  var theme: Theme
  var tooltip: StatelessComponent[PieDatumWithColor]
  var tooltipFormat: String | ValueFormatter
  def onClick(datum: PieDatum, event: MouseEvent[SVGPathElement, NativeMouseEvent]): Unit
}

object Anon_BorderColor {
  @scala.inline
  def apply(
    borderColor: InheritedColorProp[PieDatum],
    borderWidth: Double,
    colors: OrdinalColorsInstruction[PieDatum],
    cornerRadius: Double,
    enableRadialLabels: Boolean,
    enableSlicesLabels: Boolean,
    endAngle: Double,
    fit: Boolean,
    innerRadius: Double,
    isInteractive: Boolean,
    legends: js.Array[LegendProps],
    margin: Box,
    onClick: (PieDatum, MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit,
    padAngle: Double,
    radialLabel: String | AccessorFunc,
    radialLabelsLinkColor: InheritedColorProp[PieDatumWithColor],
    radialLabelsLinkDiagonalLength: Double,
    radialLabelsLinkHorizontalLength: Double,
    radialLabelsLinkOffset: Double,
    radialLabelsLinkStrokeWidth: Double,
    radialLabelsSkipAngle: Double,
    radialLabelsTextColor: InheritedColorProp[PieDatumWithColor],
    radialLabelsTextXOffset: Double,
    sliceLabel: String | AccessorFunc,
    slicesLabelsSkipAngle: Double,
    slicesLabelsTextColor: InheritedColorProp[PieDatumWithColor],
    sortByValue: Boolean,
    startAngle: Double,
    theme: Theme,
    tooltip: StatelessComponent[PieDatumWithColor],
    tooltipFormat: String | ValueFormatter
  ): Anon_BorderColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth, colors = colors.asInstanceOf[js.Any], cornerRadius = cornerRadius, enableRadialLabels = enableRadialLabels, enableSlicesLabels = enableSlicesLabels, endAngle = endAngle, fit = fit, innerRadius = innerRadius, isInteractive = isInteractive, legends = legends, margin = margin, onClick = js.Any.fromFunction2(onClick), padAngle = padAngle, radialLabel = radialLabel.asInstanceOf[js.Any], radialLabelsLinkColor = radialLabelsLinkColor.asInstanceOf[js.Any], radialLabelsLinkDiagonalLength = radialLabelsLinkDiagonalLength, radialLabelsLinkHorizontalLength = radialLabelsLinkHorizontalLength, radialLabelsLinkOffset = radialLabelsLinkOffset, radialLabelsLinkStrokeWidth = radialLabelsLinkStrokeWidth, radialLabelsSkipAngle = radialLabelsSkipAngle, radialLabelsTextColor = radialLabelsTextColor.asInstanceOf[js.Any], radialLabelsTextXOffset = radialLabelsTextXOffset, sliceLabel = sliceLabel.asInstanceOf[js.Any], slicesLabelsSkipAngle = slicesLabelsSkipAngle, slicesLabelsTextColor = slicesLabelsTextColor.asInstanceOf[js.Any], sortByValue = sortByValue, startAngle = startAngle, theme = theme, tooltip = tooltip, tooltipFormat = tooltipFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BorderColor]
  }
}

