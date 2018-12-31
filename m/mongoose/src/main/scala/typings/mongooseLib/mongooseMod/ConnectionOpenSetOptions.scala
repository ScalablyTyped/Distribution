package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** See the node-mongodb-native driver instance for options that it understands. */
trait ConnectionOpenSetOptions extends ConnectionOptionsBase {
  /** See http://mongoosejs.com/docs/guide.html#bufferCommands */
  var bufferCommands: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, enables High Availability support for mongos
    * If connecting to multiple mongos servers, set the mongos option to true.
    */
  var mongos: js.UndefOr[scala.Boolean] = js.undefined
  /** sets the underlying driver's promise library (see http://mongodb.github.io/node-mongodb-native/2.1/api/MongoClient.html) */
  var promiseLibrary: js.UndefOr[js.Any] = js.undefined
  /** See http://mongoosejs.com/docs/connections.html#use-mongo-client **/
  var useMongoClient: js.UndefOr[scala.Boolean] = js.undefined
}

