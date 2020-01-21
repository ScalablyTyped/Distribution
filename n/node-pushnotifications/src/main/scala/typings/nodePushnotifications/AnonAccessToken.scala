package typings.nodePushnotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessToken extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var client_id: js.UndefOr[String] = js.undefined
  var client_secret: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  var notificationMethod: js.UndefOr[String] = js.undefined
}

object AnonAccessToken {
  @scala.inline
  def apply(
    accessToken: String = null,
    client_id: String = null,
    client_secret: String = null,
    headers: String = null,
    notificationMethod: String = null
  ): AnonAccessToken = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (notificationMethod != null) __obj.updateDynamic("notificationMethod")(notificationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessToken]
  }
}

