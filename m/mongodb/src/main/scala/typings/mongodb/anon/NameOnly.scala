package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameOnly extends js.Object {
  var nameOnly: js.UndefOr[Boolean] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object NameOnly {
  @scala.inline
  def apply(nameOnly: js.UndefOr[Boolean] = js.undefined, session: ClientSession = null): NameOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nameOnly)) __obj.updateDynamic("nameOnly")(nameOnly.get.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameOnly]
  }
}

