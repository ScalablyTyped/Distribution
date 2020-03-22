package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.operatorsTypesMod.RenameOperatorClassFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameOperatorClassFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameOperatorClassFn = js.native
  def reverse(oldOperatorClassName: Name, indexMethod: Name, newOperatorClassName: Name): String | js.Array[String] = js.native
}

