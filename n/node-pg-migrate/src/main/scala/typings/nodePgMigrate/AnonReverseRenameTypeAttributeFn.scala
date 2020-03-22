package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.typesTypesMod.RenameTypeAttributeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameTypeAttributeFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameTypeAttributeFn = js.native
  def reverse(typeName: Name, attributeName: String, newAttributeName: String): String | js.Array[String] = js.native
}

