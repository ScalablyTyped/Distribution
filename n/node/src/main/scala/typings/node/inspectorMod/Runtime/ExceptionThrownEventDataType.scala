package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExceptionThrownEventDataType extends js.Object {
  var exceptionDetails: ExceptionDetails = js.native
  /**
    * Timestamp of the exception.
    */
  var timestamp: Timestamp = js.native
}

object ExceptionThrownEventDataType {
  @scala.inline
  def apply(exceptionDetails: ExceptionDetails, timestamp: Timestamp): ExceptionThrownEventDataType = {
    val __obj = js.Dynamic.literal(exceptionDetails = exceptionDetails.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionThrownEventDataType]
  }
  @scala.inline
  implicit class ExceptionThrownEventDataTypeOps[Self <: ExceptionThrownEventDataType] (val x: Self) extends AnyVal {
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
    def setExceptionDetails(value: ExceptionDetails): Self = this.set("exceptionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

