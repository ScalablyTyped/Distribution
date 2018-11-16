package typings
package parseLib.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Creates a new instance with the given models and options.  Typically, you
     * will not call this method directly, but will instead make a subclass using
     * <code>Parse.Collection.extend</code>.
     *
     * @param {Array} models An array of instances of <code>Parse.Object</code>.
     *
     * @param {Object} options An optional object with Backbone-style options.
     * Valid options are:<ul>
     *   <li>model: The Parse.Object subclass that this collection contains.
     *   <li>query: An instance of Parse.Query to use when fetching items.
     *   <li>comparator: A string property name or function to sort by.
     * </ul>
     *
     * @see Parse.Collection.extend
     *
     * @class
     *
     * <p>Provides a standard collection class for our sets of models, ordered
     * or unordered.  For more information, see the
     * <a href="http://documentcloud.github.com/backbone/#Collection">Backbone
     * documentation</a>.</p>
     */
@JSImport("parse", "Collection")
@js.native
class Collection[T] ()
  extends parseLib.nodeMod.Collection[T] {
  def this(models: js.Array[js.Object]) = this()
  def this(models: js.Array[js.Object], options: parseLib.ParseNs.CollectionNs.Options) = this()
}

/**
     * Creates a new instance with the given models and options.  Typically, you
     * will not call this method directly, but will instead make a subclass using
     * <code>Parse.Collection.extend</code>.
     *
     * @param {Array} models An array of instances of <code>Parse.Object</code>.
     *
     * @param {Object} options An optional object with Backbone-style options.
     * Valid options are:<ul>
     *   <li>model: The Parse.Object subclass that this collection contains.
     *   <li>query: An instance of Parse.Query to use when fetching items.
     *   <li>comparator: A string property name or function to sort by.
     * </ul>
     *
     * @see Parse.Collection.extend
     *
     * @class
     *
     * <p>Provides a standard collection class for our sets of models, ordered
     * or unordered.  For more information, see the
     * <a href="http://documentcloud.github.com/backbone/#Collection">Backbone
     * documentation</a>.</p>
     */
@JSImport("parse", "Collection")
@js.native
object Collection extends js.Object {
  def extend(instanceProps: js.Any, classProps: js.Any): js.Any = js.native
}

