package typings.plugapi.plugapiMod.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatDelete extends js.Object {
  var chatID: String
  var mi: Double
}

object ChatDelete {
  @scala.inline
  def apply(chatID: String, mi: Double): ChatDelete = {
    val __obj = js.Dynamic.literal(chatID = chatID, mi = mi)
  
    __obj.asInstanceOf[ChatDelete]
  }
}

