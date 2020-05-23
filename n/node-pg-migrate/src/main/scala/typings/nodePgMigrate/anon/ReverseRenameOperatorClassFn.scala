package typings.nodePgMigrate.anon

import typings.nodePgMigrate.operatorsTypesMod.RenameOperatorClassFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameOperatorClassFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameOperatorClassFn = js.native
  def reverse(
    oldOperatorClassName: typings.nodePgMigrate.generalTypesMod.Name,
    indexMethod: typings.nodePgMigrate.generalTypesMod.Name,
    newOperatorClassName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
}

