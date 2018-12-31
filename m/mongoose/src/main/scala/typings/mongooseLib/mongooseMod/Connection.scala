package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section drivers/node-mongodb-native/connection.js
  * http://mongoosejs.com/docs/api.html#drivers-node-mongodb-native-connection-js
  */
@js.native
trait Connection extends ConnectionBase {
  def startSession(): js.Promise[mongodbLib.mongodbMod.ClientSession] = js.native
  def startSession(options: mongodbLib.mongodbMod.SessionOptions): js.Promise[mongodbLib.mongodbMod.ClientSession] = js.native
  def startSession(
    options: mongodbLib.mongodbMod.SessionOptions,
    cb: js.Function2[/* err */ js.Any, /* session */ mongodbLib.mongodbMod.ClientSession, scala.Unit]
  ): js.Promise[mongodbLib.mongodbMod.ClientSession] = js.native
  /**
    * Switches to a different database using the same connection pool.
    * @param name The database name
    * @returns New Connection Object
    */
  def useDb(name: java.lang.String): Connection = js.native
}

