package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.rolesTypesMod.CreateRoleFn
import typings.nodePgMigrate.rolesTypesMod.RoleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseCreateRoleFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateRoleFn = js.native
  def reverse(roleName: Name): String | js.Array[String] = js.native
  def reverse(roleName: Name, roleOptions: RoleOptions with IfExistsOption): String | js.Array[String] = js.native
}

