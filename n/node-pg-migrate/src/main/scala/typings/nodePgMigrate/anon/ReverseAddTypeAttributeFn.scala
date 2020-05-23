package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import typings.nodePgMigrate.typesTypesMod.AddTypeAttributeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseAddTypeAttributeFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: AddTypeAttributeFn = js.native
  def reverse(
    typeName: typings.nodePgMigrate.generalTypesMod.Name,
    attributeName: String,
    attributeType: typings.nodePgMigrate.generalTypesMod.Type with IfExistsOption
  ): String | js.Array[String] = js.native
}

