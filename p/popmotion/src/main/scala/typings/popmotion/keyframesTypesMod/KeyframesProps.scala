package typings.popmotion.keyframesTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionEasing.mod.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyframesProps extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var ease: js.UndefOr[Easing | js.Array[Easing] | StringDictionary[Easing]] = js.undefined
  var easings: js.UndefOr[js.Array[Easing]] = js.undefined
  var elapsed: js.UndefOr[Double] = js.undefined
  var flip: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[Double] = js.undefined
  var times: js.UndefOr[js.Array[Double]] = js.undefined
  var values: Values
  var yoyo: js.UndefOr[Double] = js.undefined
}

object KeyframesProps {
  @scala.inline
  def apply(
    values: Values,
    duration: js.UndefOr[Double] = js.undefined,
    ease: Easing | js.Array[Easing] | StringDictionary[Easing] = null,
    easings: js.Array[Easing] = null,
    elapsed: js.UndefOr[Double] = js.undefined,
    flip: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[Double] = js.undefined,
    times: js.Array[Double] = null,
    yoyo: js.UndefOr[Double] = js.undefined
  ): KeyframesProps = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (easings != null) __obj.updateDynamic("easings")(easings.asInstanceOf[js.Any])
    if (!js.isUndefined(elapsed)) __obj.updateDynamic("elapsed")(elapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframesProps]
  }
}

