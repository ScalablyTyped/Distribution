package typings.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBulkResult extends js.Object {
  var rowsAffected: Double
}

object IBulkResult {
  @scala.inline
  def apply(rowsAffected: Double): IBulkResult = {
    val __obj = js.Dynamic.literal(rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBulkResult]
  }
}

