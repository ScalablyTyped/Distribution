package typings.mongoose.mod

import typings.mongodb.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section drivers/node-mongodb-native/connection.js
  * http://mongoosejs.com/docs/api.html#drivers-node-mongodb-native-connection-js
  */
@js.native
trait Connection_ extends ConnectionBase {
  def startSession(): js.Promise[typings.mongodb.mod.ClientSession] = js.native
  def startSession(options: SessionOptions): js.Promise[typings.mongodb.mod.ClientSession] = js.native
  def startSession(
    options: SessionOptions,
    cb: js.Function2[/* err */ js.Any, /* session */ typings.mongodb.mod.ClientSession, Unit]
  ): js.Promise[typings.mongodb.mod.ClientSession] = js.native
  /**
    * Switches to a different database using the same connection pool.
    * @param name The database name
    * @returns New Connection Object
    */
  def useDb(name: String): Connection_ = js.native
}

