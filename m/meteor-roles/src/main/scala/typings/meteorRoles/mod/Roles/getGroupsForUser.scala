package typings.meteorRoles.mod.Roles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/alanning:roles", "Roles.getGroupsForUser")
@js.native
object getGroupsForUser extends js.Object {
  /**
    * Retrieve users groups, if any
    *
    * @method getGroupsForUser
    * @param {String|Object} user User Id or actual user object
    * @param {String} [role] Optional name of roles to restrict groups to.
    *
    * @return {Array} Array of user's groups, unsorted. Roles.GLOBAL_GROUP will be omitted
    */
  def apply(user: String): js.Array[String] = js.native
  def apply(user: String, role: String): js.Array[String] = js.native
  def apply(user: js.Object): js.Array[String] = js.native
  def apply(user: js.Object, role: String): js.Array[String] = js.native
}

