package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteWriteOpResultObject extends js.Object {
  //The connection object used for the operation.
  var connection: js.UndefOr[js.Any] = js.undefined
  //The number of documents deleted.
  var deletedCount: js.UndefOr[scala.Double] = js.undefined
  //The raw result returned from MongoDB, field will vary depending on server version.
  var result: mongodbLib.Anon_NOk
}

