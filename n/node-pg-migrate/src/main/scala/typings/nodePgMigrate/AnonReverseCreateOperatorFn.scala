package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.operatorsTypesMod.CreateOperatorFn
import typings.nodePgMigrate.operatorsTypesMod.CreateOperatorOptions
import typings.nodePgMigrate.operatorsTypesMod.DropOperatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseCreateOperatorFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateOperatorFn = js.native
  def reverse(operatorName: Name, options: CreateOperatorOptions with DropOperatorOptions): String | js.Array[String] = js.native
}

