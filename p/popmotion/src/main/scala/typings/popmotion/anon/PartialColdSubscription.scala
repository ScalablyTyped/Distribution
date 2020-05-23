package typings.popmotion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<popmotion.popmotion/lib/action/types.ColdSubscription> */
trait PartialColdSubscription extends js.Object {
  var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PartialColdSubscription {
  @scala.inline
  def apply(stop: () => Unit = null): PartialColdSubscription = {
    val __obj = js.Dynamic.literal()
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction0(stop))
    __obj.asInstanceOf[PartialColdSubscription]
  }
}

