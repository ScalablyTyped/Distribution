package typings.openfin.contextChannelsMod

import typings.openfin.openfinStrings.app
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppChannelTransport extends ChannelTransport {
  var name: String
  @JSName("type")
  var type_AppChannelTransport: app
}

object AppChannelTransport {
  @scala.inline
  def apply(id: ChannelId, name: String, `type`: app): AppChannelTransport = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppChannelTransport]
  }
}

