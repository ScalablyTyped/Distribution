package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.indexesTypesMod.CreateIndexFn
import typings.nodePgMigrate.indexesTypesMod.CreateIndexOptions
import typings.nodePgMigrate.indexesTypesMod.DropIndexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseCreateIndexFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateIndexFn = js.native
  def reverse(tableName: Name, columns: String): String | js.Array[String] = js.native
  def reverse(tableName: Name, columns: String, options: CreateIndexOptions with DropIndexOptions): String | js.Array[String] = js.native
  def reverse(tableName: Name, columns: js.Array[String]): String | js.Array[String] = js.native
  def reverse(tableName: Name, columns: js.Array[String], options: CreateIndexOptions with DropIndexOptions): String | js.Array[String] = js.native
}

