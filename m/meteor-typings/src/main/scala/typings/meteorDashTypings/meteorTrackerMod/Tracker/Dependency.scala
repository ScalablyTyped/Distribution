package typings.meteorDashTypings.meteorTrackerMod.Tracker

import org.scalablytyped.runtime.TopLevel
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

@JSImport("meteor/tracker", "Tracker.Dependency")
@js.native
object Dependency extends TopLevel[DependencyStatic]

