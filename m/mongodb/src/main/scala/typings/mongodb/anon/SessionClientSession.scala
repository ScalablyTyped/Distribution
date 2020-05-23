package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionClientSession extends js.Object {
  var session: js.UndefOr[ClientSession] = js.undefined
}

object SessionClientSession {
  @scala.inline
  def apply(session: ClientSession = null): SessionClientSession = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionClientSession]
  }
}

