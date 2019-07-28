package typings.mongodb.mongodbMod

import typings.mongodb.Anon_BatchSize
import typings.mongodb.Anon_DropTarget
import typings.mongodb.Anon_Full
import typings.mongodb.Anon_ReadPreference
import typings.mongodb.Anon_ReadPreferenceSession
import typings.mongodb.Anon_Scale
import typings.mongodb.Anon_SessionClientSession
import typings.mongodb.Default
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "Db")
@js.native
class Db protected () extends EventEmitter {
  def this(databaseName: String, serverConfig: Mongos) = this()
  def this(databaseName: String, serverConfig: ReplSet) = this()
  def this(databaseName: String, serverConfig: Server) = this()
  def this(databaseName: String, serverConfig: Mongos, options: DbCreateOptions) = this()
  def this(databaseName: String, serverConfig: ReplSet, options: DbCreateOptions) = this()
  def this(databaseName: String, serverConfig: Server, options: DbCreateOptions) = this()
  var bufferMaxEntries: scala.Double = js.native
  var databaseName: String = js.native
  var native_parser: Boolean = js.native
  var options: js.Any = js.native
  var serverConfig: Server | ReplSet | Mongos = js.native
  var slaveOk: Boolean = js.native
  var writeConcern: WriteConcern = js.native
  def addUser(username: String, password: String): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#addUser */
  def addUser(username: String, password: String, callback: MongoCallback[_]): Unit = js.native
  def addUser(username: String, password: String, options: DbAddUserOptions): js.Promise[_] = js.native
  def addUser(username: String, password: String, options: DbAddUserOptions, callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#admin */
  def admin(): Admin = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#collection */
  def collection[TSchema](name: String): Collection[TSchema] = js.native
  def collection[TSchema](name: String, callback: MongoCallback[Collection[TSchema]]): Collection[TSchema] = js.native
  def collection[TSchema](name: String, options: DbCollectionOptions, callback: MongoCallback[Collection[TSchema]]): Collection[TSchema] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#collections */
  def collections(): js.Promise[js.Array[Collection[Default]]] = js.native
  def collections(callback: MongoCallback[js.Array[Collection[Default]]]): Unit = js.native
  def command(command: js.Object): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#command */
  def command(command: js.Object, callback: MongoCallback[_]): Unit = js.native
  def command(command: js.Object, options: Anon_ReadPreference): js.Promise[_] = js.native
  def command(command: js.Object, options: Anon_ReadPreference, callback: MongoCallback[_]): Unit = js.native
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
  def executeDbAdminCommand(command: js.Object): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#executeDbAdminCommand */
  def executeDbAdminCommand(command: js.Object, callback: MongoCallback[_]): Unit = js.native
  def executeDbAdminCommand(command: js.Object, options: Anon_ReadPreferenceSession): js.Promise[_] = js.native
  def executeDbAdminCommand(command: js.Object, options: Anon_ReadPreferenceSession, callback: MongoCallback[_]): Unit = js.native
  def indexInformation(name: String): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#indexInformation */
  def indexInformation(name: String, callback: MongoCallback[_]): Unit = js.native
  def indexInformation(name: String, options: Anon_Full): js.Promise[_] = js.native
  def indexInformation(name: String, options: Anon_Full, callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#listCollections */
  def listCollections(): CommandCursor = js.native
  def listCollections(filter: js.Object): CommandCursor = js.native
  def listCollections(filter: js.Object, options: Anon_BatchSize): CommandCursor = js.native
  def profilingInfo(): js.Promise[Unit] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#profilingInfo */
  /** @deprecated Query the system.profile collection directly. */
  def profilingInfo(callback: MongoCallback[_]): Unit = js.native
  def profilingInfo(options: Anon_SessionClientSession): js.Promise[Unit] = js.native
  def profilingInfo(options: Anon_SessionClientSession, callback: MongoCallback[Unit]): Unit = js.native
  def profilingLevel(): js.Promise[ProfilingLevel] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#profilingLevel */
  def profilingLevel(callback: MongoCallback[ProfilingLevel]): Unit = js.native
  def profilingLevel(options: Anon_SessionClientSession): js.Promise[ProfilingLevel] = js.native
  def profilingLevel(options: Anon_SessionClientSession, callback: MongoCallback[ProfilingLevel]): Unit = js.native
  def removeUser(username: String): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#removeUser */
  def removeUser(username: String, callback: MongoCallback[_]): Unit = js.native
  def removeUser(username: String, options: CommonOptions): js.Promise[_] = js.native
  def removeUser(username: String, options: CommonOptions, callback: MongoCallback[_]): Unit = js.native
  def renameCollection[TSchema](fromCollection: String, toCollection: String): js.Promise[Collection[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#renameCollection */
  def renameCollection[TSchema](fromCollection: String, toCollection: String, callback: MongoCallback[Collection[TSchema]]): Unit = js.native
  def renameCollection[TSchema](fromCollection: String, toCollection: String, options: Anon_DropTarget): js.Promise[Collection[TSchema]] = js.native
  def renameCollection[TSchema](
    fromCollection: String,
    toCollection: String,
    options: Anon_DropTarget,
    callback: MongoCallback[Collection[TSchema]]
  ): Unit = js.native
  def setProfilingLevel(level: ProfilingLevel): js.Promise[ProfilingLevel] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#setProfilingLevel */
  def setProfilingLevel(level: ProfilingLevel, callback: MongoCallback[ProfilingLevel]): Unit = js.native
  def setProfilingLevel(level: ProfilingLevel, options: Anon_SessionClientSession): js.Promise[ProfilingLevel] = js.native
  def setProfilingLevel(level: ProfilingLevel, options: Anon_SessionClientSession, callback: MongoCallback[ProfilingLevel]): Unit = js.native
  def stats(): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#stats */
  def stats(callback: MongoCallback[_]): Unit = js.native
  def stats(options: Anon_Scale): js.Promise[_] = js.native
  def stats(options: Anon_Scale, callback: MongoCallback[_]): Unit = js.native
}

