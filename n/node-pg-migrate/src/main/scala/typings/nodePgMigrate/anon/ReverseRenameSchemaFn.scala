package typings.nodePgMigrate.anon

import typings.nodePgMigrate.schemasTypesMod.RenameSchemaFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameSchemaFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameSchemaFn = js.native
  def reverse(oldSchemaName: String, newSchemaName: String): String | js.Array[String] = js.native
}

