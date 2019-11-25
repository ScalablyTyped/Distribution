package typings.nextgenDashEvents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ack extends js.Object {
  var ack: Boolean
  var emit: Boolean
  var listen: Boolean
}

object Anon_Ack {
  @scala.inline
  def apply(ack: Boolean, emit: Boolean, listen: Boolean): Anon_Ack = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Ack]
  }
}

