package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Routers map faux-URLs to actions, and fire events when routes are
     * matched. Creating a new one sets its `routes` hash, if not set statically.
     * @class
     *
     * <p>A fork of Backbone.Router, provided for your convenience.
     * For more information, see the
     * <a href="http://documentcloud.github.com/backbone/#Router">Backbone
     * documentation</a>.</p>
     * <p><strong><em>Available in the client SDK only.</em></strong></p>
     */
@JSGlobal("Parse.Router")
@js.native
class Router () extends Events {
  def this(options: parseLib.ParseNs.RouterNs.Options) = this()
  var routes: parseLib.ParseNs.RouterNs.RouteMap = js.native
  def initialize(): scala.Unit = js.native
  def navigate(fragment: java.lang.String): Router = js.native
  def navigate(fragment: java.lang.String, options: parseLib.ParseNs.RouterNs.NavigateOptions): Router = js.native
  def navigate(fragment: java.lang.String, trigger: scala.Boolean): Router = js.native
  def route(route: java.lang.String, name: java.lang.String, callback: js.Function): Router = js.native
}

/**
     * Routers map faux-URLs to actions, and fire events when routes are
     * matched. Creating a new one sets its `routes` hash, if not set statically.
     * @class
     *
     * <p>A fork of Backbone.Router, provided for your convenience.
     * For more information, see the
     * <a href="http://documentcloud.github.com/backbone/#Router">Backbone
     * documentation</a>.</p>
     * <p><strong><em>Available in the client SDK only.</em></strong></p>
     */
@JSGlobal("Parse.Router")
@js.native
object Router extends js.Object {
  def extend(instanceProps: js.Any, classProps: js.Any): js.Any = js.native
}

