package typings.nextReactRefreshUtils.runtimeMod

import typings.nextReactRefreshUtils.anon.GetRefreshBoundarySignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshRuntimeGlobals extends js.Object {
  @JSName("$RefreshHelpers$")
  var DollarRefreshHelpersDollar: GetRefreshBoundarySignature
  @JSName("$RefreshInterceptModuleExecution$")
  def DollarRefreshInterceptModuleExecutionDollar(moduleId: String): js.Function0[Unit]
  @JSName("$RefreshReg$")
  def DollarRefreshRegDollar(`type`: js.Any, id: String): Unit
  @JSName("$RefreshSig$")
  def DollarRefreshSigDollar(): js.Function1[/* type */ js.Any, _]
}

object RefreshRuntimeGlobals {
  @scala.inline
  def apply(
    DollarRefreshHelpersDollar: GetRefreshBoundarySignature,
    DollarRefreshInterceptModuleExecutionDollar: String => js.Function0[Unit],
    DollarRefreshRegDollar: (js.Any, String) => Unit,
    DollarRefreshSigDollar: () => js.Function1[/* type */ js.Any, _]
  ): RefreshRuntimeGlobals = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$RefreshHelpers$")(DollarRefreshHelpersDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$RefreshInterceptModuleExecution$")(js.Any.fromFunction1(DollarRefreshInterceptModuleExecutionDollar))
    __obj.updateDynamic("$RefreshReg$")(js.Any.fromFunction2(DollarRefreshRegDollar))
    __obj.updateDynamic("$RefreshSig$")(js.Any.fromFunction0(DollarRefreshSigDollar))
    __obj.asInstanceOf[RefreshRuntimeGlobals]
  }
}

