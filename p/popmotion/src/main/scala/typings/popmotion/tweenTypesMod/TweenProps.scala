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
    duration: js.UndefOr[Double] = js.undefined,
    ease: Easing | js.Array[Easing] | StringDictionary[Easing] = null,
    elapsed: js.UndefOr[Double] = js.undefined,
    flip: js.UndefOr[Double] = js.undefined,
    flipCount: js.UndefOr[Double] = js.undefined,
    from: Value = null,
    loop: js.UndefOr[Double] = js.undefined,
    loopCount: js.UndefOr[Double] = js.undefined,
    playDirection: js.UndefOr[Double] = js.undefined,
    repeatDelay: js.UndefOr[Double] = js.undefined,
    to: Value = null,
    yoyo: js.UndefOr[Double] = js.undefined,
    yoyoCount: js.UndefOr[Double] = js.undefined
  ): TweenProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (!js.isUndefined(elapsed)) __obj.updateDynamic("elapsed")(elapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flipCount)) __obj.updateDynamic("flipCount")(flipCount.get.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loopCount)) __obj.updateDynamic("loopCount")(loopCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(playDirection)) __obj.updateDynamic("playDirection")(playDirection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatDelay)) __obj.updateDynamic("repeatDelay")(repeatDelay.get.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyoCount)) __obj.updateDynamic("yoyoCount")(yoyoCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenProps]
  }
}

