package typings.nodePgMigrate.anon

import typings.nodePgMigrate.operatorsTypesMod.RenameOperatorFamilyFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameOperatorFamilyFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameOperatorFamilyFn = js.native
  def reverse(
    oldOperatorFamilyName: typings.nodePgMigrate.generalTypesMod.Name,
    indexMethod: typings.nodePgMigrate.generalTypesMod.Name,
    newOperatorFamilyName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
}

