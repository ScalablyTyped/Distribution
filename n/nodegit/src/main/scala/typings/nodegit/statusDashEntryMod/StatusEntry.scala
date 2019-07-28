package typings.nodegit.statusDashEntryMod

import typings.nodegit.diffDashDeltaMod.DiffDelta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/status-entry", "StatusEntry")
@js.native
class StatusEntry () extends js.Object {
  def headToIndex(): DiffDelta = js.native
  def indexToWorkdir(): DiffDelta = js.native
  def status(): Double = js.native
}

