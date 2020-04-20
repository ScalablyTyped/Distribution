package typings.nodeZendesk.mod.Tickets

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
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Via]
  }
}

