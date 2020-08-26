package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var id: String = js.native
  var local: js.UndefOr[ConnectionAgent] = js.native
  var properties: Properties = js.native
  var remote: js.UndefOr[ConnectionAgent] = js.native
  var role: String = js.native
  var state: ConnectionState = js.native
}

object Connection {
  @scala.inline
  def apply(id: String, properties: Properties, role: String, state: ConnectionState): Connection = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: Properties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: ConnectionState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocal(value: ConnectionAgent): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    @scala.inline
    def setRemote(value: ConnectionAgent): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
  }
  
}

