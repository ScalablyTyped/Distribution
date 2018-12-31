package typings
package parseLib.ParseNs

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
class Query[T /* <: Object */] protected () extends BaseObject {
  def this(objectClass: java.lang.String) = this()
  def this(objectClass: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]) = this()
  var className: java.lang.String = js.native
  var objectClass: js.Any = js.native
  def addAscending(key: java.lang.String): Query[T] = js.native
  def addAscending(key: js.Array[java.lang.String]): Query[T] = js.native
  def addDescending(key: java.lang.String): Query[T] = js.native
  def addDescending(key: js.Array[java.lang.String]): Query[T] = js.native
  def aggregate(pipeline: js.Array[parseLib.ParseNs.QueryNs.AggregationOptions]): Query[T] = js.native
  def aggregate(pipeline: parseLib.ParseNs.QueryNs.AggregationOptions): Query[T] = js.native
  def ascending(key: java.lang.String): Query[T] = js.native
  def ascending(key: js.Array[java.lang.String]): Query[T] = js.native
  def containedIn(key: java.lang.String, values: js.Array[_]): Query[T] = js.native
  def contains(key: java.lang.String, substring: java.lang.String): Query[T] = js.native
  def containsAll(key: java.lang.String, values: js.Array[_]): Query[T] = js.native
  def count(): js.Promise[scala.Double] = js.native
  def count(options: parseLib.ParseNs.QueryNs.CountOptions): js.Promise[scala.Double] = js.native
  def descending(key: java.lang.String): Query[T] = js.native
  def descending(key: js.Array[java.lang.String]): Query[T] = js.native
  def distinct(key: java.lang.String): Query[T] = js.native
  def doesNotExist(key: java.lang.String): Query[T] = js.native
  def doesNotMatchKeyInQuery[U /* <: Object */](key: java.lang.String, queryKey: java.lang.String, query: Query[U]): Query[T] = js.native
  def doesNotMatchQuery[U /* <: Object */](key: java.lang.String, query: Query[U]): Query[T] = js.native
  def each(callback: js.Function): js.Promise[scala.Unit] = js.native
  def each(callback: js.Function, options: parseLib.ParseNs.QueryNs.EachOptions): js.Promise[scala.Unit] = js.native
  def endsWith(key: java.lang.String, suffix: java.lang.String): Query[T] = js.native
  def equalTo(key: java.lang.String, value: js.Any): Query[T] = js.native
  def exists(key: java.lang.String): Query[T] = js.native
  def find(): js.Promise[js.Array[T]] = js.native
  def find(options: parseLib.ParseNs.QueryNs.FindOptions): js.Promise[js.Array[T]] = js.native
  def first(): js.Promise[js.UndefOr[T]] = js.native
  def first(options: parseLib.ParseNs.QueryNs.FirstOptions): js.Promise[js.UndefOr[T]] = js.native
  def fullText(key: java.lang.String, value: java.lang.String): Query[T] = js.native
  def fullText(key: java.lang.String, value: java.lang.String, options: parseLib.ParseNs.QueryNs.FullTextOptions): Query[T] = js.native
  def get(objectId: java.lang.String): js.Promise[T] = js.native
  def get(objectId: java.lang.String, options: parseLib.ParseNs.QueryNs.GetOptions): js.Promise[T] = js.native
  def greaterThan(key: java.lang.String, value: js.Any): Query[T] = js.native
  def greaterThanOrEqualTo(key: java.lang.String, value: js.Any): Query[T] = js.native
  def include(key: java.lang.String): Query[T] = js.native
  def include(keys: js.Array[java.lang.String]): Query[T] = js.native
  def lessThan(key: java.lang.String, value: js.Any): Query[T] = js.native
  def lessThanOrEqualTo(key: java.lang.String, value: js.Any): Query[T] = js.native
  def limit(n: scala.Double): Query[T] = js.native
  def matches(key: java.lang.String, regex: stdLib.RegExp, modifiers: js.Any): Query[T] = js.native
  def matchesKeyInQuery[U /* <: Object */](key: java.lang.String, queryKey: java.lang.String, query: Query[U]): Query[T] = js.native
  def matchesQuery[U /* <: Object */](key: java.lang.String, query: Query[U]): Query[T] = js.native
  def near(key: java.lang.String, point: GeoPoint): Query[T] = js.native
  def notContainedIn(key: java.lang.String, values: js.Array[_]): Query[T] = js.native
  def notEqualTo(key: java.lang.String, value: js.Any): Query[T] = js.native
  def select(keys: java.lang.String*): Query[T] = js.native
  def skip(n: scala.Double): Query[T] = js.native
  def startsWith(key: java.lang.String, prefix: java.lang.String): Query[T] = js.native
  def subscribe(): LiveQuerySubscription = js.native
  def withinGeoBox(key: java.lang.String, southwest: GeoPoint, northeast: GeoPoint): Query[T] = js.native
  def withinKilometers(key: java.lang.String, point: GeoPoint, maxDistance: scala.Double): Query[T] = js.native
  def withinMiles(key: java.lang.String, point: GeoPoint, maxDistance: scala.Double): Query[T] = js.native
  def withinRadians(key: java.lang.String, point: GeoPoint, maxDistance: scala.Double): Query[T] = js.native
}

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
object Query extends js.Object {
  def or[U /* <: parseLib.ParseNs.Object */](var_args: parseLib.ParseNs.Query[U]*): parseLib.ParseNs.Query[U] = js.native
}

