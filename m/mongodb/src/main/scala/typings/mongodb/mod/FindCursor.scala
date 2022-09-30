package typings.mongodb.mod

import typings.bson.mod.Document
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "FindCursor")
@js.native
open class FindCursor[TSchema] () extends AbstractCursor[TSchema, AbstractCursorEvents] {
  def this(options: EventEmitterOptions) = this()
  
  /**
    * Add a query modifier to the cursor query
    *
    * @param name - The query modifier (must start with $, such as $orderby etc)
    * @param value - The modifier value.
    */
  def addQueryModifier(name: String, value: String): this.type = js.native
  def addQueryModifier(name: String, value: Boolean): this.type = js.native
  def addQueryModifier(name: String, value: scala.Double): this.type = js.native
  def addQueryModifier(name: String, value: Document): this.type = js.native
  
  /**
    * Allows disk use for blocking sort operations exceeding 100MB memory. (MongoDB 3.2 or higher)
    *
    * @remarks
    * {@link https://docs.mongodb.com/manual/reference/command/find/#find-cmd-allowdiskuse | find command allowDiskUse documentation}
    */
  def allowDiskUse(): this.type = js.native
  def allowDiskUse(allow: Boolean): this.type = js.native
  
  /**
    * Set the collation options for the cursor.
    *
    * @param value - The cursor collation options (MongoDB 3.4 or higher) settings for update operation (see 3.4 documentation for available fields).
    */
  def collation(value: CollationOptions): this.type = js.native
  
  /**
    * Add a comment to the cursor query allowing for tracking the comment in the log.
    *
    * @param value - The comment attached to this query.
    */
  def comment(value: String): this.type = js.native
  
  /* Excluded from this release type: _initialize */
  /* Excluded from this release type: _getMore */
  /**
    * Get the count of documents for this cursor
    * @deprecated Use `collection.estimatedDocumentCount` or `collection.countDocuments` instead
    */
  def count(): js.Promise[scala.Double] = js.native
  /** @deprecated Use `collection.estimatedDocumentCount` or `collection.countDocuments` instead. Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def count(callback: Callback[scala.Double]): Unit = js.native
  /** @deprecated Use `collection.estimatedDocumentCount` or `collection.countDocuments` instead. */
  def count(options: CountOptions): js.Promise[scala.Double] = js.native
  /** @deprecated Use `collection.estimatedDocumentCount` or `collection.countDocuments` instead. Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def count(options: CountOptions, callback: Callback[scala.Double]): Unit = js.native
  
  /** Execute the explain for the cursor */
  def explain(): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def explain(callback: Callback[Any]): Unit = js.native
  def explain(verbosity: ExplainVerbosityLike): js.Promise[Document] = js.native
  
  /** Set the cursor query */
  def filter(filter: Document): this.type = js.native
  
  /**
    * Set the cursor hint
    *
    * @param hint - If specified, then the query system will only consider plans using the hinted index.
    */
  def hint(hint: Hint): this.type = js.native
  
  /**
    * Set the limit for the cursor.
    *
    * @param value - The limit for the cursor query.
    */
  def limit(value: scala.Double): this.type = js.native
  
  /**
    * Set the cursor max
    *
    * @param max - Specify a $max value to specify the exclusive upper bound for a specific index in order to constrain the results of find(). The $max specifies the upper bound for all keys of a specific index in order.
    */
  def max(max: Document): this.type = js.native
  
  /**
    * Set a maxAwaitTimeMS on a tailing cursor query to allow to customize the timeout value for the option awaitData (Only supported on MongoDB 3.2 or higher, ignored otherwise)
    *
    * @param value - Number of milliseconds to wait before aborting the tailed query.
    */
  def maxAwaitTimeMS(value: scala.Double): this.type = js.native
  
  /**
    * Set the cursor min
    *
    * @param min - Specify a $min value to specify the inclusive lower bound for a specific index in order to constrain the results of find(). The $min specifies the lower bound for all keys of a specific index in order.
    */
  def min(min: Document): this.type = js.native
  
  /**
    * Add a project stage to the aggregation pipeline
    *
    * @remarks
    * In order to strictly type this function you must provide an interface
    * that represents the effect of your projection on the result documents.
    *
    * By default chaining a projection to your cursor changes the returned type to the generic
    * {@link Document} type.
    * You should specify a parameterized type to have assertions on your final results.
    *
    * @example
    * ```typescript
    * // Best way
    * const docs: FindCursor<{ a: number }> = cursor.project<{ a: number }>({ _id: 0, a: true });
    * // Flexible way
    * const docs: FindCursor<Document> = cursor.project({ _id: 0, a: true });
    * ```
    *
    * @remarks
    *
    * **Note for Typescript Users:** adding a transform changes the return type of the iteration of this cursor,
    * it **does not** return a new instance of a cursor. This means when calling project,
    * you should always assign the result to a new variable in order to get a correctly typed cursor variable.
    * Take note of the following example:
    *
    * @example
    * ```typescript
    * const cursor: FindCursor<{ a: number; b: string }> = coll.find();
    * const projectCursor = cursor.project<{ a: number }>({ _id: 0, a: true });
    * const aPropOnlyArray: {a: number}[] = await projectCursor.toArray();
    *
    * // or always use chaining and save the final cursor
    *
    * const cursor = coll.find().project<{ a: string }>({
    *   _id: 0,
    *   a: { $convert: { input: '$a', to: 'string' }
    * }});
    * ```
    */
  def project[T /* <: Document */](value: Document): FindCursor[T] = js.native
  
  /**
    * Set the cursor returnKey.
    * If set to true, modifies the cursor to only return the index field or fields for the results of the query, rather than documents.
    * If set to true and the query does not use an index to perform the read operation, the returned documents will not contain any fields.
    *
    * @param value - the returnKey value.
    */
  def returnKey(value: Boolean): this.type = js.native
  
  /**
    * Modifies the output of a query by adding a field $recordId to matching documents. $recordId is the internal key which uniquely identifies a document in a collection.
    *
    * @param value - The $showDiskLoc option has now been deprecated and replaced with the showRecordId field. $showDiskLoc will still be accepted for OP_QUERY stye find.
    */
  def showRecordId(value: Boolean): this.type = js.native
  
  /**
    * Set the skip for the cursor.
    *
    * @param value - The skip for the cursor query.
    */
  def skip(value: scala.Double): this.type = js.native
  
  def sort(sort: String): this.type = js.native
  def sort(sort: String, direction: SortDirection): this.type = js.native
  /**
    * Sets the sort order of the cursor query.
    *
    * @param sort - The key or keys set for the sort.
    * @param direction - The direction of the sorting (1 or -1).
    */
  def sort(sort: Sort): this.type = js.native
  def sort(sort: Sort, direction: SortDirection): this.type = js.native
}
