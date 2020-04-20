package typings.nextgenEvents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAck extends js.Object {
  var ack: Boolean
  var emit: Boolean
  var listen: Boolean
}

object AnonAck {
  @scala.inline
  def apply(ack: Boolean, emit: Boolean, listen: Boolean): AnonAck = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAck]
  }
}

