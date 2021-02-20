package typings.opentelemetryContextBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/context-base", "Context")
  @js.native
  /**
    * Construct a new context which inherits values from an optional parent context.
    *
    * @param parentContext a context from which to inherit values
    */
  class Context protected ()
    extends typings.opentelemetryContextBase.contextMod.Context
  /* static members */
  object Context {
    
    /** The root context is used as the default parent context when there is no active context */
    @JSImport("@opentelemetry/context-base", "Context.ROOT_CONTEXT")
    @js.native
    val ROOT_CONTEXT: typings.opentelemetryContextBase.contextMod.Context = js.native
    
    /**
      * This is another identifier to the root context which allows developers to easily search the
      * codebase for direct uses of context which need to be removed in later PRs.
      *
      * It's existence is temporary and it should be removed when all references are fixed.
      */
    @JSImport("@opentelemetry/context-base", "Context.TODO")
    @js.native
    val TODO: typings.opentelemetryContextBase.contextMod.Context = js.native
    
    /** Get a key to uniquely identify a context value */
    @JSImport("@opentelemetry/context-base", "Context.createKey")
    @js.native
    def createKey(description: String): js.Symbol = js.native
  }
  
  @JSImport("@opentelemetry/context-base", "NoopContextManager")
  @js.native
  class NoopContextManager ()
    extends typings.opentelemetryContextBase.noopContextManagerMod.NoopContextManager
}
