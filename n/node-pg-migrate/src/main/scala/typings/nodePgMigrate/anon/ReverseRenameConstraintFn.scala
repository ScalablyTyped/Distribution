package typings.nodePgMigrate.anon

import typings.nodePgMigrate.tablesTypesMod.RenameConstraintFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameConstraintFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameConstraintFn = js.native
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    oldConstraintName: String,
    newConstraintName: String
  ): String | js.Array[String] = js.native
}

