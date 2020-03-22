package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.typesTypesMod.RenameTypeValueFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameTypeValueFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameTypeValueFn = js.native
  def reverse(typeName: Name, value: String, newValue: String): String | js.Array[String] = js.native
}

