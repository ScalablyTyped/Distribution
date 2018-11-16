package typings
package phonegapDashPluginDashPushLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Topics extends js.Object {
  /**
  			 * If true|"true" the device shows an alert on receipt of notification.
  			 * Default is false|"false".
  			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
  			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
  			 * This is normal iOS behaviour.
  			 */
  var alert: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
  			 * If true|"true" the device sets the badge number on receipt of notification.
  			 * Default is false|"false".
  			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
  			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
  			 * This is normal iOS behaviour.
  			 */
  var badge: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
  			 * The data required in order to enable Action Buttons for iOS.
  			 * Action Buttons on iOS - https://github.com/phonegap/phonegap-plugin-push/blob/master/docs/PAYLOAD.md#action-buttons-1
  			 */
  var categories: js.UndefOr[phonegapDashPluginDashPushLib.PhonegapPluginPushNs.CategoryArray] = js.undefined
  /**
  			 * If true|"true" the badge will be cleared on app startup. Default is false|"false".
  			 */
  var clearBadge: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
  			 * Whether to use prod or sandbox GCM setting. Defaults to false.
  			 */
  var fcmSandbox: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * Maps to the project number in the Google Developer Console. Setting this uses GCM for notifications instead of native
  			 */
  var senderID: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * If true|"true" the device plays a sound on receipt of notification.
  			 * Default is false|"false".
  			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
  			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
  			 * This is normal iOS behaviour.
  			 */
  var sound: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
  			 * If the array contains one or more strings each string will be used to subscribe to a GcmPubSub topic. Note: only usable in conjunction with senderID
  			 */
  var topics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

