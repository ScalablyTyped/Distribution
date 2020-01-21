package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojmessageMod.ojMessage.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage
  extends /* propName */ StringDictionary[js.Any] {
  var message: Message
}

object AnonMessage {
  @scala.inline
  def apply(message: Message, StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonMessage]
  }
}

