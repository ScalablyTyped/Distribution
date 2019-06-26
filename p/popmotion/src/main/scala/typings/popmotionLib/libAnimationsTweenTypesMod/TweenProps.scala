package typings
package popmotionLib.libAnimationsTweenTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenProps extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var ease: js.UndefOr[
    atPopmotionEasingLib.atPopmotionEasingMod.Easing | js.Array[atPopmotionEasingLib.atPopmotionEasingMod.Easing] | org.scalablytyped.runtime.StringDictionary[atPopmotionEasingLib.atPopmotionEasingMod.Easing]
  ] = js.undefined
  var elapsed: js.UndefOr[scala.Double] = js.undefined
  var flip: js.UndefOr[scala.Double] = js.undefined
  var flipCount: js.UndefOr[scala.Double] = js.undefined
  var from: js.UndefOr[popmotionLib.libReactionsValueMod.Value] = js.undefined
  var loop: js.UndefOr[scala.Double] = js.undefined
  var loopCount: js.UndefOr[scala.Double] = js.undefined
  var playDirection: js.UndefOr[scala.Double] = js.undefined
  var repeatDelay: js.UndefOr[scala.Double] = js.undefined
  var to: js.UndefOr[popmotionLib.libReactionsValueMod.Value] = js.undefined
  var yoyo: js.UndefOr[scala.Double] = js.undefined
  var yoyoCount: js.UndefOr[scala.Double] = js.undefined
}

object TweenProps {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    ease: atPopmotionEasingLib.atPopmotionEasingMod.Easing | js.Array[atPopmotionEasingLib.atPopmotionEasingMod.Easing] | org.scalablytyped.runtime.StringDictionary[atPopmotionEasingLib.atPopmotionEasingMod.Easing] = null,
    elapsed: scala.Int | scala.Double = null,
    flip: scala.Int | scala.Double = null,
    flipCount: scala.Int | scala.Double = null,
    from: popmotionLib.libReactionsValueMod.Value = null,
    loop: scala.Int | scala.Double = null,
    loopCount: scala.Int | scala.Double = null,
    playDirection: scala.Int | scala.Double = null,
    repeatDelay: scala.Int | scala.Double = null,
    to: popmotionLib.libReactionsValueMod.Value = null,
    yoyo: scala.Int | scala.Double = null,
    yoyoCount: scala.Int | scala.Double = null
  ): TweenProps = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (elapsed != null) __obj.updateDynamic("elapsed")(elapsed.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (flipCount != null) __obj.updateDynamic("flipCount")(flipCount.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (loopCount != null) __obj.updateDynamic("loopCount")(loopCount.asInstanceOf[js.Any])
    if (playDirection != null) __obj.updateDynamic("playDirection")(playDirection.asInstanceOf[js.Any])
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (yoyo != null) __obj.updateDynamic("yoyo")(yoyo.asInstanceOf[js.Any])
    if (yoyoCount != null) __obj.updateDynamic("yoyoCount")(yoyoCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenProps]
  }
}

