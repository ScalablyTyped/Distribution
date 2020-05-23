package typings.oracledb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  /** One of the CQN_OPCODE_* constants. */
  var operation: Double
  /** ROWID of the row that was affected. */
  var rowid: String
}

object Operation {
  @scala.inline
  def apply(operation: Double, rowid: String): Operation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], rowid = rowid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

