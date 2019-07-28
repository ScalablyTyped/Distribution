package typings.nodeDashWit.nodeDashWitMod

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
    val __obj = js.Dynamic.literal(_text = _text, entities = entities, msg_id = msg_id)
  
    __obj.asInstanceOf[MessageResponse]
  }
}

