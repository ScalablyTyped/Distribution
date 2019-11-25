package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Comments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var flag_options: js.Any
  var flags: js.UndefOr[js.Array[Double]] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(flag_options: js.Any, flags: js.Array[Double] = null): Metadata = {
    val __obj = js.Dynamic.literal(flag_options = flag_options.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

