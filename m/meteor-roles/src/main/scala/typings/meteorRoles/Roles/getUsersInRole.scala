package typings.meteorRoles.Roles

import typings.meteor.Meteor.User_
import typings.meteor.Mongo.Cursor
import typings.meteorRoles.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Roles.getUsersInRole")
@js.native
object getUsersInRole extends js.Object {
  /**
    * Retrieve all users who are in target role.
    *
    * NOTE: This is an expensive query; it performs a full collection scan
    * on the users collection since there is no index set on the 'roles' field.
    * This is by design as most queries will specify an _id so the _id index is
    * used automatically.
    *
    * @method getUsersInRole
    * @param {Array|String} role Name of role/permission.  If array, users
    *                            returned will have at least one of the roles
    *                            specified but need not have _all_ roles.
    * @param {String} [group] Optional name of group to restrict roles to.
    *                         User's Roles.GLOBAL_GROUP will also be checked.
    * @param {Object} [options] Optional options which are passed directly
    *                           through to `Meteor.users.find(query, options)`
    * @return {Cursor} cursor of users in role
    */
  def apply(role: String): Cursor[User_] = js.native
  def apply(role: String, group: String): Cursor[User_] = js.native
  def apply(role: String, group: String, options: AnonFields): Cursor[User_] = js.native
  def apply(role: js.Array[String]): Cursor[User_] = js.native
  def apply(role: js.Array[String], group: String): Cursor[User_] = js.native
  def apply(role: js.Array[String], group: String, options: AnonFields): Cursor[User_] = js.native
}

