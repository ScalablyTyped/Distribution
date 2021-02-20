package typings.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncHooksMod {
  
  /**
    * When having multiple instances of `AsyncLocalStorage`, they are independent
    * from each other. It is safe to instantiate this class multiple times.
    */
  @JSImport("async_hooks", "AsyncLocalStorage")
  @js.native
  class AsyncLocalStorage[T] () extends StObject {
    
    /**
      * This method disables the instance of `AsyncLocalStorage`. All subsequent calls
      * to `asyncLocalStorage.getStore()` will return `undefined` until
      * `asyncLocalStorage.run()` is called again.
      *
      * When calling `asyncLocalStorage.disable()`, all current contexts linked to the
      * instance will be exited.
      *
      * Calling `asyncLocalStorage.disable()` is required before the
      * `asyncLocalStorage` can be garbage collected. This does not apply to stores
      * provided by the `asyncLocalStorage`, as those objects are garbage collected
      * along with the corresponding async resources.
      *
      * This method is to be used when the `asyncLocalStorage` is not in use anymore
      * in the current process.
      */
    def disable(): Unit = js.native
    
    /**
      * Calling `asyncLocalStorage.enterWith(store)` will transition into the context
      * for the remainder of the current synchronous execution and will persist
      * through any following asynchronous calls.
      */
    def enterWith(store: T): Unit = js.native
    
    /**
      * This methods runs a function synchronously outside of a context and return its
      * return value. The store is not accessible within the callback function or the
      * asynchronous operations created within the callback.
      *
      * Optionally, arguments can be passed to the function. They will be passed to the
      * callback function.
      *
      * If the callback function throws an error, it will be thrown by `exit` too. The
      * stacktrace will not be impacted by this call and the context will be
      * re-entered.
      */
    // TODO: Apply generic vararg once available
    def exit[R](callback: js.Function1[/* repeated */ js.Any, R], args: js.Any*): R = js.native
    
    /**
      * This method returns the current store. If this method is called outside of an
      * asynchronous context initialized by calling `asyncLocalStorage.run`, it will
      * return `undefined`.
      */
    def getStore(): js.UndefOr[T] = js.native
    
    /**
      * This methods runs a function synchronously within a context and return its
      * return value. The store is not accessible outside of the callback function or
      * the asynchronous operations created within the callback.
      *
      * Optionally, arguments can be passed to the function. They will be passed to the
      * callback function.
      *
      * I the callback function throws an error, it will be thrown by `run` too. The
      * stacktrace will not be impacted by this call and the context will be exited.
      */
    // TODO: Apply generic vararg once available
    def run[R](store: T, callback: js.Function1[/* repeated */ js.Any, R], args: js.Any*): R = js.native
  }
  
  /**
    * The class AsyncResource was designed to be extended by the embedder's async resources.
    * Using this users can easily trigger the lifetime events of their own resources.
    */
  @JSImport("async_hooks", "AsyncResource")
  @js.native
  class AsyncResource protected () extends StObject {
    /**
      * AsyncResource() is meant to be extended. Instantiating a
      * new AsyncResource() also triggers init. If triggerAsyncId is omitted then
      * async_hook.executionAsyncId() is used.
      * @param type The type of async event.
      * @param triggerAsyncId The ID of the execution context that created
      *   this async event (default: `executionAsyncId()`), or an
      *   AsyncResourceOptions object (since 9.3)
      */
    def this(`type`: java.lang.String) = this()
    def this(`type`: java.lang.String, triggerAsyncId: Double) = this()
    def this(`type`: java.lang.String, triggerAsyncId: AsyncResourceOptions) = this()
    
    /**
      * @return the unique ID assigned to this AsyncResource instance.
      */
    def asyncId(): Double = js.native
    
    /**
      * Binds the given function to execute to this `AsyncResource`'s scope.
      * @param fn The function to bind to the current `AsyncResource`.
      */
    def bind[Func /* <: js.Function1[/* repeated */ js.Any, _] */](fn: Func): Func with typings.node.anon.AsyncResource = js.native
    
    /**
      * Call AsyncHooks destroy callbacks.
      */
    def emitDestroy(): Unit = js.native
    
    /**
      * Call the provided function with the provided arguments in the
      * execution context of the async resource. This will establish the
      * context, trigger the AsyncHooks before callbacks, call the function,
      * trigger the AsyncHooks after callbacks, and then restore the original
      * execution context.
      * @param fn The function to call in the execution context of this
      *   async resource.
      * @param thisArg The receiver to be used for the function call.
      * @param args Optional arguments to pass to the function.
      */
    def runInAsyncScope[This, Result](fn: js.ThisFunction1[/* this */ This, /* repeated */ js.Any, Result], thisArg: This, args: js.Any*): Result = js.native
    def runInAsyncScope[This, Result](
      fn: js.ThisFunction1[/* this */ This, /* repeated */ js.Any, Result],
      thisArg: js.UndefOr[scala.Nothing],
      args: js.Any*
    ): Result = js.native
    
    /**
      * @return the trigger ID for this AsyncResource instance.
      */
    def triggerAsyncId(): Double = js.native
  }
  object AsyncResource {
    
    /**
      * Binds the given function to the current execution context.
      * @param fn The function to bind to the current execution context.
      * @param type An optional name to associate with the underlying `AsyncResource`.
      */
    /* static member */
    @JSImport("async_hooks", "AsyncResource.bind")
    @js.native
    def bind[Func /* <: js.Function1[/* repeated */ js.Any, _] */](fn: Func): Func with typings.node.anon.AsyncResource = js.native
    @JSImport("async_hooks", "AsyncResource.bind")
    @js.native
    def bind[Func /* <: js.Function1[/* repeated */ js.Any, _] */](fn: Func, `type`: java.lang.String): Func with typings.node.anon.AsyncResource = js.native
  }
  
  /**
    * Registers functions to be called for different lifetime events of each async operation.
    * @param options the callbacks to register
    * @return an AsyncHooks instance used for disabling and enabling hooks
    */
  @JSImport("async_hooks", "createHook")
  @js.native
  def createHook(options: HookCallbacks): AsyncHook = js.native
  
  /**
    * Returns the asyncId of the current execution context.
    */
  @JSImport("async_hooks", "executionAsyncId")
  @js.native
  def executionAsyncId(): Double = js.native
  
  /**
    * The resource representing the current execution.
    *  Useful to store data within the resource.
    *
    * Resource objects returned by `executionAsyncResource()` are most often internal
    * Node.js handle objects with undocumented APIs. Using any functions or properties
    * on the object is likely to crash your application and should be avoided.
    *
    * Using `executionAsyncResource()` in the top-level execution context will
    * return an empty object as there is no handle or request object to use,
    * but having an object representing the top-level can be helpful.
    */
  @JSImport("async_hooks", "executionAsyncResource")
  @js.native
  def executionAsyncResource(): js.Object = js.native
  
  /**
    * Returns the ID of the resource responsible for calling the callback that is currently being executed.
    */
  @JSImport("async_hooks", "triggerAsyncId")
  @js.native
  def triggerAsyncId(): Double = js.native
  
  @js.native
  trait AsyncHook extends StObject {
    
    /**
      * Disable the callbacks for a given AsyncHook instance from the global pool of AsyncHook callbacks to be executed. Once a hook has been disabled it will not be called again until enabled.
      */
    def disable(): this.type = js.native
    
    /**
      * Enable the callbacks for a given AsyncHook instance. If no callbacks are provided enabling is a noop.
      */
    def enable(): this.type = js.native
  }
  object AsyncHook {
    
    @scala.inline
    def apply(disable: () => AsyncHook, enable: () => AsyncHook): AsyncHook = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
      __obj.asInstanceOf[AsyncHook]
    }
    
    @scala.inline
    implicit class AsyncHookMutableBuilder[Self <: AsyncHook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: () => AsyncHook): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => AsyncHook): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait AsyncResourceOptions extends StObject {
    
    /**
      * Disables automatic `emitDestroy` when the object is garbage collected.
      * This usually does not need to be set (even if `emitDestroy` is called
      * manually), unless the resource's `asyncId` is retrieved and the
      * sensitive API's `emitDestroy` is called with it.
      * Default: `false`
      */
    var requireManualDestroy: js.UndefOr[Boolean] = js.native
    
    /**
      * The ID of the execution context that created this async event.
      * Default: `executionAsyncId()`
      */
    var triggerAsyncId: js.UndefOr[Double] = js.native
  }
  object AsyncResourceOptions {
    
    @scala.inline
    def apply(): AsyncResourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncResourceOptions]
    }
    
    @scala.inline
    implicit class AsyncResourceOptionsMutableBuilder[Self <: AsyncResourceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequireManualDestroy(value: Boolean): Self = StObject.set(x, "requireManualDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireManualDestroyUndefined: Self = StObject.set(x, "requireManualDestroy", js.undefined)
      
      @scala.inline
      def setTriggerAsyncId(value: Double): Self = StObject.set(x, "triggerAsyncId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerAsyncIdUndefined: Self = StObject.set(x, "triggerAsyncId", js.undefined)
    }
  }
  
  @js.native
  trait HookCallbacks extends StObject {
    
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
          /* type */ java.lang.String, 
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
    implicit class HookCallbacksMutableBuilder[Self <: HookCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: /* asyncId */ Double => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(value: /* asyncId */ Double => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* asyncId */ Double => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setInit(
        value: (/* asyncId */ Double, /* type */ java.lang.String, /* triggerAsyncId */ Double, /* resource */ js.Object) => Unit
      ): Self = StObject.set(x, "init", js.Any.fromFunction4(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setPromiseResolve(value: /* asyncId */ Double => Unit): Self = StObject.set(x, "promiseResolve", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPromiseResolveUndefined: Self = StObject.set(x, "promiseResolve", js.undefined)
    }
  }
}
