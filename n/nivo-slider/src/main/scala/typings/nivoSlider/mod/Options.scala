package typings.nivoSlider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var afterChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var animSpeed: js.UndefOr[Double] = js.undefined
  var beforeChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var boxCols: js.UndefOr[Double] = js.undefined
  var boxRows: js.UndefOr[Double] = js.undefined
  var controlNav: js.UndefOr[Boolean] = js.undefined
  var controlNavThumbs: js.UndefOr[Boolean] = js.undefined
  var directionNav: js.UndefOr[Boolean] = js.undefined
  var effect: js.UndefOr[EffectType] = js.undefined
  var lastSlide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var manualAdvance: js.UndefOr[Boolean] = js.undefined
  var nextText: js.UndefOr[String] = js.undefined
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  var pauseTime: js.UndefOr[Double] = js.undefined
  var prevText: js.UndefOr[String] = js.undefined
  var randomStart: js.UndefOr[Boolean] = js.undefined
  var slices: js.UndefOr[Double] = js.undefined
  var slideshowEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var startSlide: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    afterChange: () => Unit = null,
    afterLoad: () => Unit = null,
    animSpeed: js.UndefOr[Double] = js.undefined,
    beforeChange: () => Unit = null,
    boxCols: js.UndefOr[Double] = js.undefined,
    boxRows: js.UndefOr[Double] = js.undefined,
    controlNav: js.UndefOr[Boolean] = js.undefined,
    controlNavThumbs: js.UndefOr[Boolean] = js.undefined,
    directionNav: js.UndefOr[Boolean] = js.undefined,
    effect: EffectType = null,
    lastSlide: () => Unit = null,
    manualAdvance: js.UndefOr[Boolean] = js.undefined,
    nextText: String = null,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    pauseTime: js.UndefOr[Double] = js.undefined,
    prevText: String = null,
    randomStart: js.UndefOr[Boolean] = js.undefined,
    slices: js.UndefOr[Double] = js.undefined,
    slideshowEnd: () => Unit = null,
    startSlide: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction0(afterChange))
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(js.Any.fromFunction0(afterLoad))
    if (!js.isUndefined(animSpeed)) __obj.updateDynamic("animSpeed")(animSpeed.get.asInstanceOf[js.Any])
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction0(beforeChange))
    if (!js.isUndefined(boxCols)) __obj.updateDynamic("boxCols")(boxCols.get.asInstanceOf[js.Any])
    if (!js.isUndefined(boxRows)) __obj.updateDynamic("boxRows")(boxRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(controlNav)) __obj.updateDynamic("controlNav")(controlNav.get.asInstanceOf[js.Any])
    if (!js.isUndefined(controlNavThumbs)) __obj.updateDynamic("controlNavThumbs")(controlNavThumbs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(directionNav)) __obj.updateDynamic("directionNav")(directionNav.get.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (lastSlide != null) __obj.updateDynamic("lastSlide")(js.Any.fromFunction0(lastSlide))
    if (!js.isUndefined(manualAdvance)) __obj.updateDynamic("manualAdvance")(manualAdvance.get.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseTime)) __obj.updateDynamic("pauseTime")(pauseTime.get.asInstanceOf[js.Any])
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(randomStart)) __obj.updateDynamic("randomStart")(randomStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slices)) __obj.updateDynamic("slices")(slices.get.asInstanceOf[js.Any])
    if (slideshowEnd != null) __obj.updateDynamic("slideshowEnd")(js.Any.fromFunction0(slideshowEnd))
    if (!js.isUndefined(startSlide)) __obj.updateDynamic("startSlide")(startSlide.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

