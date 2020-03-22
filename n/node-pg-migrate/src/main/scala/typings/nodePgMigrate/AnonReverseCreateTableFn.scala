package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import typings.nodePgMigrate.tablesTypesMod.CreateTableFn
import typings.nodePgMigrate.tablesTypesMod.TableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseCreateTableFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateTableFn = js.native
  def reverse(tableName: Name, columns: ColumnDefinitions): String | js.Array[String] = js.native
  def reverse(tableName: Name, columns: ColumnDefinitions, options: TableOptions with DropOptions): String | js.Array[String] = js.native
}

