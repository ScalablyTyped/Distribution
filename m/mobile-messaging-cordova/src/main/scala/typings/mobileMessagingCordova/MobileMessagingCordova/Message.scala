package typings.mobileMessagingCordova.MobileMessagingCordova

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var category: js.UndefOr[String] = js.undefined
  var customPayload: js.UndefOr[Record[String, String]] = js.undefined
  var internalData: js.UndefOr[String] = js.undefined
  var messageId: String
  var silent: js.UndefOr[String] = js.undefined
  var sound: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var vibrate: js.UndefOr[String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    messageId: String,
    body: String = null,
    category: String = null,
    customPayload: Record[String, String] = null,
    internalData: String = null,
    silent: String = null,
    sound: String = null,
    title: String = null,
    vibrate: String = null
  ): Message = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (customPayload != null) __obj.updateDynamic("customPayload")(customPayload.asInstanceOf[js.Any])
    if (internalData != null) __obj.updateDynamic("internalData")(internalData.asInstanceOf[js.Any])
    if (silent != null) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (vibrate != null) __obj.updateDynamic("vibrate")(vibrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

