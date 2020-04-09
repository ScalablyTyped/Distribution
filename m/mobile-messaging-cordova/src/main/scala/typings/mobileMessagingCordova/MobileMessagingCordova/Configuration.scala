package typings.mobileMessagingCordova.MobileMessagingCordova

import typings.mobileMessagingCordova.AnonActions
import typings.mobileMessagingCordova.AnonApplicationCodePersistingDisabled
import typings.mobileMessagingCordova.AnonForceCleanup
import typings.mobileMessagingCordova.AnonMultipleNotifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var android: js.UndefOr[AnonMultipleNotifications] = js.undefined
  /**
    * The application code of your Application from Push Portal website
    */
  var applicationCode: String
  var defaultMessageStorage: js.UndefOr[Boolean] = js.undefined
  var geofencingEnabled: js.UndefOr[Boolean] = js.undefined
  var ios: js.UndefOr[AnonForceCleanup] = js.undefined
  /**
    * Message storage save callback
    */
  var messageStorage: js.UndefOr[String] = js.undefined
  var notificationCategories: js.UndefOr[js.Array[AnonActions]] = js.undefined
  var privacySettings: js.UndefOr[AnonApplicationCodePersistingDisabled] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    applicationCode: String,
    android: AnonMultipleNotifications = null,
    defaultMessageStorage: js.UndefOr[Boolean] = js.undefined,
    geofencingEnabled: js.UndefOr[Boolean] = js.undefined,
    ios: AnonForceCleanup = null,
    messageStorage: String = null,
    notificationCategories: js.Array[AnonActions] = null,
    privacySettings: AnonApplicationCodePersistingDisabled = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(applicationCode = applicationCode.asInstanceOf[js.Any])
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMessageStorage)) __obj.updateDynamic("defaultMessageStorage")(defaultMessageStorage.asInstanceOf[js.Any])
    if (!js.isUndefined(geofencingEnabled)) __obj.updateDynamic("geofencingEnabled")(geofencingEnabled.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (messageStorage != null) __obj.updateDynamic("messageStorage")(messageStorage.asInstanceOf[js.Any])
    if (notificationCategories != null) __obj.updateDynamic("notificationCategories")(notificationCategories.asInstanceOf[js.Any])
    if (privacySettings != null) __obj.updateDynamic("privacySettings")(privacySettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

