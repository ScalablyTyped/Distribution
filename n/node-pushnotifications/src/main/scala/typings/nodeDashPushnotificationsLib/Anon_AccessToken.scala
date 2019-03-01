package typings
package nodeDashPushnotificationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessToken extends js.Object {
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  var client_secret: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[java.lang.String] = js.undefined
  var notificationMethod: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccessToken {
  @scala.inline
  def apply(
    accessToken: java.lang.String = null,
    client_id: java.lang.String = null,
    client_secret: java.lang.String = null,
    headers: java.lang.String = null,
    notificationMethod: java.lang.String = null
  ): Anon_AccessToken = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (notificationMethod != null) __obj.updateDynamic("notificationMethod")(notificationMethod)
    __obj.asInstanceOf[Anon_AccessToken]
  }
}

