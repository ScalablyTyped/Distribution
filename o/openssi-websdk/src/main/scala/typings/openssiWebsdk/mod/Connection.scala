package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var id: String
  var local: js.UndefOr[ConnectionAgent] = js.undefined
  var properties: Properties
  var remote: js.UndefOr[ConnectionAgent] = js.undefined
  var role: String
  var state: ConnectionState
}

object Connection {
  @scala.inline
  def apply(
    id: String,
    properties: Properties,
    role: String,
    state: ConnectionState,
    local: ConnectionAgent = null,
    remote: ConnectionAgent = null
  ): Connection = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

