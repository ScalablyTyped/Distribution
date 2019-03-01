package typings
package meteorLib.DDPRateLimiterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matcher extends js.Object {
  var clientAddress: js.UndefOr[
    java.lang.String | (js.Function1[/* clientAddress */ java.lang.String, scala.Boolean])
  ] = js.undefined
  var connectionId: js.UndefOr[
    java.lang.String | (js.Function1[/* connectionId */ java.lang.String, scala.Boolean])
  ] = js.undefined
  var name: js.UndefOr[java.lang.String | (js.Function1[/* name */ java.lang.String, scala.Boolean])] = js.undefined
  var `type`: js.UndefOr[java.lang.String | (js.Function1[/* type */ java.lang.String, scala.Boolean])] = js.undefined
  var userId: js.UndefOr[java.lang.String | (js.Function1[/* userId */ java.lang.String, scala.Boolean])] = js.undefined
}

object Matcher {
  @scala.inline
  def apply(
    clientAddress: java.lang.String | (js.Function1[/* clientAddress */ java.lang.String, scala.Boolean]) = null,
    connectionId: java.lang.String | (js.Function1[/* connectionId */ java.lang.String, scala.Boolean]) = null,
    name: java.lang.String | (js.Function1[/* name */ java.lang.String, scala.Boolean]) = null,
    `type`: java.lang.String | (js.Function1[/* type */ java.lang.String, scala.Boolean]) = null,
    userId: java.lang.String | (js.Function1[/* userId */ java.lang.String, scala.Boolean]) = null
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

