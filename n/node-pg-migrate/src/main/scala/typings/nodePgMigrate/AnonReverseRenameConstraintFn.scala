package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.tablesTypesMod.RenameConstraintFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameConstraintFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameConstraintFn = js.native
  def reverse(tableName: Name, oldConstraintName: String, newConstraintName: String): String | js.Array[String] = js.native
}

