package typings
package pageLib.PageJSNs

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
ScalablyTyped.runtime.Instantiable1[/* path */ java.lang.String, Route]
     with /**
         * Initialize `Route` with the given HTTP `path` & `options`
         * @param {string}  path    path
         * @param {Options} options Options
         */
ScalablyTyped.runtime.Instantiable2[/* path */ java.lang.String, /* options */ RouteOptions, Route] {
  /**
           * Check if this route matches `path`, if so populate `params`.
           * @param  {string}  path   path
           * @param  {{}}    params params
           * @return {boolean}       true if matched, false otherwise
           */
  def `match`(path: java.lang.String): scala.Boolean = js.native
  /**
           * Check if this route matches `path`, if so populate `params`.
           * @param  {string}  path   path
           * @param  {{}}    params params
           * @return {boolean}       true if matched, false otherwise
           */
  def `match`(path: java.lang.String, params: js.Object): scala.Boolean = js.native
  /**
           * Return route middleware with the given callback `fn()`.
           * @param {Callback} callback Callback
           */
  def middleware(fn: Callback): Callback = js.native
}

