package typings.nextgenEvents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ack extends js.Object {
  var ack: Boolean
  var emit: Boolean
  var listen: Boolean
}

object Ack {
  @scala.inline
  def apply(ack: Boolean, emit: Boolean, listen: Boolean): Ack = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ack]
  }
}

