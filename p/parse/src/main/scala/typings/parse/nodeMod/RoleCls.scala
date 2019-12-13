package typings.parse.nodeMod

import typings.parse.Parse.Attributes
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/node", "Role")
@js.native
class RoleCls[T /* <: Attributes */] protected ()
  extends typings.parse.Parse.Role[Partial[T]] {
  def this(name: String, acl: typings.parse.Parse.ACL) = this()
}

