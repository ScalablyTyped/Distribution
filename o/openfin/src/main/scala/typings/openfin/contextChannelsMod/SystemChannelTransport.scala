package typings.openfin.contextChannelsMod

import typings.openfin.openfinStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemChannelTransport extends ChannelTransport {
  @JSName("type")
  var type_SystemChannelTransport: system
  var visualIdentity: DisplayMetadata
}

object SystemChannelTransport {
  @scala.inline
  def apply(id: ChannelId, `type`: system, visualIdentity: DisplayMetadata): SystemChannelTransport = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], visualIdentity = visualIdentity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemChannelTransport]
  }
}

