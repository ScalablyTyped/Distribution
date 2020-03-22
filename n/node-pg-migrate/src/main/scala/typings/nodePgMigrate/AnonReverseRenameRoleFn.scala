package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.rolesTypesMod.RenameRoleFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameRoleFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameRoleFn = js.native
  def reverse(oldRoleName: Name, newRoleName: Name): String | js.Array[String] = js.native
}

