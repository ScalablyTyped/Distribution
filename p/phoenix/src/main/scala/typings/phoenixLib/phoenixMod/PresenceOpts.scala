package typings
package phoenixLib.phoenixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresenceOpts extends js.Object {
  var events: js.UndefOr[phoenixLib.Anon_Diff] = js.undefined
}

object PresenceOpts {
  @scala.inline
  def apply(events: phoenixLib.Anon_Diff = null): PresenceOpts = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[PresenceOpts]
  }
}

