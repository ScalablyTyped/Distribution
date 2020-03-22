package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.sequencesTypesMod.RenameSequenceFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameSequenceFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameSequenceFn = js.native
  def reverse(oldSequenceName: Name, newSequenceName: Name): String | js.Array[String] = js.native
}

