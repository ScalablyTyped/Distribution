package typings.mongodb.mod

import typings.mongodb.anon.ChangeStreamOptionssessio
import typings.mongodb.anon.DbName
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "MongoClient")
@js.native
class MongoClient protected () extends EventEmitter {
  def this(uri: String) = this()
  def this(uri: String, options: MongoClientOptions) = this()
  
  def close(): js.Promise[Unit] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#close */
  def close(callback: MongoCallback[Unit]): Unit = js.native
  def close(force: Boolean): js.Promise[Unit] = js.native
  def close(force: Boolean, callback: MongoCallback[Unit]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#connect */
  def connect(): js.Promise[MongoClient] = js.native
  def connect(callback: MongoCallback[MongoClient]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#db */
  def db(): Db = js.native
  def db(dbName: String): Db = js.native
  def db(dbName: String, options: MongoClientCommonOption): Db = js.native
  def db(dbName: Unit, options: MongoClientCommonOption): Db = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#isConnected */
  def isConnected(): Boolean = js.native
  def isConnected(options: MongoClientCommonOption): Boolean = js.native
  
  def logout(): js.Promise[js.Any] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#logout */
  def logout(callback: MongoCallback[js.Any]): Unit = js.native
  def logout(options: DbName): js.Promise[js.Any] = js.native
  def logout(options: DbName, callback: MongoCallback[js.Any]): Unit = js.native
  
  var readPreference: ReadPreference = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#startSession */
  def startSession(): ClientSession = js.native
  def startSession(options: SessionOptions): ClientSession = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.3/api/MongoClient.html#watch */
  def watch[TSchema /* <: js.Object */](): ChangeStream[TSchema] = js.native
  def watch[TSchema /* <: js.Object */](pipeline: js.Array[js.Object]): ChangeStream[TSchema] = js.native
  def watch[TSchema /* <: js.Object */](pipeline: js.Array[js.Object], options: ChangeStreamOptionssessio): ChangeStream[TSchema] = js.native
  def watch[TSchema /* <: js.Object */](pipeline: Unit, options: ChangeStreamOptionssessio): ChangeStream[TSchema] = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#withSession */
  def withSession(operation: js.Function1[/* session */ ClientSession, js.Promise[js.Any]]): js.Promise[Unit] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#withSession */
  def withSession(options: SessionOptions, operation: js.Function1[/* session */ ClientSession, js.Promise[js.Any]]): js.Promise[Unit] = js.native
  
  var writeConcern: WriteConcern = js.native
}
/* static members */
object MongoClient {
  
  @JSImport("mongodb", "MongoClient")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def connect(uri: String): js.Promise[MongoClient] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MongoClient]]
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#.connect */
  @scala.inline
  def connect(uri: String, callback: MongoCallback[MongoClient]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def connect(uri: String, options: MongoClientOptions): js.Promise[MongoClient] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MongoClient]]
  @scala.inline
  def connect(uri: String, options: MongoClientOptions, callback: MongoCallback[MongoClient]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
