package typings.nextReactRefreshUtils.runtimeMod

import typings.nextReactRefreshUtils.anon.GetRefreshBoundarySignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshRuntimeGlobals extends js.Object {
  
  @JSName("$RefreshHelpers$")
  var DollarRefreshHelpersDollar: GetRefreshBoundarySignature = js.native
  
  @JSName("$RefreshInterceptModuleExecution$")
  def DollarRefreshInterceptModuleExecutionDollar(moduleId: String): js.Function0[Unit] = js.native
  
  @JSName("$RefreshReg$")
  def DollarRefreshRegDollar(`type`: js.Any, id: String): Unit = js.native
  
  @JSName("$RefreshSig$")
  def DollarRefreshSigDollar(): js.Function1[/* type */ js.Any, _] = js.native
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
  
  @scala.inline
  implicit class RefreshRuntimeGlobalsOps[Self <: RefreshRuntimeGlobals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDollarRefreshHelpersDollar(value: GetRefreshBoundarySignature): Self = this.set("$RefreshHelpers$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDollarRefreshInterceptModuleExecutionDollar(value: String => js.Function0[Unit]): Self = this.set("$RefreshInterceptModuleExecution$", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDollarRefreshRegDollar(value: (js.Any, String) => Unit): Self = this.set("$RefreshReg$", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDollarRefreshSigDollar(value: () => js.Function1[/* type */ js.Any, _]): Self = this.set("$RefreshSig$", js.Any.fromFunction0(value))
  }
}
