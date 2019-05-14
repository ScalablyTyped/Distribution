package typings
package popmotionLib.libAnimationsKeyframesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyframesProps extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var ease: js.UndefOr[
    atPopmotionEasingLib.atPopmotionEasingMod.Easing | js.Array[atPopmotionEasingLib.atPopmotionEasingMod.Easing] | org.scalablytyped.runtime.StringDictionary[atPopmotionEasingLib.atPopmotionEasingMod.Easing]
  ] = js.undefined
  var easings: js.UndefOr[js.Array[atPopmotionEasingLib.atPopmotionEasingMod.Easing]] = js.undefined
  var elapsed: js.UndefOr[scala.Double] = js.undefined
  var flip: js.UndefOr[scala.Double] = js.undefined
  var loop: js.UndefOr[scala.Double] = js.undefined
  var times: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var values: Values
  var yoyo: js.UndefOr[scala.Double] = js.undefined
}

object KeyframesProps {
  @scala.inline
  def apply(
    values: Values,
    duration: scala.Int | scala.Double = null,
    ease: atPopmotionEasingLib.atPopmotionEasingMod.Easing | js.Array[atPopmotionEasingLib.atPopmotionEasingMod.Easing] | org.scalablytyped.runtime.StringDictionary[atPopmotionEasingLib.atPopmotionEasingMod.Easing] = null,
    easings: js.Array[atPopmotionEasingLib.atPopmotionEasingMod.Easing] = null,
    elapsed: scala.Int | scala.Double = null,
    flip: scala.Int | scala.Double = null,
    loop: scala.Int | scala.Double = null,
    times: js.Array[scala.Double] = null,
    yoyo: scala.Int | scala.Double = null
  ): KeyframesProps = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (easings != null) __obj.updateDynamic("easings")(easings)
    if (elapsed != null) __obj.updateDynamic("elapsed")(elapsed.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times)
    if (yoyo != null) __obj.updateDynamic("yoyo")(yoyo.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframesProps]
  }
}

