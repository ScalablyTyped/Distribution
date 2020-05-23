package typings.nodePgMigrate.anon

import typings.nodePgMigrate.typesTypesMod.RenameTypeValueFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameTypeValueFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameTypeValueFn = js.native
  def reverse(typeName: typings.nodePgMigrate.generalTypesMod.Name, value: String, newValue: String): String | js.Array[String] = js.native
}

