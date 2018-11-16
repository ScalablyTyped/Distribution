package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * History serves as a global router (per frame) to handle hashchange
     * events or pushState, match the appropriate route, and trigger
     * callbacks. You shouldn't ever have to create one of these yourself
     * — you should use the reference to <code>Parse.history</code>
     * that will be created for you automatically if you make use of
     * Routers with routes.
     * @class
     *
     * <p>A fork of Backbone.History, provided for your convenience.  If you
     * use this class, you must also include jQuery, or another library
     * that provides a jQuery-compatible $ function.  For more information,
     * see the <a href="http://documentcloud.github.com/backbone/#History">
     * Backbone documentation</a>.</p>
     * <p><strong><em>Available in the client SDK only.</em></strong></p>
     */
@JSGlobal("Parse.History")
@js.native
class History () extends js.Object {
  var fragment: java.lang.String = js.native
  var handlers: js.Array[_] = js.native
  var interval: scala.Double = js.native
  def checkUrl(): scala.Unit = js.native
  def checkUrl(e: js.Any): scala.Unit = js.native
  def getFragment(): java.lang.String = js.native
  def getFragment(fragment: java.lang.String): java.lang.String = js.native
  def getFragment(fragment: java.lang.String, forcePushState: scala.Boolean): java.lang.String = js.native
  def getHash(windowOverride: stdLib.Window): java.lang.String = js.native
  def loadUrl(fragmentOverride: js.Any): scala.Boolean = js.native
  def navigate(fragment: java.lang.String): js.Any = js.native
  def navigate(fragment: java.lang.String, options: js.Any): js.Any = js.native
  def route(route: js.Any, callback: js.Function): scala.Unit = js.native
  def start(options: js.Any): scala.Boolean = js.native
  def stop(): scala.Unit = js.native
}

