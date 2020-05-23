package typings.mobileMessagingCordova.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions extends js.Object {
  var actions: js.UndefOr[js.Array[AuthenticationRequired]] = js.undefined
  var identifier: js.UndefOr[String] = js.undefined
}

object Actions {
  @scala.inline
  def apply(actions: js.Array[AuthenticationRequired] = null, identifier: String = null): Actions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
}

