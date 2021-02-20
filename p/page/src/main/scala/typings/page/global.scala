package typings.page

import org.scalablytyped.runtime.Shortcut
import typings.page.PageJS.RouteOptions
import typings.page.PageJS.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object page extends Shortcut {
    
    @JSGlobal("page")
    @js.native
    val ^ : Static = js.native
    
    /**
      * Export Context
      * @type {Context}
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("page.Context")
    @js.native
    class Context protected ()
      extends typings.page.PageJS.Context {
      /**
        * Initialize a new "request" `Context` with the given `path` and optional initial `state`.
        * @param {string} path  path
        * @param {any}    state state
        */
      def this(path: String) = this()
      def this(path: String, state: js.Any) = this()
    }
    
    /**
      * Expose Route
      * @type {Route}
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("page.Route")
    @js.native
    class Route protected ()
      extends typings.page.PageJS.Route {
      /**
        * Initialize `Route` with the given HTTP `path` & `options`
        * @param {string}  path    path
        * @param {Options} options Options
        */
      def this(path: String) = this()
      def this(path: String, options: RouteOptions) = this()
    }
    
    type _To = Static
    
    /* This means you don't have to write `^`, but can instead just say `page.foo` */
    override def _to: Static = ^
  }
}
