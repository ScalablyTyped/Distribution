package typings.parse.Parse

import org.scalablytyped.runtime.Instantiable1
import typings.parse.Parse.Query.AggregationOptions
import typings.parse.Parse.Query.CountOptions
import typings.parse.Parse.Query.EachOptions
import typings.parse.Parse.Query.FindOptions
import typings.parse.Parse.Query.FirstOptions
import typings.parse.Parse.Query.FullTextOptions
import typings.parse.Parse.Query.GetOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new parse Parse.Query for the given Parse.Object subclass.
  * @param objectClass -
  *   An instance of a subclass of Parse.Object, or a Parse className string.
  * @class
  *
  * <p>Parse.Query defines a query that is used to fetch Parse.Objects. The
  * most common use case is finding all objects that match a query through the
  * <code>find</code> method. For example, this sample code fetches all objects
  * of class <code>MyClass</code>. It calls a different function depending on
  * whether the fetch succeeded or not.
  *
  * <pre>
  * var query = new Parse.Query(MyClass);
  * query.find({
  *   success: function(results) {
  *     // results is an array of Parse.Object.
  *   },
  *
  *   error: function(error) {
  *     // error is an instance of Parse.Error.
  *   }
  * });</pre></p>
  *
  * <p>A Parse.Query can also be used to retrieve a single object whose id is
  * known, through the get method. For example, this sample code fetches an
  * object of class <code>MyClass</code> and id <code>myId</code>. It calls a
  * different function depending on whether the fetch succeeded or not.
  *
  * <pre>
  * var query = new Parse.Query(MyClass);
  * query.get(myId, {
  *   success: function(object) {
  *     // object is an instance of Parse.Object.
  *   },
  *
  *   error: function(object, error) {
  *     // error is an instance of Parse.Error.
  *   }
  * });</pre></p>
  *
  * <p>A Parse.Query can also be used to count the number of objects that match
  * the query without retrieving all of those objects. For example, this
  * sample code counts the number of objects of the class <code>MyClass</code>
  * <pre>
  * var query = new Parse.Query(MyClass);
  * query.count({
  *   success: function(number) {
  *     // There are number instances of MyClass.
  *   },
  *
  *   error: function(error) {
  *     // error is an instance of Parse.Error.
  *   }
  * });</pre></p>
  */
@JSGlobal("Parse.Query")
@js.native
class Query_[T /* <: Object */] protected () extends BaseObject {
  def this(objectClass: String) = this()
  def this(objectClass: Instantiable1[/* args (repeated) */ js.Any, T]) = this()
  var className: String = js.native
  var objectClass: js.Any = js.native
  def addAscending(key: String): Query[T] = js.native
  def addAscending(key: js.Array[String]): Query[T] = js.native
  def addDescending(key: String): Query[T] = js.native
  def addDescending(key: js.Array[String]): Query[T] = js.native
  def aggregate[V](pipeline: js.Array[AggregationOptions]): js.Promise[V] = js.native
  def aggregate[V](pipeline: AggregationOptions): js.Promise[V] = js.native
  def ascending(key: String): Query[T] = js.native
  def ascending(key: js.Array[String]): Query[T] = js.native
  def containedBy(key: String, values: js.Array[_]): Query[T] = js.native
  def containedIn(key: String, values: js.Array[_]): Query[T] = js.native
  def contains(key: String, substring: String): Query[T] = js.native
  def containsAll(key: String, values: js.Array[_]): Query[T] = js.native
  def containsAllStartingWith(key: String, values: js.Array[_]): Query[T] = js.native
  def count(): js.Promise[Double] = js.native
  def count(options: CountOptions): js.Promise[Double] = js.native
  def descending(key: String): Query[T] = js.native
  def descending(key: js.Array[String]): Query[T] = js.native
  def distinct[V](key: String): js.Promise[V] = js.native
  def doesNotExist(key: String): Query[T] = js.native
  def doesNotMatchKeyInQuery[U /* <: Object */](key: String, queryKey: String, query: Query[U]): Query[T] = js.native
  def doesNotMatchQuery[U /* <: Object */](key: String, query: Query[U]): Query[T] = js.native
  def each(callback: js.Function): js.Promise[Unit] = js.native
  def each(callback: js.Function, options: EachOptions): js.Promise[Unit] = js.native
  def endsWith(key: String, suffix: String): Query[T] = js.native
  def equalTo(key: String, value: js.Any): Query[T] = js.native
  def exists(key: String): Query[T] = js.native
  def find(): js.Promise[js.Array[T]] = js.native
  def find(options: FindOptions): js.Promise[js.Array[T]] = js.native
  def first(): js.Promise[js.UndefOr[T]] = js.native
  def first(options: FirstOptions): js.Promise[js.UndefOr[T]] = js.native
  def fromLocalDatastore(): Unit = js.native
  def fromPin(): Unit = js.native
  def fromPinWithName(name: String): Unit = js.native
  def fullText(key: String, value: String): Query[T] = js.native
  def fullText(key: String, value: String, options: FullTextOptions): Query[T] = js.native
  def get(objectId: String): js.Promise[T] = js.native
  def get(objectId: String, options: GetOptions): js.Promise[T] = js.native
  def greaterThan(key: String, value: js.Any): Query[T] = js.native
  def greaterThanOrEqualTo(key: String, value: js.Any): Query[T] = js.native
  def include(key: String): Query[T] = js.native
  def include(keys: js.Array[String]): Query[T] = js.native
  def includeAll(): Query[T] = js.native
  def lessThan(key: String, value: js.Any): Query[T] = js.native
  def lessThanOrEqualTo(key: String, value: js.Any): Query[T] = js.native
  def limit(n: Double): Query[T] = js.native
  def matches(key: String, regex: RegExp, modifiers: js.Any): Query[T] = js.native
  def matchesKeyInQuery[U /* <: Object */](key: String, queryKey: String, query: Query[U]): Query[T] = js.native
  def matchesQuery[U /* <: Object */](key: String, query: Query[U]): Query[T] = js.native
  def near(key: String, point: GeoPoint): Query[T] = js.native
  def notContainedIn(key: String, values: js.Array[_]): Query[T] = js.native
  def notEqualTo(key: String, value: js.Any): Query[T] = js.native
  def polygonContains(key: String, point: GeoPoint): Query[T] = js.native
  def select(keys: String*): Query[T] = js.native
  def skip(n: Double): Query[T] = js.native
  def sortByTextScore(): this.type = js.native
  def startsWith(key: String, prefix: String): Query[T] = js.native
  def subscribe(): js.Promise[LiveQuerySubscription] = js.native
  def withJSON(json: js.Any): this.type = js.native
  def withinGeoBox(key: String, southwest: GeoPoint, northeast: GeoPoint): Query[T] = js.native
  def withinKilometers(key: String, point: GeoPoint, maxDistance: Double): Query[T] = js.native
  def withinMiles(key: String, point: GeoPoint, maxDistance: Double): Query[T] = js.native
  def withinPolygon(key: String, points: js.Array[GeoPoint]): Query[T] = js.native
  def withinRadians(key: String, point: GeoPoint, maxDistance: Double): Query[T] = js.native
}

