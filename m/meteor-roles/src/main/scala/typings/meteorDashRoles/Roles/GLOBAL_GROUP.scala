package typings.meteorDashRoles.Roles

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
object GLOBAL_GROUP extends TopLevel[String]

