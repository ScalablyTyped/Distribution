package typings.phonegapPluginPush.PhonegapPluginPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationEventResponse extends _EventResponse {
  /**
  		 * An optional collection of data sent by the 3rd party push service that does not fit in the above properties.
  		 */
  var additionalData: NotificationEventAdditionalData = js.native
  /**
  		 * The number of messages to be displayed in the badge iOS or message count in the notification shade in Android.
  		 * For windows, it represents the value in the badge notification which could be a number or a status glyph.
  		 */
  var count: String = js.native
  /**
  		 * The path of the image file to be displayed in the notification.
  		 */
  var image: String = js.native
  /**
  		 * The text of the push message sent from the 3rd party service.
  		 */
  var message: String = js.native
  /**
  		 * The name of the sound file to be played upon receipt of the notification.
  		 */
  var sound: String = js.native
  /**
  		 * The optional title of the push message sent from the 3rd party service.
  		 */
  var title: js.UndefOr[String] = js.native
}

object NotificationEventResponse {
  @scala.inline
  def apply(
    additionalData: NotificationEventAdditionalData,
    count: String,
    image: String,
    message: String,
    sound: String
  ): NotificationEventResponse = {
    val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventResponse]
  }
  @scala.inline
  implicit class NotificationEventResponseOps[Self <: NotificationEventResponse] (val x: Self) extends AnyVal {
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
    def setAdditionalData(value: NotificationEventAdditionalData): Self = this.set("additionalData", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

