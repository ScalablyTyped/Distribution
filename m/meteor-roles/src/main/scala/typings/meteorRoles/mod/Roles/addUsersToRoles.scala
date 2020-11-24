package typings.meteorRoles.mod.Roles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/alanning:roles", "Roles.addUsersToRoles")
@js.native
object addUsersToRoles extends js.Object {
  
  /**
    * Add users to roles. Will create roles as needed.
    *
    * NOTE: Mixing grouped and non-grouped roles for the same user
    *       is not supported and will throw an error.
    *
    * Makes 2 calls to database:
    *  1. retrieve list of all existing roles
    *  2. update users' roles
    *
    * @example
    *     Roles.addUsersToRoles(userId, 'admin')
    *     Roles.addUsersToRoles(userId, ['view-secrets'], 'example.com')
    *     Roles.addUsersToRoles([user1, user2], ['user','editor'])
    *     Roles.addUsersToRoles([user1, user2], ['glorious-admin', 'perform-action'], 'example.org')
    *     Roles.addUsersToRoles(userId, 'admin', Roles.GLOBAL_GROUP)
    *
    * @method addUsersToRoles
    * @param {Array|String} users User id(s) or object(s) with an _id field
    * @param {Array|String} roles Name(s) of roles/permissions to add users to
    * @param {String} [group] Optional group name. If supplied, roles will be
    *                         specific to that group.
    *                         Group names can not start with '$' or numbers.
    *                         Periods in names '.' are automatically converted
    *                         to underscores.
    *                         The special group Roles.GLOBAL_GROUP provides
    *                         a convenient way to assign blanket roles/permissions
    *                         across all groups.  The roles/permissions in the
    *                         Roles.GLOBAL_GROUP group will be automatically
    *                         included in checks for any group.
    */
  def apply(user: String, roles: String): Unit = js.native
  def apply(user: String, roles: String, group: String): Unit = js.native
  def apply(user: String, roles: js.Array[String]): Unit = js.native
  def apply(user: String, roles: js.Array[String], group: String): Unit = js.native
  def apply(user: js.Array[js.Object | String], roles: String): Unit = js.native
  def apply(user: js.Array[js.Object | String], roles: String, group: String): Unit = js.native
  def apply(user: js.Array[js.Object | String], roles: js.Array[String]): Unit = js.native
  def apply(user: js.Array[js.Object | String], roles: js.Array[String], group: String): Unit = js.native
  def apply(user: js.Object, roles: String): Unit = js.native
  def apply(user: js.Object, roles: String, group: String): Unit = js.native
  def apply(user: js.Object, roles: js.Array[String]): Unit = js.native
  def apply(user: js.Object, roles: js.Array[String], group: String): Unit = js.native
}
