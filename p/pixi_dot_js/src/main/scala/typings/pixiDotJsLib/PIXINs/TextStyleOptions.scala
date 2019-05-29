package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// text
trait TextStyleOptions extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var breakWords: js.UndefOr[scala.Boolean] = js.undefined
  var dropShadow: js.UndefOr[scala.Boolean] = js.undefined
  var dropShadowAlpha: js.UndefOr[scala.Double] = js.undefined
  var dropShadowAngle: js.UndefOr[scala.Double] = js.undefined
  var dropShadowBlur: js.UndefOr[scala.Double] = js.undefined
  var dropShadowColor: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var dropShadowDistance: js.UndefOr[scala.Double] = js.undefined
  var fill: js.UndefOr[
    java.lang.String | (js.Array[scala.Double | java.lang.String]) | scala.Double | stdLib.CanvasGradient | stdLib.CanvasPattern
  ] = js.undefined
  var fillGradientStops: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var fillGradientType: js.UndefOr[scala.Double] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var fontSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var fontVariant: js.UndefOr[java.lang.String] = js.undefined
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  var leading: js.UndefOr[scala.Double] = js.undefined
  var letterSpacing: js.UndefOr[scala.Double] = js.undefined
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  var lineJoin: js.UndefOr[java.lang.String] = js.undefined
  var miterLimit: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var strokeThickness: js.UndefOr[scala.Double] = js.undefined
  var textBaseline: js.UndefOr[java.lang.String] = js.undefined
  var trim: js.UndefOr[scala.Boolean] = js.undefined
  var whiteSpace: js.UndefOr[java.lang.String] = js.undefined
  var wordWrap: js.UndefOr[scala.Boolean] = js.undefined
  var wordWrapWidth: js.UndefOr[scala.Double] = js.undefined
}

object TextStyleOptions {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    breakWords: js.UndefOr[scala.Boolean] = js.undefined,
    dropShadow: js.UndefOr[scala.Boolean] = js.undefined,
    dropShadowAlpha: scala.Int | scala.Double = null,
    dropShadowAngle: scala.Int | scala.Double = null,
    dropShadowBlur: scala.Int | scala.Double = null,
    dropShadowColor: java.lang.String | scala.Double = null,
    dropShadowDistance: scala.Int | scala.Double = null,
    fill: java.lang.String | (js.Array[scala.Double | java.lang.String]) | scala.Double | stdLib.CanvasGradient | stdLib.CanvasPattern = null,
    fillGradientStops: js.Array[scala.Double] = null,
    fillGradientType: scala.Int | scala.Double = null,
    fontFamily: java.lang.String | js.Array[java.lang.String] = null,
    fontSize: scala.Double | java.lang.String = null,
    fontStyle: java.lang.String = null,
    fontVariant: java.lang.String = null,
    fontWeight: java.lang.String = null,
    leading: scala.Int | scala.Double = null,
    letterSpacing: scala.Int | scala.Double = null,
    lineHeight: scala.Int | scala.Double = null,
    lineJoin: java.lang.String = null,
    miterLimit: scala.Int | scala.Double = null,
    padding: scala.Int | scala.Double = null,
    stroke: java.lang.String | scala.Double = null,
    strokeThickness: scala.Int | scala.Double = null,
    textBaseline: java.lang.String = null,
    trim: js.UndefOr[scala.Boolean] = js.undefined,
    whiteSpace: java.lang.String = null,
    wordWrap: js.UndefOr[scala.Boolean] = js.undefined,
    wordWrapWidth: scala.Int | scala.Double = null
  ): TextStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(breakWords)) __obj.updateDynamic("breakWords")(breakWords)
    if (!js.isUndefined(dropShadow)) __obj.updateDynamic("dropShadow")(dropShadow)
    if (dropShadowAlpha != null) __obj.updateDynamic("dropShadowAlpha")(dropShadowAlpha.asInstanceOf[js.Any])
    if (dropShadowAngle != null) __obj.updateDynamic("dropShadowAngle")(dropShadowAngle.asInstanceOf[js.Any])
    if (dropShadowBlur != null) __obj.updateDynamic("dropShadowBlur")(dropShadowBlur.asInstanceOf[js.Any])
    if (dropShadowColor != null) __obj.updateDynamic("dropShadowColor")(dropShadowColor.asInstanceOf[js.Any])
    if (dropShadowDistance != null) __obj.updateDynamic("dropShadowDistance")(dropShadowDistance.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillGradientStops != null) __obj.updateDynamic("fillGradientStops")(fillGradientStops)
    if (fillGradientType != null) __obj.updateDynamic("fillGradientType")(fillGradientType.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (leading != null) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeThickness != null) __obj.updateDynamic("strokeThickness")(strokeThickness.asInstanceOf[js.Any])
    if (textBaseline != null) __obj.updateDynamic("textBaseline")(textBaseline)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    if (whiteSpace != null) __obj.updateDynamic("whiteSpace")(whiteSpace)
    if (!js.isUndefined(wordWrap)) __obj.updateDynamic("wordWrap")(wordWrap)
    if (wordWrapWidth != null) __obj.updateDynamic("wordWrapWidth")(wordWrapWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleOptions]
  }
}

