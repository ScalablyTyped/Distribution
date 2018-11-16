package typings
package meteorDashTypingsLib.trackerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tracker", "Tracker")
@js.native
object TrackerNs extends js.Object {
  
  trait Computation extends js.Object {
    var firstRun: scala.Boolean
    var invalidated: scala.Boolean
    var stopped: scala.Boolean
    def invalidate(): scala.Unit
    def onInvalidate(callback: js.Function): scala.Unit
    def onStop(callback: js.Function): scala.Unit
    def stop(): scala.Unit
  }
  
  @js.native
  trait Dependency extends js.Object {
    def changed(): scala.Unit = js.native
    def depend(): scala.Boolean = js.native
    def depend(fromComputation: Computation): scala.Boolean = js.native
    def hasDependents(): scala.Boolean = js.native
  }
  
  @js.native
  trait DependencyStatic
    extends ScalablyTyped.runtime.Instantiable0[Dependency]
  
  var Dependency: DependencyStatic = js.native
  var active: scala.Boolean = js.native
  var currentComputation: Computation = js.native
  def Computation(): scala.Unit = js.native
  def afterFlush(callback: js.Function): scala.Unit = js.native
  def autorun(runFunc: js.Function1[/* computation */ Computation, scala.Unit]): Computation = js.native
  def autorun(
    runFunc: js.Function1[/* computation */ Computation, scala.Unit],
    options: meteorDashTypingsLib.Anon_OnError
  ): Computation = js.native
  def flush(): scala.Unit = js.native
  def nonreactive(func: js.Function): scala.Unit = js.native
  def onInvalidate(callback: js.Function): scala.Unit = js.native
}

