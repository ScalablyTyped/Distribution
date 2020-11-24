package typings.mobxStateTree.createActionTrackingMiddlewareMod

import typings.mobxStateTree.actionMod.IMiddlewareEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionTrackingMiddlewareHooks[T] extends js.Object {
  
  var filter: js.UndefOr[js.Function1[/* call */ IMiddlewareEvent, Boolean]] = js.native
  
  def onFail(call: IMiddlewareEvent, context: T, error: js.Any): Unit = js.native
  
  def onResume(call: IMiddlewareEvent, context: T): Unit = js.native
  
  def onStart(call: IMiddlewareEvent): T = js.native
  
  def onSuccess(call: IMiddlewareEvent, context: T, result: js.Any): Unit = js.native
  
  def onSuspend(call: IMiddlewareEvent, context: T): Unit = js.native
}
object IActionTrackingMiddlewareHooks {
  
  @scala.inline
  def apply[T](
    onFail: (IMiddlewareEvent, T, js.Any) => Unit,
    onResume: (IMiddlewareEvent, T) => Unit,
    onStart: IMiddlewareEvent => T,
    onSuccess: (IMiddlewareEvent, T, js.Any) => Unit,
    onSuspend: (IMiddlewareEvent, T) => Unit
  ): IActionTrackingMiddlewareHooks[T] = {
    val __obj = js.Dynamic.literal(onFail = js.Any.fromFunction3(onFail), onResume = js.Any.fromFunction2(onResume), onStart = js.Any.fromFunction1(onStart), onSuccess = js.Any.fromFunction3(onSuccess), onSuspend = js.Any.fromFunction2(onSuspend))
    __obj.asInstanceOf[IActionTrackingMiddlewareHooks[T]]
  }
  
  @scala.inline
  implicit class IActionTrackingMiddlewareHooksOps[Self <: IActionTrackingMiddlewareHooks[_], T] (val x: Self with IActionTrackingMiddlewareHooks[T]) extends AnyVal {
    
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
    def setOnFail(value: (IMiddlewareEvent, T, js.Any) => Unit): Self = this.set("onFail", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnResume(value: (IMiddlewareEvent, T) => Unit): Self = this.set("onResume", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnStart(value: IMiddlewareEvent => T): Self = this.set("onStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuccess(value: (IMiddlewareEvent, T, js.Any) => Unit): Self = this.set("onSuccess", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSuspend(value: (IMiddlewareEvent, T) => Unit): Self = this.set("onSuspend", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilter(value: /* call */ IMiddlewareEvent => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
}
