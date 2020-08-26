package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Receivedeventsurl extends js.Object {
  var avatar_url: String = js.native
  var gravatar_id: String = js.native
  var id: Double = js.native
  var login: String = js.native
  var node_id: String = js.native
  var received_events_url: String = js.native
  var `type`: String = js.native
  var url: String = js.native
}

object Receivedeventsurl {
  @scala.inline
  def apply(
    avatar_url: String,
    gravatar_id: String,
    id: Double,
    login: String,
    node_id: String,
    received_events_url: String,
    `type`: String,
    url: String
  ): Receivedeventsurl = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Receivedeventsurl]
  }
  @scala.inline
  implicit class ReceivedeventsurlOps[Self <: Receivedeventsurl] (val x: Self) extends AnyVal {
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
    def setAvatar_url(value: String): Self = this.set("avatar_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setGravatar_id(value: String): Self = this.set("gravatar_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceived_events_url(value: String): Self = this.set("received_events_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

