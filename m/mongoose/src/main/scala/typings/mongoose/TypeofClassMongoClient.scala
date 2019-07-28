package typings.mongoose

import org.scalablytyped.runtime.Instantiable1
import typings.mongodb.mongodbMod.MongoCallback
import typings.mongodb.mongodbMod.MongoClient
import typings.mongodb.mongodbMod.MongoClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassMongoClient extends Instantiable1[/* uri */ String, MongoClient] {
  def connect(uri: String): js.Promise[MongoClient] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#.connect */
  def connect(uri: String, callback: MongoCallback[MongoClient]): Unit = js.native
  def connect(uri: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
  def connect(uri: String, options: MongoClientOptions, callback: MongoCallback[MongoClient]): Unit = js.native
}

