package typings.page.PageJSNs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route
  extends /**
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

