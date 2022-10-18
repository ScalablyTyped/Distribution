package typings.opentelemetryContextAsyncHooks

import typings.opentelemetryApi.buildSrcContextTypesMod.ContextManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAbstractAsyncHooksContextManagerMod {
  
  /* note: abstract class */ @JSImport("@opentelemetry/context-async-hooks/build/src/AbstractAsyncHooksContextManager", "AbstractAsyncHooksContextManager")
  @js.native
  open class AbstractAsyncHooksContextManager ()
    extends StObject
       with ContextManager {
    
    /**
      * By default, EventEmitter call their callback with their context, which we do
      * not want, instead we will bind a specific context to all callbacks that
      * go through it.
      * @param context the context we want to bind
      * @param ee EventEmitter an instance of EventEmitter to patch
      */
    /* private */ var _bindEventEmitter: Any = js.native
    
    /* private */ var _bindFunction: Any = js.native
    
    /* private */ var _createPatchMap: Any = js.native
    
    /* private */ var _getPatchMap: Any = js.native
    
    /* private */ val _kOtListeners: Any = js.native
    
    /**
      * Patch methods on an event emitter instance that can add listeners so we
      * can force them to propagate a given context.
      * @param ee EventEmitter instance
      * @param original reference to the patched method
      * @param [context] context to propagate when calling listeners
      */
    /* private */ var _patchAddListener: Any = js.native
    
    /**
      * Patch methods that remove all listeners so we remove our
      * internal references for a given event.
      * @param ee EventEmitter instance
      * @param original reference to the patched method
      */
    /* private */ var _patchRemoveAllListeners: Any = js.native
    
    /**
      * Patch methods that remove a given listener so that we match the "patched"
      * version of that listener (the one that propagate context).
      * @param ee EventEmitter instance
      * @param original reference to the patched method
      */
    /* private */ var _patchRemoveListener: Any = js.native
    
    /* private */ var _wrapped: Any = js.native
  }
}
