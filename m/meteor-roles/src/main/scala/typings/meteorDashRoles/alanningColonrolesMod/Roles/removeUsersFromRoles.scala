package typings.meteorDashRoles.alanningColonrolesMod.Roles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/alanning:roles", "Roles.removeUsersFromRoles")
@js.native
object removeUsersFromRoles extends js.Object {
  /**
    * Remove users from roles
    *
    * @example
    *     Roles.removeUsersFromRoles(users.bob, 'admin')
    *     Roles.removeUsersFromRoles([users.bob, users.joe], ['editor'])
    *     Roles.removeUsersFromRoles([users.bob, users.joe], ['editor', 'user'])
    *     Roles.removeUsersFromRoles(users.eve, ['user'], 'group1')
    *
    * @method removeUsersFromRoles
    * @param {Array|String} users User id(s) or object(s) with an _id field
    * @param {Array|String} roles Name(s) of roles to add users to
    * @param {String} [group] Optional. Group name. If supplied, only that
    *                         group will have roles removed.
    */
  def apply(user: String): Unit = js.native
  def apply(user: String, roles: js.Array[String]): Unit = js.native
  def apply(user: String, roles: js.Array[String], group: String): Unit = js.native
  def apply(user: js.Array[js.Object | String]): Unit = js.native
  def apply(user: js.Array[js.Object | String], roles: js.Array[String]): Unit = js.native
  def apply(user: js.Array[js.Object | String], roles: js.Array[String], group: String): Unit = js.native
  def apply(user: js.Object): Unit = js.native
  def apply(user: js.Object, roles: js.Array[String]): Unit = js.native
  def apply(user: js.Object, roles: js.Array[String], group: String): Unit = js.native
}

