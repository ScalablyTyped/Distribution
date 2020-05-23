package typings.nivoChord.mod

import typings.nivoColors.mod.InheritedColorProp
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Theme
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
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
    arcBorderWidth: js.UndefOr[Double] = js.undefined,
    arcHoverOpacity: js.UndefOr[Double] = js.undefined,
    arcHoverOthersOpacity: js.UndefOr[Double] = js.undefined,
    arcOpacity: js.UndefOr[Double] = js.undefined,
    arcTooltip: js.Any = null,
    colors: OrdinalColorsInstruction[_] = null,
    enableLabel: js.UndefOr[Boolean] = js.undefined,
    innerRadiusOffset: js.UndefOr[Double] = js.undefined,
    innerRadiusRatio: js.UndefOr[Double] = js.undefined,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    label: String | LabelAccessor = null,
    labelOffset: js.UndefOr[Double] = js.undefined,
    labelRotation: js.UndefOr[Double] = js.undefined,
    labelTextColor: InheritedColorProp[_] = null,
    margin: Box = null,
    motionDamping: js.UndefOr[Double] = js.undefined,
    motionStiffness: js.UndefOr[Double] = js.undefined,
    onArcClick: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onArcMouseEnter: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onArcMouseLeave: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onArcMouseMove: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onRibbonClick: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onRibbonMouseEnter: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onRibbonMouseLeave: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onRibbonMouseMove: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    padAngle: js.UndefOr[Double] = js.undefined,
    ribbonBorderWidth: js.UndefOr[Double] = js.undefined,
    ribbonHoverOpacity: js.UndefOr[Double] = js.undefined,
    ribbonHoverOthersOpacity: js.UndefOr[Double] = js.undefined,
    ribbonOpacity: js.UndefOr[Double] = js.undefined,
    ribbonTooltip: js.Any = null,
    theme: Theme = null,
    valueFormat: String | ValueFormatter = null
  ): ChordProps = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any])
    if (BorderColor != null) __obj.updateDynamic("BorderColor")(BorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (arcBorderColor != null) __obj.updateDynamic("arcBorderColor")(arcBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(arcBorderWidth)) __obj.updateDynamic("arcBorderWidth")(arcBorderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arcHoverOpacity)) __obj.updateDynamic("arcHoverOpacity")(arcHoverOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arcHoverOthersOpacity)) __obj.updateDynamic("arcHoverOthersOpacity")(arcHoverOthersOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arcOpacity)) __obj.updateDynamic("arcOpacity")(arcOpacity.get.asInstanceOf[js.Any])
    if (arcTooltip != null) __obj.updateDynamic("arcTooltip")(arcTooltip.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabel)) __obj.updateDynamic("enableLabel")(enableLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRadiusOffset)) __obj.updateDynamic("innerRadiusOffset")(innerRadiusOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRadiusRatio)) __obj.updateDynamic("innerRadiusRatio")(innerRadiusRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelOffset)) __obj.updateDynamic("labelOffset")(labelOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelRotation)) __obj.updateDynamic("labelRotation")(labelRotation.get.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(motionDamping)) __obj.updateDynamic("motionDamping")(motionDamping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(motionStiffness)) __obj.updateDynamic("motionStiffness")(motionStiffness.get.asInstanceOf[js.Any])
    if (onArcClick != null) __obj.updateDynamic("onArcClick")(js.Any.fromFunction2(onArcClick))
    if (onArcMouseEnter != null) __obj.updateDynamic("onArcMouseEnter")(js.Any.fromFunction2(onArcMouseEnter))
    if (onArcMouseLeave != null) __obj.updateDynamic("onArcMouseLeave")(js.Any.fromFunction2(onArcMouseLeave))
    if (onArcMouseMove != null) __obj.updateDynamic("onArcMouseMove")(js.Any.fromFunction2(onArcMouseMove))
    if (onRibbonClick != null) __obj.updateDynamic("onRibbonClick")(js.Any.fromFunction2(onRibbonClick))
    if (onRibbonMouseEnter != null) __obj.updateDynamic("onRibbonMouseEnter")(js.Any.fromFunction2(onRibbonMouseEnter))
    if (onRibbonMouseLeave != null) __obj.updateDynamic("onRibbonMouseLeave")(js.Any.fromFunction2(onRibbonMouseLeave))
    if (onRibbonMouseMove != null) __obj.updateDynamic("onRibbonMouseMove")(js.Any.fromFunction2(onRibbonMouseMove))
    if (!js.isUndefined(padAngle)) __obj.updateDynamic("padAngle")(padAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ribbonBorderWidth)) __obj.updateDynamic("ribbonBorderWidth")(ribbonBorderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ribbonHoverOpacity)) __obj.updateDynamic("ribbonHoverOpacity")(ribbonHoverOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ribbonHoverOthersOpacity)) __obj.updateDynamic("ribbonHoverOthersOpacity")(ribbonHoverOthersOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ribbonOpacity)) __obj.updateDynamic("ribbonOpacity")(ribbonOpacity.get.asInstanceOf[js.Any])
    if (ribbonTooltip != null) __obj.updateDynamic("ribbonTooltip")(ribbonTooltip.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(valueFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChordProps]
  }
}

