package typings
package popmotionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InitialSubscription extends js.Object {
  var initialSubscription: js.UndefOr[popmotionLib.libObserverTypesMod.Update] = js.undefined
  var value: popmotionLib.libReactionsValueMod.Value
}

object Anon_InitialSubscription {
  @scala.inline
  def apply(
    value: popmotionLib.libReactionsValueMod.Value,
    initialSubscription: popmotionLib.libObserverTypesMod.Update = null
  ): Anon_InitialSubscription = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (initialSubscription != null) __obj.updateDynamic("initialSubscription")(initialSubscription)
    __obj.asInstanceOf[Anon_InitialSubscription]
  }
}

