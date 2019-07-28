package typings.nodeDashZendesk.nodeDashZendeskMod.RequestsNs

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
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
    val __obj = js.Dynamic.literal(name = name)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(locale_id)) __obj.updateDynamic("locale_id")(locale_id)
    __obj.asInstanceOf[RequesterAnonymous]
  }
}

