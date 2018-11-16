package typings
package parseLib.ParseNs

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
@JSGlobal("Parse.Collection")
@js.native
class Collection[T] ()
  extends Events
     with IBaseObject {
  def this(models: js.Array[js.Object]) = this()
  def this(models: js.Array[js.Object], options: parseLib.ParseNs.CollectionNs.Options) = this()
  var model: js.Object = js.native
  var models: js.Array[js.Object] = js.native
  var query: Query[js.Object] = js.native
  def add(models: js.Array[_]): Collection[T] = js.native
  def add(models: js.Array[_], options: parseLib.ParseNs.CollectionNs.AddOptions): Collection[T] = js.native
  def at(index: scala.Double): js.Object = js.native
  def chain(): underscoreLib.underscoreMod.underscoreNs._Chain[Collection[T]] = js.native
  def comparator(`object`: js.Object): js.Any = js.native
  def create(model: js.Object): js.Object = js.native
  def create(model: js.Object, options: parseLib.ParseNs.CollectionNs.CreateOptions): js.Object = js.native
  def fetch(): Promise[T] = js.native
  def fetch(options: parseLib.ParseNs.CollectionNs.FetchOptions): Promise[T] = js.native
  def get(id: java.lang.String): js.Object = js.native
  def getByCid(cid: js.Any): js.Any = js.native
  def initialize(): scala.Unit = js.native
  def pluck(attr: java.lang.String): js.Array[_] = js.native
  def remove(model: js.Any): Collection[T] = js.native
  def remove(model: js.Any, options: parseLib.ParseNs.CollectionNs.RemoveOptions): Collection[T] = js.native
  def remove(models: js.Array[_]): Collection[T] = js.native
  def remove(models: js.Array[_], options: parseLib.ParseNs.CollectionNs.RemoveOptions): Collection[T] = js.native
  def reset(models: js.Array[_]): Collection[T] = js.native
  def reset(models: js.Array[_], options: parseLib.ParseNs.CollectionNs.ResetOptions): Collection[T] = js.native
  def sort(): Collection[T] = js.native
  def sort(options: parseLib.ParseNs.CollectionNs.SortOptions): Collection[T] = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
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
@JSGlobal("Parse.Collection")
@js.native
object Collection extends js.Object {
  def extend(instanceProps: js.Any, classProps: js.Any): js.Any = js.native
}

