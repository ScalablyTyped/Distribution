package typings.mobileMessagingCordova.MobileMessagingCordova

import typings.mobileMessagingCordova.anon.Actions
import typings.mobileMessagingCordova.anon.ApplicationCodePersistingDisabled
import typings.mobileMessagingCordova.anon.ForceCleanup
import typings.mobileMessagingCordova.anon.MultipleNotifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var android: js.UndefOr[MultipleNotifications] = js.native
  /**
    * The application code of your Application from Push Portal website
    */
  var applicationCode: String = js.native
  var defaultMessageStorage: js.UndefOr[Boolean] = js.native
  var geofencingEnabled: js.UndefOr[Boolean] = js.native
  var ios: js.UndefOr[ForceCleanup] = js.native
  /**
    * Message storage save callback
    */
  var messageStorage: js.UndefOr[String] = js.native
  var notificationCategories: js.UndefOr[js.Array[Actions]] = js.native
  var privacySettings: js.UndefOr[ApplicationCodePersistingDisabled] = js.native
}

object Configuration {
  @scala.inline
  def apply(applicationCode: String): Configuration = {
    val __obj = js.Dynamic.literal(applicationCode = applicationCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
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
    def setApplicationCode(value: String): Self = this.set("applicationCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAndroid(value: MultipleNotifications): Self = this.set("android", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    @scala.inline
    def setDefaultMessageStorage(value: Boolean): Self = this.set("defaultMessageStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMessageStorage: Self = this.set("defaultMessageStorage", js.undefined)
    @scala.inline
    def setGeofencingEnabled(value: Boolean): Self = this.set("geofencingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeofencingEnabled: Self = this.set("geofencingEnabled", js.undefined)
    @scala.inline
    def setIos(value: ForceCleanup): Self = this.set("ios", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
    @scala.inline
    def setMessageStorage(value: String): Self = this.set("messageStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageStorage: Self = this.set("messageStorage", js.undefined)
    @scala.inline
    def setNotificationCategoriesVarargs(value: Actions*): Self = this.set("notificationCategories", js.Array(value :_*))
    @scala.inline
    def setNotificationCategories(value: js.Array[Actions]): Self = this.set("notificationCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationCategories: Self = this.set("notificationCategories", js.undefined)
    @scala.inline
    def setPrivacySettings(value: ApplicationCodePersistingDisabled): Self = this.set("privacySettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivacySettings: Self = this.set("privacySettings", js.undefined)
  }
  
}

