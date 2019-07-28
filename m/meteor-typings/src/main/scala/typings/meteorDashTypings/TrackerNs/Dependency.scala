package typings.meteorDashTypings.TrackerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dependency extends js.Object {
  def changed(): Unit = js.native
  def depend(): Boolean = js.native
  def depend(fromComputation: Computation): Boolean = js.native
  def hasDependents(): Boolean = js.native
}

@JSGlobal("Tracker.Dependency")
@js.native
class DependencyCls () extends Dependency

