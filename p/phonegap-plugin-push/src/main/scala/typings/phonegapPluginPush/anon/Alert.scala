package typings.phonegapPluginPush.anon

import typings.phonegapPluginPush.PhonegapPluginPush.CategoryArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alert extends js.Object {
  /**
  			 * If true|"true" the device shows an alert on receipt of notification.
  			 * Default is false|"false".
  			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
  			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
  			 * This is normal iOS behaviour.
  			 */
  var alert: js.UndefOr[Boolean | String] = js.undefined
  /**
  			 * If true|"true" the device sets the badge number on receipt of notification.
  			 * Default is false|"false".
  			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
  			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
  			 * This is normal iOS behaviour.
  			 */
  var badge: js.UndefOr[Boolean | String] = js.undefined
  /**
  			 * The data required in order to enable Action Buttons for iOS.
  			 * Action Buttons on iOS - https://github.com/phonegap/phonegap-plugin-push/blob/master/docs/PAYLOAD.md#action-buttons-1
  			 */
  var categories: js.UndefOr[CategoryArray] = js.undefined
  /**
  			 * If true|"true" the badge will be cleared on app startup. Defaults to false|"false".
  			 */
  var clearBadge: js.UndefOr[Boolean | String] = js.undefined
  /**
  			 * Whether to use prod or sandbox GCM setting. Defaults to false.
  			 */
  var fcmSandbox: js.UndefOr[Boolean] = js.undefined
  /**
  			 * If true|"true" the device plays a sound on receipt of notification.
  			 * Default is false|"false".
  			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
  			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
  			 * This is normal iOS behaviour.
  			 */
  var sound: js.UndefOr[Boolean | String] = js.undefined
  /**
  			 * If the array contains one or more strings each string will be used to subscribe to a FcmPubSub topic. Defaults to [].
  			 */
  var topics: js.UndefOr[js.Array[String]] = js.undefined
  /**
  			 * If true|"true" the device will be set up to receive VoIP Push notifications and the other options will be ignored
  			 * since VoIP notifications are silent notifications that should be handled in the "notification" event.
  			 * Default is false|"false".
  			 */
  var voip: js.UndefOr[Boolean | String] = js.undefined
}

object Alert {
  @scala.inline
  def apply(
    alert: Boolean | String = null,
    badge: Boolean | String = null,
    categories: CategoryArray = null,
    clearBadge: Boolean | String = null,
    fcmSandbox: js.UndefOr[Boolean] = js.undefined,
    sound: Boolean | String = null,
    topics: js.Array[String] = null,
    voip: Boolean | String = null
  ): Alert = {
    val __obj = js.Dynamic.literal()
    if (alert != null) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (clearBadge != null) __obj.updateDynamic("clearBadge")(clearBadge.asInstanceOf[js.Any])
    if (!js.isUndefined(fcmSandbox)) __obj.updateDynamic("fcmSandbox")(fcmSandbox.get.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    if (voip != null) __obj.updateDynamic("voip")(voip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
}

