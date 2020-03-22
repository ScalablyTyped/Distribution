package typings.mongodb

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSessionClientSession extends js.Object {
  var session: js.UndefOr[ClientSession] = js.undefined
}

object AnonSessionClientSession {
  @scala.inline
  def apply(session: ClientSession = null): AnonSessionClientSession = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSessionClientSession]
  }
}

