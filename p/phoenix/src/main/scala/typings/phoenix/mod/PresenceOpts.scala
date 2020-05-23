package typings.phoenix.mod

import typings.phoenix.anon.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresenceOpts extends js.Object {
  var events: js.UndefOr[Diff] = js.undefined
}

object PresenceOpts {
  @scala.inline
  def apply(events: Diff = null): PresenceOpts = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresenceOpts]
  }
}

