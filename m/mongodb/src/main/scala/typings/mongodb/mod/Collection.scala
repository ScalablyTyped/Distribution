package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.BatchSizeReadPreference
import typings.mongodb.anon.ChangeStreamOptionssessio
import typings.mongodb.anon.CommonOptionsbypassDocume
import typings.mongodb.anon.CommonOptionsmaxTimeMSnum
import typings.mongodb.anon.CommonOptionssingleboolea
import typings.mongodb.anon.DropTargetSession
import typings.mongodb.anon.FullSession
import typings.mongodb.anon.MaxTimeMSSession
import typings.mongodb.anon.ScaleSession
import typings.mongodb.anon.SessionClientSession
import typings.mongodb.anon.UpdateOneOptionsmultibool
import typings.mongodb.anon.`1`
import typings.mongodb.mongodbStrings._id
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection[TSchema /* <: StringDictionary[js.Any] */] extends StObject {
  
  def aggregate[T](): AggregationCursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.0/api/Collection.html#aggregate */
  def aggregate[T](callback: MongoCallback[AggregationCursor[T]]): AggregationCursor[T] = js.native
  def aggregate[T](
    pipeline: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: MongoCallback[AggregationCursor[T]]
  ): AggregationCursor[T] = js.native
  def aggregate[T](pipeline: js.UndefOr[scala.Nothing], options: CollectionAggregationOptions): AggregationCursor[T] = js.native
  def aggregate[T](
    pipeline: js.UndefOr[scala.Nothing],
    options: CollectionAggregationOptions,
    callback: MongoCallback[AggregationCursor[T]]
  ): AggregationCursor[T] = js.native
  def aggregate[T](pipeline: js.Array[js.Object]): AggregationCursor[T] = js.native
  def aggregate[T](pipeline: js.Array[js.Object], callback: MongoCallback[AggregationCursor[T]]): AggregationCursor[T] = js.native
  def aggregate[T](
    pipeline: js.Array[js.Object],
    options: js.UndefOr[scala.Nothing],
    callback: MongoCallback[AggregationCursor[T]]
  ): AggregationCursor[T] = js.native
  def aggregate[T](pipeline: js.Array[js.Object], options: CollectionAggregationOptions): AggregationCursor[T] = js.native
  def aggregate[T](
    pipeline: js.Array[js.Object],
    options: CollectionAggregationOptions,
    callback: MongoCallback[AggregationCursor[T]]
  ): AggregationCursor[T] = js.native
  
  def bulkWrite(operations: js.Array[BulkWriteOperation[TSchema]]): js.Promise[BulkWriteOpResultObject] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.0/api/Collection.html#bulkWrite */
  def bulkWrite(
    operations: js.Array[BulkWriteOperation[TSchema]],
    callback: MongoCallback[BulkWriteOpResultObject]
  ): Unit = js.native
  def bulkWrite(operations: js.Array[BulkWriteOperation[TSchema]], options: CollectionBulkWriteOptions): js.Promise[BulkWriteOpResultObject] = js.native
  def bulkWrite(
    operations: js.Array[BulkWriteOperation[TSchema]],
    options: CollectionBulkWriteOptions,
    callback: MongoCallback[BulkWriteOpResultObject]
  ): Unit = js.native
  
  /**
    * Get the collection name.
    */
  var collectionName: String = js.native
  
  def count(): js.Promise[scala.Double] = js.native
  /**
    * http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#count
    * @deprecated Use countDocuments or estimatedDocumentCount
    */
  def count(callback: MongoCallback[scala.Double]): Unit = js.native
  def count(query: js.UndefOr[scala.Nothing], options: MongoCountPreferences): js.Promise[scala.Double] = js.native
  def count(query: FilterQuery[TSchema]): js.Promise[scala.Double] = js.native
  def count(query: FilterQuery[TSchema], callback: MongoCallback[scala.Double]): Unit = js.native
  def count(query: FilterQuery[TSchema], options: MongoCountPreferences): js.Promise[scala.Double] = js.native
  def count(query: FilterQuery[TSchema], options: MongoCountPreferences, callback: MongoCallback[scala.Double]): Unit = js.native
  
  def countDocuments(): js.Promise[scala.Double] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#countDocuments */
  def countDocuments(callback: MongoCallback[scala.Double]): Unit = js.native
  def countDocuments(query: js.UndefOr[scala.Nothing], options: MongoCountPreferences): js.Promise[scala.Double] = js.native
  def countDocuments(query: FilterQuery[TSchema]): js.Promise[scala.Double] = js.native
  def countDocuments(query: FilterQuery[TSchema], callback: MongoCallback[scala.Double]): Unit = js.native
  def countDocuments(query: FilterQuery[TSchema], options: MongoCountPreferences): js.Promise[scala.Double] = js.native
  def countDocuments(query: FilterQuery[TSchema], options: MongoCountPreferences, callback: MongoCallback[scala.Double]): Unit = js.native
  
  def createIndex(fieldOrSpec: String): js.Promise[String] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#createIndex */
  def createIndex(fieldOrSpec: String, callback: MongoCallback[String]): Unit = js.native
  def createIndex(fieldOrSpec: String, options: IndexOptions): js.Promise[String] = js.native
  def createIndex(fieldOrSpec: String, options: IndexOptions, callback: MongoCallback[String]): Unit = js.native
  def createIndex(fieldOrSpec: js.Any): js.Promise[String] = js.native
  def createIndex(fieldOrSpec: js.Any, callback: MongoCallback[String]): Unit = js.native
  def createIndex(fieldOrSpec: js.Any, options: IndexOptions): js.Promise[String] = js.native
  def createIndex(fieldOrSpec: js.Any, options: IndexOptions, callback: MongoCallback[String]): Unit = js.native
  
  def createIndexes(indexSpecs: js.Array[IndexSpecification]): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#createIndexes and  http://docs.mongodb.org/manual/reference/command/createIndexes/ */
  def createIndexes(indexSpecs: js.Array[IndexSpecification], callback: MongoCallback[_]): Unit = js.native
  def createIndexes(indexSpecs: js.Array[IndexSpecification], options: `1`): js.Promise[_] = js.native
  def createIndexes(indexSpecs: js.Array[IndexSpecification], options: `1`, callback: MongoCallback[_]): Unit = js.native
  
  def deleteMany(filter: FilterQuery[TSchema]): js.Promise[DeleteWriteOpResultObject] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#deleteMany */
  def deleteMany(filter: FilterQuery[TSchema], callback: MongoCallback[DeleteWriteOpResultObject]): Unit = js.native
  def deleteMany(filter: FilterQuery[TSchema], options: CommonOptions): js.Promise[DeleteWriteOpResultObject] = js.native
  def deleteMany(
    filter: FilterQuery[TSchema],
    options: CommonOptions,
    callback: MongoCallback[DeleteWriteOpResultObject]
  ): Unit = js.native
  
  def deleteOne(filter: FilterQuery[TSchema]): js.Promise[DeleteWriteOpResultObject] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#deleteOne */
  def deleteOne(filter: FilterQuery[TSchema], callback: MongoCallback[DeleteWriteOpResultObject]): Unit = js.native
  def deleteOne(filter: FilterQuery[TSchema], options: CommonOptionsbypassDocume): js.Promise[DeleteWriteOpResultObject] = js.native
  def deleteOne(
    filter: FilterQuery[TSchema],
    options: CommonOptionsbypassDocume,
    callback: MongoCallback[DeleteWriteOpResultObject]
  ): Unit = js.native
  
  def distinct(key: String): js.Promise[js.Array[_]] = js.native
  def distinct(key: String, callback: MongoCallback[js.Array[_]]): Unit = js.native
  def distinct(key: String, query: js.UndefOr[scala.Nothing], options: MongoDistinctPreferences): js.Promise[js.Array[_]] = js.native
  def distinct(key: String, query: FilterQuery[TSchema]): js.Promise[js.Array[_]] = js.native
  def distinct(key: String, query: FilterQuery[TSchema], callback: MongoCallback[js.Array[_]]): Unit = js.native
  def distinct(key: String, query: FilterQuery[TSchema], options: MongoDistinctPreferences): js.Promise[js.Array[_]] = js.native
  def distinct(
    key: String,
    query: FilterQuery[TSchema],
    options: MongoDistinctPreferences,
    callback: MongoCallback[js.Array[_]]
  ): Unit = js.native
  @JSName("distinct")
  def distinct_id(key: _id): js.Promise[js.Array[FlattenIfArray[ExtractIdType[TSchema]]]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#distinct */
  @JSName("distinct")
  def distinct_id(key: _id, callback: MongoCallback[js.Array[FlattenIfArray[ExtractIdType[TSchema]]]]): Unit = js.native
  @JSName("distinct")
  def distinct_id(key: _id, query: js.UndefOr[scala.Nothing], options: MongoDistinctPreferences): js.Promise[js.Array[FlattenIfArray[ExtractIdType[TSchema]]]] = js.native
  @JSName("distinct")
  def distinct_id(key: _id, query: FilterQuery[TSchema]): js.Promise[js.Array[FlattenIfArray[ExtractIdType[TSchema]]]] = js.native
  @JSName("distinct")
  def distinct_id(
    key: _id,
    query: FilterQuery[TSchema],
    callback: MongoCallback[js.Array[FlattenIfArray[ExtractIdType[TSchema]]]]
  ): Unit = js.native
  @JSName("distinct")
  def distinct_id(key: _id, query: FilterQuery[TSchema], options: MongoDistinctPreferences): js.Promise[js.Array[FlattenIfArray[ExtractIdType[TSchema]]]] = js.native
  @JSName("distinct")
  def distinct_id(
    key: _id,
    query: FilterQuery[TSchema],
    options: MongoDistinctPreferences,
    callback: MongoCallback[js.Array[FlattenIfArray[ExtractIdType[TSchema]]]]
  ): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#drop */
  def drop(): js.Promise[_] = js.native
  def drop(callback: MongoCallback[_]): Unit = js.native
  def drop(options: SessionClientSession): js.Promise[_] = js.native
  def drop(options: SessionClientSession, callback: MongoCallback[_]): Unit = js.native
  
  def dropIndex(indexName: String): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#dropIndex */
  def dropIndex(indexName: String, callback: MongoCallback[_]): Unit = js.native
  def dropIndex(indexName: String, options: CommonOptionsmaxTimeMSnum): js.Promise[_] = js.native
  def dropIndex(indexName: String, options: CommonOptionsmaxTimeMSnum, callback: MongoCallback[_]): Unit = js.native
  
  def dropIndexes(): Unit = js.native
  def dropIndexes(callback: MongoCallback[_]): Unit = js.native
  def dropIndexes(options: MaxTimeMSSession): js.Promise[_] = js.native
  def dropIndexes(options: MaxTimeMSSession, callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#dropIndexes */
  @JSName("dropIndexes")
  def dropIndexes_Promise(): js.Promise[_] = js.native
  
  def estimatedDocumentCount(): js.Promise[scala.Double] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#estimatedDocumentCount */
  def estimatedDocumentCount(callback: MongoCallback[scala.Double]): Unit = js.native
  def estimatedDocumentCount(query: js.UndefOr[scala.Nothing], options: MongoCountPreferences): js.Promise[scala.Double] = js.native
  def estimatedDocumentCount(query: FilterQuery[TSchema]): js.Promise[scala.Double] = js.native
  def estimatedDocumentCount(query: FilterQuery[TSchema], callback: MongoCallback[scala.Double]): Unit = js.native
  def estimatedDocumentCount(query: FilterQuery[TSchema], options: MongoCountPreferences): js.Promise[scala.Double] = js.native
  def estimatedDocumentCount(query: FilterQuery[TSchema], options: MongoCountPreferences, callback: MongoCallback[scala.Double]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.6/api/Collection.html#find */
  def find[T](): Cursor[T] = js.native
  def find[T](query: FilterQuery[TSchema]): Cursor[T] = js.native
  def find[T](query: FilterQuery[TSchema], options: FindOneOptions[T | TSchema]): Cursor[T] = js.native
  
  def findOne[T](filter: FilterQuery[TSchema]): js.Promise[T | Null] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.6/api/Collection.html#findOne */
  def findOne[T](filter: FilterQuery[TSchema], callback: MongoCallback[T | Null | TSchema]): Unit = js.native
  def findOne[T](filter: FilterQuery[TSchema], options: FindOneOptions[T | TSchema]): js.Promise[T | Null] = js.native
  def findOne[T](
    filter: FilterQuery[TSchema],
    options: FindOneOptions[T | TSchema],
    callback: MongoCallback[T | Null | TSchema]
  ): Unit = js.native
  
  def findOneAndDelete(filter: FilterQuery[TSchema]): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.6/api/Collection.html#findOneAndDelete */
  def findOneAndDelete(filter: FilterQuery[TSchema], callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]): Unit = js.native
  def findOneAndDelete(filter: FilterQuery[TSchema], options: FindOneAndDeleteOption[TSchema]): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  def findOneAndDelete(
    filter: FilterQuery[TSchema],
    options: FindOneAndDeleteOption[TSchema],
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): Unit = js.native
  
  def findOneAndReplace(filter: FilterQuery[TSchema], replacement: js.Object): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.6/api/Collection.html#findOneAndReplace */
  def findOneAndReplace(
    filter: FilterQuery[TSchema],
    replacement: js.Object,
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): Unit = js.native
  def findOneAndReplace(filter: FilterQuery[TSchema], replacement: js.Object, options: FindOneAndReplaceOption[TSchema]): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  def findOneAndReplace(
    filter: FilterQuery[TSchema],
    replacement: js.Object,
    options: FindOneAndReplaceOption[TSchema],
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): Unit = js.native
  
  def findOneAndUpdate(filter: FilterQuery[TSchema], update: TSchema): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  def findOneAndUpdate(
    filter: FilterQuery[TSchema],
    update: TSchema,
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): Unit = js.native
  def findOneAndUpdate(filter: FilterQuery[TSchema], update: TSchema, options: FindOneAndUpdateOption[TSchema]): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  def findOneAndUpdate(
    filter: FilterQuery[TSchema],
    update: TSchema,
    options: FindOneAndUpdateOption[TSchema],
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): Unit = js.native
  def findOneAndUpdate(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema]): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.6/api/Collection.html#findOneAndUpdate */
  def findOneAndUpdate(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): Unit = js.native
  def findOneAndUpdate(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    options: FindOneAndUpdateOption[TSchema]
  ): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  def findOneAndUpdate(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    options: FindOneAndUpdateOption[TSchema],
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): Unit = js.native
  
  def geoHaystackSearch(x: scala.Double, y: scala.Double): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#geoHaystackSearch */
  def geoHaystackSearch(x: scala.Double, y: scala.Double, callback: MongoCallback[_]): Unit = js.native
  def geoHaystackSearch(x: scala.Double, y: scala.Double, options: GeoHaystackSearchOptions): js.Promise[_] = js.native
  def geoHaystackSearch(x: scala.Double, y: scala.Double, options: GeoHaystackSearchOptions, callback: MongoCallback[_]): Unit = js.native
  
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  /** @deprecated MongoDB 3.6 or higher no longer supports the group command. We recommend rewriting using the aggregation framework. */
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  /** @deprecated MongoDB 3.6 or higher no longer supports the group command. We recommend rewriting using the aggregation framework. */
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  /** @deprecated MongoDB 3.6 or higher no longer supports the group command. We recommend rewriting using the aggregation framework. */
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: typings.mongodb.anon.ReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  
  /**
    * Get current index hint for collection.
    */
  var hint: js.Any = js.native
  
  def indexExists(indexes: String): js.Promise[Boolean] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#indexExists */
  def indexExists(indexes: String, callback: MongoCallback[Boolean]): Unit = js.native
  def indexExists(indexes: String, options: SessionClientSession): js.Promise[Boolean] = js.native
  def indexExists(indexes: String, options: SessionClientSession, callback: MongoCallback[Boolean]): Unit = js.native
  def indexExists(indexes: js.Array[String]): js.Promise[Boolean] = js.native
  def indexExists(indexes: js.Array[String], callback: MongoCallback[Boolean]): Unit = js.native
  def indexExists(indexes: js.Array[String], options: SessionClientSession): js.Promise[Boolean] = js.native
  def indexExists(indexes: js.Array[String], options: SessionClientSession, callback: MongoCallback[Boolean]): Unit = js.native
  
  def indexInformation(): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#indexInformation */
  def indexInformation(callback: MongoCallback[_]): Unit = js.native
  def indexInformation(options: FullSession): js.Promise[_] = js.native
  def indexInformation(options: FullSession, callback: MongoCallback[_]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#indexes */
  def indexes(): js.Promise[_] = js.native
  def indexes(callback: MongoCallback[_]): Unit = js.native
  def indexes(options: SessionClientSession): js.Promise[_] = js.native
  def indexes(options: `1`, callback: MongoCallback[_]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#initializeOrderedBulkOp */
  def initializeOrderedBulkOp(): OrderedBulkOperation = js.native
  def initializeOrderedBulkOp(options: CommonOptions): OrderedBulkOperation = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#initializeUnorderedBulkOp */
  def initializeUnorderedBulkOp(): UnorderedBulkOperation = js.native
  def initializeUnorderedBulkOp(options: CommonOptions): UnorderedBulkOperation = js.native
  
  /** @deprecated Use insertOne, insertMany or bulkWrite */
  def insert(docs: OptionalId[TSchema]): js.Promise[InsertWriteOpResult[WithId[TSchema]]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#insertOne */
  /** @deprecated Use insertOne, insertMany or bulkWrite */
  def insert(docs: OptionalId[TSchema], callback: MongoCallback[InsertWriteOpResult[WithId[TSchema]]]): Unit = js.native
  def insert(docs: OptionalId[TSchema], options: CollectionInsertOneOptions): js.Promise[InsertWriteOpResult[WithId[TSchema]]] = js.native
  /** @deprecated Use insertOne, insertMany or bulkWrite */
  def insert(
    docs: OptionalId[TSchema],
    options: CollectionInsertOneOptions,
    callback: MongoCallback[InsertWriteOpResult[WithId[TSchema]]]
  ): Unit = js.native
  
  def insertMany(docs: js.Array[OptionalId[TSchema]]): js.Promise[InsertWriteOpResult[WithId[TSchema]]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#insertMany */
  def insertMany(docs: js.Array[OptionalId[TSchema]], callback: MongoCallback[InsertWriteOpResult[WithId[TSchema]]]): Unit = js.native
  def insertMany(docs: js.Array[OptionalId[TSchema]], options: CollectionInsertManyOptions): js.Promise[InsertWriteOpResult[WithId[TSchema]]] = js.native
  def insertMany(
    docs: js.Array[OptionalId[TSchema]],
    options: CollectionInsertManyOptions,
    callback: MongoCallback[InsertWriteOpResult[WithId[TSchema]]]
  ): Unit = js.native
  
  def insertOne(docs: OptionalId[TSchema]): js.Promise[InsertOneWriteOpResult[WithId[TSchema]]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#insertOne */
  def insertOne(docs: OptionalId[TSchema], callback: MongoCallback[InsertOneWriteOpResult[WithId[TSchema]]]): Unit = js.native
  def insertOne(docs: OptionalId[TSchema], options: CollectionInsertOneOptions): js.Promise[InsertOneWriteOpResult[WithId[TSchema]]] = js.native
  def insertOne(
    docs: OptionalId[TSchema],
    options: CollectionInsertOneOptions,
    callback: MongoCallback[InsertOneWriteOpResult[WithId[TSchema]]]
  ): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#isCapped */
  def isCapped(): js.Promise[_] = js.native
  def isCapped(callback: MongoCallback[_]): Unit = js.native
  def isCapped(options: SessionClientSession): js.Promise[_] = js.native
  def isCapped(options: SessionClientSession, callback: MongoCallback[_]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#listIndexes */
  def listIndexes(): CommandCursor = js.native
  def listIndexes(options: BatchSizeReadPreference): CommandCursor = js.native
  
  def mapReduce[TKey, TValue](map: String, reduce: String): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](map: String, reduce: String, callback: MongoCallback[_]): Unit = js.native
  def mapReduce[TKey, TValue](map: String, reduce: String, options: MapReduceOptions): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](map: String, reduce: String, options: MapReduceOptions, callback: MongoCallback[_]): Unit = js.native
  def mapReduce[TKey, TValue](map: String, reduce: CollectionReduceFunction[TKey, TValue]): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](map: String, reduce: CollectionReduceFunction[TKey, TValue], callback: MongoCallback[_]): Unit = js.native
  def mapReduce[TKey, TValue](map: String, reduce: CollectionReduceFunction[TKey, TValue], options: MapReduceOptions): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](
    map: String,
    reduce: CollectionReduceFunction[TKey, TValue],
    options: MapReduceOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
  def mapReduce[TKey, TValue](map: CollectionMapFunction[TSchema], reduce: String): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](map: CollectionMapFunction[TSchema], reduce: String, callback: MongoCallback[_]): Unit = js.native
  def mapReduce[TKey, TValue](map: CollectionMapFunction[TSchema], reduce: String, options: MapReduceOptions): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](
    map: CollectionMapFunction[TSchema],
    reduce: String,
    options: MapReduceOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
  def mapReduce[TKey, TValue](map: CollectionMapFunction[TSchema], reduce: CollectionReduceFunction[TKey, TValue]): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#mapReduce */
  def mapReduce[TKey, TValue](
    map: CollectionMapFunction[TSchema],
    reduce: CollectionReduceFunction[TKey, TValue],
    callback: MongoCallback[_]
  ): Unit = js.native
  def mapReduce[TKey, TValue](
    map: CollectionMapFunction[TSchema],
    reduce: CollectionReduceFunction[TKey, TValue],
    options: MapReduceOptions
  ): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](
    map: CollectionMapFunction[TSchema],
    reduce: CollectionReduceFunction[TKey, TValue],
    options: MapReduceOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
  
  /**
    * Get the full collection namespace.
    */
  var namespace: String = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#options */
  def options(): js.Promise[_] = js.native
  def options(callback: MongoCallback[_]): Unit = js.native
  def options(options: SessionClientSession): js.Promise[_] = js.native
  def options(options: SessionClientSession, callback: MongoCallback[_]): Unit = js.native
  
  def parallelCollectionScan(): js.Promise[js.Array[Cursor[_]]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#parallelCollectionScan */
  def parallelCollectionScan(callback: MongoCallback[js.Array[Cursor[_]]]): Unit = js.native
  def parallelCollectionScan(options: ParallelCollectionScanOptions): js.Promise[js.Array[Cursor[_]]] = js.native
  def parallelCollectionScan(options: ParallelCollectionScanOptions, callback: MongoCallback[js.Array[Cursor[_]]]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#reIndex */
  def reIndex(): js.Promise[_] = js.native
  def reIndex(callback: MongoCallback[_]): Unit = js.native
  def reIndex(options: SessionClientSession): js.Promise[_] = js.native
  def reIndex(options: SessionClientSession, callback: MongoCallback[_]): Unit = js.native
  
  /**
    * The current read concern values.
    */
  var readConcern: ReadConcern = js.native
  
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  def remove(selector: js.Object): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#remove */
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  def remove(selector: js.Object, callback: MongoCallback[WriteOpResult]): Unit = js.native
  def remove(selector: js.Object, options: js.UndefOr[scala.Nothing], callback: MongoCallback[WriteOpResult]): Unit = js.native
  def remove(selector: js.Object, options: CommonOptionssingleboolea): Unit = js.native
  def remove(selector: js.Object, options: CommonOptionssingleboolea, callback: MongoCallback[WriteOpResult]): Unit = js.native
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  @JSName("remove")
  def remove_Promise(selector: js.Object): js.Promise[WriteOpResult] = js.native
  @JSName("remove")
  def remove_Promise(selector: js.Object, options: CommonOptionssingleboolea): js.Promise[WriteOpResult] = js.native
  
  def rename(newName: String): js.Promise[Collection[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#rename */
  def rename(newName: String, callback: MongoCallback[Collection[TSchema]]): Unit = js.native
  def rename(newName: String, options: DropTargetSession): js.Promise[Collection[TSchema]] = js.native
  def rename(newName: String, options: DropTargetSession, callback: MongoCallback[Collection[TSchema]]): Unit = js.native
  
  def replaceOne(filter: FilterQuery[TSchema], doc: TSchema): js.Promise[ReplaceWriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#replaceOne */
  def replaceOne(filter: FilterQuery[TSchema], doc: TSchema, callback: MongoCallback[ReplaceWriteOpResult]): Unit = js.native
  def replaceOne(filter: FilterQuery[TSchema], doc: TSchema, options: ReplaceOneOptions): js.Promise[ReplaceWriteOpResult] = js.native
  def replaceOne(
    filter: FilterQuery[TSchema],
    doc: TSchema,
    options: ReplaceOneOptions,
    callback: MongoCallback[ReplaceWriteOpResult]
  ): Unit = js.native
  
  /** @deprecated Use insertOne, insertMany, updateOne or updateMany */
  def save(doc: TSchema): js.Promise[WriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#save */
  /** @deprecated Use insertOne, insertMany, updateOne or updateMany */
  def save(doc: TSchema, callback: MongoCallback[WriteOpResult]): Unit = js.native
  def save(doc: TSchema, options: CommonOptions): js.Promise[WriteOpResult] = js.native
  /** @deprecated Use insertOne, insertMany, updateOne or updateMany */
  def save(doc: TSchema, options: CommonOptions, callback: MongoCallback[WriteOpResult]): Unit = js.native
  
  def stats(): js.Promise[CollStats] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#stats */
  def stats(callback: MongoCallback[CollStats]): Unit = js.native
  def stats(options: ScaleSession): js.Promise[CollStats] = js.native
  def stats(options: ScaleSession, callback: MongoCallback[CollStats]): Unit = js.native
  
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema]): js.Promise[WriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#update */
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema], callback: MongoCallback[WriteOpResult]): Unit = js.native
  def update(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema], options: UpdateOneOptionsmultibool): js.Promise[WriteOpResult] = js.native
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    options: UpdateOneOptionsmultibool,
    callback: MongoCallback[WriteOpResult]
  ): Unit = js.native
  def update(filter: FilterQuery[TSchema], update: Partial[TSchema]): js.Promise[WriteOpResult] = js.native
  def update(filter: FilterQuery[TSchema], update: Partial[TSchema], callback: MongoCallback[WriteOpResult]): Unit = js.native
  def update(filter: FilterQuery[TSchema], update: Partial[TSchema], options: UpdateOneOptionsmultibool): js.Promise[WriteOpResult] = js.native
  def update(
    filter: FilterQuery[TSchema],
    update: Partial[TSchema],
    options: UpdateOneOptionsmultibool,
    callback: MongoCallback[WriteOpResult]
  ): Unit = js.native
  
  def updateMany(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema]): js.Promise[UpdateWriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#updateMany */
  def updateMany(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  def updateMany(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema], options: UpdateManyOptions): js.Promise[UpdateWriteOpResult] = js.native
  def updateMany(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    options: UpdateManyOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  def updateMany(filter: FilterQuery[TSchema], update: Partial[TSchema]): js.Promise[UpdateWriteOpResult] = js.native
  def updateMany(
    filter: FilterQuery[TSchema],
    update: Partial[TSchema],
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  def updateMany(filter: FilterQuery[TSchema], update: Partial[TSchema], options: UpdateManyOptions): js.Promise[UpdateWriteOpResult] = js.native
  def updateMany(
    filter: FilterQuery[TSchema],
    update: Partial[TSchema],
    options: UpdateManyOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  
  def updateOne(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema]): js.Promise[UpdateWriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#updateOne */
  def updateOne(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  def updateOne(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema], options: UpdateOneOptions): js.Promise[UpdateWriteOpResult] = js.native
  def updateOne(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    options: UpdateOneOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  def updateOne(filter: FilterQuery[TSchema], update: Partial[TSchema]): js.Promise[UpdateWriteOpResult] = js.native
  def updateOne(
    filter: FilterQuery[TSchema],
    update: Partial[TSchema],
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  def updateOne(filter: FilterQuery[TSchema], update: Partial[TSchema], options: UpdateOneOptions): js.Promise[UpdateWriteOpResult] = js.native
  def updateOne(
    filter: FilterQuery[TSchema],
    update: Partial[TSchema],
    options: UpdateOneOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  
  /**
    * @param pipeline - an array of
    * {@link https://docs.mongodb.com/manual/reference/operator/aggregation-pipeline/ aggregation pipeline stages}
    * through which to pass change stream documents. This allows for filtering (using `$match`) and manipulating
    * the change stream documents.
    *
    * @param options - optional settings
    * @see http://mongodb.github.io/node-mongodb-native/3.6/api/Collection.html#watch
    */
  def watch[T](): ChangeStream[T] = js.native
  def watch[T](options: ChangeStreamOptionssessio): ChangeStream[T] = js.native
  def watch[T](pipeline: js.UndefOr[scala.Nothing], options: ChangeStreamOptionssessio): ChangeStream[T] = js.native
  def watch[T](pipeline: js.Array[js.Object]): ChangeStream[T] = js.native
  def watch[T](pipeline: js.Array[js.Object], options: ChangeStreamOptionssessio): ChangeStream[T] = js.native
  
  /**
    * The current write concern values.
    */
  var writeConcern: WriteConcern = js.native
}
