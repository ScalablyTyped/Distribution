package typings.openfin.contextChannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelTransport extends js.Object {
  var id: ChannelId
  var `type`: String
}

object ChannelTransport {
  @scala.inline
  def apply(id: ChannelId, `type`: String): ChannelTransport = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelTransport]
  }
}

