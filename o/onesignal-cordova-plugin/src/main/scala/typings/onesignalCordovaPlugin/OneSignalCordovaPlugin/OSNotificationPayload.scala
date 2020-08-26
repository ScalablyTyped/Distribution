package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSNotificationPayload extends js.Object {
  var actionButtons: js.Array[OSActionButton] = js.native
  var additionalData: js.UndefOr[js.Any] = js.native
  var backgroundImageLayout: js.UndefOr[OSBackgroundImageLayout] = js.native
  var bigPicture: js.UndefOr[String] = js.native
  var body: String = js.native
  var fromProjectNumber: js.UndefOr[String] = js.native
  var groupKey: js.UndefOr[String] = js.native
  var groupMessage: js.UndefOr[String] = js.native
  var largeIcon: js.UndefOr[String] = js.native
  var launchURL: js.UndefOr[String] = js.native
  var ledColor: js.UndefOr[String] = js.native
  var lockScreenVisibility: js.UndefOr[OSLockScreenVisibility] = js.native
  var notificationID: String = js.native
  var priority: js.UndefOr[Double] = js.native
  var rawPayload: String = js.native
  var smallIcon: js.UndefOr[String] = js.native
  var smallIconAccentColor: js.UndefOr[String] = js.native
  var sound: String = js.native
  var title: String = js.native
}

object OSNotificationPayload {
  @scala.inline
  def apply(
    actionButtons: js.Array[OSActionButton],
    body: String,
    notificationID: String,
    rawPayload: String,
    sound: String,
    title: String
  ): OSNotificationPayload = {
    val __obj = js.Dynamic.literal(actionButtons = actionButtons.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], notificationID = notificationID.asInstanceOf[js.Any], rawPayload = rawPayload.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSNotificationPayload]
  }
  @scala.inline
  implicit class OSNotificationPayloadOps[Self <: OSNotificationPayload] (val x: Self) extends AnyVal {
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
    def setActionButtonsVarargs(value: OSActionButton*): Self = this.set("actionButtons", js.Array(value :_*))
    @scala.inline
    def setActionButtons(value: js.Array[OSActionButton]): Self = this.set("actionButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationID(value: String): Self = this.set("notificationID", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawPayload(value: String): Self = this.set("rawPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalData(value: js.Any): Self = this.set("additionalData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalData: Self = this.set("additionalData", js.undefined)
    @scala.inline
    def setBackgroundImageLayout(value: OSBackgroundImageLayout): Self = this.set("backgroundImageLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImageLayout: Self = this.set("backgroundImageLayout", js.undefined)
    @scala.inline
    def setBigPicture(value: String): Self = this.set("bigPicture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBigPicture: Self = this.set("bigPicture", js.undefined)
    @scala.inline
    def setFromProjectNumber(value: String): Self = this.set("fromProjectNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromProjectNumber: Self = this.set("fromProjectNumber", js.undefined)
    @scala.inline
    def setGroupKey(value: String): Self = this.set("groupKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupKey: Self = this.set("groupKey", js.undefined)
    @scala.inline
    def setGroupMessage(value: String): Self = this.set("groupMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupMessage: Self = this.set("groupMessage", js.undefined)
    @scala.inline
    def setLargeIcon(value: String): Self = this.set("largeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargeIcon: Self = this.set("largeIcon", js.undefined)
    @scala.inline
    def setLaunchURL(value: String): Self = this.set("launchURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchURL: Self = this.set("launchURL", js.undefined)
    @scala.inline
    def setLedColor(value: String): Self = this.set("ledColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLedColor: Self = this.set("ledColor", js.undefined)
    @scala.inline
    def setLockScreenVisibility(value: OSLockScreenVisibility): Self = this.set("lockScreenVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockScreenVisibility: Self = this.set("lockScreenVisibility", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setSmallIcon(value: String): Self = this.set("smallIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallIcon: Self = this.set("smallIcon", js.undefined)
    @scala.inline
    def setSmallIconAccentColor(value: String): Self = this.set("smallIconAccentColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallIconAccentColor: Self = this.set("smallIconAccentColor", js.undefined)
  }
  
}

