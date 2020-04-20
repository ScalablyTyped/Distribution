package typings.pgProtocol.serializerMod

import typings.pgProtocol.pgProtocolStrings.P
import typings.pgProtocol.pgProtocolStrings.S
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalOpts extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var `type`: S | P
}

object PortalOpts {
  @scala.inline
  def apply(`type`: S | P, name: String = null): PortalOpts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalOpts]
  }
}

