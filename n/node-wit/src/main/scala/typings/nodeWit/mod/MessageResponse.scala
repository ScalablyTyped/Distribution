package typings.nodeWit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageResponse extends js.Object {
  var _text: String
  var entities: js.Any
  var msg_id: String
}

object MessageResponse {
  @scala.inline
  def apply(_text: String, entities: js.Any, msg_id: String): MessageResponse = {
    val __obj = js.Dynamic.literal(_text = _text.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], msg_id = msg_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageResponse]
  }
}

