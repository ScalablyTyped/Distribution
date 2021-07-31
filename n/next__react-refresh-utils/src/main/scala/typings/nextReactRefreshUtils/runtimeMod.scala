package typings.nextReactRefreshUtils

import typings.nextReactRefreshUtils.anon.GetRefreshBoundarySignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeMod {
  
  trait RefreshRuntimeGlobals extends StObject {
    
    @JSName("$RefreshHelpers$")
    var DollarRefreshHelpersDollar: GetRefreshBoundarySignature
    
    @JSName("$RefreshInterceptModuleExecution$")
    def DollarRefreshInterceptModuleExecutionDollar(moduleId: String): js.Function0[Unit]
    
    @JSName("$RefreshReg$")
    def DollarRefreshRegDollar(`type`: js.Any, id: String): Unit
    
    @JSName("$RefreshSig$")
    def DollarRefreshSigDollar(): js.Function1[/* type */ js.Any, js.Any]
  }
  object RefreshRuntimeGlobals {
    
    @scala.inline
    def apply(
      DollarRefreshHelpersDollar: GetRefreshBoundarySignature,
      DollarRefreshInterceptModuleExecutionDollar: String => js.Function0[Unit],
      DollarRefreshRegDollar: (js.Any, String) => Unit,
      DollarRefreshSigDollar: () => js.Function1[/* type */ js.Any, js.Any]
    ): RefreshRuntimeGlobals = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("$RefreshHelpers$")(DollarRefreshHelpersDollar.asInstanceOf[js.Any])
      __obj.updateDynamic("$RefreshInterceptModuleExecution$")(js.Any.fromFunction1(DollarRefreshInterceptModuleExecutionDollar))
      __obj.updateDynamic("$RefreshReg$")(js.Any.fromFunction2(DollarRefreshRegDollar))
      __obj.updateDynamic("$RefreshSig$")(js.Any.fromFunction0(DollarRefreshSigDollar))
      __obj.asInstanceOf[RefreshRuntimeGlobals]
    }
    
    @scala.inline
    implicit class RefreshRuntimeGlobalsMutableBuilder[Self <: RefreshRuntimeGlobals] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDollarRefreshHelpersDollar(value: GetRefreshBoundarySignature): Self = StObject.set(x, "$RefreshHelpers$", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDollarRefreshInterceptModuleExecutionDollar(value: String => js.Function0[Unit]): Self = StObject.set(x, "$RefreshInterceptModuleExecution$", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDollarRefreshRegDollar(value: (js.Any, String) => Unit): Self = StObject.set(x, "$RefreshReg$", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDollarRefreshSigDollar(value: () => js.Function1[/* type */ js.Any, js.Any]): Self = StObject.set(x, "$RefreshSig$", js.Any.fromFunction0(value))
    }
  }
}
