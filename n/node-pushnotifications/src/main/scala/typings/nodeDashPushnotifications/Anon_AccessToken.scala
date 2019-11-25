package typings.nodeDashPushnotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessToken extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var client_id: js.UndefOr[String] = js.undefined
  var client_secret: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  var notificationMethod: js.UndefOr[String] = js.undefined
}

object Anon_AccessToken {
  @scala.inline
  def apply(
    accessToken: String = null,
    client_id: String = null,
    client_secret: String = null,
    headers: String = null,
    notificationMethod: String = null
  ): Anon_AccessToken = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (notificationMethod != null) __obj.updateDynamic("notificationMethod")(notificationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccessToken]
  }
}

