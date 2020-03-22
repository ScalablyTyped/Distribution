package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.sequencesTypesMod.CreateSequenceFn
import typings.nodePgMigrate.sequencesTypesMod.SequenceOptionsCreate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseCreateSequenceFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateSequenceFn = js.native
  def reverse(sequenceName: Name): String | js.Array[String] = js.native
  def reverse(sequenceName: Name, sequenceOptions: SequenceOptionsCreate with DropOptions): String | js.Array[String] = js.native
}

