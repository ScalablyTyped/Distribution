package typings
package atNivoRadarLib.atNivoRadarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonRadarProps[Datum] extends js.Object {
  var blendMode: js.UndefOr[atNivoCoreLib.atNivoCoreMod.CssMixBlendMode] = js.undefined
  var borderColor: js.UndefOr[atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_]] = js.undefined
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  var colors: js.UndefOr[atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_]] = js.undefined
  var curve: js.UndefOr[java.lang.String] = js.undefined
  var data: js.Array[js.Object]
  var dotBorderColor: js.UndefOr[atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_]] = js.undefined
  var dotBorderWidth: js.UndefOr[scala.Double] = js.undefined
  var dotColor: js.UndefOr[atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_]] = js.undefined
  var dotLabel: js.UndefOr[java.lang.String | CustomDotLabel] = js.undefined
  var dotLabelFormat: js.UndefOr[java.lang.String | CustomFormatter] = js.undefined
  var dotLabelYOffset: js.UndefOr[scala.Double] = js.undefined
  var dotSize: js.UndefOr[scala.Double] = js.undefined
  var dotSymbol: js.UndefOr[CustomDotSymbol] = js.undefined
  var enableDotLabel: js.UndefOr[scala.Boolean] = js.undefined
  var enableDots: js.UndefOr[scala.Boolean] = js.undefined
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  var gridLabel: js.UndefOr[GridLabelCustomFunction] = js.undefined
  var gridLabelOffset: js.UndefOr[scala.Double] = js.undefined
  var gridLevels: js.UndefOr[scala.Double] = js.undefined
  var gridShape: js.UndefOr[
    atNivoRadarLib.atNivoRadarLibStrings.circular | atNivoRadarLib.atNivoRadarLibStrings.linear
  ] = js.undefined
  var indexBy: scala.Double | java.lang.String | IndexByCustomFunctiono[Datum]
  var isInteractive: js.UndefOr[scala.Boolean] = js.undefined
  var keys: js.Array[java.lang.String | scala.Double]
  var legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps]
  var margin: js.UndefOr[atNivoCoreLib.atNivoCoreMod.Box] = js.undefined
  var maxValue: js.UndefOr[atNivoRadarLib.atNivoRadarLibStrings.auto | scala.Double] = js.undefined
  var tooltipFormat: js.UndefOr[java.lang.String | CustomFormatter] = js.undefined
}

object CommonRadarProps {
  @scala.inline
  def apply[Datum](
    data: js.Array[js.Object],
    indexBy: scala.Double | java.lang.String | IndexByCustomFunctiono[Datum],
    keys: js.Array[java.lang.String | scala.Double],
    legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps],
    blendMode: atNivoCoreLib.atNivoCoreMod.CssMixBlendMode = null,
    borderColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_] = null,
    borderWidth: scala.Int | scala.Double = null,
    colors: atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_] = null,
    curve: java.lang.String = null,
    dotBorderColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_] = null,
    dotBorderWidth: scala.Int | scala.Double = null,
    dotColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_] = null,
    dotLabel: java.lang.String | CustomDotLabel = null,
    dotLabelFormat: java.lang.String | CustomFormatter = null,
    dotLabelYOffset: scala.Int | scala.Double = null,
    dotSize: scala.Int | scala.Double = null,
    dotSymbol: CustomDotSymbol = null,
    enableDotLabel: js.UndefOr[scala.Boolean] = js.undefined,
    enableDots: js.UndefOr[scala.Boolean] = js.undefined,
    fillOpacity: scala.Int | scala.Double = null,
    gridLabel: GridLabelCustomFunction = null,
    gridLabelOffset: scala.Int | scala.Double = null,
    gridLevels: scala.Int | scala.Double = null,
    gridShape: atNivoRadarLib.atNivoRadarLibStrings.circular | atNivoRadarLib.atNivoRadarLibStrings.linear = null,
    isInteractive: js.UndefOr[scala.Boolean] = js.undefined,
    margin: atNivoCoreLib.atNivoCoreMod.Box = null,
    maxValue: atNivoRadarLib.atNivoRadarLibStrings.auto | scala.Double = null,
    tooltipFormat: java.lang.String | CustomFormatter = null
  ): CommonRadarProps[Datum] = {
    val __obj = js.Dynamic.literal(data = data, indexBy = indexBy.asInstanceOf[js.Any], keys = keys, legends = legends)
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve)
    if (dotBorderColor != null) __obj.updateDynamic("dotBorderColor")(dotBorderColor.asInstanceOf[js.Any])
    if (dotBorderWidth != null) __obj.updateDynamic("dotBorderWidth")(dotBorderWidth.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (dotLabel != null) __obj.updateDynamic("dotLabel")(dotLabel.asInstanceOf[js.Any])
    if (dotLabelFormat != null) __obj.updateDynamic("dotLabelFormat")(dotLabelFormat.asInstanceOf[js.Any])
    if (dotLabelYOffset != null) __obj.updateDynamic("dotLabelYOffset")(dotLabelYOffset.asInstanceOf[js.Any])
    if (dotSize != null) __obj.updateDynamic("dotSize")(dotSize.asInstanceOf[js.Any])
    if (dotSymbol != null) __obj.updateDynamic("dotSymbol")(dotSymbol)
    if (!js.isUndefined(enableDotLabel)) __obj.updateDynamic("enableDotLabel")(enableDotLabel)
    if (!js.isUndefined(enableDots)) __obj.updateDynamic("enableDots")(enableDots)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (gridLabel != null) __obj.updateDynamic("gridLabel")(gridLabel)
    if (gridLabelOffset != null) __obj.updateDynamic("gridLabelOffset")(gridLabelOffset.asInstanceOf[js.Any])
    if (gridLevels != null) __obj.updateDynamic("gridLevels")(gridLevels.asInstanceOf[js.Any])
    if (gridShape != null) __obj.updateDynamic("gridShape")(gridShape.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonRadarProps[Datum]]
  }
}

