package typings.nodePgMigrate.anon

import typings.nodePgMigrate.schemasTypesMod.RenameSchemaFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameSchemaFn extends js.Object {
  
  def reverse(oldSchemaName: String, newSchemaName: String): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameSchemaFn = js.native
}
