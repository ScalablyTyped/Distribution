package typings.atNivoChord.atNivoChordMod

import typings.atNivoColors.atNivoColorsMod.InheritedColorProp
import typings.atNivoColors.atNivoColorsMod.OrdinalColorsInstruction
import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/chord.@nivo/chord.CommonChordProps & @nivo/core.@nivo/core.MotionProps & {  onRibbonMouseEnter ? :@nivo/chord.@nivo/chord.ChordRibbonMouseHandler,   onRibbonMouseMove ? :@nivo/chord.@nivo/chord.ChordRibbonMouseHandler,   onRibbonMouseLeave ? :@nivo/chord.@nivo/chord.ChordRibbonMouseHandler,   onRibbonClick ? :@nivo/chord.@nivo/chord.ChordRibbonMouseHandler,   ribbonTooltip ? :any} */
trait ChordProps extends js.Object {
  var BorderColor: js.UndefOr[InheritedColorProp[_]] = js.undefined
  var animate: js.UndefOr[Boolean] = js.undefined
  var arcBorderColor: js.UndefOr[InheritedColorProp[_]] = js.undefined
  var arcBorderWidth: js.UndefOr[Double] = js.undefined
  var arcHoverOpacity: js.UndefOr[Double] = js.undefined
  var arcHoverOthersOpacity: js.UndefOr[Double] = js.undefined
  var arcOpacity: js.UndefOr[Double] = js.undefined
  var arcTooltip: js.UndefOr[js.Any] = js.undefined
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.undefined
  var enableLabel: js.UndefOr[Boolean] = js.undefined
  var innerRadiusOffset: js.UndefOr[Double] = js.undefined
  var innerRadiusRatio: js.UndefOr[Double] = js.undefined
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var keys: js.Array[String]
  var label: js.UndefOr[String | LabelAccessor] = js.undefined
  var labelOffset: js.UndefOr[Double] = js.undefined
  var labelRotation: js.UndefOr[Double] = js.undefined
  var labelTextColor: js.UndefOr[InheritedColorProp[_]] = js.undefined
  var layers: js.Array[_]
  var margin: js.UndefOr[Box] = js.undefined
  var matrix: js.Array[js.Array[Double]]
  var motionDamping: js.UndefOr[Double] = js.undefined
  var motionStiffness: js.UndefOr[Double] = js.undefined
  var onArcClick: js.UndefOr[ChordArcMouseHandler] = js.undefined
  var onArcMouseEnter: js.UndefOr[ChordArcMouseHandler] = js.undefined
  var onArcMouseLeave: js.UndefOr[ChordArcMouseHandler] = js.undefined
  var onArcMouseMove: js.UndefOr[ChordArcMouseHandler] = js.undefined
  var onRibbonClick: js.UndefOr[ChordRibbonMouseHandler] = js.undefined
  var onRibbonMouseEnter: js.UndefOr[ChordRibbonMouseHandler] = js.undefined
  var onRibbonMouseLeave: js.UndefOr[ChordRibbonMouseHandler] = js.undefined
  var onRibbonMouseMove: js.UndefOr[ChordRibbonMouseHandler] = js.undefined
  var padAngle: js.UndefOr[Double] = js.undefined
  var ribbonBorderWidth: js.UndefOr[Double] = js.undefined
  var ribbonHoverOpacity: js.UndefOr[Double] = js.undefined
  var ribbonHoverOthersOpacity: js.UndefOr[Double] = js.undefined
  var ribbonOpacity: js.UndefOr[Double] = js.undefined
  var ribbonTooltip: js.UndefOr[js.Any] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var valueFormat: js.UndefOr[String | ValueFormatter] = js.undefined
}

object ChordProps {
  @scala.inline
  def apply(
    keys: js.Array[String],
    layers: js.Array[_],
    matrix: js.Array[js.Array[Double]],
    BorderColor: InheritedColorProp[_] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    arcBorderColor: InheritedColorProp[_] = null,
    arcBorderWidth: Int | Double = null,
    arcHoverOpacity: Int | Double = null,
    arcHoverOthersOpacity: Int | Double = null,
    arcOpacity: Int | Double = null,
    arcTooltip: js.Any = null,
    colors: OrdinalColorsInstruction[_] = null,
    enableLabel: js.UndefOr[Boolean] = js.undefined,
    innerRadiusOffset: Int | Double = null,
    innerRadiusRatio: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    label: String | LabelAccessor = null,
    labelOffset: Int | Double = null,
    labelRotation: Int | Double = null,
    labelTextColor: InheritedColorProp[_] = null,
    margin: Box = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    onArcClick: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onArcMouseEnter: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onArcMouseLeave: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onArcMouseMove: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onRibbonClick: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onRibbonMouseEnter: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onRibbonMouseLeave: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onRibbonMouseMove: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    padAngle: Int | Double = null,
    ribbonBorderWidth: Int | Double = null,
    ribbonHoverOpacity: Int | Double = null,
    ribbonHoverOthersOpacity: Int | Double = null,
    ribbonOpacity: Int | Double = null,
    ribbonTooltip: js.Any = null,
    theme: Theme = null,
    valueFormat: String | ValueFormatter = null
  ): ChordProps = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any])
    if (BorderColor != null) __obj.updateDynamic("BorderColor")(BorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (arcBorderColor != null) __obj.updateDynamic("arcBorderColor")(arcBorderColor.asInstanceOf[js.Any])
    if (arcBorderWidth != null) __obj.updateDynamic("arcBorderWidth")(arcBorderWidth.asInstanceOf[js.Any])
    if (arcHoverOpacity != null) __obj.updateDynamic("arcHoverOpacity")(arcHoverOpacity.asInstanceOf[js.Any])
    if (arcHoverOthersOpacity != null) __obj.updateDynamic("arcHoverOthersOpacity")(arcHoverOthersOpacity.asInstanceOf[js.Any])
    if (arcOpacity != null) __obj.updateDynamic("arcOpacity")(arcOpacity.asInstanceOf[js.Any])
    if (arcTooltip != null) __obj.updateDynamic("arcTooltip")(arcTooltip.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabel)) __obj.updateDynamic("enableLabel")(enableLabel.asInstanceOf[js.Any])
    if (innerRadiusOffset != null) __obj.updateDynamic("innerRadiusOffset")(innerRadiusOffset.asInstanceOf[js.Any])
    if (innerRadiusRatio != null) __obj.updateDynamic("innerRadiusRatio")(innerRadiusRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset.asInstanceOf[js.Any])
    if (labelRotation != null) __obj.updateDynamic("labelRotation")(labelRotation.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (onArcClick != null) __obj.updateDynamic("onArcClick")(js.Any.fromFunction2(onArcClick))
    if (onArcMouseEnter != null) __obj.updateDynamic("onArcMouseEnter")(js.Any.fromFunction2(onArcMouseEnter))
    if (onArcMouseLeave != null) __obj.updateDynamic("onArcMouseLeave")(js.Any.fromFunction2(onArcMouseLeave))
    if (onArcMouseMove != null) __obj.updateDynamic("onArcMouseMove")(js.Any.fromFunction2(onArcMouseMove))
    if (onRibbonClick != null) __obj.updateDynamic("onRibbonClick")(js.Any.fromFunction2(onRibbonClick))
    if (onRibbonMouseEnter != null) __obj.updateDynamic("onRibbonMouseEnter")(js.Any.fromFunction2(onRibbonMouseEnter))
    if (onRibbonMouseLeave != null) __obj.updateDynamic("onRibbonMouseLeave")(js.Any.fromFunction2(onRibbonMouseLeave))
    if (onRibbonMouseMove != null) __obj.updateDynamic("onRibbonMouseMove")(js.Any.fromFunction2(onRibbonMouseMove))
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    if (ribbonBorderWidth != null) __obj.updateDynamic("ribbonBorderWidth")(ribbonBorderWidth.asInstanceOf[js.Any])
    if (ribbonHoverOpacity != null) __obj.updateDynamic("ribbonHoverOpacity")(ribbonHoverOpacity.asInstanceOf[js.Any])
    if (ribbonHoverOthersOpacity != null) __obj.updateDynamic("ribbonHoverOthersOpacity")(ribbonHoverOthersOpacity.asInstanceOf[js.Any])
    if (ribbonOpacity != null) __obj.updateDynamic("ribbonOpacity")(ribbonOpacity.asInstanceOf[js.Any])
    if (ribbonTooltip != null) __obj.updateDynamic("ribbonTooltip")(ribbonTooltip.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(valueFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChordProps]
  }
}

