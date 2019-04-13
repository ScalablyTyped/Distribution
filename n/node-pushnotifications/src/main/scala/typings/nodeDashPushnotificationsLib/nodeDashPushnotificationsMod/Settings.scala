package typings
package nodeDashPushnotificationsLib.nodeDashPushnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /** Amazon Device Messaging */
  var adm: js.UndefOr[nodeDashPushnotificationsLib.Anon_Clientid] = js.undefined
  /** Apple Push Notifications */
  var apn: js.UndefOr[nodeDashPushnotificationsLib.Anon_Address] = js.undefined
  /** Google Cloud Messaging  */
  var gcm: js.UndefOr[nodeDashPushnotificationsLib.Anon_Id] = js.undefined
  /** Microsoft Push Notification Service */
  var mpns: js.UndefOr[nodeDashPushnotificationsLib.Anon_Options] = js.undefined
  /** Windows Push Notifications */
  var wns: js.UndefOr[nodeDashPushnotificationsLib.Anon_AccessToken] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    adm: nodeDashPushnotificationsLib.Anon_Clientid = null,
    apn: nodeDashPushnotificationsLib.Anon_Address = null,
    gcm: nodeDashPushnotificationsLib.Anon_Id = null,
    mpns: nodeDashPushnotificationsLib.Anon_Options = null,
    wns: nodeDashPushnotificationsLib.Anon_AccessToken = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (adm != null) __obj.updateDynamic("adm")(adm)
    if (apn != null) __obj.updateDynamic("apn")(apn)
    if (gcm != null) __obj.updateDynamic("gcm")(gcm)
    if (mpns != null) __obj.updateDynamic("mpns")(mpns)
    if (wns != null) __obj.updateDynamic("wns")(wns)
    __obj.asInstanceOf[Settings]
  }
}

