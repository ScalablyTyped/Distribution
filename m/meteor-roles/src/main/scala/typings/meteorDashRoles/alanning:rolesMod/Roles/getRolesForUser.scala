package typings.meteorDashRoles.`alanning:rolesMod`.Roles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/alanning:roles", "Roles.getRolesForUser")
@js.native
object getRolesForUser extends js.Object {
  /**
    * Retrieve users roles
    *
    * @method getRolesForUser
    * @param {String|Object} user User Id or actual user object
    * @param {String} [group] Optional name of group to restrict roles to.
    *                         User's Roles.GLOBAL_GROUP will also be included.
    * @return {Array} Array of user's roles, unsorted.
    */
  def apply(user: String): js.Array[String] = js.native
  def apply(user: String, group: String): js.Array[String] = js.native
  def apply(user: js.Object): js.Array[String] = js.native
  def apply(user: js.Object, group: String): js.Array[String] = js.native
}

