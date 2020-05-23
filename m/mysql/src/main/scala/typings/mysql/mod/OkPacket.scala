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
    serverStatus: js.UndefOr[Double] = js.undefined,
    warningCount: js.UndefOr[Double] = js.undefined
  ): OkPacket = {
    val __obj = js.Dynamic.literal(affectedRows = affectedRows.asInstanceOf[js.Any], changedRows = changedRows.asInstanceOf[js.Any], fieldCount = fieldCount.asInstanceOf[js.Any], insertId = insertId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], protocol41 = protocol41.asInstanceOf[js.Any])
    if (!js.isUndefined(serverStatus)) __obj.updateDynamic("serverStatus")(serverStatus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warningCount)) __obj.updateDynamic("warningCount")(warningCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OkPacket]
  }
}

