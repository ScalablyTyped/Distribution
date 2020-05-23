package typings.nodePgMigrate.anon

import typings.nodePgMigrate.sequencesTypesMod.RenameSequenceFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameSequenceFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameSequenceFn = js.native
  def reverse(
    oldSequenceName: typings.nodePgMigrate.generalTypesMod.Name,
    newSequenceName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
}

