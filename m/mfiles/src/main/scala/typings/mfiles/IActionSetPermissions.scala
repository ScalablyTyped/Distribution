package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionSetPermissions extends js.Object {
  var DiscardsAutomaticPermissions: Boolean
  var Permissions: IAccessControlList
  def Clone(): IActionSetPermissions
}

object IActionSetPermissions {
  @scala.inline
  def apply(
    Clone: () => IActionSetPermissions,
    DiscardsAutomaticPermissions: Boolean,
    Permissions: IAccessControlList
  ): IActionSetPermissions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DiscardsAutomaticPermissions = DiscardsAutomaticPermissions.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSetPermissions]
  }
}

