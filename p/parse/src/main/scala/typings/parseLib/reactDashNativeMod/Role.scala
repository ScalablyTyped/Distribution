package typings
package parseLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a Role on the Parse server. Roles represent groupings of
     * Users for the purposes of granting permissions (e.g. specifying an ACL
     * for an Object). Roles are specified by their sets of child users and
     * child roles, all of which are granted any permissions that the parent
     * role has.
     *
     * <p>Roles must have a name (which cannot be changed after creation of the
     * role), and must specify an ACL.</p>
     * @class
     * A Parse.Role is a local representation of a role persisted to the Parse
     * cloud.
     */
@JSImport("parse/react-native", "Role")
@js.native
class Role protected ()
  extends parseLib.nodeMod.Role {
  def this(name: java.lang.String, acl: parseLib.ParseNs.ACL) = this()
}

