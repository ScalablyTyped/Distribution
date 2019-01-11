package typings
package meteorDashTypingsLib.TrackerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Tracker")
@js.native
object ^ extends js.Object {
  var Dependency: meteorDashTypingsLib.TrackerNs.DependencyStatic = js.native
  var active: scala.Boolean = js.native
  var currentComputation: meteorDashTypingsLib.TrackerNs.Computation = js.native
  def Computation(): scala.Unit = js.native
  def afterFlush(callback: js.Function): scala.Unit = js.native
  def autorun(runFunc: js.Function1[/* computation */ meteorDashTypingsLib.TrackerNs.Computation, scala.Unit]): meteorDashTypingsLib.TrackerNs.Computation = js.native
  def autorun(
    runFunc: js.Function1[/* computation */ meteorDashTypingsLib.TrackerNs.Computation, scala.Unit],
    options: meteorDashTypingsLib.Anon_OnError
  ): meteorDashTypingsLib.TrackerNs.Computation = js.native
  def flush(): scala.Unit = js.native
  def nonreactive(func: js.Function): scala.Unit = js.native
  def onInvalidate(callback: js.Function): scala.Unit = js.native
}

