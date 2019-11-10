package typings.mongodb

import typings.mongodb.mongodbMod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SessionClientSession extends js.Object {
  var session: ClientSession
}

object Anon_SessionClientSession {
  @scala.inline
  def apply(session: ClientSession): Anon_SessionClientSession = {
    val __obj = js.Dynamic.literal(session = session)
  
    __obj.asInstanceOf[Anon_SessionClientSession]
  }
}

