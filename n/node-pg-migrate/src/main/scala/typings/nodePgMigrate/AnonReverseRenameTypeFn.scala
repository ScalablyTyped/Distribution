package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.typesTypesMod.RenameTypeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameTypeFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameTypeFn = js.native
  def reverse(typeName: Name, newTypeName: Name): String | js.Array[String] = js.native
}

