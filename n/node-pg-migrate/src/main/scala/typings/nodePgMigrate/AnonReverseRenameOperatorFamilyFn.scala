package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.operatorsTypesMod.RenameOperatorFamilyFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameOperatorFamilyFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameOperatorFamilyFn = js.native
  def reverse(oldOperatorFamilyName: Name, indexMethod: Name, newOperatorFamilyName: Name): String | js.Array[String] = js.native
}

