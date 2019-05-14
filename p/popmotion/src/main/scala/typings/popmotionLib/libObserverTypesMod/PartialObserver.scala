package typings
package popmotionLib.libObserverTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialObserver extends _ObserverCandidate {
  var complete: js.UndefOr[Complete] = js.undefined
  var error: js.UndefOr[Error] = js.undefined
  var registerParent: js.UndefOr[js.Function] = js.undefined
  var update: js.UndefOr[Update] = js.undefined
}

object PartialObserver {
  @scala.inline
  def apply(
    complete: Complete = null,
    error: Error = null,
    registerParent: js.Function = null,
    update: Update = null
  ): PartialObserver = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (error != null) __obj.updateDynamic("error")(error)
    if (registerParent != null) __obj.updateDynamic("registerParent")(registerParent)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[PartialObserver]
  }
}

