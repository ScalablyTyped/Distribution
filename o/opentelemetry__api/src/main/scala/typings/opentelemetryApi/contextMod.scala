package typings.opentelemetryApi

import typings.opentelemetryContextBase.mod.Context
import typings.opentelemetryContextBase.typesMod.ContextManager
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("@opentelemetry/api/build/src/api/context", "ContextAPI")
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  class ContextAPI protected () extends StObject {
    
    var _getContextManager: js.Any = js.native
    
    /**
      * Get the currently active context
      */
    def active(): Context = js.native
    
    /**
      * Bind a context to a target function or event emitter
      *
      * @param target function or event emitter to bind
      * @param context context to bind to the event emitter or function. Defaults to the currently active context
      */
    def bind[T](target: T): T = js.native
    def bind[T](target: T, context: Context): T = js.native
    
    /** Disable and remove the global context manager */
    def disable(): Unit = js.native
    
    /**
      * Set the current context manager. Returns the initialized context manager
      */
    def setGlobalContextManager(contextManager: ContextManager): ContextManager = js.native
    
    /**
      * Execute a function with an active context
      *
      * @param context context to be active during function execution
      * @param fn function to execute in a context
      */
    def `with`[T /* <: js.Function1[/* repeated */ js.Any, ReturnType[T]] */](context: Context, fn: T): ReturnType[T] = js.native
  }
  /* static members */
  object ContextAPI {
    
    @JSImport("@opentelemetry/api/build/src/api/context", "ContextAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api/build/src/api/context", "ContextAPI._instance")
    @js.native
    def _instance: js.Any = js.native
    @scala.inline
    def _instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the Context API */
    @scala.inline
    def getInstance(): ContextAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[ContextAPI]
  }
}
