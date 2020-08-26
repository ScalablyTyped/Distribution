package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptionRevokedEventDataType extends js.Object {
  /**
    * The id of revoked exception, as reported in <code>exceptionThrown</code>.
    */
  var exceptionId: Double = js.native
  /**
    * Reason describing why exception was revoked.
    */
  var reason: String = js.native
}

object ExceptionRevokedEventDataType {
  @scala.inline
  def apply(exceptionId: Double, reason: String): ExceptionRevokedEventDataType = {
    val __obj = js.Dynamic.literal(exceptionId = exceptionId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionRevokedEventDataType]
  }
  @scala.inline
  implicit class ExceptionRevokedEventDataTypeOps[Self <: ExceptionRevokedEventDataType] (val x: Self) extends AnyVal {
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
    def setExceptionId(value: Double): Self = this.set("exceptionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

