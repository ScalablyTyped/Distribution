package typings.oracledb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends js.Object {
  /** One of the CQN_OPCODE_* constants. */
  var operation: Double = js.native
  /** ROWID of the row that was affected. */
  var rowid: String = js.native
}

object Operation {
  @scala.inline
  def apply(operation: Double, rowid: String): Operation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], rowid = rowid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOperation(value: Double): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowid(value: String): Self = this.set("rowid", value.asInstanceOf[js.Any])
  }
  
}

