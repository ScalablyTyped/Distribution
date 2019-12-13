package typings.mongodb

import typings.mongodb.mongodbMod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameOnly extends js.Object {
  var nameOnly: js.UndefOr[Boolean] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object Anon_NameOnly {
  @scala.inline
  def apply(nameOnly: js.UndefOr[Boolean] = js.undefined, session: ClientSession = null): Anon_NameOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nameOnly)) __obj.updateDynamic("nameOnly")(nameOnly.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameOnly]
  }
}

