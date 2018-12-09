package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", JSImport.Namespace)
@js.native
object mongodbModMembers extends js.Object {
  def connect(uri: java.lang.String): js.Promise[MongoClient] = js.native
  def connect(uri: java.lang.String, callback: MongoCallback[MongoClient]): scala.Unit = js.native
  def connect(uri: java.lang.String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
  def connect(uri: java.lang.String, options: MongoClientOptions, callback: MongoCallback[MongoClient]): scala.Unit = js.native
}

