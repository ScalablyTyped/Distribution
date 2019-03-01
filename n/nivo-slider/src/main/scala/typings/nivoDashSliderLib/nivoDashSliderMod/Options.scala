package typings
package nivoDashSliderLib.nivoDashSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var afterChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var animSpeed: js.UndefOr[scala.Double] = js.undefined
  var beforeChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var boxCols: js.UndefOr[scala.Double] = js.undefined
  var boxRows: js.UndefOr[scala.Double] = js.undefined
  var controlNav: js.UndefOr[scala.Boolean] = js.undefined
  var controlNavThumbs: js.UndefOr[scala.Boolean] = js.undefined
  var directionNav: js.UndefOr[scala.Boolean] = js.undefined
  var effect: js.UndefOr[EffectType] = js.undefined
  var lastSlide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var manualAdvance: js.UndefOr[scala.Boolean] = js.undefined
  var nextText: js.UndefOr[java.lang.String] = js.undefined
  var pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var pauseTime: js.UndefOr[scala.Double] = js.undefined
  var prevText: js.UndefOr[java.lang.String] = js.undefined
  var randomStart: js.UndefOr[scala.Boolean] = js.undefined
  var slices: js.UndefOr[scala.Double] = js.undefined
  var slideshowEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var startSlide: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    afterChange: js.Function0[scala.Unit] = null,
    afterLoad: js.Function0[scala.Unit] = null,
    animSpeed: scala.Int | scala.Double = null,
    beforeChange: js.Function0[scala.Unit] = null,
    boxCols: scala.Int | scala.Double = null,
    boxRows: scala.Int | scala.Double = null,
    controlNav: js.UndefOr[scala.Boolean] = js.undefined,
    controlNavThumbs: js.UndefOr[scala.Boolean] = js.undefined,
    directionNav: js.UndefOr[scala.Boolean] = js.undefined,
    effect: EffectType = null,
    lastSlide: js.Function0[scala.Unit] = null,
    manualAdvance: js.UndefOr[scala.Boolean] = js.undefined,
    nextText: java.lang.String = null,
    pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    pauseTime: scala.Int | scala.Double = null,
    prevText: java.lang.String = null,
    randomStart: js.UndefOr[scala.Boolean] = js.undefined,
    slices: scala.Int | scala.Double = null,
    slideshowEnd: js.Function0[scala.Unit] = null,
    startSlide: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (afterChange != null) __obj.updateDynamic("afterChange")(afterChange)
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(afterLoad)
    if (animSpeed != null) __obj.updateDynamic("animSpeed")(animSpeed.asInstanceOf[js.Any])
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(beforeChange)
    if (boxCols != null) __obj.updateDynamic("boxCols")(boxCols.asInstanceOf[js.Any])
    if (boxRows != null) __obj.updateDynamic("boxRows")(boxRows.asInstanceOf[js.Any])
    if (!js.isUndefined(controlNav)) __obj.updateDynamic("controlNav")(controlNav)
    if (!js.isUndefined(controlNavThumbs)) __obj.updateDynamic("controlNavThumbs")(controlNavThumbs)
    if (!js.isUndefined(directionNav)) __obj.updateDynamic("directionNav")(directionNav)
    if (effect != null) __obj.updateDynamic("effect")(effect)
    if (lastSlide != null) __obj.updateDynamic("lastSlide")(lastSlide)
    if (!js.isUndefined(manualAdvance)) __obj.updateDynamic("manualAdvance")(manualAdvance)
    if (nextText != null) __obj.updateDynamic("nextText")(nextText)
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (pauseTime != null) __obj.updateDynamic("pauseTime")(pauseTime.asInstanceOf[js.Any])
    if (prevText != null) __obj.updateDynamic("prevText")(prevText)
    if (!js.isUndefined(randomStart)) __obj.updateDynamic("randomStart")(randomStart)
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    if (slideshowEnd != null) __obj.updateDynamic("slideshowEnd")(slideshowEnd)
    if (startSlide != null) __obj.updateDynamic("startSlide")(startSlide.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

