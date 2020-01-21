package typings.parse.mod._Global_.Parse

import org.scalablytyped.runtime.TopLevel
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
  * A Parse.Role is a local representation of a role persisted to the Parse
  * cloud.
  */
@js.native
trait Role[T /* <: Attributes */] extends Object[T] {
  def getName(): String = js.native
  def getRoles(): Relation[Role[Attributes], Role[Attributes]] = js.native
  def getUsers[U /* <: User[Attributes] */](): Relation[Role[Attributes], U] = js.native
  def setName(name: String): js.Any = js.native
  def setName(name: String, options: SuccessFailureOptions): js.Any = js.native
}

@JSGlobal("Parse.Role")
@js.native
object Role extends TopLevel[RoleConstructor]

