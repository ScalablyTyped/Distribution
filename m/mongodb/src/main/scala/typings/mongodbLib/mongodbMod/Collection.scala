package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[TSchema] extends js.Object {
  /**
       * Get the collection name.
       */
  var collectionName: java.lang.String = js.native
  /**
       * Get current index hint for collection.
       */
  var hint: js.Any = js.native
  /**
       * Get the full collection namespace.
       */
  var namespace: java.lang.String = js.native
  /**
       * The current read concern values.
       */
  var readConcern: ReadConcern = js.native
  /**
       * The current write concern values.
       */
  var writeConcern: js.Any = js.native
  def aggregate[T](): AggregationCursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.0/api/Collection.html#aggregate */
  def aggregate[T](callback: MongoCallback[AggregationCursor[T]]): AggregationCursor[T] = js.native
  def aggregate[T](pipeline: js.Array[js.Object]): AggregationCursor[T] = js.native
  def aggregate[T](pipeline: js.Array[js.Object], callback: MongoCallback[AggregationCursor[T]]): AggregationCursor[T] = js.native
  def aggregate[T](pipeline: js.Array[js.Object], options: CollectionAggregationOptions): AggregationCursor[T] = js.native
  def aggregate[T](
    pipeline: js.Array[js.Object],
    options: CollectionAggregationOptions,
    callback: MongoCallback[AggregationCursor[T]]
  ): AggregationCursor[T] = js.native
  def bulkWrite(operations: js.Array[js.Object]): stdLib.Promise[BulkWriteOpResultObject] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.0/api/Collection.html#bulkWrite */
  def bulkWrite(operations: js.Array[js.Object], callback: MongoCallback[BulkWriteOpResultObject]): scala.Unit = js.native
  def bulkWrite(operations: js.Array[js.Object], options: CollectionBulkWriteOptions): stdLib.Promise[BulkWriteOpResultObject] = js.native
  def bulkWrite(
    operations: js.Array[js.Object],
    options: CollectionBulkWriteOptions,
    callback: MongoCallback[BulkWriteOpResultObject]
  ): scala.Unit = js.native
  def count(): stdLib.Promise[scala.Double] = js.native
  /**
       * http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#count
       * @deprecated Use countDocuments or estimatedDocumentCount
       */
  def count(callback: MongoCallback[scala.Double]): scala.Unit = js.native
  def count(query: FilterQuery[TSchema]): stdLib.Promise[scala.Double] = js.native
  def count(query: FilterQuery[TSchema], callback: MongoCallback[scala.Double]): scala.Unit = js.native
  def count(query: FilterQuery[TSchema], options: MongoCountPreferences): stdLib.Promise[scala.Double] = js.native
  def count(query: FilterQuery[TSchema], options: MongoCountPreferences, callback: MongoCallback[scala.Double]): scala.Unit = js.native
  def countDocuments(): stdLib.Promise[scala.Double] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#countDocuments */
  def countDocuments(callback: MongoCallback[scala.Double]): scala.Unit = js.native
  def countDocuments(query: FilterQuery[TSchema]): stdLib.Promise[scala.Double] = js.native
  def countDocuments(query: FilterQuery[TSchema], callback: MongoCallback[scala.Double]): scala.Unit = js.native
  def countDocuments(query: FilterQuery[TSchema], options: MongoCountPreferences): stdLib.Promise[scala.Double] = js.native
  def countDocuments(query: FilterQuery[TSchema], options: MongoCountPreferences, callback: MongoCallback[scala.Double]): scala.Unit = js.native
  def createIndex(fieldOrSpec: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#createIndex */
  def createIndex(fieldOrSpec: java.lang.String, callback: MongoCallback[java.lang.String]): scala.Unit = js.native
  def createIndex(fieldOrSpec: java.lang.String, options: IndexOptions): stdLib.Promise[java.lang.String] = js.native
  def createIndex(fieldOrSpec: java.lang.String, options: IndexOptions, callback: MongoCallback[java.lang.String]): scala.Unit = js.native
  def createIndex(fieldOrSpec: js.Any): stdLib.Promise[java.lang.String] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#createIndex */
  def createIndex(fieldOrSpec: js.Any, callback: MongoCallback[java.lang.String]): scala.Unit = js.native
  def createIndex(fieldOrSpec: js.Any, options: IndexOptions): stdLib.Promise[java.lang.String] = js.native
  def createIndex(fieldOrSpec: js.Any, options: IndexOptions, callback: MongoCallback[java.lang.String]): scala.Unit = js.native
  def createIndexes(indexSpecs: js.Array[IndexSpecification]): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#createIndexes and  http://docs.mongodb.org/manual/reference/command/createIndexes/ */
  def createIndexes(indexSpecs: js.Array[IndexSpecification], callback: MongoCallback[_]): scala.Unit = js.native
  def createIndexes(indexSpecs: js.Array[IndexSpecification], options: mongodbLib.Anon_SessionClientSession_1575395223): stdLib.Promise[_] = js.native
  def createIndexes(
    indexSpecs: js.Array[IndexSpecification],
    options: mongodbLib.Anon_SessionClientSession_1575395223,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def deleteMany(filter: FilterQuery[TSchema]): stdLib.Promise[DeleteWriteOpResultObject] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#deleteMany */
  def deleteMany(filter: FilterQuery[TSchema], callback: MongoCallback[DeleteWriteOpResultObject]): scala.Unit = js.native
  def deleteMany(filter: FilterQuery[TSchema], options: CommonOptions): stdLib.Promise[DeleteWriteOpResultObject] = js.native
  def deleteMany(
    filter: FilterQuery[TSchema],
    options: CommonOptions,
    callback: MongoCallback[DeleteWriteOpResultObject]
  ): scala.Unit = js.native
  def deleteOne(filter: FilterQuery[TSchema]): stdLib.Promise[DeleteWriteOpResultObject] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#deleteOne */
  def deleteOne(filter: FilterQuery[TSchema], callback: MongoCallback[DeleteWriteOpResultObject]): scala.Unit = js.native
  def deleteOne(filter: FilterQuery[TSchema], options: CommonOptions with mongodbLib.Anon_BypassDocumentValidation): stdLib.Promise[DeleteWriteOpResultObject] = js.native
  def deleteOne(
    filter: FilterQuery[TSchema],
    options: CommonOptions with mongodbLib.Anon_BypassDocumentValidation,
    callback: MongoCallback[DeleteWriteOpResultObject]
  ): scala.Unit = js.native
  def distinct(key: java.lang.String, query: FilterQuery[TSchema]): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#distinct */
  def distinct(key: java.lang.String, query: FilterQuery[TSchema], callback: MongoCallback[_]): scala.Unit = js.native
  def distinct(
    key: java.lang.String,
    query: FilterQuery[TSchema],
    options: mongodbLib.Anon_SessionReadPreferenceMaxTimeMS
  ): stdLib.Promise[_] = js.native
  def distinct(
    key: java.lang.String,
    query: FilterQuery[TSchema],
    options: mongodbLib.Anon_SessionReadPreferenceMaxTimeMS,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#drop */
  def drop(): stdLib.Promise[_] = js.native
  def drop(callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#drop */
  def drop(options: mongodbLib.Anon_SessionClientSession): stdLib.Promise[_] = js.native
  def drop(options: mongodbLib.Anon_SessionClientSession, callback: MongoCallback[_]): scala.Unit = js.native
  def dropIndex(indexName: java.lang.String): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#dropIndex */
  def dropIndex(indexName: java.lang.String, callback: MongoCallback[_]): scala.Unit = js.native
  def dropIndex(indexName: java.lang.String, options: CommonOptions with mongodbLib.Anon_MaxTimeMS): stdLib.Promise[_] = js.native
  def dropIndex(
    indexName: java.lang.String,
    options: CommonOptions with mongodbLib.Anon_MaxTimeMS,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def dropIndexes(): scala.Unit = js.native
  def dropIndexes(callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#dropIndexes */
  def dropIndexes(options: mongodbLib.Anon_SessionMaxTimeMS): stdLib.Promise[_] = js.native
  def dropIndexes(options: mongodbLib.Anon_SessionMaxTimeMS, callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#dropIndexes */
  @JSName("dropIndexes")
  def dropIndexes_Promise(): stdLib.Promise[_] = js.native
  def estimatedDocumentCount(): stdLib.Promise[scala.Double] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#estimatedDocumentCount */
  def estimatedDocumentCount(callback: MongoCallback[scala.Double]): scala.Unit = js.native
  def estimatedDocumentCount(query: FilterQuery[TSchema]): stdLib.Promise[scala.Double] = js.native
  def estimatedDocumentCount(query: FilterQuery[TSchema], callback: MongoCallback[scala.Double]): scala.Unit = js.native
  def estimatedDocumentCount(query: FilterQuery[TSchema], options: MongoCountPreferences): stdLib.Promise[scala.Double] = js.native
  def estimatedDocumentCount(query: FilterQuery[TSchema], options: MongoCountPreferences, callback: MongoCallback[scala.Double]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#find */
  def find[T](): Cursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#find */
  def find[T](query: FilterQuery[TSchema]): Cursor[T] = js.native
  /** @deprecated */
  def find[T](query: FilterQuery[TSchema], options: FindOneOptions): Cursor[T] = js.native
  def findOne[T](filter: FilterQuery[TSchema]): stdLib.Promise[T | scala.Null] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#findOne */
  def findOne[T](filter: FilterQuery[TSchema], callback: MongoCallback[T | scala.Null]): scala.Unit = js.native
  def findOne[T](filter: FilterQuery[TSchema], options: FindOneOptions): stdLib.Promise[T | scala.Null] = js.native
  def findOne[T](filter: FilterQuery[TSchema], options: FindOneOptions, callback: MongoCallback[T | scala.Null]): scala.Unit = js.native
  def findOneAndDelete(filter: FilterQuery[TSchema]): stdLib.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#findOneAndDelete */
  def findOneAndDelete(filter: FilterQuery[TSchema], callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]): scala.Unit = js.native
  def findOneAndDelete(filter: FilterQuery[TSchema], options: mongodbLib.Anon_SessionProjection): stdLib.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  def findOneAndDelete(
    filter: FilterQuery[TSchema],
    options: mongodbLib.Anon_SessionProjection,
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): scala.Unit = js.native
  def findOneAndReplace(filter: FilterQuery[TSchema], replacement: js.Object): stdLib.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#findOneAndReplace */
  def findOneAndReplace(
    filter: FilterQuery[TSchema],
    replacement: js.Object,
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): scala.Unit = js.native
  def findOneAndReplace(filter: FilterQuery[TSchema], replacement: js.Object, options: FindOneAndReplaceOption): stdLib.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  def findOneAndReplace(
    filter: FilterQuery[TSchema],
    replacement: js.Object,
    options: FindOneAndReplaceOption,
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): scala.Unit = js.native
  def findOneAndUpdate(filter: FilterQuery[TSchema], update: TSchema): stdLib.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#findOneAndUpdate */
  def findOneAndUpdate(
    filter: FilterQuery[TSchema],
    update: TSchema,
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): scala.Unit = js.native
  def findOneAndUpdate(filter: FilterQuery[TSchema], update: TSchema, options: FindOneAndUpdateOption): stdLib.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  def findOneAndUpdate(
    filter: FilterQuery[TSchema],
    update: TSchema,
    options: FindOneAndUpdateOption,
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): scala.Unit = js.native
  def findOneAndUpdate(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema]): stdLib.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#findOneAndUpdate */
  def findOneAndUpdate(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): scala.Unit = js.native
  def findOneAndUpdate(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema], options: FindOneAndUpdateOption): stdLib.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  def findOneAndUpdate(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    options: FindOneAndUpdateOption,
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): scala.Unit = js.native
  def geoHaystackSearch(x: scala.Double, y: scala.Double): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#geoHaystackSearch */
  def geoHaystackSearch(x: scala.Double, y: scala.Double, callback: MongoCallback[_]): scala.Unit = js.native
  def geoHaystackSearch(x: scala.Double, y: scala.Double, options: GeoHaystackSearchOptions): stdLib.Promise[_] = js.native
  def geoHaystackSearch(x: scala.Double, y: scala.Double, options: GeoHaystackSearchOptions, callback: MongoCallback[_]): scala.Unit = js.native
  def geoNear(x: scala.Double, y: scala.Double): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#geoNear */
  def geoNear(x: scala.Double, y: scala.Double, callback: MongoCallback[_]): scala.Unit = js.native
  def geoNear(x: scala.Double, y: scala.Double, options: GeoNearOptions): stdLib.Promise[_] = js.native
  def geoNear(x: scala.Double, y: scala.Double, options: GeoNearOptions, callback: MongoCallback[_]): scala.Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean
  ): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString
  ): stdLib.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: scala.Boolean,
    options: mongodbLib.Anon_ReadPreferenceString,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def indexExists(indexes: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#indexExists */
  def indexExists(indexes: java.lang.String, callback: MongoCallback[scala.Boolean]): scala.Unit = js.native
  def indexExists(indexes: java.lang.String, options: mongodbLib.Anon_SessionClientSession): stdLib.Promise[scala.Boolean] = js.native
  def indexExists(
    indexes: java.lang.String,
    options: mongodbLib.Anon_SessionClientSession,
    callback: MongoCallback[scala.Boolean]
  ): scala.Unit = js.native
  def indexExists(indexes: js.Array[java.lang.String]): stdLib.Promise[scala.Boolean] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#indexExists */
  def indexExists(indexes: js.Array[java.lang.String], callback: MongoCallback[scala.Boolean]): scala.Unit = js.native
  def indexExists(indexes: js.Array[java.lang.String], options: mongodbLib.Anon_SessionClientSession): stdLib.Promise[scala.Boolean] = js.native
  def indexExists(
    indexes: js.Array[java.lang.String],
    options: mongodbLib.Anon_SessionClientSession,
    callback: MongoCallback[scala.Boolean]
  ): scala.Unit = js.native
  def indexInformation(): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#indexInformation */
  def indexInformation(callback: MongoCallback[_]): scala.Unit = js.native
  def indexInformation(options: mongodbLib.Anon_SessionFull): stdLib.Promise[_] = js.native
  def indexInformation(options: mongodbLib.Anon_SessionFull, callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#indexes */
  def indexes(): stdLib.Promise[_] = js.native
  def indexes(callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#indexes */
  def indexes(options: mongodbLib.Anon_SessionClientSession): stdLib.Promise[_] = js.native
  def indexes(options: mongodbLib.Anon_SessionClientSession_1575395223, callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#initializeOrderedBulkOp */
  def initializeOrderedBulkOp(): OrderedBulkOperation = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#initializeOrderedBulkOp */
  def initializeOrderedBulkOp(options: CommonOptions): OrderedBulkOperation = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#initializeUnorderedBulkOp */
  def initializeUnorderedBulkOp(): UnorderedBulkOperation = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#initializeUnorderedBulkOp */
  def initializeUnorderedBulkOp(options: CommonOptions): UnorderedBulkOperation = js.native
  /** @deprecated Use insertOne, insertMany or bulkWrite */
  def insert(docs: TSchema): stdLib.Promise[InsertOneWriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#insertOne */
  /** @deprecated Use insertOne, insertMany or bulkWrite */
  def insert(docs: TSchema, callback: MongoCallback[InsertOneWriteOpResult]): scala.Unit = js.native
  /** @deprecated Use insertOne, insertMany or bulkWrite */
  def insert(docs: TSchema, options: CollectionInsertOneOptions): stdLib.Promise[InsertOneWriteOpResult] = js.native
  /** @deprecated Use insertOne, insertMany or bulkWrite */
  def insert(
    docs: TSchema,
    options: CollectionInsertOneOptions,
    callback: MongoCallback[InsertOneWriteOpResult]
  ): scala.Unit = js.native
  def insertMany(docs: js.Array[TSchema]): stdLib.Promise[InsertWriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#insertMany */
  def insertMany(docs: js.Array[TSchema], callback: MongoCallback[InsertWriteOpResult]): scala.Unit = js.native
  def insertMany(docs: js.Array[TSchema], options: CollectionInsertManyOptions): stdLib.Promise[InsertWriteOpResult] = js.native
  def insertMany(
    docs: js.Array[TSchema],
    options: CollectionInsertManyOptions,
    callback: MongoCallback[InsertWriteOpResult]
  ): scala.Unit = js.native
  def insertOne(docs: TSchema): stdLib.Promise[InsertOneWriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#insertOne */
  def insertOne(docs: TSchema, callback: MongoCallback[InsertOneWriteOpResult]): scala.Unit = js.native
  def insertOne(docs: TSchema, options: CollectionInsertOneOptions): stdLib.Promise[InsertOneWriteOpResult] = js.native
  def insertOne(
    docs: TSchema,
    options: CollectionInsertOneOptions,
    callback: MongoCallback[InsertOneWriteOpResult]
  ): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#isCapped */
  def isCapped(): stdLib.Promise[_] = js.native
  def isCapped(callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#isCapped */
  def isCapped(options: mongodbLib.Anon_SessionClientSession): stdLib.Promise[_] = js.native
  def isCapped(options: mongodbLib.Anon_SessionClientSession, callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#listIndexes */
  def listIndexes(): CommandCursor = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#listIndexes */
  def listIndexes(options: mongodbLib.Anon_SessionReadPreference): CommandCursor = js.native
  def mapReduce(map: java.lang.String, reduce: java.lang.String): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#mapReduce */
  def mapReduce(map: java.lang.String, reduce: java.lang.String, callback: MongoCallback[_]): scala.Unit = js.native
  def mapReduce(map: java.lang.String, reduce: java.lang.String, options: MapReduceOptions): stdLib.Promise[_] = js.native
  def mapReduce(
    map: java.lang.String,
    reduce: java.lang.String,
    options: MapReduceOptions,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def mapReduce(map: java.lang.String, reduce: js.Function): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#mapReduce */
  def mapReduce(map: java.lang.String, reduce: js.Function, callback: MongoCallback[_]): scala.Unit = js.native
  def mapReduce(map: java.lang.String, reduce: js.Function, options: MapReduceOptions): stdLib.Promise[_] = js.native
  def mapReduce(map: java.lang.String, reduce: js.Function, options: MapReduceOptions, callback: MongoCallback[_]): scala.Unit = js.native
  def mapReduce(map: js.Function, reduce: java.lang.String): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#mapReduce */
  def mapReduce(map: js.Function, reduce: java.lang.String, callback: MongoCallback[_]): scala.Unit = js.native
  def mapReduce(map: js.Function, reduce: java.lang.String, options: MapReduceOptions): stdLib.Promise[_] = js.native
  def mapReduce(map: js.Function, reduce: java.lang.String, options: MapReduceOptions, callback: MongoCallback[_]): scala.Unit = js.native
  def mapReduce(map: js.Function, reduce: js.Function): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#mapReduce */
  def mapReduce(map: js.Function, reduce: js.Function, callback: MongoCallback[_]): scala.Unit = js.native
  def mapReduce(map: js.Function, reduce: js.Function, options: MapReduceOptions): stdLib.Promise[_] = js.native
  def mapReduce(map: js.Function, reduce: js.Function, options: MapReduceOptions, callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#options */
  def options(): stdLib.Promise[_] = js.native
  def options(callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#options */
  def options(options: mongodbLib.Anon_SessionClientSession): stdLib.Promise[_] = js.native
  def options(options: mongodbLib.Anon_SessionClientSession, callback: MongoCallback[_]): scala.Unit = js.native
  def parallelCollectionScan(): stdLib.Promise[js.Array[Cursor[_]]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#parallelCollectionScan */
  def parallelCollectionScan(callback: MongoCallback[js.Array[Cursor[_]]]): scala.Unit = js.native
  def parallelCollectionScan(options: ParallelCollectionScanOptions): stdLib.Promise[js.Array[Cursor[_]]] = js.native
  def parallelCollectionScan(options: ParallelCollectionScanOptions, callback: MongoCallback[js.Array[Cursor[_]]]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#reIndex */
  def reIndex(): stdLib.Promise[_] = js.native
  def reIndex(callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#reIndex */
  def reIndex(options: mongodbLib.Anon_SessionClientSession): stdLib.Promise[_] = js.native
  def reIndex(options: mongodbLib.Anon_SessionClientSession, callback: MongoCallback[_]): scala.Unit = js.native
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  def remove(selector: js.Object): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#remove */
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  def remove(selector: js.Object, callback: MongoCallback[WriteOpResult]): scala.Unit = js.native
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  def remove(selector: js.Object, options: CommonOptions with mongodbLib.Anon_Single): scala.Unit = js.native
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  def remove(
    selector: js.Object,
    options: CommonOptions with mongodbLib.Anon_Single,
    callback: MongoCallback[WriteOpResult]
  ): scala.Unit = js.native
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  @JSName("remove")
  def remove_Promise(selector: js.Object): stdLib.Promise[WriteOpResult] = js.native
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  @JSName("remove")
  def remove_Promise(selector: js.Object, options: CommonOptions with mongodbLib.Anon_Single): stdLib.Promise[WriteOpResult] = js.native
  def rename(newName: java.lang.String): stdLib.Promise[Collection[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#rename */
  def rename(newName: java.lang.String, callback: MongoCallback[Collection[TSchema]]): scala.Unit = js.native
  def rename(newName: java.lang.String, options: mongodbLib.Anon_DropTarget): stdLib.Promise[Collection[TSchema]] = js.native
  def rename(
    newName: java.lang.String,
    options: mongodbLib.Anon_DropTarget,
    callback: MongoCallback[Collection[TSchema]]
  ): scala.Unit = js.native
  def replaceOne(filter: FilterQuery[TSchema], doc: TSchema): stdLib.Promise[ReplaceWriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#replaceOne */
  def replaceOne(filter: FilterQuery[TSchema], doc: TSchema, callback: MongoCallback[ReplaceWriteOpResult]): scala.Unit = js.native
  def replaceOne(filter: FilterQuery[TSchema], doc: TSchema, options: ReplaceOneOptions): stdLib.Promise[ReplaceWriteOpResult] = js.native
  def replaceOne(
    filter: FilterQuery[TSchema],
    doc: TSchema,
    options: ReplaceOneOptions,
    callback: MongoCallback[ReplaceWriteOpResult]
  ): scala.Unit = js.native
  /** @deprecated Use insertOne, insertMany, updateOne or updateMany */
  def save(doc: TSchema): stdLib.Promise[WriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#save */
  /** @deprecated Use insertOne, insertMany, updateOne or updateMany */
  def save(doc: TSchema, callback: MongoCallback[WriteOpResult]): scala.Unit = js.native
  /** @deprecated Use insertOne, insertMany, updateOne or updateMany */
  def save(doc: TSchema, options: CommonOptions): stdLib.Promise[WriteOpResult] = js.native
  /** @deprecated Use insertOne, insertMany, updateOne or updateMany */
  def save(doc: TSchema, options: CommonOptions, callback: MongoCallback[WriteOpResult]): scala.Unit = js.native
  def stats(): stdLib.Promise[CollStats] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#stats */
  def stats(callback: MongoCallback[CollStats]): scala.Unit = js.native
  def stats(options: mongodbLib.Anon_Session): stdLib.Promise[CollStats] = js.native
  def stats(options: mongodbLib.Anon_Session, callback: MongoCallback[CollStats]): scala.Unit = js.native
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(filter: FilterQuery[TSchema], update: TSchema): stdLib.Promise[WriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#update */
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(filter: FilterQuery[TSchema], update: TSchema, callback: MongoCallback[WriteOpResult]): scala.Unit = js.native
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(
    filter: FilterQuery[TSchema],
    update: TSchema,
    options: UpdateOneOptions with mongodbLib.Anon_Multi
  ): stdLib.Promise[WriteOpResult] = js.native
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(
    filter: FilterQuery[TSchema],
    update: TSchema,
    options: UpdateOneOptions with mongodbLib.Anon_Multi,
    callback: MongoCallback[WriteOpResult]
  ): scala.Unit = js.native
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema]): stdLib.Promise[WriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#update */
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema], callback: MongoCallback[WriteOpResult]): scala.Unit = js.native
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    options: UpdateOneOptions with mongodbLib.Anon_Multi
  ): stdLib.Promise[WriteOpResult] = js.native
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    options: UpdateOneOptions with mongodbLib.Anon_Multi,
    callback: MongoCallback[WriteOpResult]
  ): scala.Unit = js.native
  def updateMany(filter: FilterQuery[TSchema], update: TSchema): stdLib.Promise[UpdateWriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#updateMany */
  def updateMany(filter: FilterQuery[TSchema], update: TSchema, callback: MongoCallback[UpdateWriteOpResult]): scala.Unit = js.native
  def updateMany(filter: FilterQuery[TSchema], update: TSchema, options: UpdateManyOptions): stdLib.Promise[UpdateWriteOpResult] = js.native
  def updateMany(
    filter: FilterQuery[TSchema],
    update: TSchema,
    options: UpdateManyOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): scala.Unit = js.native
  def updateMany(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema]): stdLib.Promise[UpdateWriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#updateMany */
  def updateMany(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    callback: MongoCallback[UpdateWriteOpResult]
  ): scala.Unit = js.native
  def updateMany(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema], options: UpdateManyOptions): stdLib.Promise[UpdateWriteOpResult] = js.native
  def updateMany(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    options: UpdateManyOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): scala.Unit = js.native
  def updateOne(filter: FilterQuery[TSchema], update: TSchema): stdLib.Promise[UpdateWriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#updateOne */
  def updateOne(filter: FilterQuery[TSchema], update: TSchema, callback: MongoCallback[UpdateWriteOpResult]): scala.Unit = js.native
  def updateOne(filter: FilterQuery[TSchema], update: TSchema, options: UpdateOneOptions): stdLib.Promise[UpdateWriteOpResult] = js.native
  def updateOne(
    filter: FilterQuery[TSchema],
    update: TSchema,
    options: UpdateOneOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): scala.Unit = js.native
  def updateOne(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema]): stdLib.Promise[UpdateWriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#updateOne */
  def updateOne(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    callback: MongoCallback[UpdateWriteOpResult]
  ): scala.Unit = js.native
  def updateOne(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema], options: UpdateOneOptions): stdLib.Promise[UpdateWriteOpResult] = js.native
  def updateOne(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    options: UpdateOneOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#watch */
  def watch(): ChangeStream = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#watch */
  def watch(pipeline: js.Array[js.Object]): ChangeStream = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#watch */
  def watch(
    pipeline: js.Array[js.Object],
    options: ChangeStreamOptions with mongodbLib.Anon_SessionStartAtClusterTime
  ): ChangeStream = js.native
}

