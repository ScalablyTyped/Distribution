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
  var result: mongodbLib.Anon_N
}

object DeleteWriteOpResultObject {
  @scala.inline
  def apply(
    result: mongodbLib.Anon_N,
    connection: js.Any = null,
    deletedCount: scala.Int | scala.Double = null
  ): DeleteWriteOpResultObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (deletedCount != null) __obj.updateDynamic("deletedCount")(deletedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWriteOpResultObject]
  }
}

