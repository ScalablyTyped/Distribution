package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.ojmessageMod.ojMessage.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message
  extends /* propName */ StringDictionary[js.Any] {
  var message: Message
}

object Anon_Message {
  @scala.inline
  def apply(message: Message, StringDictionary: /* propName */ StringDictionary[js.Any] = null): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Message]
  }
}

