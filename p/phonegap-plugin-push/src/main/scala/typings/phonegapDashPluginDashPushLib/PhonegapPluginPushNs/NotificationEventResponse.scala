package typings
package phonegapDashPluginDashPushLib.PhonegapPluginPushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventResponse extends _EventResponse {
  /**
  		 * An optional collection of data sent by the 3rd party push service that does not fit in the above properties.
  		 */
  var additionalData: NotificationEventAdditionalData
  /**
  		 * The number of messages to be displayed in the badge iOS or message count in the notification shade in Android.
  		 * For windows, it represents the value in the badge notification which could be a number or a status glyph.
  		 */
  var count: java.lang.String
  /**
  		 * The path of the image file to be displayed in the notification.
  		 */
  var image: java.lang.String
  /**
  		 * The text of the push message sent from the 3rd party service.
  		 */
  var message: java.lang.String
  /**
  		 * The name of the sound file to be played upon receipt of the notification.
  		 */
  var sound: java.lang.String
  /**
  		 * The optional title of the push message sent from the 3rd party service.
  		 */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object NotificationEventResponse {
  @scala.inline
  def apply(
    additionalData: NotificationEventAdditionalData,
    count: java.lang.String,
    image: java.lang.String,
    message: java.lang.String,
    sound: java.lang.String,
    title: java.lang.String = null
  ): NotificationEventResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("additionalData")(additionalData)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("sound")(sound)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[NotificationEventResponse]
  }
}

