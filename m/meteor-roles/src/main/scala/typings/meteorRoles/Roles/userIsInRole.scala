package typings.meteorRoles.Roles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Roles.userIsInRole")
@js.native
object userIsInRole extends js.Object {
  /**
    * Check if user has specified permissions/roles
    *
    * @example
    *     // non-group usage
    *     Roles.userIsInRole(user, 'admin')
    *     Roles.userIsInRole(user, ['admin','editor'])
    *     Roles.userIsInRole(userId, 'admin')
    *     Roles.userIsInRole(userId, ['admin','editor'])
    *
    *     // per-group usage
    *     Roles.userIsInRole(user,   ['admin','editor'], 'group1')
    *     Roles.userIsInRole(userId, ['admin','editor'], 'group1')
    *     Roles.userIsInRole(userId, ['admin','editor'], Roles.GLOBAL_GROUP)
    *
    *     // this format can also be used as short-hand for Roles.GLOBAL_GROUP
    *     Roles.userIsInRole(user, 'admin')
    *
    * @method userIsInRole
    * @param {String|Object} user User Id or actual user object
    * @param {String|Array} roles Name of role/permission or Array of
    *                            roles/permissions to check against.  If array,
    *                            will return true if user is in _any_ role.
    * @param {String} [group] Optional. Name of group.  If supplied, limits check
    *                         to just that group.
    *                         The user's Roles.GLOBAL_GROUP will always be checked
    *                         whether group is specified or not.
    * @return {Boolean} true if user is in _any_ of the target roles
    */
  def apply(user: String, roles: String): Boolean = js.native
  def apply(user: String, roles: String, group: String): Boolean = js.native
  def apply(user: String, roles: js.Array[String]): Boolean = js.native
  def apply(user: String, roles: js.Array[String], group: String): Boolean = js.native
  def apply(user: js.Array[js.Object | String], roles: String): Boolean = js.native
  def apply(user: js.Array[js.Object | String], roles: String, group: String): Boolean = js.native
  def apply(user: js.Array[js.Object | String], roles: js.Array[String]): Boolean = js.native
  def apply(user: js.Array[js.Object | String], roles: js.Array[String], group: String): Boolean = js.native
  def apply(user: js.Object, roles: String): Boolean = js.native
  def apply(user: js.Object, roles: String, group: String): Boolean = js.native
  def apply(user: js.Object, roles: js.Array[String]): Boolean = js.native
  def apply(user: js.Object, roles: js.Array[String], group: String): Boolean = js.native
}

