package typings
package atNivoPieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColor extends js.Object {
  var borderColor: java.lang.String | atNivoCoreLib.atNivoCoreMod.GetColor[atNivoPieLib.atNivoPieMod.PieDatum]
  var borderWidth: scala.Double
  var cornerRadius: scala.Double
  // radial labels
  var enableRadialLabels: scala.Boolean
  // slices labels
  var enableSlicesLabels: scala.Boolean
  var endAngle: scala.Double
  var fit: scala.Boolean
  var innerRadius: scala.Double
  // interactivity
  var isInteractive: scala.Boolean
  var legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps]
  var margin: atNivoCoreLib.atNivoCoreMod.Box
  var padAngle: scala.Double
  var radialLabel: java.lang.String | atNivoPieLib.atNivoPieMod.AccessorFunc
  var radialLabelsLinkColor: java.lang.String | atNivoCoreLib.atNivoCoreMod.GetColor[atNivoPieLib.atNivoPieMod.PieDatumWithColor]
  var radialLabelsLinkDiagonalLength: scala.Double
  var radialLabelsLinkHorizontalLength: scala.Double
  var radialLabelsLinkOffset: scala.Double
  var radialLabelsLinkStrokeWidth: scala.Double
  var radialLabelsSkipAngle: scala.Double
  var radialLabelsTextColor: java.lang.String | atNivoCoreLib.atNivoCoreMod.GetColor[atNivoPieLib.atNivoPieMod.PieDatumWithColor]
  var radialLabelsTextXOffset: scala.Double
  var sliceLabel: java.lang.String | atNivoPieLib.atNivoPieMod.AccessorFunc
  var slicesLabelsSkipAngle: scala.Double
  var slicesLabelsTextColor: java.lang.String | atNivoCoreLib.atNivoCoreMod.GetColor[atNivoPieLib.atNivoPieMod.PieDatumWithColor]
  var sortByValue: scala.Boolean
  var startAngle: scala.Double
  // border
  // styling
  var theme: atNivoCoreLib.atNivoCoreMod.Theme
  var tooltip: reactLib.reactMod.ReactNs.StatelessComponent[atNivoPieLib.atNivoPieMod.PieDatumWithColor]
  var tooltipFormat: java.lang.String | atNivoPieLib.atNivoPieMod.ValueFormatter
  def onClick(
    datum: atNivoPieLib.atNivoPieMod.PieDatum,
    event: reactLib.reactMod.ReactNs.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]
  ): scala.Unit
}

object Anon_BorderColor {
  @scala.inline
  def apply(
    borderColor: java.lang.String | atNivoCoreLib.atNivoCoreMod.GetColor[atNivoPieLib.atNivoPieMod.PieDatum],
    borderWidth: scala.Double,
    cornerRadius: scala.Double,
    enableRadialLabels: scala.Boolean,
    enableSlicesLabels: scala.Boolean,
    endAngle: scala.Double,
    fit: scala.Boolean,
    innerRadius: scala.Double,
    isInteractive: scala.Boolean,
    legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps],
    margin: atNivoCoreLib.atNivoCoreMod.Box,
    onClick: (atNivoPieLib.atNivoPieMod.PieDatum, reactLib.reactMod.ReactNs.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]) => scala.Unit,
    padAngle: scala.Double,
    radialLabel: java.lang.String | atNivoPieLib.atNivoPieMod.AccessorFunc,
    radialLabelsLinkColor: java.lang.String | atNivoCoreLib.atNivoCoreMod.GetColor[atNivoPieLib.atNivoPieMod.PieDatumWithColor],
    radialLabelsLinkDiagonalLength: scala.Double,
    radialLabelsLinkHorizontalLength: scala.Double,
    radialLabelsLinkOffset: scala.Double,
    radialLabelsLinkStrokeWidth: scala.Double,
    radialLabelsSkipAngle: scala.Double,
    radialLabelsTextColor: java.lang.String | atNivoCoreLib.atNivoCoreMod.GetColor[atNivoPieLib.atNivoPieMod.PieDatumWithColor],
    radialLabelsTextXOffset: scala.Double,
    sliceLabel: java.lang.String | atNivoPieLib.atNivoPieMod.AccessorFunc,
    slicesLabelsSkipAngle: scala.Double,
    slicesLabelsTextColor: java.lang.String | atNivoCoreLib.atNivoCoreMod.GetColor[atNivoPieLib.atNivoPieMod.PieDatumWithColor],
    sortByValue: scala.Boolean,
    startAngle: scala.Double,
    theme: atNivoCoreLib.atNivoCoreMod.Theme,
    tooltip: reactLib.reactMod.ReactNs.StatelessComponent[atNivoPieLib.atNivoPieMod.PieDatumWithColor],
    tooltipFormat: java.lang.String | atNivoPieLib.atNivoPieMod.ValueFormatter
  ): Anon_BorderColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth, cornerRadius = cornerRadius, enableRadialLabels = enableRadialLabels, enableSlicesLabels = enableSlicesLabels, endAngle = endAngle, fit = fit, innerRadius = innerRadius, isInteractive = isInteractive, legends = legends, margin = margin, onClick = js.Any.fromFunction2(onClick), padAngle = padAngle, radialLabel = radialLabel.asInstanceOf[js.Any], radialLabelsLinkColor = radialLabelsLinkColor.asInstanceOf[js.Any], radialLabelsLinkDiagonalLength = radialLabelsLinkDiagonalLength, radialLabelsLinkHorizontalLength = radialLabelsLinkHorizontalLength, radialLabelsLinkOffset = radialLabelsLinkOffset, radialLabelsLinkStrokeWidth = radialLabelsLinkStrokeWidth, radialLabelsSkipAngle = radialLabelsSkipAngle, radialLabelsTextColor = radialLabelsTextColor.asInstanceOf[js.Any], radialLabelsTextXOffset = radialLabelsTextXOffset, sliceLabel = sliceLabel.asInstanceOf[js.Any], slicesLabelsSkipAngle = slicesLabelsSkipAngle, slicesLabelsTextColor = slicesLabelsTextColor.asInstanceOf[js.Any], sortByValue = sortByValue, startAngle = startAngle, theme = theme, tooltip = tooltip, tooltipFormat = tooltipFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BorderColor]
  }
}

