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

/* Inlined @nivo/chord.@nivo/chord.CommonChordProps & {  pixelRatio ? :number} */
trait ChordCanvasProps extends js.Object {
  var BorderColor: js.UndefOr[InheritedColorProp[_]] = js.undefined
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
  var onArcClick: js.UndefOr[ChordArcMouseHandler] = js.undefined
  var onArcMouseEnter: js.UndefOr[ChordArcMouseHandler] = js.undefined
  var onArcMouseLeave: js.UndefOr[ChordArcMouseHandler] = js.undefined
  var onArcMouseMove: js.UndefOr[ChordArcMouseHandler] = js.undefined
  var padAngle: js.UndefOr[Double] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var ribbonBorderWidth: js.UndefOr[Double] = js.undefined
  var ribbonHoverOpacity: js.UndefOr[Double] = js.undefined
  var ribbonHoverOthersOpacity: js.UndefOr[Double] = js.undefined
  var ribbonOpacity: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var valueFormat: js.UndefOr[String | ValueFormatter] = js.undefined
}

object ChordCanvasProps {
  @scala.inline
  def apply(
    keys: js.Array[String],
    layers: js.Array[_],
    matrix: js.Array[js.Array[Double]],
    BorderColor: InheritedColorProp[_] = null,
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
    onArcClick: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onArcMouseEnter: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onArcMouseLeave: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onArcMouseMove: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    padAngle: Int | Double = null,
    pixelRatio: Int | Double = null,
    ribbonBorderWidth: Int | Double = null,
    ribbonHoverOpacity: Int | Double = null,
    ribbonHoverOthersOpacity: Int | Double = null,
    ribbonOpacity: Int | Double = null,
    theme: Theme = null,
    valueFormat: String | ValueFormatter = null
  ): ChordCanvasProps = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any])
    if (BorderColor != null) __obj.updateDynamic("BorderColor")(BorderColor.asInstanceOf[js.Any])
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
    if (onArcClick != null) __obj.updateDynamic("onArcClick")(js.Any.fromFunction2(onArcClick))
    if (onArcMouseEnter != null) __obj.updateDynamic("onArcMouseEnter")(js.Any.fromFunction2(onArcMouseEnter))
    if (onArcMouseLeave != null) __obj.updateDynamic("onArcMouseLeave")(js.Any.fromFunction2(onArcMouseLeave))
    if (onArcMouseMove != null) __obj.updateDynamic("onArcMouseMove")(js.Any.fromFunction2(onArcMouseMove))
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (ribbonBorderWidth != null) __obj.updateDynamic("ribbonBorderWidth")(ribbonBorderWidth.asInstanceOf[js.Any])
    if (ribbonHoverOpacity != null) __obj.updateDynamic("ribbonHoverOpacity")(ribbonHoverOpacity.asInstanceOf[js.Any])
    if (ribbonHoverOthersOpacity != null) __obj.updateDynamic("ribbonHoverOthersOpacity")(ribbonHoverOthersOpacity.asInstanceOf[js.Any])
    if (ribbonOpacity != null) __obj.updateDynamic("ribbonOpacity")(ribbonOpacity.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(valueFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChordCanvasProps]
  }
}

