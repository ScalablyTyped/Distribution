package typings.nodePgMigrate.anon

import typings.nodePgMigrate.operatorsTypesMod.RenameOperatorClassFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameOperatorClassFn extends js.Object {
  
  def reverse(
    oldOperatorClassName: typings.nodePgMigrate.generalTypesMod.Name,
    indexMethod: typings.nodePgMigrate.generalTypesMod.Name,
    newOperatorClassName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameOperatorClassFn = js.native
}
