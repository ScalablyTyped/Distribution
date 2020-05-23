package typings.nodePgMigrate.anon

import typings.nodePgMigrate.tablesTypesMod.RenameTableFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameTableFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameTableFn = js.native
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    newtableName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
}

