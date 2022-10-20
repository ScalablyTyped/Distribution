package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.NameOnly
import typings.mongodb.anon.PickCollectionInfonametyp
import typings.mongodb.anon.`0`
import typings.mongodb.mongodbStrings.nameOnly
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Db")
@js.native
open class Db protected () extends StObject {
  /**
    * Creates a new Db instance
    *
    * @param client - The MongoClient for the database.
    * @param databaseName - The name of the database this instance represents.
    * @param options - Optional settings for Db construction
    */
  def this(client: MongoClient, databaseName: String) = this()
  def this(client: MongoClient, databaseName: String, options: DbOptions) = this()
  
  /**
    * Add a user to the database
    *
    * @param username - The username for the new user
    * @param password - An optional password for the new user
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def addUser(username: String): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def addUser(username: String, callback: Callback[Document]): Unit = js.native
  def addUser(username: String, options: AddUserOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def addUser(username: String, options: AddUserOptions, callback: Callback[Document]): Unit = js.native
  def addUser(username: String, password: String): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def addUser(username: String, password: String, callback: Callback[Document]): Unit = js.native
  def addUser(username: String, password: String, options: AddUserOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def addUser(username: String, password: String, options: AddUserOptions, callback: Callback[Document]): Unit = js.native
  
  /** Return the Admin db instance */
  def admin(): Admin = js.native
  
  /**
    * Execute an aggregation framework pipeline against the database, needs MongoDB \>= 3.6
    *
    * @param pipeline - An array of aggregation stages to be executed
    * @param options - Optional settings for the command
    */
  def aggregate[T /* <: Document */](): AggregationCursor[T] = js.native
  def aggregate[T /* <: Document */](pipeline: js.Array[Document]): AggregationCursor[T] = js.native
  def aggregate[T /* <: Document */](pipeline: js.Array[Document], options: AggregateOptions): AggregationCursor[T] = js.native
  def aggregate[T /* <: Document */](pipeline: Unit, options: AggregateOptions): AggregationCursor[T] = js.native
  
  def bsonOptions: BSONSerializeOptions = js.native
  
  /**
    * Returns a reference to a MongoDB Collection. If it does not exist it will be created implicitly.
    *
    * @param name - the collection name we wish to access.
    * @returns return the new Collection instance
    */
  def collection[TSchema /* <: Document */](name: String): Collection[TSchema] = js.native
  def collection[TSchema /* <: Document */](name: String, options: CollectionOptions): Collection[TSchema] = js.native
  
  /**
    * Fetch all collections for the current db.
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def collections(): js.Promise[js.Array[Collection[Document]]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def collections(callback: Callback[js.Array[Collection[Document]]]): Unit = js.native
  def collections(options: ListCollectionsOptions): js.Promise[js.Array[Collection[Document]]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def collections(options: ListCollectionsOptions, callback: Callback[js.Array[Collection[Document]]]): Unit = js.native
  
  /**
    * Execute a command
    *
    * @remarks
    * This command does not inherit options from the MongoClient.
    *
    * @param command - The command to run
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def command(command: Document): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def command(command: Document, callback: Callback[Document]): Unit = js.native
  def command(command: Document, options: RunCommandOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def command(command: Document, options: RunCommandOptions, callback: Callback[Document]): Unit = js.native
  
  /**
    * Create a new collection on a server with the specified options. Use this to create capped collections.
    * More information about command options available at https://docs.mongodb.com/manual/reference/command/create/
    *
    * @param name - The name of the collection to create
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def createCollection[TSchema /* <: Document */](name: String): js.Promise[Collection[TSchema]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def createCollection[TSchema /* <: Document */](name: String, callback: Callback[Collection[TSchema]]): Unit = js.native
  def createCollection[TSchema /* <: Document */](name: String, options: Unit, callback: Callback[Collection[TSchema]]): Unit = js.native
  def createCollection[TSchema /* <: Document */](name: String, options: CreateCollectionOptions): js.Promise[Collection[TSchema]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def createCollection[TSchema /* <: Document */](name: String, options: CreateCollectionOptions, callback: Callback[Collection[TSchema]]): Unit = js.native
  
  /**
    * Creates an index on the db and collection.
    *
    * @param name - Name of the collection to create the index on.
    * @param indexSpec - Specify the field to index, or an index specification
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def createIndex(name: String, indexSpec: IndexSpecification): js.Promise[String] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def createIndex(name: String, indexSpec: IndexSpecification, callback: Callback[String]): Unit = js.native
  def createIndex(name: String, indexSpec: IndexSpecification, options: CreateIndexesOptions): js.Promise[String] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def createIndex(
    name: String,
    indexSpec: IndexSpecification,
    options: CreateIndexesOptions,
    callback: Callback[String]
  ): Unit = js.native
  
  def databaseName: String = js.native
  
  /**
    * Drop a collection from the database, removing it permanently. New accesses will create a new collection.
    *
    * @param name - Name of collection to drop
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def dropCollection(name: String): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def dropCollection(name: String, callback: Callback[Boolean]): Unit = js.native
  def dropCollection(name: String, options: DropCollectionOptions): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def dropCollection(name: String, options: DropCollectionOptions, callback: Callback[Boolean]): Unit = js.native
  
  /**
    * Drop a database, removing it permanently from the server.
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def dropDatabase(): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def dropDatabase(callback: Callback[Boolean]): Unit = js.native
  def dropDatabase(options: DropDatabaseOptions): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def dropDatabase(options: DropDatabaseOptions, callback: Callback[Boolean]): Unit = js.native
  
  /** Return the db logger */
  def getLogger(): Logger = js.native
  
  /**
    * Retrieves this collections index info.
    *
    * @param name - The name of the collection.
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def indexInformation(name: String): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def indexInformation(name: String, callback: Callback[Document]): Unit = js.native
  def indexInformation(name: String, options: IndexInformationOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def indexInformation(name: String, options: IndexInformationOptions, callback: Callback[Document]): Unit = js.native
  
  def listCollections[T /* <: PickCollectionInfonametyp | CollectionInfo */](): ListCollectionsCursor[T] = js.native
  def listCollections[T /* <: PickCollectionInfonametyp | CollectionInfo */](filter: Unit, options: ListCollectionsOptions): ListCollectionsCursor[T] = js.native
  def listCollections[T /* <: PickCollectionInfonametyp | CollectionInfo */](filter: Document): ListCollectionsCursor[T] = js.native
  def listCollections[T /* <: PickCollectionInfonametyp | CollectionInfo */](filter: Document, options: ListCollectionsOptions): ListCollectionsCursor[T] = js.native
  /**
    * List all collections of this database with optional filter
    *
    * @param filter - Query to filter collections by
    * @param options - Optional settings for the command
    */
  @JSName("listCollections")
  def listCollections_nameOnly(filter: Document, options: (Exclude[ListCollectionsOptions, nameOnly]) & NameOnly): ListCollectionsCursor[PickCollectionInfonametyp] = js.native
  @JSName("listCollections")
  def listCollections_nameOnly(filter: Document, options: (Exclude[ListCollectionsOptions, nameOnly]) & `0`): ListCollectionsCursor[CollectionInfo] = js.native
  
  def logger: Logger = js.native
  
  def namespace: String = js.native
  
  def options: js.UndefOr[DbOptions] = js.native
  
  /**
    * Retrieve the current profiling Level for MongoDB
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def profilingLevel(): js.Promise[String] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def profilingLevel(callback: Callback[String]): Unit = js.native
  def profilingLevel(options: ProfilingLevelOptions): js.Promise[String] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def profilingLevel(options: ProfilingLevelOptions, callback: Callback[String]): Unit = js.native
  
  def readConcern: js.UndefOr[ReadConcern] = js.native
  
  /**
    * The current readPreference of the Db. If not explicitly defined for
    * this Db, will be inherited from the parent MongoClient
    */
  def readPreference: ReadPreference = js.native
  
  /**
    * Remove a user from a database
    *
    * @param username - The username to remove
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def removeUser(username: String): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def removeUser(username: String, callback: Callback[Boolean]): Unit = js.native
  def removeUser(username: String, options: RemoveUserOptions): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def removeUser(username: String, options: RemoveUserOptions, callback: Callback[Boolean]): Unit = js.native
  
  /**
    * Rename a collection.
    *
    * @remarks
    * This operation does not inherit options from the MongoClient.
    *
    * @param fromCollection - Name of current collection to rename
    * @param toCollection - New name of of the collection
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def renameCollection[TSchema /* <: Document */](fromCollection: String, toCollection: String): js.Promise[Collection[TSchema]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def renameCollection[TSchema /* <: Document */](fromCollection: String, toCollection: String, callback: Callback[Collection[TSchema]]): Unit = js.native
  def renameCollection[TSchema /* <: Document */](fromCollection: String, toCollection: String, options: RenameOptions): js.Promise[Collection[TSchema]] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def renameCollection[TSchema /* <: Document */](
    fromCollection: String,
    toCollection: String,
    options: RenameOptions,
    callback: Callback[Collection[TSchema]]
  ): Unit = js.native
  
  /**
    * Check if a secondary can be used (because the read preference is *not* set to primary)
    */
  def secondaryOk: Boolean = js.native
  
  /**
    * Set the current profiling level of MongoDB
    *
    * @param level - The new profiling level (off, slow_only, all).
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def setProfilingLevel(level: ProfilingLevel): js.Promise[ProfilingLevel] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def setProfilingLevel(level: ProfilingLevel, callback: Callback[ProfilingLevel]): Unit = js.native
  def setProfilingLevel(level: ProfilingLevel, options: SetProfilingLevelOptions): js.Promise[ProfilingLevel] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def setProfilingLevel(level: ProfilingLevel, options: SetProfilingLevelOptions, callback: Callback[ProfilingLevel]): Unit = js.native
  
  /**
    * slaveOk specified
    * @deprecated Use secondaryOk instead
    */
  def slaveOk: Boolean = js.native
  
  /**
    * Get all the db statistics.
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def stats(): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def stats(callback: Callback[Document]): Unit = js.native
  def stats(options: DbStatsOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def stats(options: DbStatsOptions, callback: Callback[Document]): Unit = js.native
  
  /**
    * Unref all sockets
    * @deprecated This function is deprecated and will be removed in the next major version.
    */
  def unref(): Unit = js.native
  
  /**
    * Create a new Change Stream, watching for new changes (insertions, updates,
    * replacements, deletions, and invalidations) in this database. Will ignore all
    * changes to system collections.
    *
    * @remarks
    * watch() accepts two generic arguments for distinct use cases:
    * - The first is to provide the schema that may be defined for all the collections within this database
    * - The second is to override the shape of the change stream document entirely, if it is not provided the type will default to ChangeStreamDocument of the first argument
    *
    * @param pipeline - An array of {@link https://docs.mongodb.com/manual/reference/operator/aggregation-pipeline/|aggregation pipeline stages} through which to pass change stream documents. This allows for filtering (using $match) and manipulating the change stream documents.
    * @param options - Optional settings for the command
    * @typeParam TSchema - Type of the data being detected by the change stream
    * @typeParam TChange - Type of the whole change stream document emitted
    */
  def watch[TSchema /* <: Document */, TChange /* <: Document */](): ChangeStream[TSchema, TChange] = js.native
  def watch[TSchema /* <: Document */, TChange /* <: Document */](pipeline: js.Array[Document]): ChangeStream[TSchema, TChange] = js.native
  def watch[TSchema /* <: Document */, TChange /* <: Document */](pipeline: js.Array[Document], options: ChangeStreamOptions): ChangeStream[TSchema, TChange] = js.native
  def watch[TSchema /* <: Document */, TChange /* <: Document */](pipeline: Unit, options: ChangeStreamOptions): ChangeStream[TSchema, TChange] = js.native
  
  def writeConcern: js.UndefOr[WriteConcern] = js.native
}
/* static members */
object Db {
  
  @JSImport("mongodb", "Db")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mongodb", "Db.SYSTEM_COMMAND_COLLECTION")
  @js.native
  def SYSTEM_COMMAND_COLLECTION: String = js.native
  inline def SYSTEM_COMMAND_COLLECTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM_COMMAND_COLLECTION")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "Db.SYSTEM_INDEX_COLLECTION")
  @js.native
  def SYSTEM_INDEX_COLLECTION: String = js.native
  inline def SYSTEM_INDEX_COLLECTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM_INDEX_COLLECTION")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "Db.SYSTEM_JS_COLLECTION")
  @js.native
  def SYSTEM_JS_COLLECTION: String = js.native
  inline def SYSTEM_JS_COLLECTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM_JS_COLLECTION")(x.asInstanceOf[js.Any])
  
  /* Excluded from this release type: s */
  @JSImport("mongodb", "Db.SYSTEM_NAMESPACE_COLLECTION")
  @js.native
  def SYSTEM_NAMESPACE_COLLECTION: String = js.native
  inline def SYSTEM_NAMESPACE_COLLECTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM_NAMESPACE_COLLECTION")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "Db.SYSTEM_PROFILE_COLLECTION")
  @js.native
  def SYSTEM_PROFILE_COLLECTION: String = js.native
  inline def SYSTEM_PROFILE_COLLECTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM_PROFILE_COLLECTION")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "Db.SYSTEM_USER_COLLECTION")
  @js.native
  def SYSTEM_USER_COLLECTION: String = js.native
  inline def SYSTEM_USER_COLLECTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM_USER_COLLECTION")(x.asInstanceOf[js.Any])
}
