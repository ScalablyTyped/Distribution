package typings
package nodeDashWitLib.nodeDashWitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageResponse extends js.Object {
  var _text: java.lang.String
  var entities: js.Any
  var msg_id: java.lang.String
}

object MessageResponse {
  @scala.inline
  def apply(_text: java.lang.String, entities: js.Any, msg_id: java.lang.String): MessageResponse = {
    val __obj = js.Dynamic.literal(_text = _text, entities = entities, msg_id = msg_id)
  
    __obj.asInstanceOf[MessageResponse]
  }
}

