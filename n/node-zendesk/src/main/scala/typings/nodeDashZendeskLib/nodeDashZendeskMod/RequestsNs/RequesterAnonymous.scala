package typings
package nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequesterAnonymous extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var locale_id: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID] = js.undefined
  var name: java.lang.String
}

object RequesterAnonymous {
  @scala.inline
  def apply(
    name: java.lang.String,
    email: java.lang.String = null,
    locale_id: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID] = js.undefined
  ): RequesterAnonymous = {
    val __obj = js.Dynamic.literal(name = name)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(locale_id)) __obj.updateDynamic("locale_id")(locale_id)
    __obj.asInstanceOf[RequesterAnonymous]
  }
}

