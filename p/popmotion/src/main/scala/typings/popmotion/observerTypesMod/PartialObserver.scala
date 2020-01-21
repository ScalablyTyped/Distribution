package typings.popmotion.observerTypesMod

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
    complete: () => js.Any = null,
    error: /* err */ js.UndefOr[js.Any] => js.Any = null,
    registerParent: js.Function = null,
    update: Update = null
  ): PartialObserver = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (registerParent != null) __obj.updateDynamic("registerParent")(registerParent.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObserver]
  }
}

