package typings.migrateMongo

import typings.mongodb.anon.BatchSize
import typings.mongodb.anon.ChangeStreamOptionssessio
import typings.mongodb.anon.DropTarget
import typings.mongodb.anon.Full
import typings.mongodb.anon.ReadPreference
import typings.mongodb.anon.Scale
import typings.mongodb.anon.Session
import typings.mongodb.anon.`1`
import typings.mongodb.mod.Admin
import typings.mongodb.mod.ChangeStream
import typings.mongodb.mod.Collection
import typings.mongodb.mod.CollectionCreateOptions
import typings.mongodb.mod.CommandCursor
import typings.mongodb.mod.CommonOptions
import typings.mongodb.mod.DbAddUserOptions
import typings.mongodb.mod.DbCollectionOptions
import typings.mongodb.mod.DbCreateOptions
import typings.mongodb.mod.Default
import typings.mongodb.mod.IndexOptions
import typings.mongodb.mod.MongoCallback
import typings.mongodb.mod.MongoClient
import typings.mongodb.mod.MongoClientOptions
import typings.mongodb.mod.Mongos
import typings.mongodb.mod.ProfilingLevel
import typings.mongodb.mod.ReplSet
import typings.mongodb.mod.Server
import typings.mongodb.mod.WriteConcern
import typings.node.eventsMod.EventEmitterOptions
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
    
    extension [Self <: Client](x: Self) {
      
      inline def setClient(value: MongoClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setDb(value: DbcloseMongoClientclose): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    }
  }
  
  trait DatabaseName extends StObject {
    
    var databaseName: String
    
    var options: MongoClientOptions
    
    var url: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.anon.FnCallUriOptionsCallback>[0] */ js.Any
  }
  object DatabaseName {
    
    inline def apply(
      databaseName: String,
      options: MongoClientOptions,
      url: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.anon.FnCallUriOptionsCallback>[0] */ js.Any
    ): DatabaseName = {
      val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabaseName]
    }
    
    extension [Self <: DatabaseName](x: Self) {
      
      inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: MongoClientOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setUrl(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.anon.FnCallUriOptionsCallback>[0] */ js.Any
      ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined mongodb.mongodb.Db & {  close :mongodb.mongodb.MongoClient['close']} */
  @js.native
  trait DbcloseMongoClientclose extends StObject {
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def addUser(username: String, password: String): js.Promise[js.Any] = js.native
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#addUser */
    def addUser(username: String, password: String, callback: MongoCallback[js.Any]): Unit = js.native
    def addUser(username: String, password: String, options: DbAddUserOptions): js.Promise[js.Any] = js.native
    def addUser(username: String, password: String, options: DbAddUserOptions, callback: MongoCallback[js.Any]): Unit = js.native
    
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#admin */
    def admin(): Admin = js.native
    
    var bufferMaxEntries: Double = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(callback: MongoCallback[Unit]): Unit = js.native
    def close(force: Boolean): js.Promise[Unit] = js.native
    def close(force: Boolean, callback: MongoCallback[Unit]): Unit = js.native
    @JSName("close")
    var close_Original: FnCall = js.native
    
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#collection */
    def collection[TSchema](name: String): Collection[TSchema] = js.native
    def collection[TSchema](name: String, callback: MongoCallback[Collection[TSchema]]): Collection[TSchema] = js.native
    def collection[TSchema](name: String, options: DbCollectionOptions): Collection[TSchema] = js.native
    def collection[TSchema](name: String, options: DbCollectionOptions, callback: MongoCallback[Collection[TSchema]]): Collection[TSchema] = js.native
    
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#collections */
    def collections(): js.Promise[js.Array[Collection[Default]]] = js.native
    def collections(callback: MongoCallback[js.Array[Collection[Default]]]): Unit = js.native
    
    def command(command: js.Object): js.Promise[js.Any] = js.native
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#command */
    def command(command: js.Object, callback: MongoCallback[js.Any]): Unit = js.native
    def command(command: js.Object, options: ReadPreference): js.Promise[js.Any] = js.native
    def command(command: js.Object, options: Session, callback: MongoCallback[js.Any]): Unit = js.native
    
    def createCollection[TSchema](name: String): js.Promise[Collection[TSchema]] = js.native
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#createCollection */
    def createCollection[TSchema](name: String, callback: MongoCallback[Collection[TSchema]]): Unit = js.native
    def createCollection[TSchema](name: String, options: CollectionCreateOptions): js.Promise[Collection[TSchema]] = js.native
    def createCollection[TSchema](name: String, options: CollectionCreateOptions, callback: MongoCallback[Collection[TSchema]]): Unit = js.native
    
    def createIndex(name: String, fieldOrSpec: String): js.Promise[js.Any] = js.native
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#createIndex */
    def createIndex(name: String, fieldOrSpec: String, callback: MongoCallback[js.Any]): Unit = js.native
    def createIndex(name: String, fieldOrSpec: String, options: IndexOptions): js.Promise[js.Any] = js.native
    def createIndex(name: String, fieldOrSpec: String, options: IndexOptions, callback: MongoCallback[js.Any]): Unit = js.native
    def createIndex(name: String, fieldOrSpec: js.Object): js.Promise[js.Any] = js.native
    def createIndex(name: String, fieldOrSpec: js.Object, callback: MongoCallback[js.Any]): Unit = js.native
    def createIndex(name: String, fieldOrSpec: js.Object, options: IndexOptions): js.Promise[js.Any] = js.native
    def createIndex(name: String, fieldOrSpec: js.Object, options: IndexOptions, callback: MongoCallback[js.Any]): Unit = js.native
    
    var databaseName: String = js.native
    
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#dropCollection */
    def dropCollection(name: String): js.Promise[Boolean] = js.native
    def dropCollection(name: String, callback: MongoCallback[Boolean]): Unit = js.native
    
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#dropDatabase */
    def dropDatabase(): js.Promise[js.Any] = js.native
    def dropDatabase(callback: MongoCallback[js.Any]): Unit = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    def executeDbAdminCommand(command: js.Object): js.Promise[js.Any] = js.native
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#executeDbAdminCommand */
    def executeDbAdminCommand(command: js.Object, callback: MongoCallback[js.Any]): Unit = js.native
    def executeDbAdminCommand(command: js.Object, options: ReadPreference): js.Promise[js.Any] = js.native
    def executeDbAdminCommand(command: js.Object, options: ReadPreference, callback: MongoCallback[js.Any]): Unit = js.native
    
    def getMaxListeners(): Double = js.native
    
    def indexInformation(name: String): js.Promise[js.Any] = js.native
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#indexInformation */
    def indexInformation(name: String, callback: MongoCallback[js.Any]): Unit = js.native
    def indexInformation(name: String, options: Full): js.Promise[js.Any] = js.native
    def indexInformation(name: String, options: Full, callback: MongoCallback[js.Any]): Unit = js.native
    
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#listCollections */
    def listCollections(): CommandCursor = js.native
    def listCollections(filter: js.Object): CommandCursor = js.native
    def listCollections(filter: js.Object, options: BatchSize): CommandCursor = js.native
    def listCollections(filter: Unit, options: BatchSize): CommandCursor = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    var native_parser: Boolean = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    var options: js.Any = js.native
    
    // Added in Node 6...
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def profilingInfo(): js.Promise[Unit] = js.native
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#profilingInfo */
    /** @deprecated Query the system.profile collection directly. */
    def profilingInfo(callback: MongoCallback[js.Any]): Unit = js.native
    def profilingInfo(options: `1`): js.Promise[Unit] = js.native
    def profilingInfo(options: `1`, callback: MongoCallback[Unit]): Unit = js.native
    
    def profilingLevel(): js.Promise[ProfilingLevel] = js.native
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#profilingLevel */
    def profilingLevel(callback: MongoCallback[ProfilingLevel]): Unit = js.native
    def profilingLevel(options: `1`): js.Promise[ProfilingLevel] = js.native
    def profilingLevel(options: `1`, callback: MongoCallback[ProfilingLevel]): Unit = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def removeUser(username: String): js.Promise[js.Any] = js.native
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#removeUser */
    def removeUser(username: String, callback: MongoCallback[js.Any]): Unit = js.native
    def removeUser(username: String, options: CommonOptions): js.Promise[js.Any] = js.native
    def removeUser(username: String, options: CommonOptions, callback: MongoCallback[js.Any]): Unit = js.native
    
    def renameCollection[TSchema](fromCollection: String, toCollection: String): js.Promise[Collection[TSchema]] = js.native
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#renameCollection */
    def renameCollection[TSchema](fromCollection: String, toCollection: String, callback: MongoCallback[Collection[TSchema]]): Unit = js.native
    def renameCollection[TSchema](fromCollection: String, toCollection: String, options: DropTarget): js.Promise[Collection[TSchema]] = js.native
    def renameCollection[TSchema](
      fromCollection: String,
      toCollection: String,
      options: DropTarget,
      callback: MongoCallback[Collection[TSchema]]
    ): Unit = js.native
    
    var serverConfig: Server | ReplSet | Mongos = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    
    def setProfilingLevel(level: ProfilingLevel): js.Promise[ProfilingLevel] = js.native
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#setProfilingLevel */
    def setProfilingLevel(level: ProfilingLevel, callback: MongoCallback[ProfilingLevel]): Unit = js.native
    def setProfilingLevel(level: ProfilingLevel, options: `1`): js.Promise[ProfilingLevel] = js.native
    def setProfilingLevel(level: ProfilingLevel, options: `1`, callback: MongoCallback[ProfilingLevel]): Unit = js.native
    
    var slaveOk: Boolean = js.native
    
    def stats(): js.Promise[js.Any] = js.native
    /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#stats */
    def stats(callback: MongoCallback[js.Any]): Unit = js.native
    def stats(options: Scale): js.Promise[js.Any] = js.native
    def stats(options: Scale, callback: MongoCallback[js.Any]): Unit = js.native
    
    /** http://mongodb.github.io/node-mongodb-native/3.3/api/Db.html#watch */
    def watch[TSchema /* <: js.Object */](): ChangeStream[TSchema] = js.native
    def watch[TSchema /* <: js.Object */](pipeline: js.Array[js.Object]): ChangeStream[TSchema] = js.native
    def watch[TSchema /* <: js.Object */](pipeline: js.Array[js.Object], options: ChangeStreamOptionssessio): ChangeStream[TSchema] = js.native
    def watch[TSchema /* <: js.Object */](pipeline: Unit, options: ChangeStreamOptionssessio): ChangeStream[TSchema] = js.native
    
    var writeConcern: WriteConcern = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): js.Promise[Unit] = js.native
    def apply(callback: MongoCallback[Unit]): Unit = js.native
    def apply(force: Boolean): js.Promise[Unit] = js.native
    def apply(force: Boolean, callback: MongoCallback[Unit]): Unit = js.native
  }
  
  @js.native
  trait FnCallUriOptionsCallback extends StObject {
    
    def apply(uri: String): js.Promise[MongoClient] = js.native
    def apply(uri: String, callback: MongoCallback[MongoClient]): Unit = js.native
    def apply(uri: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
    def apply(uri: String, options: MongoClientOptions, callback: MongoCallback[MongoClient]): Unit = js.native
  }
}
