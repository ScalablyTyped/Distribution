package typings
package popmotionLib.libAnimationsTimelineTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationDefinition extends js.Object {
  var at: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var ease: js.UndefOr[atPopmotionEasingLib.atPopmotionEasingMod.Easing] = js.undefined
  var from: js.UndefOr[popmotionLib.libReactionsValueMod.Value] = js.undefined
  var to: js.UndefOr[popmotionLib.libReactionsValueMod.Value] = js.undefined
  var track: java.lang.String
}

object AnimationDefinition {
  @scala.inline
  def apply(
    track: java.lang.String,
    at: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    ease: atPopmotionEasingLib.atPopmotionEasingMod.Easing = null,
    from: popmotionLib.libReactionsValueMod.Value = null,
    to: popmotionLib.libReactionsValueMod.Value = null
  ): AnimationDefinition = {
    val __obj = js.Dynamic.literal(track = track)
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDefinition]
  }
}

