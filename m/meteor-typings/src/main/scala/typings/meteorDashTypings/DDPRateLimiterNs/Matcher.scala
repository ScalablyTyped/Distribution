package typings.meteorDashTypings.DDPRateLimiterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matcher extends js.Object {
  var clientAddress: js.UndefOr[String | (js.Function1[/* clientAddress */ String, Boolean])] = js.undefined
  var connectionId: js.UndefOr[String | (js.Function1[/* connectionId */ String, Boolean])] = js.undefined
  var name: js.UndefOr[String | (js.Function1[/* name */ String, Boolean])] = js.undefined
  var `type`: js.UndefOr[String | (js.Function1[/* type */ String, Boolean])] = js.undefined
  var userId: js.UndefOr[String | (js.Function1[/* userId */ String, Boolean])] = js.undefined
}

object Matcher {
  @scala.inline
  def apply(
    clientAddress: String | (js.Function1[/* clientAddress */ String, Boolean]) = null,
    connectionId: String | (js.Function1[/* connectionId */ String, Boolean]) = null,
    name: String | (js.Function1[/* name */ String, Boolean]) = null,
    `type`: String | (js.Function1[/* type */ String, Boolean]) = null,
    userId: String | (js.Function1[/* userId */ String, Boolean]) = null
  ): Matcher = {
    val __obj = js.Dynamic.literal()
    if (clientAddress != null) __obj.updateDynamic("clientAddress")(clientAddress.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matcher]
  }
}

