package typings.meteor.trackerMod

import org.scalablytyped.runtime.Instantiable0
import typings.meteor.Anon_OnError
import typings.meteor.trackerMod.TrackerNs.Computation
import typings.meteor.trackerMod.TrackerNs.Dependency
import typings.meteor.trackerMod.TrackerNs.DependencyStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tracker", "Tracker")
@js.native
object TrackerNs extends js.Object {
  trait Computation extends js.Object {
    var firstRun: Boolean
    var invalidated: Boolean
    var stopped: Boolean
    def invalidate(): Unit
    def onInvalidate(callback: js.Function): Unit
    def onStop(callback: js.Function): Unit
    def stop(): Unit
  }
  
  @js.native
  trait Dependency extends js.Object {
    def changed(): Unit = js.native
    def depend(): Boolean = js.native
    def depend(fromComputation: Computation): Boolean = js.native
    def hasDependents(): Boolean = js.native
  }
  
  @js.native
  class DependencyCls () extends Dependency
  
  @js.native
  trait DependencyStatic extends Instantiable0[Dependency]
  
  var Dependency: DependencyStatic = js.native
  var active: Boolean = js.native
  var currentComputation: Computation = js.native
  def Computation(): Unit = js.native
  def afterFlush(callback: js.Function): Unit = js.native
  def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
  def autorun(runFunc: js.Function1[/* computation */ Computation, Unit], options: Anon_OnError): Computation = js.native
  def flush(): Unit = js.native
  def nonreactive(func: js.Function): Unit = js.native
  def onInvalidate(callback: js.Function): Unit = js.native
}

