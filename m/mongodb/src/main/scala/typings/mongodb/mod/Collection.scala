package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.mongodbStrings._id
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Collection")
@js.native
open class Collection[TSchema /* <: Document */] () extends StObject {
  
  /**
    * Execute an aggregation framework pipeline against the collection, needs MongoDB \>= 2.2
    *
    * @param pipeline - An array of aggregation pipelines to execute
    * @param options - Optional settings for the command
    */
  def aggregate[T /* <: Document */](): AggregationCursor[T] = js.native
  def aggregate[T /* <: Document */](pipeline: js.Array[Document]): AggregationCursor[T] = js.native
  def aggregate[T /* <: Document */](pipeline: js.Array[Document], options: AggregateOptions): AggregationCursor[T] = js.native
  def aggregate[T /* <: Document */](pipeline: Unit, options: AggregateOptions): AggregationCursor[T] = js.native
  
  def bsonOptions: BSONSerializeOptions = js.native
  
  /**
    * Perform a bulkWrite operation without a fluent API
    *
    * Legal operation types are
    * - `insertOne`
    * - `replaceOne`
    * - `updateOne`
    * - `updateMany`
    * - `deleteOne`
    * - `deleteMany`
    *
    * Please note that raw operations are no longer accepted as of driver version 4.0.
    *
    * If documents passed in do not contain the **_id** field,
    * one will be added to each of the documents missing it by the driver, mutating the document. This behavior
    * can be overridden by setting the **forceServerObjectId** flag.
    *
    * @param operations - Bulk operations to perform
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    * @throws MongoDriverError if operations is not an array
    */
  def bulkWrite(operations: js.Array[AnyBulkWriteOperation[TSchema]]): js.Promise[BulkWriteResult] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def bulkWrite(operations: js.Array[AnyBulkWriteOperation[TSchema]], callback: Callback[BulkWriteResult]): Unit = js.native
  def bulkWrite(operations: js.Array[AnyBulkWriteOperation[TSchema]], options: BulkWriteOptions): js.Promise[BulkWriteResult] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def bulkWrite(
    operations: js.Array[AnyBulkWriteOperation[TSchema]],
    options: BulkWriteOptions,
    callback: Callback[BulkWriteResult]
  ): Unit = js.native
  
  /**
    * The name of this collection
    */
  def collectionName: String = js.native
  
  /**
    * An estimated count of matching documents in the db to a filter.
    *
    * **NOTE:** This method has been deprecated, since it does not provide an accurate count of the documents
    * in a collection. To obtain an accurate count of documents in the collection, use {@link Collection#countDocuments| countDocuments}.
    * To obtain an estimated count of all documents in the collection, use {@link Collection#estimatedDocumentCount| estimatedDocumentCount}.
    *
    * @deprecated use {@link Collection#countDocuments| countDocuments} or {@link Collection#estimatedDocumentCount| estimatedDocumentCount} instead
    *
    * @param filter - The filter for the count.
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def count(): js.Promise[scala.Double] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def count(callback: Callback[scala.Double]): Unit = js.native
  def count(filter: Filter[TSchema]): js.Promise[scala.Double] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def count(filter: Filter[TSchema], callback: Callback[scala.Double]): Unit = js.native
  def count(filter: Filter[TSchema], options: CountOptions): js.Promise[scala.Double] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def count(filter: Filter[TSchema], options: CountOptions, callback: Callback[scala.Double]): js.Promise[scala.Double] | Unit = js.native
  
  /**
    * Gets the number of documents matching the filter.
    * For a fast count of the total documents in a collection see {@link Collection#estimatedDocumentCount| estimatedDocumentCount}.
    * **Note**: When migrating from {@link Collection#count| count} to {@link Collection#countDocuments| countDocuments}
    * the following query operators must be replaced:
    *
    * | Operator | Replacement |
    * | -------- | ----------- |
    * | `$where`   | [`$expr`][1] |
    * | `$near`    | [`$geoWithin`][2] with [`$center`][3] |
    * | `$nearSphere` | [`$geoWithin`][2] with [`$centerSphere`][4] |
    *
    * [1]: https://docs.mongodb.com/manual/reference/operator/query/expr/
    * [2]: https://docs.mongodb.com/manual/reference/operator/query/geoWithin/
    * [3]: https://docs.mongodb.com/manual/reference/operator/query/center/#op._S_center
    * [4]: https://docs.mongodb.com/manual/reference/operator/query/centerSphere/#op._S_centerSphere
    *
    * @param filter - The filter for the count
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    *
    * @see https://docs.mongodb.com/manual/reference/operator/query/expr/
    * @see https://docs.mongodb.com/manual/reference/operator/query/geoWithin/
    * @see https://docs.mongodb.com/manual/reference/operator/query/center/#op._S_center
    * @see https://docs.mongodb.com/manual/reference/operator/query/centerSphere/#op._S_centerSphere
    */
  def countDocuments(): js.Promise[scala.Double] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def countDocuments(callback: Callback[scala.Double]): Unit = js.native
  def countDocuments(filter: Filter[TSchema]): js.Promise[scala.Double] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def countDocuments(filter: Filter[TSchema], callback: Callback[scala.Double]): Unit = js.native
  def countDocuments(filter: Filter[TSchema], options: CountDocumentsOptions): js.Promise[scala.Double] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def countDocuments(filter: Filter[TSchema], options: CountDocumentsOptions, callback: Callback[scala.Double]): Unit = js.native
  
  /**
    * Creates an index on the db and collection collection.
    *
    * @param indexSpec - The field name or index specification to create an index for
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    *
    * @example
    * ```ts
    * const collection = client.db('foo').collection('bar');
    *
    * await collection.createIndex({ a: 1, b: -1 });
    *
    * // Alternate syntax for { c: 1, d: -1 } that ensures order of indexes
    * await collection.createIndex([ [c, 1], [d, -1] ]);
    *
    * // Equivalent to { e: 1 }
    * await collection.createIndex('e');
    *
    * // Equivalent to { f: 1, g: 1 }
    * await collection.createIndex(['f', 'g'])
    *
    * // Equivalent to { h: 1, i: -1 }
    * await collection.createIndex([ { h: 1 }, { i: -1 } ]);
    *
    * // Equivalent to { j: 1, k: -1, l: 2d }
    * await collection.createIndex(['j', ['k', -1], { l: '2d' }])
    * ```
    */
  def createIndex(indexSpec: IndexSpecification): js.Promise[String] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def createIndex(indexSpec: IndexSpecification, callback: Callback[String]): Unit = js.native
  def createIndex(indexSpec: IndexSpecification, options: CreateIndexesOptions): js.Promise[String] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def createIndex(indexSpec: IndexSpecification, options: CreateIndexesOptions, callback: Callback[String]): Unit = js.native
  
  /**
    * Creates multiple indexes in the collection, this method is only supported for
    * MongoDB 2.6 or higher. Earlier version of MongoDB will throw a command not supported
    * error.
    *
    * **Note**: Unlike {@link Collection#createIndex| createIndex}, this function takes in raw index specifications.
    * Index specifications are defined {@link http://docs.mongodb.org/manual/reference/command/createIndexes/| here}.
    *
    * @param indexSpecs - An array of index specifications to be created
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    *
    * @example
    * ```ts
    * const collection = client.db('foo').collection('bar');
    * await collection.createIndexes([
    *   // Simple index on field fizz
    *   {
    *     key: { fizz: 1 },
    *   }
    *   // wildcard index
    *   {
    *     key: { '$**': 1 }
    *   },
    *   // named index on darmok and jalad
    *   {
    *     key: { darmok: 1, jalad: -1 }
    *     name: 'tanagra'
    *   }
    * ]);
    * ```
    */
  def createIndexes(indexSpecs: js.Array[IndexDescription]): js.Promise[js.Array[String]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def createIndexes(indexSpecs: js.Array[IndexDescription], callback: Callback[js.Array[String]]): Unit = js.native
  def createIndexes(indexSpecs: js.Array[IndexDescription], options: CreateIndexesOptions): js.Promise[js.Array[String]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def createIndexes(
    indexSpecs: js.Array[IndexDescription],
    options: CreateIndexesOptions,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  
  /* Excluded from this release type: s */
  /* Excluded from this release type: __constructor */
  /**
    * The name of the database this collection belongs to
    */
  def dbName: String = js.native
  
  /**
    * Delete multiple documents from a collection
    *
    * @param filter - The filter used to select the documents to remove
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def deleteMany(filter: Filter[TSchema]): js.Promise[DeleteResult] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def deleteMany(filter: Filter[TSchema], callback: Callback[DeleteResult]): Unit = js.native
  def deleteMany(filter: Filter[TSchema], options: DeleteOptions): js.Promise[DeleteResult] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def deleteMany(filter: Filter[TSchema], options: DeleteOptions, callback: Callback[DeleteResult]): Unit = js.native
  
  /**
    * Delete a document from a collection
    *
    * @param filter - The filter used to select the document to remove
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def deleteOne(filter: Filter[TSchema]): js.Promise[DeleteResult] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def deleteOne(filter: Filter[TSchema], callback: Callback[DeleteResult]): Unit = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def deleteOne(filter: Filter[TSchema], options: DeleteOptions): Unit = js.native
  def deleteOne(filter: Filter[TSchema], options: DeleteOptions, callback: Callback[DeleteResult]): Unit = js.native
  @JSName("deleteOne")
  def deleteOne_Promise(filter: Filter[TSchema], options: DeleteOptions): js.Promise[DeleteResult] = js.native
  
  def distinct(key: String): js.Promise[js.Array[Any]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def distinct(key: String, callback: Callback[js.Array[Any]]): Unit = js.native
  def distinct(key: String, filter: Filter[TSchema]): js.Promise[js.Array[Any]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def distinct(key: String, filter: Filter[TSchema], callback: Callback[js.Array[Any]]): Unit = js.native
  def distinct(key: String, filter: Filter[TSchema], options: DistinctOptions): js.Promise[js.Array[Any]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def distinct(key: String, filter: Filter[TSchema], options: DistinctOptions, callback: Callback[js.Array[Any]]): Unit = js.native
  /**
    * The distinct command returns a list of distinct values for the given key across a collection.
    *
    * @param key - Field of the document to find distinct values for
    * @param filter - The filter for filtering the set of documents to which we apply the distinct filter.
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  @JSName("distinct")
  def distinct_id(key: _id): js.Promise[js.Array[Flatten[InferIdType[TSchema]]]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  @JSName("distinct")
  def distinct_id(key: _id, callback: Callback[js.Array[Flatten[InferIdType[TSchema]]]]): Unit = js.native
  @JSName("distinct")
  def distinct_id(key: _id, filter: Filter[TSchema]): js.Promise[js.Array[Flatten[InferIdType[TSchema]]]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  @JSName("distinct")
  def distinct_id(key: _id, filter: Filter[TSchema], callback: Callback[js.Array[Flatten[InferIdType[TSchema]]]]): Unit = js.native
  @JSName("distinct")
  def distinct_id(key: _id, filter: Filter[TSchema], options: DistinctOptions): js.Promise[js.Array[Flatten[InferIdType[TSchema]]]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  @JSName("distinct")
  def distinct_id(
    key: _id,
    filter: Filter[TSchema],
    options: DistinctOptions,
    callback: Callback[js.Array[Flatten[InferIdType[TSchema]]]]
  ): Unit = js.native
  
  /**
    * Drop the collection from the database, removing it permanently. New accesses will create a new collection.
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def drop(): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def drop(callback: Callback[Boolean]): Unit = js.native
  def drop(options: DropCollectionOptions): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def drop(options: DropCollectionOptions, callback: Callback[Boolean]): Unit = js.native
  
  /**
    * Drops an index from this collection.
    *
    * @param indexName - Name of the index to drop.
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def dropIndex(indexName: String): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def dropIndex(indexName: String, callback: Callback[Document]): Unit = js.native
  def dropIndex(indexName: String, options: DropIndexesOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def dropIndex(indexName: String, options: DropIndexesOptions, callback: Callback[Document]): Unit = js.native
  
  /**
    * Drops all indexes from this collection.
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def dropIndexes(): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def dropIndexes(callback: Callback[Document]): Unit = js.native
  def dropIndexes(options: DropIndexesOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def dropIndexes(options: DropIndexesOptions, callback: Callback[Document]): Unit = js.native
  
  /**
    * Gets an estimate of the count of documents in a collection using collection metadata.
    * This will always run a count command on all server versions.
    *
    * due to an oversight in versions 5.0.0-5.0.8 of MongoDB, the count command,
    * which estimatedDocumentCount uses in its implementation, was not included in v1 of
    * the Stable API, and so users of the Stable API with estimatedDocumentCount are
    * recommended to upgrade their server version to 5.0.9+ or set apiStrict: false to avoid
    * encountering errors.
    *
    * @see {@link https://www.mongodb.com/docs/manual/reference/command/count/#behavior|Count: Behavior}
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def estimatedDocumentCount(): js.Promise[scala.Double] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def estimatedDocumentCount(callback: Callback[scala.Double]): Unit = js.native
  def estimatedDocumentCount(options: EstimatedDocumentCountOptions): js.Promise[scala.Double] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def estimatedDocumentCount(options: EstimatedDocumentCountOptions, callback: Callback[scala.Double]): Unit = js.native
  
  /**
    * Creates a cursor for a filter that can be used to iterate over results from MongoDB
    *
    * @param filter - The filter predicate. If unspecified, then all documents in the collection will match the predicate
    */
  def find(): FindCursor[WithId[TSchema]] = js.native
  def find(filter: Filter[TSchema]): FindCursor[WithId[TSchema]] = js.native
  def find(filter: Filter[TSchema], options: FindOptions[Document]): FindCursor[WithId[TSchema]] = js.native
  
  /**
    * Fetches the first document that matches the filter
    *
    * @param filter - Query for find Operation
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def findOne(): js.Promise[WithId[TSchema] | Null] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def findOne(callback: Callback[WithId[TSchema] | Null]): Unit = js.native
  def findOne(filter: Filter[TSchema]): js.Promise[WithId[TSchema] | Null] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def findOne(filter: Filter[TSchema], callback: Callback[WithId[TSchema] | Null]): Unit = js.native
  def findOne(filter: Filter[TSchema], options: FindOptions[Document]): js.Promise[WithId[TSchema] | Null] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def findOne(
    filter: Filter[TSchema],
    options: FindOptions[Document],
    callback: Callback[WithId[TSchema] | Null]
  ): Unit = js.native
  def findOne[T](filter: Filter[TSchema], options: Unit, callback: Callback[T | Null]): Unit = js.native
  
  /**
    * Find a document and delete it in one atomic operation. Requires a write lock for the duration of the operation.
    *
    * @param filter - The filter used to select the document to remove
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def findOneAndDelete(filter: Filter[TSchema]): js.Promise[ModifyResult[TSchema]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def findOneAndDelete(filter: Filter[TSchema], callback: Callback[ModifyResult[TSchema]]): Unit = js.native
  def findOneAndDelete(filter: Filter[TSchema], options: FindOneAndDeleteOptions): js.Promise[ModifyResult[TSchema]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def findOneAndDelete(
    filter: Filter[TSchema],
    options: FindOneAndDeleteOptions,
    callback: Callback[ModifyResult[TSchema]]
  ): Unit = js.native
  
  /**
    * Find a document and replace it in one atomic operation. Requires a write lock for the duration of the operation.
    *
    * @param filter - The filter used to select the document to replace
    * @param replacement - The Document that replaces the matching document
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def findOneAndReplace(filter: Filter[TSchema], replacement: WithoutId[TSchema]): js.Promise[ModifyResult[TSchema]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def findOneAndReplace(
    filter: Filter[TSchema],
    replacement: WithoutId[TSchema],
    callback: Callback[ModifyResult[TSchema]]
  ): Unit = js.native
  def findOneAndReplace(filter: Filter[TSchema], replacement: WithoutId[TSchema], options: FindOneAndReplaceOptions): js.Promise[ModifyResult[TSchema]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def findOneAndReplace(
    filter: Filter[TSchema],
    replacement: WithoutId[TSchema],
    options: FindOneAndReplaceOptions,
    callback: Callback[ModifyResult[TSchema]]
  ): Unit = js.native
  
  /**
    * Find a document and update it in one atomic operation. Requires a write lock for the duration of the operation.
    *
    * @param filter - The filter used to select the document to update
    * @param update - Update operations to be performed on the document
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def findOneAndUpdate(filter: Filter[TSchema], update: UpdateFilter[TSchema]): js.Promise[ModifyResult[TSchema]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def findOneAndUpdate(filter: Filter[TSchema], update: UpdateFilter[TSchema], callback: Callback[ModifyResult[TSchema]]): Unit = js.native
  def findOneAndUpdate(filter: Filter[TSchema], update: UpdateFilter[TSchema], options: FindOneAndUpdateOptions): js.Promise[ModifyResult[TSchema]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def findOneAndUpdate(
    filter: Filter[TSchema],
    update: UpdateFilter[TSchema],
    options: FindOneAndUpdateOptions,
    callback: Callback[ModifyResult[TSchema]]
  ): Unit = js.native
  
  @JSName("findOne")
  def findOne_T[T](): js.Promise[T | Null] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  @JSName("findOne")
  def findOne_T[T](callback: Callback[T | Null]): Unit = js.native
  @JSName("findOne")
  def findOne_T[T](filter: Filter[TSchema]): js.Promise[T | Null] = js.native
  @JSName("findOne")
  def findOne_T[T](filter: Filter[TSchema], options: FindOptions[Document]): js.Promise[T | Null] = js.native
  @JSName("findOne")
  def findOne_T[T](filter: Filter[TSchema], options: FindOptions[Document], callback: Callback[T | Null]): Unit = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  @JSName("findOne")
  def findOne_T_Unit[T](filter: Filter[TSchema]): Unit = js.native
  @JSName("findOne")
  def findOne_T_Unit[T](filter: Filter[TSchema], options: FindOptions[Document]): Unit = js.native
  
  @JSName("find")
  def find_T[T /* <: Document */](filter: Filter[TSchema]): FindCursor[T] = js.native
  @JSName("find")
  def find_T[T /* <: Document */](filter: Filter[TSchema], options: FindOptions[Document]): FindCursor[T] = js.native
  
  /** Get the db scoped logger */
  def getLogger(): Logger = js.native
  
  /** The current index hint for the collection */
  def hint: js.UndefOr[Hint] = js.native
  def hint_=(v: js.UndefOr[Hint]): Unit = js.native
  
  /**
    * Checks if one or more indexes exist on the collection, fails on first non-existing index
    *
    * @param indexes - One or more index names to check.
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def indexExists(indexes: String): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def indexExists(indexes: String, callback: Callback[Boolean]): Unit = js.native
  def indexExists(indexes: String, options: IndexInformationOptions): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def indexExists(indexes: String, options: IndexInformationOptions, callback: Callback[Boolean]): Unit = js.native
  def indexExists(indexes: js.Array[String]): js.Promise[Boolean] = js.native
  def indexExists(indexes: js.Array[String], callback: Callback[Boolean]): Unit = js.native
  def indexExists(indexes: js.Array[String], options: IndexInformationOptions): js.Promise[Boolean] = js.native
  def indexExists(indexes: js.Array[String], options: IndexInformationOptions, callback: Callback[Boolean]): Unit = js.native
  
  /**
    * Retrieves this collections index info.
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def indexInformation(): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def indexInformation(callback: Callback[Document]): Unit = js.native
  def indexInformation(options: IndexInformationOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def indexInformation(options: IndexInformationOptions, callback: Callback[Document]): Unit = js.native
  
  /**
    * Retrieve all the indexes on the collection.
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def indexes(): js.Promise[js.Array[Document]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def indexes(callback: Callback[js.Array[Document]]): Unit = js.native
  def indexes(options: IndexInformationOptions): js.Promise[js.Array[Document]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def indexes(options: IndexInformationOptions, callback: Callback[js.Array[Document]]): Unit = js.native
  
  /**
    * Initiate an In order bulk write operation. Operations will be serially executed in the order they are added, creating a new operation for each switch in types.
    *
    * @throws MongoNotConnectedError
    * @remarks
    * **NOTE:** MongoClient must be connected prior to calling this method due to a known limitation in this legacy implemenation.
    * However, `collection.bulkWrite()` provides an equivalent API that does not require prior connecting.
    */
  def initializeOrderedBulkOp(): OrderedBulkOperation = js.native
  def initializeOrderedBulkOp(options: BulkWriteOptions): OrderedBulkOperation = js.native
  
  /**
    * Initiate an Out of order batch write operation. All operations will be buffered into insert/update/remove commands executed out of order.
    *
    * @throws MongoNotConnectedError
    * @remarks
    * **NOTE:** MongoClient must be connected prior to calling this method due to a known limitation in this legacy implemenation.
    * However, `collection.bulkWrite()` provides an equivalent API that does not require prior connecting.
    */
  def initializeUnorderedBulkOp(): UnorderedBulkOperation = js.native
  def initializeUnorderedBulkOp(options: BulkWriteOptions): UnorderedBulkOperation = js.native
  
  /**
    * Inserts a single document or a an array of documents into MongoDB. If documents passed in do not contain the **_id** field,
    * one will be added to each of the documents missing it by the driver, mutating the document. This behavior
    * can be overridden by setting the **forceServerObjectId** flag.
    *
    * @deprecated Use insertOne, insertMany or bulkWrite instead. Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance
    * @param docs - The documents to insert
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def insert(
    docs: js.Array[OptionalUnlessRequiredId[TSchema]],
    options: BulkWriteOptions,
    callback: Callback[InsertManyResult[TSchema]]
  ): js.Promise[InsertManyResult[TSchema]] | Unit = js.native
  
  /**
    * Inserts an array of documents into MongoDB. If documents passed in do not contain the **_id** field,
    * one will be added to each of the documents missing it by the driver, mutating the document. This behavior
    * can be overridden by setting the **forceServerObjectId** flag.
    *
    * @param docs - The documents to insert
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def insertMany(docs: js.Array[OptionalUnlessRequiredId[TSchema]]): js.Promise[InsertManyResult[TSchema]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def insertMany(docs: js.Array[OptionalUnlessRequiredId[TSchema]], callback: Callback[InsertManyResult[TSchema]]): Unit = js.native
  def insertMany(docs: js.Array[OptionalUnlessRequiredId[TSchema]], options: BulkWriteOptions): js.Promise[InsertManyResult[TSchema]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def insertMany(
    docs: js.Array[OptionalUnlessRequiredId[TSchema]],
    options: BulkWriteOptions,
    callback: Callback[InsertManyResult[TSchema]]
  ): Unit = js.native
  
  /**
    * Inserts a single document into MongoDB. If documents passed in do not contain the **_id** field,
    * one will be added to each of the documents missing it by the driver, mutating the document. This behavior
    * can be overridden by setting the **forceServerObjectId** flag.
    *
    * @param doc - The document to insert
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def insertOne(doc: OptionalUnlessRequiredId[TSchema]): js.Promise[InsertOneResult[TSchema]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def insertOne(doc: OptionalUnlessRequiredId[TSchema], callback: Callback[InsertOneResult[TSchema]]): Unit = js.native
  def insertOne(doc: OptionalUnlessRequiredId[TSchema], options: InsertOneOptions): js.Promise[InsertOneResult[TSchema]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def insertOne(
    doc: OptionalUnlessRequiredId[TSchema],
    options: InsertOneOptions,
    callback: Callback[InsertOneResult[TSchema]]
  ): Unit = js.native
  
  /**
    * Returns if the collection is a capped collection
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def isCapped(): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def isCapped(callback: Callback[Boolean]): Unit = js.native
  def isCapped(options: OperationOptions): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def isCapped(options: OperationOptions, callback: Callback[Boolean]): Unit = js.native
  
  /**
    * Get the list of all indexes information for the collection.
    *
    * @param options - Optional settings for the command
    */
  def listIndexes(): ListIndexesCursor = js.native
  def listIndexes(options: ListIndexesOptions): ListIndexesCursor = js.native
  
  def logger: Logger = js.native
  
  /**
    * Run Map Reduce across a collection. Be aware that the inline option for out will return an array of results not a collection.
    *
    * @deprecated collection.mapReduce is deprecated. Use the aggregation pipeline instead. Visit https://docs.mongodb.com/manual/reference/map-reduce-to-aggregation-pipeline for more information on how to translate map-reduce operations to the aggregation pipeline.
    * @param map - The mapping function.
    * @param reduce - The reduce function.
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def mapReduce[TKey, TValue](map: String, reduce: String): js.Promise[Document | js.Array[Document]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def mapReduce[TKey, TValue](map: String, reduce: String, callback: Callback[Document | js.Array[Document]]): Unit = js.native
  def mapReduce[TKey, TValue](map: String, reduce: String, options: MapReduceOptions[TKey, TValue]): js.Promise[Document | js.Array[Document]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def mapReduce[TKey, TValue](
    map: String,
    reduce: String,
    options: MapReduceOptions[TKey, TValue],
    callback: Callback[Document | js.Array[Document]]
  ): Unit = js.native
  def mapReduce[TKey, TValue](map: String, reduce: ReduceFunction[TKey, TValue]): js.Promise[Document | js.Array[Document]] = js.native
  def mapReduce[TKey, TValue](
    map: String,
    reduce: ReduceFunction[TKey, TValue],
    callback: Callback[Document | js.Array[Document]]
  ): Unit = js.native
  def mapReduce[TKey, TValue](map: String, reduce: ReduceFunction[TKey, TValue], options: MapReduceOptions[TKey, TValue]): js.Promise[Document | js.Array[Document]] = js.native
  def mapReduce[TKey, TValue](
    map: String,
    reduce: ReduceFunction[TKey, TValue],
    options: MapReduceOptions[TKey, TValue],
    callback: Callback[Document | js.Array[Document]]
  ): Unit = js.native
  def mapReduce[TKey, TValue](map: MapFunction[TSchema], reduce: String): js.Promise[Document | js.Array[Document]] = js.native
  def mapReduce[TKey, TValue](map: MapFunction[TSchema], reduce: String, callback: Callback[Document | js.Array[Document]]): Unit = js.native
  def mapReduce[TKey, TValue](map: MapFunction[TSchema], reduce: String, options: MapReduceOptions[TKey, TValue]): js.Promise[Document | js.Array[Document]] = js.native
  def mapReduce[TKey, TValue](
    map: MapFunction[TSchema],
    reduce: String,
    options: MapReduceOptions[TKey, TValue],
    callback: Callback[Document | js.Array[Document]]
  ): Unit = js.native
  def mapReduce[TKey, TValue](map: MapFunction[TSchema], reduce: ReduceFunction[TKey, TValue]): js.Promise[Document | js.Array[Document]] = js.native
  def mapReduce[TKey, TValue](
    map: MapFunction[TSchema],
    reduce: ReduceFunction[TKey, TValue],
    callback: Callback[Document | js.Array[Document]]
  ): Unit = js.native
  def mapReduce[TKey, TValue](
    map: MapFunction[TSchema],
    reduce: ReduceFunction[TKey, TValue],
    options: MapReduceOptions[TKey, TValue]
  ): js.Promise[Document | js.Array[Document]] = js.native
  def mapReduce[TKey, TValue](
    map: MapFunction[TSchema],
    reduce: ReduceFunction[TKey, TValue],
    options: MapReduceOptions[TKey, TValue],
    callback: Callback[Document | js.Array[Document]]
  ): Unit = js.native
  
  /**
    * The namespace of this collection, in the format `${this.dbName}.${this.collectionName}`
    */
  def namespace: String = js.native
  
  /**
    * Returns the options of the collection.
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def options(): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def options(callback: Callback[Document]): Unit = js.native
  def options(options: OperationOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def options(options: OperationOptions, callback: Callback[Document]): Unit = js.native
  
  /**
    * The current readConcern of the collection. If not explicitly defined for
    * this collection, will be inherited from the parent DB
    */
  def readConcern: js.UndefOr[ReadConcern] = js.native
  
  /**
    * The current readPreference of the collection. If not explicitly defined for
    * this collection, will be inherited from the parent DB
    */
  def readPreference: js.UndefOr[ReadPreference] = js.native
  
  /**
    * Remove documents.
    *
    * @deprecated use deleteOne, deleteMany or bulkWrite. Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance
    * @param filter - The filter for the remove operation.
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def remove(filter: Filter[TSchema], options: DeleteOptions, callback: Callback[Any]): js.Promise[DeleteResult] | Unit = js.native
  
  /**
    * Rename the collection.
    *
    * @remarks
    * This operation does not inherit options from the Db or MongoClient.
    *
    * @param newName - New name of of the collection.
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def rename(newName: String): js.Promise[Collection[Document]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def rename(newName: String, callback: Callback[Collection[Document]]): Unit = js.native
  def rename(newName: String, options: RenameOptions): js.Promise[Collection[Document]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def rename(newName: String, options: RenameOptions, callback: Callback[Collection[Document]]): Unit = js.native
  
  /**
    * Replace a document in a collection with another document
    *
    * @param filter - The filter used to select the document to replace
    * @param replacement - The Document that replaces the matching document
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def replaceOne(filter: Filter[TSchema], replacement: WithoutId[TSchema]): js.Promise[UpdateResult | Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def replaceOne(
    filter: Filter[TSchema],
    replacement: WithoutId[TSchema],
    callback: Callback[UpdateResult | Document]
  ): Unit = js.native
  def replaceOne(filter: Filter[TSchema], replacement: WithoutId[TSchema], options: ReplaceOptions): js.Promise[UpdateResult | Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def replaceOne(
    filter: Filter[TSchema],
    replacement: WithoutId[TSchema],
    options: ReplaceOptions,
    callback: Callback[UpdateResult | Document]
  ): Unit = js.native
  
  /**
    * Get all the collection statistics.
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def stats(): js.Promise[CollStats] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def stats(callback: Callback[CollStats]): Unit = js.native
  def stats(options: CollStatsOptions): js.Promise[CollStats] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def stats(options: CollStatsOptions, callback: Callback[CollStats]): Unit = js.native
  
  /**
    * Updates documents.
    *
    * @deprecated use updateOne, updateMany or bulkWrite. Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance
    * @param filter - The filter for the update operation.
    * @param update - The update operations to be applied to the documents
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def update(
    filter: Filter[TSchema],
    update: UpdateFilter[TSchema],
    options: UpdateOptions,
    callback: Callback[Document]
  ): js.Promise[UpdateResult] | Unit = js.native
  
  /**
    * Update multiple documents in a collection
    *
    * @param filter - The filter used to select the documents to update
    * @param update - The update operations to be applied to the documents
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def updateMany(filter: Filter[TSchema], update: UpdateFilter[TSchema]): js.Promise[UpdateResult | Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def updateMany(
    filter: Filter[TSchema],
    update: UpdateFilter[TSchema],
    callback: Callback[UpdateResult | Document]
  ): Unit = js.native
  def updateMany(filter: Filter[TSchema], update: UpdateFilter[TSchema], options: UpdateOptions): js.Promise[UpdateResult | Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def updateMany(
    filter: Filter[TSchema],
    update: UpdateFilter[TSchema],
    options: UpdateOptions,
    callback: Callback[UpdateResult | Document]
  ): Unit = js.native
  
  /**
    * Update a single document in a collection
    *
    * @param filter - The filter used to select the document to update
    * @param update - The update operations to be applied to the document
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def updateOne(filter: Filter[TSchema], update: UpdateFilter[TSchema]): js.Promise[UpdateResult] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def updateOne(filter: Filter[TSchema], update: UpdateFilter[TSchema], callback: Callback[UpdateResult]): Unit = js.native
  def updateOne(filter: Filter[TSchema], update: UpdateFilter[TSchema], options: UpdateOptions): js.Promise[UpdateResult] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def updateOne(
    filter: Filter[TSchema],
    update: UpdateFilter[TSchema],
    options: UpdateOptions,
    callback: Callback[UpdateResult]
  ): Unit = js.native
  def updateOne(filter: Filter[TSchema], update: Partial[TSchema]): js.Promise[UpdateResult] = js.native
  def updateOne(filter: Filter[TSchema], update: Partial[TSchema], callback: Callback[UpdateResult]): Unit = js.native
  def updateOne(filter: Filter[TSchema], update: Partial[TSchema], options: UpdateOptions): js.Promise[UpdateResult] = js.native
  def updateOne(
    filter: Filter[TSchema],
    update: Partial[TSchema],
    options: UpdateOptions,
    callback: Callback[UpdateResult]
  ): Unit = js.native
  
  /**
    * Create a new Change Stream, watching for new changes (insertions, updates, replacements, deletions, and invalidations) in this collection.
    *
    * @remarks
    * watch() accepts two generic arguments for distinct usecases:
    * - The first is to override the schema that may be defined for this specific collection
    * - The second is to override the shape of the change stream document entirely, if it is not provided the type will default to ChangeStreamDocument of the first argument
    * @example
    * By just providing the first argument I can type the change to be `ChangeStreamDocument<{ _id: number }>`
    * ```ts
    * collection.watch<{ _id: number }>()
    *   .on('change', change => console.log(change._id.toFixed(4)));
    * ```
    *
    * @example
    * Passing a second argument provides a way to reflect the type changes caused by an advanced pipeline.
    * Here, we are using a pipeline to have MongoDB filter for insert changes only and add a comment.
    * No need start from scratch on the ChangeStreamInsertDocument type!
    * By using an intersection we can save time and ensure defaults remain the same type!
    * ```ts
    * collection
    *   .watch<Schema, ChangeStreamInsertDocument<Schema> & { comment: string }>([
    *     { $addFields: { comment: 'big changes' } },
    *     { $match: { operationType: 'insert' } }
    *   ])
    *   .on('change', change => {
    *     change.comment.startsWith('big');
    *     change.operationType === 'insert';
    *     // No need to narrow in code because the generics did that for us!
    *     expectType<Schema>(change.fullDocument);
    *   });
    * ```
    *
    * @param pipeline - An array of {@link https://docs.mongodb.com/manual/reference/operator/aggregation-pipeline/|aggregation pipeline stages} through which to pass change stream documents. This allows for filtering (using $match) and manipulating the change stream documents.
    * @param options - Optional settings for the command
    * @typeParam TLocal - Type of the data being detected by the change stream
    * @typeParam TChange - Type of the whole change stream document emitted
    */
  def watch[TLocal /* <: Document */, TChange /* <: Document */](): ChangeStream[TLocal, TChange] = js.native
  def watch[TLocal /* <: Document */, TChange /* <: Document */](pipeline: js.Array[Document]): ChangeStream[TLocal, TChange] = js.native
  def watch[TLocal /* <: Document */, TChange /* <: Document */](pipeline: js.Array[Document], options: ChangeStreamOptions): ChangeStream[TLocal, TChange] = js.native
  def watch[TLocal /* <: Document */, TChange /* <: Document */](pipeline: Unit, options: ChangeStreamOptions): ChangeStream[TLocal, TChange] = js.native
  
  /**
    * The current writeConcern of the collection. If not explicitly defined for
    * this collection, will be inherited from the parent DB
    */
  def writeConcern: js.UndefOr[WriteConcern] = js.native
}
