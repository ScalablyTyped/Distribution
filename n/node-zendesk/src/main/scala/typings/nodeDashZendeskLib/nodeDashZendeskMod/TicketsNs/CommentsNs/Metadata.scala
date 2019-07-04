package typings
package nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.CommentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var flag_options: js.Any
  var flags: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(flag_options: js.Any, flags: js.Array[scala.Double] = null): Metadata = {
    val __obj = js.Dynamic.literal(flag_options = flag_options)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    __obj.asInstanceOf[Metadata]
  }
}

