package typings.popmotion.tweenTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popmotion.valueMod.Value
import typings.popmotionEasing.mod.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenProps extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var ease: js.UndefOr[Easing | js.Array[Easing] | StringDictionary[Easing]] = js.undefined
  var elapsed: js.UndefOr[Double] = js.undefined
  var flip: js.UndefOr[Double] = js.undefined
  var flipCount: js.UndefOr[Double] = js.undefined
  var from: js.UndefOr[Value] = js.undefined
  var loop: js.UndefOr[Double] = js.undefined
  var loopCount: js.UndefOr[Double] = js.undefined
  var playDirection: js.UndefOr[Double] = js.undefined
  var repeatDelay: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Value] = js.undefined
  var yoyo: js.UndefOr[Double] = js.undefined
  var yoyoCount: js.UndefOr[Double] = js.undefined
}

object TweenProps {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    ease: Easing | js.Array[Easing] | StringDictionary[Easing] = null,
    elapsed: Int | Double = null,
    flip: Int | Double = null,
    flipCount: Int | Double = null,
    from: Value = null,
    loop: Int | Double = null,
    loopCount: Int | Double = null,
    playDirection: Int | Double = null,
    repeatDelay: Int | Double = null,
    to: Value = null,
    yoyo: Int | Double = null,
    yoyoCount: Int | Double = null
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

