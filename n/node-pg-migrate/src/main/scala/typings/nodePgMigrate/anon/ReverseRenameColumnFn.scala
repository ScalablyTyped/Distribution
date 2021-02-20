package typings.nodePgMigrate.anon

import typings.nodePgMigrate.tablesTypesMod.RenameColumnFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameColumnFn extends StObject {
  
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    oldColumnName: String,
    newColumnName: String
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameColumnFn = js.native
}
