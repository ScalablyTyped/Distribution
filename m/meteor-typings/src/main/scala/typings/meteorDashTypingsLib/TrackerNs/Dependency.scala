package typings
package meteorDashTypingsLib.TrackerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dependency extends js.Object {
  def changed(): scala.Unit = js.native
  def depend(): scala.Boolean = js.native
  def depend(fromComputation: Computation): scala.Boolean = js.native
  def hasDependents(): scala.Boolean = js.native
}

@JSGlobal("Tracker.Dependency")
@js.native
class DependencyCls () extends Dependency

