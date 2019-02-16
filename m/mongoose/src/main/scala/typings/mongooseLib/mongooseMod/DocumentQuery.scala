package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentQuery[T, DocType /* <: Document */, QueryHelpers] extends mquery {
  /** Executes this query and returns a promise */
  var `then`: js.Function0[js.Promise[_]] | (js.Function1[/* onfulfilled */ js.Function1[/* value */ T, _ | js.Thenable[_]], js.Promise[_]]) | (js.Function2[
    /* onfulfilled */ js.Function1[/* value */ T, _ | js.Thenable[_]], 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
    js.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ js.UndefOr[scala.Nothing], 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
    js.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ scala.Null, 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
    js.Promise[_]
  ]) = js.native
  /**
    * Specifies a javascript function or expression to pass to MongoDBs query system.
    * Only use $where when you have a condition that cannot be met using other MongoDB
    * operators like $lt. Be sure to read about all of its caveats before using.
    * @param js javascript string or function
    */
  @JSName("$where")
  def $where(`js_`: java.lang.String): this.type = js.native
  @JSName("$where")
  def $where(`js_`: js.Function): this.type = js.native
  def all(path: java.lang.String, `val`: scala.Double): this.type = js.native
  /**
    * Specifies an $all query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def all(`val`: scala.Double): this.type = js.native
  /**
    * Specifies arguments for a $and condition.
    * @param array array of conditions
    */
  def and(array: js.Array[_]): this.type = js.native
  /** Specifies the batchSize option. Cannot be used with distinct() */
  def batchSize(`val`: scala.Double): this.type = js.native
  def box(lower: js.Array[scala.Double], upper: js.Array[scala.Double]): this.type = js.native
  /**
    * Specifies a $box condition
    * @param Upper Right Coords
    */
  def box(`val`: js.Any): this.type = js.native
  /** Casts this query to the schema of model, If obj is present, it is cast instead of this query.*/
  def cast(model: js.Any): js.Any = js.native
  def cast(model: js.Any, obj: js.Any): js.Any = js.native
  /**
    * Executes the query returning a Promise which will be
    * resolved with either the doc(s) or rejected with the error.
    * Like .then(), but only takes a rejection handler.
    */
  def `catch`[TRes](): js.Promise[TRes] = js.native
  def `catch`[TRes](reject: js.Function1[/* err */ js.Any, scala.Unit | TRes | js.Thenable[TRes]]): js.Promise[TRes] = js.native
  /**
    * DEPRECATED Alias for circle
    * Specifies a $center or $centerSphere condition.
    * @deprecated Use circle instead.
    */
  def center(area: js.Any): this.type = js.native
  def center(path: java.lang.String, area: js.Any): this.type = js.native
  /**
    * DEPRECATED Specifies a $centerSphere condition
    * @deprecated Use circle instead.
    */
  def centerSphere(path: java.lang.String, `val`: js.Any): this.type = js.native
  def centerSphere(`val`: js.Any): this.type = js.native
  /** Specifies a $center or $centerSphere condition. */
  def circle(area: js.Any): this.type = js.native
  def circle(path: java.lang.String, area: js.Any): this.type = js.native
  /** Adds a collation to this op (MongoDB 3.4 and up) */
  def collation(value: CollationOptions): this.type = js.native
  /** Specifies the comment option. Cannot be used with distinct() */
  def comment(`val`: java.lang.String): this.type = js.native
  /**
    * Specifying this query as a count query. Passing a callback executes the query.
    * @param criteria mongodb selector
    */
  def count(): Query[scala.Double] with QueryHelpers = js.native
  def count(callback: js.Function2[/* err */ js.Any, /* count */ scala.Double, scala.Unit]): Query[scala.Double] with QueryHelpers = js.native
  def count(criteria: js.Any): Query[scala.Double] with QueryHelpers = js.native
  def count(criteria: js.Any, callback: js.Function2[/* err */ js.Any, /* count */ scala.Double, scala.Unit]): Query[scala.Double] with QueryHelpers = js.native
  /**
    * Specifies this query as a `countDocuments()` query. Behaves like `count()`,
    * except it always does a full collection scan when passed an empty filter `{}`.
    *
    * There are also minor differences in how `countDocuments()` handles
    * [`$where` and a couple geospatial operators](http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#countDocuments).
    * versus `count()`.
    *
    * Passing a `callback` executes the query.
    *
    * This function triggers the following middleware.
    *
    * - `countDocuments()`
    *
    *
    * @param {Object} [criteria] mongodb selector
    * @param {Function} [callback] optional params are (error, count)
    * @return {Query} this
    */
  def countDocuments(): Query[scala.Double] with QueryHelpers = js.native
  def countDocuments(callback: js.Function2[/* err */ js.Any, /* count */ scala.Double, scala.Unit]): Query[scala.Double] with QueryHelpers = js.native
  def countDocuments(criteria: js.Any): Query[scala.Double] with QueryHelpers = js.native
  def countDocuments(criteria: js.Any, callback: js.Function2[/* err */ js.Any, /* count */ scala.Double, scala.Unit]): Query[scala.Double] with QueryHelpers = js.native
  /**
    * Returns a wrapper around a mongodb driver cursor. A Query<T>Cursor exposes a
    * Streams3-compatible interface, as well as a .next() function.
    */
  def cursor(): QueryCursor[DocType] = js.native
  def cursor(options: js.Any): QueryCursor[DocType] = js.native
  /** Declares or executes a distict() operation. Passing a callback executes the query. */
  def distinct(): Query[js.Array[_]] with QueryHelpers = js.native
  def distinct(callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], scala.Unit]): Query[js.Array[_]] with QueryHelpers = js.native
  def distinct(field: java.lang.String): Query[js.Array[_]] with QueryHelpers = js.native
  def distinct(
    field: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], scala.Unit]
  ): Query[js.Array[_]] with QueryHelpers = js.native
  def distinct(field: java.lang.String, criteria: js.Any): Query[js.Array[_]] with QueryHelpers = js.native
  def distinct(
    field: java.lang.String,
    criteria: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], scala.Unit]
  ): Query[js.Array[_]] with QueryHelpers = js.native
  def distinct(field: java.lang.String, criteria: Query[_]): Query[js.Array[_]] with QueryHelpers = js.native
  def distinct(
    field: java.lang.String,
    criteria: Query[_],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], scala.Unit]
  ): Query[js.Array[_]] with QueryHelpers = js.native
  def elemMatch(criteria: js.Any): this.type = js.native
  /** Specifies an $elemMatch condition */
  def elemMatch(criteria: js.Function1[/* elem */ Query[_], scala.Unit]): this.type = js.native
  def elemMatch(path: java.lang.String, criteria: js.Any): this.type = js.native
  def elemMatch(path: java.lang.String, criteria: js.Function1[/* elem */ Query[_], scala.Unit]): this.type = js.native
  def elemMatch(path: js.Any, criteria: js.Any): this.type = js.native
  def elemMatch(path: js.Any, criteria: js.Function1[/* elem */ Query[_], scala.Unit]): this.type = js.native
  def elemMatch(path: js.Function, criteria: js.Any): this.type = js.native
  def elemMatch(path: js.Function, criteria: js.Function1[/* elem */ Query[_], scala.Unit]): this.type = js.native
  /** Get the current error flag value */
  def error(): Error | scala.Null = js.native
  /**
    * Set the error flag on this query
    * @param err The error flag
    */
  def error(err: Error): this.type = js.native
  /** Unset the error flag set on this query */
  @JSName("error")
  def `error_<this>`(): this.type = js.native
  /**
    * Estimates the number of documents in the MongoDB collection. Faster than
    * using `countDocuments()` for large collections because
    * `estimatedDocumentCount()` uses collection metadata rather than scanning
    * the entire collection.
    *
    * @param {Object} [options] passed transparently to the [MongoDB driver](http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#estimatedDocumentCount)
    * @param {Function} [callback] optional params are (error, count)
    * @return {Query} this
    */
  def estimatedDocumentCount(): Query[scala.Double] with QueryHelpers = js.native
  def estimatedDocumentCount(callback: js.Function2[/* err */ js.Any, /* count */ scala.Double, scala.Unit]): Query[scala.Double] with QueryHelpers = js.native
  def estimatedDocumentCount(options: js.Any): Query[scala.Double] with QueryHelpers = js.native
  def estimatedDocumentCount(options: js.Any, callback: js.Function2[/* err */ js.Any, /* count */ scala.Double, scala.Unit]): Query[scala.Double] with QueryHelpers = js.native
  /** Executes the query */
  def exec(): js.Promise[T] = js.native
  def exec(callback: js.Function2[/* err */ js.Any, /* res */ T, scala.Unit]): js.Promise[T] = js.native
  def exec(operation: java.lang.String): js.Promise[T] = js.native
  def exec(operation: java.lang.String, callback: js.Function2[/* err */ js.Any, /* res */ T, scala.Unit]): js.Promise[T] = js.native
  def exec(operation: js.Function): js.Promise[T] = js.native
  def exec(operation: js.Function, callback: js.Function2[/* err */ js.Any, /* res */ T, scala.Unit]): js.Promise[T] = js.native
  /** Specifies an $exists condition */
  def exists(): this.type = js.native
  def exists(path: java.lang.String): this.type = js.native
  def exists(path: java.lang.String, `val`: scala.Boolean): this.type = js.native
  def exists(`val`: scala.Boolean): this.type = js.native
  /**
    * Finds documents. When no callback is passed, the query is not executed. When the
    * query is executed, the result will be an array of documents.
    * @param criteria mongodb selector
    */
  def find(): (DocumentQuery[js.Array[DocType], DocType, js.Object]) with QueryHelpers = js.native
  def find(callback: js.Function2[/* err */ js.Any, /* res */ js.Array[DocType], scala.Unit]): (DocumentQuery[js.Array[DocType], DocType, js.Object]) with QueryHelpers = js.native
  def find(criteria: js.Any): (DocumentQuery[js.Array[DocType], DocType, js.Object]) with QueryHelpers = js.native
  def find(
    criteria: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[DocType], scala.Unit]
  ): (DocumentQuery[js.Array[DocType], DocType, js.Object]) with QueryHelpers = js.native
  /**
    * Declares the query a findOne operation. When executed, the first found document is
    * passed to the callback. Passing a callback executes the query. The result of the query
    * is a single document.
    * @param criteria mongodb selector
    * @param projection optional fields to return
    */
  def findOne(): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOne(callback: js.Function2[/* err */ js.Any, /* res */ DocType | scala.Null, scala.Unit]): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOne(criteria: js.Any): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOne(
    criteria: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ DocType | scala.Null, scala.Unit]
  ): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  /**
    * Issues a mongodb findAndModify remove command.
    * Finds a matching document, removes it, passing the found document (if any) to the
    * callback. Executes immediately if callback is passed.
    */
  def findOneAndRemove(): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOneAndRemove(
    callback: js.Function3[/* error */ js.Any, /* doc */ DocType | scala.Null, /* result */ js.Any, scala.Unit]
  ): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOneAndRemove(conditions: js.Any): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOneAndRemove(
    conditions: js.Any,
    callback: js.Function3[/* error */ js.Any, /* doc */ DocType | scala.Null, /* result */ js.Any, scala.Unit]
  ): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOneAndRemove(conditions: js.Any, options: QueryFindOneAndRemoveOptions): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOneAndRemove(
    conditions: js.Any,
    options: QueryFindOneAndRemoveOptions,
    callback: js.Function3[/* error */ js.Any, /* doc */ DocType | scala.Null, /* result */ js.Any, scala.Unit]
  ): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  /**
    * Issues a mongodb findAndModify update command.
    * Finds a matching document, updates it according to the update arg, passing any options, and returns
    * the found document (if any) to the callback. The query executes immediately if callback is passed.
    */
  def findOneAndUpdate(): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOneAndUpdate(callback: js.Function2[/* err */ js.Any, /* doc */ DocType | scala.Null, scala.Unit]): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOneAndUpdate(query: js.Any, update: js.Any): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOneAndUpdate(
    query: js.Any,
    update: js.Any,
    callback: js.Function3[/* err */ js.Any, /* doc */ DocType | scala.Null, /* res */ js.Any, scala.Unit]
  ): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOneAndUpdate(query: js.Any, update: js.Any, options: mongooseLib.Anon_New with QueryFindOneAndUpdateOptions): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOneAndUpdate(
    query: js.Any,
    update: js.Any,
    options: mongooseLib.Anon_New with QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ DocType, /* res */ js.Any, scala.Unit]
  ): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOneAndUpdate(query: js.Any, update: js.Any, options: QueryFindOneAndUpdateOptions): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOneAndUpdate(
    query: js.Any,
    update: js.Any,
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ DocType | scala.Null, /* res */ js.Any, scala.Unit]
  ): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOneAndUpdate(update: js.Any): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  def findOneAndUpdate(
    update: js.Any,
    callback: js.Function3[/* err */ js.Any, /* doc */ DocType | scala.Null, /* res */ js.Any, scala.Unit]
  ): (DocumentQuery[DocType | scala.Null, DocType, js.Object]) with QueryHelpers = js.native
  /**
    * Specifies a $geometry condition. geometry() must come after either intersects() or within().
    * @param object Must contain a type property which is a String and a coordinates property which
    *   is an Array. See the examples.
    */
  def geometry(`object`: mongooseLib.Anon_Coordinates): this.type = js.native
  /**
    * Returns the current query options as a JSON object.
    * @returns current query options
    */
  def getOptions(): js.Any = js.native
  /**
    * Returns the current query conditions as a JSON object.
    * @returns current query conditions
    */
  def getQuery(): js.Any = js.native
  /**
    * Returns the current update operations as a JSON object.
    * @returns current update operations
    */
  def getUpdate(): js.Any = js.native
  def gt[T](path: java.lang.String, `val`: T): this.type = js.native
  /**
    * Specifies a $gt query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def gt[T](`val`: T): this.type = js.native
  def gte[T](path: java.lang.String, `val`: T): this.type = js.native
  /**
    * Specifies a $gte query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def gte[T](`val`: T): this.type = js.native
  /**
    * Sets query hints.
    * @param val a hint object
    */
  def hint(`val`: js.Any): this.type = js.native
  def in(path: java.lang.String, `val`: js.Array[_]): this.type = js.native
  /**
    * Specifies an $in query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def in(`val`: js.Array[_]): this.type = js.native
  /** Declares an intersects query for geometry(). MUST be used after where(). */
  def intersects(): this.type = js.native
  def intersects(arg: js.Any): this.type = js.native
  /**
    * Sets the lean option.
    * Documents returned from queries with the lean option enabled are plain
    * javascript objects, not MongooseDocuments. They have no save method,
    * getters/setters or other Mongoose magic applied.
    * @param bool defaults to true
    */
  def lean(): Query[_] with QueryHelpers = js.native
  def lean(bool: scala.Boolean): Query[_] with QueryHelpers = js.native
  /** Specifies the maximum number of documents the query will return. Cannot be used with distinct() */
  def limit(`val`: scala.Double): this.type = js.native
  def lt[T](path: java.lang.String, `val`: T): this.type = js.native
  /**
    * Specifies a $lt query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def lt[T](`val`: T): this.type = js.native
  def lte[T](path: java.lang.String, `val`: T): this.type = js.native
  /**
    * Specifies a $lte query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def lte[T](`val`: T): this.type = js.native
  def maxDistance(path: java.lang.String, `val`: scala.Double): this.type = js.native
  /**
    * Specifies a $maxDistance query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def maxDistance(`val`: scala.Double): this.type = js.native
  /** Specifies the maxScan option. Cannot be used with distinct() */
  def maxScan(`val`: scala.Double): this.type = js.native
  /** @deprecated Alias of maxScan */
  def maxscan(`val`: scala.Double): this.type = js.native
  /**
    * Merges another Query or conditions object into this one.
    * When a Query is passed, conditions, field selection and options are merged.
    */
  def merge(source: js.Any): this.type = js.native
  def merge(source: Query[_]): this.type = js.native
  def mod(path: java.lang.String, `val`: js.Array[scala.Double]): this.type = js.native
  /** Specifies a $mod condition */
  def mod(`val`: js.Array[scala.Double]): this.type = js.native
  def ne(path: java.lang.String, `val`: js.Any): this.type = js.native
  /**
    * Specifies a $ne query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def ne(`val`: js.Any): this.type = js.native
  def near(path: java.lang.String, `val`: js.Any): this.type = js.native
  /** Specifies a $near or $nearSphere condition. */
  def near(`val`: js.Any): this.type = js.native
  def nearSphere(path: java.lang.String, `val`: js.Any): this.type = js.native
  /**
    * DEPRECATED Specifies a $nearSphere condition
    * @deprecated Use query.near() instead with the spherical option set to true.
    */
  def nearSphere(`val`: js.Any): this.type = js.native
  def nin(path: java.lang.String, `val`: js.Array[_]): this.type = js.native
  /**
    * Specifies a $nin query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def nin(`val`: js.Array[_]): this.type = js.native
  /**
    * Specifies arguments for a $nor condition.
    * @param array array of conditions
    */
  def nor(array: js.Array[_]): this.type = js.native
  /**
    * Specifies arguments for an $or condition.
    * @param array array of conditions
    */
  def or(array: js.Array[_]): this.type = js.native
  /**
    * Make this query throw an error if no documents match the given `filter`.
    * This is handy for integrating with async/await, because `orFail()` saves you
    * an extra `if` statement to check if no document was found.
    *
    * Example:
    *
    *     // Throws if no doc returned
    *     await Model.findOne({ foo: 'bar' }).orFail();
    *
    *     // Throws if no document was updated
    *     await Model.updateOne({ foo: 'bar' }, { name: 'test' }).orFail();
    *
    *     // Throws "No docs found!" error if no docs match `{ foo: 'bar' }`
    *     await Model.find({ foo: 'bar' }).orFail(new Error('No docs found!'));
    *
    *     // Throws "Not found" error if no document was found
    *     await Model.findOneAndUpdate({ foo: 'bar' }, { name: 'test' }).
    *       orFail(() => Error('Not found'));
    *
    * @param err optional error to throw if no docs match `filter`
    */
  def orFail(): this.type = js.native
  def orFail(err: js.Function0[Error]): this.type = js.native
  def orFail(err: Error): this.type = js.native
  /** Specifies a $polygon condition */
  def polygon(coordinatePairs: js.Array[scala.Double]*): this.type = js.native
  def polygon(path: java.lang.String, coordinatePairs: js.Array[scala.Double]*): this.type = js.native
  def populate(options: js.Array[ModelPopulateOptions]): this.type = js.native
  def populate(options: ModelPopulateOptions): this.type = js.native
  /**
    * Specifies paths which should be populated with other documents.
    * Paths are populated after the query executes and a response is received. A separate
    * query is then executed for each path specified for population. After a response for
    * each query has also been returned, the results are passed to the callback.
    * @param path either the path to populate or an object specifying all parameters
    * @param select Field selection for the population query
    * @param model The model you wish to use for population. If not specified, populate
    *   will look up the model by the name in the Schema's ref field.
    * @param match Conditions for the population query
    * @param options Options for the population query (sort, etc)
    */
  def populate(path: java.lang.String): this.type = js.native
  def populate(path: java.lang.String, select: java.lang.String): this.type = js.native
  def populate(path: java.lang.String, select: java.lang.String, model: js.Any): this.type = js.native
  def populate(path: java.lang.String, select: java.lang.String, model: js.Any, `match`: js.Any): this.type = js.native
  def populate(path: java.lang.String, select: java.lang.String, model: js.Any, `match`: js.Any, options: js.Any): this.type = js.native
  def populate(path: java.lang.String, select: js.Any): this.type = js.native
  def populate(path: java.lang.String, select: js.Any, model: js.Any): this.type = js.native
  def populate(path: java.lang.String, select: js.Any, model: js.Any, `match`: js.Any): this.type = js.native
  def populate(path: java.lang.String, select: js.Any, model: js.Any, `match`: js.Any, options: js.Any): this.type = js.native
  def populate(path: js.Any): this.type = js.native
  def populate(path: js.Any, select: java.lang.String): this.type = js.native
  def populate(path: js.Any, select: java.lang.String, model: js.Any): this.type = js.native
  def populate(path: js.Any, select: java.lang.String, model: js.Any, `match`: js.Any): this.type = js.native
  def populate(path: js.Any, select: java.lang.String, model: js.Any, `match`: js.Any, options: js.Any): this.type = js.native
  def populate(path: js.Any, select: js.Any): this.type = js.native
  def populate(path: js.Any, select: js.Any, model: js.Any): this.type = js.native
  def populate(path: js.Any, select: js.Any, model: js.Any, `match`: js.Any): this.type = js.native
  def populate(path: js.Any, select: js.Any, model: js.Any, `match`: js.Any, options: js.Any): this.type = js.native
  /**
    * Determines the MongoDB nodes from which to read.
    * @param pref one of the listed preference options or aliases
    * @tags optional tags for this query
    */
  def read(pref: java.lang.String): this.type = js.native
  def read(pref: java.lang.String, tags: js.Array[_]): this.type = js.native
  /**
    * Sets the readConcern option for the query.
    * @param level one of the listed read concern level or their aliases
    */
  def readConcern(level: java.lang.String): this.type = js.native
  def regex(path: java.lang.String, `val`: stdLib.RegExp): this.type = js.native
  /**
    * Specifies a $regex query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def regex(`val`: stdLib.RegExp): this.type = js.native
  /**
    * Declare and/or execute this query as a remove() operation.
    * The operation is only executed when a callback is passed. To force execution without a callback,
    * you must first call remove() and then execute it by using the exec() method.
    * @param criteria mongodb selector
    */
  def remove(): Query[_] with QueryHelpers = js.native
  def remove(callback: js.Function1[/* err */ js.Any, scala.Unit]): Query[_] with QueryHelpers = js.native
  def remove(criteria: js.Any): Query[_] with QueryHelpers = js.native
  def remove(criteria: js.Any, callback: js.Function1[/* err */ js.Any, scala.Unit]): Query[_] with QueryHelpers = js.native
  def remove(criteria: Query[_]): Query[_] with QueryHelpers = js.native
  def remove(criteria: Query[_], callback: js.Function1[/* err */ js.Any, scala.Unit]): Query[_] with QueryHelpers = js.native
  /** Specifies which document fields to include or exclude (also known as the query "projection") */
  def select(arg: java.lang.String): this.type = js.native
  def select(arg: js.Any): this.type = js.native
  /** Determines if field selection has been made. */
  def selected(): scala.Boolean = js.native
  /** Determines if exclusive field selection has been made.*/
  def selectedExclusively(): scala.Boolean = js.native
  /** Determines if inclusive field selection has been made. */
  def selectedInclusively(): scala.Boolean = js.native
  def session(): this.type = js.native
  /**
    * Sets the [MongoDB session](https://docs.mongodb.com/manual/reference/server-sessions/)
    * associated with this query. Sessions are how you mark a query as part of a
    * [transaction](/docs/transactions.html).
    */
  def session(session: mongodbLib.mongodbMod.ClientSession): this.type = js.native
  /** Sets query options. */
  def setOptions(options: js.Any): this.type = js.native
  /** Sets query conditions to the provided JSON object. */
  def setQuery(conditions: js.Any): this.type = js.native
  def size(path: java.lang.String, `val`: scala.Double): this.type = js.native
  /**
    * Specifies a $size query condition.
    * When called with one argument, the most recent path passed to where() is used.
    */
  def size(`val`: scala.Double): this.type = js.native
  /** Specifies the number of documents to skip. Cannot be used with distinct() */
  def skip(`val`: scala.Double): this.type = js.native
  /**
    * DEPRECATED Sets the slaveOk option.
    * @param v defaults to true
    * @deprecated in MongoDB 2.2 in favor of read preferences.
    */
  def slaveOk(): this.type = js.native
  def slaveOk(v: scala.Boolean): this.type = js.native
  def slice(path: java.lang.String, `val`: js.Array[scala.Double]): this.type = js.native
  def slice(path: java.lang.String, `val`: scala.Double): this.type = js.native
  def slice(`val`: js.Array[scala.Double]): this.type = js.native
  /**
    * Specifies a $slice projection for an array.
    * @param val number/range of elements to slice
    */
  def slice(`val`: scala.Double): this.type = js.native
  /** Specifies this query as a snapshot query. Cannot be used with distinct() */
  def snapshot(): this.type = js.native
  def snapshot(v: scala.Boolean): this.type = js.native
  /**
    * Sets the sort order
    * If an object is passed, values allowed are asc, desc, ascending, descending, 1, and -1.
    * If a string is passed, it must be a space delimited list of path names. The
    * sort order of each path is ascending unless the path name is prefixed with -
    * which will be treated as descending.
    */
  def sort(arg: java.lang.String): this.type = js.native
  def sort(arg: js.Any): this.type = js.native
  /**
    * Sets the tailable option (for use with capped collections). Cannot be used with distinct()
    * @param bool defaults to true
    * @param opts options to set
    * @param opts.numberOfRetries if cursor is exhausted, retry this many times before giving up
    * @param opts.tailableRetryInterval if cursor is exhausted, wait this many milliseconds before retrying
    */
  def tailable(): this.type = js.native
  def tailable(bool: scala.Boolean): this.type = js.native
  def tailable(bool: scala.Boolean, opts: mongooseLib.Anon_NumberOfRetries): this.type = js.native
  /**
    * Converts this query to a customized, reusable query
    * constructor with all arguments and options retained.
    */
  def toConstructor[T](): org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, Query[T] with QueryHelpers] = js.native
  @JSName("toConstructor")
  def toConstructor_TDocDocument[T, Doc /* <: Document */](): org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, (DocumentQuery[T, Doc, js.Object]) with QueryHelpers] = js.native
  /**
    * Declare and/or execute this query as an update() operation.
    * All paths passed that are not $atomic operations will become $set ops.
    * @param doc the update command
    */
  def update(): Query[scala.Double] with QueryHelpers = js.native
  def update(callback: js.Function2[/* err */ js.Any, /* affectedRows */ scala.Double, scala.Unit]): Query[scala.Double] with QueryHelpers = js.native
  def update(criteria: js.Any, doc: js.Any): Query[scala.Double] with QueryHelpers = js.native
  def update(
    criteria: js.Any,
    doc: js.Any,
    callback: js.Function2[/* err */ js.Any, /* affectedRows */ scala.Double, scala.Unit]
  ): Query[scala.Double] with QueryHelpers = js.native
  def update(criteria: js.Any, doc: js.Any, options: QueryUpdateOptions): Query[scala.Double] with QueryHelpers = js.native
  def update(
    criteria: js.Any,
    doc: js.Any,
    options: QueryUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* affectedRows */ scala.Double, scala.Unit]
  ): Query[scala.Double] with QueryHelpers = js.native
  def update(doc: js.Any): Query[scala.Double] with QueryHelpers = js.native
  def update(doc: js.Any, callback: js.Function2[/* err */ js.Any, /* affectedRows */ scala.Double, scala.Unit]): Query[scala.Double] with QueryHelpers = js.native
  /** Specifies a path for use with chaining. */
  def where(): this.type = js.native
  def where(path: java.lang.String): this.type = js.native
  def where(path: java.lang.String, `val`: js.Any): this.type = js.native
  def where(path: js.Any): this.type = js.native
  def where(path: js.Any, `val`: js.Any): this.type = js.native
  /** Defines a $within or $geoWithin argument for geo-spatial queries. */
  def within(): this.type = js.native
  def within(coordinate: js.Array[scala.Double], coordinatePairs: js.Array[scala.Double]*): this.type = js.native
  def within(`val`: js.Any): this.type = js.native
}

