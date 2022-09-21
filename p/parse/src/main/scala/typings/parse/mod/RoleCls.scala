package typings.parse.mod

import typings.parse.mod.global.Parse.Attributes
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("parse", "Role")
@js.native
open class RoleCls[T /* <: Attributes */] protected ()
  extends StObject
     with typings.parse.mod.global.Parse.Role[Partial[T]] {
  def this(name: String, acl: typings.parse.mod.global.Parse.ACL) = this()
}
