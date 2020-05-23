package typings.nodePushnotifications.mod

import typings.nodePushnotifications.anon.AccessToken
import typings.nodePushnotifications.anon.Address
import typings.nodePushnotifications.anon.Clientid
import typings.nodePushnotifications.anon.Id
import typings.nodePushnotifications.anon.Options
import typings.webPush.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /** Amazon Device Messaging */
  var adm: js.UndefOr[Clientid] = js.undefined
  /** Apple Push Notifications */
  var apn: js.UndefOr[Address] = js.undefined
  /** Google Cloud Messaging  */
  var gcm: js.UndefOr[Id] = js.undefined
  /** Always use FCM? */
  var isAlwaysUseFCM: js.UndefOr[Boolean] = js.undefined
  /** Microsoft Push Notification Service */
  var mpns: js.UndefOr[Options] = js.undefined
  /** Web */
  var web: js.UndefOr[RequestOptions] = js.undefined
  /** Windows Push Notifications */
  var wns: js.UndefOr[AccessToken] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    adm: Clientid = null,
    apn: Address = null,
    gcm: Id = null,
    isAlwaysUseFCM: js.UndefOr[Boolean] = js.undefined,
    mpns: Options = null,
    web: RequestOptions = null,
    wns: AccessToken = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (adm != null) __obj.updateDynamic("adm")(adm.asInstanceOf[js.Any])
    if (apn != null) __obj.updateDynamic("apn")(apn.asInstanceOf[js.Any])
    if (gcm != null) __obj.updateDynamic("gcm")(gcm.asInstanceOf[js.Any])
    if (!js.isUndefined(isAlwaysUseFCM)) __obj.updateDynamic("isAlwaysUseFCM")(isAlwaysUseFCM.get.asInstanceOf[js.Any])
    if (mpns != null) __obj.updateDynamic("mpns")(mpns.asInstanceOf[js.Any])
    if (web != null) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    if (wns != null) __obj.updateDynamic("wns")(wns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

