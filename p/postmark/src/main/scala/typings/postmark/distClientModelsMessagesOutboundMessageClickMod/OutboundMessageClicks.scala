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
    val __obj = js.Dynamic.literal(Clicks = Clicks.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutboundMessageClicks]
  }
}

