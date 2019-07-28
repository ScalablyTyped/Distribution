package typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Via extends js.Object {
  var channel: ViaChannel
  var source: ViaSource
}

object Via {
  @scala.inline
  def apply(channel: ViaChannel, source: ViaSource): Via = {
    val __obj = js.Dynamic.literal(channel = channel, source = source)
  
    __obj.asInstanceOf[Via]
  }
}

