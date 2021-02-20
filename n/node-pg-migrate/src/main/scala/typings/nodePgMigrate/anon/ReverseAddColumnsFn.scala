package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typings.nodePgMigrate.tablesTypesMod.AddColumnsFn
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseAddColumnsFn extends StObject {
  
  def reverse(tableName: typings.nodePgMigrate.generalTypesMod.Name, newColumns: ColumnDefinitions): String | js.Array[String] = js.native
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    newColumns: ColumnDefinitions,
    addOptions: IfNotExistsOption with DropOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: AddColumnsFn = js.native
}
