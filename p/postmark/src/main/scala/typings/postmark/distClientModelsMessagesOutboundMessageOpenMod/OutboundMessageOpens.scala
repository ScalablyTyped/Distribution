package typings.postmark.distClientModelsMessagesOutboundMessageOpenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundMessageOpens extends js.Object {
  var Opens: js.Array[OpenEvent]
  var TotalCount: Double
}

object OutboundMessageOpens {
  @scala.inline
  def apply(Opens: js.Array[OpenEvent], TotalCount: Double): OutboundMessageOpens = {
    val __obj = js.Dynamic.literal(Opens = Opens.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutboundMessageOpens]
  }
}

