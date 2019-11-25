package typings.popmotion.libAnimationsKeyframesTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPopmotionEasing.atPopmotionEasingMod.Easing
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
    duration: Int | Double = null,
    ease: Easing | js.Array[Easing] | StringDictionary[Easing] = null,
    easings: js.Array[Easing] = null,
    elapsed: Int | Double = null,
    flip: Int | Double = null,
    loop: Int | Double = null,
    times: js.Array[Double] = null,
    yoyo: Int | Double = null
  ): KeyframesProps = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (easings != null) __obj.updateDynamic("easings")(easings.asInstanceOf[js.Any])
    if (elapsed != null) __obj.updateDynamic("elapsed")(elapsed.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    if (yoyo != null) __obj.updateDynamic("yoyo")(yoyo.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframesProps]
  }
}

