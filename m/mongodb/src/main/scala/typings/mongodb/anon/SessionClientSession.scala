package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionClientSession extends js.Object {
  var session: ClientSession = js.native
}

object SessionClientSession {
  @scala.inline
  def apply(session: ClientSession): SessionClientSession = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionClientSession]
  }
  @scala.inline
  implicit class SessionClientSessionOps[Self <: SessionClientSession] (val x: Self) extends AnyVal {
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
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
  }
  
}

