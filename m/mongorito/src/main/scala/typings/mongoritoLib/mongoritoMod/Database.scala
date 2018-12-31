package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongorito", "Database")
@js.native
class Database () extends js.Object {
  def this(urls: java.lang.String) = this()
  def this(urls: js.Array[java.lang.String]) = this()
  def this(urls: java.lang.String, options: mongodbLib.mongodbMod.MongoClientOptions) = this()
  def this(urls: js.Array[java.lang.String], options: mongodbLib.mongodbMod.MongoClientOptions) = this()
  var models: js.Array[ModelClass] = js.native
  var options: mongodbLib.mongodbMod.MongoClientOptions = js.native
  var plugins: js.Array[Plugin] = js.native
  var state: DatabaseState = js.native
  def connect(): js.Promise[mongodbLib.mongodbMod.Db] = js.native
  def connection(): js.Promise[mongodbLib.mongodbMod.Db] = js.native
  def disconnect(): js.Promise[scala.Unit] = js.native
  def register(models: js.Array[ModelClass]): scala.Unit = js.native
  def register(models: ModelClass): scala.Unit = js.native
  /**
    * @see Model#use()
    */
  def use(): scala.Unit = js.native
  def use(plugins: js.Array[Plugin]): scala.Unit = js.native
  def use(plugins: Plugin): scala.Unit = js.native
}

