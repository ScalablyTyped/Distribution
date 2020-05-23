package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var session: ClientSession
}

object `1` {
  @scala.inline
  def apply(session: ClientSession): `1` = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

