package typings.nodePgMigrate.anon

import typings.nodePgMigrate.viewsTypesMod.RenameViewFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameViewFn extends js.Object {
  
  def reverse(
    viewName: typings.nodePgMigrate.generalTypesMod.Name,
    newViewName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameViewFn = js.native
}
