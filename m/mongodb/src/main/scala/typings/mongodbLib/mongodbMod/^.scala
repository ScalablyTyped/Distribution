package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(uri: java.lang.String): js.Promise[mongodbLib.mongodbMod.MongoClient] = js.native
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

