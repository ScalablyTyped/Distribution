package typings
package phonegapDashPluginDashPushLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_TopicsIcon extends js.Object {
  /**
  			 * If true the app clears all pending notifications when it is closed. Default is true.
  			 */
  var clearNotifications: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * If true will always show a notification, even when the app is on the foreground. Default is false.
  			 */
  var forceShow: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * The name of a drawable resource to use as the small-icon. The name should not include the extension.
  			 */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * Sets the background color of the small icon on Android 5.0 and greater.
  			 * Supported Formats - http://developer.android.com/reference/android/graphics/Color.html#parseColor(java.lang.String)
  			 */
  var iconColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * Maps to the project number in the Google Developer Console.
  			 */
  var senderID: java.lang.String
  /**
  			 * If true it plays the sound specified in the push data or the default system sound. Default is true.
  			 */
  var sound: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * If the array contains one or more strings each string will be used to subscribe to a GcmPubSub topic.
  			 */
  var topics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  			 * If true the device vibrates on receipt of notification. Default is true.
  			 */
  var vibrate: js.UndefOr[scala.Boolean] = js.undefined
}

