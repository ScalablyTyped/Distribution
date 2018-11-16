package typings
package pageLib.PageJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  /**
           * Export Context
           * @type {Context}
           */
  var Context: Context = js.native
  /**
           * Expose Route
           * @type {Route}
           */
  var Route: Route = js.native
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
  def apply(): scala.Unit = js.native
  /**
           * This is equivalent to page('*', callback) for generic "middleware".
           */
  def apply(callback: Callback): scala.Unit = js.native
  /**
           * Setup redirect form one path to other.
           */
  def apply(fromPath: java.lang.String, toPath: java.lang.String): scala.Unit = js.native
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
  def apply(options: stdLib.Partial[Options]): scala.Unit = js.native
  /**
           *  Navigate to the given path.
           *
           *      $('.view').click(function(e){
           *        page('/user/12')
           *        e.preventDefault()
           *      })
           */
  def apply(path: java.lang.String): scala.Unit = js.native
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
  def apply(path: java.lang.String, callbacks: Callback*): scala.Unit = js.native
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
  def apply(path: stdLib.RegExp, callbacks: Callback*): scala.Unit = js.native
  /**
           * Get or set the base path. For example if page.js is operating within /blog/ * set the base path to "/blog".
           */
  def base(): scala.Unit = js.native
  /**
           * Get or set the base path. For example if page.js is operating within /blog/ * set the base path to "/blog".
           */
  def base(path: java.lang.String): scala.Unit = js.native
  /**
           * Equivalent to page.exit('*', callback).
           */
  def exit(callback: Callback): scala.Unit = js.native
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
  def exit(path: java.lang.String, callback: Callback): scala.Unit = js.native
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
  def exit(path: java.lang.String, callback: Callback, moreCallbacks: js.Array[Callback]): scala.Unit = js.native
  /**
           * Identical to page(fromPath, toPath)
           */
  def redirect(fromPath: java.lang.String, toPath: java.lang.String): scala.Unit = js.native
  /**
           *  Calling page.redirect with only a string as the first parameter redirects to another route. Waits for the current route to push state and after replaces it with the new one leaving the browser history clean.
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
  def redirect(page: java.lang.String): scala.Unit = js.native
  /**
           * Replace `path` with optional `state` object.
           *
           */
  def replace(path: java.lang.String): Context = js.native
  /**
           * Replace `path` with optional `state` object.
           *
           */
  def replace(path: java.lang.String, state: js.Any): Context = js.native
  /**
           * Replace `path` with optional `state` object.
           *
           */
  def replace(path: java.lang.String, state: js.Any, init: scala.Boolean): Context = js.native
  /**
           * Replace `path` with optional `state` object.
           *
           */
  def replace(path: java.lang.String, state: js.Any, init: scala.Boolean, dispatch: scala.Boolean): Context = js.native
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
  def show(path: java.lang.String): scala.Unit = js.native
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
  def start(): scala.Unit = js.native
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
  def start(options: stdLib.Partial[Options]): scala.Unit = js.native
  /**
           * Unbind both the popstate and click handlers.
           */
  def stop(): scala.Unit = js.native
}

