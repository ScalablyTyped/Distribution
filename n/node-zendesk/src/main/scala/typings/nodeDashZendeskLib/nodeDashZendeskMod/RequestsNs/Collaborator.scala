package typings
package nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collaborator extends js.Object {
  var email: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Collaborator {
  @scala.inline
  def apply(email: java.lang.String, name: java.lang.String = null): Collaborator = {
    val __obj = js.Dynamic.literal(email = email)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Collaborator]
  }
}

