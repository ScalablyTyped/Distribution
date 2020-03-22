package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.operatorsTypesMod.AddToOperatorFamilyFn
import typings.nodePgMigrate.operatorsTypesMod.OperatorListDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseAddToOperatorFamilyFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: AddToOperatorFamilyFn = js.native
  def reverse(operatorFamilyName: Name, indexMethod: Name, operatorList: js.Array[OperatorListDefinition]): String | js.Array[String] = js.native
}

