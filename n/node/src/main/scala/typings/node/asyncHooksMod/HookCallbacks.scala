package typings.node.asyncHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HookCallbacks extends js.Object {
  
  /**
    * Called immediately after the callback specified in before is completed.
    * @param asyncId the unique identifier assigned to the resource which has executed the callback.
    */
  var after: js.UndefOr[js.Function1[/* asyncId */ Double, Unit]] = js.native
  
  /**
    * When an asynchronous operation is initiated or completes a callback is called to notify the user.
    * The before callback is called just before said callback is executed.
    * @param asyncId the unique identifier assigned to the resource about to execute the callback.
    */
  var before: js.UndefOr[js.Function1[/* asyncId */ Double, Unit]] = js.native
  
  /**
    * Called after the resource corresponding to asyncId is destroyed
    * @param asyncId a unique ID for the async resource
    */
  var destroy: js.UndefOr[js.Function1[/* asyncId */ Double, Unit]] = js.native
  
  /**
    * Called when a class is constructed that has the possibility to emit an asynchronous event.
    * @param asyncId a unique ID for the async resource
    * @param type the type of the async resource
    * @param triggerAsyncId the unique ID of the async resource in whose execution context this async resource was created
    * @param resource reference to the resource representing the async operation, needs to be released during destroy
    */
  var init: js.UndefOr[
    js.Function4[
      /* asyncId */ Double, 
      /* type */ String, 
      /* triggerAsyncId */ Double, 
      /* resource */ js.Object, 
      Unit
    ]
  ] = js.native
  
  /**
    * Called when a promise has resolve() called. This may not be in the same execution id
    * as the promise itself.
    * @param asyncId the unique id for the promise that was resolve()d.
    */
  var promiseResolve: js.UndefOr[js.Function1[/* asyncId */ Double, Unit]] = js.native
}
object HookCallbacks {
  
  @scala.inline
  def apply(): HookCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookCallbacks]
  }
  
  @scala.inline
  implicit class HookCallbacksOps[Self <: HookCallbacks] (val x: Self) extends AnyVal {
    
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
    def setAfter(value: /* asyncId */ Double => Unit): Self = this.set("after", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setBefore(value: /* asyncId */ Double => Unit): Self = this.set("before", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* asyncId */ Double => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setInit(
      value: (/* asyncId */ Double, /* type */ String, /* triggerAsyncId */ Double, /* resource */ js.Object) => Unit
    ): Self = this.set("init", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setPromiseResolve(value: /* asyncId */ Double => Unit): Self = this.set("promiseResolve", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePromiseResolve: Self = this.set("promiseResolve", js.undefined)
  }
}
