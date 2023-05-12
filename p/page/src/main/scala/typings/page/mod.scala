package typings.page

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("page", JSImport.Default)
    @js.native
    val ^ : typings.page.PageJS.Static = js.native
    
    /**
      * Export Context
      */
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("page", "default.Context")
    @js.native
    open class ContextCls protected ()
      extends StObject
         with typings.page.PageJS.Context {
      /**
        * Initialize a new "request" `Context` with the given `path` and optional initial `state`.
        * @param {string} path  path
        * @param {any}    state state
        */
      def this(path: String) = this()
      def this(path: String, state: Any) = this()
    }
    
    /**
      * Expose Route
      */
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("page", "default.Route")
    @js.native
    open class RouteCls protected ()
      extends StObject
         with typings.page.PageJS.Route {
      /**
        * Initialize `Route` with the given HTTP `path` & `options`
        * @param {string}  path    path
        * @param {Options} options Options
        */
      def this(path: String) = this()
      def this(path: String, options: typings.page.PageJS.RouteOptions) = this()
    }
    
    type _To = typings.page.PageJS.Static
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: typings.page.PageJS.Static = ^
  }
  
  type Callback = typings.page.PageJS.Callback
  
  type Context = typings.page.PageJS.Context
  
  type Options = typings.page.PageJS.Options
  
  type Route = typings.page.PageJS.Route
  
  type RouteOptions = typings.page.PageJS.RouteOptions
  
  type Static = typings.page.PageJS.Static
}
