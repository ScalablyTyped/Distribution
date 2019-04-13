package typings
package orchestratorLib.orchestratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  var dep: js.Array[java.lang.String] = js.native
  var done: js.UndefOr[scala.Boolean] = js.native
  var duration: js.UndefOr[scala.Double] = js.native
  @JSName("fn")
  var fn_Original: TaskFunc = js.native
  var hrDuration: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.native
  var name: java.lang.String = js.native
  var running: js.UndefOr[scala.Boolean] = js.native
  def fn(callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]): qLib.qMod.Promise[_] | nodeLib.streamMod.Stream | js.Any = js.native
}

