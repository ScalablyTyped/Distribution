package typings.parse.ParseNs

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
@JSGlobal("Parse.Role")
@js.native
class Role protected () extends Object {
  def this(name: String, acl: ACL) = this()
  def getName(): String = js.native
  def getRoles(): Relation[Role, Role] = js.native
  def getUsers(): Relation[Role, User] = js.native
  def setName(name: String): js.Any = js.native
  def setName(name: String, options: SuccessFailureOptions): js.Any = js.native
}

