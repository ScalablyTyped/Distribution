package typings.migrateMongo

import typings.mongodb.AnonBatchSize
import typings.mongodb.AnonDropTarget
import typings.mongodb.AnonFull
import typings.mongodb.AnonReadPreference
import typings.mongodb.AnonScale
import typings.mongodb.AnonSession
import typings.mongodb.AnonSessionClientSession
import typings.mongodb.ChangeStreamOptionssessio
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
import typings.mongodb.mod.Mongos
import typings.mongodb.mod.ProfilingLevel
import typings.mongodb.mod.ReplSet
import typings.mongodb.mod.Server
import typings.mongodb.mod.WriteConcern
import typings.node.eventsMod.EventEmitterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mongodb.mongodb.Db & {  close  :mongodb.mongodb.MongoClient['close']} */
@js.native
trait DbcloseMongoClientclose extends js.Object {
  var bufferMaxEntries: Double = js.native
  @JSName("close")
  var close_Original: FnCall = js.native
  var databaseName: String = js.native
  var native_parser: Boolean = js.native
  var options: js.Any = js.native
  var serverConfig: Server | ReplSet | Mongos = js.native
  var slaveOk: Boolean = js.native
  var writeConcern: WriteConcern = js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def addUser(username: String, password: String): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#addUser */
  def addUser(username: String, password: String, callback: MongoCallback[_]): Unit = js.native
  def addUser(username: String, password: String, options: DbAddUserOptions): js.Promise[_] = js.native
  def addUser(username: String, password: String, options: DbAddUserOptions, callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#admin */
  def admin(): Admin = js.native
  def close(): js.Promise[Unit] = js.native
  def close(callback: MongoCallback[Unit]): Unit = js.native
  def close(force: Boolean): js.Promise[Unit] = js.native
  def close(force: Boolean, callback: MongoCallback[Unit]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#collection */
  def collection[TSchema](name: String): Collection[TSchema] = js.native
  def collection[TSchema](name: String, callback: MongoCallback[Collection[TSchema]]): Collection[TSchema] = js.native
  def collection[TSchema](name: String, options: DbCollectionOptions): Collection[TSchema] = js.native
  def collection[TSchema](name: String, options: DbCollectionOptions, callback: MongoCallback[Collection[TSchema]]): Collection[TSchema] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#collections */
  def collections(): js.Promise[js.Array[Collection[Default]]] = js.native
  def collections(callback: MongoCallback[js.Array[Collection[Default]]]): Unit = js.native
  def command(command: js.Object): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#command */
  def command(command: js.Object, callback: MongoCallback[_]): Unit = js.native
  def command(command: js.Object, options: AnonReadPreference): js.Promise[_] = js.native
  def command(command: js.Object, options: AnonReadPreference, callback: MongoCallback[_]): Unit = js.native
  def createCollection[TSchema](name: String): js.Promise[Collection[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#createCollection */
  def createCollection[TSchema](name: String, callback: MongoCallback[Collection[TSchema]]): Unit = js.native
  def createCollection[TSchema](name: String, options: CollectionCreateOptions): js.Promise[Collection[TSchema]] = js.native
  def createCollection[TSchema](name: String, options: CollectionCreateOptions, callback: MongoCallback[Collection[TSchema]]): Unit = js.native
  def createIndex(name: String, fieldOrSpec: String): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#createIndex */
  def createIndex(name: String, fieldOrSpec: String, callback: MongoCallback[_]): Unit = js.native
  def createIndex(name: String, fieldOrSpec: String, options: IndexOptions): js.Promise[_] = js.native
  def createIndex(name: String, fieldOrSpec: String, options: IndexOptions, callback: MongoCallback[_]): Unit = js.native
  def createIndex(name: String, fieldOrSpec: js.Object): js.Promise[_] = js.native
  def createIndex(name: String, fieldOrSpec: js.Object, callback: MongoCallback[_]): Unit = js.native
  def createIndex(name: String, fieldOrSpec: js.Object, options: IndexOptions): js.Promise[_] = js.native
  def createIndex(name: String, fieldOrSpec: js.Object, options: IndexOptions, callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#dropCollection */
  def dropCollection(name: String): js.Promise[Boolean] = js.native
  def dropCollection(name: String, callback: MongoCallback[Boolean]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#dropDatabase */
  def dropDatabase(): js.Promise[_] = js.native
  def dropDatabase(callback: MongoCallback[_]): Unit = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  def eventNames(): js.Array[String | js.Symbol] = js.native
  def executeDbAdminCommand(command: js.Object): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#executeDbAdminCommand */
  def executeDbAdminCommand(command: js.Object, callback: MongoCallback[_]): Unit = js.native
  def executeDbAdminCommand(command: js.Object, options: AnonSession): js.Promise[_] = js.native
  def executeDbAdminCommand(command: js.Object, options: AnonSession, callback: MongoCallback[_]): Unit = js.native
  def getMaxListeners(): Double = js.native
  def indexInformation(name: String): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#indexInformation */
  def indexInformation(name: String, callback: MongoCallback[_]): Unit = js.native
  def indexInformation(name: String, options: AnonFull): js.Promise[_] = js.native
  def indexInformation(name: String, options: AnonFull, callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#listCollections */
  def listCollections(): CommandCursor = js.native
  def listCollections(filter: js.Object): CommandCursor = js.native
  def listCollections(filter: js.Object, options: AnonBatchSize): CommandCursor = js.native
  def listenerCount(`type`: String): Double = js.native
  def listenerCount(`type`: js.Symbol): Double = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  // Added in Node 6...
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def profilingInfo(): js.Promise[Unit] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#profilingInfo */
  /** @deprecated Query the system.profile collection directly. */
  def profilingInfo(callback: MongoCallback[_]): Unit = js.native
  def profilingInfo(options: AnonSessionClientSession): js.Promise[Unit] = js.native
  def profilingInfo(options: AnonSessionClientSession, callback: MongoCallback[Unit]): Unit = js.native
  def profilingLevel(): js.Promise[ProfilingLevel] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#profilingLevel */
  def profilingLevel(callback: MongoCallback[ProfilingLevel]): Unit = js.native
  def profilingLevel(options: AnonSessionClientSession): js.Promise[ProfilingLevel] = js.native
  def profilingLevel(options: AnonSessionClientSession, callback: MongoCallback[ProfilingLevel]): Unit = js.native
  def rawListeners(event: String): js.Array[js.Function] = js.native
  def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def removeUser(username: String): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#removeUser */
  def removeUser(username: String, callback: MongoCallback[_]): Unit = js.native
  def removeUser(username: String, options: CommonOptions): js.Promise[_] = js.native
  def removeUser(username: String, options: CommonOptions, callback: MongoCallback[_]): Unit = js.native
  def renameCollection[TSchema](fromCollection: String, toCollection: String): js.Promise[Collection[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#renameCollection */
  def renameCollection[TSchema](fromCollection: String, toCollection: String, callback: MongoCallback[Collection[TSchema]]): Unit = js.native
  def renameCollection[TSchema](fromCollection: String, toCollection: String, options: AnonDropTarget): js.Promise[Collection[TSchema]] = js.native
  def renameCollection[TSchema](
    fromCollection: String,
    toCollection: String,
    options: AnonDropTarget,
    callback: MongoCallback[Collection[TSchema]]
  ): Unit = js.native
  def setMaxListeners(n: Double): this.type = js.native
  def setProfilingLevel(level: ProfilingLevel): js.Promise[ProfilingLevel] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#setProfilingLevel */
  def setProfilingLevel(level: ProfilingLevel, callback: MongoCallback[ProfilingLevel]): Unit = js.native
  def setProfilingLevel(level: ProfilingLevel, options: AnonSessionClientSession): js.Promise[ProfilingLevel] = js.native
  def setProfilingLevel(level: ProfilingLevel, options: AnonSessionClientSession, callback: MongoCallback[ProfilingLevel]): Unit = js.native
  def stats(): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#stats */
  def stats(callback: MongoCallback[_]): Unit = js.native
  def stats(options: AnonScale): js.Promise[_] = js.native
  def stats(options: AnonScale, callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.3/api/Db.html#watch */
  def watch(): ChangeStream = js.native
  def watch(pipeline: js.Array[js.Object]): ChangeStream = js.native
  def watch(pipeline: js.Array[js.Object], options: ChangeStreamOptionssessio): ChangeStream = js.native
}

