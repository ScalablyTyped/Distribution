package typings.mongoose.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongoose.anon.FnCallOnfulfilledOnrejected
import typings.mongoose.anon.IncludeArrayIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * section aggregate.js
  * http://mongoosejs.com/docs/api.html#aggregate-js
  */
@js.native
trait Aggregate[T] extends js.Object {
  
  /** Adds a cursor flag */
  def addCursorFlag(flag: String, value: Boolean): this.type = js.native
  
  /**
    * Appends a new $addFields operator to this aggregate pipeline. Requires MongoDB v3.4+ to work
    * @param arg field specification
    */
  def addFields(arg: js.Any): this.type = js.native
  
  /**
    * Sets the allowDiskUse option for the aggregation query (ignored for < 2.6.0)
    * @param value Should tell server it can use hard drive to store data during aggregation.
    * @param tags optional tags for this query
    */
  def allowDiskUse(value: Boolean): this.type = js.native
  def allowDiskUse(value: Boolean, tags: js.Array[_]): this.type = js.native
  
  /**
    * Appends new operators to this aggregate pipeline
    * @param ops operator(s) to append
    */
  def append(ops: js.Any*): this.type = js.native
  
  /** Adds a collation. */
  def collation(options: CollationOptions): this.type = js.native
  
  /**
    * Appends a new $count operator to this aggregate pipeline.
    * @param countName name of the count field
    */
  def count(countName: String): this.type = js.native
  
  /**
    * Sets the cursor option option for the aggregation query (ignored for < 2.6.0).
    * Note the different syntax below: .exec() returns a cursor object, and no callback
    * is necessary.
    * @param options set the cursor batch size
    */
  def cursor(options: js.Any): this.type = js.native
  
  // If cursor option is on, could return an object
  /** Executes the aggregate pipeline on the currently bound Model. */
  def exec(): js.Promise[T] | js.Any = js.native
  def exec(callback: js.Function2[/* err */ js.Any, /* result */ T, Unit]): js.Promise[T] | js.Any = js.native
  
  /** Execute the aggregation with explain */
  def explain(): js.Promise[T] = js.native
  def explain(callback: js.Function2[/* err */ js.Any, /* result */ T, Unit]): js.Promise[T] = js.native
  
  /**
    * Appends a new $facet operator to this aggregate pipeline.
    * @param arg $facet operator contents
    */
  def facet(arg: StringDictionary[js.Array[js.Object]]): this.type = js.native
  
  /**
    * Appends new custom $graphLookup operator(s) to this aggregate pipeline, performing a recursive search on a collection.
    * Note that graphLookup can only consume at most 100MB of memory, and does not allow disk use even if { allowDiskUse: true } is specified.
    * @param options options to $graphLookup
    */
  def graphLookup(options: js.Any): this.type = js.native
  
  /**
    * Appends a new custom $group operator to this aggregate pipeline.
    * @param arg $group operator contents
    */
  def group(arg: js.Any): this.type = js.native
  
  def hint(value: String): this.type = js.native
  /**
    * Sets the hint option for the aggregation query (ignored for < 3.6.0)
    * @param value a hint object or the index name
    */
  def hint(value: js.Object): this.type = js.native
  
  /**
    * Appends a new $limit operator to this aggregate pipeline.
    * @param num maximum number of records to pass to the next stage
    */
  def limit(num: Double): this.type = js.native
  
  /**
    * Appends new custom $lookup operator(s) to this aggregate pipeline.
    * @param options to $lookup as described in the above link
    */
  def lookup(options: js.Any): this.type = js.native
  
  /**
    * Appends a new custom $match operator to this aggregate pipeline.
    * @param arg $match operator contents
    */
  def `match`(arg: js.Any): this.type = js.native
  
  /**
    * Binds this aggregate to a model.
    * @param model the model to which the aggregate is to be bound
    */
  def model(model: js.Any): this.type = js.native
  
  /**
    * Appends a new $geoNear operator to this aggregate pipeline.
    * MUST be used as the first operator in the pipeline.
    */
  def near(parameters: js.Any): this.type = js.native
  
  /**
    * Lets you set arbitrary options, for middleware or plugins.
    * @param value  keys to merge into current options
    */
  def option(value: js.Any): this.type = js.native
  
  /** Returns the current pipeline */
  def pipeline(): js.Array[_] = js.native
  
  /**
    * Appends a new $project operator to this aggregate pipeline.
    * Mongoose query selection syntax is also supported.
    * @param arg field specification
    */
  def project(arg: String): this.type = js.native
  def project(arg: js.Any): this.type = js.native
  
  /**
    * Sets the readPreference option for the aggregation query.
    * @param pref one of the listed preference options or their aliases
    * @param tags optional tags for this query
    */
  def read(pref: String): this.type = js.native
  def read(pref: String, tags: js.Array[_]): this.type = js.native
  
  /**
    * Appends a new $replaceRoot operator to this aggregate pipeline.
    * Note that the $replaceRoot operator requires field strings to start with '$'. If you are passing in a string Mongoose will prepend '$' if the specified field doesn't start '$'. If you are passing in an object the strings in your expression will not be altered.
    * @param newRoot field or document which will become the new root document
    */
  def replaceRoot(newRoot: String): this.type = js.native
  def replaceRoot(newRoot: js.Object): this.type = js.native
  
  /**
    * Appends new custom $sample operator(s) to this aggregate pipeline.
    * @param size number of random documents to pick
    */
  def sample(size: Double): this.type = js.native
  
  def session(): this.type = js.native
  def session(session: typings.mongodb.mod.ClientSession): this.type = js.native
  
  /**
    * Appends a new $skip operator to this aggregate pipeline.
    * @param num number of records to skip before next stage
    */
  def skip(num: Double): this.type = js.native
  
  /**
    * Appends a new $sort operator to this aggregate pipeline.
    * If an object is passed, values allowed are asc, desc, ascending, descending, 1, and -1.
    * If a string is passed, it must be a space delimited list of path names. The sort order
    * of each path is ascending unless the path name is prefixed with - which will be treated
    * as descending.
    */
  def sort(arg: String): this.type = js.native
  def sort(arg: js.Any): this.type = js.native
  
  /** Provides promise for aggregate. */
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  /** Provides promise for aggregate. */
  def `then`[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  /** Provides promise for aggregate. */
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
  /** Provides promise for aggregate. */
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  /** Provides promise for aggregate. */
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  /** Provides promise for aggregate. */
  @JSName("then")
  var then_Original: FnCallOnfulfilledOnrejected[T] = js.native
  
  /**
    * Appends new custom $unwind operator(s) to this aggregate pipeline.
    * Note that the $unwind operator requires the path name to start with '$'.
    * Mongoose will prepend '$' if the specified field doesn't start '$'.
    * @param fields the field(s) to unwind
    */
  /**
    * Appends new custom $unwind operator(s) to this aggregate pipeline
    * new in mongodb 3.2
    */
  def unwind(fields: (IncludeArrayIndex | String)*): this.type = js.native
}
