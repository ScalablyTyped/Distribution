package typings.mongodb

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameOnly extends js.Object {
  var nameOnly: js.UndefOr[Boolean] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object AnonNameOnly {
  @scala.inline
  def apply(nameOnly: js.UndefOr[Boolean] = js.undefined, session: ClientSession = null): AnonNameOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nameOnly)) __obj.updateDynamic("nameOnly")(nameOnly.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameOnly]
  }
}

