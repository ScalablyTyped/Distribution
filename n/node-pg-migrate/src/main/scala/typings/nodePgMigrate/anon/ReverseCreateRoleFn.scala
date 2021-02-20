package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import typings.nodePgMigrate.rolesTypesMod.CreateRoleFn
import typings.nodePgMigrate.rolesTypesMod.RoleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateRoleFn extends StObject {
  
  def reverse(roleName: typings.nodePgMigrate.generalTypesMod.Name): String | js.Array[String] = js.native
  def reverse(roleName: typings.nodePgMigrate.generalTypesMod.Name, roleOptions: RoleOptions with IfExistsOption): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateRoleFn = js.native
}
