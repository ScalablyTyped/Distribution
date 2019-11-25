package typings.nodeDashPushnotifications.nodeDashPushnotificationsMod

import typings.nodeDashPushnotifications.Anon_AccessToken
import typings.nodeDashPushnotifications.Anon_Address
import typings.nodeDashPushnotifications.Anon_Clientid
import typings.nodeDashPushnotifications.Anon_Id
import typings.nodeDashPushnotifications.Anon_Options
import typings.webDashPush.webDashPushMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /** Amazon Device Messaging */
  var adm: js.UndefOr[Anon_Clientid] = js.undefined
  /** Apple Push Notifications */
  var apn: js.UndefOr[Anon_Address] = js.undefined
  /** Google Cloud Messaging  */
  var gcm: js.UndefOr[Anon_Id] = js.undefined
  /** Always use FCM? */
  var isAlwaysUseFCM: js.UndefOr[Boolean] = js.undefined
  /** Microsoft Push Notification Service */
  var mpns: js.UndefOr[Anon_Options] = js.undefined
  /** Web */
  var web: js.UndefOr[RequestOptions] = js.undefined
  /** Windows Push Notifications */
  var wns: js.UndefOr[Anon_AccessToken] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    adm: Anon_Clientid = null,
    apn: Anon_Address = null,
    gcm: Anon_Id = null,
    isAlwaysUseFCM: js.UndefOr[Boolean] = js.undefined,
    mpns: Anon_Options = null,
    web: RequestOptions = null,
    wns: Anon_AccessToken = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (adm != null) __obj.updateDynamic("adm")(adm.asInstanceOf[js.Any])
    if (apn != null) __obj.updateDynamic("apn")(apn.asInstanceOf[js.Any])
    if (gcm != null) __obj.updateDynamic("gcm")(gcm.asInstanceOf[js.Any])
    if (!js.isUndefined(isAlwaysUseFCM)) __obj.updateDynamic("isAlwaysUseFCM")(isAlwaysUseFCM.asInstanceOf[js.Any])
    if (mpns != null) __obj.updateDynamic("mpns")(mpns.asInstanceOf[js.Any])
    if (web != null) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    if (wns != null) __obj.updateDynamic("wns")(wns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

