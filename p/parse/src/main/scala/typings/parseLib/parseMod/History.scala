package typings
package parseLib.parseMod

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
@JSImport("parse", "History")
@js.native
class History ()
  extends parseLib.nodeMod.History

