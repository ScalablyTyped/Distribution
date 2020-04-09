package typings.mobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActions extends js.Object {
  var actions: js.UndefOr[js.Array[AnonAuthenticationRequired]] = js.undefined
  var identifier: js.UndefOr[String] = js.undefined
}

object AnonActions {
  @scala.inline
  def apply(actions: js.Array[AnonAuthenticationRequired] = null, identifier: String = null): AnonActions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActions]
  }
}

