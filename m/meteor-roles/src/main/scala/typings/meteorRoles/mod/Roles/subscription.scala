package typings.meteorRoles.mod.Roles

import org.scalablytyped.runtime.TopLevel
import typings.meteor.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("meteor/alanning:roles", "Roles.subscription")
@js.native
object subscription extends TopLevel[Subscription]

