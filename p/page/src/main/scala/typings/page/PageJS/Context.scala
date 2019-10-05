package typings.page.PageJS

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Routes are passed Context objects, these may be used to share state, for example ctx.user =, as well as the history "state" ctx.state that the pushState API provides.
  */
@js.native
trait Context
  extends /* idx */ StringDictionary[js.Any]
     with /**
  * Initialize a new "request" `Context` with the given `path` and optional initial `state`.
  * @param {string} path  path
  * @param {any}    state state
  */
Instantiable1[/* path */ String, Context]
     with Instantiable2[/* path */ String, /* state */ js.Any, Context] {
  /**
    *  Pathname including the "base" (if any) and query string "/admin/login?foo=bar".
    */
  var canonicalPath: String = js.native
  /**
    *  If true, marks the context as handled to prevent default 404 behaviour. For example this is useful for the routes with interminate quantity of the callbacks.
    */
  var handled: Boolean = js.native
  /**
    * The parameters from the url, e.g. /user/:id => Context.params.id
    */
  var params: js.Any = js.native
  /**
    *  Pathname and query string "/login?foo=bar".
    */
  var path: String = js.native
  /**
    *  The pathname void of query string "/login".
    */
  var pathname: String = js.native
  /**
    *  Query string void of leading ? such as "foo=bar", defaults to "".
    */
  var querystring: String = js.native
  /**
    *  The pushState state object.
    */
  var state: js.Any = js.native
  /**
    * The pushState title.
    */
  var title: String = js.native
  /**
    * Push state
    */
  def pushState(): Unit = js.native
  /**
    * Saves the context using replaceState(). For example this is useful for caching HTML or other resources that were loaded for when a user presses "back".
    */
  def save(): Unit = js.native
}

