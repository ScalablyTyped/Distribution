package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "MongoClient")
@js.native
class MongoClient protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(uri: java.lang.String) = this()
  def this(uri: java.lang.String, options: MongoClientOptions) = this()
  def close(): js.Promise[scala.Unit] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#close */
  def close(callback: MongoCallback[scala.Unit]): scala.Unit = js.native
  def close(force: scala.Boolean): js.Promise[scala.Unit] = js.native
  def close(force: scala.Boolean, callback: MongoCallback[scala.Unit]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#connect */
  def connect(): js.Promise[MongoClient] = js.native
  def connect(callback: MongoCallback[MongoClient]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#db */
  def db(): Db = js.native
  def db(dbName: java.lang.String): Db = js.native
  def db(dbName: java.lang.String, options: MongoClientCommonOption): Db = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#isConnected */
  def isConnected(): scala.Boolean = js.native
  def isConnected(options: MongoClientCommonOption): scala.Boolean = js.native
  def logout(): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#logout */
  def logout(callback: MongoCallback[_]): scala.Unit = js.native
  def logout(options: mongodbLib.Anon_DbName): js.Promise[_] = js.native
  def logout(options: mongodbLib.Anon_DbName, callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#startSession */
  def startSession(): ClientSession = js.native
  def startSession(options: SessionOptions): ClientSession = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#watch */
  def watch(): ChangeStream = js.native
  def watch(pipeline: js.Array[js.Object]): ChangeStream = js.native
  def watch(pipeline: js.Array[js.Object], options: ChangeStreamOptions with mongodbLib.Anon_Session): ChangeStream = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#withSession */
  def withSession(operation: js.Function1[/* session */ ClientSession, js.Promise[_]]): js.Promise[scala.Unit] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#withSession */
  def withSession(options: SessionOptions, operation: js.Function1[/* session */ ClientSession, js.Promise[_]]): js.Promise[scala.Unit] = js.native
}

@JSImport("mongodb", "MongoClient")
@js.native
object MongoClient extends js.Object {
  def connect(uri: java.lang.String): js.Promise[mongodbLib.mongodbMod.MongoClient] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#.connect */
  def connect(
    uri: java.lang.String,
    callback: mongodbLib.mongodbMod.MongoCallback[mongodbLib.mongodbMod.MongoClient]
  ): scala.Unit = js.native
  def connect(uri: java.lang.String, options: mongodbLib.mongodbMod.MongoClientOptions): js.Promise[mongodbLib.mongodbMod.MongoClient] = js.native
  def connect(
    uri: java.lang.String,
    options: mongodbLib.mongodbMod.MongoClientOptions,
    callback: mongodbLib.mongodbMod.MongoCallback[mongodbLib.mongodbMod.MongoClient]
  ): scala.Unit = js.native
}

