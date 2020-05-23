package typings.mobileMessagingCordova.MobileMessagingCordova

import typings.mobileMessagingCordova.anon.Actions
import typings.mobileMessagingCordova.anon.ApplicationCodePersistingDisabled
import typings.mobileMessagingCordova.anon.ForceCleanup
import typings.mobileMessagingCordova.anon.MultipleNotifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var android: js.UndefOr[MultipleNotifications] = js.undefined
  /**
    * The application code of your Application from Push Portal website
    */
  var applicationCode: String
  var defaultMessageStorage: js.UndefOr[Boolean] = js.undefined
  var geofencingEnabled: js.UndefOr[Boolean] = js.undefined
  var ios: js.UndefOr[ForceCleanup] = js.undefined
  /**
    * Message storage save callback
    */
  var messageStorage: js.UndefOr[String] = js.undefined
  var notificationCategories: js.UndefOr[js.Array[Actions]] = js.undefined
  var privacySettings: js.UndefOr[ApplicationCodePersistingDisabled] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    applicationCode: String,
    android: MultipleNotifications = null,
    defaultMessageStorage: js.UndefOr[Boolean] = js.undefined,
    geofencingEnabled: js.UndefOr[Boolean] = js.undefined,
    ios: ForceCleanup = null,
    messageStorage: String = null,
    notificationCategories: js.Array[Actions] = null,
    privacySettings: ApplicationCodePersistingDisabled = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(applicationCode = applicationCode.asInstanceOf[js.Any])
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMessageStorage)) __obj.updateDynamic("defaultMessageStorage")(defaultMessageStorage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(geofencingEnabled)) __obj.updateDynamic("geofencingEnabled")(geofencingEnabled.get.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (messageStorage != null) __obj.updateDynamic("messageStorage")(messageStorage.asInstanceOf[js.Any])
    if (notificationCategories != null) __obj.updateDynamic("notificationCategories")(notificationCategories.asInstanceOf[js.Any])
    if (privacySettings != null) __obj.updateDynamic("privacySettings")(privacySettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

