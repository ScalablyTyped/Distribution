package typings.mongodb

import typings.mongodb.mongodbMod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FullSession extends js.Object {
  var full: Boolean
  var session: ClientSession
}

object Anon_FullSession {
  @scala.inline
  def apply(full: Boolean, session: ClientSession): Anon_FullSession = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FullSession]
  }
}

