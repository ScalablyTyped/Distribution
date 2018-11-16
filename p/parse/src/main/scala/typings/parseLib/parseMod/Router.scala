package typings
package parseLib.parseMod

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
@JSImport("parse", "Router")
@js.native
class Router ()
  extends parseLib.nodeMod.Router {
  def this(options: parseLib.ParseNs.RouterNs.Options) = this()
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
@JSImport("parse", "Router")
@js.native
object Router extends js.Object {
  def extend(instanceProps: js.Any, classProps: js.Any): js.Any = js.native
}

