package typings.mysql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OkPacket extends js.Object {
  /**
    * The number of affected rows from an insert, update, or delete statement.
    */
  var affectedRows: Double
  /**
    * The number of changed rows from an update statement. "changedRows" differs from "affectedRows" in that it does not count updated rows whose values were not changed.
    */
  var changedRows: Double
  var fieldCount: Double
  /**
    * The insert id after inserting a row into a table with an auto increment primary key.
    */
  var insertId: Double
  /**
    * The server result message from an insert, update, or delete statement.
    */
  var message: String
  var protocol41: Boolean
  var serverStatus: js.UndefOr[Double] = js.undefined
  var warningCount: js.UndefOr[Double] = js.undefined
}

object OkPacket {
  @scala.inline
  def apply(
    affectedRows: Double,
    changedRows: Double,
    fieldCount: Double,
    insertId: Double,
    message: String,
    protocol41: Boolean,
    serverStatus: Int | Double = null,
    warningCount: Int | Double = null
  ): OkPacket = {
    val __obj = js.Dynamic.literal(affectedRows = affectedRows.asInstanceOf[js.Any], changedRows = changedRows.asInstanceOf[js.Any], fieldCount = fieldCount.asInstanceOf[js.Any], insertId = insertId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], protocol41 = protocol41.asInstanceOf[js.Any])
    if (serverStatus != null) __obj.updateDynamic("serverStatus")(serverStatus.asInstanceOf[js.Any])
    if (warningCount != null) __obj.updateDynamic("warningCount")(warningCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[OkPacket]
  }
}

