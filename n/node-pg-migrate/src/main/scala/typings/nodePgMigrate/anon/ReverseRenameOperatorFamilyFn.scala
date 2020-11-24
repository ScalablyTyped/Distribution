package typings.nodePgMigrate.anon

import typings.nodePgMigrate.operatorsTypesMod.RenameOperatorFamilyFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameOperatorFamilyFn extends js.Object {
  
  def reverse(
    oldOperatorFamilyName: typings.nodePgMigrate.generalTypesMod.Name,
    indexMethod: typings.nodePgMigrate.generalTypesMod.Name,
    newOperatorFamilyName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameOperatorFamilyFn = js.native
}
