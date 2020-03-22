package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.tablesTypesMod.RenameTableFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameTableFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameTableFn = js.native
  def reverse(tableName: Name, newtableName: Name): String | js.Array[String] = js.native
}

