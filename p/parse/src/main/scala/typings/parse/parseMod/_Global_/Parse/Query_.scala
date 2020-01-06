package typings.parse.parseMod._Global_.Parse

import org.scalablytyped.runtime.Instantiable1
import typings.parse.parseMod._Global_.Parse.Query.AggregationOptions
import typings.parse.parseMod._Global_.Parse.Query.CountOptions
import typings.parse.parseMod._Global_.Parse.Query.EachOptions
import typings.parse.parseMod._Global_.Parse.Query.FindOptions
import typings.parse.parseMod._Global_.Parse.Query.FirstOptions
import typings.parse.parseMod._Global_.Parse.Query.FullTextOptions
import typings.parse.parseMod._Global_.Parse.Query.GetOptions
import typings.parse.parseStrings.createdAt
import typings.parse.parseStrings.objectId
import typings.parse.parseStrings.updatedAt
import typings.std.Extract
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new parse Parse.Query for the given Parse.Object subclass.
  * @param objectClass -
  *   An instance of a subclass of Parse.Object, or a Parse className string.
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
class Query_[T /* <: Object[Attributes] */] protected () extends js.Object {
  def this(objectClass: String) = this()
  def this(objectClass: Instantiable1[/* args (repeated) */ js.Any, T | Object[Attributes]]) = this()
  var className: String = js.native
  var objectClass: js.Any = js.native
  def addAscending[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K): this.type = js.native
  def addAscending[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: js.Array[K]): this.type = js.native
  @JSName("addAscending")
  def addAscending_createdAt(key: js.Array[createdAt]): this.type = js.native
  @JSName("addAscending")
  def addAscending_createdAt(key: createdAt): this.type = js.native
  @JSName("addAscending")
  def addAscending_objectId(key: js.Array[objectId]): this.type = js.native
  @JSName("addAscending")
  def addAscending_objectId(key: objectId): this.type = js.native
  @JSName("addAscending")
  def addAscending_updatedAt(key: js.Array[updatedAt]): this.type = js.native
  @JSName("addAscending")
  def addAscending_updatedAt(key: updatedAt): this.type = js.native
  def addDescending[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K): this.type = js.native
  def addDescending[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: js.Array[K]): this.type = js.native
  @JSName("addDescending")
  def addDescending_createdAt(key: js.Array[createdAt]): this.type = js.native
  @JSName("addDescending")
  def addDescending_createdAt(key: createdAt): this.type = js.native
  @JSName("addDescending")
  def addDescending_objectId(key: js.Array[objectId]): this.type = js.native
  @JSName("addDescending")
  def addDescending_objectId(key: objectId): this.type = js.native
  @JSName("addDescending")
  def addDescending_updatedAt(key: js.Array[updatedAt]): this.type = js.native
  @JSName("addDescending")
  def addDescending_updatedAt(key: updatedAt): this.type = js.native
  def aggregate[V](pipeline: js.Array[AggregationOptions]): js.Promise[V] = js.native
  def aggregate[V](pipeline: AggregationOptions): js.Promise[V] = js.native
  def ascending[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K): this.type = js.native
  def ascending[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: js.Array[K]): this.type = js.native
  @JSName("ascending")
  def ascending_createdAt(key: js.Array[createdAt]): this.type = js.native
  @JSName("ascending")
  def ascending_createdAt(key: createdAt): this.type = js.native
  @JSName("ascending")
  def ascending_objectId(key: js.Array[objectId]): this.type = js.native
  @JSName("ascending")
  def ascending_objectId(key: objectId): this.type = js.native
  @JSName("ascending")
  def ascending_updatedAt(key: js.Array[updatedAt]): this.type = js.native
  @JSName("ascending")
  def ascending_updatedAt(key: updatedAt): this.type = js.native
  def containedBy(
    key: createdAt,
    values: js.Array[
      (/* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['createdAt'] */ js.Any) | String
    ]
  ): this.type = js.native
  def containedBy(
    key: objectId,
    values: js.Array[
      (/* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['objectId'] */ js.Any) | String
    ]
  ): this.type = js.native
  def containedBy(
    key: updatedAt,
    values: js.Array[
      (/* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['updatedAt'] */ js.Any) | String
    ]
  ): this.type = js.native
  @JSName("containedBy")
  def containedBy_attributes[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](
    key: K,
    values: js.Array[
      (/* import warning: importer.ImportType#apply Failed type conversion: T['attributes'][K] */ js.Any) | String
    ]
  ): this.type = js.native
  def containedIn(
    key: createdAt,
    values: js.Array[
      (/* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['createdAt'] */ js.Any) | String
    ]
  ): this.type = js.native
  def containedIn(
    key: objectId,
    values: js.Array[
      (/* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['objectId'] */ js.Any) | String
    ]
  ): this.type = js.native
  def containedIn(
    key: updatedAt,
    values: js.Array[
      (/* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['updatedAt'] */ js.Any) | String
    ]
  ): this.type = js.native
  @JSName("containedIn")
  def containedIn_attributes[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](
    key: K,
    values: js.Array[
      (/* import warning: importer.ImportType#apply Failed type conversion: T['attributes'][K] */ js.Any) | String
    ]
  ): this.type = js.native
  def contains[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, substring: String): this.type = js.native
  def containsAll[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, values: js.Array[_]): this.type = js.native
  def containsAllStartingWith[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, values: js.Array[_]): this.type = js.native
  @JSName("containsAllStartingWith")
  def containsAllStartingWith_createdAt(key: createdAt, values: js.Array[_]): this.type = js.native
  @JSName("containsAllStartingWith")
  def containsAllStartingWith_objectId(key: objectId, values: js.Array[_]): this.type = js.native
  @JSName("containsAllStartingWith")
  def containsAllStartingWith_updatedAt(key: updatedAt, values: js.Array[_]): this.type = js.native
  @JSName("containsAll")
  def containsAll_createdAt(key: createdAt, values: js.Array[_]): this.type = js.native
  @JSName("containsAll")
  def containsAll_objectId(key: objectId, values: js.Array[_]): this.type = js.native
  @JSName("containsAll")
  def containsAll_updatedAt(key: updatedAt, values: js.Array[_]): this.type = js.native
  @JSName("contains")
  def contains_createdAt(key: createdAt, substring: String): this.type = js.native
  @JSName("contains")
  def contains_objectId(key: objectId, substring: String): this.type = js.native
  @JSName("contains")
  def contains_updatedAt(key: updatedAt, substring: String): this.type = js.native
  def count(): js.Promise[Double] = js.native
  def count(options: CountOptions): js.Promise[Double] = js.native
  def descending[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K): this.type = js.native
  def descending[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: js.Array[K]): this.type = js.native
  @JSName("descending")
  def descending_createdAt(key: js.Array[createdAt]): this.type = js.native
  @JSName("descending")
  def descending_createdAt(key: createdAt): this.type = js.native
  @JSName("descending")
  def descending_objectId(key: js.Array[objectId]): this.type = js.native
  @JSName("descending")
  def descending_objectId(key: objectId): this.type = js.native
  @JSName("descending")
  def descending_updatedAt(key: js.Array[updatedAt]): this.type = js.native
  @JSName("descending")
  def descending_updatedAt(key: updatedAt): this.type = js.native
  def distinct[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */, V](key: K): js.Promise[V] = js.native
  def doesNotExist[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K): this.type = js.native
  @JSName("doesNotExist")
  def doesNotExist_createdAt(key: createdAt): this.type = js.native
  @JSName("doesNotExist")
  def doesNotExist_objectId(key: objectId): this.type = js.native
  @JSName("doesNotExist")
  def doesNotExist_updatedAt(key: updatedAt): this.type = js.native
  def doesNotMatchKeyInQuery[U /* <: Object[Attributes] */, K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */, X /* <: Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof U['attributes'] */ js.Any, 
    String
  ] */](key: K, queryKey: X, query: Query[U]): this.type = js.native
  def doesNotMatchQuery[U /* <: Object[Attributes] */, K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, query: Query[U]): this.type = js.native
  def each(callback: js.Function): js.Promise[Unit] = js.native
  def each(callback: js.Function, options: EachOptions): js.Promise[Unit] = js.native
  def endsWith[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, suffix: String): this.type = js.native
  @JSName("endsWith")
  def endsWith_createdAt(key: createdAt, suffix: String): this.type = js.native
  @JSName("endsWith")
  def endsWith_objectId(key: objectId, suffix: String): this.type = js.native
  @JSName("endsWith")
  def endsWith_updatedAt(key: updatedAt, suffix: String): this.type = js.native
  def equalTo(
    key: createdAt,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['createdAt'] */ js.Any
  ): this.type = js.native
  def equalTo(key: createdAt, value: Pointer): this.type = js.native
  def equalTo(
    key: objectId,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['objectId'] */ js.Any
  ): this.type = js.native
  def equalTo(key: objectId, value: Pointer): this.type = js.native
  def equalTo(
    key: updatedAt,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['updatedAt'] */ js.Any
  ): this.type = js.native
  def equalTo(key: updatedAt, value: Pointer): this.type = js.native
  @JSName("equalTo")
  def equalTo_attributes[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes'][K] */ js.Any
  ): this.type = js.native
  @JSName("equalTo")
  def equalTo_attributes[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, value: Pointer): this.type = js.native
  def exists[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K): this.type = js.native
  @JSName("exists")
  def exists_createdAt(key: createdAt): this.type = js.native
  @JSName("exists")
  def exists_objectId(key: objectId): this.type = js.native
  @JSName("exists")
  def exists_updatedAt(key: updatedAt): this.type = js.native
  def find(): js.Promise[js.Array[T]] = js.native
  def find(options: FindOptions): js.Promise[js.Array[T]] = js.native
  def first(): js.Promise[js.UndefOr[T]] = js.native
  def first(options: FirstOptions): js.Promise[js.UndefOr[T]] = js.native
  def fromLocalDatastore(): Unit = js.native
  def fromPin(): Unit = js.native
  def fromPinWithName(name: String): Unit = js.native
  def fullText[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, value: String): this.type = js.native
  def fullText[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, value: String, options: FullTextOptions): this.type = js.native
  @JSName("fullText")
  def fullText_createdAt(key: createdAt, value: String): this.type = js.native
  @JSName("fullText")
  def fullText_createdAt(key: createdAt, value: String, options: FullTextOptions): this.type = js.native
  @JSName("fullText")
  def fullText_objectId(key: objectId, value: String): this.type = js.native
  @JSName("fullText")
  def fullText_objectId(key: objectId, value: String, options: FullTextOptions): this.type = js.native
  @JSName("fullText")
  def fullText_updatedAt(key: updatedAt, value: String): this.type = js.native
  @JSName("fullText")
  def fullText_updatedAt(key: updatedAt, value: String, options: FullTextOptions): this.type = js.native
  def get(objectId: String): js.Promise[T] = js.native
  def get(objectId: String, options: GetOptions): js.Promise[T] = js.native
  def greaterThan(
    key: createdAt,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['createdAt'] */ js.Any
  ): this.type = js.native
  def greaterThan(
    key: objectId,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['objectId'] */ js.Any
  ): this.type = js.native
  def greaterThan(
    key: updatedAt,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['updatedAt'] */ js.Any
  ): this.type = js.native
  def greaterThanOrEqualTo(
    key: createdAt,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['createdAt'] */ js.Any
  ): this.type = js.native
  def greaterThanOrEqualTo(
    key: objectId,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['objectId'] */ js.Any
  ): this.type = js.native
  def greaterThanOrEqualTo(
    key: updatedAt,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['updatedAt'] */ js.Any
  ): this.type = js.native
  @JSName("greaterThanOrEqualTo")
  def greaterThanOrEqualTo_attributes[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes'][K] */ js.Any
  ): this.type = js.native
  @JSName("greaterThan")
  def greaterThan_attributes[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes'][K] */ js.Any
  ): this.type = js.native
  def include[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K): this.type = js.native
  def include[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: js.Array[K]): this.type = js.native
  def includeAll(): Query[T] = js.native
  @JSName("include")
  def include_createdAt(key: js.Array[createdAt]): this.type = js.native
  @JSName("include")
  def include_createdAt(key: createdAt): this.type = js.native
  @JSName("include")
  def include_objectId(key: js.Array[objectId]): this.type = js.native
  @JSName("include")
  def include_objectId(key: objectId): this.type = js.native
  @JSName("include")
  def include_updatedAt(key: js.Array[updatedAt]): this.type = js.native
  @JSName("include")
  def include_updatedAt(key: updatedAt): this.type = js.native
  def lessThan(
    key: createdAt,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['createdAt'] */ js.Any
  ): this.type = js.native
  def lessThan(
    key: objectId,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['objectId'] */ js.Any
  ): this.type = js.native
  def lessThan(
    key: updatedAt,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['updatedAt'] */ js.Any
  ): this.type = js.native
  def lessThanOrEqualTo(
    key: createdAt,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['createdAt'] */ js.Any
  ): this.type = js.native
  def lessThanOrEqualTo(
    key: objectId,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['objectId'] */ js.Any
  ): this.type = js.native
  def lessThanOrEqualTo(
    key: updatedAt,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['updatedAt'] */ js.Any
  ): this.type = js.native
  @JSName("lessThanOrEqualTo")
  def lessThanOrEqualTo_attributes[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes'][K] */ js.Any
  ): this.type = js.native
  @JSName("lessThan")
  def lessThan_attributes[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes'][K] */ js.Any
  ): this.type = js.native
  def limit(n: Double): Query[T] = js.native
  def matches[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, regex: RegExp): this.type = js.native
  def matches[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, regex: RegExp, modifiers: String): this.type = js.native
  def matchesKeyInQuery[U /* <: Object[Attributes] */, K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */, X /* <: Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof U['attributes'] */ js.Any, 
    String
  ] */](key: K, queryKey: X, query: Query[U]): this.type = js.native
  def matchesQuery[U /* <: Object[Attributes] */, K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, query: Query[U]): this.type = js.native
  @JSName("matches")
  def matches_createdAt(key: createdAt, regex: RegExp): this.type = js.native
  @JSName("matches")
  def matches_createdAt(key: createdAt, regex: RegExp, modifiers: String): this.type = js.native
  @JSName("matches")
  def matches_objectId(key: objectId, regex: RegExp): this.type = js.native
  @JSName("matches")
  def matches_objectId(key: objectId, regex: RegExp, modifiers: String): this.type = js.native
  @JSName("matches")
  def matches_updatedAt(key: updatedAt, regex: RegExp): this.type = js.native
  @JSName("matches")
  def matches_updatedAt(key: updatedAt, regex: RegExp, modifiers: String): this.type = js.native
  def near[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, point: GeoPoint): this.type = js.native
  @JSName("near")
  def near_createdAt(key: createdAt, point: GeoPoint): this.type = js.native
  @JSName("near")
  def near_objectId(key: objectId, point: GeoPoint): this.type = js.native
  @JSName("near")
  def near_updatedAt(key: updatedAt, point: GeoPoint): this.type = js.native
  def notContainedIn(
    key: createdAt,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['createdAt'] */ js.Any
    ]
  ): this.type = js.native
  def notContainedIn(
    key: objectId,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['objectId'] */ js.Any
    ]
  ): this.type = js.native
  def notContainedIn(
    key: updatedAt,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['updatedAt'] */ js.Any
    ]
  ): this.type = js.native
  @JSName("notContainedIn")
  def notContainedIn_attributes[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](
    key: K,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['attributes'][K] */ js.Any
    ]
  ): this.type = js.native
  def notEqualTo(
    key: createdAt,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['createdAt'] */ js.Any
  ): this.type = js.native
  def notEqualTo(
    key: objectId,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['objectId'] */ js.Any
  ): this.type = js.native
  def notEqualTo(
    key: updatedAt,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes']['updatedAt'] */ js.Any
  ): this.type = js.native
  @JSName("notEqualTo")
  def notEqualTo_attributes[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T['attributes'][K] */ js.Any
  ): this.type = js.native
  def polygonContains[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, point: GeoPoint): this.type = js.native
  @JSName("polygonContains")
  def polygonContains_createdAt(key: createdAt, point: GeoPoint): this.type = js.native
  @JSName("polygonContains")
  def polygonContains_objectId(key: objectId, point: GeoPoint): this.type = js.native
  @JSName("polygonContains")
  def polygonContains_updatedAt(key: updatedAt, point: GeoPoint): this.type = js.native
  def select[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](keys: K*): this.type = js.native
  @JSName("select")
  def select_createdAt(keys: createdAt*): this.type = js.native
  @JSName("select")
  def select_objectId(keys: objectId*): this.type = js.native
  @JSName("select")
  def select_updatedAt(keys: updatedAt*): this.type = js.native
  def skip(n: Double): Query[T] = js.native
  def sortByTextScore(): this.type = js.native
  def startsWith[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, prefix: String): this.type = js.native
  @JSName("startsWith")
  def startsWith_createdAt(key: createdAt, prefix: String): this.type = js.native
  @JSName("startsWith")
  def startsWith_objectId(key: objectId, prefix: String): this.type = js.native
  @JSName("startsWith")
  def startsWith_updatedAt(key: updatedAt, prefix: String): this.type = js.native
  def subscribe(): js.Promise[LiveQuerySubscription] = js.native
  def toJSON(): js.Any = js.native
  def withJSON(json: js.Any): this.type = js.native
  def withinGeoBox[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, southwest: GeoPoint, northeast: GeoPoint): this.type = js.native
  @JSName("withinGeoBox")
  def withinGeoBox_createdAt(key: createdAt, southwest: GeoPoint, northeast: GeoPoint): this.type = js.native
  @JSName("withinGeoBox")
  def withinGeoBox_objectId(key: objectId, southwest: GeoPoint, northeast: GeoPoint): this.type = js.native
  @JSName("withinGeoBox")
  def withinGeoBox_updatedAt(key: updatedAt, southwest: GeoPoint, northeast: GeoPoint): this.type = js.native
  def withinKilometers[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, point: GeoPoint, maxDistance: Double): this.type = js.native
  @JSName("withinKilometers")
  def withinKilometers_createdAt(key: createdAt, point: GeoPoint, maxDistance: Double): this.type = js.native
  @JSName("withinKilometers")
  def withinKilometers_objectId(key: objectId, point: GeoPoint, maxDistance: Double): this.type = js.native
  @JSName("withinKilometers")
  def withinKilometers_updatedAt(key: updatedAt, point: GeoPoint, maxDistance: Double): this.type = js.native
  def withinMiles[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, point: GeoPoint, maxDistance: Double): this.type = js.native
  @JSName("withinMiles")
  def withinMiles_createdAt(key: createdAt, point: GeoPoint, maxDistance: Double): this.type = js.native
  @JSName("withinMiles")
  def withinMiles_objectId(key: objectId, point: GeoPoint, maxDistance: Double): this.type = js.native
  @JSName("withinMiles")
  def withinMiles_updatedAt(key: updatedAt, point: GeoPoint, maxDistance: Double): this.type = js.native
  def withinPolygon[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, points: js.Array[js.Array[Double]]): this.type = js.native
  @JSName("withinPolygon")
  def withinPolygon_createdAt(key: createdAt, points: js.Array[js.Array[Double]]): this.type = js.native
  @JSName("withinPolygon")
  def withinPolygon_objectId(key: objectId, points: js.Array[js.Array[Double]]): this.type = js.native
  @JSName("withinPolygon")
  def withinPolygon_updatedAt(key: updatedAt, points: js.Array[js.Array[Double]]): this.type = js.native
  def withinRadians[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, point: GeoPoint, maxDistance: Double): this.type = js.native
  @JSName("withinRadians")
  def withinRadians_createdAt(key: createdAt, point: GeoPoint, maxDistance: Double): this.type = js.native
  @JSName("withinRadians")
  def withinRadians_objectId(key: objectId, point: GeoPoint, maxDistance: Double): this.type = js.native
  @JSName("withinRadians")
  def withinRadians_updatedAt(key: updatedAt, point: GeoPoint, maxDistance: Double): this.type = js.native
}

