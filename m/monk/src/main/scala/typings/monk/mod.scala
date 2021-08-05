package typings.monk

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.mongodb.mod.BulkWriteOpResultObject
import typings.mongodb.mod.BulkWriteOperation
import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.CollStats
import typings.mongodb.mod.CollectionAggregationOptions
import typings.mongodb.mod.CollectionBulkWriteOptions
import typings.mongodb.mod.CollectionCreateOptions
import typings.mongodb.mod.CollectionInsertOneOptions
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
import typings.monk.monkStrings.open
import typings.monk.monkStrings.opening
import typings.std.Array
import typings.std.Error
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("monk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(database: String): js.Promise[IMonkManager] & IMonkManager = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(database.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IMonkManager] & IMonkManager]
  inline def default(database: String, options: MongoClientOptionscollect): js.Promise[IMonkManager] & IMonkManager = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(database.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IMonkManager] & IMonkManager]
  inline def default(database: js.Array[String]): js.Promise[IMonkManager] & IMonkManager = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(database.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IMonkManager] & IMonkManager]
  inline def default(database: js.Array[String], options: MongoClientOptionscollect): js.Promise[IMonkManager] & IMonkManager = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(database.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IMonkManager] & IMonkManager]
  
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
    def count(query: Unit, options: MongoCountPreferences): js.Promise[Double] = js.native
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
    def distinct(field: String, query: Unit, options: MongoDistinctPreferences): js.Promise[
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
    def find(query: Unit, options: FindOptions[T]): js.Promise[FindResult[T]] = js.native
    // Raw
    def find(query: FilterQuery[T]): js.Promise[FindRawResult[T]] = js.native
    def find(query: FilterQuery[T], options: FindOptions[T] & RawCursor): js.Promise[FindRawResult[T]] = js.native
    def find(
      query: FilterQuery[T],
      options: (FindOneOptions[T] & RawCursor) | FindOneOptions[T],
      callback: Callback[FindRawResult[T] | FindResult[T]]
    ): Unit = js.native
    def find(query: FilterQuery[T], options: FindOptions[T]): js.Promise[FindResult[T]] = js.native
    
    def findOne(): js.Promise[FindOneResult[T]] = js.native
    def findOne(query: Unit, options: FindOneOptions[T]): js.Promise[FindOneResult[T]] = js.native
    def findOne(query: FilterQuery[T]): js.Promise[FindOneResult[T]] = js.native
    def findOne(query: FilterQuery[T], options: FindOneOptions[T]): js.Promise[FindOneResult[T]] = js.native
    def findOne(query: FilterQuery[T], options: FindOneOptions[T], callback: Callback[FindOneResult[T]]): Unit = js.native
    
    def findOneAndDelete(query: FilterQuery[T]): js.Promise[FindOneResult[T]] = js.native
    def findOneAndDelete(query: FilterQuery[T], options: FindOneAndDeleteOption[T]): js.Promise[FindOneResult[T]] = js.native
    def findOneAndDelete(query: FilterQuery[T], options: FindOneAndDeleteOption[T], callback: Callback[FindOneResult[T]]): Unit = js.native
    
    // Replace
    def findOneAndUpdate(query: FilterQuery[T], update: T): js.Promise[FindOneResult[T]] = js.native
    def findOneAndUpdate(query: FilterQuery[T], update: T, options: FindOneAndReplaceOption[T] & `0`): js.Promise[FindOneResult[T]] = js.native
    def findOneAndUpdate(
      query: FilterQuery[T],
      update: T,
      options: FindOneAndReplaceOption[T] & `0`,
      callback: Callback[FindOneResult[T]]
    ): Unit = js.native
    def findOneAndUpdate(query: FilterQuery[T], update: UpdateQuery[T]): Unit = js.native
    def findOneAndUpdate(query: FilterQuery[T], update: UpdateQuery[T], options: FindOneAndUpdateOption[T] & ReplaceOne): Unit = js.native
    def findOneAndUpdate(
      query: FilterQuery[T],
      update: UpdateQuery[T],
      options: FindOneAndUpdateOption[T] & ReplaceOne,
      callback: Callback[FindOneResult[T]]
    ): Unit = js.native
    def findOneAndUpdate(query: FilterQuery[T], update: UpdateQuery[T], options: Unit, callback: Callback[FindOneResult[T]]): Unit = js.native
    def findOneAndUpdate(query: FilterQuery[T], update: Partial[T]): Unit = js.native
    def findOneAndUpdate(query: FilterQuery[T], update: Partial[T], options: FindOneAndUpdateOption[T] & ReplaceOne): Unit = js.native
    def findOneAndUpdate(
      query: FilterQuery[T],
      update: Partial[T],
      options: FindOneAndUpdateOption[T] & ReplaceOne,
      callback: Callback[FindOneResult[T]]
    ): Unit = js.native
    def findOneAndUpdate(query: FilterQuery[T], update: Partial[T], options: Unit, callback: Callback[FindOneResult[T]]): Unit = js.native
    // Update
    @JSName("findOneAndUpdate")
    def findOneAndUpdate_Promise(query: FilterQuery[T], update: UpdateQuery[T]): js.Promise[FindOneResult[T]] = js.native
    @JSName("findOneAndUpdate")
    def findOneAndUpdate_Promise(query: FilterQuery[T], update: UpdateQuery[T], options: FindOneAndUpdateOption[T] & ReplaceOne): js.Promise[FindOneResult[T]] = js.native
    @JSName("findOneAndUpdate")
    def findOneAndUpdate_Promise(query: FilterQuery[T], update: Partial[T]): js.Promise[FindOneResult[T]] = js.native
    @JSName("findOneAndUpdate")
    def findOneAndUpdate_Promise(query: FilterQuery[T], update: Partial[T], options: FindOneAndUpdateOption[T] & ReplaceOne): js.Promise[FindOneResult[T]] = js.native
    
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
    def group[U](
      keys: js.Any,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: Unit,
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
    ): js.Promise[js.Any] = js.native
    def mapReduce[TKey, TValue](
      map: CollectionMapFunction[T],
      reduce: CollectionReduceFunction[TKey, TValue],
      options: MapReduceOptions,
      callback: Callback[js.Any]
    ): Unit = js.native
    
    val middlewares: js.Array[TMiddleware] = js.native
    
    val name: String = js.native
    
    var options: js.Object = js.native
    
    def remove(): js.Promise[DeleteWriteOpResultObject] = js.native
    def remove(query: Unit, options: RemoveOptions): js.Promise[DeleteWriteOpResultObject] = js.native
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
    
    def addListener(event: String, handler: js.Function1[/* event */ js.Any, js.Any]): Unit = js.native
    
    def addMiddleware(middleware: TMiddleware): Unit = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def create[T](name: String): ICollection[T] = js.native
    def create[T](name: String, creationOption: Unit, options: CollectionOptions): ICollection[T] = js.native
    def create[T](name: String, creationOption: CollectionCreateOptions): ICollection[T] = js.native
    def create[T](name: String, creationOption: CollectionCreateOptions, options: CollectionOptions): ICollection[T] = js.native
    
    def get[T](name: String): ICollection[T] = js.native
    def get[T](name: String, options: CollectionOptions): ICollection[T] = js.native
    
    def listCollections(): js.Array[ICollection[js.Any]] = js.native
    def listCollections(query: js.Object): js.Array[ICollection[js.Any]] = js.native
    
    def on(event: String, handler: js.Function1[/* event */ js.Any, js.Any]): Unit = js.native
    
    def once(event: String, handler: js.Function1[/* event */ js.Any, js.Any]): Unit = js.native
    
    def removeListener(event: String, handler: js.Function1[/* event */ js.Any, js.Any]): Unit = js.native
    
    def setDefaultCollectionOptions(): Unit = js.native
    def setDefaultCollectionOptions(collectionOptions: CollectionOptions): Unit = js.native
  }
  
  inline def cast(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")().asInstanceOf[js.Any]
  inline def cast(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def cast(obj: js.Array[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def cast(obj: js.Object): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def id(): IObjectID = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[IObjectID]
  inline def id(hexstring: String): IObjectID = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(hexstring.asInstanceOf[js.Any]).asInstanceOf[IObjectID]
  inline def id(obj: IObjectID): IObjectID = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(obj.asInstanceOf[js.Any]).asInstanceOf[IObjectID]
  
  type Callback[T] = js.Function2[/* err */ Error | Null, /* data */ T, Unit]
  
  trait CollectionInsertOneOptionsMonk
    extends StObject
       with CollectionInsertOneOptions {
    
    var castIds: Boolean
  }
  object CollectionInsertOneOptionsMonk {
    
    inline def apply(castIds: Boolean): CollectionInsertOneOptionsMonk = {
      val __obj = js.Dynamic.literal(castIds = castIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionInsertOneOptionsMonk]
    }
    
    extension [Self <: CollectionInsertOneOptionsMonk](x: Self) {
      
      inline def setCastIds(value: Boolean): Self = StObject.set(x, "castIds", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollectionOptions extends StObject {
    
    var middlewares: js.UndefOr[js.Array[TMiddleware]] = js.undefined
  }
  object CollectionOptions {
    
    inline def apply(): CollectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectionOptions]
    }
    
    extension [Self <: CollectionOptions](x: Self) {
      
      inline def setMiddlewares(value: js.Array[TMiddleware]): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
      
      inline def setMiddlewaresUndefined: Self = StObject.set(x, "middlewares", js.undefined)
      
      inline def setMiddlewaresVarargs(value: TMiddleware*): Self = StObject.set(x, "middlewares", js.Array(value :_*))
    }
  }
  
  type CreateIndexInput[T] = String | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? 1 | -1}
    */ typings.monk.monkStrings.CreateIndexInput & TopLevel[js.Any])
  
  type DropIndexInput[T] = CreateIndexInput[T] & js.Array[String]
  
  trait DropIndexOptions
    extends StObject
       with CommonOptions {
    
    var maxTimeMS: js.UndefOr[Double] = js.undefined
  }
  object DropIndexOptions {
    
    inline def apply(): DropIndexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropIndexOptions]
    }
    
    extension [Self <: DropIndexOptions](x: Self) {
      
      inline def setMaxTimeMS(value: Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    }
  }
  
  trait DropIndexResult extends StObject {
    
    var nIndexesWas: Double
    
    var ok: `1` | typings.monk.monkNumbers.`0`
  }
  object DropIndexResult {
    
    inline def apply(nIndexesWas: Double, ok: `1` | typings.monk.monkNumbers.`0`): DropIndexResult = {
      val __obj = js.Dynamic.literal(nIndexesWas = nIndexesWas.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropIndexResult]
    }
    
    extension [Self <: DropIndexResult](x: Self) {
      
      inline def setNIndexesWas(value: Double): Self = StObject.set(x, "nIndexesWas", value.asInstanceOf[js.Any])
      
      inline def setOk(value: `1` | typings.monk.monkNumbers.`0`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropIndexesResult
    extends StObject
       with DropIndexResult {
    
    var msg: js.UndefOr[String] = js.undefined
  }
  object DropIndexesResult {
    
    inline def apply(nIndexesWas: Double, ok: `1` | typings.monk.monkNumbers.`0`): DropIndexesResult = {
      val __obj = js.Dynamic.literal(nIndexesWas = nIndexesWas.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropIndexesResult]
    }
    
    extension [Self <: DropIndexesResult](x: Self) {
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
    }
  }
  
  // Returns
  /* Rewritten from type alias, can be one of: 
    - typings.monk.monkBooleans.`true`
    - typings.monk.monkStrings.`ns not found`
  */
  trait DropResult extends StObject
  object DropResult {
    
    inline def `ns not found`: typings.monk.monkStrings.`ns not found` = ("ns not found").asInstanceOf[typings.monk.monkStrings.`ns not found`]
    
    inline def `true`: typings.monk.monkBooleans.`true` = true.asInstanceOf[typings.monk.monkBooleans.`true`]
  }
  
  type FindOneResult[T] = WithID[T] | Null
  
  trait FindOptions[T]
    extends StObject
       with FindOneOptions[T] {
    
    var rawCursor: js.UndefOr[Boolean] = js.undefined
  }
  object FindOptions {
    
    inline def apply[T](): FindOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOptions[T]]
    }
    
    extension [Self <: FindOptions[?], T](x: Self & FindOptions[T]) {
      
      inline def setRawCursor(value: Boolean): Self = StObject.set(x, "rawCursor", value.asInstanceOf[js.Any])
      
      inline def setRawCursorUndefined: Self = StObject.set(x, "rawCursor", js.undefined)
    }
  }
  
  type FindRawResult[T] = Cursor[WithID[T]]
  
  @js.native
  trait FindResult[T]
    extends StObject
       with Array[WithID[T]] {
    
    def each(listener: js.Function2[/* record */ T, /* cursor */ Close, js.Any]): js.Any = js.native
  }
  
  type GeoHaystackSearchResult[T] = js.Array[T]
  
  trait IObjectID extends StObject {
    
    def toHexString(): String
  }
  object IObjectID {
    
    inline def apply(toHexString: () => String): IObjectID = {
      val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString))
      __obj.asInstanceOf[IObjectID]
    }
    
    extension [Self <: IObjectID](x: Self) {
      
      inline def setToHexString(value: () => String): Self = StObject.set(x, "toHexString", js.Any.fromFunction0(value))
    }
  }
  
  type IndexesResult[T] = StringDictionary[js.Array[js.Tuple2[/* keyof T */ String, `1` | `-1`]]]
  
  type InsertResult[T] = WithID[T]
  
  trait RemoveOptions
    extends StObject
       with CommonOptions
       with SingleMulti
  object RemoveOptions {
    
    inline def apply(): RemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveOptions]
    }
  }
  
  // Inputs
  trait SingleMulti extends StObject {
    
    var multi: js.UndefOr[Boolean] = js.undefined
    
    var single: js.UndefOr[Boolean] = js.undefined
  }
  object SingleMulti {
    
    inline def apply(): SingleMulti = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SingleMulti]
    }
    
    extension [Self <: SingleMulti](x: Self) {
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    }
  }
  
  // Utils
  type SingleOrArray[T] = T | js.Array[T]
  
  trait StatsOptions extends StObject {
    
    var scale: Double
    
    var session: js.UndefOr[ClientSession] = js.undefined
  }
  object StatsOptions {
    
    inline def apply(scale: Double): StatsOptions = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatsOptions]
    }
    
    extension [Self <: StatsOptions](x: Self) {
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
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
    
    inline def n: typings.monk.monkStrings.n = "n".asInstanceOf[typings.monk.monkStrings.n]
    
    inline def nModified: typings.monk.monkStrings.nModified = "nModified".asInstanceOf[typings.monk.monkStrings.nModified]
    
    inline def ok: typings.monk.monkStrings.ok = "ok".asInstanceOf[typings.monk.monkStrings.ok]
  }
  
  type WithID[T] = Id & T
}
