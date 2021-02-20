package typings.nodePgMigrate.anon

import typings.nodePgMigrate.tablesTypesMod.RenameTableFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameTableFn extends StObject {
  
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    newtableName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameTableFn = js.native
}
