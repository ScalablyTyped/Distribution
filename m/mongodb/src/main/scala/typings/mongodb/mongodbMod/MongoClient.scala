package typings.mongodb.mongodbMod

import typings.mongodb.Anon_DbName
import typings.mongodb.Anon_Session
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#isConnected */
  def isConnected(): Boolean = js.native
  def isConnected(options: MongoClientCommonOption): Boolean = js.native
  def logout(): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#logout */
  def logout(callback: MongoCallback[_]): Unit = js.native
  def logout(options: Anon_DbName): js.Promise[_] = js.native
  def logout(options: Anon_DbName, callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#startSession */
  def startSession(): ClientSession = js.native
  def startSession(options: SessionOptions): ClientSession = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.3/api/MongoClient.html#watch */
  def watch(): ChangeStream = js.native
  def watch(pipeline: js.Array[js.Object]): ChangeStream = js.native
  def watch(pipeline: js.Array[js.Object], options: ChangeStreamOptions with Anon_Session): ChangeStream = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#withSession */
  def withSession(operation: js.Function1[/* session */ ClientSession, js.Promise[_]]): js.Promise[Unit] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#withSession */
  def withSession(options: SessionOptions, operation: js.Function1[/* session */ ClientSession, js.Promise[_]]): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("mongodb", "MongoClient")
@js.native
object MongoClient extends js.Object {
  def connect(uri: String): js.Promise[MongoClient] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#.connect */
  def connect(uri: String, callback: MongoCallback[MongoClient]): Unit = js.native
  def connect(uri: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
  def connect(uri: String, options: MongoClientOptions, callback: MongoCallback[MongoClient]): Unit = js.native
}

