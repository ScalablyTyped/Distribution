package typings.monk

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.CollStats
import typings.monk.anon.Close
import typings.monk.anon.Collection
import typings.monk.anon.Id
import typings.monk.anon.MongoClientOptionscollect
import typings.monk.anon.Multi
import typings.monk.anon.MultiReplace
import typings.monk.anon.RawCursor
import typings.monk.anon.Replace
import typings.monk.anon.ReplaceSingle
import typings.monk.anon.Single
import typings.monk.anon.`0`
import typings.monk.monkInts.`-1`
import typings.monk.monkInts.`1`
import typings.monk.monkStrings.closed
import typings.monk.monkStrings.open
import typings.monk.monkStrings.opening
import typings.std.Array
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
  open class ICollection[T /* <: StringDictionary[Any] */] () extends StObject {
    
    def aggregate[U](pipeline: js.Array[js.Object]): js.Promise[U] = js.native
    def aggregate[U](
      pipeline: js.Array[js.Object],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CollectionAggregationOptions */ Any
    ): js.Promise[U] = js.native
    def aggregate[U](
      stages: js.Array[js.Object],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CollectionAggregationOptions */ Any,
      callback: Callback[U]
    ): Unit = js.native
    
    def bulkWrite(
      operations: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BulkWriteOperation<T> */ Any
        ]
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BulkWriteOpResultObject */ Any
      ] = js.native
    def bulkWrite(
      operations: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BulkWriteOperation<T> */ Any
        ],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CollectionBulkWriteOptions */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BulkWriteOpResultObject */ Any
      ] = js.native
    def bulkWrite(
      operations: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BulkWriteOperation<T> */ Any
        ],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CollectionBulkWriteOptions */ Any,
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BulkWriteOpResultObject */ Any
        ]
    ): Unit = js.native
    
    /**
      * http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#countDocuments
      */
    def count(): js.Promise[Double] = js.native
    def count(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any
    ): js.Promise[Double] = js.native
    def count(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MongoCountPreferences */ Any
    ): Unit = js.native
    def count(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MongoCountPreferences */ Any,
      callback: Callback[Double]
    ): Unit = js.native
    def count(
      query: Unit,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MongoCountPreferences */ Any
    ): js.Promise[Double] = js.native
    @JSName("count")
    def count_Promise(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MongoCountPreferences */ Any
    ): js.Promise[Double] = js.native
    
    def createIndex(fields: CreateIndexInput[T]): js.Promise[String] = js.native
    def createIndex(
      fields: CreateIndexInput[T],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IndexOptions */ Any
    ): js.Promise[String] = js.native
    def createIndex(
      fields: CreateIndexInput[T],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IndexOptions */ Any,
      callback: Callback[String]
    ): Unit = js.native
    
    def distinct(field: String): js.Promise[
        js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any
        ]
      ] = js.native
    def distinct(
      field: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any
    ): js.Promise[
        js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any
        ]
      ] = js.native
    def distinct(
      field: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MongoDistinctPreferences */ Any
    ): js.Promise[
        js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any
        ]
      ] = js.native
    def distinct(
      field: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MongoDistinctPreferences */ Any,
      callback: Callback[
          js.Array[
            /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any
          ]
        ]
    ): Unit = js.native
    def distinct(
      field: String,
      query: Unit,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MongoDistinctPreferences */ Any
    ): js.Promise[
        js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any
        ]
      ] = js.native
    
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
    def find(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any
    ): js.Promise[FindResult[T]] = js.native
    // Raw
    def find(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      options: FindOptions[T] & RawCursor
    ): js.Promise[FindRawResult[T]] = js.native
    def find(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      options: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FindOneOptions<T> */ Any) & RawCursor) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FindOneOptions<T> */ Any),
      callback: Callback[FindRawResult[T] | FindResult[T]]
    ): Unit = js.native
    def find(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      options: FindOptions[T]
    ): js.Promise[FindResult[T]] = js.native
    def find(query: Unit, options: FindOptions[T]): js.Promise[FindResult[T]] = js.native
    
    def findOne(): js.Promise[FindOneResult[T]] = js.native
    def findOne(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any
    ): js.Promise[FindOneResult[T]] = js.native
    def findOne(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FindOneOptions<T> */ Any
    ): js.Promise[FindOneResult[T]] = js.native
    def findOne(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FindOneOptions<T> */ Any,
      callback: Callback[FindOneResult[T]]
    ): Unit = js.native
    def findOne(
      query: Unit,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FindOneOptions<T> */ Any
    ): js.Promise[FindOneResult[T]] = js.native
    
    def findOneAndDelete(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any
    ): js.Promise[FindOneResult[T]] = js.native
    def findOneAndDelete(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FindOneAndDeleteOption<T> */ Any
    ): js.Promise[FindOneResult[T]] = js.native
    def findOneAndDelete(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FindOneAndDeleteOption<T> */ Any,
      callback: Callback[FindOneResult[T]]
    ): Unit = js.native
    
    def findOneAndUpdate(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      update: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateQuery<T> */ Any) | Partial[T]
    ): Unit = js.native
    def findOneAndUpdate(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      update: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateQuery<T> */ Any) | Partial[T],
      options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FindOneAndUpdateOption<T> */ Any) & Replace
    ): Unit = js.native
    def findOneAndUpdate(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      update: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateQuery<T> */ Any) | Partial[T] | T,
      options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FindOneAndUpdateOption<T> */ Any) & Replace & `0`,
      callback: Callback[FindOneResult[T]]
    ): Unit = js.native
    def findOneAndUpdate(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      update: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateQuery<T> */ Any) | Partial[T],
      options: Unit,
      callback: Callback[FindOneResult[T]]
    ): Unit = js.native
    // Update
    // Replace
    @JSName("findOneAndUpdate")
    def findOneAndUpdate_Promise(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      update: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateQuery<T> */ Any) | Partial[T] | T
    ): js.Promise[FindOneResult[T]] = js.native
    @JSName("findOneAndUpdate")
    def findOneAndUpdate_Promise(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      update: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateQuery<T> */ Any) | Partial[T] | T,
      options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FindOneAndUpdateOption<T> */ Any) & Replace & `0`
    ): js.Promise[FindOneResult[T]] = js.native
    
    def geoHaystackSearch(x: Double, y: Double): js.Promise[GeoHaystackSearchResult[T]] = js.native
    def geoHaystackSearch(
      x: Double,
      y: Double,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GeoHaystackSearchOptions */ Any
    ): js.Promise[GeoHaystackSearchResult[T]] = js.native
    def geoHaystackSearch(
      x: Double,
      y: Double,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GeoHaystackSearchOptions */ Any,
      callback: Callback[GeoHaystackSearchResult[T]]
    ): Unit = js.native
    
    /** @deprecated MongoDB 3.6 or higher no longer supports the group command. We recommend rewriting using the aggregation framework. */
    def group[U](
      keys: Any,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[U] = js.native
    def group[U](
      keys: Any,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: js.Object
    ): js.Promise[U] = js.native
    def group[U](
      keys: Any,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: js.Object,
      callback: Callback[U]
    ): Unit = js.native
    def group[U](
      keys: Any,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: Unit,
      callback: Callback[U]
    ): Unit = js.native
    @JSName("group")
    def group_U_Unit[U](
      keys: Any,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): Unit = js.native
    @JSName("group")
    def group_U_Unit[U](
      keys: Any,
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
    
    val manager: IMonkManager = js.native
    
    def mapReduce[TKey, TValue](
      map: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CollectionMapFunction<T> */ Any,
      reduce: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CollectionReduceFunction<TKey, TValue> */ Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapReduceOptions */ Any
    ): js.Promise[Any] = js.native
    def mapReduce[TKey, TValue](
      map: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CollectionMapFunction<T> */ Any,
      reduce: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CollectionReduceFunction<TKey, TValue> */ Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapReduceOptions */ Any,
      callback: Callback[Any]
    ): Unit = js.native
    
    val middlewares: js.Array[TMiddleware] = js.native
    
    val name: String = js.native
    
    var options: js.Object = js.native
    
    def remove(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeleteWriteOpResultObject */ Any
      ] = js.native
    def remove(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeleteWriteOpResultObject */ Any
      ] = js.native
    def remove(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      options: RemoveOptions
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeleteWriteOpResultObject */ Any
      ] = js.native
    def remove(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      options: RemoveOptions,
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeleteWriteOpResultObject */ Any
        ]
    ): Unit = js.native
    def remove(query: Unit, options: RemoveOptions): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeleteWriteOpResultObject */ Any
      ] = js.native
    
    def stats(): js.Promise[CollStats] = js.native
    def stats(options: StatsOptions): js.Promise[CollStats] = js.native
    def stats(options: StatsOptions, callback: Callback[CollStats]): Unit = js.native
    
    // single
    def update(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      update: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateQuery<T> */ Any) | Partial[T]
    ): js.Promise[UpdateResult] = js.native
    def update(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      update: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateQuery<T> */ Any) | Partial[T],
      options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateOneOptions */ Any) & Multi & Single & MultiReplace & ReplaceSingle,
      callback: Callback[UpdateResult]
    ): Unit = js.native
    def update(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterQuery<T> */ Any,
      update: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateQuery<T> */ Any) | Partial[T],
      options: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateOneOptions */ Any) & Multi & ReplaceSingle) | (Single & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateManyOptions */ Any)) | (MultiReplace & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateManyOptions */ Any))
    ): js.Promise[UpdateResult] = js.native
  }
  
  @JSImport("monk", "IMonkManager")
  @js.native
  open class IMonkManager () extends StObject {
    
    val _state: closed | opening | open = js.native
    
    def addListener(event: String, handler: js.Function1[/* event */ Any, Any]): Unit = js.native
    
    def addMiddleware(middleware: TMiddleware): Unit = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def create[T](name: String): ICollection[T] = js.native
    def create[T](
      name: String,
      creationOption: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CollectionCreateOptions */ Any
    ): ICollection[T] = js.native
    def create[T](
      name: String,
      creationOption: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CollectionCreateOptions */ Any,
      options: CollectionOptions
    ): ICollection[T] = js.native
    def create[T](name: String, creationOption: Unit, options: CollectionOptions): ICollection[T] = js.native
    
    def get[T](name: String): ICollection[T] = js.native
    def get[T](name: String, options: CollectionOptions): ICollection[T] = js.native
    
    def listCollections(): js.Promise[js.Array[ICollection[Any]]] = js.native
    def listCollections(query: js.Object): js.Promise[js.Array[ICollection[Any]]] = js.native
    
    def on(event: String, handler: js.Function1[/* event */ Any, Any]): Unit = js.native
    
    def once(event: String, handler: js.Function1[/* event */ Any, Any]): Unit = js.native
    
    def removeListener(event: String, handler: js.Function1[/* event */ Any, Any]): Unit = js.native
    
    def setDefaultCollectionOptions(): Unit = js.native
    def setDefaultCollectionOptions(collectionOptions: CollectionOptions): Unit = js.native
  }
  
  inline def cast(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")().asInstanceOf[Any]
  inline def cast(obj: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def cast(obj: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def cast(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def id(): IObjectID = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[IObjectID]
  inline def id(hexstring: String): IObjectID = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(hexstring.asInstanceOf[js.Any]).asInstanceOf[IObjectID]
  inline def id(obj: IObjectID): IObjectID = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(obj.asInstanceOf[js.Any]).asInstanceOf[IObjectID]
  
  type Callback[T] = js.Function2[/* err */ js.Error | Null, /* data */ T, Unit]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CollectionInsertOneOptions * / any */ trait CollectionInsertOneOptionsMonk extends StObject {
    
    var castIds: Boolean
  }
  object CollectionInsertOneOptionsMonk {
    
    inline def apply(castIds: Boolean): CollectionInsertOneOptionsMonk = {
      val __obj = js.Dynamic.literal(castIds = castIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionInsertOneOptionsMonk]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionInsertOneOptionsMonk] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionOptions] (val x: Self) extends AnyVal {
      
      inline def setMiddlewares(value: js.Array[TMiddleware]): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
      
      inline def setMiddlewaresUndefined: Self = StObject.set(x, "middlewares", js.undefined)
      
      inline def setMiddlewaresVarargs(value: TMiddleware*): Self = StObject.set(x, "middlewares", js.Array(value*))
    }
  }
  
  type CreateIndexInput[T] = String | (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]:? 1 | -1} */ js.Any)
  
  type DropIndexInput[T] = CreateIndexInput[T] & js.Array[String]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CommonOptions * / any */ trait DropIndexOptions extends StObject {
    
    var maxTimeMS: js.UndefOr[Double] = js.undefined
  }
  object DropIndexOptions {
    
    inline def apply(): DropIndexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropIndexOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropIndexOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxTimeMS(value: Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    }
  }
  
  trait DropIndexResult extends StObject {
    
    var nIndexesWas: Double
    
    var ok: `1` | typings.monk.monkInts.`0`
  }
  object DropIndexResult {
    
    inline def apply(nIndexesWas: Double, ok: `1` | typings.monk.monkInts.`0`): DropIndexResult = {
      val __obj = js.Dynamic.literal(nIndexesWas = nIndexesWas.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropIndexResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropIndexResult] (val x: Self) extends AnyVal {
      
      inline def setNIndexesWas(value: Double): Self = StObject.set(x, "nIndexesWas", value.asInstanceOf[js.Any])
      
      inline def setOk(value: `1` | typings.monk.monkInts.`0`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropIndexesResult
    extends StObject
       with DropIndexResult {
    
    var msg: js.UndefOr[String] = js.undefined
  }
  object DropIndexesResult {
    
    inline def apply(nIndexesWas: Double, ok: `1` | typings.monk.monkInts.`0`): DropIndexesResult = {
      val __obj = js.Dynamic.literal(nIndexesWas = nIndexesWas.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropIndexesResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropIndexesResult] (val x: Self) extends AnyVal {
      
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
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FindOneOptions<T> * / any */ trait FindOptions[T] extends StObject {
    
    var rawCursor: js.UndefOr[Boolean] = js.undefined
  }
  object FindOptions {
    
    inline def apply[T](): FindOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FindOptions[?], T] (val x: Self & FindOptions[T]) extends AnyVal {
      
      inline def setRawCursor(value: Boolean): Self = StObject.set(x, "rawCursor", value.asInstanceOf[js.Any])
      
      inline def setRawCursorUndefined: Self = StObject.set(x, "rawCursor", js.undefined)
    }
  }
  
  type FindRawResult[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Cursor<WithID<T>> */ Any
  
  @js.native
  trait FindResult[T]
    extends StObject
       with Array[WithID[T]] {
    
    def each(listener: js.Function2[/* record */ T, /* cursor */ Close, Any]): Any = js.native
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IObjectID] (val x: Self) extends AnyVal {
      
      inline def setToHexString(value: () => String): Self = StObject.set(x, "toHexString", js.Any.fromFunction0(value))
    }
  }
  
  type IndexesResult[T] = StringDictionary[js.Array[js.Tuple2[/* keyof T */ String, `1` | `-1`]]]
  
  type InsertResult[T] = WithID[T]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CommonOptions * / any */ trait RemoveOptions
    extends StObject
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SingleMulti] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatsOptions] (val x: Self) extends AnyVal {
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  type TFields = String | js.Array[String]
  
  type TMiddleware = js.Function1[
    /* param0 */ Collection, 
    js.Function1[
      /* next */ js.Function2[/* args */ js.Object, /* method */ String, js.Promise[Any]], 
      js.Function2[/* args */ js.Object, /* method */ String, js.Promise[Any]]
    ]
  ]
  
  type TQuery = String | js.Object
  
  type UpdateResult = /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateWriteOpResult * / any['result'] */ js.Any
  
  type WithID[T] = Id & T
}
