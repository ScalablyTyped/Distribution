package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.typesTypesMod.AddTypeAttributeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseAddTypeAttributeFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: AddTypeAttributeFn = js.native
  def reverse(typeName: Name, attributeName: String, attributeType: Type with IfExistsOption): String | js.Array[String] = js.native
}

