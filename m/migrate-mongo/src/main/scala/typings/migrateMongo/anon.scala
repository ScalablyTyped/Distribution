package typings.migrateMongo

import typings.bson.mod.Document
import typings.migrateMongo.migrateMongoStrings.nameOnly
import typings.mongodb.anon.NameOnly
import typings.mongodb.anon.PickCollectionInfonametyp
import typings.mongodb.anon.`0`
import typings.mongodb.mod.AddUserOptions
import typings.mongodb.mod.Admin
import typings.mongodb.mod.AggregateOptions
import typings.mongodb.mod.AggregationCursor
import typings.mongodb.mod.BSONSerializeOptions
import typings.mongodb.mod.ChangeStream
import typings.mongodb.mod.ChangeStreamOptions
import typings.mongodb.mod.Collection
import typings.mongodb.mod.CollectionInfo
import typings.mongodb.mod.CollectionOptions
import typings.mongodb.mod.CreateCollectionOptions
import typings.mongodb.mod.CreateIndexesOptions
import typings.mongodb.mod.DbOptions
import typings.mongodb.mod.DbStatsOptions
import typings.mongodb.mod.DropCollectionOptions
import typings.mongodb.mod.DropDatabaseOptions
import typings.mongodb.mod.IndexInformationOptions
import typings.mongodb.mod.IndexSpecification
import typings.mongodb.mod.ListCollectionsCursor
import typings.mongodb.mod.ListCollectionsOptions
import typings.mongodb.mod.MongoClient
import typings.mongodb.mod.MongoClientOptions
import typings.mongodb.mod.ProfilingLevel
import typings.mongodb.mod.ProfilingLevelOptions
import typings.mongodb.mod.ReadConcern
import typings.mongodb.mod.ReadPreference
import typings.mongodb.mod.RemoveUserOptions
import typings.mongodb.mod.RenameOptions
import typings.mongodb.mod.RunCommandOptions
import typings.mongodb.mod.SetProfilingLevelOptions
import typings.mongodb.mod.WriteConcern
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Client extends StObject {
    
    var client: MongoClient
    
    var db: DbcloseMongoClientclose
  }
  object Client {
    
    inline def apply(client: MongoClient, db: DbcloseMongoClientclose): Client = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
      __obj.asInstanceOf[Client]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
      
      inline def setClient(value: MongoClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setDb(value: DbcloseMongoClientclose): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    }
  }
  
  trait DatabaseName extends StObject {
    
    var databaseName: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: mongodb.mongodb.Db['databaseName'] */ js.Any
      ] = js.undefined
    
    var options: js.UndefOr[MongoClientOptions] = js.undefined
    
    var url: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.anon.FnCallUrlOptions>[0] */ js.Any
  }
  object DatabaseName {
    
    inline def apply(
      url: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.anon.FnCallUrlOptions>[0] */ js.Any
    ): DatabaseName = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabaseName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatabaseName] (val x: Self) extends AnyVal {
      
      inline def setDatabaseName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: mongodb.mongodb.Db['databaseName'] */ js.Any
      ): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      inline def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      inline def setOptions(value: MongoClientOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setUrl(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.anon.FnCallUrlOptions>[0] */ js.Any
      ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined mongodb.mongodb.Db & {  close :mongodb.mongodb.MongoClient['close']} */
  @js.native
  trait DbcloseMongoClientclose extends StObject {
    
    /**
      * Add a user to the database
      *
      * @param username - The username for the new user
      * @param passwordOrOptions - An optional password for the new user, or the options for the command
      * @param options - Optional settings for the command
      * @deprecated Use the createUser command in `db.command()` instead.
      * @see https://www.mongodb.com/docs/manual/reference/command/createUser/
      */
    def addUser(username: String): js.Promise[Document] = js.native
    def addUser(username: String, passwordOrOptions: String): js.Promise[Document] = js.native
    def addUser(username: String, passwordOrOptions: String, options: AddUserOptions): js.Promise[Document] = js.native
    def addUser(username: String, passwordOrOptions: Unit, options: AddUserOptions): js.Promise[Document] = js.native
    def addUser(username: String, passwordOrOptions: AddUserOptions): js.Promise[Document] = js.native
    def addUser(username: String, passwordOrOptions: AddUserOptions, options: AddUserOptions): js.Promise[Document] = js.native
    
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
    
    def close(): js.Promise[Unit] = js.native
    def close(force: Boolean): js.Promise[Unit] = js.native
    @JSName("close")
    var close_Original: FnCall = js.native
    
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
      */
    def collections(): js.Promise[js.Array[Collection[Document]]] = js.native
    def collections(options: ListCollectionsOptions): js.Promise[js.Array[Collection[Document]]] = js.native
    
    /**
      * Execute a command
      *
      * @remarks
      * This command does not inherit options from the MongoClient.
      *
      * The driver will ensure the following fields are attached to the command sent to the server:
      * - `lsid` - sourced from an implicit session or options.session
      * - `$readPreference` - defaults to primary or can be configured by options.readPreference
      * - `$db` - sourced from the name of this database
      *
      * If the client has a serverApi setting:
      * - `apiVersion`
      * - `apiStrict`
      * - `apiDeprecationErrors`
      *
      * When in a transaction:
      * - `readConcern` - sourced from readConcern set on the TransactionOptions
      * - `writeConcern` - sourced from writeConcern set on the TransactionOptions
      *
      * Attaching any of the above fields to the command will have no effect as the driver will overwrite the value.
      *
      * @param command - The command to run
      * @param options - Optional settings for the command
      */
    def command(command: Document): js.Promise[Document] = js.native
    def command(command: Document, options: RunCommandOptions): js.Promise[Document] = js.native
    
    /**
      * Create a new collection on a server with the specified options. Use this to create capped collections.
      * More information about command options available at https://www.mongodb.com/docs/manual/reference/command/create/
      *
      * @param name - The name of the collection to create
      * @param options - Optional settings for the command
      */
    def createCollection[TSchema /* <: Document */](name: String): js.Promise[Collection[TSchema]] = js.native
    def createCollection[TSchema /* <: Document */](name: String, options: CreateCollectionOptions): js.Promise[Collection[TSchema]] = js.native
    
    /**
      * Creates an index on the db and collection.
      *
      * @param name - Name of the collection to create the index on.
      * @param indexSpec - Specify the field to index, or an index specification
      * @param options - Optional settings for the command
      */
    def createIndex(name: String, indexSpec: IndexSpecification): js.Promise[String] = js.native
    def createIndex(name: String, indexSpec: IndexSpecification, options: CreateIndexesOptions): js.Promise[String] = js.native
    
    def databaseName: String = js.native
    
    /**
      * Drop a collection from the database, removing it permanently. New accesses will create a new collection.
      *
      * @param name - Name of collection to drop
      * @param options - Optional settings for the command
      */
    def dropCollection(name: String): js.Promise[Boolean] = js.native
    def dropCollection(name: String, options: DropCollectionOptions): js.Promise[Boolean] = js.native
    
    /**
      * Drop a database, removing it permanently from the server.
      *
      * @param options - Optional settings for the command
      */
    def dropDatabase(): js.Promise[Boolean] = js.native
    def dropDatabase(options: DropDatabaseOptions): js.Promise[Boolean] = js.native
    
    /**
      * Retrieves this collections index info.
      *
      * @param name - The name of the collection.
      * @param options - Optional settings for the command
      */
    def indexInformation(name: String): js.Promise[Document] = js.native
    def indexInformation(name: String, options: IndexInformationOptions): js.Promise[Document] = js.native
    
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
    
    def namespace: String = js.native
    
    def options: js.UndefOr[DbOptions] = js.native
    
    /**
      * Retrieve the current profiling Level for MongoDB
      *
      * @param options - Optional settings for the command
      */
    def profilingLevel(): js.Promise[String] = js.native
    def profilingLevel(options: ProfilingLevelOptions): js.Promise[String] = js.native
    
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
      */
    def removeUser(username: String): js.Promise[Boolean] = js.native
    def removeUser(username: String, options: RemoveUserOptions): js.Promise[Boolean] = js.native
    
    /**
      * Rename a collection.
      *
      * @remarks
      * This operation does not inherit options from the MongoClient.
      *
      * @param fromCollection - Name of current collection to rename
      * @param toCollection - New name of of the collection
      * @param options - Optional settings for the command
      */
    def renameCollection[TSchema /* <: Document */](fromCollection: String, toCollection: String): js.Promise[Collection[TSchema]] = js.native
    def renameCollection[TSchema /* <: Document */](fromCollection: String, toCollection: String, options: RenameOptions): js.Promise[Collection[TSchema]] = js.native
    
    /**
      * Check if a secondary can be used (because the read preference is *not* set to primary)
      */
    def secondaryOk: Boolean = js.native
    
    /**
      * Set the current profiling level of MongoDB
      *
      * @param level - The new profiling level (off, slow_only, all).
      * @param options - Optional settings for the command
      */
    def setProfilingLevel(level: ProfilingLevel): js.Promise[ProfilingLevel] = js.native
    def setProfilingLevel(level: ProfilingLevel, options: SetProfilingLevelOptions): js.Promise[ProfilingLevel] = js.native
    
    /**
      * Get all the db statistics.
      *
      * @param options - Optional settings for the command
      */
    def stats(): js.Promise[Document] = js.native
    def stats(options: DbStatsOptions): js.Promise[Document] = js.native
    
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
      * @param pipeline - An array of {@link https://www.mongodb.com/docs/manual/reference/operator/aggregation-pipeline/|aggregation pipeline stages} through which to pass change stream documents. This allows for filtering (using $match) and manipulating the change stream documents.
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
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): js.Promise[Unit] = js.native
    def apply(force: Boolean): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait FnCallUrlOptions extends StObject {
    
    def apply(url: String): js.Promise[MongoClient] = js.native
    def apply(url: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
  }
  
  /* Inlined std.Partial<migrate-mongo.migrate-mongo.config.Config> */
  trait PartialConfig extends StObject {
    
    var changelogCollectionName: js.UndefOr[String] = js.undefined
    
    var migrationFileExtension: js.UndefOr[String] = js.undefined
    
    var migrationsDir: js.UndefOr[String] = js.undefined
    
    var mongodb: js.UndefOr[DatabaseName] = js.undefined
    
    var useFileHash: js.UndefOr[Boolean] = js.undefined
  }
  object PartialConfig {
    
    inline def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialConfig] (val x: Self) extends AnyVal {
      
      inline def setChangelogCollectionName(value: String): Self = StObject.set(x, "changelogCollectionName", value.asInstanceOf[js.Any])
      
      inline def setChangelogCollectionNameUndefined: Self = StObject.set(x, "changelogCollectionName", js.undefined)
      
      inline def setMigrationFileExtension(value: String): Self = StObject.set(x, "migrationFileExtension", value.asInstanceOf[js.Any])
      
      inline def setMigrationFileExtensionUndefined: Self = StObject.set(x, "migrationFileExtension", js.undefined)
      
      inline def setMigrationsDir(value: String): Self = StObject.set(x, "migrationsDir", value.asInstanceOf[js.Any])
      
      inline def setMigrationsDirUndefined: Self = StObject.set(x, "migrationsDir", js.undefined)
      
      inline def setMongodb(value: DatabaseName): Self = StObject.set(x, "mongodb", value.asInstanceOf[js.Any])
      
      inline def setMongodbUndefined: Self = StObject.set(x, "mongodb", js.undefined)
      
      inline def setUseFileHash(value: Boolean): Self = StObject.set(x, "useFileHash", value.asInstanceOf[js.Any])
      
      inline def setUseFileHashUndefined: Self = StObject.set(x, "useFileHash", js.undefined)
    }
  }
}
