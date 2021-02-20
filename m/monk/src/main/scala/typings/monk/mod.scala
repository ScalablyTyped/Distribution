package typings.monk

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.mongodb.mod.BulkWriteOpResultObject
import typings.mongodb.mod.BulkWriteOperation
import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.CollStats
import typings.mongodb.mod.CollationDocument
import typings.mongodb.mod.CollectionAggregationOptions
import typings.mongodb.mod.CollectionBulkWriteOptions
import typings.mongodb.mod.CollectionCreateOptions
import typings.mongodb.mod.CollectionMapFunction
import typings.mongodb.mod.CollectionReduceFunction
import typings.mongodb.mod.CommonOptions
import typings.mongodb.mod.Cursor
import typings.mongodb.mod.DeleteWriteOpResultObject
import typings.mongodb.mod.FilterQuery
import typings.mongodb.mod.FindOneAndDeleteOption
import typings.mongodb.mod.FindOneAndReplaceOption
import typings.mongodb.mod.FindOneAndUpdateOption
import typings.mongodb.mod.FindOneOptions
import typings.mongodb.mod.GeoHaystackSearchOptions
import typings.mongodb.mod.IndexOptions
import typings.mongodb.mod.MapReduceOptions
import typings.mongodb.mod.MongoCountPreferences
import typings.mongodb.mod.MongoDistinctPreferences
import typings.mongodb.mod.ProjectionOperators
import typings.mongodb.mod.ReadPreferenceOrMode
import typings.mongodb.mod.SchemaMember
import typings.mongodb.mod.SortOptionObject
import typings.mongodb.mod.UpdateOneOptions
import typings.mongodb.mod.UpdateQuery
import typings.mongodb.mod.UpdateWriteOpResult
import typings.monk.anon.Close
import typings.monk.anon.Collection
import typings.monk.anon.Id
import typings.monk.anon.MongoClientOptionscollect
import typings.monk.anon.RawCursor
import typings.monk.anon.ReplaceOne
import typings.monk.anon.`0`
import typings.monk.monkNumbers.`-1`
import typings.monk.monkNumbers.`1`
import typings.monk.monkStrings.closed
import typings.monk.monkStrings.majority
import typings.monk.monkStrings.open
import typings.monk.monkStrings.opening
import typings.std.Error
import typings.std.FlatArray
import typings.std.IterableIterator
import typings.std.Partial
import typings.std.anon.CopyWithin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("monk", JSImport.Default)
  @js.native
  def default(database: String): js.Promise[IMonkManager] with IMonkManager = js.native
  @JSImport("monk", JSImport.Default)
  @js.native
  def default(database: String, options: MongoClientOptionscollect): js.Promise[IMonkManager] with IMonkManager = js.native
  @JSImport("monk", JSImport.Default)
  @js.native
  def default(database: js.Array[String]): js.Promise[IMonkManager] with IMonkManager = js.native
  @JSImport("monk", JSImport.Default)
  @js.native
  def default(database: js.Array[String], options: MongoClientOptionscollect): js.Promise[IMonkManager] with IMonkManager = js.native
  
  @JSImport("monk", "ICollection")
  @js.native
  class ICollection[T /* <: StringDictionary[js.Any] */] () extends StObject {
    
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
    def find(query: js.UndefOr[scala.Nothing], options: FindOptions[T]): js.Promise[FindResult[T]] = js.native
    // Raw
    def find(query: FilterQuery[T]): js.Promise[FindRawResult[T]] = js.native
    def find(query: FilterQuery[T], options: (FindOptions[T] with RawCursor) | FindOptions[T]): js.Promise[FindRawResult[T]] = js.native
    def find(
      query: FilterQuery[T],
      options: (FindOneOptions[T] with RawCursor) | FindOneOptions[T],
      callback: Callback[FindRawResult[T] | FindResult[T]]
    ): Unit = js.native
    
    def findOne(): js.Promise[FindOneResult[T]] = js.native
    def findOne(query: js.UndefOr[scala.Nothing], options: FindOneOptions[T]): js.Promise[FindOneResult[T]] = js.native
    def findOne(query: FilterQuery[T]): js.Promise[FindOneResult[T]] = js.native
    def findOne(query: FilterQuery[T], options: FindOneOptions[T]): js.Promise[FindOneResult[T]] = js.native
    def findOne(query: FilterQuery[T], options: FindOneOptions[T], callback: Callback[FindOneResult[T]]): Unit = js.native
    
    def findOneAndDelete(query: FilterQuery[T]): js.Promise[FindOneResult[T]] = js.native
    def findOneAndDelete(query: FilterQuery[T], options: FindOneAndDeleteOption[T]): js.Promise[FindOneResult[T]] = js.native
    def findOneAndDelete(query: FilterQuery[T], options: FindOneAndDeleteOption[T], callback: Callback[FindOneResult[T]]): Unit = js.native
    
    // Replace
    def findOneAndUpdate(query: FilterQuery[T], update: T): js.Promise[FindOneResult[T]] = js.native
    def findOneAndUpdate(query: FilterQuery[T], update: T, options: FindOneAndReplaceOption[T] with `0`): js.Promise[FindOneResult[T]] = js.native
    def findOneAndUpdate(
      query: FilterQuery[T],
      update: T,
      options: FindOneAndReplaceOption[T] with `0`,
      callback: Callback[FindOneResult[T]]
    ): Unit = js.native
    def findOneAndUpdate(query: FilterQuery[T], update: UpdateQuery[T]): Unit = js.native
    def findOneAndUpdate(query: FilterQuery[T], update: UpdateQuery[T], options: FindOneAndUpdateOption[T] with ReplaceOne): Unit = js.native
    def findOneAndUpdate(
      query: FilterQuery[T],
      update: UpdateQuery[T],
      options: FindOneAndUpdateOption[T] with ReplaceOne,
      callback: Callback[FindOneResult[T]]
    ): Unit = js.native
    def findOneAndUpdate(
      query: FilterQuery[T],
      update: UpdateQuery[T],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[FindOneResult[T]]
    ): Unit = js.native
    def findOneAndUpdate(query: FilterQuery[T], update: Partial[T]): Unit = js.native
    def findOneAndUpdate(query: FilterQuery[T], update: Partial[T], options: FindOneAndUpdateOption[T] with ReplaceOne): Unit = js.native
    def findOneAndUpdate(
      query: FilterQuery[T],
      update: Partial[T],
      options: FindOneAndUpdateOption[T] with ReplaceOne,
      callback: Callback[FindOneResult[T]]
    ): Unit = js.native
    def findOneAndUpdate(
      query: FilterQuery[T],
      update: Partial[T],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[FindOneResult[T]]
    ): Unit = js.native
    // Update
    @JSName("findOneAndUpdate")
    def findOneAndUpdate_Promise(query: FilterQuery[T], update: UpdateQuery[T]): js.Promise[FindOneResult[T]] = js.native
    @JSName("findOneAndUpdate")
    def findOneAndUpdate_Promise(query: FilterQuery[T], update: UpdateQuery[T], options: FindOneAndUpdateOption[T] with ReplaceOne): js.Promise[FindOneResult[T]] = js.native
    @JSName("findOneAndUpdate")
    def findOneAndUpdate_Promise(query: FilterQuery[T], update: Partial[T]): js.Promise[FindOneResult[T]] = js.native
    @JSName("findOneAndUpdate")
    def findOneAndUpdate_Promise(query: FilterQuery[T], update: Partial[T], options: FindOneAndUpdateOption[T] with ReplaceOne): js.Promise[FindOneResult[T]] = js.native
    
    def geoHaystackSearch(x: Double, y: Double): js.Promise[GeoHaystackSearchResult[T]] = js.native
    def geoHaystackSearch(x: Double, y: Double, options: GeoHaystackSearchOptions): js.Promise[GeoHaystackSearchResult[T]] = js.native
    def geoHaystackSearch(
      x: Double,
      y: Double,
      options: GeoHaystackSearchOptions,
      callback: Callback[GeoHaystackSearchResult[T]]
    ): Unit = js.native
    
    def group[U](
      keys: js.Any,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): Unit = js.native
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
    ): Unit = js.native
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
    /** @deprecated MongoDB 3.6 or higher no longer supports the group command. We recommend rewriting using the aggregation framework. */
    @JSName("group")
    def group_U_Promise[U](
      keys: js.Any,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[U] = js.native
    @JSName("group")
    def group_U_Promise[U](
      keys: js.Any,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: js.Object
    ): js.Promise[U] = js.native
    
    def indexes(): js.Promise[IndexesResult[T]] = js.native
    def indexes(callback: Callback[IndexesResult[T]]): Unit = js.native
    
    def insert(data: SingleOrArray[T]): js.Promise[InsertResult[T]] = js.native
    def insert(data: SingleOrArray[T], options: CollectionInsertOneOptionsMonk): js.Promise[InsertResult[T]] = js.native
    def insert(
      data: SingleOrArray[T],
      options: CollectionInsertOneOptionsMonk,
      callback: Callback[InsertResult[T]]
    ): Unit = js.native
    
    val manager: IMonkManager = js.native
    
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
    
    val middlewares: js.Array[TMiddleware] = js.native
    
    val name: String = js.native
    
    var options: js.Object = js.native
    
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
  
  @JSImport("monk", "IMonkManager")
  @js.native
  class IMonkManager () extends StObject {
    
    val _state: closed | opening | open = js.native
    
    def addListener(event: String, handler: js.Function1[/* event */ js.Any, _]): Unit = js.native
    
    def addMiddleware(middleware: TMiddleware): Unit = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def create[T](name: String): ICollection[T] = js.native
    def create[T](name: String, creationOption: js.UndefOr[scala.Nothing], options: CollectionOptions): ICollection[T] = js.native
    def create[T](name: String, creationOption: CollectionCreateOptions): ICollection[T] = js.native
    def create[T](name: String, creationOption: CollectionCreateOptions, options: CollectionOptions): ICollection[T] = js.native
    
    def get[T](name: String): ICollection[T] = js.native
    def get[T](name: String, options: CollectionOptions): ICollection[T] = js.native
    
    def listCollections(): js.Array[ICollection[_]] = js.native
    def listCollections(query: js.Object): js.Array[ICollection[_]] = js.native
    
    def on(event: String, handler: js.Function1[/* event */ js.Any, _]): Unit = js.native
    
    def once(event: String, handler: js.Function1[/* event */ js.Any, _]): Unit = js.native
    
    def removeListener(event: String, handler: js.Function1[/* event */ js.Any, _]): Unit = js.native
    
    def setDefaultCollectionOptions(): Unit = js.native
    def setDefaultCollectionOptions(collectionOptions: CollectionOptions): Unit = js.native
  }
  
  @JSImport("monk", "cast")
  @js.native
  def cast(): js.Any = js.native
  @JSImport("monk", "cast")
  @js.native
  def cast(obj: js.Any): js.Any = js.native
  @JSImport("monk", "cast")
  @js.native
  def cast(obj: js.Array[_]): js.Any = js.native
  @JSImport("monk", "cast")
  @js.native
  def cast(obj: js.Object): js.Any = js.native
  
  @JSImport("monk", "id")
  @js.native
  def id(): IObjectID = js.native
  @JSImport("monk", "id")
  @js.native
  def id(hexstring: String): IObjectID = js.native
  @JSImport("monk", "id")
  @js.native
  def id(obj: IObjectID): IObjectID = js.native
  
  type Callback[T] = js.Function2[/* err */ Error | Null, /* data */ T, Unit]
  
  /* Inlined mongodb.mongodb.CollectionInsertOneOptions & {  castIds :boolean} */
  @js.native
  trait CollectionInsertOneOptionsMonk extends StObject {
    
    //Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    var bypassDocumentValidation: js.UndefOr[Boolean] = js.native
    
    var castIds: Boolean = js.native
    
    //Force server to assign _id values instead of driver.
    var forceServerObjectId: js.UndefOr[Boolean] = js.native
    
    /**
      * requests acknowledgement from MongoDB that the write operation has
      * been written to the journal
      * @default false
      */
    var j: js.UndefOr[Boolean] = js.native
    
    /**
      * Serialize functions on any object.
      */
    var serializeFunctions: js.UndefOr[Boolean] = js.native
    
    var session: js.UndefOr[ClientSession] = js.native
    
    /**
      * requests acknowledgement that the write operation has
      * propagated to a specified number of mongod hosts
      * @default 1
      */
    var w: js.UndefOr[Double | majority | String] = js.native
    
    /**
      * a time limit, in milliseconds, for the write concern
      */
    var wtimeout: js.UndefOr[Double] = js.native
  }
  object CollectionInsertOneOptionsMonk {
    
    @scala.inline
    def apply(castIds: Boolean): CollectionInsertOneOptionsMonk = {
      val __obj = js.Dynamic.literal(castIds = castIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionInsertOneOptionsMonk]
    }
    
    @scala.inline
    implicit class CollectionInsertOneOptionsMonkMutableBuilder[Self <: CollectionInsertOneOptionsMonk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
      
      @scala.inline
      def setCastIds(value: Boolean): Self = StObject.set(x, "castIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceServerObjectId(value: Boolean): Self = StObject.set(x, "forceServerObjectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceServerObjectIdUndefined: Self = StObject.set(x, "forceServerObjectId", js.undefined)
      
      @scala.inline
      def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJUndefined: Self = StObject.set(x, "j", js.undefined)
      
      @scala.inline
      def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
      
      @scala.inline
      def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setW(value: Double | majority | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      @scala.inline
      def setWtimeout(value: Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
    }
  }
  
  @js.native
  trait CollectionOptions extends StObject {
    
    var middlewares: js.UndefOr[js.Array[TMiddleware]] = js.native
  }
  object CollectionOptions {
    
    @scala.inline
    def apply(): CollectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectionOptions]
    }
    
    @scala.inline
    implicit class CollectionOptionsMutableBuilder[Self <: CollectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMiddlewares(value: js.Array[TMiddleware]): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddlewaresUndefined: Self = StObject.set(x, "middlewares", js.undefined)
      
      @scala.inline
      def setMiddlewaresVarargs(value: TMiddleware*): Self = StObject.set(x, "middlewares", js.Array(value :_*))
    }
  }
  
  type CreateIndexInput[T] = String | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? 1 | -1}
    */ typings.monk.monkStrings.CreateIndexInput with TopLevel[js.Any])
  
  type DropIndexInput[T] = CreateIndexInput[T] with js.Array[String]
  
  /* Inlined mongodb.mongodb.CommonOptions & {  maxTimeMS :number | undefined} */
  @js.native
  trait DropIndexOptions extends StObject {
    
    /**
      * requests acknowledgement from MongoDB that the write operation has
      * been written to the journal
      * @default false
      */
    var j: js.UndefOr[Boolean] = js.native
    
    var maxTimeMS: js.UndefOr[Double] = js.native
    
    var session: js.UndefOr[ClientSession] = js.native
    
    /**
      * requests acknowledgement that the write operation has
      * propagated to a specified number of mongod hosts
      * @default 1
      */
    var w: js.UndefOr[Double | majority | String] = js.native
    
    /**
      * a time limit, in milliseconds, for the write concern
      */
    var wtimeout: js.UndefOr[Double] = js.native
  }
  object DropIndexOptions {
    
    @scala.inline
    def apply(): DropIndexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropIndexOptions]
    }
    
    @scala.inline
    implicit class DropIndexOptionsMutableBuilder[Self <: DropIndexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJUndefined: Self = StObject.set(x, "j", js.undefined)
      
      @scala.inline
      def setMaxTimeMS(value: Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
      
      @scala.inline
      def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setW(value: Double | majority | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      @scala.inline
      def setWtimeout(value: Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
    }
  }
  
  @js.native
  trait DropIndexResult extends StObject {
    
    var nIndexesWas: Double = js.native
    
    var ok: `1` | typings.monk.monkNumbers.`0` = js.native
  }
  object DropIndexResult {
    
    @scala.inline
    def apply(nIndexesWas: Double, ok: `1` | typings.monk.monkNumbers.`0`): DropIndexResult = {
      val __obj = js.Dynamic.literal(nIndexesWas = nIndexesWas.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropIndexResult]
    }
    
    @scala.inline
    implicit class DropIndexResultMutableBuilder[Self <: DropIndexResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNIndexesWas(value: Double): Self = StObject.set(x, "nIndexesWas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: `1` | typings.monk.monkNumbers.`0`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined monk.monk.DropIndexResult & {  msg :string | undefined} */
  @js.native
  trait DropIndexesResult extends StObject {
    
    var msg: js.UndefOr[String] = js.native
    
    var nIndexesWas: Double = js.native
    
    var ok: `1` | typings.monk.monkNumbers.`0` = js.native
  }
  object DropIndexesResult {
    
    @scala.inline
    def apply(nIndexesWas: Double, ok: `1` | typings.monk.monkNumbers.`0`): DropIndexesResult = {
      val __obj = js.Dynamic.literal(nIndexesWas = nIndexesWas.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropIndexesResult]
    }
    
    @scala.inline
    implicit class DropIndexesResultMutableBuilder[Self <: DropIndexesResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      @scala.inline
      def setNIndexesWas(value: Double): Self = StObject.set(x, "nIndexesWas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: `1` | typings.monk.monkNumbers.`0`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
  
  // Returns
  /* Rewritten from type alias, can be one of: 
    - typings.monk.monkBooleans.`true`
    - typings.monk.monkStrings.`ns not found`
  */
  trait DropResult extends StObject
  object DropResult {
    
    @scala.inline
    def `ns not found`: typings.monk.monkStrings.`ns not found` = ("ns not found").asInstanceOf[typings.monk.monkStrings.`ns not found`]
    
    @scala.inline
    def `true`: typings.monk.monkBooleans.`true` = true.asInstanceOf[typings.monk.monkBooleans.`true`]
  }
  
  type FindOneResult[T] = WithID[T] | Null
  
  /* Inlined mongodb.mongodb.FindOneOptions<T> & {  rawCursor :boolean | undefined} */
  @js.native
  trait FindOptions[T] extends StObject {
    
    var awaitData: js.UndefOr[Boolean] = js.native
    
    var batchSize: js.UndefOr[Double] = js.native
    
    var collation: js.UndefOr[CollationDocument] = js.native
    
    var comment: js.UndefOr[String] = js.native
    
    var explain: js.UndefOr[Boolean] = js.native
    
    /**
      * @deprecated Use options.projection instead
      */
    var fields: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: boolean | number}
      */ typings.monk.monkStrings.FindOptions with TopLevel[js.Any]
      ] = js.native
    
    var hint: js.UndefOr[js.Object] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var maxScan: js.UndefOr[Double] = js.native
    
    var maxTimeMS: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var partial: js.UndefOr[Boolean] = js.native
    
    var projection: js.UndefOr[SchemaMember[T, ProjectionOperators | Double | Boolean | _]] = js.native
    
    var promoteBuffers: js.UndefOr[Boolean] = js.native
    
    var promoteLongs: js.UndefOr[Boolean] = js.native
    
    var promoteValues: js.UndefOr[Boolean] = js.native
    
    var raw: js.UndefOr[Boolean] = js.native
    
    var rawCursor: js.UndefOr[Boolean] = js.native
    
    var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
    
    var returnKey: js.UndefOr[Boolean] = js.native
    
    var session: js.UndefOr[ClientSession] = js.native
    
    var showDiskLoc: js.UndefOr[Boolean] = js.native
    
    var skip: js.UndefOr[Double] = js.native
    
    var snapshot: js.UndefOr[Boolean] = js.native
    
    var sort: js.UndefOr[(js.Array[js.Tuple2[String, Double]]) | SortOptionObject[T]] = js.native
    
    var tailable: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Boolean] = js.native
  }
  object FindOptions {
    
    @scala.inline
    def apply[T](): FindOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOptions[T]]
    }
    
    @scala.inline
    implicit class FindOptionsMutableBuilder[Self <: FindOptions[_], T] (val x: Self with FindOptions[T]) extends AnyVal {
      
      @scala.inline
      def setAwaitData(value: Boolean): Self = StObject.set(x, "awaitData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwaitDataUndefined: Self = StObject.set(x, "awaitData", js.undefined)
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setCollation(value: CollationDocument): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
      
      @scala.inline
      def setFields(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ P in keyof T ]: boolean | number}
        */ typings.monk.monkStrings.FindOptions with TopLevel[js.Any]
      ): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setHint(value: js.Object): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxScan(value: Double): Self = StObject.set(x, "maxScan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxScanUndefined: Self = StObject.set(x, "maxScan", js.undefined)
      
      @scala.inline
      def setMaxTimeMS(value: Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
      
      @scala.inline
      def setProjection(value: SchemaMember[T, ProjectionOperators | Double | Boolean | _]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setPromoteBuffers(value: Boolean): Self = StObject.set(x, "promoteBuffers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromoteBuffersUndefined: Self = StObject.set(x, "promoteBuffers", js.undefined)
      
      @scala.inline
      def setPromoteLongs(value: Boolean): Self = StObject.set(x, "promoteLongs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromoteLongsUndefined: Self = StObject.set(x, "promoteLongs", js.undefined)
      
      @scala.inline
      def setPromoteValues(value: Boolean): Self = StObject.set(x, "promoteValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromoteValuesUndefined: Self = StObject.set(x, "promoteValues", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawCursor(value: Boolean): Self = StObject.set(x, "rawCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawCursorUndefined: Self = StObject.set(x, "rawCursor", js.undefined)
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
      
      @scala.inline
      def setReturnKey(value: Boolean): Self = StObject.set(x, "returnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnKeyUndefined: Self = StObject.set(x, "returnKey", js.undefined)
      
      @scala.inline
      def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setShowDiskLoc(value: Boolean): Self = StObject.set(x, "showDiskLoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDiskLocUndefined: Self = StObject.set(x, "showDiskLoc", js.undefined)
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setSnapshot(value: Boolean): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
      
      @scala.inline
      def setSort(value: (js.Array[js.Tuple2[String, Double]]) | SortOptionObject[T]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setSortVarargs(value: (js.Tuple2[String, Double])*): Self = StObject.set(x, "sort", js.Array(value :_*))
      
      @scala.inline
      def setTailable(value: Boolean): Self = StObject.set(x, "tailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTailableUndefined: Self = StObject.set(x, "tailable", js.undefined)
      
      @scala.inline
      def setTimeout(value: Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type FindRawResult[T] = Cursor[WithID[T]]
  
  /* Inlined std.Array<monk.monk.WithID<T>> & {readonly each (listener : (record : T, cursor : {readonly close (): void, readonly resume (): void, readonly pause (): void}): any): any} */
  @js.native
  trait FindResult[T] extends /* n */ NumberDictionary[WithID[T]] {
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    def concat(items: (js.Array[WithID[T]] | WithID[T])*): js.Array[WithID[T]] = js.native
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    def copyWithin(target: Double, start: Double): this.type = js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    def each(listener: js.Function2[/* record */ T, /* cursor */ Close, _]): js.Any = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    def entries(): IterableIterator[js.Tuple2[Double, WithID[T]]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    def every(
      predicate: js.Function3[/* value */ WithID[T], /* index */ Double, /* array */ js.Array[WithID[T]], _]
    ): Boolean = js.native
    def every(
      predicate: js.Function3[/* value */ WithID[T], /* index */ Double, /* array */ js.Array[WithID[T]], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSName("every")
    def every_S_WithIDT[S /* <: WithID[T] */](
      predicate: js.Function3[
          /* value */ WithID[T], 
          /* index */ Double, 
          /* array */ js.Array[WithID[T]], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSName("every")
    def every_S_WithIDT[S /* <: WithID[T] */](
      predicate: js.Function3[
          /* value */ WithID[T], 
          /* index */ Double, 
          /* array */ js.Array[WithID[T]], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    def fill(value: WithID[T]): this.type = js.native
    def fill(value: WithID[T], start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    def fill(value: WithID[T], start: Double): this.type = js.native
    def fill(value: WithID[T], start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    def filter(
      predicate: js.Function3[/* value */ WithID[T], /* index */ Double, /* array */ js.Array[WithID[T]], _]
    ): js.Array[WithID[T]] = js.native
    def filter(
      predicate: js.Function3[/* value */ WithID[T], /* index */ Double, /* array */ js.Array[WithID[T]], _],
      thisArg: js.Any
    ): js.Array[WithID[T]] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSName("filter")
    def filter_S_WithIDT[S /* <: WithID[T] */](
      predicate: js.Function3[
          /* value */ WithID[T], 
          /* index */ Double, 
          /* array */ js.Array[WithID[T]], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSName("filter")
    def filter_S_WithIDT[S /* <: WithID[T] */](
      predicate: js.Function3[
          /* value */ WithID[T], 
          /* index */ Double, 
          /* array */ js.Array[WithID[T]], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    def find(
      predicate: js.Function3[/* value */ WithID[T], /* index */ Double, /* obj */ js.Array[WithID[T]], _]
    ): js.UndefOr[WithID[T]] = js.native
    def find(
      predicate: js.Function3[/* value */ WithID[T], /* index */ Double, /* obj */ js.Array[WithID[T]], _],
      thisArg: js.Any
    ): js.UndefOr[WithID[T]] = js.native
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    def find[S /* <: WithID[T] */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ WithID[T], 
          /* index */ Double, 
          /* obj */ js.Array[WithID[T]], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    def find[S /* <: WithID[T] */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ WithID[T], 
          /* index */ Double, 
          /* obj */ js.Array[WithID[T]], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = js.native
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    def findIndex(
      predicate: js.Function3[/* value */ WithID[T], /* index */ Double, /* obj */ js.Array[WithID[T]], _]
    ): Double = js.native
    def findIndex(
      predicate: js.Function3[/* value */ WithID[T], /* index */ Double, /* obj */ js.Array[WithID[T]], _],
      thisArg: js.Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
    /**
      * Calls a defined callback function on each element of an array. Then, flattens the result into
      * a new array.
      * This is identical to a map followed by flat with depth 1.
      *
      * @param callback A function that accepts up to three arguments. The flatMap method calls the
      * callback function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callback function. If
      * thisArg is omitted, undefined is used as the this value.
      */
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ WithID[T], 
          /* index */ Double, 
          /* array */ js.Array[WithID[T]], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ WithID[T], 
          /* index */ Double, 
          /* array */ js.Array[WithID[T]], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = js.native
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    def forEach(
      callbackfn: js.Function3[/* value */ WithID[T], /* index */ Double, /* array */ js.Array[WithID[T]], Unit]
    ): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ WithID[T], /* index */ Double, /* array */ js.Array[WithID[T]], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    def includes(searchElement: WithID[T]): Boolean = js.native
    def includes(searchElement: WithID[T], fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    def indexOf(searchElement: WithID[T]): Double = js.native
    def indexOf(searchElement: WithID[T], fromIndex: Double): Double = js.native
    
    /** Iterator */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[WithID[T]]] = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    def lastIndexOf(searchElement: WithID[T]): Double = js.native
    def lastIndexOf(searchElement: WithID[T], fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    var length: Double = js.native
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    def map[U](
      callbackfn: js.Function3[/* value */ WithID[T], /* index */ Double, /* array */ js.Array[WithID[T]], U]
    ): js.Array[U] = js.native
    def map[U](
      callbackfn: js.Function3[/* value */ WithID[T], /* index */ Double, /* array */ js.Array[WithID[T]], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    def pop(): js.UndefOr[WithID[T]] = js.native
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    def push(items: WithID[T]*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ WithID[T], 
          /* currentValue */ WithID[T], 
          /* currentIndex */ Double, 
          /* array */ js.Array[WithID[T]], 
          WithID[T]
        ]
    ): WithID[T] = js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ WithID[T], 
          /* currentValue */ WithID[T], 
          /* currentIndex */ Double, 
          /* array */ js.Array[WithID[T]], 
          WithID[T]
        ],
      initialValue: WithID[T]
    ): WithID[T] = js.native
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ WithID[T], 
          /* currentIndex */ Double, 
          /* array */ js.Array[WithID[T]], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ WithID[T], 
          /* currentValue */ WithID[T], 
          /* currentIndex */ Double, 
          /* array */ js.Array[WithID[T]], 
          WithID[T]
        ]
    ): WithID[T] = js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ WithID[T], 
          /* currentValue */ WithID[T], 
          /* currentIndex */ Double, 
          /* array */ js.Array[WithID[T]], 
          WithID[T]
        ],
      initialValue: WithID[T]
    ): WithID[T] = js.native
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ WithID[T], 
          /* currentIndex */ Double, 
          /* array */ js.Array[WithID[T]], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Reverses the elements in an Array.
      */
    def reverse(): js.Array[WithID[T]] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    def shift(): js.UndefOr[WithID[T]] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    def slice(): js.Array[WithID[T]] = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[WithID[T]] = js.native
    def slice(start: Double): js.Array[WithID[T]] = js.native
    def slice(start: Double, end: Double): js.Array[WithID[T]] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    def some(
      predicate: js.Function3[/* value */ WithID[T], /* index */ Double, /* array */ js.Array[WithID[T]], _]
    ): Boolean = js.native
    def some(
      predicate: js.Function3[/* value */ WithID[T], /* index */ Double, /* array */ js.Array[WithID[T]], _],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    def sort(): this.type = js.native
    def sort(compareFn: js.Function2[/* a */ WithID[T], /* b */ WithID[T], Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    def splice(start: Double): js.Array[WithID[T]] = js.native
    def splice(start: Double, deleteCount: Double): js.Array[WithID[T]] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    def splice(start: Double, deleteCount: Double, items: WithID[T]*): js.Array[WithID[T]] = js.native
    
    /**
      * Returns an object whose properties have the value 'true'
      * when they will be absent when used in a 'with' statement.
      */
    @JSName(js.Symbol.unscopables)
    var unscopables: js.Function0[CopyWithin] = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    def unshift(items: WithID[T]*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    def values(): IterableIterator[WithID[T]] = js.native
  }
  
  type GeoHaystackSearchResult[T] = js.Array[T]
  
  @js.native
  trait IObjectID extends StObject {
    
    def toHexString(): String = js.native
  }
  object IObjectID {
    
    @scala.inline
    def apply(toHexString: () => String): IObjectID = {
      val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString))
      __obj.asInstanceOf[IObjectID]
    }
    
    @scala.inline
    implicit class IObjectIDMutableBuilder[Self <: IObjectID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToHexString(value: () => String): Self = StObject.set(x, "toHexString", js.Any.fromFunction0(value))
    }
  }
  
  type IndexesResult[T] = StringDictionary[js.Array[js.Tuple2[/* keyof T */ String, `1` | `-1`]]]
  
  type InsertResult[T] = WithID[T]
  
  type RemoveOptions = CommonOptions with SingleMulti
  
  // Inputs
  @js.native
  trait SingleMulti extends StObject {
    
    var multi: js.UndefOr[Boolean] = js.native
    
    var single: js.UndefOr[Boolean] = js.native
  }
  object SingleMulti {
    
    @scala.inline
    def apply(): SingleMulti = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SingleMulti]
    }
    
    @scala.inline
    implicit class SingleMultiMutableBuilder[Self <: SingleMulti] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      @scala.inline
      def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    }
  }
  
  // Utils
  type SingleOrArray[T] = T | js.Array[T]
  
  @js.native
  trait StatsOptions extends StObject {
    
    var scale: Double = js.native
    
    var session: js.UndefOr[ClientSession] = js.native
  }
  object StatsOptions {
    
    @scala.inline
    def apply(scale: Double): StatsOptions = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatsOptions]
    }
    
    @scala.inline
    implicit class StatsOptionsMutableBuilder[Self <: StatsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  type TFields = String | js.Array[String]
  
  type TMiddleware = js.Function1[
    /* hasCollectionMonkInstance */ Collection, 
    js.Function1[
      /* next */ js.Function2[/* args */ js.Object, /* method */ String, js.Promise[js.Any]], 
      js.Function2[/* args */ js.Object, /* method */ String, js.Promise[js.Any]]
    ]
  ]
  
  type TQuery = String | js.Object
  
  /* Inlined mongodb.mongodb.UpdateWriteOpResult['result'] */
  /* Rewritten from type alias, can be one of: 
    - typings.monk.monkStrings.ok
    - typings.monk.monkStrings.n
    - typings.monk.monkStrings.nModified
  */
  trait UpdateResult extends StObject
  object UpdateResult {
    
    @scala.inline
    def n: typings.monk.monkStrings.n = "n".asInstanceOf[typings.monk.monkStrings.n]
    
    @scala.inline
    def nModified: typings.monk.monkStrings.nModified = "nModified".asInstanceOf[typings.monk.monkStrings.nModified]
    
    @scala.inline
    def ok: typings.monk.monkStrings.ok = "ok".asInstanceOf[typings.monk.monkStrings.ok]
  }
  
  type WithID[T] = Id with T
}
