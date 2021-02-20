package typings.nodePgMigrate.anon

import typings.nodePgMigrate.indexesTypesMod.CreateIndexFn
import typings.nodePgMigrate.indexesTypesMod.CreateIndexOptions
import typings.nodePgMigrate.indexesTypesMod.DropIndexOptions
import typings.nodePgMigrate.indexesTypesMod.IndexColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateIndexFn extends StObject {
  
  def reverse(tableName: typings.nodePgMigrate.generalTypesMod.Name, columns: String): String | js.Array[String] = js.native
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    columns: String,
    options: CreateIndexOptions with DropIndexOptions
  ): String | js.Array[String] = js.native
  def reverse(tableName: typings.nodePgMigrate.generalTypesMod.Name, columns: js.Array[String | IndexColumn]): String | js.Array[String] = js.native
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    columns: js.Array[String | IndexColumn],
    options: CreateIndexOptions with DropIndexOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateIndexFn = js.native
}
