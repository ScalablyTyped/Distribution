package typings.mongoose.mod

import typings.mongodb.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * section drivers/node-mongodb-native/connection.js
  * http://mongoosejs.com/docs/api.html#drivers-node-mongodb-native-connection-js
  */
@js.native
trait Connection_ extends ConnectionBase {
  
  def startSession(): js.Promise[typings.mongodb.mod.ClientSession] = js.native
  def startSession(
    options: js.UndefOr[scala.Nothing],
    cb: js.Function2[/* err */ js.Any, /* session */ typings.mongodb.mod.ClientSession, Unit]
  ): js.Promise[typings.mongodb.mod.ClientSession] = js.native
  def startSession(options: SessionOptions): js.Promise[typings.mongodb.mod.ClientSession] = js.native
  def startSession(
    options: SessionOptions,
    cb: js.Function2[/* err */ js.Any, /* session */ typings.mongodb.mod.ClientSession, Unit]
  ): js.Promise[typings.mongodb.mod.ClientSession] = js.native
  
  /**
    * Switches to a different database using the same connection pool.
    * @param name The database name
    * @param options Additional options
    * @returns New Connection Object
    */
  def useDb(name: String): Connection_ = js.native
  def useDb(name: String, options: ConnectionUseDbOptions): Connection_ = js.native
}
