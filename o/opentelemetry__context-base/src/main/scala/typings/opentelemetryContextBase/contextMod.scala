package typings.opentelemetryContextBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("@opentelemetry/context-base/build/src/context", "Context")
  @js.native
  /**
    * Construct a new context which inherits values from an optional parent context.
    *
    * @param parentContext a context from which to inherit values
    */
  /* private */ class Context () extends StObject {
    
    /* private */ var _currentContext: js.Any = js.native
    
    /**
      * Return a new context which inherits from this context but does
      * not contain a value for the given key.
      *
      * @param key context key for which to clear a value
      */
    def deleteValue(key: js.Symbol): Context = js.native
    
    /**
      * Get a value from the context.
      *
      * @param key key which identifies a context value
      */
    def getValue(key: js.Symbol): js.Any = js.native
    
    /**
      * Create a new context which inherits from this context and has
      * the given key set to the given value.
      *
      * @param key context key for which to set the value
      * @param value value to set for the given key
      */
    def setValue(key: js.Symbol, value: js.Any): Context = js.native
  }
  /* static members */
  object Context {
    
    @JSImport("@opentelemetry/context-base/build/src/context", "Context")
    @js.native
    val ^ : js.Any = js.native
    
    /** The root context is used as the default parent context when there is no active context */
    @JSImport("@opentelemetry/context-base/build/src/context", "Context.ROOT_CONTEXT")
    @js.native
    val ROOT_CONTEXT: Context = js.native
    
    /**
      * This is another identifier to the root context which allows developers to easily search the
      * codebase for direct uses of context which need to be removed in later PRs.
      *
      * It's existence is temporary and it should be removed when all references are fixed.
      */
    @JSImport("@opentelemetry/context-base/build/src/context", "Context.TODO")
    @js.native
    val TODO: Context = js.native
    
    /** Get a key to uniquely identify a context value */
    inline def createKey(description: String): js.Symbol = ^.asInstanceOf[js.Dynamic].applyDynamic("createKey")(description.asInstanceOf[js.Any]).asInstanceOf[js.Symbol]
  }
}
