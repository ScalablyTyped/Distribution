package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionSetPermissions extends js.Object {
  var DiscardsAutomaticPermissions: scala.Boolean
  var Permissions: IAccessControlList
  def Clone(): IActionSetPermissions
}

object IActionSetPermissions {
  @scala.inline
  def apply(
    Clone: js.Function0[IActionSetPermissions],
    DiscardsAutomaticPermissions: scala.Boolean,
    Permissions: IAccessControlList
  ): IActionSetPermissions = {
    val __obj = js.Dynamic.literal(Clone = Clone, DiscardsAutomaticPermissions = DiscardsAutomaticPermissions, Permissions = Permissions)
  
    __obj.asInstanceOf[IActionSetPermissions]
  }
}

