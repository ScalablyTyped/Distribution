package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.operatorsTypesMod.CreateOperatorFamilyFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseCreateOperatorFamilyFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateOperatorFamilyFn = js.native
  def reverse(operatorFamilyName: Name, indexMethod: Name): String | js.Array[String] = js.native
  def reverse(operatorFamilyName: Name, indexMethod: Name, options: DropOptions): String | js.Array[String] = js.native
}

