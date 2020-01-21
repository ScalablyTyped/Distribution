package typings.mongodb

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSessionClientSession extends js.Object {
  var session: ClientSession
}

object AnonSessionClientSession {
  @scala.inline
  def apply(session: ClientSession): AnonSessionClientSession = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSessionClientSession]
  }
}

