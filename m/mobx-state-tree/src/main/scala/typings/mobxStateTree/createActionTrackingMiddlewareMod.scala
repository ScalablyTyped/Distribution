package typings.mobxStateTree

import typings.mobxStateTree.actionMod.IMiddlewareEvent
import typings.mobxStateTree.actionMod.IMiddlewareHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createActionTrackingMiddlewareMod {
  
  @JSImport("mobx-state-tree/dist/middlewares/create-action-tracking-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createActionTrackingMiddleware[T](hooks: IActionTrackingMiddlewareHooks[T]): IMiddlewareHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createActionTrackingMiddleware")(hooks.asInstanceOf[js.Any]).asInstanceOf[IMiddlewareHandler]
  
  trait IActionTrackingMiddlewareHooks[T] extends StObject {
    
    var filter: js.UndefOr[js.Function1[/* call */ IMiddlewareEvent, Boolean]] = js.undefined
    
    def onFail(call: IMiddlewareEvent, context: T, error: js.Any): Unit
    
    def onResume(call: IMiddlewareEvent, context: T): Unit
    
    def onStart(call: IMiddlewareEvent): T
    
    def onSuccess(call: IMiddlewareEvent, context: T, result: js.Any): Unit
    
    def onSuspend(call: IMiddlewareEvent, context: T): Unit
  }
  object IActionTrackingMiddlewareHooks {
    
    inline def apply[T](
      onFail: (IMiddlewareEvent, T, js.Any) => Unit,
      onResume: (IMiddlewareEvent, T) => Unit,
      onStart: IMiddlewareEvent => T,
      onSuccess: (IMiddlewareEvent, T, js.Any) => Unit,
      onSuspend: (IMiddlewareEvent, T) => Unit
    ): IActionTrackingMiddlewareHooks[T] = {
      val __obj = js.Dynamic.literal(onFail = js.Any.fromFunction3(onFail), onResume = js.Any.fromFunction2(onResume), onStart = js.Any.fromFunction1(onStart), onSuccess = js.Any.fromFunction3(onSuccess), onSuspend = js.Any.fromFunction2(onSuspend))
      __obj.asInstanceOf[IActionTrackingMiddlewareHooks[T]]
    }
    
    extension [Self <: IActionTrackingMiddlewareHooks[?], T](x: Self & IActionTrackingMiddlewareHooks[T]) {
      
      inline def setFilter(value: /* call */ IMiddlewareEvent => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setOnFail(value: (IMiddlewareEvent, T, js.Any) => Unit): Self = StObject.set(x, "onFail", js.Any.fromFunction3(value))
      
      inline def setOnResume(value: (IMiddlewareEvent, T) => Unit): Self = StObject.set(x, "onResume", js.Any.fromFunction2(value))
      
      inline def setOnStart(value: IMiddlewareEvent => T): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnSuccess(value: (IMiddlewareEvent, T, js.Any) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
      
      inline def setOnSuspend(value: (IMiddlewareEvent, T) => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction2(value))
    }
  }
}
