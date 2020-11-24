package typings.meteorRoles.mod.Roles

import typings.meteor.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/alanning:roles", "Roles")
@js.native
object ^ extends js.Object {
  
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
  var GLOBAL_GROUP: String = js.native
  
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
  var subscription: Subscription = js.native
}
