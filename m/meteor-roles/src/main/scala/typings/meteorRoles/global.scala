package typings.meteorRoles

import typings.meteor.Meteor.User
import typings.meteor.Mongo.Collection
import typings.meteor.Mongo.Cursor
import typings.meteor.Subscription
import typings.meteorRoles.Roles.Role
import typings.meteorRoles.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // module
  object Meteor {
    
    @JSGlobal("Meteor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Meteor.roles")
    @js.native
    def roles: Collection[Role, Role] = js.native
    @scala.inline
    def roles_=(x: Collection[Role, Role]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roles")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Provides functions related to user authorization. Compatible with built-in Meteor accounts packages.
    *
    * @module Roles
    */
  object Roles {
    
    @JSGlobal("Roles")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constant used to reference the special 'global' group that
      * can be used to apply blanket permissions across all groups.
      *
      * @example
      *     Roles.addUsersToRoles(user, 'admin', Roles.GLOBAL_GROUP)
      *     Roles.userIsInRole(user, 'admin') // => true
      *
      *     Roles.setUserRoles(user, 'support-staff', Roles.GLOBAL_GROUP)
      *     Roles.userIsInRole(user, 'support-staff') // => true
      *     Roles.userIsInRole(user, 'admin') // => false
      *
      * @property GLOBAL_GROUP
      * @type String
      * @static
      * @final
      */
    @JSGlobal("Roles.GLOBAL_GROUP")
    @js.native
    def GLOBAL_GROUP: String = js.native
    @scala.inline
    def GLOBAL_GROUP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GLOBAL_GROUP")(x.asInstanceOf[js.Any])
    
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
    @JSGlobal("Roles.addUsersToRoles")
    @js.native
    def addUsersToRoles(user: String, roles: String): Unit = js.native
    @JSGlobal("Roles.addUsersToRoles")
    @js.native
    def addUsersToRoles(user: String, roles: String, group: String): Unit = js.native
    @JSGlobal("Roles.addUsersToRoles")
    @js.native
    def addUsersToRoles(user: String, roles: js.Array[String]): Unit = js.native
    @JSGlobal("Roles.addUsersToRoles")
    @js.native
    def addUsersToRoles(user: String, roles: js.Array[String], group: String): Unit = js.native
    @JSGlobal("Roles.addUsersToRoles")
    @js.native
    def addUsersToRoles(user: js.Array[js.Object | String], roles: String): Unit = js.native
    @JSGlobal("Roles.addUsersToRoles")
    @js.native
    def addUsersToRoles(user: js.Array[js.Object | String], roles: String, group: String): Unit = js.native
    @JSGlobal("Roles.addUsersToRoles")
    @js.native
    def addUsersToRoles(user: js.Array[js.Object | String], roles: js.Array[String]): Unit = js.native
    @JSGlobal("Roles.addUsersToRoles")
    @js.native
    def addUsersToRoles(user: js.Array[js.Object | String], roles: js.Array[String], group: String): Unit = js.native
    @JSGlobal("Roles.addUsersToRoles")
    @js.native
    def addUsersToRoles(user: js.Object, roles: String): Unit = js.native
    @JSGlobal("Roles.addUsersToRoles")
    @js.native
    def addUsersToRoles(user: js.Object, roles: String, group: String): Unit = js.native
    @JSGlobal("Roles.addUsersToRoles")
    @js.native
    def addUsersToRoles(user: js.Object, roles: js.Array[String]): Unit = js.native
    @JSGlobal("Roles.addUsersToRoles")
    @js.native
    def addUsersToRoles(user: js.Object, roles: js.Array[String], group: String): Unit = js.native
    
    /**
      * Create a new role. Whitespace will be trimmed.
      *
      * @method createRole
      * @param {String} role Name of role
      * @return {String} id of new role
      */
    @JSGlobal("Roles.createRole")
    @js.native
    def createRole(role: String): String = js.native
    
    /**
      * Delete an existing role.  Will throw "Role in use" error if any users
      * are currently assigned to the target role.
      *
      * @method deleteRole
      * @param {String} role Name of role
      */
    @JSGlobal("Roles.deleteRole")
    @js.native
    def deleteRole(role: String): Unit = js.native
    
    /**
      * Retrieve set of all existing roles
      *
      * @method getAllRoles
      * @return {Cursor} cursor of existing roles
      */
    @JSGlobal("Roles.getAllRoles")
    @js.native
    def getAllRoles(): Cursor[Role, Role] = js.native
    
    /**
      * Retrieve users groups, if any
      *
      * @method getGroupsForUser
      * @param {String|Object} user User Id or actual user object
      * @param {String} [role] Optional name of roles to restrict groups to.
      *
      * @return {Array} Array of user's groups, unsorted. Roles.GLOBAL_GROUP will be omitted
      */
    @JSGlobal("Roles.getGroupsForUser")
    @js.native
    def getGroupsForUser(user: String): js.Array[String] = js.native
    @JSGlobal("Roles.getGroupsForUser")
    @js.native
    def getGroupsForUser(user: String, role: String): js.Array[String] = js.native
    @JSGlobal("Roles.getGroupsForUser")
    @js.native
    def getGroupsForUser(user: js.Object): js.Array[String] = js.native
    @JSGlobal("Roles.getGroupsForUser")
    @js.native
    def getGroupsForUser(user: js.Object, role: String): js.Array[String] = js.native
    
    /**
      * Retrieve users roles
      *
      * @method getRolesForUser
      * @param {String|Object} user User Id or actual user object
      * @param {String} [group] Optional name of group to restrict roles to.
      *                         User's Roles.GLOBAL_GROUP will also be included.
      * @return {Array} Array of user's roles, unsorted.
      */
    @JSGlobal("Roles.getRolesForUser")
    @js.native
    def getRolesForUser(user: String): js.Array[String] = js.native
    @JSGlobal("Roles.getRolesForUser")
    @js.native
    def getRolesForUser(user: String, group: String): js.Array[String] = js.native
    @JSGlobal("Roles.getRolesForUser")
    @js.native
    def getRolesForUser(user: js.Object): js.Array[String] = js.native
    @JSGlobal("Roles.getRolesForUser")
    @js.native
    def getRolesForUser(user: js.Object, group: String): js.Array[String] = js.native
    
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
    @JSGlobal("Roles.getUsersInRole")
    @js.native
    def getUsersInRole(role: String): Cursor[User, User] = js.native
    @JSGlobal("Roles.getUsersInRole")
    @js.native
    def getUsersInRole(role: String, group: js.UndefOr[scala.Nothing], options: Fields): Cursor[User, User] = js.native
    @JSGlobal("Roles.getUsersInRole")
    @js.native
    def getUsersInRole(role: String, group: String): Cursor[User, User] = js.native
    @JSGlobal("Roles.getUsersInRole")
    @js.native
    def getUsersInRole(role: String, group: String, options: Fields): Cursor[User, User] = js.native
    @JSGlobal("Roles.getUsersInRole")
    @js.native
    def getUsersInRole(role: js.Array[String]): Cursor[User, User] = js.native
    @JSGlobal("Roles.getUsersInRole")
    @js.native
    def getUsersInRole(role: js.Array[String], group: js.UndefOr[scala.Nothing], options: Fields): Cursor[User, User] = js.native
    @JSGlobal("Roles.getUsersInRole")
    @js.native
    def getUsersInRole(role: js.Array[String], group: String): Cursor[User, User] = js.native
    @JSGlobal("Roles.getUsersInRole")
    @js.native
    def getUsersInRole(role: js.Array[String], group: String, options: Fields): Cursor[User, User] = js.native
    
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
    @JSGlobal("Roles.removeUsersFromRoles")
    @js.native
    def removeUsersFromRoles(user: String): Unit = js.native
    @JSGlobal("Roles.removeUsersFromRoles")
    @js.native
    def removeUsersFromRoles(user: String, roles: js.UndefOr[scala.Nothing], group: String): Unit = js.native
    @JSGlobal("Roles.removeUsersFromRoles")
    @js.native
    def removeUsersFromRoles(user: String, roles: js.Array[String]): Unit = js.native
    @JSGlobal("Roles.removeUsersFromRoles")
    @js.native
    def removeUsersFromRoles(user: String, roles: js.Array[String], group: String): Unit = js.native
    @JSGlobal("Roles.removeUsersFromRoles")
    @js.native
    def removeUsersFromRoles(user: js.Array[js.Object | String]): Unit = js.native
    @JSGlobal("Roles.removeUsersFromRoles")
    @js.native
    def removeUsersFromRoles(user: js.Array[js.Object | String], roles: js.UndefOr[scala.Nothing], group: String): Unit = js.native
    @JSGlobal("Roles.removeUsersFromRoles")
    @js.native
    def removeUsersFromRoles(user: js.Array[js.Object | String], roles: js.Array[String]): Unit = js.native
    @JSGlobal("Roles.removeUsersFromRoles")
    @js.native
    def removeUsersFromRoles(user: js.Array[js.Object | String], roles: js.Array[String], group: String): Unit = js.native
    @JSGlobal("Roles.removeUsersFromRoles")
    @js.native
    def removeUsersFromRoles(user: js.Object): Unit = js.native
    @JSGlobal("Roles.removeUsersFromRoles")
    @js.native
    def removeUsersFromRoles(user: js.Object, roles: js.UndefOr[scala.Nothing], group: String): Unit = js.native
    @JSGlobal("Roles.removeUsersFromRoles")
    @js.native
    def removeUsersFromRoles(user: js.Object, roles: js.Array[String]): Unit = js.native
    @JSGlobal("Roles.removeUsersFromRoles")
    @js.native
    def removeUsersFromRoles(user: js.Object, roles: js.Array[String], group: String): Unit = js.native
    
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
    @JSGlobal("Roles.setUserRoles")
    @js.native
    def setUserRoles(user: String, roles: String): Unit = js.native
    @JSGlobal("Roles.setUserRoles")
    @js.native
    def setUserRoles(user: String, roles: String, group: String): Unit = js.native
    @JSGlobal("Roles.setUserRoles")
    @js.native
    def setUserRoles(user: String, roles: js.Array[String]): Unit = js.native
    @JSGlobal("Roles.setUserRoles")
    @js.native
    def setUserRoles(user: String, roles: js.Array[String], group: String): Unit = js.native
    @JSGlobal("Roles.setUserRoles")
    @js.native
    def setUserRoles(user: js.Array[js.Object | String], roles: String): Unit = js.native
    @JSGlobal("Roles.setUserRoles")
    @js.native
    def setUserRoles(user: js.Array[js.Object | String], roles: String, group: String): Unit = js.native
    @JSGlobal("Roles.setUserRoles")
    @js.native
    def setUserRoles(user: js.Array[js.Object | String], roles: js.Array[String]): Unit = js.native
    @JSGlobal("Roles.setUserRoles")
    @js.native
    def setUserRoles(user: js.Array[js.Object | String], roles: js.Array[String], group: String): Unit = js.native
    @JSGlobal("Roles.setUserRoles")
    @js.native
    def setUserRoles(user: js.Object, roles: String): Unit = js.native
    @JSGlobal("Roles.setUserRoles")
    @js.native
    def setUserRoles(user: js.Object, roles: String, group: String): Unit = js.native
    @JSGlobal("Roles.setUserRoles")
    @js.native
    def setUserRoles(user: js.Object, roles: js.Array[String]): Unit = js.native
    @JSGlobal("Roles.setUserRoles")
    @js.native
    def setUserRoles(user: js.Object, roles: js.Array[String], group: String): Unit = js.native
    
    /**
      * Subscription handle for the currently logged in user's permissions.
      *
      * NOTE: The corresponding publish function, `_roles`, depends on
      * `this.userId` so it will automatically re-run when the currently
      * logged-in user changes.
      *
      * @example
      *
      *     `Roles.subscription.ready()` // => `true` if user roles have been loaded
      *
      * @property subscription
      * @type Object
      * @for Roles
      */
    @JSGlobal("Roles.subscription")
    @js.native
    def subscription: Subscription = js.native
    @scala.inline
    def subscription_=(x: Subscription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subscription")(x.asInstanceOf[js.Any])
    
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
    @JSGlobal("Roles.userIsInRole")
    @js.native
    def userIsInRole(user: String, roles: String): Boolean = js.native
    @JSGlobal("Roles.userIsInRole")
    @js.native
    def userIsInRole(user: String, roles: String, group: String): Boolean = js.native
    @JSGlobal("Roles.userIsInRole")
    @js.native
    def userIsInRole(user: String, roles: js.Array[String]): Boolean = js.native
    @JSGlobal("Roles.userIsInRole")
    @js.native
    def userIsInRole(user: String, roles: js.Array[String], group: String): Boolean = js.native
    @JSGlobal("Roles.userIsInRole")
    @js.native
    def userIsInRole(user: js.Array[js.Object | String], roles: String): Boolean = js.native
    @JSGlobal("Roles.userIsInRole")
    @js.native
    def userIsInRole(user: js.Array[js.Object | String], roles: String, group: String): Boolean = js.native
    @JSGlobal("Roles.userIsInRole")
    @js.native
    def userIsInRole(user: js.Array[js.Object | String], roles: js.Array[String]): Boolean = js.native
    @JSGlobal("Roles.userIsInRole")
    @js.native
    def userIsInRole(user: js.Array[js.Object | String], roles: js.Array[String], group: String): Boolean = js.native
    @JSGlobal("Roles.userIsInRole")
    @js.native
    def userIsInRole(user: js.Object, roles: String): Boolean = js.native
    @JSGlobal("Roles.userIsInRole")
    @js.native
    def userIsInRole(user: js.Object, roles: String, group: String): Boolean = js.native
    @JSGlobal("Roles.userIsInRole")
    @js.native
    def userIsInRole(user: js.Object, roles: js.Array[String]): Boolean = js.native
    @JSGlobal("Roles.userIsInRole")
    @js.native
    def userIsInRole(user: js.Object, roles: js.Array[String], group: String): Boolean = js.native
  }
}
