package typings.page

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.page.anon.PartialOptions
import typings.std.MouseEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageJS {
  
  type Callback = js.Function2[/* ctx */ Context, /* next */ js.Function0[Any], Any]
  
  /**
    * Routes are passed Context objects, these may be used to share state, for example ctx.user =, as well as the history "state" ctx.state that the pushState API provides.
    */
  @js.native
  trait Context
    extends StObject
       with /* idx */ StringDictionary[Any]
       with /**
    * Initialize a new "request" `Context` with the given `path` and optional initial `state`.
    * @param {string} path  path
    * @param {any}    state state
    */
  Instantiable1[/* path */ String, Context]
       with Instantiable2[/* path */ String, /* state */ Any, Context] {
    
    /**
      *  Pathname including the "base" (if any) and query string "/admin/login?foo=bar#zee".
      */
    var canonicalPath: String = js.native
    
    /**
      *  If true, marks the context as handled to prevent default 404 behaviour. For example this is useful for the routes with interminate quantity of the callbacks.
      */
    var handled: Boolean = js.native
    
    /**
      *  Hash void of leading # such as "zee", defaults to "".
      */
    var hash: String = js.native
    
    /**
      * The parameters from the url, e.g. /user/:id => Context.params.id
      */
    var params: Any = js.native
    
    /**
      *  Pathname and query string "/login?foo=bar#zee".
      */
    var path: String = js.native
    
    /**
      *  The pathname void of query string "/login".
      */
    var pathname: String = js.native
    
    /**
      * Push state
      */
    def pushState(): Unit = js.native
    
    /**
      *  Query string void of leading ? such as "foo=bar", defaults to "".
      */
    var querystring: String = js.native
    
    /**
      * Saves the context using replaceState(). For example this is useful for caching HTML or other resources that were loaded for when a user presses "back".
      */
    def save(): Unit = js.native
    
    /**
      *  The pushState state object.
      */
    var state: Any = js.native
    
    /**
      * The pushState title.
      */
    var title: String = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * bind to click events (default = true)
      */
    var click: Boolean
    
    /**
      * remove URL encoding from path components
      */
    var decodeURLComponents: Boolean
    
    /**
      * perform initial dispatch (default = true)
      */
    var dispatch: Boolean
    
    /**
      * add #!before urls (default = false)
      */
    var hashbang: Boolean
    
    /**
      * bind to popstate (default = true)
      */
    var popstate: Boolean
    
    /**
      * provide a window to control (by default it will control the main window)
      */
    var window: Window
  }
  object Options {
    
    inline def apply(
      click: Boolean,
      decodeURLComponents: Boolean,
      dispatch: Boolean,
      hashbang: Boolean,
      popstate: Boolean,
      window: Window
    ): Options = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], decodeURLComponents = decodeURLComponents.asInstanceOf[js.Any], dispatch = dispatch.asInstanceOf[js.Any], hashbang = hashbang.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClick(value: Boolean): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setDecodeURLComponents(value: Boolean): Self = StObject.set(x, "decodeURLComponents", value.asInstanceOf[js.Any])
      
      inline def setDispatch(value: Boolean): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      inline def setHashbang(value: Boolean): Self = StObject.set(x, "hashbang", value.asInstanceOf[js.Any])
      
      inline def setPopstate(value: Boolean): Self = StObject.set(x, "popstate", value.asInstanceOf[js.Any])
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Route
    extends StObject
       with /**
    * Initialize `Route` with the given HTTP `path` & `options`
    * @param {string}  path    path
    * @param {Options} options Options
    */
  Instantiable1[/* path */ String, Route]
       with Instantiable2[/* path */ String, /* options */ RouteOptions, Route] {
    
    /**
      * Check if this route matches `path`, if so populate `params`.
      * @param  {string}  path   path
      * @param  {{}}    params params
      * @return {boolean}       true if matched, false otherwise
      */
    def `match`(path: String): Boolean = js.native
    def `match`(path: String, params: js.Object): Boolean = js.native
    
    /**
      * Return route middleware with the given callback `fn()`.
      * @param {Callback} callback Callback
      */
    def middleware(fn: Callback): Callback = js.native
  }
  
  trait RouteOptions extends StObject {
    
    /**
      * enable case-sensitive routes
      */
    var sensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * enable strict matching for trailing slashes
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object RouteOptions {
    
    inline def apply(): RouteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteOptions] (val x: Self) extends AnyVal {
      
      inline def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait Static extends StObject {
    
    /**
      * Register page's popstate / click bindings. If you're doing selective binding you'll like want to pass { click: false } to specify this yourself. The following options are available:
      *
      *     - click bind to click events [true]
      *     - popstate bind to popstate[true]
      *     - dispatch perform initial dispatch[true]
      *     - hashbang add #!before urls[false]
      *
      * If you wish to load serve initial content from the server you likely will want to set dispatch to false.
      */
    def apply(): Unit = js.native
    /**
      * This is equivalent to page('*', callback) for generic "middleware".
      */
    def apply(callback: Callback): Unit = js.native
    /**
      * Setup redirect form one path to other.
      */
    def apply(fromPath: String, toPath: String): Unit = js.native
    /**
      * Register page's popstate / click bindings. If you're doing selective binding you'll like want to pass { click: false } to specify this yourself. The following options are available:
      *
      *     - click bind to click events [true]
      *     - popstate bind to popstate[true]
      *     - dispatch perform initial dispatch[true]
      *     - hashbang add #!before urls[false]
      *
      * If you wish to load serve initial content from the server you likely will want to set dispatch to false.
      */
    def apply(options: PartialOptions): Unit = js.native
    /**
      *  Navigate to the given path.
      *
      *      $('.view').click(function(e){
      *        page('/user/12')
      *        e.preventDefault()
      *      })
      */
    def apply(path: String): Unit = js.native
    /**
      *  Defines a route mapping path to the given callback(s).
      *
      *      page('/', user.list)
      *      page('/user/:id', user.load, user.show)
      *      page('/user/:id/edit', user.load, user.edit)
      *      page('*', notfound)
      *
      *  Links that are not of the same origin are disregarded and will not be dispatched.
      */
    def apply(path: String, callbacks: Callback*): Unit = js.native
    /**
      *  Defines a route mapping path to the given callback(s).
      *
      *      page('/', user.list)
      *      page('/user/:id', user.load, user.show)
      *      page('/user/:id/edit', user.load, user.edit)
      *      page('*', notfound)
      *
      *  Links that are not of the same origin are disregarded and will not be dispatched.
      */
    def apply(path: js.RegExp, callbacks: Callback*): Unit = js.native
    
    /**
      * Export Context
      */
    var Context: typings.page.PageJS.Context = js.native
    
    /**
      * Expose Route
      */
    var Route: typings.page.PageJS.Route = js.native
    
    /**
      * Get or set the base path. For example if page.js is operating within /blog/ * set the base path to "/blog".
      */
    def base(): Unit = js.native
    def base(path: String): Unit = js.native
    
    /**
      * This is the click handler used by page to handle routing when a user clicks an anchor like `<a href="/user/profile">`
      */
    def clickHandler(e: MouseEvent): Unit = js.native
    
    def create(): Static = js.native
    def create(options: PartialOptions): Static = js.native
    
    /**
      * Current path
      */
    var current: String = js.native
    
    /**
      * Equivalent to page.exit('*', callback).
      */
    def exit(callback: Callback): Unit = js.native
    /**
      * Defines an exit route mapping path to the given callback(s).
      *
      * Exit routes are called when a page changes, using the context from the previous change. For example:
      *
      *     page('/sidebar', function(ctx, next) {
      *       sidebar.open = true
      *       next()
      *     })
      *
      *     page.exit('/sidebar', function(next) {
      *       sidebar.open = false
      *       next()
      *     })
      */
    def exit(path: String, callback: Callback): Unit = js.native
    def exit(path: String, callback: Callback, moreCallbacks: js.Array[Callback]): Unit = js.native
    
    /**
      * Length of the history stack
      */
    var len: Double = js.native
    
    /**
      * Identical to page(fromPath, toPath)
      */
    def redirect(fromPath: String, toPath: String): Unit = js.native
    /**
      * Calling page.redirect with only a string as the first parameter redirects to another route.
      * Waits for the current route to push state and after replaces it with the new one leaving the browser history clean.
      *
      *      page('/default', function(){
      *        // some logic to decide which route to redirect to
      *        if(admin) {
      *          page.redirect('/admin');
      *        } else {
      *          page.redirect('/guest');
      *        }
      *      });
      *
      *      page('/default');
      *
      */
    def redirect(page: String): Unit = js.native
    
    /**
      * Replace `path` with optional `state` object.
      *
      */
    def replace(path: String): Context = js.native
    def replace(path: String, state: Any): Context = js.native
    def replace(path: String, state: Any, init: Boolean): Context = js.native
    def replace(path: String, state: Any, init: Boolean, dispatch: Boolean): Context = js.native
    def replace(path: String, state: Any, init: Unit, dispatch: Boolean): Context = js.native
    def replace(path: String, state: Unit, init: Boolean): Context = js.native
    def replace(path: String, state: Unit, init: Boolean, dispatch: Boolean): Context = js.native
    def replace(path: String, state: Unit, init: Unit, dispatch: Boolean): Context = js.native
    
    /**
      *  Navigate to the given path.
      *
      *      $('.view').click(function(e){
      *        page('/user/12')
      *        e.preventDefault()
      *      })
      *
      * Identical to page(path).
      */
    def show(path: String): Unit = js.native
    
    /**
      * Register page's popstate / click bindings. If you're doing selective binding you'll like want to pass { click: false } to specify this yourself. The following options are available:
      *
      *     - click bind to click events [true]
      *     - popstate bind to popstate[true]
      *     - dispatch perform initial dispatch[true]
      *     - hashbang add #!before urls[false]
      *
      * If you wish to load serve initial content from the server you likely will want to set dispatch to false.
      */
    def start(): Unit = js.native
    /**
      * Register page's popstate / click bindings. If you're doing selective binding you'll like want to pass { click: false } to specify this yourself. The following options are available:
      *
      *     - click bind to click events [true]
      *     - popstate bind to popstate[true]
      *     - dispatch perform initial dispatch[true]
      *     - hashbang add #!before urls[false]
      *
      * If you wish to load serve initial content from the server you likely will want to set dispatch to false.
      *
      * Identical to page([options]).
      */
    def start(options: PartialOptions): Unit = js.native
    
    /**
      * Unbind both the popstate and click handlers.
      */
    def stop(): Unit = js.native
    
    def strict(): Boolean = js.native
    /**
      * Get or set the strict path matching mode to enable.
      * If enabled /blog will not match "/blog/" and /blog/ will not match "/blog".
      */
    def strict(enable: Boolean): Unit = js.native
  }
}
