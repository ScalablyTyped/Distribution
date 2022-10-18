package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcContextTypesMod.Context
import typings.opentelemetryApi.buildSrcContextTypesMod.ContextManager
import typings.std.ReturnType
import typings.std.ThisParameterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcApiContextMod {
  
  @JSImport("@opentelemetry/api/build/src/api/context", "ContextAPI")
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  /* private */ open class ContextAPI () extends StObject {
    
    /* private */ var _getContextManager: Any = js.native
    
    /**
      * Get the currently active context
      */
    def active(): Context = js.native
    
    /**
      * Bind a context to a target function or event emitter
      *
      * @param context context to bind to the event emitter or function. Defaults to the currently active context
      * @param target function or event emitter to bind
      */
    def bind[T](context: Context, target: T): T = js.native
    
    /** Disable and remove the global context manager */
    def disable(): Unit = js.native
    
    /**
      * Set the current context manager.
      *
      * @returns true if the context manager was successfully registered, else false
      */
    def setGlobalContextManager(contextManager: ContextManager): Boolean = js.native
    
    def `with`[A /* <: js.Array[Any] */, F /* <: js.Function1[/* args */ A, ReturnType[F]] */](
      context: Context,
      fn: F,
      thisArg: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
    ): ReturnType[F] = js.native
    /**
      * Execute a function with an active context
      *
      * @param context context to be active during function execution
      * @param fn function to execute in a context
      * @param thisArg optional receiver to be used for calling fn
      * @param args optional arguments forwarded to fn
      */
    def `with`[A /* <: js.Array[Any] */, F /* <: js.Function1[/* args */ A, ReturnType[F]] */](
      context: Context,
      fn: F,
      thisArg: ThisParameterType[F],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
    ): ReturnType[F] = js.native
  }
  /* static members */
  object ContextAPI {
    
    @JSImport("@opentelemetry/api/build/src/api/context", "ContextAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api/build/src/api/context", "ContextAPI._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the Context API */
    inline def getInstance(): ContextAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[ContextAPI]
  }
}
