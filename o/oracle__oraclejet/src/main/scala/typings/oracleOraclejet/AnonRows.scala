package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRows[K, D] extends js.Object {
  var rows: AnonDataTypesDrag[K, D]
}

object AnonRows {
  @scala.inline
  def apply[K, D](rows: AnonDataTypesDrag[K, D]): AnonRows[K, D] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRows[K, D]]
  }
}

