package typings.node.assertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("assert", "CallTracker")
@js.native
class CallTracker () extends js.Object {
  
  def calls(): js.Function0[Unit] = js.native
  def calls(exact: Double): js.Function0[Unit] = js.native
  def calls[Func /* <: js.Function1[/* repeated */ js.Any, _] */](fn: Func): Func = js.native
  def calls[Func /* <: js.Function1[/* repeated */ js.Any, _] */](fn: Func, exact: Double): Func = js.native
  def calls[Func /* <: js.Function1[/* repeated */ js.Any, _] */](fn: js.UndefOr[scala.Nothing], exact: Double): Func = js.native
  @JSName("calls")
  def calls_Func_Function1AnyWildcard_Func[Func /* <: js.Function1[/* repeated */ js.Any, _] */](): Func = js.native
  
  def report(): js.Array[CallTrackerReportInformation] = js.native
  
  def verify(): Unit = js.native
}
