package typings.nodePgMigrate.anon

import typings.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewColumnFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameMaterializedViewColumnFn extends StObject {
  
  def reverse(viewName: typings.nodePgMigrate.generalTypesMod.Name, columnName: String, newColumnName: String): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameMaterializedViewColumnFn = js.native
}
