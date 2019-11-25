package typings.oja.ojaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var pending: js.Array[String]
  var queue: js.Array[String]
}

object State {
  @scala.inline
  def apply(pending: js.Array[String], queue: js.Array[String]): State = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

