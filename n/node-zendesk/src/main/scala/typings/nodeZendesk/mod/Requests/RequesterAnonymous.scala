package typings.nodeZendesk.mod.Requests

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequesterAnonymous extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var locale_id: js.UndefOr[ZendeskID] = js.undefined
  var name: String
}

object RequesterAnonymous {
  @scala.inline
  def apply(name: String, email: String = null, locale_id: js.UndefOr[ZendeskID] = js.undefined): RequesterAnonymous = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(locale_id)) __obj.updateDynamic("locale_id")(locale_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequesterAnonymous]
  }
}

