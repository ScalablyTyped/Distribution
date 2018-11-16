package typings
package parseLib.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Creating a Parse.View creates its initial element outside of the DOM,
     * if an existing element is not provided...
     * @class
     *
     * <p>A fork of Backbone.View, provided for your convenience.  If you use this
     * class, you must also include jQuery, or another library that provides a
     * jQuery-compatible $ function.  For more information, see the
     * <a href="http://documentcloud.github.com/backbone/#View">Backbone
     * documentation</a>.</p>
     * <p><strong><em>Available in the client SDK only.</em></strong></p>
     */
@JSImport("parse", "View")
@js.native
class View[T] ()
  extends parseLib.nodeMod.View[T] {
  def this(options: parseLib.ParseNs.ViewNs.Options) = this()
}

/**
     * Creating a Parse.View creates its initial element outside of the DOM,
     * if an existing element is not provided...
     * @class
     *
     * <p>A fork of Backbone.View, provided for your convenience.  If you use this
     * class, you must also include jQuery, or another library that provides a
     * jQuery-compatible $ function.  For more information, see the
     * <a href="http://documentcloud.github.com/backbone/#View">Backbone
     * documentation</a>.</p>
     * <p><strong><em>Available in the client SDK only.</em></strong></p>
     */
@JSImport("parse", "View")
@js.native
object View extends js.Object {
  def extend(properties: js.Any): js.Any = js.native
  def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
}

