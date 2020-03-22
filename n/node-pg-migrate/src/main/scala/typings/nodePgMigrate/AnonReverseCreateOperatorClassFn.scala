package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.operatorsTypesMod.CreateOperatorClassFn
import typings.nodePgMigrate.operatorsTypesMod.CreateOperatorClassOptions
import typings.nodePgMigrate.operatorsTypesMod.OperatorListDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseCreateOperatorClassFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateOperatorClassFn = js.native
  def reverse(
    operatorClassName: Name,
    `type`: Type,
    indexMethod: Name,
    operatorList: js.Array[OperatorListDefinition],
    options: CreateOperatorClassOptions with DropOptions
  ): String | js.Array[String] = js.native
}

