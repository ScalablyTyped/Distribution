package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RolePermission extends js.Object {
  /** Actions */
  var resourceActions: js.UndefOr[js.Array[ResourceAction]] = js.undefined
}

object RolePermission {
  @scala.inline
  def apply(resourceActions: js.Array[ResourceAction] = null): RolePermission = {
    val __obj = js.Dynamic.literal()
    if (resourceActions != null) __obj.updateDynamic("resourceActions")(resourceActions)
    __obj.asInstanceOf[RolePermission]
  }
}

