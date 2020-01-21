package typings.popmotion

import typings.popmotion.observerTypesMod.Update
import typings.popmotion.valueMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitialSubscription extends js.Object {
  var initialSubscription: js.UndefOr[Update] = js.undefined
  var value: Value
}

object AnonInitialSubscription {
  @scala.inline
  def apply(value: Value, initialSubscription: Update = null): AnonInitialSubscription = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (initialSubscription != null) __obj.updateDynamic("initialSubscription")(initialSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitialSubscription]
  }
}

