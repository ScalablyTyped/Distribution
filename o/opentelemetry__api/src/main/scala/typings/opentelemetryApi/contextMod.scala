package typings.opentelemetryApi

import typings.opentelemetryContextBase.mod.Context
import typings.opentelemetryContextBase.typesMod.ContextManager
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/api/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  class ContextAPI protected () extends js.Object {
    
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
  @js.native
  object ContextAPI extends js.Object {
    
    var _instance: js.Any = js.native
    
    /** Get the singleton instance of the Context API */
    def getInstance(): ContextAPI = js.native
  }
}
