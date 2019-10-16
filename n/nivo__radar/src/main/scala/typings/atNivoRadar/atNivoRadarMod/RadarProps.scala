package typings.atNivoRadar.atNivoRadarMod

import typings.atNivoColors.atNivoColorsMod.InheritedColorProp
import typings.atNivoColors.atNivoColorsMod.OrdinalColorsInstruction
import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.CssMixBlendMode
import typings.atNivoLegends.atNivoLegendsMod.LegendProps
import typings.atNivoRadar.atNivoRadarStrings.auto
import typings.atNivoRadar.atNivoRadarStrings.circular
import typings.atNivoRadar.atNivoRadarStrings.linear
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/radar.@nivo/radar.CommonRadarProps<any> & @nivo/core.@nivo/core.MotionProps */
trait RadarProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var blendMode: js.UndefOr[CssMixBlendMode] = js.undefined
  var borderColor: js.UndefOr[InheritedColorProp[_]] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.undefined
  var curve: js.UndefOr[String] = js.undefined
  var data: js.Array[js.Object]
  var dotBorderColor: js.UndefOr[InheritedColorProp[_]] = js.undefined
  var dotBorderWidth: js.UndefOr[Double] = js.undefined
  var dotColor: js.UndefOr[InheritedColorProp[_]] = js.undefined
  var dotLabel: js.UndefOr[String | CustomDotLabel] = js.undefined
  var dotLabelFormat: js.UndefOr[String | CustomFormatter] = js.undefined
  var dotLabelYOffset: js.UndefOr[Double] = js.undefined
  var dotSize: js.UndefOr[Double] = js.undefined
  var dotSymbol: js.UndefOr[CustomDotSymbol] = js.undefined
  var enableDotLabel: js.UndefOr[Boolean] = js.undefined
  var enableDots: js.UndefOr[Boolean] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var gridLabel: js.UndefOr[GridLabelCustomFunction] = js.undefined
  var gridLabelOffset: js.UndefOr[Double] = js.undefined
  var gridLevels: js.UndefOr[Double] = js.undefined
  var gridShape: js.UndefOr[circular | linear] = js.undefined
  var indexBy: Double | String | IndexByCustomFunctiono[_]
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var keys: js.Array[String | Double]
  var legends: js.Array[LegendProps]
  var margin: js.UndefOr[Box] = js.undefined
  var maxValue: js.UndefOr[auto | Double] = js.undefined
  var motionDamping: js.UndefOr[Double] = js.undefined
  var motionStiffness: js.UndefOr[Double] = js.undefined
  var tooltipFormat: js.UndefOr[String | CustomFormatter] = js.undefined
}

object RadarProps {
  @scala.inline
  def apply(
    data: js.Array[js.Object],
    indexBy: Double | String | IndexByCustomFunctiono[_],
    keys: js.Array[String | Double],
    legends: js.Array[LegendProps],
    animate: js.UndefOr[Boolean] = js.undefined,
    blendMode: CssMixBlendMode = null,
    borderColor: InheritedColorProp[_] = null,
    borderWidth: Int | Double = null,
    colors: OrdinalColorsInstruction[_] = null,
    curve: String = null,
    dotBorderColor: InheritedColorProp[_] = null,
    dotBorderWidth: Int | Double = null,
    dotColor: InheritedColorProp[_] = null,
    dotLabel: String | CustomDotLabel = null,
    dotLabelFormat: String | CustomFormatter = null,
    dotLabelYOffset: Int | Double = null,
    dotSize: Int | Double = null,
    dotSymbol: /* repeated */ js.Any => ReactNode = null,
    enableDotLabel: js.UndefOr[Boolean] = js.undefined,
    enableDots: js.UndefOr[Boolean] = js.undefined,
    fillOpacity: Int | Double = null,
    gridLabel: /* repeated */ js.Any => String = null,
    gridLabelOffset: Int | Double = null,
    gridLevels: Int | Double = null,
    gridShape: circular | linear = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    margin: Box = null,
    maxValue: auto | Double = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    tooltipFormat: String | CustomFormatter = null
  ): RadarProps = {
    val __obj = js.Dynamic.literal(data = data, indexBy = indexBy.asInstanceOf[js.Any], keys = keys, legends = legends)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
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
    if (dotSymbol != null) __obj.updateDynamic("dotSymbol")(js.Any.fromFunction1(dotSymbol))
    if (!js.isUndefined(enableDotLabel)) __obj.updateDynamic("enableDotLabel")(enableDotLabel)
    if (!js.isUndefined(enableDots)) __obj.updateDynamic("enableDots")(enableDots)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (gridLabel != null) __obj.updateDynamic("gridLabel")(js.Any.fromFunction1(gridLabel))
    if (gridLabelOffset != null) __obj.updateDynamic("gridLabelOffset")(gridLabelOffset.asInstanceOf[js.Any])
    if (gridLevels != null) __obj.updateDynamic("gridLevels")(gridLevels.asInstanceOf[js.Any])
    if (gridShape != null) __obj.updateDynamic("gridShape")(gridShape.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadarProps]
  }
}

