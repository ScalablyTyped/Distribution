package typings.phonegapDashPluginDashPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClearBadge extends js.Object {
  /**
  			 * If true the icon badge will be cleared on init and before push messages are processed. Default is false.
  			 */
  var clearBadge: js.UndefOr[Boolean] = js.undefined
  /**
  			 * If true the app clears all pending notifications when it is closed. Default is true.
  			 */
  var clearNotifications: js.UndefOr[Boolean] = js.undefined
  /**
  			 * If true will always show a notification, even when the app is on the foreground. Default is false.
  			 */
  var forceShow: js.UndefOr[Boolean] = js.undefined
  /**
  			 * The name of a drawable resource to use as the small-icon. The name should not include the extension.
  			 */
  var icon: js.UndefOr[String] = js.undefined
  /**
  			 * Sets the background color of the small icon on Android 5.0 and greater.
  			 * Supported Formats - http://developer.android.com/reference/android/graphics/Color.html#parseColor(java.lang.String)
  			 */
  var iconColor: js.UndefOr[String] = js.undefined
  /**
  			 * The key to search for text of notification. Default is 'message'.
  			 */
  var messageKey: js.UndefOr[String] = js.undefined
  /**
  			 * If true it plays the sound specified in the push data or the default system sound. Default is true.
  			 */
  var sound: js.UndefOr[Boolean] = js.undefined
  /**
  			 * The key to search for title of notification. Default is 'title'.
  			 */
  var titleKey: js.UndefOr[String] = js.undefined
  /**
  			 * If the array contains one or more strings each string will be used to subscribe to a GcmPubSub topic.
  			 */
  var topics: js.UndefOr[js.Array[String]] = js.undefined
  /**
  			 * If true the device vibrates on receipt of notification. Default is true.
  			 */
  var vibrate: js.UndefOr[Boolean] = js.undefined
}

object Anon_ClearBadge {
  @scala.inline
  def apply(
    clearBadge: js.UndefOr[Boolean] = js.undefined,
    clearNotifications: js.UndefOr[Boolean] = js.undefined,
    forceShow: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    iconColor: String = null,
    messageKey: String = null,
    sound: js.UndefOr[Boolean] = js.undefined,
    titleKey: String = null,
    topics: js.Array[String] = null,
    vibrate: js.UndefOr[Boolean] = js.undefined
  ): Anon_ClearBadge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearBadge)) __obj.updateDynamic("clearBadge")(clearBadge)
    if (!js.isUndefined(clearNotifications)) __obj.updateDynamic("clearNotifications")(clearNotifications)
    if (!js.isUndefined(forceShow)) __obj.updateDynamic("forceShow")(forceShow)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor)
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey)
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    if (titleKey != null) __obj.updateDynamic("titleKey")(titleKey)
    if (topics != null) __obj.updateDynamic("topics")(topics)
    if (!js.isUndefined(vibrate)) __obj.updateDynamic("vibrate")(vibrate)
    __obj.asInstanceOf[Anon_ClearBadge]
  }
}

