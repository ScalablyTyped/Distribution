package typings.mongodb

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFullSession extends js.Object {
  var full: Boolean
  var session: ClientSession
}

object AnonFullSession {
  @scala.inline
  def apply(full: Boolean, session: ClientSession): AnonFullSession = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFullSession]
  }
}

