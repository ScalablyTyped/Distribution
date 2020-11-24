package typings.opentelemetryContextBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/context-base/build/src/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  
  @js.native
  /**
    * Construct a new context which inherits values from an optional parent context.
    *
    * @param parentContext a context from which to inherit values
    */
  class Context protected () extends js.Object {
    
    var _currentContext: js.Any = js.native
    
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
  @js.native
  object Context extends js.Object {
    
    /** The root context is used as the default parent context when there is no active context */
    val ROOT_CONTEXT: Context = js.native
    
    /**
      * This is another identifier to the root context which allows developers to easily search the
      * codebase for direct uses of context which need to be removed in later PRs.
      *
      * It's existence is temporary and it should be removed when all references are fixed.
      */
    val TODO: Context = js.native
    
    /** Get a key to uniquely identify a context value */
    def createKey(description: String): js.Symbol = js.native
  }
}
