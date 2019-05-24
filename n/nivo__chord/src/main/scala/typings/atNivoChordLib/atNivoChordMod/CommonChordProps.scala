package typings
package atNivoChordLib.atNivoChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonChordProps extends js.Object {
  var BorderColor: js.UndefOr[atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_]] = js.undefined
  var arcBorderColor: js.UndefOr[atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_]] = js.undefined
  var arcBorderWidth: js.UndefOr[scala.Double] = js.undefined
  var arcHoverOpacity: js.UndefOr[scala.Double] = js.undefined
  var arcHoverOthersOpacity: js.UndefOr[scala.Double] = js.undefined
  var arcOpacity: js.UndefOr[scala.Double] = js.undefined
  var arcTooltip: js.UndefOr[js.Any] = js.undefined
  var colors: js.UndefOr[atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_]] = js.undefined
  var enableLabel: js.UndefOr[scala.Boolean] = js.undefined
  var innerRadiusOffset: js.UndefOr[scala.Double] = js.undefined
  var innerRadiusRatio: js.UndefOr[scala.Double] = js.undefined
  var isInteractive: js.UndefOr[scala.Boolean] = js.undefined
  var keys: js.Array[java.lang.String]
  var label: js.UndefOr[java.lang.String | LabelAccessor] = js.undefined
  var labelOffset: js.UndefOr[scala.Double] = js.undefined
  var labelRotation: js.UndefOr[scala.Double] = js.undefined
  var labelTextColor: js.UndefOr[atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_]] = js.undefined
  var layers: js.Array[_]
  var margin: js.UndefOr[atNivoCoreLib.atNivoCoreMod.Box] = js.undefined
  var matrix: js.Array[js.Array[scala.Double]]
  var onArcClick: js.UndefOr[ChordArcMouseHandler] = js.undefined
  var onArcMouseEnter: js.UndefOr[ChordArcMouseHandler] = js.undefined
  var onArcMouseLeave: js.UndefOr[ChordArcMouseHandler] = js.undefined
  var onArcMouseMove: js.UndefOr[ChordArcMouseHandler] = js.undefined
  var padAngle: js.UndefOr[scala.Double] = js.undefined
  var ribbonBorderWidth: js.UndefOr[scala.Double] = js.undefined
  var ribbonHoverOpacity: js.UndefOr[scala.Double] = js.undefined
  var ribbonHoverOthersOpacity: js.UndefOr[scala.Double] = js.undefined
  var ribbonOpacity: js.UndefOr[scala.Double] = js.undefined
  var theme: js.UndefOr[atNivoCoreLib.atNivoCoreMod.Theme] = js.undefined
  var valueFormat: js.UndefOr[java.lang.String | ValueFormatter] = js.undefined
}

object CommonChordProps {
  @scala.inline
  def apply(
    keys: js.Array[java.lang.String],
    layers: js.Array[_],
    matrix: js.Array[js.Array[scala.Double]],
    BorderColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_] = null,
    arcBorderColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_] = null,
    arcBorderWidth: scala.Int | scala.Double = null,
    arcHoverOpacity: scala.Int | scala.Double = null,
    arcHoverOthersOpacity: scala.Int | scala.Double = null,
    arcOpacity: scala.Int | scala.Double = null,
    arcTooltip: js.Any = null,
    colors: atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_] = null,
    enableLabel: js.UndefOr[scala.Boolean] = js.undefined,
    innerRadiusOffset: scala.Int | scala.Double = null,
    innerRadiusRatio: scala.Int | scala.Double = null,
    isInteractive: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String | LabelAccessor = null,
    labelOffset: scala.Int | scala.Double = null,
    labelRotation: scala.Int | scala.Double = null,
    labelTextColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[_] = null,
    margin: atNivoCoreLib.atNivoCoreMod.Box = null,
    onArcClick: ChordArcMouseHandler = null,
    onArcMouseEnter: ChordArcMouseHandler = null,
    onArcMouseLeave: ChordArcMouseHandler = null,
    onArcMouseMove: ChordArcMouseHandler = null,
    padAngle: scala.Int | scala.Double = null,
    ribbonBorderWidth: scala.Int | scala.Double = null,
    ribbonHoverOpacity: scala.Int | scala.Double = null,
    ribbonHoverOthersOpacity: scala.Int | scala.Double = null,
    ribbonOpacity: scala.Int | scala.Double = null,
    theme: atNivoCoreLib.atNivoCoreMod.Theme = null,
    valueFormat: java.lang.String | ValueFormatter = null
  ): CommonChordProps = {
    val __obj = js.Dynamic.literal(keys = keys, layers = layers, matrix = matrix)
    if (BorderColor != null) __obj.updateDynamic("BorderColor")(BorderColor.asInstanceOf[js.Any])
    if (arcBorderColor != null) __obj.updateDynamic("arcBorderColor")(arcBorderColor.asInstanceOf[js.Any])
    if (arcBorderWidth != null) __obj.updateDynamic("arcBorderWidth")(arcBorderWidth.asInstanceOf[js.Any])
    if (arcHoverOpacity != null) __obj.updateDynamic("arcHoverOpacity")(arcHoverOpacity.asInstanceOf[js.Any])
    if (arcHoverOthersOpacity != null) __obj.updateDynamic("arcHoverOthersOpacity")(arcHoverOthersOpacity.asInstanceOf[js.Any])
    if (arcOpacity != null) __obj.updateDynamic("arcOpacity")(arcOpacity.asInstanceOf[js.Any])
    if (arcTooltip != null) __obj.updateDynamic("arcTooltip")(arcTooltip)
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabel)) __obj.updateDynamic("enableLabel")(enableLabel)
    if (innerRadiusOffset != null) __obj.updateDynamic("innerRadiusOffset")(innerRadiusOffset.asInstanceOf[js.Any])
    if (innerRadiusRatio != null) __obj.updateDynamic("innerRadiusRatio")(innerRadiusRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset.asInstanceOf[js.Any])
    if (labelRotation != null) __obj.updateDynamic("labelRotation")(labelRotation.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (onArcClick != null) __obj.updateDynamic("onArcClick")(onArcClick)
    if (onArcMouseEnter != null) __obj.updateDynamic("onArcMouseEnter")(onArcMouseEnter)
    if (onArcMouseLeave != null) __obj.updateDynamic("onArcMouseLeave")(onArcMouseLeave)
    if (onArcMouseMove != null) __obj.updateDynamic("onArcMouseMove")(onArcMouseMove)
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    if (ribbonBorderWidth != null) __obj.updateDynamic("ribbonBorderWidth")(ribbonBorderWidth.asInstanceOf[js.Any])
    if (ribbonHoverOpacity != null) __obj.updateDynamic("ribbonHoverOpacity")(ribbonHoverOpacity.asInstanceOf[js.Any])
    if (ribbonHoverOthersOpacity != null) __obj.updateDynamic("ribbonHoverOthersOpacity")(ribbonHoverOthersOpacity.asInstanceOf[js.Any])
    if (ribbonOpacity != null) __obj.updateDynamic("ribbonOpacity")(ribbonOpacity.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(valueFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonChordProps]
  }
}

