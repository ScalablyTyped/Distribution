package typings.mongodbQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueMessage extends js.Object {
  var ack: String
  var id: String
  var payload: String
  var tries: Double
}

object QueueMessage {
  @scala.inline
  def apply(ack: String, id: String, payload: String, tries: Double): QueueMessage = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], tries = tries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueueMessage]
  }
}

