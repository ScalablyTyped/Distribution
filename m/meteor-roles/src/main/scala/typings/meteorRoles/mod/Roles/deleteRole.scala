package typings.meteorRoles.mod.Roles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/alanning:roles", "Roles.deleteRole")
@js.native
object deleteRole extends js.Object {
  /**
    * Delete an existing role.  Will throw "Role in use" error if any users
    * are currently assigned to the target role.
    *
    * @method deleteRole
    * @param {String} role Name of role
    */
  def apply(role: String): Unit = js.native
}

