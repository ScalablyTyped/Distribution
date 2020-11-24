package typings.opentelemetryContextBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/context-base", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  /**
    * Construct a new context which inherits values from an optional parent context.
    *
    * @param parentContext a context from which to inherit values
    */
  class Context protected ()
    extends typings.opentelemetryContextBase.contextMod.Context
  /* static members */
  @js.native
  object Context extends js.Object {
    
    /** The root context is used as the default parent context when there is no active context */
    val ROOT_CONTEXT: typings.opentelemetryContextBase.contextMod.Context = js.native
    
    /**
      * This is another identifier to the root context which allows developers to easily search the
      * codebase for direct uses of context which need to be removed in later PRs.
      *
      * It's existence is temporary and it should be removed when all references are fixed.
      */
    val TODO: typings.opentelemetryContextBase.contextMod.Context = js.native
    
    /** Get a key to uniquely identify a context value */
    def createKey(description: String): js.Symbol = js.native
  }
  
  @js.native
  class NoopContextManager ()
    extends typings.opentelemetryContextBase.noopContextManagerMod.NoopContextManager
}
