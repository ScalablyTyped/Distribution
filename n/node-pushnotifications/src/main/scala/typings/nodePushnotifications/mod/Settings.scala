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

@js.native
trait Settings extends js.Object {
  /** Amazon Device Messaging */
  var adm: js.UndefOr[Clientid] = js.native
  /** Apple Push Notifications */
  var apn: js.UndefOr[Address] = js.native
  /** Google Cloud Messaging  */
  var gcm: js.UndefOr[Id] = js.native
  /** Always use FCM? */
  var isAlwaysUseFCM: js.UndefOr[Boolean] = js.native
  /** Microsoft Push Notification Service */
  var mpns: js.UndefOr[Options] = js.native
  /** Web */
  var web: js.UndefOr[RequestOptions] = js.native
  /** Windows Push Notifications */
  var wns: js.UndefOr[AccessToken] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdm(value: Clientid): Self = this.set("adm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdm: Self = this.set("adm", js.undefined)
    @scala.inline
    def setApn(value: Address): Self = this.set("apn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApn: Self = this.set("apn", js.undefined)
    @scala.inline
    def setGcm(value: Id): Self = this.set("gcm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcm: Self = this.set("gcm", js.undefined)
    @scala.inline
    def setIsAlwaysUseFCM(value: Boolean): Self = this.set("isAlwaysUseFCM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAlwaysUseFCM: Self = this.set("isAlwaysUseFCM", js.undefined)
    @scala.inline
    def setMpns(value: Options): Self = this.set("mpns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpns: Self = this.set("mpns", js.undefined)
    @scala.inline
    def setWeb(value: RequestOptions): Self = this.set("web", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeb: Self = this.set("web", js.undefined)
    @scala.inline
    def setWns(value: AccessToken): Self = this.set("wns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWns: Self = this.set("wns", js.undefined)
  }
  
}

