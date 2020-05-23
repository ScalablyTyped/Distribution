package typings.pixiJs.anon

import typings.std.CanvasGradient
import typings.std.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align extends js.Object {
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

object Align {
  @scala.inline
  def apply(
    align: String = null,
    breakWords: js.UndefOr[Boolean] = js.undefined,
    dropShadow: js.UndefOr[Boolean] = js.undefined,
    dropShadowAlpha: js.UndefOr[Double] = js.undefined,
    dropShadowAngle: js.UndefOr[Double] = js.undefined,
    dropShadowBlur: js.UndefOr[Double] = js.undefined,
    dropShadowColor: String | Double = null,
    dropShadowDistance: js.UndefOr[Double] = js.undefined,
    fill: String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern = null,
    fillGradientStops: js.Array[Double] = null,
    fillGradientType: js.UndefOr[Double] = js.undefined,
    fontFamily: String | js.Array[String] = null,
    fontSize: Double | String = null,
    fontStyle: String = null,
    fontVariant: String = null,
    fontWeight: String = null,
    leading: js.UndefOr[Double] = js.undefined,
    letterSpacing: js.UndefOr[Double] = js.undefined,
    lineHeight: js.UndefOr[Double] = js.undefined,
    lineJoin: String = null,
    miterLimit: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    stroke: String | Double = null,
    strokeThickness: js.UndefOr[Double] = js.undefined,
    textBaseline: String = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    whiteSpace: String = null,
    wordWrap: js.UndefOr[Boolean] = js.undefined,
    wordWrapWidth: js.UndefOr[Double] = js.undefined
  ): Align = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(breakWords)) __obj.updateDynamic("breakWords")(breakWords.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropShadow)) __obj.updateDynamic("dropShadow")(dropShadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropShadowAlpha)) __obj.updateDynamic("dropShadowAlpha")(dropShadowAlpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropShadowAngle)) __obj.updateDynamic("dropShadowAngle")(dropShadowAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropShadowBlur)) __obj.updateDynamic("dropShadowBlur")(dropShadowBlur.get.asInstanceOf[js.Any])
    if (dropShadowColor != null) __obj.updateDynamic("dropShadowColor")(dropShadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(dropShadowDistance)) __obj.updateDynamic("dropShadowDistance")(dropShadowDistance.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillGradientStops != null) __obj.updateDynamic("fillGradientStops")(fillGradientStops.asInstanceOf[js.Any])
    if (!js.isUndefined(fillGradientType)) __obj.updateDynamic("fillGradientType")(fillGradientType.get.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(letterSpacing)) __obj.updateDynamic("letterSpacing")(letterSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineHeight)) __obj.updateDynamic("lineHeight")(lineHeight.get.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (!js.isUndefined(miterLimit)) __obj.updateDynamic("miterLimit")(miterLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeThickness)) __obj.updateDynamic("strokeThickness")(strokeThickness.get.asInstanceOf[js.Any])
    if (textBaseline != null) __obj.updateDynamic("textBaseline")(textBaseline.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    if (whiteSpace != null) __obj.updateDynamic("whiteSpace")(whiteSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrap)) __obj.updateDynamic("wordWrap")(wordWrap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapWidth)) __obj.updateDynamic("wordWrapWidth")(wordWrapWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
}

