package typings.popmotion

import typings.popmotion.libObserverTypesMod.Update
import typings.popmotion.libReactionsValueMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InitialSubscription extends js.Object {
  var initialSubscription: js.UndefOr[Update] = js.undefined
  var value: Value
}

object Anon_InitialSubscription {
  @scala.inline
  def apply(value: Value, initialSubscription: Update = null): Anon_InitialSubscription = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (initialSubscription != null) __obj.updateDynamic("initialSubscription")(initialSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InitialSubscription]
  }
}

