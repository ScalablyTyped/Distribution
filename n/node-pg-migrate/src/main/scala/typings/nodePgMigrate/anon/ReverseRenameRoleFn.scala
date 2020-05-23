package typings.nodePgMigrate.anon

import typings.nodePgMigrate.rolesTypesMod.RenameRoleFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameRoleFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameRoleFn = js.native
  def reverse(
    oldRoleName: typings.nodePgMigrate.generalTypesMod.Name,
    newRoleName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
}

