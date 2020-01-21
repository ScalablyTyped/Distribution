package typings.mongodb.mod

import typings.mongodb.AnonN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteWriteOpResultObject extends js.Object {
  //The connection object used for the operation.
  var connection: js.UndefOr[js.Any] = js.undefined
  //The number of documents deleted.
  var deletedCount: js.UndefOr[scala.Double] = js.undefined
  //The raw result returned from MongoDB, field will vary depending on server version.
  var result: AnonN
}

object DeleteWriteOpResultObject {
  @scala.inline
  def apply(result: AnonN, connection: js.Any = null, deletedCount: Int | scala.Double = null): DeleteWriteOpResultObject = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (deletedCount != null) __obj.updateDynamic("deletedCount")(deletedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWriteOpResultObject]
  }
}

