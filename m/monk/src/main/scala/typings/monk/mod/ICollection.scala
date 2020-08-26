package typings.monk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mod.BulkWriteOpResultObject
import typings.mongodb.mod.BulkWriteOperation
import typings.mongodb.mod.CollStats
import typings.mongodb.mod.CollectionAggregationOptions
import typings.mongodb.mod.CollectionBulkWriteOptions
import typings.mongodb.mod.CollectionMapFunction
import typings.mongodb.mod.CollectionReduceFunction
import typings.mongodb.mod.DeleteWriteOpResultObject
import typings.mongodb.mod.FilterQuery
import typings.mongodb.mod.FindOneAndDeleteOption
import typings.mongodb.mod.FindOneOptions
import typings.mongodb.mod.GeoHaystackSearchOptions
import typings.mongodb.mod.IndexOptions
import typings.mongodb.mod.MapReduceOptions
import typings.mongodb.mod.MongoCountPreferences
import typings.mongodb.mod.MongoDistinctPreferences
import typings.mongodb.mod.UpdateOneOptions
import typings.mongodb.mod.UpdateQuery
import typings.mongodb.mod.UpdateWriteOpResult
import typings.monk.anon.FindOneAndReplaceOptionre
import typings.monk.anon.FindOneAndUpdateOptionrep
import typings.monk.anon.FindOneOptionsrawCursortr
import typings.monk.anon.FindOptionsrawCursortrue
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monk", "ICollection")
@js.native
class ICollection[T /* <: StringDictionary[js.Any] */] () extends js.Object {
  val manager: IMonkManager = js.native
  val middlewares: js.Array[TMiddleware] = js.native
  val name: String = js.native
  var options: js.Object = js.native
  def aggregate[U](pipeline: js.Array[js.Object]): js.Promise[U] = js.native
  def aggregate[U](pipeline: js.Array[js.Object], options: CollectionAggregationOptions): js.Promise[U] = js.native
  def aggregate[U](stages: js.Array[js.Object], options: CollectionAggregationOptions, callback: Callback[U]): Unit = js.native
  def bulkWrite(operations: js.Array[BulkWriteOperation[T]]): js.Promise[BulkWriteOpResultObject] = js.native
  def bulkWrite(operations: js.Array[BulkWriteOperation[T]], options: CollectionBulkWriteOptions): js.Promise[BulkWriteOpResultObject] = js.native
  def bulkWrite(
    operations: js.Array[BulkWriteOperation[T]],
    options: CollectionBulkWriteOptions,
    callback: Callback[BulkWriteOpResultObject]
  ): Unit = js.native
  /**
    * http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#count
    * @deprecated Use countDocuments or estimatedDocumentCount
    */
  def count(): js.Promise[Double] = js.native
  def count(query: js.UndefOr[scala.Nothing], options: MongoCountPreferences): js.Promise[Double] = js.native
  def count(query: FilterQuery[T]): js.Promise[Double] = js.native
  def count(query: FilterQuery[T], options: MongoCountPreferences): Unit = js.native
  def count(query: FilterQuery[T], options: MongoCountPreferences, callback: Callback[Double]): Unit = js.native
  @JSName("count")
  def count_Promise(query: FilterQuery[T], options: MongoCountPreferences): js.Promise[Double] = js.native
  def createIndex(fields: CreateIndexInput[T]): js.Promise[String] = js.native
  def createIndex(fields: CreateIndexInput[T], options: IndexOptions): js.Promise[String] = js.native
  def createIndex(fields: CreateIndexInput[T], options: IndexOptions, callback: Callback[String]): Unit = js.native
  def distinct(field: String): js.Promise[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any
    ]
  ] = js.native
  def distinct(field: String, query: js.UndefOr[scala.Nothing], options: MongoDistinctPreferences): js.Promise[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any
    ]
  ] = js.native
  def distinct(field: String, query: FilterQuery[T]): js.Promise[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any
    ]
  ] = js.native
  def distinct(field: String, query: FilterQuery[T], options: MongoDistinctPreferences): js.Promise[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any
    ]
  ] = js.native
  def distinct(
    field: String,
    query: FilterQuery[T],
    options: MongoDistinctPreferences,
    callback: Callback[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any
      ]
    ]
  ): Unit = js.native
  def drop(): js.Promise[DropResult] = js.native
  def drop(callback: Callback[DropResult]): Unit = js.native
  def dropIndex(fields: DropIndexInput[T]): js.Promise[DropIndexResult] = js.native
  def dropIndex(fields: DropIndexInput[T], options: DropIndexOptions): js.Promise[DropIndexResult] = js.native
  def dropIndex(fields: DropIndexInput[T], options: DropIndexOptions, callback: Callback[DropIndexResult]): Unit = js.native
  def dropIndexes(): Unit = js.native
  def dropIndexes(callback: Callback[DropIndexesResult]): Unit = js.native
  @JSName("dropIndexes")
  def dropIndexes_Promise(): js.Promise[DropIndexesResult] = js.native
  // Normal
  def find(): js.Promise[FindResult[T]] = js.native
  def find(query: js.UndefOr[scala.Nothing], options: FindOptions): js.Promise[FindResult[T]] = js.native
  // Raw
  def find(query: FilterQuery[T]): js.Promise[FindRawResult[T]] = js.native
  def find(query: FilterQuery[T], options: FindOneOptions, callback: Callback[FindResult[T]]): Unit = js.native
  def find(query: FilterQuery[T], options: FindOneOptionsrawCursortr, callback: Callback[FindRawResult[T]]): Unit = js.native
  def find(query: FilterQuery[T], options: FindOptionsrawCursortrue): js.Promise[FindRawResult[T]] = js.native
  def find(query: FilterQuery[T], options: FindOptions): js.Promise[FindResult[T]] = js.native
  def findOne(): js.Promise[FindOneResult[T]] = js.native
  def findOne(query: js.UndefOr[scala.Nothing], options: FindOneOptions): js.Promise[FindOneResult[T]] = js.native
  def findOne(query: FilterQuery[T]): js.Promise[FindOneResult[T]] = js.native
  def findOne(query: FilterQuery[T], options: FindOneOptions): js.Promise[FindOneResult[T]] = js.native
  def findOne(query: FilterQuery[T], options: FindOneOptions, callback: Callback[FindOneResult[T]]): Unit = js.native
  def findOneAndDelete(query: FilterQuery[T]): js.Promise[FindOneResult[T]] = js.native
  def findOneAndDelete(query: FilterQuery[T], options: FindOneAndDeleteOption): js.Promise[FindOneResult[T]] = js.native
  def findOneAndDelete(query: FilterQuery[T], options: FindOneAndDeleteOption, callback: Callback[FindOneResult[T]]): Unit = js.native
  // Replace
  def findOneAndUpdate(query: FilterQuery[T], update: T): js.Promise[FindOneResult[T]] = js.native
  def findOneAndUpdate(query: FilterQuery[T], update: T, options: FindOneAndReplaceOptionre): js.Promise[FindOneResult[T]] = js.native
  def findOneAndUpdate(
    query: FilterQuery[T],
    update: T,
    options: FindOneAndReplaceOptionre,
    callback: Callback[FindOneResult[T]]
  ): Unit = js.native
  def findOneAndUpdate(query: FilterQuery[T], update: UpdateQuery[T]): Unit = js.native
  def findOneAndUpdate(
    query: FilterQuery[T],
    update: UpdateQuery[T],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[FindOneResult[T]]
  ): Unit = js.native
  def findOneAndUpdate(query: FilterQuery[T], update: UpdateQuery[T], options: FindOneAndUpdateOptionrep): Unit = js.native
  def findOneAndUpdate(
    query: FilterQuery[T],
    update: UpdateQuery[T],
    options: FindOneAndUpdateOptionrep,
    callback: Callback[FindOneResult[T]]
  ): Unit = js.native
  def findOneAndUpdate(query: FilterQuery[T], update: Partial[T]): Unit = js.native
  def findOneAndUpdate(
    query: FilterQuery[T],
    update: Partial[T],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[FindOneResult[T]]
  ): Unit = js.native
  def findOneAndUpdate(query: FilterQuery[T], update: Partial[T], options: FindOneAndUpdateOptionrep): Unit = js.native
  def findOneAndUpdate(
    query: FilterQuery[T],
    update: Partial[T],
    options: FindOneAndUpdateOptionrep,
    callback: Callback[FindOneResult[T]]
  ): Unit = js.native
  // Update
  @JSName("findOneAndUpdate")
  def findOneAndUpdate_Promise(query: FilterQuery[T], update: UpdateQuery[T]): js.Promise[FindOneResult[T]] = js.native
  @JSName("findOneAndUpdate")
  def findOneAndUpdate_Promise(query: FilterQuery[T], update: UpdateQuery[T], options: FindOneAndUpdateOptionrep): js.Promise[FindOneResult[T]] = js.native
  @JSName("findOneAndUpdate")
  def findOneAndUpdate_Promise(query: FilterQuery[T], update: Partial[T]): js.Promise[FindOneResult[T]] = js.native
  @JSName("findOneAndUpdate")
  def findOneAndUpdate_Promise(query: FilterQuery[T], update: Partial[T], options: FindOneAndUpdateOptionrep): js.Promise[FindOneResult[T]] = js.native
  def geoHaystackSearch(x: Double, y: Double): js.Promise[GeoHaystackSearchResult[T]] = js.native
  def geoHaystackSearch(x: Double, y: Double, options: GeoHaystackSearchOptions): js.Promise[GeoHaystackSearchResult[T]] = js.native
  def geoHaystackSearch(
    x: Double,
    y: Double,
    options: GeoHaystackSearchOptions,
    callback: Callback[GeoHaystackSearchResult[T]]
  ): Unit = js.native
  /** @deprecated MongoDB 3.6 or higher no longer supports the group command. We recommend rewriting using the aggregation framework. */
  def group[U](
    keys: js.Any,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[U] = js.native
  def group[U](
    keys: js.Any,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: js.UndefOr[scala.Nothing],
    callback: Callback[U]
  ): Unit = js.native
  def group[U](
    keys: js.Any,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: js.Object
  ): js.Promise[U] = js.native
  def group[U](
    keys: js.Any,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: js.Object,
    callback: Callback[U]
  ): Unit = js.native
  @JSName("group")
  def group_U_Unit[U](
    keys: js.Any,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean
  ): Unit = js.native
  @JSName("group")
  def group_U_Unit[U](
    keys: js.Any,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: js.Object
  ): Unit = js.native
  def indexes(): js.Promise[IndexesResult[T]] = js.native
  def indexes(callback: Callback[IndexesResult[T]]): Unit = js.native
  def insert(data: SingleOrArray[T]): js.Promise[InsertResult[T]] = js.native
  def insert(data: SingleOrArray[T], options: CollectionInsertOneOptionsMonk): js.Promise[InsertResult[T]] = js.native
  def insert(
    data: SingleOrArray[T],
    options: CollectionInsertOneOptionsMonk,
    callback: Callback[InsertResult[T]]
  ): Unit = js.native
  def mapReduce[TKey, TValue](
    map: CollectionMapFunction[T],
    reduce: CollectionReduceFunction[TKey, TValue],
    options: MapReduceOptions
  ): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](
    map: CollectionMapFunction[T],
    reduce: CollectionReduceFunction[TKey, TValue],
    options: MapReduceOptions,
    callback: Callback[_]
  ): Unit = js.native
  def remove(): js.Promise[DeleteWriteOpResultObject] = js.native
  def remove(query: js.UndefOr[scala.Nothing], options: RemoveOptions): js.Promise[DeleteWriteOpResultObject] = js.native
  def remove(query: FilterQuery[T]): js.Promise[DeleteWriteOpResultObject] = js.native
  def remove(query: FilterQuery[T], options: RemoveOptions): js.Promise[DeleteWriteOpResultObject] = js.native
  def remove(query: FilterQuery[T], options: RemoveOptions, callback: Callback[DeleteWriteOpResultObject]): Unit = js.native
  def stats(): js.Promise[CollStats] = js.native
  def stats(options: StatsOptions): js.Promise[CollStats] = js.native
  def stats(options: StatsOptions, callback: Callback[CollStats]): Unit = js.native
  def update(query: FilterQuery[T], update: UpdateQuery[T]): js.Promise[UpdateWriteOpResult] = js.native
  def update(query: FilterQuery[T], update: UpdateQuery[T], options: UpdateOneOptions): js.Promise[UpdateWriteOpResult] = js.native
  def update(
    query: FilterQuery[T],
    update: UpdateQuery[T],
    options: UpdateOneOptions,
    callback: Callback[UpdateWriteOpResult]
  ): Unit = js.native
  def update(query: FilterQuery[T], update: Partial[T]): js.Promise[UpdateWriteOpResult] = js.native
  def update(query: FilterQuery[T], update: Partial[T], options: UpdateOneOptions): js.Promise[UpdateWriteOpResult] = js.native
  def update(
    query: FilterQuery[T],
    update: Partial[T],
    options: UpdateOneOptions,
    callback: Callback[UpdateWriteOpResult]
  ): Unit = js.native
}

