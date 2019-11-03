package typings.postmark.distClientModelsMessagesOutboundMessageClickMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundMessageClicks extends js.Object {
  var Clicks: js.Array[ClickEvent]
  var TotalCount: Double
}

object OutboundMessageClicks {
  @scala.inline
  def apply(Clicks: js.Array[ClickEvent], TotalCount: Double): OutboundMessageClicks = {
    val __obj = js.Dynamic.literal(Clicks = Clicks, TotalCount = TotalCount)
  
    __obj.asInstanceOf[OutboundMessageClicks]
  }
}

