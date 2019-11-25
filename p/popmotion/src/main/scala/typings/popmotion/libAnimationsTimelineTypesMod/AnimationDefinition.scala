package typings.popmotion.libAnimationsTimelineTypesMod

import typings.atPopmotionEasing.atPopmotionEasingMod.Easing
import typings.popmotion.libReactionsValueMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationDefinition extends js.Object {
  var at: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var ease: js.UndefOr[Easing] = js.undefined
  var from: js.UndefOr[Value] = js.undefined
  var to: js.UndefOr[Value] = js.undefined
  var track: String
}

object AnimationDefinition {
  @scala.inline
  def apply(
    track: String,
    at: Int | Double = null,
    duration: Int | Double = null,
    ease: /* v */ Double => Double = null,
    from: Value = null,
    to: Value = null
  ): AnimationDefinition = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(js.Any.fromFunction1(ease))
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDefinition]
  }
}

