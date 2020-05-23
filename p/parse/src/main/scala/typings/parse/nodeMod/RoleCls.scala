package typings.parse.nodeMod

import typings.parse.mod.global.Parse.Attributes
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/node", "Role")
@js.native
class RoleCls[T /* <: Attributes */] protected ()
  extends typings.parse.mod.global.Parse.Role[Partial[T]] {
  def this(name: String, acl: typings.parse.mod.global.Parse.ACL) = this()
}

