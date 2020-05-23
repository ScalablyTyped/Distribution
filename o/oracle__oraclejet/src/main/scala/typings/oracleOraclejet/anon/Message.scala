package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message
  extends /* key */ StringDictionary[js.Any] {
  var message: typings.oracleOraclejet.ojmessageMod.ojMessage.Message
}

object Message {
  @scala.inline
  def apply(
    message: typings.oracleOraclejet.ojmessageMod.ojMessage.Message,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Message]
  }
}

