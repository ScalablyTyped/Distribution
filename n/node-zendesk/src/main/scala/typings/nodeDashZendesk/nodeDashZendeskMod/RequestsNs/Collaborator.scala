package typings.nodeDashZendesk.nodeDashZendeskMod.RequestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collaborator extends js.Object {
  var email: String
  var name: js.UndefOr[String] = js.undefined
}

object Collaborator {
  @scala.inline
  def apply(email: String, name: String = null): Collaborator = {
    val __obj = js.Dynamic.literal(email = email)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Collaborator]
  }
}

