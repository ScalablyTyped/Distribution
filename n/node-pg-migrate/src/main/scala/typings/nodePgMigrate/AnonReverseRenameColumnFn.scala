package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.tablesTypesMod.RenameColumnFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameColumnFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameColumnFn = js.native
  def reverse(tableName: Name, oldColumnName: String, newColumnName: String): String | js.Array[String] = js.native
}

