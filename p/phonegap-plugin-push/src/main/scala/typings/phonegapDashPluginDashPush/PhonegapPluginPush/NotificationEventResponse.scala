package typings.phonegapDashPluginDashPush.PhonegapPluginPush

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
  var count: String
  /**
  		 * The path of the image file to be displayed in the notification.
  		 */
  var image: String
  /**
  		 * The text of the push message sent from the 3rd party service.
  		 */
  var message: String
  /**
  		 * The name of the sound file to be played upon receipt of the notification.
  		 */
  var sound: String
  /**
  		 * The optional title of the push message sent from the 3rd party service.
  		 */
  var title: js.UndefOr[String] = js.undefined
}

object NotificationEventResponse {
  @scala.inline
  def apply(
    additionalData: NotificationEventAdditionalData,
    count: String,
    image: String,
    message: String,
    sound: String,
    title: String = null
  ): NotificationEventResponse = {
    val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventResponse]
  }
}

