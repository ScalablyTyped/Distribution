package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailCC extends js.Object {
  var action: String
  var user_email: js.UndefOr[String] = js.undefined
  var user_id: js.UndefOr[ZendeskID] = js.undefined
}

object EmailCC {
  @scala.inline
  def apply(action: String, user_email: String = null, user_id: Int | Double = null): EmailCC = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (user_email != null) __obj.updateDynamic("user_email")(user_email.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailCC]
  }
}

