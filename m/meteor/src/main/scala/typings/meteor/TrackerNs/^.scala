package typings.meteor.TrackerNs

import typings.meteor.Anon_OnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Tracker")
@js.native
object ^ extends js.Object {
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

