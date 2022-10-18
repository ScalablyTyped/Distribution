package typings.opentelemetryContextAsyncHooks

import typings.opentelemetryContextAsyncHooks.buildSrcAbstractAsyncHooksContextManagerMod.AbstractAsyncHooksContextManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAsyncHooksContextManagerMod {
  
  @JSImport("@opentelemetry/context-async-hooks/build/src/AsyncHooksContextManager", "AsyncHooksContextManager")
  @js.native
  open class AsyncHooksContextManager () extends AbstractAsyncHooksContextManager {
    
    /**
      * After hook is called just after completing the execution of a async context.
      */
    /* private */ var _after: Any = js.native
    
    /* private */ var _asyncHook: Any = js.native
    
    /**
      * Before hook is called just before executing a async context.
      * @param uid uid of the async context
      */
    /* private */ var _before: Any = js.native
    
    /* private */ var _contexts: Any = js.native
    
    /**
      * Destroy hook will be called when a given context is no longer used so we can
      * remove its attached context.
      * @param uid uid of the async context
      */
    /* private */ var _destroy: Any = js.native
    
    /**
      * Set the given context as active
      */
    /* private */ var _enterContext: Any = js.native
    
    /**
      * Remove the context at the root of the stack
      */
    /* private */ var _exitContext: Any = js.native
    
    /**
      * Init hook will be called when userland create a async context, setting the
      * context as the current one if it exist.
      * @param uid id of the async context
      * @param type the resource type
      */
    /* private */ var _init: Any = js.native
    
    /* private */ var _stack: Any = js.native
  }
}
