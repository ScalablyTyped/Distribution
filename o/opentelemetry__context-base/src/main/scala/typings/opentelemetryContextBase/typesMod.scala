package typings.opentelemetryContextBase

import typings.opentelemetryContextBase.contextMod.Context
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ContextManager extends StObject {
    
    /**
      * Get the current active context
      */
    def active(): Context = js.native
    
    /**
      * Bind an object as the current context (or a specific one)
      * @param target Any object to which a context need to be set
      * @param [context] Optionally specify the context which you want to assign
      */
    def bind[T](target: T): T = js.native
    def bind[T](target: T, context: Context): T = js.native
    
    /**
      * Disable context management
      */
    def disable(): this.type = js.native
    
    /**
      * Enable context management
      */
    def enable(): this.type = js.native
    
    /**
      * Run the fn callback with object set as the current active context
      * @param context Any object to set as the current active context
      * @param fn A callback to be immediately run within a specific context
      */
    def `with`[T /* <: js.Function1[/* repeated */ js.Any, ReturnType[T]] */](context: Context, fn: T): ReturnType[T] = js.native
  }
}
