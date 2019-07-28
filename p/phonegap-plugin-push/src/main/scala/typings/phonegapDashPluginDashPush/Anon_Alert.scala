package typings.phonegapDashPluginDashPush

import typings.phonegapDashPluginDashPush.PhonegapPluginPushNs.CategoryArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alert extends js.Object {
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
  			 * If true|"true" the badge will be cleared on app startup. Default is false|"false".
  			 */
  var clearBadge: js.UndefOr[Boolean | String] = js.undefined
  /**
  			 * Whether to use prod or sandbox GCM setting. Defaults to false.
  			 */
  var fcmSandbox: js.UndefOr[Boolean] = js.undefined
  /**
  			 * Maps to the project number in the Google Developer Console. Setting this uses GCM for notifications instead of native
  			 */
  var senderID: js.UndefOr[String] = js.undefined
  /**
  			 * If true|"true" the device plays a sound on receipt of notification.
  			 * Default is false|"false".
  			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
  			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
  			 * This is normal iOS behaviour.
  			 */
  var sound: js.UndefOr[Boolean | String] = js.undefined
  /**
  			 * If the array contains one or more strings each string will be used to subscribe to a GcmPubSub topic. Note: only usable in conjunction with senderID
  			 */
  var topics: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Alert {
  @scala.inline
  def apply(
    alert: Boolean | String = null,
    badge: Boolean | String = null,
    categories: CategoryArray = null,
    clearBadge: Boolean | String = null,
    fcmSandbox: js.UndefOr[Boolean] = js.undefined,
    senderID: String = null,
    sound: Boolean | String = null,
    topics: js.Array[String] = null
  ): Anon_Alert = {
    val __obj = js.Dynamic.literal()
    if (alert != null) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (clearBadge != null) __obj.updateDynamic("clearBadge")(clearBadge.asInstanceOf[js.Any])
    if (!js.isUndefined(fcmSandbox)) __obj.updateDynamic("fcmSandbox")(fcmSandbox)
    if (senderID != null) __obj.updateDynamic("senderID")(senderID)
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[Anon_Alert]
  }
}

