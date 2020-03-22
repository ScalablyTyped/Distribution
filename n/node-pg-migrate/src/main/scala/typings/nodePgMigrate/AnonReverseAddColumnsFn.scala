package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.tablesTypesMod.AddColumnsFn
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseAddColumnsFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: AddColumnsFn = js.native
  def reverse(tableName: Name, newColumns: ColumnDefinitions): String | js.Array[String] = js.native
  def reverse(tableName: Name, newColumns: ColumnDefinitions, addOptions: IfNotExistsOption with DropOptions): String | js.Array[String] = js.native
}

