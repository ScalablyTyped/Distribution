package typings.mongodb

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var session: ClientSession
}

object Anon0 {
  @scala.inline
  def apply(session: ClientSession): Anon0 = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

