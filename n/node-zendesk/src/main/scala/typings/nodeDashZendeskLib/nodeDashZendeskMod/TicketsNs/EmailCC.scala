package typings
package nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailCC extends js.Object {
  var action: java.lang.String
  var user_email: js.UndefOr[java.lang.String] = js.undefined
  var user_id: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID] = js.undefined
}

object EmailCC {
  @scala.inline
  def apply(
    action: java.lang.String,
    user_email: java.lang.String = null,
    user_id: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID] = js.undefined
  ): EmailCC = {
    val __obj = js.Dynamic.literal(action = action)
    if (user_email != null) __obj.updateDynamic("user_email")(user_email)
    if (!js.isUndefined(user_id)) __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[EmailCC]
  }
}

