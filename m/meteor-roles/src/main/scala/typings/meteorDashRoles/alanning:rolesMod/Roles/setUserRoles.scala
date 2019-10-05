package typings.meteorDashRoles.`alanning:rolesMod`.Roles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/alanning:roles", "Roles.setUserRoles")
@js.native
object setUserRoles extends js.Object {
  /**
    * Set a users roles/permissions.
    *
    * @example
    *     Roles.setUserRoles(userId, 'admin')
    *     Roles.setUserRoles(userId, ['view-secrets'], 'example.com')
    *     Roles.setUserRoles([user1, user2], ['user','editor'])
    *     Roles.setUserRoles([user1, user2], ['glorious-admin', 'perform-action'], 'example.org')
    *     Roles.setUserRoles(userId, 'admin', Roles.GLOBAL_GROUP)
    *
    * @method setUserRoles
    * @param {Array|String} users User id(s) or object(s) with an _id field
    * @param {Array|String} roles Name(s) of roles/permissions to add users to
    * @param {String} [group] Optional group name. If supplied, roles will be
    *                         specific to that group.
    *                         Group names can not start with '$'.
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

