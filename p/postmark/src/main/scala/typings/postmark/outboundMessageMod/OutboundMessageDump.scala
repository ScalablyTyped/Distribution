package typings.postmark.outboundMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundMessageDump extends js.Object {
  var Body: String
}

object OutboundMessageDump {
  @scala.inline
  def apply(Body: String): OutboundMessageDump = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutboundMessageDump]
  }
}

