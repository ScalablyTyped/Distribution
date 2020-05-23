package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typings.nodePgMigrate.tablesTypesMod.AddColumnsFn
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseAddColumnsFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: AddColumnsFn = js.native
  def reverse(tableName: typings.nodePgMigrate.generalTypesMod.Name, newColumns: ColumnDefinitions): String | js.Array[String] = js.native
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    newColumns: ColumnDefinitions,
    addOptions: IfNotExistsOption with DropOptions
  ): String | js.Array[String] = js.native
}

