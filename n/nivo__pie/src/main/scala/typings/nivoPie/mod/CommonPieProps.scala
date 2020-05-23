package typings.nivoPie.mod

import typings.nivoColors.mod.InheritedColorProp
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Theme
import typings.nivoLegends.mod.LegendProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.StatelessComponent
import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/core.@nivo/core.MotionProps & std.Partial<{  margin  :@nivo/core.@nivo/core.Box,   sortByValue  :boolean,   innerRadius  :number,   padAngle  :number,   cornerRadius  :number,   startAngle  :number,   endAngle  :number,   fit  :boolean,   colors  :@nivo/colors.@nivo/colors.OrdinalColorsInstruction<@nivo/pie.@nivo/pie.PieDatum>,   theme  :@nivo/core.@nivo/core.Theme,   borderWidth  :number,   borderColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/pie.@nivo/pie.PieDatum>,   enableRadialLabels  :boolean,   radialLabel  :string | @nivo/pie.@nivo/pie.AccessorFunc,   radialLabelsSkipAngle  :number,   radialLabelsTextXOffset  :number,   radialLabelsTextColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/pie.@nivo/pie.PieDatumWithColor>,   radialLabelsLinkOffset  :number,   radialLabelsLinkDiagonalLength  :number,   radialLabelsLinkHorizontalLength  :number,   radialLabelsLinkStrokeWidth  :number,   radialLabelsLinkColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/pie.@nivo/pie.PieDatumWithColor>,   enableSlicesLabels  :boolean,   sliceLabel  :string | @nivo/pie.@nivo/pie.AccessorFunc,   slicesLabelsSkipAngle  :number,   slicesLabelsTextColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/pie.@nivo/pie.PieDatumWithColor>,   isInteractive  :boolean, onClick (datum : @nivo/pie.@nivo/pie.PieDatum, event : react.react.MouseEvent<std.SVGPathElement, react.react.NativeMouseEvent>): void,   tooltipFormat  :string | @nivo/pie.@nivo/pie.ValueFormatter,   tooltip  :react.react.StatelessComponent<@nivo/pie.@nivo/pie.PieDatumWithColor>,   legends  :std.Array<@nivo/legends.@nivo/legends.LegendProps>}> */
trait CommonPieProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var borderColor: js.UndefOr[InheritedColorProp[PieDatum]] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[OrdinalColorsInstruction[PieDatum]] = js.undefined
  var cornerRadius: js.UndefOr[Double] = js.undefined
  var enableRadialLabels: js.UndefOr[Boolean] = js.undefined
  var enableSlicesLabels: js.UndefOr[Boolean] = js.undefined
  var endAngle: js.UndefOr[Double] = js.undefined
  var fit: js.UndefOr[Boolean] = js.undefined
  var innerRadius: js.UndefOr[Double] = js.undefined
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var motionDamping: js.UndefOr[Double] = js.undefined
  var motionStiffness: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* datum */ PieDatum, /* event */ MouseEvent[SVGPathElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var padAngle: js.UndefOr[Double] = js.undefined
  var radialLabel: js.UndefOr[String | AccessorFunc] = js.undefined
  var radialLabelsLinkColor: js.UndefOr[InheritedColorProp[PieDatumWithColor]] = js.undefined
  var radialLabelsLinkDiagonalLength: js.UndefOr[Double] = js.undefined
  var radialLabelsLinkHorizontalLength: js.UndefOr[Double] = js.undefined
  var radialLabelsLinkOffset: js.UndefOr[Double] = js.undefined
  var radialLabelsLinkStrokeWidth: js.UndefOr[Double] = js.undefined
  var radialLabelsSkipAngle: js.UndefOr[Double] = js.undefined
  var radialLabelsTextColor: js.UndefOr[InheritedColorProp[PieDatumWithColor]] = js.undefined
  var radialLabelsTextXOffset: js.UndefOr[Double] = js.undefined
  var sliceLabel: js.UndefOr[String | AccessorFunc] = js.undefined
  var slicesLabelsSkipAngle: js.UndefOr[Double] = js.undefined
  var slicesLabelsTextColor: js.UndefOr[InheritedColorProp[PieDatumWithColor]] = js.undefined
  var sortByValue: js.UndefOr[Boolean] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltip: js.UndefOr[StatelessComponent[PieDatumWithColor]] = js.undefined
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.undefined
}

object CommonPieProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    borderColor: InheritedColorProp[PieDatum] = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    colors: OrdinalColorsInstruction[PieDatum] = null,
    cornerRadius: js.UndefOr[Double] = js.undefined,
    enableRadialLabels: js.UndefOr[Boolean] = js.undefined,
    enableSlicesLabels: js.UndefOr[Boolean] = js.undefined,
    endAngle: js.UndefOr[Double] = js.undefined,
    fit: js.UndefOr[Boolean] = js.undefined,
    innerRadius: js.UndefOr[Double] = js.undefined,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    legends: js.Array[LegendProps] = null,
    margin: Box = null,
    motionDamping: js.UndefOr[Double] = js.undefined,
    motionStiffness: js.UndefOr[Double] = js.undefined,
    onClick: (/* datum */ PieDatum, /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit = null,
    padAngle: js.UndefOr[Double] = js.undefined,
    radialLabel: String | AccessorFunc = null,
    radialLabelsLinkColor: InheritedColorProp[PieDatumWithColor] = null,
    radialLabelsLinkDiagonalLength: js.UndefOr[Double] = js.undefined,
    radialLabelsLinkHorizontalLength: js.UndefOr[Double] = js.undefined,
    radialLabelsLinkOffset: js.UndefOr[Double] = js.undefined,
    radialLabelsLinkStrokeWidth: js.UndefOr[Double] = js.undefined,
    radialLabelsSkipAngle: js.UndefOr[Double] = js.undefined,
    radialLabelsTextColor: InheritedColorProp[PieDatumWithColor] = null,
    radialLabelsTextXOffset: js.UndefOr[Double] = js.undefined,
    sliceLabel: String | AccessorFunc = null,
    slicesLabelsSkipAngle: js.UndefOr[Double] = js.undefined,
    slicesLabelsTextColor: InheritedColorProp[PieDatumWithColor] = null,
    sortByValue: js.UndefOr[Boolean] = js.undefined,
    startAngle: js.UndefOr[Double] = js.undefined,
    theme: Theme = null,
    tooltip: StatelessComponent[PieDatumWithColor] = null,
    tooltipFormat: String | ValueFormatter = null
  ): CommonPieProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(cornerRadius)) __obj.updateDynamic("cornerRadius")(cornerRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRadialLabels)) __obj.updateDynamic("enableRadialLabels")(enableRadialLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSlicesLabels)) __obj.updateDynamic("enableSlicesLabels")(enableSlicesLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endAngle)) __obj.updateDynamic("endAngle")(endAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRadius)) __obj.updateDynamic("innerRadius")(innerRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.get.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(motionDamping)) __obj.updateDynamic("motionDamping")(motionDamping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(motionStiffness)) __obj.updateDynamic("motionStiffness")(motionStiffness.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (!js.isUndefined(padAngle)) __obj.updateDynamic("padAngle")(padAngle.get.asInstanceOf[js.Any])
    if (radialLabel != null) __obj.updateDynamic("radialLabel")(radialLabel.asInstanceOf[js.Any])
    if (radialLabelsLinkColor != null) __obj.updateDynamic("radialLabelsLinkColor")(radialLabelsLinkColor.asInstanceOf[js.Any])
    if (!js.isUndefined(radialLabelsLinkDiagonalLength)) __obj.updateDynamic("radialLabelsLinkDiagonalLength")(radialLabelsLinkDiagonalLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radialLabelsLinkHorizontalLength)) __obj.updateDynamic("radialLabelsLinkHorizontalLength")(radialLabelsLinkHorizontalLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radialLabelsLinkOffset)) __obj.updateDynamic("radialLabelsLinkOffset")(radialLabelsLinkOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radialLabelsLinkStrokeWidth)) __obj.updateDynamic("radialLabelsLinkStrokeWidth")(radialLabelsLinkStrokeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radialLabelsSkipAngle)) __obj.updateDynamic("radialLabelsSkipAngle")(radialLabelsSkipAngle.get.asInstanceOf[js.Any])
    if (radialLabelsTextColor != null) __obj.updateDynamic("radialLabelsTextColor")(radialLabelsTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(radialLabelsTextXOffset)) __obj.updateDynamic("radialLabelsTextXOffset")(radialLabelsTextXOffset.get.asInstanceOf[js.Any])
    if (sliceLabel != null) __obj.updateDynamic("sliceLabel")(sliceLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(slicesLabelsSkipAngle)) __obj.updateDynamic("slicesLabelsSkipAngle")(slicesLabelsSkipAngle.get.asInstanceOf[js.Any])
    if (slicesLabelsTextColor != null) __obj.updateDynamic("slicesLabelsTextColor")(slicesLabelsTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(sortByValue)) __obj.updateDynamic("sortByValue")(sortByValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonPieProps]
  }
}

