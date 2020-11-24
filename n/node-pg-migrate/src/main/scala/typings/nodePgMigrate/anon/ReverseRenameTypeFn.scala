package typings.nodePgMigrate.anon

import typings.nodePgMigrate.typesTypesMod.RenameTypeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameTypeFn extends js.Object {
  
  def reverse(
    typeName: typings.nodePgMigrate.generalTypesMod.Name,
    newTypeName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameTypeFn = js.native
}
