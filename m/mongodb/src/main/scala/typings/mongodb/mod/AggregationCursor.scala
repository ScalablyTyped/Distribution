package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.Coll
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "AggregationCursor")
@js.native
open class AggregationCursor[TSchema] () extends AbstractCursor[TSchema, AbstractCursorEvents] {
  def this(options: EventEmitterOptions) = this()
  
  /* Excluded from this release type: _initialize */
  /** Execute the explain for the cursor */
  def explain(): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def explain(callback: Callback[Any]): Unit = js.native
  def explain(verbosity: ExplainVerbosityLike): js.Promise[Document] = js.native
  
  /** @deprecated Add a geoNear stage to the aggregation pipeline */
  def geoNear($geoNear: Document): this.type = js.native
  
  /** Add a group stage to the aggregation pipeline */
  def group[T]($group: Document): AggregationCursor[T] = js.native
  
  /** Add a limit stage to the aggregation pipeline */
  def limit($limit: scala.Double): this.type = js.native
  
  /** Add a lookup stage to the aggregation pipeline */
  def lookup($lookup: Document): this.type = js.native
  
  /** Add a match stage to the aggregation pipeline */
  def `match`($match: Document): this.type = js.native
  
  def out($out: String): this.type = js.native
  /** Add an out stage to the aggregation pipeline */
  def out($out: Coll): this.type = js.native
  
  /* Excluded from this release type: [kPipeline] */
  /* Excluded from this release type: [kOptions] */
  /* Excluded from this release type: __constructor */
  def pipeline: js.Array[Document] = js.native
  
  /**
    * Add a project stage to the aggregation pipeline
    *
    * @remarks
    * In order to strictly type this function you must provide an interface
    * that represents the effect of your projection on the result documents.
    *
    * By default chaining a projection to your cursor changes the returned type to the generic {@link Document} type.
    * You should specify a parameterized type to have assertions on your final results.
    *
    * @example
    * ```typescript
    * // Best way
    * const docs: AggregationCursor<{ a: number }> = cursor.project<{ a: number }>({ _id: 0, a: true });
    * // Flexible way
    * const docs: AggregationCursor<Document> = cursor.project({ _id: 0, a: true });
    * ```
    *
    * @remarks
    * In order to strictly type this function you must provide an interface
    * that represents the effect of your projection on the result documents.
    *
    * **Note for Typescript Users:** adding a transform changes the return type of the iteration of this cursor,
    * it **does not** return a new instance of a cursor. This means when calling project,
    * you should always assign the result to a new variable in order to get a correctly typed cursor variable.
    * Take note of the following example:
    *
    * @example
    * ```typescript
    * const cursor: AggregationCursor<{ a: number; b: string }> = coll.aggregate([]);
    * const projectCursor = cursor.project<{ a: number }>({ _id: 0, a: true });
    * const aPropOnlyArray: {a: number}[] = await projectCursor.toArray();
    *
    * // or always use chaining and save the final cursor
    *
    * const cursor = coll.aggregate().project<{ a: string }>({
    *   _id: 0,
    *   a: { $convert: { input: '$a', to: 'string' }
    * }});
    * ```
    */
  def project[T /* <: Document */]($project: Document): AggregationCursor[T] = js.native
  
  /** Add a redact stage to the aggregation pipeline */
  def redact($redact: Document): this.type = js.native
  
  /** Add a skip stage to the aggregation pipeline */
  def skip($skip: scala.Double): this.type = js.native
  
  /** Add a sort stage to the aggregation pipeline */
  def sort($sort: Sort): this.type = js.native
  
  def unwind($unwind: String): this.type = js.native
  /** Add a unwind stage to the aggregation pipeline */
  def unwind($unwind: Document): this.type = js.native
}
