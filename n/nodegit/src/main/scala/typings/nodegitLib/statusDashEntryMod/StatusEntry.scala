package typings
package nodegitLib.statusDashEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/status-entry", "StatusEntry")
@js.native
class StatusEntry () extends js.Object {
  def headToIndex(): nodegitLib.diffDashDeltaMod.DiffDelta = js.native
  def indexToWorkdir(): nodegitLib.diffDashDeltaMod.DiffDelta = js.native
  def status(): scala.Double = js.native
}

