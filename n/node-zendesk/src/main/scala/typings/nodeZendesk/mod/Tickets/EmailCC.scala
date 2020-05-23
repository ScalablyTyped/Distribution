package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
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
  def apply(action: String, user_email: String = null, user_id: js.UndefOr[ZendeskID] = js.undefined): EmailCC = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (user_email != null) __obj.updateDynamic("user_email")(user_email.asInstanceOf[js.Any])
    if (!js.isUndefined(user_id)) __obj.updateDynamic("user_id")(user_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailCC]
  }
}

