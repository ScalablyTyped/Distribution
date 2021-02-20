package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.parse.anon.Dictkey
import typings.parse.anon.SizeNumber
import typings.parse.mod.global.Parse.Query.AggregationOptions
import typings.parse.mod.global.Parse.Query.BatchOptions
import typings.parse.mod.global.Parse.Query.CountOptions
import typings.parse.mod.global.Parse.Query.FindOptions
import typings.parse.mod.global.Parse.Query.FirstOptions
import typings.parse.mod.global.Parse.Query.FullTextOptions
import typings.parse.mod.global.Parse.Query.GetOptions
import typings.parse.parseNumbers.`-1`
import typings.parse.parseNumbers.`1`
import typings.parse.parseStrings.createdAt
import typings.parse.parseStrings.objectId
import typings.parse.parseStrings.updatedAt
import typings.std.Extract
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class Query[T /* <: Object[Attributes] */] protected () extends StObject {
  def this(objectClass: String) = this()
  def this(objectClass: Instantiable1[/* args (repeated) */ js.Any, T | Object[Attributes]]) = this()
  
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
  
  def cancel(): this.type = js.native
  
  var className: String = js.native
  
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
  @JSName("doesNotMatchKeyInQuery")
  def doesNotMatchKeyInQuery_createdAt[U /* <: Object[Attributes] */, X /* <: Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof U['attributes'] */ js.Any, 
    String
  ] */](key: createdAt, queryKey: X, query: Query[U]): this.type = js.native
  @JSName("doesNotMatchKeyInQuery")
  def doesNotMatchKeyInQuery_objectId[U /* <: Object[Attributes] */, X /* <: Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof U['attributes'] */ js.Any, 
    String
  ] */](key: objectId, queryKey: X, query: Query[U]): this.type = js.native
  @JSName("doesNotMatchKeyInQuery")
  def doesNotMatchKeyInQuery_updatedAt[U /* <: Object[Attributes] */, X /* <: Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof U['attributes'] */ js.Any, 
    String
  ] */](key: updatedAt, queryKey: X, query: Query[U]): this.type = js.native
  
  def doesNotMatchQuery[U /* <: Object[Attributes] */, K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, query: Query[U]): this.type = js.native
  
  def each(callback: js.Function1[/* obj */ T, js.Thenable[Unit] | Unit]): js.Promise[Unit] = js.native
  def each(callback: js.Function1[/* obj */ T, js.Thenable[Unit] | Unit], options: BatchOptions): js.Promise[Unit] = js.native
  
  def eachBatch(callback: js.Function1[/* objs */ js.Array[T], js.Thenable[Unit] | Unit]): js.Promise[Unit] = js.native
  def eachBatch(callback: js.Function1[/* objs */ js.Array[T], js.Thenable[Unit] | Unit], options: BatchOptions): js.Promise[Unit] = js.native
  
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
  
  def exclude[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](keys: K*): this.type = js.native
  @JSName("exclude")
  def exclude_createdAt(keys: createdAt*): this.type = js.native
  @JSName("exclude")
  def exclude_objectId(keys: objectId*): this.type = js.native
  @JSName("exclude")
  def exclude_updatedAt(keys: updatedAt*): this.type = js.native
  
  def exists[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K): this.type = js.native
  @JSName("exists")
  def exists_createdAt(key: createdAt): this.type = js.native
  @JSName("exists")
  def exists_objectId(key: objectId): this.type = js.native
  @JSName("exists")
  def exists_updatedAt(key: updatedAt): this.type = js.native
  
  def explain(explain: Boolean): this.type = js.native
  
  def filter(
    callback: js.Function3[
      /* currentObject */ T, 
      /* index */ Double, 
      /* query */ Query[Object[Attributes]], 
      js.Thenable[Boolean] | Boolean
    ]
  ): js.Promise[js.Array[T]] = js.native
  def filter(
    callback: js.Function3[
      /* currentObject */ T, 
      /* index */ Double, 
      /* query */ Query[Object[Attributes]], 
      js.Thenable[Boolean] | Boolean
    ],
    options: BatchOptions
  ): js.Promise[js.Array[T]] = js.native
  
  def find(): js.Promise[js.Array[T]] = js.native
  def find(options: FindOptions): js.Promise[js.Array[T]] = js.native
  
  def findAll(): js.Promise[js.Array[T]] = js.native
  def findAll(options: BatchOptions): js.Promise[js.Array[T]] = js.native
  
  def first(): js.Promise[js.UndefOr[T]] = js.native
  def first(options: FirstOptions): js.Promise[js.UndefOr[T]] = js.native
  
  def fromLocalDatastore(): this.type = js.native
  
  def fromNetwork(): this.type = js.native
  
  def fromPin(): this.type = js.native
  
  def fromPinWithName(name: String): this.type = js.native
  
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
  
  def hint(value: String): this.type = js.native
  def hint(value: js.Object): this.type = js.native
  
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
  
  def map[U](
    callback: js.Function3[
      /* currentObject */ T, 
      /* index */ Double, 
      /* query */ Query[Object[Attributes]], 
      js.Thenable[U] | U
    ]
  ): js.Promise[js.Array[U]] = js.native
  def map[U](
    callback: js.Function3[
      /* currentObject */ T, 
      /* index */ Double, 
      /* query */ Query[Object[Attributes]], 
      js.Thenable[U] | U
    ],
    options: BatchOptions
  ): js.Promise[js.Array[U]] = js.native
  
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
  
  var objectClass: js.Any = js.native
  
  def polygonContains[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any */](key: K, point: GeoPoint): this.type = js.native
  @JSName("polygonContains")
  def polygonContains_createdAt(key: createdAt, point: GeoPoint): this.type = js.native
  @JSName("polygonContains")
  def polygonContains_objectId(key: objectId, point: GeoPoint): this.type = js.native
  @JSName("polygonContains")
  def polygonContains_updatedAt(key: updatedAt, point: GeoPoint): this.type = js.native
  
  def reduce(
    callback: js.Function3[/* accumulator */ T, /* currentObject */ T, /* index */ Double, js.Thenable[T] | T]
  ): js.Promise[T] = js.native
  def reduce(
    callback: js.Function3[/* accumulator */ T, /* currentObject */ T, /* index */ Double, js.Thenable[T] | T],
    initialValue: js.UndefOr[scala.Nothing],
    options: BatchOptions
  ): js.Promise[T] = js.native
  def reduce[U](
    callback: js.Function3[/* accumulator */ U, /* currentObject */ T, /* index */ Double, js.Thenable[U] | U],
    initialValue: U
  ): js.Promise[U] = js.native
  def reduce[U](
    callback: js.Function3[/* accumulator */ U, /* currentObject */ T, /* index */ Double, js.Thenable[U] | U],
    initialValue: U,
    options: BatchOptions
  ): js.Promise[U] = js.native
  
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
object Query {
  
  /* static member */
  @JSGlobal("Parse.Query.and")
  @js.native
  def and[U /* <: Object[Attributes] */](args: Query[U]*): Query[U] = js.native
  
  /* static member */
  @JSGlobal("Parse.Query.fromJSON")
  @js.native
  def fromJSON[U /* <: Object[Attributes] */](className: String, json: js.Any): Query[U] = js.native
  
  /* static member */
  @JSGlobal("Parse.Query.nor")
  @js.native
  def nor[U /* <: Object[Attributes] */](args: Query[U]*): Query[U] = js.native
  
  /* static member */
  @JSGlobal("Parse.Query.or")
  @js.native
  def or[U /* <: Object[Attributes] */](var_args: Query[U]*): Query[U] = js.native
  
  // According to http://docs.parseplatform.org/rest/guide/#aggregate-queries
  @js.native
  trait AggregationOptions extends StObject {
    
    var group: js.UndefOr[Dictkey] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var `match`: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var project: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    // Sample documentation: https://docs.mongodb.com/v3.2/reference/operator/aggregation/sample/
    var sample: js.UndefOr[SizeNumber] = js.native
    
    var skip: js.UndefOr[Double] = js.native
    
    // Sort documentation https://docs.mongodb.com/v3.2/reference/operator/aggregation/sort/#pipe._S_sort
    var sort: js.UndefOr[StringDictionary[`1` | `-1`]] = js.native
  }
  object AggregationOptions {
    
    @scala.inline
    def apply(): AggregationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AggregationOptions]
    }
    
    @scala.inline
    implicit class AggregationOptionsMutableBuilder[Self <: AggregationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: Dictkey): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMatch(value: StringDictionary[js.Any]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setProject(value: StringDictionary[js.Any]): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setSample(value: SizeNumber): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleUndefined: Self = StObject.set(x, "sample", js.undefined)
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setSort(value: StringDictionary[`1` | `-1`]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  @js.native
  trait BatchOptions extends FullOptions {
    
    var batchSize: js.UndefOr[Double] = js.native
  }
  object BatchOptions {
    
    @scala.inline
    def apply(): BatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchOptions]
    }
    
    @scala.inline
    implicit class BatchOptionsMutableBuilder[Self <: BatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    }
  }
  
  @js.native
  trait CountOptions
    extends SuccessFailureOptions
       with ScopeOptions
  object CountOptions {
    
    @scala.inline
    def apply(): CountOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountOptions]
    }
  }
  
  @js.native
  trait EachOptions
    extends SuccessFailureOptions
       with ScopeOptions
  object EachOptions {
    
    @scala.inline
    def apply(): EachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EachOptions]
    }
  }
  
  @js.native
  trait FindOptions
    extends SuccessFailureOptions
       with ScopeOptions
  object FindOptions {
    
    @scala.inline
    def apply(): FindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOptions]
    }
  }
  
  @js.native
  trait FirstOptions
    extends SuccessFailureOptions
       with ScopeOptions
  object FirstOptions {
    
    @scala.inline
    def apply(): FirstOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirstOptions]
    }
  }
  
  // According to https://parseplatform.org/Parse-SDK-JS/api/2.1.0/Parse.Query.html#fullText
  @js.native
  trait FullTextOptions extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    var diacriticSensitive: js.UndefOr[Boolean] = js.native
    
    var language: js.UndefOr[String] = js.native
  }
  object FullTextOptions {
    
    @scala.inline
    def apply(): FullTextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullTextOptions]
    }
    
    @scala.inline
    implicit class FullTextOptionsMutableBuilder[Self <: FullTextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setDiacriticSensitive(value: Boolean): Self = StObject.set(x, "diacriticSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiacriticSensitiveUndefined: Self = StObject.set(x, "diacriticSensitive", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
  
  @js.native
  trait GetOptions
    extends SuccessFailureOptions
       with ScopeOptions
  object GetOptions {
    
    @scala.inline
    def apply(): GetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOptions]
    }
  }
}
