package typings.pixiDotJs.PIXINs

import typings.std.CanvasGradient
import typings.std.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// text
trait TextStyleOptions extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var breakWords: js.UndefOr[Boolean] = js.undefined
  var dropShadow: js.UndefOr[Boolean] = js.undefined
  var dropShadowAlpha: js.UndefOr[Double] = js.undefined
  var dropShadowAngle: js.UndefOr[Double] = js.undefined
  var dropShadowBlur: js.UndefOr[Double] = js.undefined
  var dropShadowColor: js.UndefOr[String | Double] = js.undefined
  var dropShadowDistance: js.UndefOr[Double] = js.undefined
  var fill: js.UndefOr[String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern] = js.undefined
  var fillGradientStops: js.UndefOr[js.Array[Double]] = js.undefined
  var fillGradientType: js.UndefOr[Double] = js.undefined
  var fontFamily: js.UndefOr[String | js.Array[String]] = js.undefined
  var fontSize: js.UndefOr[Double | String] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var fontVariant: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[String] = js.undefined
  var leading: js.UndefOr[Double] = js.undefined
  var letterSpacing: js.UndefOr[Double] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var lineJoin: js.UndefOr[String] = js.undefined
  var miterLimit: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[String | Double] = js.undefined
  var strokeThickness: js.UndefOr[Double] = js.undefined
  var textBaseline: js.UndefOr[String] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
  var whiteSpace: js.UndefOr[String] = js.undefined
  var wordWrap: js.UndefOr[Boolean] = js.undefined
  var wordWrapWidth: js.UndefOr[Double] = js.undefined
}

object TextStyleOptions {
  @scala.inline
  def apply(
    align: String = null,
    breakWords: js.UndefOr[Boolean] = js.undefined,
    dropShadow: js.UndefOr[Boolean] = js.undefined,
    dropShadowAlpha: Int | Double = null,
    dropShadowAngle: Int | Double = null,
    dropShadowBlur: Int | Double = null,
    dropShadowColor: String | Double = null,
    dropShadowDistance: Int | Double = null,
    fill: String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern = null,
    fillGradientStops: js.Array[Double] = null,
    fillGradientType: Int | Double = null,
    fontFamily: String | js.Array[String] = null,
    fontSize: Double | String = null,
    fontStyle: String = null,
    fontVariant: String = null,
    fontWeight: String = null,
    leading: Int | Double = null,
    letterSpacing: Int | Double = null,
    lineHeight: Int | Double = null,
    lineJoin: String = null,
    miterLimit: Int | Double = null,
    padding: Int | Double = null,
    stroke: String | Double = null,
    strokeThickness: Int | Double = null,
    textBaseline: String = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    whiteSpace: String = null,
    wordWrap: js.UndefOr[Boolean] = js.undefined,
    wordWrapWidth: Int | Double = null
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

