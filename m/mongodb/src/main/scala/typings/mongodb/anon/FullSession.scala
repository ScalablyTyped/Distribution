package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullSession extends js.Object {
  var full: Boolean
  var session: ClientSession
}

object FullSession {
  @scala.inline
  def apply(full: Boolean, session: ClientSession): FullSession = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullSession]
  }
}

