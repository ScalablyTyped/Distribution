package typings.nodePgMigrate.anon

import typings.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameMaterializedViewFn extends StObject {
  
  def reverse(
    viewName: typings.nodePgMigrate.generalTypesMod.Name,
    newViewName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameMaterializedViewFn = js.native
}
