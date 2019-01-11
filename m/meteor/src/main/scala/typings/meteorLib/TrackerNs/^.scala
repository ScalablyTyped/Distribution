package typings
package meteorLib.TrackerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Tracker")
@js.native
object ^ extends js.Object {
  var Dependency: meteorLib.TrackerNs.DependencyStatic = js.native
  var active: scala.Boolean = js.native
  var currentComputation: meteorLib.TrackerNs.Computation = js.native
  def Computation(): scala.Unit = js.native
  def afterFlush(callback: js.Function): scala.Unit = js.native
  def autorun(runFunc: js.Function1[/* computation */ meteorLib.TrackerNs.Computation, scala.Unit]): meteorLib.TrackerNs.Computation = js.native
  def autorun(
    runFunc: js.Function1[/* computation */ meteorLib.TrackerNs.Computation, scala.Unit],
    options: meteorLib.Anon_OnError
  ): meteorLib.TrackerNs.Computation = js.native
  def flush(): scala.Unit = js.native
  def nonreactive(func: js.Function): scala.Unit = js.native
  def onInvalidate(callback: js.Function): scala.Unit = js.native
}

